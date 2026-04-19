package cf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f6956a = j.f6953c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6957b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= z0.a().length || (b10 = z0.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f6956a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = z0.b()[cCharAt];
                    ae.r.c(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f6956a, iF2);
                    i11 = iF2 + str2.length();
                } else {
                    char[] cArr = this.f6956a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                }
                this.f6957b = i11;
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f6956a[iF3] = '\"';
        this.f6957b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f6957b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f6956a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, ge.o.d(i12, i10 * 2));
            ae.r.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f6956a = cArrCopyOf;
        }
        return i10;
    }

    @Override // cf.s0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f6956a;
        int i10 = this.f6957b;
        this.f6957b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // cf.s0
    public void b(String str) {
        ae.r.f(str, "text");
        e(str.length() + 2);
        char[] cArr = this.f6956a;
        int i10 = this.f6957b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < z0.a().length && z0.a()[c10] != 0) {
                d(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f6957b = i12 + 1;
    }

    @Override // cf.s0
    public void c(String str) {
        ae.r.f(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(length);
        str.getChars(0, str.length(), this.f6956a, this.f6957b);
        this.f6957b += length;
    }

    public void g() {
        j.f6953c.c(this.f6956a);
    }

    public String toString() {
        return new String(this.f6956a, 0, this.f6957b);
    }

    @Override // cf.s0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
