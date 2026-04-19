package yc;

import android.app.Activity;
import ba.n0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jc.a;
import sc.c;
import yc.a1;
import yc.y2;

/* JADX INFO: loaded from: classes2.dex */
public class u implements FlutterFirebasePlugin, jc.a, kc.a, a1.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap<Integer, ba.h> f23920i = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sc.b f23921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.j f23922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f23923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<sc.c, c.d> f23924d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q0 f23925e = new q0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w0 f23926f = new w0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y0 f23927g = new y0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f23928h = new z0();

    private Activity J0() {
        return this.f23923c;
    }

    static FirebaseAuth K0(a1.b bVar) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(x9.f.o(bVar.b()));
        if (bVar.d() != null) {
            firebaseAuth.x(bVar.d());
        }
        String str = io.flutter.plugins.firebase.core.a.f13101c.get(bVar.b());
        if (str != null) {
            firebaseAuth.v(str);
        }
        if (bVar.c() != null) {
            firebaseAuth.v(bVar.c());
        }
        return firebaseAuth;
    }

    private void L0(sc.b bVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f23922b = new sc.j(bVar, "plugins.flutter.io/firebase_auth");
        a1.c.R(bVar, this);
        a1.e.B(bVar, this.f23925e);
        a1.m.r(bVar, this.f23926f);
        a1.h.n(bVar, this.f23926f);
        a1.j.c(bVar, this.f23927g);
        a1.l.c(bVar, this.f23928h);
        this.f23921a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.f((ba.d) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(TaskCompletionSource taskCompletionSource) {
        try {
            e1();
            f23920i.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(((ba.u0) task.getResult()).a());
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S0(x9.f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap map = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVar);
            ba.a0 a0VarJ = firebaseAuth.j();
            String strM = firebaseAuth.m();
            a1.b0 b0VarJ = a0VarJ == null ? null : z2.j(a0VarJ);
            if (strM != null) {
                map.put("APP_LANGUAGE_CODE", strM);
            }
            if (b0VarJ != null) {
                map.put("APP_CURRENT_USER", z2.c(b0VarJ));
            }
            taskCompletionSource.setResult(map);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a1(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b1(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c1(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success((String) task.getResult());
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d1(ba.o0 o0Var) {
        f23920i.put(Integer.valueOf(o0Var.hashCode()), o0Var);
    }

    private void e1() {
        for (sc.c cVar : this.f23924d.keySet()) {
            c.d dVar = this.f23924d.get(cVar);
            if (dVar != null) {
                dVar.b(null);
            }
            cVar.d(null);
        }
        this.f23924d.clear();
    }

    @Override // yc.a1.c
    public void E(a1.b bVar, String str, final a1.f0<List<String>> f0Var) {
        K0(bVar).g(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.R0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void F(a1.b bVar, String str, final a1.g0 g0Var) {
        K0(bVar).c(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.M0(g0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void J(a1.b bVar, String str, String str2, final a1.f0<a1.a0> f0Var) {
        K0(bVar).f(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: yc.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.P0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void T(a1.b bVar, String str, String str2, final a1.g0 g0Var) {
        K0(bVar).e(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: yc.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.O0(g0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void U(a1.b bVar, a1.e0 e0Var, a1.f0<String> f0Var) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            sc.c cVar = new sc.c(this.f23921a, str);
            ba.r0 r0Var = null;
            ba.l0 l0Var = e0Var.e() != null ? w0.f23938b.get(e0Var.e()) : null;
            String strD = e0Var.d();
            if (strD != null) {
                Iterator<String> it = w0.f23939c.keySet().iterator();
                while (it.hasNext()) {
                    Iterator<ba.j0> it2 = w0.f23939c.get(it.next()).x().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ba.j0 next = it2.next();
                            if (next.d().equals(strD) && (next instanceof ba.r0)) {
                                r0Var = (ba.r0) next;
                                break;
                            }
                        }
                    }
                }
            }
            y2 y2Var = new y2(J0(), bVar, e0Var, l0Var, r0Var, new y2.b() { // from class: yc.m
                @Override // yc.y2.b
                public final void a(ba.o0 o0Var) {
                    u.d1(o0Var);
                }
            });
            cVar.d(y2Var);
            this.f23924d.put(cVar, y2Var);
            f0Var.success(str);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    @Override // yc.a1.c
    public void X(a1.b bVar, a1.g0 g0Var) {
        Map<String, ba.h0> map;
        try {
            FirebaseAuth firebaseAuthK0 = K0(bVar);
            if (firebaseAuthK0.j() != null && (map = w0.f23937a.get(bVar.b())) != null) {
                map.remove(firebaseAuthK0.j().d());
            }
            firebaseAuthK0.D();
            g0Var.b();
        } catch (Exception e10) {
            g0Var.a(e10);
        }
    }

    @Override // yc.a1.c
    public void c(a1.b bVar, String str, final a1.f0<a1.a0> f0Var) {
        K0(bVar).A(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.Y0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void d(a1.b bVar, Map<String, Object> map, final a1.f0<a1.a0> f0Var) {
        FirebaseAuth firebaseAuthK0 = K0(bVar);
        ba.h hVarB = z2.b(map);
        if (hVarB == null) {
            throw v.b();
        }
        firebaseAuthK0.z(hVarB).addOnCompleteListener(new OnCompleteListener() { // from class: yc.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.X0(f0Var, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: yc.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f23879a.Q0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // yc.a1.c
    public void e(a1.b bVar, String str, Long l10, a1.g0 g0Var) {
        try {
            K0(bVar).G(str, l10.intValue());
            g0Var.b();
        } catch (Exception e10) {
            g0Var.a(e10);
        }
    }

    @Override // yc.a1.c
    public void e0(a1.b bVar, String str, a1.q qVar, final a1.g0 g0Var) {
        K0(bVar).u(str, z2.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: yc.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.V0(g0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void f0(a1.b bVar, a1.y yVar, final a1.f0<a1.a0> f0Var) {
        FirebaseAuth firebaseAuthK0 = K0(bVar);
        n0.a aVarE = ba.n0.e(yVar.c(), firebaseAuthK0);
        if (yVar.d() != null) {
            aVarE.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarE.a(yVar.b());
        }
        firebaseAuthK0.E(J0(), aVarE.b()).addOnCompleteListener(new OnCompleteListener() { // from class: yc.p
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.b1(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void g0(a1.b bVar, a1.f0<String> f0Var) {
        try {
            FirebaseAuth firebaseAuthK0 = K0(bVar);
            b bVar2 = new b(firebaseAuthK0);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + firebaseAuthK0.i().p();
            sc.c cVar = new sc.c(this.f23921a, str);
            cVar.d(bVar2);
            this.f23924d.put(cVar, bVar2);
            f0Var.success(str);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final x9.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: yc.c
            @Override // java.lang.Runnable
            public final void run() {
                u.S0(fVar, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // yc.a1.c
    public void h0(a1.b bVar, String str, final a1.f0<a1.o> f0Var) {
        K0(bVar).d(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.N0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void i(a1.b bVar, final a1.f0<a1.a0> f0Var) {
        K0(bVar).y().addOnCompleteListener(new OnCompleteListener() { // from class: yc.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.W0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void j(a1.b bVar, String str, String str2, final a1.f0<a1.a0> f0Var) {
        K0(bVar).C(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: yc.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.a1(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void k0(a1.b bVar, String str, a1.g0 g0Var) {
        g0Var.b();
    }

    @Override // yc.a1.c
    public void l(a1.b bVar, String str, a1.q qVar, final a1.g0 g0Var) {
        Task<Void> taskT;
        OnCompleteListener<Void> onCompleteListener;
        FirebaseAuth firebaseAuthK0 = K0(bVar);
        if (qVar == null) {
            taskT = firebaseAuthK0.s(str);
            onCompleteListener = new OnCompleteListener() { // from class: yc.s
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    u.T0(g0Var, task);
                }
            };
        } else {
            taskT = firebaseAuthK0.t(str, z2.a(qVar));
            onCompleteListener = new OnCompleteListener() { // from class: yc.t
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    u.U0(g0Var, task);
                }
            };
        }
        taskT.addOnCompleteListener(onCompleteListener);
    }

    @Override // yc.a1.c
    public void n0(a1.b bVar, String str, final a1.f0<String> f0Var) {
        K0(bVar).H(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.c1(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void o(a1.b bVar, a1.t tVar, a1.g0 g0Var) {
        try {
            FirebaseAuth firebaseAuthK0 = K0(bVar);
            firebaseAuthK0.l().b(tVar.b().booleanValue());
            if (tVar.c() != null) {
                firebaseAuthK0.l().a(tVar.c().booleanValue());
            }
            if (tVar.d() != null && tVar.e() != null) {
                firebaseAuthK0.l().c(tVar.d(), tVar.e());
            }
            g0Var.b();
        } catch (Exception e10) {
            g0Var.a(e10);
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        Activity activity = cVar.getActivity();
        this.f23923c = activity;
        this.f23925e.I0(activity);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        L0(bVar.b());
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.f23923c = null;
        this.f23925e.I0(null);
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f23923c = null;
        this.f23925e.I0(null);
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f23922b.e(null);
        a1.c.R(this.f23921a, null);
        a1.e.B(this.f23921a, null);
        a1.m.r(this.f23921a, null);
        a1.h.n(this.f23921a, null);
        a1.j.c(this.f23921a, null);
        a1.l.c(this.f23921a, null);
        this.f23922b = null;
        this.f23921a = null;
        e1();
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        Activity activity = cVar.getActivity();
        this.f23923c = activity;
        this.f23925e.I0(activity);
    }

    @Override // yc.a1.c
    public void q(a1.b bVar, a1.f0<String> f0Var) {
        try {
            FirebaseAuth firebaseAuthK0 = K0(bVar);
            x2 x2Var = new x2(firebaseAuthK0);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + firebaseAuthK0.i().p();
            sc.c cVar = new sc.c(this.f23921a, str);
            cVar.d(x2Var);
            this.f23924d.put(cVar, x2Var);
            f0Var.success(str);
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }

    @Override // yc.a1.c
    public void r(a1.b bVar, String str, String str2, final a1.f0<a1.a0> f0Var) {
        K0(bVar).B(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: yc.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                u.Z0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.c
    public void z(a1.b bVar, String str, a1.f0<String> f0Var) {
        try {
            FirebaseAuth firebaseAuthK0 = K0(bVar);
            if (str == null) {
                firebaseAuthK0.F();
            } else {
                firebaseAuthK0.w(str);
            }
            f0Var.success(firebaseAuthK0.m());
        } catch (Exception e10) {
            f0Var.a(e10);
        }
    }
}
