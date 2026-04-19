package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends d1<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f778b;

    public k1(short[] sArr) {
        ae.r.f(sArr, "bufferWithData");
        this.f777a = sArr;
        this.f778b = sArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        short[] sArr = this.f777a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, ge.o.d(i10, sArr.length * 2));
            ae.r.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f777a = sArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f778b;
    }

    public final void e(short s10) {
        d1.c(this, 0, 1, null);
        short[] sArr = this.f777a;
        int iD = d();
        this.f778b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f777a, d());
        ae.r.e(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }
}
