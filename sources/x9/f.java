package x9;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import c0.u0;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import da.n;
import da.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f23086k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map<String, f> f23087l = new z.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f23090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final da.n f23091d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w<na.a> f23094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ma.b<la.f> f23095h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f23092e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f23093f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<a> f23096i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<g> f23097j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    private static class b implements a.InterfaceC0177a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f23098a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (e9.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f23098a.get() == null) {
                    b bVar = new b();
                    if (u0.a(f23098a, null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0177a
        public void a(boolean z10) {
            synchronized (f.f23086k) {
                for (f fVar : new ArrayList(f.f23087l.values())) {
                    if (fVar.f23092e.get()) {
                        fVar.B(z10);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f23099b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23100a;

        public c(Context context) {
            this.f23100a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f23099b.get() == null) {
                c cVar = new c(context);
                if (u0.a(f23099b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f23100a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f23086k) {
                Iterator<f> it = f.f23087l.values().iterator();
                while (it.hasNext()) {
                    it.next().s();
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, n nVar) {
        this.f23088a = (Context) w8.m.k(context);
        this.f23089b = w8.m.e(str);
        this.f23090c = (n) w8.m.k(nVar);
        p pVarB = FirebaseInitProvider.b();
        qa.c.b("Firebase");
        qa.c.b("ComponentDiscovery");
        List<ma.b<ComponentRegistrar>> listB = da.f.c(context, ComponentDiscoveryService.class).b();
        qa.c.a();
        qa.c.b("Runtime");
        n.b bVarG = da.n.k(ea.j.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(da.c.s(context, Context.class, new Class[0])).b(da.c.s(this, f.class, new Class[0])).b(da.c.s(nVar, n.class, new Class[0])).g(new qa.b());
        if (androidx.core.os.f.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(da.c.s(pVarB, p.class, new Class[0]));
        }
        da.n nVarE = bVarG.e();
        this.f23091d = nVarE;
        qa.c.a();
        this.f23094g = new w<>(new ma.b() { // from class: x9.d
            @Override // ma.b
            public final Object get() {
                return this.f23083a.y(context);
            }
        });
        this.f23095h = nVarE.c(la.f.class);
        g(new a() { // from class: x9.e
            @Override // x9.f.a
            public final void a(boolean z10) {
                this.f23085a.z(z10);
            }
        });
        qa.c.a();
    }

    private static String A(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f23096i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    private void C() {
        Iterator<g> it = this.f23097j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f23089b, this.f23090c);
        }
    }

    private void h() {
        w8.m.o(!this.f23093f.get(), "FirebaseApp was deleted");
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f23086k) {
            Iterator<f> it = f23087l.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<f> m(Context context) {
        ArrayList arrayList;
        synchronized (f23086k) {
            arrayList = new ArrayList(f23087l.values());
        }
        return arrayList;
    }

    public static f n() {
        f fVar;
        synchronized (f23086k) {
            fVar = f23087l.get("[DEFAULT]");
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + e9.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            fVar.f23095h.get().k();
        }
        return fVar;
    }

    public static f o(String str) {
        f fVar;
        String str2;
        synchronized (f23086k) {
            fVar = f23087l.get(A(str));
            if (fVar == null) {
                List<String> listK = k();
                if (listK.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", listK);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            fVar.f23095h.get().k();
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (!androidx.core.os.f.a(this.f23088a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f23088a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f23091d.n(x());
        this.f23095h.get().k();
    }

    public static f t(Context context) {
        synchronized (f23086k) {
            if (f23087l.containsKey("[DEFAULT]")) {
                return n();
            }
            n nVarA = n.a(context);
            if (nVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return u(context, nVarA);
        }
    }

    public static f u(Context context, n nVar) {
        return v(context, nVar, "[DEFAULT]");
    }

    public static f v(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String strA = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f23086k) {
            Map<String, f> map = f23087l;
            w8.m.o(!map.containsKey(strA), "FirebaseApp name " + strA + " already exists!");
            w8.m.l(context, "Application context cannot be null.");
            fVar = new f(context, strA, nVar);
            map.put(strA, fVar);
        }
        fVar.s();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ na.a y(Context context) {
        return new na.a(context, r(), (ka.c) this.f23091d.a(ka.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(boolean z10) {
        if (z10) {
            return;
        }
        this.f23095h.get().k();
    }

    public void D(boolean z10) {
        boolean z11;
        h();
        if (this.f23092e.compareAndSet(!z10, z10)) {
            boolean zD = com.google.android.gms.common.api.internal.a.b().d();
            if (z10 && zD) {
                z11 = true;
            } else if (z10 || !zD) {
                return;
            } else {
                z11 = false;
            }
            B(z11);
        }
    }

    public void E(Boolean bool) {
        h();
        this.f23094g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f23089b.equals(((f) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f23092e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f23096i.add(aVar);
    }

    public int hashCode() {
        return this.f23089b.hashCode();
    }

    public void i() {
        if (this.f23093f.compareAndSet(false, true)) {
            synchronized (f23086k) {
                f23087l.remove(this.f23089b);
            }
            C();
        }
    }

    public <T> T j(Class<T> cls) {
        h();
        return (T) this.f23091d.a(cls);
    }

    public Context l() {
        h();
        return this.f23088a;
    }

    public String p() {
        h();
        return this.f23089b;
    }

    public n q() {
        h();
        return this.f23090c;
    }

    public String r() {
        return e9.c.e(p().getBytes(Charset.defaultCharset())) + "+" + e9.c.e(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return w8.k.d(this).a("name", this.f23089b).a("options", this.f23090c).toString();
    }

    public boolean w() {
        h();
        return this.f23094g.get().b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
