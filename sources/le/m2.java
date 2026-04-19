package le;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m2 extends j0 {
    @Override // le.j0
    public j0 j0(int i10) {
        qe.p.a(i10);
        return this;
    }

    public abstract m2 k0();

    protected final String l0() {
        m2 m2VarK0;
        m2 m2VarC = d1.c();
        if (this == m2VarC) {
            return "Dispatchers.Main";
        }
        try {
            m2VarK0 = m2VarC.k0();
        } catch (UnsupportedOperationException unused) {
            m2VarK0 = null;
        }
        if (this == m2VarK0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // le.j0
    public String toString() {
        String strL0 = l0();
        if (strL0 != null) {
            return strL0;
        }
        return r0.a(this) + '@' + r0.b(this);
    }
}
