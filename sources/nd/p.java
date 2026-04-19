package nd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class p extends o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ie.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f16133a;

        public a(Object[] objArr) {
            this.f16133a = objArr;
        }

        @Override // ie.g
        public Iterator<T> iterator() {
            return ae.c.a(this.f16133a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends ae.s implements zd.a<Iterator<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T[] f16134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T[] tArr) {
            super(0);
            this.f16134a = tArr;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return ae.c.a(this.f16134a);
        }
    }

    public static List<Double> A0(double[] dArr) {
        ae.r.f(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? H0(dArr) : t.d(Double.valueOf(dArr[0])) : u.m();
    }

    public static <T> ie.g<T> B(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return tArr.length == 0 ? ie.m.e() : new a(tArr);
    }

    public static List<Float> B0(float[] fArr) {
        ae.r.f(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? I0(fArr) : t.d(Float.valueOf(fArr[0])) : u.m();
    }

    public static boolean C(byte[] bArr, byte b10) {
        ae.r.f(bArr, "<this>");
        return S(bArr, b10) >= 0;
    }

    public static List<Integer> C0(int[] iArr) {
        ae.r.f(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? J0(iArr) : t.d(Integer.valueOf(iArr[0])) : u.m();
    }

    public static boolean D(int[] iArr, int i10) {
        ae.r.f(iArr, "<this>");
        return T(iArr, i10) >= 0;
    }

    public static List<Long> D0(long[] jArr) {
        ae.r.f(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? K0(jArr) : t.d(Long.valueOf(jArr[0])) : u.m();
    }

    public static boolean E(long[] jArr, long j10) {
        ae.r.f(jArr, "<this>");
        return U(jArr, j10) >= 0;
    }

    public static <T> List<T> E0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? L0(tArr) : t.d(tArr[0]) : u.m();
    }

    public static <T> boolean F(T[] tArr, T t10) {
        ae.r.f(tArr, "<this>");
        return V(tArr, t10) >= 0;
    }

    public static List<Short> F0(short[] sArr) {
        ae.r.f(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? M0(sArr) : t.d(Short.valueOf(sArr[0])) : u.m();
    }

    public static boolean G(short[] sArr, short s10) {
        ae.r.f(sArr, "<this>");
        return W(sArr, s10) >= 0;
    }

    public static final List<Byte> G0(byte[] bArr) {
        ae.r.f(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static <T> List<T> H(T[] tArr, int i10) {
        ae.r.f(tArr, "<this>");
        if (i10 >= 0) {
            return x0(tArr, ge.o.d(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final List<Double> H0(double[] dArr) {
        ae.r.f(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static <T> List<T> I(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return (List) J(tArr, new ArrayList());
    }

    public static final List<Float> I0(float[] fArr) {
        ae.r.f(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C J(T[] tArr, C c10) {
        ae.r.f(tArr, "<this>");
        ae.r.f(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static List<Integer> J0(int[] iArr) {
        ae.r.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static int K(int[] iArr) {
        ae.r.f(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final List<Long> K0(long[] jArr) {
        ae.r.f(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static <T> T L(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static <T> List<T> L0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return new ArrayList(u.h(tArr));
    }

    public static <T> T M(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final List<Short> M0(short[] sArr) {
        ae.r.f(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static ge.i N(int[] iArr) {
        ae.r.f(iArr, "<this>");
        return new ge.i(0, O(iArr));
    }

    public static final <T> Set<T> N0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) y0(tArr, new LinkedHashSet(q0.b(tArr.length))) : x0.a(tArr[0]) : y0.b();
    }

    public static int O(int[] iArr) {
        ae.r.f(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> Iterable<i0<T>> O0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return new j0(new b(tArr));
    }

    public static int P(long[] jArr) {
        ae.r.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T, R> List<md.s<T, R>> P0(T[] tArr, R[] rArr) {
        ae.r.f(tArr, "<this>");
        ae.r.f(rArr, "other");
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(md.x.a(tArr[i10], rArr[i10]));
        }
        return arrayList;
    }

    public static <T> int Q(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T R(T[] tArr, int i10) {
        ae.r.f(tArr, "<this>");
        if (i10 < 0 || i10 > Q(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int S(byte[] bArr, byte b10) {
        ae.r.f(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int T(int[] iArr, int i10) {
        ae.r.f(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int U(long[] jArr, long j10) {
        ae.r.f(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int V(T[] tArr, T t10) {
        ae.r.f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (ae.r.b(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int W(short[] sArr, short s10) {
        ae.r.f(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <A extends Appendable> A X(byte[] bArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(bArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Byte.valueOf(b10)) : String.valueOf((int) b10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A Y(double[] dArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Double, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(dArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A Z(float[] fArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Float, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(fArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A a0(int[] iArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Integer, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(iArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A b0(long[] jArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Long, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(jArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T, A extends Appendable> A c0(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(tArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            je.n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A d0(short[] sArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Short, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(sArr, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? lVar.invoke(Short.valueOf(s10)) : String.valueOf((int) s10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final String e0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Byte, ? extends CharSequence> lVar) {
        ae.r.f(bArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) X(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String f0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Double, ? extends CharSequence> lVar) {
        ae.r.f(dArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) Y(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String g0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Float, ? extends CharSequence> lVar) {
        ae.r.f(fArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) Z(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String h0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Integer, ? extends CharSequence> lVar) {
        ae.r.f(iArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) a0(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String i0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Long, ? extends CharSequence> lVar) {
        ae.r.f(jArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) b0(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final <T> String j0(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) {
        ae.r.f(tArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) c0(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String k0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super Short, ? extends CharSequence> lVar) {
        ae.r.f(sArr, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) d0(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String l0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return e0(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String m0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return f0(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String n0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return g0(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String o0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return h0(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String p0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return i0(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String q0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return j0(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String r0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return k0(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T> T s0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[Q(tArr)];
    }

    public static <T> int t0(T[] tArr, T t10) {
        ae.r.f(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (ae.r.b(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static <T> T u0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static char v0(char[] cArr) {
        ae.r.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T w0(T[] tArr) {
        ae.r.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> x0(T[] tArr, int i10) {
        ae.r.f(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return u.m();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return E0(tArr);
        }
        if (i10 == 1) {
            return t.d(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C y0(T[] tArr, C c10) {
        ae.r.f(tArr, "<this>");
        ae.r.f(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static List<Byte> z0(byte[] bArr) {
        ae.r.f(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? G0(bArr) : t.d(Byte.valueOf(bArr[0])) : u.m();
    }
}
