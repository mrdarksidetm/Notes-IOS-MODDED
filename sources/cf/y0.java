package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7019e;

    public y0(String str) {
        ae.r.f(str, "source");
        this.f7019e = str;
    }

    @Override // cf.a
    public int G(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // cf.a
    public int I() {
        char cCharAt;
        int i10 = this.f6912a;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < C().length() && ((cCharAt = C().charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f6912a = i10;
        return i10;
    }

    @Override // cf.a
    public boolean L() {
        int I = I();
        if (I == C().length() || I == -1 || C().charAt(I) != ',') {
            return false;
        }
        this.f6912a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cf.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f7019e;
    }

    @Override // cf.a
    public boolean f() {
        int i10 = this.f6912a;
        if (i10 == -1) {
            return false;
        }
        while (i10 < C().length()) {
            char cCharAt = C().charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6912a = i10;
                return D(cCharAt);
            }
            i10++;
        }
        this.f6912a = i10;
        return false;
    }

    @Override // cf.a
    public String k() {
        o('\"');
        int i10 = this.f6912a;
        int iX = je.w.X(C(), '\"', i10, false, 4, null);
        if (iX == -1) {
            z((byte) 1);
            throw new md.i();
        }
        for (int i11 = i10; i11 < iX; i11++) {
            if (C().charAt(i11) == '\\') {
                return r(C(), this.f6912a, i11);
            }
        }
        this.f6912a = iX + 1;
        String strSubstring = C().substring(i10, iX);
        ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // cf.a
    public String l(String str, boolean z10) {
        ae.r.f(str, "keyToMatch");
        int i10 = this.f6912a;
        try {
            if (m() != 6) {
                return null;
            }
            if (!ae.r.b(z10 ? k() : t(), str)) {
                return null;
            }
            if (m() != 5) {
                return null;
            }
            return z10 ? q() : t();
        } finally {
            this.f6912a = i10;
        }
    }

    @Override // cf.a
    public byte m() {
        byte bA;
        String strC = C();
        do {
            int i10 = this.f6912a;
            if (i10 == -1 || i10 >= strC.length()) {
                return (byte) 10;
            }
            int i11 = this.f6912a;
            this.f6912a = i11 + 1;
            bA = b.a(strC.charAt(i11));
        } while (bA == 3);
        return bA;
    }

    @Override // cf.a
    public void o(char c10) {
        if (this.f6912a == -1) {
            O(c10);
        }
        String strC = C();
        while (this.f6912a < strC.length()) {
            int i10 = this.f6912a;
            this.f6912a = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c10) {
                    return;
                } else {
                    O(c10);
                }
            }
        }
        O(c10);
    }
}
