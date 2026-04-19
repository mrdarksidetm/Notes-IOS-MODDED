package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends d1<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f785b;

    public m0(long[] jArr) {
        ae.r.f(jArr, "bufferWithData");
        this.f784a = jArr;
        this.f785b = jArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        long[] jArr = this.f784a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, ge.o.d(i10, jArr.length * 2));
            ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f784a = jArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f785b;
    }

    public final void e(long j10) {
        d1.c(this, 0, 1, null);
        long[] jArr = this.f784a;
        int iD = d();
        this.f785b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f784a, d());
        ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }
}
