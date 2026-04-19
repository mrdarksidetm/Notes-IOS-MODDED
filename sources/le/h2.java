package le;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h2 extends e0 implements f1, u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i2 f15030d;

    @Override // le.u1
    public n2 b() {
        return null;
    }

    @Override // le.f1
    public void dispose() {
        s().C0(this);
    }

    @Override // le.u1
    public boolean isActive() {
        return true;
    }

    public final i2 s() {
        i2 i2Var = this.f15030d;
        if (i2Var != null) {
            return i2Var;
        }
        ae.r.t("job");
        return null;
    }

    public final void t(i2 i2Var) {
        this.f15030d = i2Var;
    }

    @Override // qe.s
    public String toString() {
        return r0.a(this) + '@' + r0.b(this) + "[job@" + r0.b(s()) + ']';
    }
}
