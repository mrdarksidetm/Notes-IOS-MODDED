package d0;

import l1.f1;
import l1.v0;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f9193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l1.b0 f9194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n1.a f9195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f9196d;

    public f() {
        this(null, null, null, null, 15, null);
    }

    public f(v0 v0Var, l1.b0 b0Var, n1.a aVar, f1 f1Var) {
        this.f9193a = v0Var;
        this.f9194b = b0Var;
        this.f9195c = aVar;
        this.f9196d = f1Var;
    }

    public /* synthetic */ f(v0 v0Var, l1.b0 b0Var, n1.a aVar, f1 f1Var, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? null : v0Var, (i10 & 2) != 0 ? null : b0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : f1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ae.r.b(this.f9193a, fVar.f9193a) && ae.r.b(this.f9194b, fVar.f9194b) && ae.r.b(this.f9195c, fVar.f9195c) && ae.r.b(this.f9196d, fVar.f9196d);
    }

    public final f1 g() {
        f1 f1Var = this.f9196d;
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1VarA = l1.p.a();
        this.f9196d = f1VarA;
        return f1VarA;
    }

    public int hashCode() {
        v0 v0Var = this.f9193a;
        int iHashCode = (v0Var == null ? 0 : v0Var.hashCode()) * 31;
        l1.b0 b0Var = this.f9194b;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        n1.a aVar = this.f9195c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f1 f1Var = this.f9196d;
        return iHashCode3 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f9193a + ", canvas=" + this.f9194b + ", canvasDrawScope=" + this.f9195c + ", borderPath=" + this.f9196d + ')';
    }
}
