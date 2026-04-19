package ca;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h1 f6685c = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f6686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f6687b;

    private h1() {
        this(p0.j(), y.b());
    }

    private h1(p0 p0Var, y yVar) {
        this.f6686a = p0Var;
        this.f6687b = yVar;
    }

    public static h1 f() {
        return f6685c;
    }

    public final void a(Context context) {
        this.f6686a.a(context);
    }

    public final void b(FirebaseAuth firebaseAuth) {
        this.f6686a.h(firebaseAuth);
    }

    public final boolean c(Activity activity, TaskCompletionSource<ba.i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f6687b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource<ba.i> taskCompletionSource, FirebaseAuth firebaseAuth, ba.a0 a0Var) {
        return this.f6687b.j(activity, taskCompletionSource, firebaseAuth, a0Var);
    }

    public final Task<String> e() {
        return this.f6686a.i();
    }
}
