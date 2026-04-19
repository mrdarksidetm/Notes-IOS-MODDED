package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f6912a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6914c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f6913b = new g0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f6915d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c10 = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c10 = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                y(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new md.i();
            }
        }
        return (cCharAt - c10) + 10;
    }

    private final String K() {
        String str = this.f6914c;
        ae.r.c(str);
        this.f6914c = null;
        return str;
    }

    public static /* synthetic */ boolean N(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.M(z10);
    }

    private final boolean P() {
        return C().charAt(this.f6912a - 1) != '\"';
    }

    private final int b(int i10) {
        int iG = G(i10);
        if (iG == -1) {
            y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new md.i();
        }
        int i11 = iG + 1;
        char cCharAt = C().charAt(iG);
        if (cCharAt == 'u') {
            return d(C(), i11);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.f6915d.append(cB);
            return i11;
        }
        y(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new md.i();
    }

    private final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    private final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f6915d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f6912a = i10;
        v();
        if (this.f6912a + 4 < charSequence.length()) {
            return d(charSequence, this.f6912a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new md.i();
    }

    private final boolean h(int i10) {
        int iG = G(i10);
        if (iG >= C().length() || iG == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new md.i();
        }
        int i11 = iG + 1;
        int iCharAt = C().charAt(iG) | ' ';
        if (iCharAt == 102) {
            j("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            j("rue", i11);
            return true;
        }
        y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new md.i();
    }

    private final void j(String str, int i10) {
        if (C().length() - i10 < str.length()) {
            y(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new md.i();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (C().charAt(i10 + i11) | ' ')) {
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new md.i();
            }
        }
        this.f6912a = i10 + str.length();
    }

    private final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f6915d.toString();
        ae.r.e(string, "escapedString.toString()");
        this.f6915d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void y(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f6912a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return aVar.x(str, i10, str2);
    }

    public final void A(String str) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        x("Encountered an unknown key '" + str + '\'', je.w.d0(J(0, this.f6912a), str, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new md.i();
    }

    protected abstract CharSequence C();

    protected final boolean D(char c10) {
        return !(((c10 == '}' || c10 == ']') || c10 == ':') || c10 == ',');
    }

    public final byte E() {
        CharSequence charSequenceC = C();
        int i10 = this.f6912a;
        while (true) {
            int iG = G(i10);
            if (iG == -1) {
                this.f6912a = iG;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iG);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6912a = iG;
                return b.a(cCharAt);
            }
            i10 = iG + 1;
        }
    }

    public final String F(boolean z10) {
        String strQ;
        byte bE = E();
        if (z10) {
            if (bE != 1 && bE != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bE != 1) {
                return null;
            }
            strQ = q();
        }
        this.f6914c = strQ;
        return strQ;
    }

    public abstract int G(int i10);

    public final void H(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bE = E();
        if (bE != 8 && bE != 6) {
            s();
            return;
        }
        while (true) {
            byte bE2 = E();
            boolean z11 = true;
            if (bE2 != 1) {
                if (bE2 != 8 && bE2 != 6) {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(Byte.valueOf(bE2));
                } else {
                    if (bE2 == 9) {
                        if (((Number) nd.c0.j0(arrayList)).byteValue() != 8) {
                            throw e0.f(this.f6912a, "found ] instead of } at path: " + this.f6913b, C());
                        }
                    } else if (bE2 == 7) {
                        if (((Number) nd.c0.j0(arrayList)).byteValue() != 6) {
                            throw e0.f(this.f6912a, "found } instead of ] at path: " + this.f6913b, C());
                        }
                    } else if (bE2 == 10) {
                        y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new md.i();
                    }
                    nd.z.M(arrayList);
                }
                m();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                k();
            }
        }
    }

    public abstract int I();

    public String J(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public abstract boolean L();

    public final boolean M(boolean z10) {
        int iG = G(I());
        int length = C().length() - iG;
        if (length < 4 || iG == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(iG + i10)) {
                return false;
            }
        }
        if (length > 4 && b.a(C().charAt(iG + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f6912a = iG + 4;
        return true;
    }

    protected final void O(char c10) {
        int i10 = this.f6912a - 1;
        this.f6912a = i10;
        if (i10 >= 0 && c10 == '\"' && ae.r.b(s(), "null")) {
            x("Expected string literal but 'null' literal was found", this.f6912a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new md.i();
        }
        z(b.a(c10));
        throw new md.i();
    }

    protected void e(int i10, int i11) {
        this.f6915d.append(C(), i10, i11);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(I());
    }

    public final boolean i() {
        boolean z10;
        int I = I();
        if (I == C().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new md.i();
        }
        if (C().charAt(I) == '\"') {
            I++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zH = h(I);
        if (z10) {
            if (this.f6912a == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new md.i();
            }
            if (C().charAt(this.f6912a) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new md.i();
            }
            this.f6912a++;
        }
        return zH;
    }

    public abstract String k();

    public abstract String l(String str, boolean z10);

    public abstract byte m();

    public final byte n(byte b10) {
        byte bM = m();
        if (bM == b10) {
            return bM;
        }
        z(b10);
        throw new md.i();
    }

    public abstract void o(char c10);

    public final long p() {
        boolean z10;
        int iG = G(I());
        if (iG >= C().length() || iG == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new md.i();
        }
        if (C().charAt(iG) == '\"') {
            iG++;
            if (iG == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new md.i();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = iG;
        long j10 = 0;
        boolean z11 = true;
        boolean z12 = false;
        while (z11) {
            char cCharAt = C().charAt(i10);
            if (cCharAt != '-') {
                if (b.a(cCharAt) != 0) {
                    break;
                }
                i10++;
                z11 = i10 != C().length();
                int i11 = cCharAt - '0';
                if (!(i11 >= 0 && i11 < 10)) {
                    y(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                    throw new md.i();
                }
                j10 = (j10 * ((long) 10)) - ((long) i11);
                if (j10 > 0) {
                    y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new md.i();
                }
            } else {
                if (i10 != iG) {
                    y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new md.i();
                }
                i10++;
                z12 = true;
            }
        }
        if (iG == i10 || (z12 && iG == i10 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new md.i();
        }
        if (z10) {
            if (!z11) {
                y(this, "EOF", 0, null, 6, null);
                throw new md.i();
            }
            if (C().charAt(i10) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new md.i();
            }
            i10++;
        }
        this.f6912a = i10;
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new md.i();
    }

    public final String q() {
        return this.f6914c != null ? K() : k();
    }

    protected final String r(CharSequence charSequence, int i10, int i11) {
        int iG;
        ae.r.f(charSequence, "source");
        char cCharAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iG = G(c(i10, i11));
                if (iG == -1) {
                    y(this, "EOF", iG, null, 4, null);
                    throw new md.i();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    e(i10, i11);
                    iG = G(i11);
                    if (iG == -1) {
                        y(this, "EOF", iG, null, 4, null);
                        throw new md.i();
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i11);
                }
            }
            z10 = true;
            i10 = iG;
            i11 = i10;
            cCharAt = charSequence.charAt(i11);
        }
        String strJ = !z10 ? J(i10, i11) : u(i10, i11);
        this.f6912a = i11 + 1;
        return strJ;
    }

    public final String s() {
        if (this.f6914c != null) {
            return K();
        }
        int I = I();
        if (I >= C().length() || I == -1) {
            y(this, "EOF", I, null, 4, null);
            throw new md.i();
        }
        byte bA = b.a(C().charAt(I));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            y(this, "Expected beginning of the string, but got " + C().charAt(I), 0, null, 6, null);
            throw new md.i();
        }
        boolean z10 = false;
        while (b.a(C().charAt(I)) == 0) {
            I++;
            if (I >= C().length()) {
                e(this.f6912a, I);
                int iG = G(I);
                if (iG == -1) {
                    this.f6912a = I;
                    return u(0, 0);
                }
                I = iG;
                z10 = true;
            }
        }
        int i10 = this.f6912a;
        String strJ = !z10 ? J(i10, I) : u(i10, I);
        this.f6912a = I;
        return strJ;
    }

    public final String t() {
        String strS = s();
        if (!ae.r.b(strS, "null") || !P()) {
            return strS;
        }
        y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new md.i();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f6912a + ')';
    }

    public void v() {
    }

    public final void w() {
        if (m() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + C().charAt(this.f6912a - 1) + " instead", 0, null, 6, null);
        throw new md.i();
    }

    public final Void x(String str, int i10, String str2) {
        String str3;
        ae.r.f(str, "message");
        ae.r.f(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw e0.f(i10, str + " at path: " + this.f6913b.a() + str3, C());
    }

    public final Void z(byte b10) {
        y(this, "Expected " + (b10 == 1 ? "quotation mark '\"'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.f6912a == C().length() || this.f6912a <= 0) ? "EOF" : String.valueOf(C().charAt(this.f6912a - 1))) + "' instead", this.f6912a - 1, null, 4, null);
        throw new md.i();
    }
}
