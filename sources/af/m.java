package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends d1<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f783b;

    public m(char[] cArr) {
        ae.r.f(cArr, "bufferWithData");
        this.f782a = cArr;
        this.f783b = cArr.length;
        b(10);
    }

    @Override // af.d1
    public void b(int i10) {
        char[] cArr = this.f782a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, ge.o.d(i10, cArr.length * 2));
            ae.r.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f782a = cArrCopyOf;
        }
    }

    @Override // af.d1
    public int d() {
        return this.f783b;
    }

    public final void e(char c10) {
        d1.c(this, 0, 1, null);
        char[] cArr = this.f782a;
        int iD = d();
        this.f783b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // af.d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f782a, d());
        ae.r.e(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }
}
