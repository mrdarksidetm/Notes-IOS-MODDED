package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class w extends v {

    static final class a extends ae.s implements zd.p<CharSequence, Integer, md.s<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f14229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f14229a = cArr;
            this.f14230b = z10;
        }

        public final md.s<Integer, Integer> a(CharSequence charSequence, int i10) {
            ae.r.f(charSequence, "$this$$receiver");
            int iZ = w.Z(charSequence, this.f14229a, i10, this.f14230b);
            if (iZ < 0) {
                return null;
            }
            return md.x.a(Integer.valueOf(iZ), 1);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.s<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class b extends ae.s implements zd.p<CharSequence, Integer, md.s<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f14231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f14231a = list;
            this.f14232b = z10;
        }

        public final md.s<Integer, Integer> a(CharSequence charSequence, int i10) {
            ae.r.f(charSequence, "$this$$receiver");
            md.s sVarQ = w.Q(charSequence, this.f14231a, i10, this.f14232b, false);
            if (sVarQ != null) {
                return md.x.a(sVarQ.c(), Integer.valueOf(((String) sVarQ.d()).length()));
            }
            return null;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.s<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class c extends ae.s implements zd.l<ge.i, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f14233a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f14233a = charSequence;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(ge.i iVar) {
            ae.r.f(iVar, "it");
            return w.J0(this.f14233a, iVar);
        }
    }

    private static final List<String> A0(CharSequence charSequence, String str, boolean z10, int i10) {
        x0(i10);
        int length = 0;
        int iU = U(charSequence, str, 0, z10);
        if (iU == -1 || i10 == 1) {
            return nd.t.d(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? ge.o.h(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iU).toString());
            length = str.length() + iU;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iU = U(charSequence, str, length, z10);
        } while (iU != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List B0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List C0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return z0(charSequence, strArr, z10, i10);
    }

    public static final ie.g<String> D0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(strArr, "delimiters");
        return ie.o.s(p0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
    }

    public static /* synthetic */ ie.g E0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return D0(charSequence, strArr, z10, i10);
    }

    public static final boolean F0(CharSequence charSequence, char c10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        return charSequence.length() > 0 && je.c.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean G0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? v.G((String) charSequence, (String) charSequence2, false, 2, null) : q0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean H0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F0(charSequence, c10, z10);
    }

    public static final boolean I(CharSequence charSequence, char c10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        return X(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ boolean I0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G0(charSequence, charSequence2, z10);
    }

    public static final boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (Y(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (W(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String J0(CharSequence charSequence, ge.i iVar) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(iVar, "range");
        return charSequence.subSequence(iVar.d().intValue(), iVar.f().intValue() + 1).toString();
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(charSequence, c10, z10);
    }

    public static final String K0(String str, char c10, String str2) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "missingDelimiterValue");
        int iX = X(str, c10, 0, false, 6, null);
        if (iX == -1) {
            return str2;
        }
        String strSubstring = str.substring(iX + 1, str.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(charSequence, charSequence2, z10);
    }

    public static String L0(String str, String str2, String str3) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "delimiter");
        ae.r.f(str3, "missingDelimiterValue");
        int iY = Y(str, str2, 0, false, 6, null);
        if (iY == -1) {
            return str3;
        }
        String strSubstring = str.substring(iY + str2.length(), str.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean M(CharSequence charSequence, char c10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        return charSequence.length() > 0 && je.c.d(charSequence.charAt(S(charSequence)), c10, z10);
    }

    public static /* synthetic */ String M0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return K0(str, c10, str2);
    }

    public static final boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(charSequence2, "suffix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? v.s((String) charSequence, (String) charSequence2, false, 2, null) : q0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ String N0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return L0(str, str2, str3);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, c10, z10);
    }

    public static String O0(String str, char c10, String str2) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "missingDelimiterValue");
        int iC0 = c0(str, c10, 0, false, 6, null);
        if (iC0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iC0 + 1, str.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String P0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return O0(str, c10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        return md.x.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final md.s<java.lang.Integer, java.lang.String> Q(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.w.Q(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):md.s");
    }

    public static final String Q0(String str, char c10, String str2) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "missingDelimiterValue");
        int iX = X(str, c10, 0, false, 6, null);
        if (iX == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iX);
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final ge.i R(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        return new ge.i(0, charSequence.length() - 1);
    }

    public static final String R0(String str, String str2, String str3) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "delimiter");
        ae.r.f(str3, "missingDelimiterValue");
        int iY = Y(str, str2, 0, false, 6, null);
        if (iY == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iY);
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int S(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String S0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static final int T(CharSequence charSequence, char c10, int i10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? Z(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    public static final int U(CharSequence charSequence, String str, int i10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? W(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    public static final String U0(String str, char c10, String str2) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "missingDelimiterValue");
        int iC0 = c0(str, c10, 0, false, 6, null);
        if (iC0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iC0);
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int V(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        ge.g iVar = !z11 ? new ge.i(ge.o.d(i10, 0), ge.o.h(i11, charSequence.length())) : ge.o.p(ge.o.h(i10, S(charSequence)), ge.o.d(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iL = iVar.l();
            int iN = iVar.n();
            int iO = iVar.o();
            if ((iO <= 0 || iL > iN) && (iO >= 0 || iN > iL)) {
                return -1;
            }
            while (!v.w((String) charSequence2, 0, (String) charSequence, iL, charSequence2.length(), z10)) {
                if (iL == iN) {
                    return -1;
                }
                iL += iO;
            }
            return iL;
        }
        int iL2 = iVar.l();
        int iN2 = iVar.n();
        int iO2 = iVar.o();
        if ((iO2 <= 0 || iL2 > iN2) && (iO2 >= 0 || iN2 > iL2)) {
            return -1;
        }
        while (!q0(charSequence2, 0, charSequence, iL2, charSequence2.length(), z10)) {
            if (iL2 == iN2) {
                return -1;
            }
            iL2 += iO2;
        }
        return iL2;
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return U0(str, c10, str2);
    }

    static /* synthetic */ int W(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return V(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static CharSequence W0(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = je.b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int X(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return U(charSequence, str, i10, z10);
    }

    public static final int Z(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        ae.r.f(charSequence, "<this>");
        ae.r.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(nd.p.v0(cArr), i10);
        }
        l0 l0VarR = new ge.i(ge.o.d(i10, 0), S(charSequence)).iterator();
        while (l0VarR.hasNext()) {
            int iNextInt = l0VarR.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (je.c.d(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iNextInt;
            }
        }
        return -1;
    }

    public static final int a0(CharSequence charSequence, char c10, int i10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? e0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int b0(CharSequence charSequence, String str, int i10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? V(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = S(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = S(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b0(charSequence, str, i10, z10);
    }

    public static final int e0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(nd.p.v0(cArr), i10);
        }
        for (int iH = ge.o.h(i10, S(charSequence)); -1 < iH; iH--) {
            char cCharAt = charSequence.charAt(iH);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (je.c.d(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iH;
            }
        }
        return -1;
    }

    public static final ie.g<String> f0(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        return E0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static List<String> g0(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        return ie.o.v(f0(charSequence));
    }

    public static final CharSequence h0(CharSequence charSequence, int i10, char c10) {
        ae.r.f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        l0 l0VarR = new ge.i(1, i10 - charSequence.length()).iterator();
        while (l0VarR.hasNext()) {
            l0VarR.nextInt();
            sb2.append(c10);
        }
        return sb2;
    }

    public static final String i0(String str, int i10, char c10) {
        ae.r.f(str, "<this>");
        return h0(str, i10, c10).toString();
    }

    public static /* synthetic */ String j0(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return i0(str, i10, c10);
    }

    public static final CharSequence k0(CharSequence charSequence, int i10, char c10) {
        ae.r.f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        l0 l0VarR = new ge.i(1, i10 - charSequence.length()).iterator();
        while (l0VarR.hasNext()) {
            l0VarR.nextInt();
            sb2.append(c10);
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String l0(String str, int i10, char c10) {
        ae.r.f(str, "<this>");
        return k0(str, i10, c10).toString();
    }

    private static final ie.g<ge.i> m0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        x0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final ie.g<ge.i> n0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        x0(i11);
        return new e(charSequence, i10, i11, new b(nd.o.c(strArr), z10));
    }

    static /* synthetic */ ie.g o0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ ie.g p0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return n0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean q0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!je.c.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String r0(String str, CharSequence charSequence) {
        ae.r.f(str, "<this>");
        ae.r.f(charSequence, "prefix");
        if (!I0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String s0(String str, CharSequence charSequence) {
        ae.r.f(str, "<this>");
        ae.r.f(charSequence, "suffix");
        if (!P(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String t0(String str, CharSequence charSequence) {
        ae.r.f(str, "<this>");
        ae.r.f(charSequence, "delimiter");
        return u0(str, charSequence, charSequence);
    }

    public static final String u0(String str, CharSequence charSequence, CharSequence charSequence2) {
        ae.r.f(str, "<this>");
        ae.r.f(charSequence, "prefix");
        ae.r.f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !I0(str, charSequence, false, 2, null) || !P(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        ae.r.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence v0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            ae.r.e(sb2, "append(...)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            ae.r.e(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static CharSequence w0(CharSequence charSequence, ge.i iVar, CharSequence charSequence2) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(iVar, "range");
        ae.r.f(charSequence2, "replacement");
        return v0(charSequence, iVar.d().intValue(), iVar.f().intValue() + 1, charSequence2);
    }

    public static final void x0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> y0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return A0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable iterableJ = ie.o.j(o0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(nd.v.x(iterableJ, 10));
        Iterator it = iterableJ.iterator();
        while (it.hasNext()) {
            arrayList.add(J0(charSequence, (ge.i) it.next()));
        }
        return arrayList;
    }

    public static final List<String> z0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        ae.r.f(charSequence, "<this>");
        ae.r.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return A0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableJ = ie.o.j(p0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(nd.v.x(iterableJ, 10));
        Iterator it = iterableJ.iterator();
        while (it.hasNext()) {
            arrayList.add(J0(charSequence, (ge.i) it.next()));
        }
        return arrayList;
    }
}
