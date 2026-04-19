package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends a1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, c0<?> c0Var) {
        super(str, c0Var, 1);
        ae.r.f(str, "name");
        ae.r.f(c0Var, "generatedSerializer");
        this.f750m = true;
    }

    @Override // af.a1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            ye.f fVar = (ye.f) obj;
            if (ae.r.b(a(), fVar.a())) {
                d0 d0Var = (d0) obj;
                if ((d0Var.isInline() && Arrays.equals(p(), d0Var.p())) && f() == fVar.f()) {
                    int iF = f();
                    for (int i10 = 0; i10 < iF; i10++) {
                        if (ae.r.b(i(i10).a(), fVar.i(i10).a()) && ae.r.b(i(i10).e(), fVar.i(i10).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // af.a1
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // af.a1, ye.f
    public boolean isInline() {
        return this.f750m;
    }
}
