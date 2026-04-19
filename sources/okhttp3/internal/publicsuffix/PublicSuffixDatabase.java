package okhttp3.internal.publicsuffix;

import ae.j;
import ae.r;
import com.amazon.a.a.o.c.a.b;
import hf.e;
import hf.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import je.w;
import md.i0;
import nd.c0;
import nd.t;
import nd.u;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17600e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f17601f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f17602g = t.d("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f17603h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17604a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f17605b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f17606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f17607d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int iD;
            int iD2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iD = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        iD = Util.d(bArr2[i17][i18], 255);
                    }
                    iD2 = iD - Util.d(bArr[i14 + i19], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        i18 = -1;
                        z11 = true;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                r.e(charset, "UTF_8");
                                return new String(bArr, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f17603h;
        }
    }

    private final List<String> b(List<String> list) {
        String str;
        String str2;
        String strB;
        if (this.f17604a.get() || !this.f17604a.compareAndSet(false, true)) {
            try {
                this.f17605b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.f17606c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = list.get(i10);
            Charset charset = StandardCharsets.UTF_8;
            r.e(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            r.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                str = null;
                break;
            }
            int i12 = i11 + 1;
            Companion companion = f17600e;
            byte[] bArr2 = this.f17606c;
            if (bArr2 == null) {
                r.t("publicSuffixListBytes");
                bArr2 = null;
            }
            String strB2 = companion.b(bArr2, bArr, i11);
            if (strB2 != null) {
                str = strB2;
                break;
            }
            i11 = i12;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13 + 1;
                bArr3[i13] = f17601f;
                Companion companion2 = f17600e;
                byte[] bArr4 = this.f17606c;
                if (bArr4 == null) {
                    r.t("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strB3 = companion2.b(bArr4, bArr3, i13);
                if (strB3 != null) {
                    str2 = strB3;
                    break;
                }
                i13 = i14;
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i15 = size - 1;
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                Companion companion3 = f17600e;
                byte[] bArr5 = this.f17607d;
                if (bArr5 == null) {
                    r.t("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                strB = companion3.b(bArr5, bArr, i16);
                if (strB != null) {
                    break;
                }
                i16 = i17;
            }
            strB = null;
        } else {
            strB = null;
        }
        if (strB != null) {
            return w.B0(r.m("!", strB), new char[]{b.f7490a}, false, 0, 6, null);
        }
        if (str == null && str2 == null) {
            return f17602g;
        }
        List<String> listB0 = str == null ? null : w.B0(str, new char[]{b.f7490a}, false, 0, 6, null);
        if (listB0 == null) {
            listB0 = u.m();
        }
        List<String> listB02 = str2 != null ? w.B0(str2, new char[]{b.f7490a}, false, 0, 6, null) : null;
        if (listB02 == null) {
            listB02 = u.m();
        }
        return listB0.size() > listB02.size() ? listB0 : listB02;
    }

    private final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e eVarD = hf.u.d(new o(hf.u.k(resourceAsStream)));
        try {
            byte[] bArrO = eVarD.O(eVarD.readInt());
            byte[] bArrO2 = eVarD.O(eVarD.readInt());
            i0 i0Var = i0.f15558a;
            xd.b.a(eVarD, null);
            synchronized (this) {
                r.c(bArrO);
                this.f17606c = bArrO;
                r.c(bArrO2);
                this.f17607d = bArrO2;
            }
            this.f17605b.countDown();
        } finally {
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    Platform.f17567a.g().k("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> listB0 = w.B0(str, new char[]{b.f7490a}, false, 0, 6, null);
        return r.b(c0.j0(listB0), "") ? c0.U(listB0, 1) : listB0;
    }

    public final String c(String str) {
        r.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        r.e(unicode, "unicodeDomain");
        List<String> listF = f(unicode);
        List<String> listB = b(listF);
        if (listF.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        char cCharAt = listB.get(0).charAt(0);
        int size = listF.size();
        int size2 = listB.size();
        if (cCharAt != '!') {
            size2++;
        }
        return ie.o.r(ie.o.l(c0.R(f(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
