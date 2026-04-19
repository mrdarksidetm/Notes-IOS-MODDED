package hf;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f11965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f11966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(byte[][] bArr, int[] iArr) {
        super(f.f11961e.l());
        ae.r.f(bArr, "segments");
        ae.r.f(iArr, "directory");
        this.f11965f = bArr;
        this.f11966g = iArr;
    }

    private final f P() {
        return new f(O());
    }

    @Override // hf.f
    public boolean A(int i10, byte[] bArr, int i11, int i12) {
        ae.r.f(bArr, "other");
        if (i10 < 0 || i10 > F() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = p003if.j.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!o0.a(N()[iB], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // hf.f
    public f H(int i10, int i11) {
        int iE = o0.e(this, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (!(iE <= F())) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + F() + ')').toString());
        }
        int i12 = iE - i10;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iE == F()) {
            return this;
        }
        if (i10 == iE) {
            return f.f11961e;
        }
        int iB = p003if.j.b(this, i10);
        int iB2 = p003if.j.b(this, iE - 1);
        byte[][] bArr = (byte[][]) nd.o.n(N(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = 0;
            int i14 = iB;
            while (true) {
                iArr[i13] = Math.min(M()[i14] - i10, i12);
                int i15 = i13 + 1;
                iArr[i13 + bArr.length] = M()[N().length + i14];
                if (i14 == iB2) {
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        int i16 = iB != 0 ? M()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new f0(bArr, iArr);
    }

    @Override // hf.f
    public f J() {
        return P().J();
    }

    @Override // hf.f
    public void L(c cVar, int i10, int i11) {
        ae.r.f(cVar, "buffer");
        int i12 = i10 + i11;
        int iB = p003if.j.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : M()[iB - 1];
            int i14 = M()[iB] - i13;
            int i15 = M()[N().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            d0 d0Var = new d0(N()[iB], i16, i16 + iMin, true, false);
            d0 d0Var2 = cVar.f11933a;
            if (d0Var2 == null) {
                d0Var.f11954g = d0Var;
                d0Var.f11953f = d0Var;
                cVar.f11933a = d0Var;
            } else {
                ae.r.c(d0Var2);
                d0 d0Var3 = d0Var2.f11954g;
                ae.r.c(d0Var3);
                d0Var3.c(d0Var);
            }
            i10 += iMin;
            iB++;
        }
        cVar.n0(cVar.size() + ((long) i11));
    }

    public final int[] M() {
        return this.f11966g;
    }

    public final byte[][] N() {
        return this.f11965f;
    }

    public byte[] O() {
        byte[] bArr = new byte[F()];
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            int i15 = i14 - i11;
            nd.o.d(N()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // hf.f
    public String a() {
        return P().a();
    }

    @Override // hf.f
    public f c(String str) throws NoSuchAlgorithmException {
        ae.r.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = M()[length + i10];
            int i13 = M()[i10];
            messageDigest.update(N()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        ae.r.e(bArrDigest, "digestBytes");
        return new f(bArrDigest);
    }

    @Override // hf.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.F() == F() && z(0, fVar, 0, F())) {
                return true;
            }
        }
        return false;
    }

    @Override // hf.f
    public int hashCode() {
        int iM = m();
        if (iM != 0) {
            return iM;
        }
        int length = N().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            byte[] bArr = N()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        B(i11);
        return i11;
    }

    @Override // hf.f
    public int n() {
        return M()[N().length - 1];
    }

    @Override // hf.f
    public String p() {
        return P().p();
    }

    @Override // hf.f
    public int r(byte[] bArr, int i10) {
        ae.r.f(bArr, "other");
        return P().r(bArr, i10);
    }

    @Override // hf.f
    public byte[] t() {
        return O();
    }

    @Override // hf.f
    public String toString() {
        return P().toString();
    }

    @Override // hf.f
    public byte u(int i10) {
        o0.b(M()[N().length - 1], i10, 1L);
        int iB = p003if.j.b(this, i10);
        return N()[iB][(i10 - (iB == 0 ? 0 : M()[iB - 1])) + M()[N().length + iB]];
    }

    @Override // hf.f
    public int w(byte[] bArr, int i10) {
        ae.r.f(bArr, "other");
        return P().w(bArr, i10);
    }

    @Override // hf.f
    public boolean z(int i10, f fVar, int i11, int i12) {
        ae.r.f(fVar, "other");
        if (i10 < 0 || i10 > F() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = p003if.j.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!fVar.A(i11, N()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }
}
