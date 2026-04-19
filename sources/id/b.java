package id;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final id.d f12640a = new id.a(new byte[]{0}, 1);

    public static class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final a f12641e = new a(b.f12640a, 1, 1);

        a(id.d dVar, int i10, int i11) {
            super(dVar, i10, i11);
        }

        public static a c() {
            return f12641e;
        }

        @Override // id.b.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f12646a.e(this.f12647b, b()));
            sb2.append('\"');
            return sb2;
        }

        @Override // id.b.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public byte[] d() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f12646a.get(this.f12647b + i10);
            }
            return bArr;
        }

        @Override // id.b.f
        public String toString() {
            return this.f12646a.e(this.f12647b, b());
        }
    }

    /* JADX INFO: renamed from: id.b$b, reason: collision with other inner class name */
    public static class C0305b extends RuntimeException {
        C0305b(String str) {
            super(str);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f12642d = new c(b.f12640a, 0, 0);

        c(id.d dVar, int i10, int i11) {
            super(dVar, i10, i11);
        }

        public static c c() {
            return f12642d;
        }

        @Override // id.b.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f12647b == this.f12647b && cVar.f12648c == this.f12648c;
        }

        public int hashCode() {
            return this.f12647b ^ this.f12648c;
        }

        @Override // id.b.f
        public String toString() {
            int i10 = this.f12647b;
            while (this.f12646a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f12647b;
            return this.f12646a.e(i11, i10 - i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f12643a;

        d(i iVar) {
            this.f12643a = iVar;
        }

        public c a(int i10) {
            if (i10 >= b()) {
                return c.f12642d;
            }
            i iVar = this.f12643a;
            int i11 = iVar.f12647b + (i10 * iVar.f12648c);
            i iVar2 = this.f12643a;
            id.d dVar = iVar2.f12646a;
            return new c(dVar, b.h(dVar, i11, iVar2.f12648c), 1);
        }

        public int b() {
            return this.f12643a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i10 = 0; i10 < this.f12643a.b(); i10++) {
                this.f12643a.d(i10).u(sb2);
                if (i10 != this.f12643a.b() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final e f12644g = new e(b.f12640a, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f12645f;

        e(id.d dVar, int i10, int i11) {
            super(dVar, i10, i11);
            this.f12645f = new byte[4];
        }

        public static e e() {
            return f12644g;
        }

        @Override // id.b.k, id.b.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            d dVarF = f();
            int iB = b();
            k kVarG = g();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append('\"');
                sb2.append(dVarF.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(kVarG.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public d f() {
            int i10 = this.f12647b - (this.f12648c * 3);
            id.d dVar = this.f12646a;
            int iH = b.h(dVar, i10, this.f12648c);
            id.d dVar2 = this.f12646a;
            int i11 = this.f12648c;
            return new d(new i(dVar, iH, b.m(dVar2, i10 + i11, i11), 4));
        }

        public k g() {
            return new k(this.f12646a, this.f12647b, this.f12648c);
        }
    }

    private static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        id.d f12646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12648c;

        f(id.d dVar, int i10, int i11) {
            this.f12646a = dVar;
            this.f12647b = i10;
            this.f12648c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f12649f = new g(b.f12640a, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private id.d f12650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12654e;

        g(id.d dVar, int i10, int i11, int i12) {
            this(dVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        g(id.d dVar, int i10, int i11, int i12, int i13) {
            this.f12650a = dVar;
            this.f12651b = i10;
            this.f12652c = i11;
            this.f12653d = i12;
            this.f12654e = i13;
        }

        public a b() {
            if (!m() && !s()) {
                return a.c();
            }
            id.d dVar = this.f12650a;
            return new a(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
        }

        public boolean c() {
            return n() ? this.f12650a.get(this.f12651b) != 0 : j() != 0;
        }

        public double d() {
            int i10 = this.f12654e;
            if (i10 == 3) {
                return b.l(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 1) {
                return b.m(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    id.d dVar = this.f12650a;
                    return b.m(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
                }
                if (i10 == 7) {
                    id.d dVar2 = this.f12650a;
                    return b.o(dVar2, b.h(dVar2, this.f12651b, this.f12652c), this.f12653d);
                }
                if (i10 == 8) {
                    id.d dVar3 = this.f12650a;
                    return b.l(dVar3, b.h(dVar3, this.f12651b, this.f12652c), this.f12653d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return b.o(this.f12650a, this.f12651b, this.f12652c);
        }

        public int e() {
            int i10 = this.f12654e;
            if (i10 == 1) {
                return b.m(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 2) {
                return (int) b.o(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 3) {
                return (int) b.l(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 5) {
                return Integer.parseInt(i());
            }
            if (i10 == 6) {
                id.d dVar = this.f12650a;
                return b.m(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 == 7) {
                id.d dVar2 = this.f12650a;
                return (int) b.o(dVar2, b.h(dVar2, this.f12651b, this.f12652c), this.f12652c);
            }
            if (i10 == 8) {
                id.d dVar3 = this.f12650a;
                return (int) b.l(dVar3, b.h(dVar3, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0;
            }
            return b.m(this.f12650a, this.f12651b, this.f12652c);
        }

        public c f() {
            if (!q()) {
                return c.c();
            }
            id.d dVar = this.f12650a;
            return new c(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
        }

        public long g() {
            int i10 = this.f12654e;
            if (i10 == 1) {
                return b.n(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 2) {
                return b.o(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 3) {
                return (long) b.l(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                id.d dVar = this.f12650a;
                return b.n(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 == 7) {
                id.d dVar2 = this.f12650a;
                return b.o(dVar2, b.h(dVar2, this.f12651b, this.f12652c), this.f12652c);
            }
            if (i10 == 8) {
                id.d dVar3 = this.f12650a;
                return (long) b.l(dVar3, b.h(dVar3, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return b.m(this.f12650a, this.f12651b, this.f12652c);
        }

        public e h() {
            if (!r()) {
                return e.e();
            }
            id.d dVar = this.f12650a;
            return new e(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
        }

        public String i() {
            int iH;
            id.d dVar;
            int iO;
            if (s()) {
                iH = b.h(this.f12650a, this.f12651b, this.f12652c);
                id.d dVar2 = this.f12650a;
                int i10 = this.f12653d;
                iO = (int) b.o(dVar2, iH - i10, i10);
                dVar = this.f12650a;
            } else {
                if (!q()) {
                    return "";
                }
                iH = b.h(this.f12650a, this.f12651b, this.f12653d);
                int i11 = iH;
                while (this.f12650a.get(i11) != 0) {
                    i11++;
                }
                dVar = this.f12650a;
                iO = i11 - iH;
            }
            return dVar.e(iH, iO);
        }

        public long j() {
            int i10 = this.f12654e;
            if (i10 == 2) {
                return b.o(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 1) {
                return b.n(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 3) {
                return (long) b.l(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return b.m(this.f12650a, this.f12651b, this.f12652c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                id.d dVar = this.f12650a;
                return b.n(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 == 7) {
                id.d dVar2 = this.f12650a;
                return b.o(dVar2, b.h(dVar2, this.f12651b, this.f12652c), this.f12653d);
            }
            if (i10 != 8) {
                return 0L;
            }
            id.d dVar3 = this.f12650a;
            return (long) b.l(dVar3, b.h(dVar3, this.f12651b, this.f12652c), this.f12652c);
        }

        public k k() {
            if (t()) {
                id.d dVar = this.f12650a;
                return new k(dVar, b.h(dVar, this.f12651b, this.f12652c), this.f12653d);
            }
            int i10 = this.f12654e;
            if (i10 == 15) {
                id.d dVar2 = this.f12650a;
                return new i(dVar2, b.h(dVar2, this.f12651b, this.f12652c), this.f12653d, 4);
            }
            if (!b.j(i10)) {
                return k.c();
            }
            id.d dVar3 = this.f12650a;
            return new i(dVar3, b.h(dVar3, this.f12651b, this.f12652c), this.f12653d, b.q(this.f12654e));
        }

        public int l() {
            return this.f12654e;
        }

        public boolean m() {
            return this.f12654e == 25;
        }

        public boolean n() {
            return this.f12654e == 26;
        }

        public boolean o() {
            int i10 = this.f12654e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f12654e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return this.f12654e == 4;
        }

        public boolean r() {
            return this.f12654e == 9;
        }

        public boolean s() {
            return this.f12654e == 5;
        }

        public boolean t() {
            int i10 = this.f12654e;
            return i10 == 10 || i10 == 9;
        }

        public String toString() {
            return u(new StringBuilder(128)).toString();
        }

        StringBuilder u(StringBuilder sb2) {
            int i10 = this.f12654e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        c cVarF = f();
                        sb2.append('\"');
                        StringBuilder sbA = cVarF.a(sb2);
                        sbA.append('\"');
                        return sbA;
                    case 5:
                        sb2.append('\"');
                        sb2.append(i());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new C0305b("not_implemented:" + this.f12654e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }
    }

    private static abstract class h extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f12655d;

        h(id.d dVar, int i10, int i11) {
            super(dVar, i10, i11);
            this.f12655d = (int) b.o(this.f12646a, i10 - i11, i11);
        }

        public int b() {
            return this.f12655d;
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final i f12656g = new i(b.f12640a, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f12657f;

        i(id.d dVar, int i10, int i11, int i12) {
            super(dVar, i10, i11);
            this.f12657f = i12;
        }

        @Override // id.b.k
        public g d(int i10) {
            if (i10 >= b()) {
                return g.f12649f;
            }
            return new g(this.f12646a, this.f12647b + (i10 * this.f12648c), this.f12648c, 1, this.f12657f);
        }
    }

    static class j {
        static int a(byte b10) {
            return b10 & 255;
        }

        static long b(int i10) {
            return ((long) i10) & 4294967295L;
        }

        static int c(short s10) {
            return s10 & 65535;
        }
    }

    public static class k extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final k f12658e = new k(b.f12640a, 1, 1);

        k(id.d dVar, int i10, int i11) {
            super(dVar, i10, i11);
        }

        public static k c() {
            return f12658e;
        }

        @Override // id.b.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).u(sb2);
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // id.b.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return g.f12649f;
            }
            return new g(this.f12646a, this.f12647b + (i10 * this.f12648c), this.f12648c, j.a(this.f12646a.get((int) (((long) this.f12647b) + (jB * ((long) this.f12648c)) + j10))));
        }

        @Override // id.b.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static g g(id.d dVar) {
        int iA = dVar.a() - 1;
        byte b10 = dVar.get(iA);
        int i10 = iA - 1;
        return new g(dVar, i10 - b10, b10, j.a(dVar.get(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(id.d dVar, int i10, int i11) {
        return (int) (((long) i10) - o(dVar, i10, i11));
    }

    static boolean i(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    static boolean j(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    static boolean k(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double l(id.d dVar, int i10, int i11) {
        if (i11 == 4) {
            return dVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return dVar.getDouble(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(id.d dVar, int i10, int i11) {
        return (int) n(dVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n(id.d dVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = dVar.get(i10);
        } else if (i11 == 2) {
            i12 = dVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return dVar.getLong(i10);
            }
            i12 = dVar.getInt(i10);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(id.d dVar, int i10, int i11) {
        if (i11 == 1) {
            return j.a(dVar.get(i10));
        }
        if (i11 == 2) {
            return j.c(dVar.getShort(i10));
        }
        if (i11 == 4) {
            return j.b(dVar.getInt(i10));
        }
        if (i11 != 8) {
            return -1L;
        }
        return dVar.getLong(i10);
    }

    static int p(int i10, int i11) {
        if (i11 == 0) {
            return (i10 - 1) + 11;
        }
        if (i11 == 2) {
            return (i10 - 1) + 16;
        }
        if (i11 == 3) {
            return (i10 - 1) + 19;
        }
        if (i11 != 4) {
            return 0;
        }
        return (i10 - 1) + 22;
    }

    static int q(int i10) {
        return (i10 - 11) + 1;
    }
}
