package yc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class y0 implements a1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<String, ba.y0> f23951a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(a1.f0 f0Var, Task task) {
        if (!task.isSuccessful()) {
            f0Var.a(v.e(task.getException()));
            return;
        }
        ba.y0 y0Var = (ba.y0) task.getResult();
        f23951a.put(y0Var.i(), y0Var);
        f0Var.success(new a1.z.a().b(Long.valueOf(y0Var.g())).c(Long.valueOf(y0Var.b())).f(y0Var.i()).e(y0Var.a()).d(Long.valueOf(y0Var.f())).a());
    }

    @Override // yc.a1.j
    public void d(String str, String str2, a1.f0<String> f0Var) {
        ba.v0 v0VarB = ba.w0.b(f23951a.get(str), str2);
        String string = UUID.randomUUID().toString();
        w0.f23940d.put(string, v0VarB);
        f0Var.success(string);
    }

    @Override // yc.a1.j
    public void f(String str, final a1.f0<a1.z> f0Var) {
        ba.w0.a(w0.f23938b.get(str)).addOnCompleteListener(new OnCompleteListener() { // from class: yc.x0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                y0.n(f0Var, task);
            }
        });
    }

    @Override // yc.a1.j
    public void j(String str, String str2, a1.f0<String> f0Var) {
        ba.v0 v0VarC = ba.w0.c(str, str2);
        String string = UUID.randomUUID().toString();
        w0.f23940d.put(string, v0VarC);
        f0Var.success(string);
    }
}
