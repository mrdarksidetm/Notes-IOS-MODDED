package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class i1 implements Continuation<c0, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f5596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ e f5597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a0 f5598c;

    i1(a0 a0Var, String str, e eVar) {
        this.f5596a = str;
        this.f5597b = eVar;
        this.f5598c = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f5598c.T()).X((String) w8.m.k(task.getResult().g()), this.f5596a, this.f5597b);
    }
}
