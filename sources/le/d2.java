package le;

/* JADX INFO: loaded from: classes2.dex */
public class d2 extends i2 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15004c;

    public d2(a2 a2Var) {
        super(true);
        i0(a2Var);
        this.f15004c = O0();
    }

    private final boolean O0() {
        i2 i2VarS;
        u uVarE0 = e0();
        v vVar = uVarE0 instanceof v ? (v) uVarE0 : null;
        if (vVar != null && (i2VarS = vVar.s()) != null) {
            while (!i2VarS.a0()) {
                u uVarE02 = i2VarS.e0();
                v vVar2 = uVarE02 instanceof v ? (v) uVarE02 : null;
                if (vVar2 == null || (i2VarS = vVar2.s()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // le.a0
    public boolean a(Throwable th) {
        return n0(new c0(th, false, 2, null));
    }

    @Override // le.i2
    public boolean a0() {
        return this.f15004c;
    }

    @Override // le.i2
    public boolean c0() {
        return true;
    }
}
