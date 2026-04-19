package s6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f20330e;

    public u2(u1 u1Var, w2 w2Var, u6.k kVar) {
        super(w2Var, kVar);
        this.f20330e = u1Var;
    }

    @Override // s6.j1
    public void a(Context context) {
        f();
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public void f() {
        c(this.f20330e.b());
    }

    public void g(a2 a2Var) {
        boolean zH = false;
        if (!this.f20330e.b()) {
            b(false);
            return;
        }
        try {
            zH = h(a2Var);
            if (zH) {
                i(a2Var);
            }
        } catch (l1 unused) {
        }
        b(zH);
    }

    public final boolean h(a2 a2Var) throws l1 {
        try {
            a2Var.c();
            return false;
        } catch (l1 e10) {
            if (e10.a() == -7779) {
                return true;
            }
            throw e10;
        }
    }

    public final void i(a2 a2Var) {
        if (a2Var.e()) {
            a2Var.a();
        }
        j(a2Var);
    }

    public void j(a2 a2Var) {
        try {
            if (a2Var.e()) {
                return;
            }
            a2Var.b();
        } catch (l1 unused) {
        }
    }
}
