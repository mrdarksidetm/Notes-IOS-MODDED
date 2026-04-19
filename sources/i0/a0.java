package i0;

import i0.g0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f12044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f12047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0 f12048f;

    public a0(boolean z10, d0 d0Var, int i10, int i11, y yVar, g0 g0Var) {
        this.f12043a = z10;
        this.f12044b = d0Var;
        this.f12045c = i10;
        this.f12046d = i11;
        this.f12047e = yVar;
        this.f12048f = g0Var;
    }

    public final long a(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f12044b.b()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.f12044b.a()[i13] + this.f12044b.b()[i13]) - this.f12044b.a()[i10];
        }
        int iD = ge.o.d(i12, 0);
        return this.f12043a ? w2.b.f22395b.e(iD) : w2.b.f22395b.d(iD);
    }

    public abstract z b(int i10, x[] xVarArr, List<b> list, int i11);

    public final z c(int i10) {
        g0.c cVarC = this.f12048f.c(i10);
        int size = cVarC.b().size();
        int i11 = (size == 0 || cVarC.a() + size == this.f12045c) ? 0 : this.f12046d;
        x[] xVarArr = new x[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iD = b.d(cVarC.b().get(i13).g());
            x xVarB = this.f12047e.b(cVarC.a() + i13, i11, a(i12, iD));
            i12 += iD;
            md.i0 i0Var = md.i0.f15558a;
            xVarArr[i13] = xVarB;
        }
        return b(i10, xVarArr, cVarC.b(), i11);
    }

    public final long d(int i10) {
        g0 g0Var = this.f12048f;
        return a(0, g0Var.i(i10, g0Var.e()));
    }
}
