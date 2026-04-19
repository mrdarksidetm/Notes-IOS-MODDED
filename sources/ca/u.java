package ca;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f6752b;

    u(v vVar, String str) {
        this.f6752b = vVar;
        this.f6751a = w8.m.e(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(x9.f.o(this.f6751a));
        if (firebaseAuth.j() != null) {
            Task<ba.c0> taskH = firebaseAuth.h(true);
            v.f6758h.g("Token refreshing started", new Object[0]);
            taskH.addOnFailureListener(new x(this));
        }
    }
}
