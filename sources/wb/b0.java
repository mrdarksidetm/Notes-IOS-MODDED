package wb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import jc.a;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class b0 implements jc.a, j.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static String f22753h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static n f22757l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.j f22759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<String, Integer> f22748c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, i> f22749d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f22750e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f22751f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f22752g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22754i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22755j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f22756k = 0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f22760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.d f22761b;

        a(i iVar, j.d dVar) {
            this.f22760a = iVar;
            this.f22761b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b0.f22751f) {
                b0.this.l(this.f22760a);
            }
            this.f22761b.success(null);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f22763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.d f22765c;

        b(i iVar, String str, j.d dVar) {
            this.f22763a = iVar;
            this.f22764b = str;
            this.f22765c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b0.f22751f) {
                i iVar = this.f22763a;
                if (iVar != null) {
                    b0.this.l(iVar);
                }
                try {
                    if (q.c(b0.f22752g)) {
                        Log.d("Sqflite", "delete database " + this.f22764b);
                    }
                    i.o(this.f22764b);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + b0.f22756k);
                }
            }
            this.f22765c.success(null);
        }
    }

    private void A(sc.i iVar, j.d dVar) {
        int iIntValue = ((Integer) iVar.a("id")).intValue();
        i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        if (q.b(iVarN.f22783d)) {
            Log.d("Sqflite", iVarN.A() + "closing " + iIntValue + " " + iVarN.f22781b);
        }
        String str = iVarN.f22781b;
        synchronized (f22750e) {
            f22749d.remove(Integer.valueOf(iIntValue));
            if (iVarN.f22780a) {
                f22748c.remove(str);
            }
        }
        f22757l.a(iVarN, new a(iVarN, dVar));
    }

    private void B(sc.i iVar, j.d dVar) {
        dVar.success(Boolean.valueOf(i.x((String) iVar.a("path"))));
    }

    private void C(sc.i iVar, j.d dVar) {
        String str = (String) iVar.a("cmd");
        HashMap map = new HashMap();
        if (com.amazon.a.a.o.b.au.equals(str)) {
            int i10 = f22752g;
            if (i10 > 0) {
                map.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, i> map2 = f22749d;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, i> entry : map2.entrySet()) {
                    i value = entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", value.f22781b);
                    map4.put("singleInstance", Boolean.valueOf(value.f22780a));
                    int i11 = value.f22783d;
                    if (i11 > 0) {
                        map4.put("logLevel", Integer.valueOf(i11));
                    }
                    map3.put(entry.getKey().toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        dVar.success(map);
    }

    private void D(sc.i iVar, j.d dVar) {
        xb.a.f23127a = Boolean.TRUE.equals(iVar.b());
        xb.a.f23129c = xb.a.f23128b && xb.a.f23127a;
        if (!xb.a.f23127a) {
            f22752g = 0;
        } else if (xb.a.f23129c) {
            f22752g = 2;
        } else if (xb.a.f23127a) {
            f22752g = 1;
        }
        dVar.success(null);
    }

    private void E(sc.i iVar, j.d dVar) {
        i iVar2;
        Map<Integer, i> map;
        String str = (String) iVar.a("path");
        synchronized (f22750e) {
            if (q.c(f22752g)) {
                Log.d("Sqflite", "Look for " + str + " in " + f22748c.keySet());
            }
            Map<String, Integer> map2 = f22748c;
            Integer num = map2.get(str);
            if (num == null || (iVar2 = (map = f22749d).get(num)) == null || !iVar2.f22788i.isOpen()) {
                iVar2 = null;
            } else {
                if (q.c(f22752g)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iVar2.A());
                    sb2.append("found single instance ");
                    sb2.append(iVar2.F() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d("Sqflite", sb2.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar2, str, dVar);
        n nVar = f22757l;
        if (nVar != null) {
            nVar.a(iVar2, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.w
            @Override // java.lang.Runnable
            public final void run() {
                b0.q(iVar, dVar, iVarN);
            }
        });
    }

    private void H(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.t
            @Override // java.lang.Runnable
            public final void run() {
                b0.r(iVar, dVar, iVarN);
            }
        });
    }

    private void I(final sc.i iVar, final j.d dVar) {
        final int i10;
        i iVar2;
        final String str = (String) iVar.a("path");
        final Boolean bool = (Boolean) iVar.a("readOnly");
        final boolean zO = o(str);
        boolean z10 = (Boolean.FALSE.equals(iVar.a("singleInstance")) || zO) ? false : true;
        if (z10) {
            synchronized (f22750e) {
                if (q.c(f22752g)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f22748c.keySet());
                }
                Integer num = f22748c.get(str);
                if (num != null && (iVar2 = f22749d.get(num)) != null) {
                    if (iVar2.f22788i.isOpen()) {
                        if (q.c(f22752g)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iVar2.A());
                            sb2.append("re-opened single instance ");
                            sb2.append(iVar2.F() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d("Sqflite", sb2.toString());
                        }
                        dVar.success(x(num.intValue(), true, iVar2.F()));
                        return;
                    }
                    if (q.c(f22752g)) {
                        Log.d("Sqflite", iVar2.A() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f22750e;
        synchronized (obj) {
            i10 = f22756k + 1;
            f22756k = i10;
        }
        final i iVar3 = new i(this.f22758a, str, i10, z10, f22752g);
        synchronized (obj) {
            if (f22757l == null) {
                n nVarB = n.b("Sqflite", f22755j, f22754i);
                f22757l = nVarB;
                nVarB.start();
                if (q.b(iVar3.f22783d)) {
                    Log.d("Sqflite", iVar3.A() + "starting worker pool with priority " + f22754i);
                }
            }
            iVar3.f22787h = f22757l;
            if (q.b(iVar3.f22783d)) {
                Log.d("Sqflite", iVar3.A() + "opened " + i10 + " " + str);
            }
            final boolean z11 = z10;
            f22757l.a(iVar3, new Runnable() { // from class: wb.y
                @Override // java.lang.Runnable
                public final void run() {
                    b0.s(zO, str, dVar, bool, iVar3, iVar, z11, i10);
                }
            });
        }
    }

    private void K(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.x
            @Override // java.lang.Runnable
            public final void run() {
                b0.t(iVar, dVar, iVarN);
            }
        });
    }

    private void L(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.u
            @Override // java.lang.Runnable
            public final void run() {
                b0.u(iVar, dVar, iVarN);
            }
        });
    }

    private void M(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.z
            @Override // java.lang.Runnable
            public final void run() {
                b0.v(iVar, iVarN, dVar);
            }
        });
    }

    private void N(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.v
            @Override // java.lang.Runnable
            public final void run() {
                b0.w(iVar, dVar, iVarN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (q.b(iVar.f22783d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f22756k);
        }
        synchronized (f22750e) {
            if (f22749d.isEmpty() && f22757l != null) {
                if (q.b(iVar.f22783d)) {
                    Log.d("Sqflite", iVar.A() + "stopping thread");
                }
                f22757l.c();
                f22757l = null;
            }
        }
    }

    private i m(int i10) {
        return f22749d.get(Integer.valueOf(i10));
    }

    private i n(sc.i iVar, j.d dVar) {
        int iIntValue = ((Integer) iVar.a("id")).intValue();
        i iVarM = m(iIntValue);
        if (iVarM != null) {
            return iVarM;
        }
        dVar.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(sc.i iVar, j.d dVar, i iVar2) {
        iVar2.v(new yb.d(iVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(sc.i iVar, j.d dVar, i iVar2) {
        iVar2.E(new yb.d(iVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(boolean z10, String str, j.d dVar, Boolean bool, i iVar, sc.i iVar2, boolean z11, int i10) {
        synchronized (f22751f) {
            if (!z10) {
                try {
                    File file = new File(new File(str).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        dVar.error("sqlite_error", "open_failed " + str, null);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    iVar.N();
                } else {
                    iVar.M();
                }
                synchronized (f22750e) {
                    if (z11) {
                        f22748c.put(str, Integer.valueOf(i10));
                        f22749d.put(Integer.valueOf(i10), iVar);
                    } else {
                        f22749d.put(Integer.valueOf(i10), iVar);
                    }
                }
                if (q.b(iVar.f22783d)) {
                    Log.d("Sqflite", iVar.A() + "opened " + i10 + " " + str);
                }
                dVar.success(x(i10, false, false));
            } catch (Exception e10) {
                iVar.D(e10, new yb.d(iVar2, dVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(sc.i iVar, j.d dVar, i iVar2) {
        iVar2.O(new yb.d(iVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(sc.i iVar, j.d dVar, i iVar2) {
        iVar2.P(new yb.d(iVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(sc.i iVar, i iVar2, j.d dVar) {
        try {
            iVar2.f22788i.setLocale(d0.d((String) iVar.a("locale")));
            dVar.success(null);
        } catch (Exception e10) {
            dVar.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(sc.i iVar, j.d dVar, i iVar2) {
        iVar2.R(new yb.d(iVar, dVar));
    }

    static Map x(int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        if (z10) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    private void y(Context context, sc.b bVar) {
        this.f22758a = context;
        sc.j jVar = new sc.j(bVar, "com.tekartik.sqflite", sc.q.f20518b, bVar.c());
        this.f22759b = jVar;
        jVar.e(this);
    }

    private void z(final sc.i iVar, final j.d dVar) {
        final i iVarN = n(iVar, dVar);
        if (iVarN == null) {
            return;
        }
        f22757l.a(iVarN, new Runnable() { // from class: wb.a0
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.h(iVar, dVar);
            }
        });
    }

    void G(sc.i iVar, j.d dVar) {
        if (f22753h == null) {
            f22753h = this.f22758a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.success(f22753h);
    }

    void J(sc.i iVar, j.d dVar) {
        Object objA = iVar.a("androidThreadPriority");
        if (objA != null) {
            f22754i = ((Integer) objA).intValue();
        }
        Object objA2 = iVar.a("androidThreadCount");
        if (objA2 != null && !objA2.equals(Integer.valueOf(f22755j))) {
            f22755j = ((Integer) objA2).intValue();
            n nVar = f22757l;
            if (nVar != null) {
                nVar.c();
                f22757l = null;
            }
        }
        Integer numA = q.a(iVar);
        if (numA != null) {
            f22752g = numA.intValue();
        }
        dVar.success(null);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        y(bVar.a(), bVar.b());
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f22758a = null;
        this.f22759b.e(null);
        this.f22759b = null;
    }

    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, j.d dVar) {
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "execute":
                F(iVar, dVar);
                break;
            case "closeDatabase":
                A(iVar, dVar);
                break;
            case "options":
                J(iVar, dVar);
                break;
            case "insert":
                H(iVar, dVar);
                break;
            case "update":
                N(iVar, dVar);
                break;
            case "androidSetLocale":
                M(iVar, dVar);
                break;
            case "deleteDatabase":
                E(iVar, dVar);
                break;
            case "debugMode":
                D(iVar, dVar);
                break;
            case "openDatabase":
                I(iVar, dVar);
                break;
            case "batch":
                z(iVar, dVar);
                break;
            case "debug":
                C(iVar, dVar);
                break;
            case "query":
                K(iVar, dVar);
                break;
            case "databaseExists":
                B(iVar, dVar);
                break;
            case "queryCursorNext":
                L(iVar, dVar);
                break;
            case "getPlatformVersion":
                dVar.success("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                G(iVar, dVar);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
