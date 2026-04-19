package ca;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends ba.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f6706a;

    public k(g gVar) {
        w8.m.k(gVar);
        this.f6706a = gVar;
    }

    @Override // ba.h0
    public final Task<Void> a(ba.i0 i0Var, String str) {
        w8.m.k(i0Var);
        g gVar = this.f6706a;
        return FirebaseAuth.getInstance(gVar.T()).O(gVar, i0Var, str);
    }

    @Override // ba.h0
    public final List<ba.j0> b() {
        return this.f6706a.g0();
    }

    @Override // ba.h0
    public final Task<ba.l0> c() {
        return this.f6706a.x(false).continueWithTask(new n(this));
    }

    @Override // ba.h0
    public final Task<Void> d(String str) {
        w8.m.e(str);
        g gVar = this.f6706a;
        return FirebaseAuth.getInstance(gVar.T()).S(gVar, str);
    }
}
