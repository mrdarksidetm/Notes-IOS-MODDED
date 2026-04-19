package r6;

import ae.r;
import ae.s;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.i0;
import md.t;
import nd.v;
import sc.j;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j.c, i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f19189h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f19191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q6.e f19192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f19193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f19194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f19195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f19196g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public interface b {
        void a(List<t6.b> list);
    }

    /* JADX INFO: renamed from: r6.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0404c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19197a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f19197a = iArr;
        }
    }

    public static final class d implements b {

        static final class a extends s implements l<t<? extends i0>, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f19199a = new a();

            a() {
                super(1);
            }

            public final void a(Object obj) throws Throwable {
                Throwable thE = t.e(obj);
                if (thE == null) {
                    return;
                }
                cc.b.b("MethodCallHandlerSink", "Result ended with failure");
                throw thE;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t<? extends i0> tVar) throws Throwable {
                a(tVar.j());
                return i0.f15558a;
            }
        }

        d() {
        }

        @Override // r6.c.b
        public void a(List<t6.b> list) {
            r.f(list, "packageInfo");
            Context context = c.this.f19190a;
            if (context != null) {
                c cVar = c.this;
                ArrayList arrayList = new ArrayList(v.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(p6.b.c((t6.b) it.next(), context));
                }
                q6.e eVar = cVar.f19192c;
                if (eVar != null) {
                    eVar.c(arrayList, a.f19199a);
                }
            }
        }
    }

    public c() {
        HandlerThread handlerThread = new HandlerThread("BackgroundThread");
        handlerThread.start();
        this.f19193d = handlerThread;
        this.f19194e = new Handler(handlerThread.getLooper());
        this.f19195f = new Handler(Looper.getMainLooper());
        this.f19196g = new d();
    }

    private final void e(sc.i iVar, j.d dVar) {
        i0 i0Var;
        try {
            String str = (String) iVar.a("packageName");
            Context context = this.f19190a;
            if (context != null) {
                if (str != null) {
                    t6.c.a(context, str);
                }
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                throw new IllegalStateException("Unable to add package to whitelist - context is null");
            }
            dVar.success(null);
        } catch (Throwable th) {
            dVar.error(th.getClass().getName(), th.getMessage(), null);
        }
    }

    private final void i(sc.i iVar, final j.d dVar) {
        try {
            final String str = (String) iVar.a("packageName");
            if (str == null) {
                throw new NullPointerException("Package name cannot be null.");
            }
            r.c(str);
            this.f19194e.post(new Runnable() { // from class: r6.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.j(this.f19184a, str, dVar);
                }
            });
        } catch (Throwable th) {
            dVar.error(th.getClass().getName(), th.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(c cVar, String str, final j.d dVar) {
        r.f(cVar, "this$0");
        r.f(str, "$packageName");
        r.f(dVar, "$result");
        Context context = cVar.f19190a;
        if (context != null) {
            final String strC = p6.f.f18255a.c(context, str);
            cVar.f19195f.post(new Runnable() { // from class: r6.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.k(dVar, strC);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j.d dVar, String str) {
        r.f(dVar, "$result");
        dVar.success(str);
    }

    private final void l(sc.i iVar, j.d dVar) {
        i0 i0Var;
        try {
            t6.e eVarG = p6.f.f18255a.g((String) iVar.a("config"));
            Context context = this.f19190a;
            if (context != null) {
                f.f19207a.k(context, eVarG);
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                throw new IllegalStateException("Unable to run Talsec - context is null");
            }
            dVar.success(null);
        } catch (Throwable th) {
            dVar.error(th.getClass().getName(), th.getMessage(), null);
        }
    }

    public final void g(sc.b bVar, Context context) {
        r.f(bVar, "messenger");
        r.f(context, "context");
        if (this.f19191b != null) {
            cc.b.e("MethodCallHandler", "Tried to create channel without disposing old one.");
            h();
        }
        j jVar = new j(bVar, "talsec.app/freerasp/methods");
        jVar.e(this);
        this.f19191b = jVar;
        this.f19190a = context;
        this.f19192c = new q6.e(bVar, null, 2, 0 == true ? 1 : 0);
        f.f19207a.e(this.f19196g);
    }

    public final void h() {
        j jVar = this.f19191b;
        if (jVar != null) {
            jVar.e(null);
        }
        this.f19191b = null;
        this.f19190a = null;
        this.f19192c = null;
        f.f19207a.h();
    }

    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, j.d dVar) {
        r.f(iVar, "call");
        r.f(dVar, "result");
        String str = iVar.f20503a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1654809429) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 242576900 && str.equals("getAppIcon")) {
                        i(iVar, dVar);
                        return;
                    }
                } else if (str.equals("start")) {
                    l(iVar, dVar);
                    return;
                }
            } else if (str.equals("addToWhitelist")) {
                e(iVar, dVar);
                return;
            }
        }
        dVar.notImplemented();
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        r.f(eVar, "source");
        r.f(aVar, "event");
        if (C0404c.f19197a[aVar.ordinal()] != 1 || this.f19190a == null) {
            return;
        }
        this.f19193d.quitSafely();
    }
}
