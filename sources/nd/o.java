package nd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static <T> void A(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        ae.r.f(tArr, "<this>");
        ae.r.f(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static <T> List<T> c(T[] tArr) {
        ae.r.f(tArr, "<this>");
        List<T> listA = q.a(tArr);
        ae.r.e(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        ae.r.f(bArr, "<this>");
        ae.r.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static float[] e(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        ae.r.f(fArr, "<this>");
        ae.r.f(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    public static int[] f(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        ae.r.f(iArr, "<this>");
        ae.r.f(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static long[] g(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        ae.r.f(jArr, "<this>");
        ae.r.f(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static <T> T[] h(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        ae.r.f(tArr, "<this>");
        ae.r.f(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] j(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return e(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] k(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return f(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] l(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return h(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] m(byte[] bArr, int i10, int i11) {
        ae.r.f(bArr, "<this>");
        m.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        ae.r.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static <T> T[] n(T[] tArr, int i10, int i11) {
        ae.r.f(tArr, "<this>");
        m.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        ae.r.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void o(int[] iArr, int i10, int i11, int i12) {
        ae.r.f(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void p(long[] jArr, long j10, int i10, int i11) {
        ae.r.f(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static <T> void q(T[] tArr, T t10, int i10, int i11) {
        ae.r.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void r(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        o(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void s(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        p(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void t(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        q(objArr, obj, i10, i11);
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        ae.r.f(bArr, "<this>");
        ae.r.f(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        ae.r.c(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] v(int[] iArr, int i10) {
        ae.r.f(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        ae.r.c(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] w(int[] iArr, int[] iArr2) {
        ae.r.f(iArr, "<this>");
        ae.r.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        ae.r.c(iArrCopyOf);
        return iArrCopyOf;
    }

    public static <T> T[] x(T[] tArr, T t10) {
        ae.r.f(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        ae.r.c(tArr2);
        return tArr2;
    }

    public static <T> void y(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void z(T[] tArr, Comparator<? super T> comparator) {
        ae.r.f(tArr, "<this>");
        ae.r.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
