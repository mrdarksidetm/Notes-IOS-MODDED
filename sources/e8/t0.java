package e8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f10760c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f10761d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f10762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f10763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f10764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f10765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f10766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<a> f10767j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10769b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: e8.o0
            @Override // e8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.A(sQLiteDatabase);
            }
        };
        f10762e = aVar;
        a aVar2 = new a() { // from class: e8.p0
            @Override // e8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.C(sQLiteDatabase);
            }
        };
        f10763f = aVar2;
        a aVar3 = new a() { // from class: e8.q0
            @Override // e8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f10764g = aVar3;
        a aVar4 = new a() { // from class: e8.r0
            @Override // e8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.G(sQLiteDatabase);
            }
        };
        f10765h = aVar4;
        a aVar5 = new a() { // from class: e8.s0
            @Override // e8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.H(sQLiteDatabase);
            }
        };
        f10766i = aVar5;
        f10767j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f10769b = false;
        this.f10768a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f10760c);
    }

    private void I(SQLiteDatabase sQLiteDatabase, int i10) {
        y(sQLiteDatabase);
        L(sQLiteDatabase, 0, i10);
    }

    private void L(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f10767j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f10767j.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void y(SQLiteDatabase sQLiteDatabase) {
        if (this.f10769b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f10769b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        I(sQLiteDatabase, this.f10768a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        I(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        y(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        y(sQLiteDatabase);
        L(sQLiteDatabase, i10, i11);
    }
}
