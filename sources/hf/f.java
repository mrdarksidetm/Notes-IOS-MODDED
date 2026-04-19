package hf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class f implements Serializable, Comparable<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11960d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f11961e = new f(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f11963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f11964c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public static /* synthetic */ f f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = o0.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final f a(String str) {
            ae.r.f(str, "<this>");
            byte[] bArrA = m0.a(str);
            if (bArrA != null) {
                return new f(bArrA);
            }
            return null;
        }

        public final f b(String str) {
            ae.r.f(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((p003if.g.e(str.charAt(i11)) << 4) + p003if.g.e(str.charAt(i11 + 1)));
            }
            return new f(bArr);
        }

        public final f c(String str, Charset charset) {
            ae.r.f(str, "<this>");
            ae.r.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            ae.r.e(bytes, "this as java.lang.String).getBytes(charset)");
            return new f(bytes);
        }

        public final f d(String str) {
            ae.r.f(str, "<this>");
            f fVar = new f(n0.a(str));
            fVar.C(str);
            return fVar;
        }

        public final f e(byte[] bArr, int i10, int i11) {
            ae.r.f(bArr, "<this>");
            int iF = o0.f(bArr, i11);
            o0.b(bArr.length, i10, iF);
            return new f(nd.o.m(bArr, i10, iF + i10));
        }
    }

    public f(byte[] bArr) {
        ae.r.f(bArr, "data");
        this.f11962a = bArr;
    }

    public static /* synthetic */ f I(f fVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = o0.c();
        }
        return fVar.H(i10, i11);
    }

    public static /* synthetic */ int s(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return fVar.q(fVar2, i10);
    }

    public static /* synthetic */ int x(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = o0.c();
        }
        return fVar.v(fVar2, i10);
    }

    public boolean A(int i10, byte[] bArr, int i11, int i12) {
        ae.r.f(bArr, "other");
        return i10 >= 0 && i10 <= l().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && o0.a(l(), i10, bArr, i11, i12);
    }

    public final void B(int i10) {
        this.f11963b = i10;
    }

    public final void C(String str) {
        this.f11964c = str;
    }

    public final f D() {
        return c("SHA-1");
    }

    public final f E() {
        return c("SHA-256");
    }

    public final int F() {
        return n();
    }

    public final boolean G(f fVar) {
        ae.r.f(fVar, "prefix");
        return z(0, fVar, 0, fVar.F());
    }

    public f H(int i10, int i11) {
        int iE = o0.e(this, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iE <= l().length) {
            if (iE - i10 >= 0) {
                return (i10 == 0 && iE == l().length) ? this : new f(nd.o.m(l(), i10, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
    }

    public f J() {
        for (int i10 = 0; i10 < l().length; i10++) {
            byte b10 = l()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrL = l();
                byte[] bArrCopyOf = Arrays.copyOf(bArrL, bArrL.length);
                ae.r.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArrCopyOf);
            }
        }
        return this;
    }

    public String K() {
        String strO = o();
        if (strO != null) {
            return strO;
        }
        String strC = n0.c(t());
        C(strC);
        return strC;
    }

    public void L(c cVar, int i10, int i11) {
        ae.r.f(cVar, "buffer");
        p003if.g.d(this, cVar, i10, i11);
    }

    public String a() {
        return m0.c(l(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(hf.f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            ae.r.f(r10, r0)
            int r0 = r9.F()
            int r1 = r10.F()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.j(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.j(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.f.compareTo(hf.f):int");
    }

    public f c(String str) throws NoSuchAlgorithmException {
        ae.r.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f11962a, 0, F());
        byte[] bArrDigest = messageDigest.digest();
        ae.r.e(bArrDigest, "digestBytes");
        return new f(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.F() == l().length && fVar.A(0, l(), 0, l().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iM = m();
        if (iM != 0) {
            return iM;
        }
        int iHashCode = Arrays.hashCode(l());
        B(iHashCode);
        return iHashCode;
    }

    public final boolean i(f fVar) {
        ae.r.f(fVar, "suffix");
        return z(F() - fVar.F(), fVar, 0, fVar.F());
    }

    public final byte j(int i10) {
        return u(i10);
    }

    public final byte[] l() {
        return this.f11962a;
    }

    public final int m() {
        return this.f11963b;
    }

    public int n() {
        return l().length;
    }

    public final String o() {
        return this.f11964c;
    }

    public String p() {
        char[] cArr = new char[l().length * 2];
        int i10 = 0;
        for (byte b10 : l()) {
            int i11 = i10 + 1;
            cArr[i10] = p003if.g.f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = p003if.g.f()[b10 & 15];
        }
        return je.v.p(cArr);
    }

    public final int q(f fVar, int i10) {
        ae.r.f(fVar, "other");
        return r(fVar.t(), i10);
    }

    public int r(byte[] bArr, int i10) {
        ae.r.f(bArr, "other");
        int length = l().length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!o0.a(l(), iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte[] t() {
        return l();
    }

    public String toString() {
        StringBuilder sb2;
        String str;
        if (!(l().length == 0)) {
            int iC = p003if.g.c(l(), 64);
            if (iC != -1) {
                String strK = K();
                String strSubstring = strK.substring(0, iC);
                ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strC = je.v.C(je.v.C(je.v.C(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC >= strK.length()) {
                    sb2 = new StringBuilder();
                    sb2.append("[text=");
                    sb2.append(strC);
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(l().length);
                sb2.append(" text=");
                sb2.append(strC);
            } else if (l().length <= 64) {
                str = "[hex=" + p() + ']';
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(l().length);
                sb2.append(" hex=");
                int iE = o0.e(this, 64);
                if (!(iE <= l().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
                }
                if (!(iE + 0 >= 0)) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                sb2.append((iE == l().length ? this : new f(nd.o.m(l(), 0, iE))).p());
            }
            sb2.append("…]");
            return sb2.toString();
        }
        str = "[size=0]";
        return str;
    }

    public byte u(int i10) {
        return l()[i10];
    }

    public final int v(f fVar, int i10) {
        ae.r.f(fVar, "other");
        return w(fVar.t(), i10);
    }

    public int w(byte[] bArr, int i10) {
        ae.r.f(bArr, "other");
        for (int iMin = Math.min(o0.e(this, i10), l().length - bArr.length); -1 < iMin; iMin--) {
            if (o0.a(l(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final f y() {
        return c("MD5");
    }

    public boolean z(int i10, f fVar, int i11, int i12) {
        ae.r.f(fVar, "other");
        return fVar.A(i11, l(), i10, i12);
    }
}
