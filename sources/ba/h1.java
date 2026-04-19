package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class h1 implements Continuation<c0, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f5595a;

    h1(a0 a0Var) {
        this.f5595a = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f5595a.T()).K(null, (String) w8.m.k(task.getResult().g()));
    }
}
