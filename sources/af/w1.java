package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends d1<md.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f850b;

    private w1(long[] jArr) {
        ae.r.f(jArr, "bufferWithData");
        this.f849a = jArr;
        this.f850b = md.d0.u(jArr);
        b(10);
    }

    public /* synthetic */ w1(long[] jArr, ae.j jVar) {
        this(jArr);
    }

    @Override // af.d1
    public /* bridge */ /* synthetic */ md.d0 a() {
        return md.d0.a(f());
    }

    @Override // af.d1
    public void b(int i10) {
        if (md.d0.u(this.f849a) < i10) {
            long[] jArr = this.f849a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, ge.o.d(i10, md.d0.u(jArr) * 2));
            ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f849a = md.d0.f(jArrCopyOf);
        }
    }

    @Override // af.d1
    public int d() {
        return this.f850b;
    }

    public final void e(long j10) {
        d1.c(this, 0, 1, null);
        long[] jArr = this.f849a;
        int iD = d();
        this.f850b = iD + 1;
        md.d0.y(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f849a, d());
        ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
        return md.d0.f(jArrCopyOf);
    }
}
