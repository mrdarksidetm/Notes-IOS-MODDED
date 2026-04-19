package e8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import f8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import w7.i;
import z7.a;
import z7.c;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements e8.d, f8.b, e8.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u7.b f10737f = u7.b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f10738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g8.a f10739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8.a f10740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f10741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.a<String> f10742e;

    interface b<T, U> {
        U apply(T t10);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f10743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f10744b;

        private c(String str, String str2) {
            this.f10743a = str;
            this.f10744b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    m0(g8.a aVar, g8.a aVar2, e eVar, t0 t0Var, ld.a<String> aVar3) {
        this.f10738a = t0Var;
        this.f10739b = aVar;
        this.f10740c = aVar2;
        this.f10741d = eVar;
        this.f10742e = aVar3;
    }

    private boolean B0() {
        return w0() * x0() >= this.f10741d.f();
    }

    private List<k> C0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f10743a, cVar.f10744b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object D0(Cursor cursor) {
        while (cursor.moveToNext()) {
            l(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer E0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        k1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: e8.r
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10758a.D0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object F0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object G0(Throwable th) {
        throw new f8.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase H0(Throwable th) {
        throw new f8.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long I0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z7.f J0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return z7.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z7.f K0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (z7.f) k1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: e8.d0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.J0(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long L0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean M0(w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lZ0 = z0(sQLiteDatabase, oVar);
        return lZ0 == null ? Boolean.FALSE : (Boolean) k1(u0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lZ0.toString()}), new b() { // from class: e8.z
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List N0(SQLiteDatabase sQLiteDatabase) {
        return (List) k1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: e8.k0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.O0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List O0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(w7.o.a().b(cursor.getString(1)).d(h8.a.b(cursor.getInt(2))).c(e1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List P0(w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listC1 = c1(sQLiteDatabase, oVar, this.f10741d.d());
        for (u7.d dVar : u7.d.values()) {
            if (dVar != oVar.d()) {
                int iD = this.f10741d.d() - listC1.size();
                if (iD <= 0) {
                    break;
                }
                listC1.addAll(c1(sQLiteDatabase, oVar.f(dVar), iD));
            }
        }
        return C0(listC1, d1(sQLiteDatabase, listC1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z7.a Q0(Map map, a.C0501a c0501a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarQ0 = q0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(z7.c.c().c(bVarQ0).b(j10).a());
        }
        f1(c0501a, map);
        c0501a.e(y0());
        c0501a.d(v0());
        c0501a.c(this.f10742e.get());
        return c0501a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z7.a R0(String str, final Map map, final a.C0501a c0501a, SQLiteDatabase sQLiteDatabase) {
        return (z7.a) k1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: e8.b0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10716a.Q0(map, c0501a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object S0(List list, w7.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a aVarK = w7.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            aVarK.h(z10 ? new w7.h(i1(cursor.getString(4)), cursor.getBlob(5)) : new w7.h(i1(cursor.getString(4)), g1(j10)));
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object T0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long U0(w7.i iVar, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (B0()) {
            l(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jS0 = s0(sQLiteDatabase, oVar);
        int iE = this.f10741d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jS0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] V0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object W0(Cursor cursor) {
        while (cursor.moveToNext()) {
            l(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object X0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        k1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: e8.x
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10778a.W0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean Y0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Z0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) k1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), new b() { // from class: e8.v
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.Y0((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.d()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a1(long j10, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(h8.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(h8.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f10739b.a()).execute();
        return null;
    }

    private List<k> c1(SQLiteDatabase sQLiteDatabase, final w7.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lZ0 = z0(sQLiteDatabase, oVar);
        if (lZ0 == null) {
            return arrayList;
        }
        k1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lZ0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: e8.y
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10779a.S0(arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> d1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        k1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: e8.t
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.T0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] e1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void f1(a.C0501a c0501a, Map<String, List<z7.c>> map) {
        for (Map.Entry<String, List<z7.c>> entry : map.entrySet()) {
            c0501a.a(z7.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] g1(long j10) {
        return (byte[]) k1(u0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: e8.a0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.V0((Cursor) obj);
            }
        });
    }

    private <T> T h1(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f10740c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f10740c.a() >= ((long) this.f10741d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static u7.b i1(String str) {
        return str == null ? f10737f : u7.b.b(str);
    }

    private static String j1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T k1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b q0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.d()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.d()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.d()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.d()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.d()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.d()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.d()) {
            return bVar7;
        }
        a8.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void r0(final SQLiteDatabase sQLiteDatabase) {
        h1(new d() { // from class: e8.g0
            @Override // e8.m0.d
            public final Object a() {
                return m0.F0(sQLiteDatabase);
            }
        }, new b() { // from class: e8.h0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.G0((Throwable) obj);
            }
        });
    }

    private long s0(SQLiteDatabase sQLiteDatabase, w7.o oVar) {
        Long lZ0 = z0(sQLiteDatabase, oVar);
        if (lZ0 != null) {
            return lZ0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(h8.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private z7.b v0() {
        return z7.b.b().b(z7.e.c().b(t0()).c(e.f10721a.f()).a()).a();
    }

    private long w0() {
        return u0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long x0() {
        return u0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private z7.f y0() {
        final long jA = this.f10739b.a();
        return (z7.f) A0(new b() { // from class: e8.c0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.K0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long z0(SQLiteDatabase sQLiteDatabase, w7.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(h8.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) k1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: e8.s
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.L0((Cursor) obj);
            }
        });
    }

    <T> T A0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        sQLiteDatabaseU0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseU0);
            sQLiteDatabaseU0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseU0.endTransaction();
        }
    }

    @Override // e8.d
    public k N(final w7.o oVar, final w7.i iVar) {
        a8.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) A0(new b() { // from class: e8.i0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10726a.U0(iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // e8.d
    public long S(w7.o oVar) {
        return ((Long) k1(u0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(h8.a.a(oVar.d()))}), new b() { // from class: e8.f0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.I0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // f8.b
    public <T> T a(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        r0(sQLiteDatabaseU0);
        try {
            T tA = aVar.a();
            sQLiteDatabaseU0.setTransactionSuccessful();
            return tA;
        } finally {
            sQLiteDatabaseU0.endTransaction();
        }
    }

    @Override // e8.d
    public void a0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            A0(new b() { // from class: e8.q
                @Override // e8.m0.b
                public final Object apply(Object obj) {
                    return this.f10755a.X0(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // e8.c
    public void b() {
        A0(new b() { // from class: e8.o
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10752a.b1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10738a.close();
    }

    @Override // e8.d
    public boolean e0(final w7.o oVar) {
        return ((Boolean) A0(new b() { // from class: e8.l0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10732a.M0(oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // e8.d
    public int h() {
        final long jA = this.f10739b.a() - this.f10741d.c();
        return ((Integer) A0(new b() { // from class: e8.j0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10730a.E0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // e8.d
    public void i(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            u0().compileStatement("DELETE FROM events WHERE _id in " + j1(iterable)).execute();
        }
    }

    @Override // e8.d
    public void k(final w7.o oVar, final long j10) {
        A0(new b() { // from class: e8.n
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.a1(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e8.c
    public void l(final long j10, final c.b bVar, final String str) {
        A0(new b() { // from class: e8.m
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.Z0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e8.c
    public z7.a o() {
        final a.C0501a c0501aE = z7.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (z7.a) A0(new b() { // from class: e8.u
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10770a.R0(str, map, c0501aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e8.d
    public Iterable<k> p(final w7.o oVar) {
        return (Iterable) A0(new b() { // from class: e8.p
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return this.f10753a.P0(oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // e8.d
    public Iterable<w7.o> r() {
        return (Iterable) A0(new b() { // from class: e8.l
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.N0((SQLiteDatabase) obj);
            }
        });
    }

    long t0() {
        return w0() * x0();
    }

    SQLiteDatabase u0() {
        final t0 t0Var = this.f10738a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) h1(new d() { // from class: e8.w
            @Override // e8.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: e8.e0
            @Override // e8.m0.b
            public final Object apply(Object obj) {
                return m0.H0((Throwable) obj);
            }
        });
    }
}
