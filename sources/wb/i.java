package wb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Boolean f22779n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f22780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f22781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f22782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f22783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f22784e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f22787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SQLiteDatabase f22788i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f22791l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<yb.g> f22785f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<Integer, s> f22786g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22789j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22790k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22792m = 0;

    class a implements DatabaseErrorHandler {
        a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    i(Context context, String str, int i10, boolean z10, int i11) {
        this.f22784e = context;
        this.f22781b = str;
        this.f22780a = z10;
        this.f22782c = i10;
        this.f22783d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor G(c0 c0Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c0Var.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(yb.e eVar) {
        Boolean boolG = eVar.g();
        boolean z10 = Boolean.TRUE.equals(boolG) && eVar.e();
        if (z10) {
            int i10 = this.f22790k + 1;
            this.f22790k = i10;
            this.f22791l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z10) {
                this.f22791l = null;
            }
        } else if (z10) {
            HashMap map = new HashMap();
            map.put("transactionId", this.f22791l);
            eVar.success(map);
        } else {
            if (Boolean.FALSE.equals(boolG)) {
                this.f22791l = null;
            }
            eVar.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        while (!this.f22785f.isEmpty() && this.f22791l == null) {
            this.f22785f.get(0).a();
            this.f22785f.remove(0);
        }
    }

    private void S(yb.e eVar, Runnable runnable) {
        Integer numD = eVar.d();
        Integer num = this.f22791l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (numD == null || !(numD.equals(num) || numD.intValue() == -1)) {
            this.f22785f.add(new yb.g(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.f22791l != null || this.f22785f.isEmpty()) {
            return;
        }
        this.f22787h.a(this, new Runnable() { // from class: wb.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f22777a.Q();
            }
        });
    }

    protected static boolean i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : y(context, packageName, 128)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i10) {
        s sVar = this.f22786g.get(Integer.valueOf(i10));
        if (sVar != null) {
            m(sVar);
        }
    }

    private void m(s sVar) {
        try {
            int i10 = sVar.f22819a;
            if (q.c(this.f22783d)) {
                Log.d("Sqflite", A() + "closing cursor " + i10);
            }
            this.f22786g.remove(Integer.valueOf(i10));
            sVar.f22821c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap map = null;
        int columnCount = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(d0.a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(yb.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.success(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I(yb.e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.i.I(yb.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [yb.e, yb.f] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wb.c0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wb.i] */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean J(yb.e eVar) throws Throwable {
        Integer num = (Integer) eVar.a("cursorPageSize");
        final ?? B = eVar.b();
        if (q.b(this.f22783d)) {
            Log.d("Sqflite", A() + B);
        }
        s sVar = null;
        try {
            try {
                B = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: wb.h
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return i.G(B, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, B.c(), wb.a.f22742a, null);
                try {
                    Map<String, Object> mapN = n(B, num);
                    if ((num == null || B.isLast() || B.isAfterLast()) ? false : true) {
                        int i10 = this.f22792m + 1;
                        this.f22792m = i10;
                        mapN.put("cursorId", Integer.valueOf(i10));
                        s sVar2 = new s(i10, num.intValue(), B);
                        try {
                            this.f22786g.put(Integer.valueOf(i10), sVar2);
                            sVar = sVar2;
                        } catch (Exception e10) {
                            e = e10;
                            sVar = sVar2;
                            D(e, eVar);
                            if (sVar != null) {
                                m(sVar);
                            }
                            if (sVar == null && B != 0) {
                                B.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            sVar = sVar2;
                            if (sVar == null && B != 0) {
                                B.close();
                            }
                            throw th;
                        }
                    }
                    eVar.success(mapN);
                    if (sVar == null && B != 0) {
                        B.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                B = 0;
            } catch (Throwable th2) {
                th = th2;
                B = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean K(yb.e eVar) throws Throwable {
        boolean z10;
        int iIntValue = ((Integer) eVar.a("cursorId")).intValue();
        boolean zEquals = Boolean.TRUE.equals(eVar.a("cancel"));
        if (q.c(this.f22783d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A());
            sb2.append("cursor ");
            sb2.append(iIntValue);
            sb2.append(zEquals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        s sVar = null;
        if (zEquals) {
            l(iIntValue);
            eVar.success(null);
            return true;
        }
        s sVar2 = this.f22786g.get(Integer.valueOf(iIntValue));
        boolean z11 = false;
        try {
            if (sVar2 == null) {
                throw new IllegalStateException("Cursor " + iIntValue + " not found");
            }
            Cursor cursor = sVar2.f22821c;
            Map<String, Object> mapN = n(cursor, Integer.valueOf(sVar2.f22820b));
            z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z10) {
                try {
                    try {
                        mapN.put("cursorId", Integer.valueOf(iIntValue));
                    } catch (Throwable th) {
                        th = th;
                        z11 = z10;
                        if (!z11 && sVar2 != null) {
                            m(sVar2);
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    D(e, eVar);
                    if (sVar2 != null) {
                        m(sVar2);
                    } else {
                        sVar = sVar2;
                    }
                    if (!z10 && sVar != null) {
                        m(sVar);
                    }
                    return false;
                }
            }
            eVar.success(mapN);
            if (!z10) {
                m(sVar2);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th2) {
            th = th2;
            if (!z11) {
                m(sVar2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean L(yb.e eVar) throws Throwable {
        if (!w(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.c()) {
            eVar.success(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i10 = cursorRawQuery.getInt(0);
                            if (q.b(this.f22783d)) {
                                Log.d("Sqflite", A() + "changed " + i10);
                            }
                            eVar.success(Integer.valueOf(i10));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = cursorRawQuery;
                        D(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                eVar.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean w(yb.e eVar) {
        c0 c0VarB = eVar.b();
        if (q.b(this.f22783d)) {
            Log.d("Sqflite", A() + c0VarB);
        }
        Boolean boolG = eVar.g();
        try {
            C().execSQL(c0VarB.c(), c0VarB.d());
            u(boolG);
            return true;
        } catch (Exception e10) {
            D(e10, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    String A() {
        return "[" + B() + "] ";
    }

    String B() {
        Thread threadCurrentThread = Thread.currentThread();
        return this.f22782c + com.amazon.a.a.o.b.f.f7478a + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f22788i;
    }

    void D(Exception exc, yb.e eVar) {
        String message;
        Map<String, Object> mapA;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f22781b;
            mapA = null;
        } else {
            boolean z10 = exc instanceof SQLException;
            message = exc.getMessage();
            mapA = yb.h.a(eVar);
        }
        eVar.error("sqlite_error", message, mapA);
    }

    public void E(final yb.e eVar) {
        S(eVar, new Runnable() { // from class: wb.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f22771a.I(eVar);
            }
        });
    }

    synchronized boolean F() {
        return this.f22789j > 0;
    }

    public void M() {
        if (f22779n == null) {
            Boolean boolValueOf = Boolean.valueOf(j(this.f22784e));
            f22779n = boolValueOf;
            if (boolValueOf.booleanValue() && q.c(this.f22783d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f22788i = SQLiteDatabase.openDatabase(this.f22781b, null, f22779n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f22788i = SQLiteDatabase.openDatabase(this.f22781b, null, 1, new a());
    }

    public void O(final yb.e eVar) {
        S(eVar, new Runnable() { // from class: wb.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f22773a.J(eVar);
            }
        });
    }

    public void P(final yb.e eVar) {
        S(eVar, new Runnable() { // from class: wb.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f22746a.K(eVar);
            }
        });
    }

    public void R(final yb.e eVar) {
        S(eVar, new Runnable() { // from class: wb.f
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f22775a.L(eVar);
            }
        });
    }

    void h(sc.i iVar, j.d dVar) {
        yb.c cVar;
        String method;
        yb.d dVar2 = new yb.d(iVar, dVar);
        boolean zC = dVar2.c();
        boolean zI = dVar2.i();
        List list = (List) dVar2.a("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cVar = new yb.c((Map) it.next(), zC);
            method = cVar.getMethod();
            method.hashCode();
            switch (method) {
                case "execute":
                    if (!p(cVar)) {
                        if (!zI) {
                            cVar.o(dVar);
                            break;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!I(cVar)) {
                        if (!zI) {
                            cVar.o(dVar);
                            break;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!L(cVar)) {
                        if (!zI) {
                            cVar.o(dVar);
                            break;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!J(cVar)) {
                        if (!zI) {
                            cVar.o(dVar);
                            break;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                default:
                    dVar.error("bad_param", "Batch method '" + method + "' not supported", null);
                    break;
            }
            return;
        }
        if (zC) {
            dVar.success(null);
        } else {
            dVar.success(arrayList);
        }
    }

    public void k() {
        if (!this.f22786g.isEmpty() && q.b(this.f22783d)) {
            Log.d("Sqflite", A() + this.f22786g.size() + " cursor(s) are left opened");
        }
        this.f22788i.close();
    }

    synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f22789j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f22789j--;
        }
    }

    public void v(final yb.e eVar) {
        S(eVar, new Runnable() { // from class: wb.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f22767a.H(eVar);
            }
        });
    }

    public SQLiteDatabase z() {
        return this.f22788i;
    }
}
