package yc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class w0 implements a1.m, a1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<String, Map<String, ba.h0>> f23937a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<String, ba.l0> f23938b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<String, ba.k0> f23939c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map<String, ba.i0> f23940d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(a1.f0 f0Var, Task task) {
        if (!task.isSuccessful()) {
            f0Var.a(v.e(task.getException()));
            return;
        }
        ba.l0 l0Var = (ba.l0) task.getResult();
        String string = UUID.randomUUID().toString();
        f23938b.put(string, l0Var);
        f0Var.success(new a1.w.a().b(string).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            f0Var.success(z2.i((ba.i) task.getResult()));
        } else {
            f0Var.a(v.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(a1.g0 g0Var, Task task) {
        if (task.isSuccessful()) {
            g0Var.b();
        } else {
            g0Var.a(v.e(task.getException()));
        }
    }

    ba.h0 C(a1.b bVar) throws oa.a {
        ba.a0 a0VarN0 = q0.n0(bVar);
        if (a0VarN0 == null) {
            throw new oa.a("No user is signed in");
        }
        Map<String, Map<String, ba.h0>> map = f23937a;
        if (map.get(bVar.b()) == null) {
            map.put(bVar.b(), new HashMap());
        }
        Map<String, ba.h0> map2 = map.get(bVar.b());
        if (map2.get(a0VarN0.d()) == null) {
            map2.put(a0VarN0.d(), a0VarN0.A());
        }
        return map2.get(a0VarN0.d());
    }

    @Override // yc.a1.m
    public void c(a1.b bVar, a1.x xVar, String str, final a1.g0 g0Var) {
        try {
            C(bVar).a(ba.q0.a(com.google.firebase.auth.b.a(xVar.c(), xVar.b())), str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.r0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w0.D(g0Var, task);
                }
            });
        } catch (oa.a e10) {
            g0Var.a(e10);
        }
    }

    @Override // yc.a1.h
    public void e(String str, a1.x xVar, String str2, final a1.f0<a1.a0> f0Var) {
        ba.k0 k0Var = f23939c.get(str);
        if (k0Var == null) {
            f0Var.a(v.e(new Exception("Resolver not found")));
        } else {
            k0Var.A(xVar != null ? ba.q0.a(com.google.firebase.auth.b.a(xVar.c(), xVar.b())) : f23940d.get(str2)).addOnCompleteListener(new OnCompleteListener() { // from class: yc.v0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w0.G(f0Var, task);
                }
            });
        }
    }

    @Override // yc.a1.m
    public void i(a1.b bVar, final a1.f0<a1.w> f0Var) {
        try {
            C(bVar).c().addOnCompleteListener(new OnCompleteListener() { // from class: yc.u0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w0.F(f0Var, task);
                }
            });
        } catch (oa.a e10) {
            f0Var.a(e10);
        }
    }

    @Override // yc.a1.m
    public void o(a1.b bVar, String str, String str2, final a1.g0 g0Var) {
        try {
            C(bVar).a(f23940d.get(str), str2).addOnCompleteListener(new OnCompleteListener() { // from class: yc.t0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w0.E(g0Var, task);
                }
            });
        } catch (oa.a e10) {
            g0Var.a(e10);
        }
    }

    @Override // yc.a1.m
    public void q(a1.b bVar, String str, final a1.g0 g0Var) {
        try {
            C(bVar).d(str).addOnCompleteListener(new OnCompleteListener() { // from class: yc.s0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    w0.H(g0Var, task);
                }
            });
        } catch (oa.a e10) {
            g0Var.a(v.e(e10));
        }
    }

    @Override // yc.a1.m
    public void v(a1.b bVar, a1.f0<List<a1.v>> f0Var) {
        try {
            f0Var.success(z2.e(C(bVar).b()));
        } catch (oa.a e10) {
            f0Var.a(e10);
        }
    }
}
