package s6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f20232a = a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f20233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20234c;

    public n2(v1 v1Var, Context context) {
        this.f20233b = v1Var;
        this.f20234c = context;
    }

    public final a2 a() {
        try {
            return x2.a();
        } catch (l1 unused) {
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        v1 v1Var = this.f20233b;
        v1Var.getClass();
        v1Var.f20338a.I(this.f20234c);
        v1 v1Var2 = this.f20233b;
        v1Var2.getClass();
        v1Var2.f20339b.A(this.f20234c);
        v1 v1Var3 = this.f20233b;
        v1Var3.getClass();
        v1Var3.f20341d.M(this.f20234c);
        v1 v1Var4 = this.f20233b;
        v1Var4.getClass();
        if (v1Var4.f20350m != null) {
            v1 v1Var5 = this.f20233b;
            v1Var5.getClass();
            v1Var5.f20350m.f();
        }
        if (this.f20232a != null) {
            v1 v1Var6 = this.f20233b;
            v1Var6.getClass();
            v1Var6.f20351n.d();
            v1 v1Var7 = this.f20233b;
            v1Var7.getClass();
            if (v1Var7.f20350m != null) {
                v1 v1Var8 = this.f20233b;
                v1Var8.getClass();
                v1Var8.f20350m.j(this.f20232a);
                v1 v1Var9 = this.f20233b;
                v1Var9.getClass();
                v1Var9.f20350m.g(this.f20232a);
            }
        }
        v1 v1Var10 = this.f20233b;
        v1Var10.getClass();
        v1Var10.f20347j.x(this.f20234c);
        v1 v1Var11 = this.f20233b;
        v1Var11.getClass();
        v1Var11.f20348k.x(this.f20234c);
        v1 v1Var12 = this.f20233b;
        v1Var12.getClass();
        v1Var12.f20349l.x(this.f20234c);
    }
}
