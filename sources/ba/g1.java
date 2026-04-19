package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class g1 implements Continuation<c0, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f5593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a0 f5594b;

    g1(a0 a0Var, e eVar) {
        this.f5593a = eVar;
        this.f5594b = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f5594b.T()).K(this.f5593a, (String) w8.m.k(task.getResult().g()));
    }
}
