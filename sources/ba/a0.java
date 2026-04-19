package ba;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends x8.a implements b1 {
    public abstract h0 A();

    public abstract List<? extends b1> B();

    public abstract String C();

    public abstract boolean D();

    public Task<i> E(h hVar) {
        w8.m.k(hVar);
        return FirebaseAuth.getInstance(T()).N(this, hVar);
    }

    public Task<i> F(h hVar) {
        w8.m.k(hVar);
        return FirebaseAuth.getInstance(T()).t0(this, hVar);
    }

    public Task<Void> G() {
        return FirebaseAuth.getInstance(T()).o0(this);
    }

    public Task<Void> H() {
        return FirebaseAuth.getInstance(T()).T(this, false).continueWithTask(new h1(this));
    }

    public Task<Void> I(e eVar) {
        return FirebaseAuth.getInstance(T()).T(this, false).continueWithTask(new g1(this, eVar));
    }

    public Task<i> J(Activity activity, n nVar) {
        w8.m.k(activity);
        w8.m.k(nVar);
        return FirebaseAuth.getInstance(T()).J(activity, nVar, this);
    }

    public Task<i> K(Activity activity, n nVar) {
        w8.m.k(activity);
        w8.m.k(nVar);
        return FirebaseAuth.getInstance(T()).n0(activity, nVar, this);
    }

    public Task<i> L(String str) {
        w8.m.e(str);
        return FirebaseAuth.getInstance(T()).p0(this, str);
    }

    @Deprecated
    public Task<Void> M(String str) {
        w8.m.e(str);
        return FirebaseAuth.getInstance(T()).u0(this, str);
    }

    public Task<Void> N(String str) {
        w8.m.e(str);
        return FirebaseAuth.getInstance(T()).x0(this, str);
    }

    public Task<Void> O(o0 o0Var) {
        return FirebaseAuth.getInstance(T()).P(this, o0Var);
    }

    public Task<Void> P(c1 c1Var) {
        w8.m.k(c1Var);
        return FirebaseAuth.getInstance(T()).Q(this, c1Var);
    }

    public Task<Void> Q(String str) {
        return R(str, null);
    }

    public Task<Void> R(String str, e eVar) {
        return FirebaseAuth.getInstance(T()).T(this, false).continueWithTask(new i1(this, str, eVar));
    }

    public abstract a0 S(List<? extends b1> list);

    public abstract x9.f T();

    public abstract void U(zzagl zzaglVar);

    public abstract a0 V();

    public abstract void W(List<n1> list);

    public abstract zzagl X();

    public abstract void Y(List<j0> list);

    public abstract List<n1> Z();

    public abstract List<String> a0();

    @Override // ba.b1
    public abstract Uri b();

    @Override // ba.b1
    public abstract String d();

    @Override // ba.b1
    public abstract String g();

    @Override // ba.b1
    public abstract String k();

    @Override // ba.b1
    public abstract String t();

    public Task<Void> u() {
        return FirebaseAuth.getInstance(T()).M(this);
    }

    public Task<c0> x(boolean z10) {
        return FirebaseAuth.getInstance(T()).T(this, z10);
    }

    public abstract b0 z();

    public abstract String zzd();

    public abstract String zze();
}
