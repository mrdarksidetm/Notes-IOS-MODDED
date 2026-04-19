package yc;

import android.app.Activity;
import android.net.Uri;
import ba.c1;
import ba.n0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class q0 implements a1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f23905a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(a1.f0 f0Var, ba.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.j(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(final ba.a0 a0Var, final a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.G().addOnCompleteListener(new OnCompleteListener() { // from class: yc.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    q0.A0(f0Var, a0Var, task2);
                }
            });
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C0(a1.f0 f0Var, ba.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.j(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D0(final ba.a0 a0Var, final a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.G().addOnCompleteListener(new OnCompleteListener() { // from class: yc.f0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    q0.C0(f0Var, a0Var, task2);
                }
            });
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E0(a1.f0 f0Var, ba.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.j(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F0(final ba.a0 a0Var, final a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.G().addOnCompleteListener(new OnCompleteListener() { // from class: yc.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    q0.E0(f0Var, a0Var, task2);
                }
            });
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    public static ba.a0 n0(a1.b bVar) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(x9.f.o(bVar.b()));
        if (bVar.d() != null) {
            firebaseAuth.x(bVar.d());
        }
        return firebaseAuth.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0(a1.b bVar, a1.f0 f0Var, Boolean bool) {
        ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
            return;
        }
        try {
            f0Var.success(z2.l((ba.c0) Tasks.await(a0VarN0.x(bool.booleanValue()))));
        } catch (Exception e10) {
            f0Var.a(v.e(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(a1.f0 f0Var, ba.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.j(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w0(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x0(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            Exception exception = task.getException();
            f0Var.a(exception.getMessage().contains("User was not linked to an account with the given provider.") ? v.c() : v.e(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y0(a1.f0 f0Var, ba.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.j(a0Var));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z0(final ba.a0 a0Var, final a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            a0Var.G().addOnCompleteListener(new OnCompleteListener() { // from class: yc.d0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    q0.y0(f0Var, a0Var, task2);
                }
            });
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    @Override // yc.a1.e
    public void C(a1.b bVar, a1.d0 d0Var, final a1.f0<a1.b0> f0Var) {
        final ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
            return;
        }
        c1.a aVar = new c1.a();
        if (d0Var.c().booleanValue()) {
            aVar.b(d0Var.b());
        }
        if (d0Var.e().booleanValue()) {
            aVar.c(d0Var.d() != null ? Uri.parse(d0Var.d()) : null);
        }
        a0VarN0.P(aVar.a()).addOnCompleteListener(new OnCompleteListener() { // from class: yc.l0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                q0.F0(a0VarN0, f0Var, task);
            }
        });
    }

    @Override // yc.a1.e
    public void F(a1.b bVar, Map<String, Object> map, final a1.f0<a1.a0> f0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        ba.h hVarB = z2.b(map);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else if (hVarB == null) {
            f0Var.a(v.b());
        } else {
            a0VarN0.E(hVarB).addOnCompleteListener(new OnCompleteListener() { // from class: yc.x
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.q0(f0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void H(a1.b bVar, Map<String, Object> map, final a1.f0<a1.a0> f0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        ba.h hVarB = z2.b(map);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else if (hVarB == null) {
            f0Var.a(v.b());
        } else {
            a0VarN0.F(hVarB).addOnCompleteListener(new OnCompleteListener() { // from class: yc.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.s0(f0Var, task);
                }
            });
        }
    }

    public void I0(Activity activity) {
        this.f23905a = activity;
    }

    @Override // yc.a1.e
    public void M(a1.b bVar, String str, final a1.f0<a1.b0> f0Var) {
        final ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else {
            a0VarN0.N(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.n0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.B0(a0VarN0, f0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void O(a1.b bVar, final a1.g0 g0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            g0Var.a(v.d());
        } else {
            a0VarN0.u().addOnCompleteListener(new OnCompleteListener() { // from class: yc.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.o0(g0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void S(a1.b bVar, String str, final a1.f0<a1.a0> f0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else {
            a0VarN0.L(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.x0(f0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void d(a1.b bVar, String str, final a1.f0<a1.b0> f0Var) {
        final ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else {
            a0VarN0.M(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.p0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.z0(a0VarN0, f0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void h(final a1.b bVar, final Boolean bool, final a1.f0<a1.u> f0Var) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: yc.o0
            @Override // java.lang.Runnable
            public final void run() {
                q0.p0(bVar, f0Var, bool);
            }
        });
    }

    @Override // yc.a1.e
    public void k(a1.b bVar, a1.y yVar, final a1.f0<a1.a0> f0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        n0.a aVarD = ba.n0.d(yVar.c());
        if (yVar.d() != null) {
            aVarD.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarD.a(yVar.b());
        }
        a0VarN0.J(this.f23905a, aVarD.b()).addOnCompleteListener(new OnCompleteListener() { // from class: yc.m0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                q0.r0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.e
    public void m(a1.b bVar, a1.q qVar, final a1.g0 g0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            g0Var.a(v.d());
        } else if (qVar == null) {
            a0VarN0.H().addOnCompleteListener(new OnCompleteListener() { // from class: yc.h0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.v0(g0Var, task);
                }
            });
        } else {
            a0VarN0.I(z2.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: yc.i0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.w0(g0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void p(a1.b bVar, String str, a1.q qVar, final a1.g0 g0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            g0Var.a(v.d());
        } else if (qVar == null) {
            a0VarN0.Q(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.b0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.G0(g0Var, task);
                }
            });
        } else {
            a0VarN0.R(str, z2.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: yc.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.H0(g0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void t(a1.b bVar, final a1.f0<a1.b0> f0Var) {
        final ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
        } else {
            a0VarN0.G().addOnCompleteListener(new OnCompleteListener() { // from class: yc.w
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.u0(f0Var, a0VarN0, task);
                }
            });
        }
    }

    @Override // yc.a1.e
    public void w(a1.b bVar, a1.y yVar, final a1.f0<a1.a0> f0Var) {
        ba.a0 a0VarN0 = n0(bVar);
        n0.a aVarD = ba.n0.d(yVar.c());
        if (yVar.d() != null) {
            aVarD.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarD.a(yVar.b());
        }
        a0VarN0.K(this.f23905a, aVarD.b()).addOnCompleteListener(new OnCompleteListener() { // from class: yc.k0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                q0.t0(f0Var, task);
            }
        });
    }

    @Override // yc.a1.e
    public void z(a1.b bVar, Map<String, Object> map, final a1.f0<a1.b0> f0Var) {
        final ba.a0 a0VarN0 = n0(bVar);
        if (a0VarN0 == null) {
            f0Var.a(v.d());
            return;
        }
        ba.o0 o0Var = (ba.o0) z2.b(map);
        if (o0Var == null) {
            f0Var.a(v.b());
        } else {
            a0VarN0.O(o0Var).addOnCompleteListener(new OnCompleteListener() { // from class: yc.z
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    q0.D0(a0VarN0, f0Var, task);
                }
            });
        }
    }
}
