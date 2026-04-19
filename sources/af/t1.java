package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends d1<md.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f825b;

    private t1(int[] iArr) {
        ae.r.f(iArr, "bufferWithData");
        this.f824a = iArr;
        this.f825b = md.b0.u(iArr);
        b(10);
    }

    public /* synthetic */ t1(int[] iArr, ae.j jVar) {
        this(iArr);
    }

    @Override // af.d1
    public /* bridge */ /* synthetic */ md.b0 a() {
        return md.b0.a(f());
    }

    @Override // af.d1
    public void b(int i10) {
        if (md.b0.u(this.f824a) < i10) {
            int[] iArr = this.f824a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, ge.o.d(i10, md.b0.u(iArr) * 2));
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f824a = md.b0.f(iArrCopyOf);
        }
    }

    @Override // af.d1
    public int d() {
        return this.f825b;
    }

    public final void e(int i10) {
        d1.c(this, 0, 1, null);
        int[] iArr = this.f824a;
        int iD = d();
        this.f825b = iD + 1;
        md.b0.y(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f824a, d());
        ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
        return md.b0.f(iArrCopyOf);
    }
}
