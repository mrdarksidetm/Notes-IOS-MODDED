package cf;

import ye.j;

/* JADX INFO: loaded from: classes2.dex */
public class v0 extends ze.a implements bf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bf.a f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f6999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf.a f7000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final df.c f7001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f7003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bf.f f7004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b0 f7005h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7006a;

        public a(String str) {
            this.f7006a = str;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7007a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c1.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7007a = iArr;
        }
    }

    public v0(bf.a aVar, c1 c1Var, cf.a aVar2, ye.f fVar, a aVar3) {
        ae.r.f(aVar, "json");
        ae.r.f(c1Var, "mode");
        ae.r.f(aVar2, "lexer");
        ae.r.f(fVar, "descriptor");
        this.f6998a = aVar;
        this.f6999b = c1Var;
        this.f7000c = aVar2;
        this.f7001d = aVar.a();
        this.f7002e = -1;
        this.f7003f = aVar3;
        bf.f fVarF = aVar.f();
        this.f7004g = fVarF;
        this.f7005h = fVarF.f() ? null : new b0(fVar);
    }

    private final void K() {
        if (this.f7000c.E() != 4) {
            return;
        }
        cf.a.y(this.f7000c, "Unexpected leading comma", 0, null, 6, null);
        throw new md.i();
    }

    private final boolean L(ye.f fVar, int i10) {
        String strF;
        bf.a aVar = this.f6998a;
        ye.f fVarI = fVar.i(i10);
        if (!fVarI.c() && this.f7000c.M(true)) {
            return true;
        }
        if (!ae.r.b(fVarI.e(), j.b.f24010a) || ((fVarI.c() && this.f7000c.M(false)) || (strF = this.f7000c.F(this.f7004g.m())) == null || f0.g(fVarI, aVar, strF) != -3)) {
            return false;
        }
        this.f7000c.q();
        return true;
    }

    private final int M() {
        boolean zL = this.f7000c.L();
        if (!this.f7000c.f()) {
            if (!zL) {
                return -1;
            }
            cf.a.y(this.f7000c, "Unexpected trailing comma", 0, null, 6, null);
            throw new md.i();
        }
        int i10 = this.f7002e;
        if (i10 != -1 && !zL) {
            cf.a.y(this.f7000c, "Expected end of the array or comma", 0, null, 6, null);
            throw new md.i();
        }
        int i11 = i10 + 1;
        this.f7002e = i11;
        return i11;
    }

    private final int N() {
        int i10 = this.f7002e;
        boolean zL = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f7000c.o(':');
        } else if (i10 != -1) {
            zL = this.f7000c.L();
        }
        if (!this.f7000c.f()) {
            if (!zL) {
                return -1;
            }
            cf.a.y(this.f7000c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new md.i();
        }
        if (z10) {
            if (this.f7002e == -1) {
                cf.a aVar = this.f7000c;
                boolean z11 = !zL;
                int i11 = aVar.f6912a;
                if (!z11) {
                    cf.a.y(aVar, "Unexpected trailing comma", i11, null, 4, null);
                    throw new md.i();
                }
            } else {
                cf.a aVar2 = this.f7000c;
                int i12 = aVar2.f6912a;
                if (!zL) {
                    cf.a.y(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new md.i();
                }
            }
        }
        int i13 = this.f7002e + 1;
        this.f7002e = i13;
        return i13;
    }

    private final int O(ye.f fVar) {
        boolean zL;
        boolean zL2 = this.f7000c.L();
        while (this.f7000c.f()) {
            String strP = P();
            this.f7000c.o(':');
            int iG = f0.g(fVar, this.f6998a, strP);
            boolean z10 = false;
            if (iG == -3) {
                z10 = true;
                zL = false;
            } else {
                if (!this.f7004g.d() || !L(fVar, iG)) {
                    b0 b0Var = this.f7005h;
                    if (b0Var != null) {
                        b0Var.c(iG);
                    }
                    return iG;
                }
                zL = this.f7000c.L();
            }
            zL2 = z10 ? Q(strP) : zL;
        }
        if (zL2) {
            cf.a.y(this.f7000c, "Unexpected trailing comma", 0, null, 6, null);
            throw new md.i();
        }
        b0 b0Var2 = this.f7005h;
        if (b0Var2 != null) {
            return b0Var2.d();
        }
        return -1;
    }

    private final String P() {
        return this.f7004g.m() ? this.f7000c.t() : this.f7000c.k();
    }

    private final boolean Q(String str) {
        if (this.f7004g.g() || S(this.f7003f, str)) {
            this.f7000c.H(this.f7004g.m());
        } else {
            this.f7000c.A(str);
        }
        return this.f7000c.L();
    }

    private final void R(ye.f fVar) {
        while (z(fVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !ae.r.b(aVar.f7006a, str)) {
            return false;
        }
        aVar.f7006a = null;
        return true;
    }

    @Override // ze.a, ze.e
    public byte A() {
        long jP = this.f7000c.p();
        byte b10 = (byte) jP;
        if (jP == b10) {
            return b10;
        }
        cf.a.y(this.f7000c, "Failed to parse byte for input '" + jP + '\'', 0, null, 6, null);
        throw new md.i();
    }

    @Override // ze.a, ze.e
    public int B(ye.f fVar) {
        ae.r.f(fVar, "enumDescriptor");
        return f0.i(fVar, this.f6998a, s(), " at path " + this.f7000c.f6913b.a());
    }

    @Override // ze.a, ze.e
    public short C() {
        long jP = this.f7000c.p();
        short s10 = (short) jP;
        if (jP == s10) {
            return s10;
        }
        cf.a.y(this.f7000c, "Failed to parse short for input '" + jP + '\'', 0, null, 6, null);
        throw new md.i();
    }

    @Override // ze.a, ze.e
    public float E() {
        cf.a aVar = this.f7000c;
        String strS = aVar.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (!this.f6998a.f().a()) {
                if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
                    e0.j(this.f7000c, Float.valueOf(f10));
                    throw new md.i();
                }
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            cf.a.y(aVar, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.a, ze.e
    public ze.e F(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return x0.b(fVar) ? new z(this.f7000c, this.f6998a) : super.F(fVar);
    }

    @Override // ze.a, ze.e
    public double H() {
        cf.a aVar = this.f7000c;
        String strS = aVar.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (!this.f6998a.f().a()) {
                if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
                    e0.j(this.f7000c, Double.valueOf(d10));
                    throw new md.i();
                }
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            cf.a.y(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.c
    public df.c a() {
        return this.f7001d;
    }

    @Override // bf.g
    public final bf.a b() {
        return this.f6998a;
    }

    @Override // ze.a, ze.e
    public ze.c c(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        c1 c1VarB = d1.b(this.f6998a, fVar);
        this.f7000c.f6913b.c(fVar);
        this.f7000c.o(c1VarB.f6927a);
        K();
        int i10 = b.f7007a[c1VarB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new v0(this.f6998a, c1VarB, this.f7000c, fVar, this.f7003f) : (this.f6999b == c1VarB && this.f6998a.f().f()) ? this : new v0(this.f6998a, c1VarB, this.f7000c, fVar, this.f7003f);
    }

    @Override // ze.a, ze.c
    public void d(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        if (this.f6998a.f().g() && fVar.f() == 0) {
            R(fVar);
        }
        this.f7000c.o(this.f6999b.f6928b);
        this.f7000c.f6913b.b();
    }

    @Override // ze.a, ze.e
    public boolean h() {
        return this.f7004g.m() ? this.f7000c.i() : this.f7000c.g();
    }

    @Override // ze.a, ze.e
    public char i() {
        String strS = this.f7000c.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        cf.a.y(this.f7000c, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new md.i();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ze.a, ze.c
    public <T> T k(ye.f fVar, int i10, we.a<? extends T> aVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, "deserializer");
        boolean z10 = this.f6999b == c1.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f7000c.f6913b.d();
        }
        T t11 = (T) super.k(fVar, i10, aVar, t10);
        if (z10) {
            this.f7000c.f6913b.f(t11);
        }
        return t11;
    }

    @Override // bf.g
    public bf.h p() {
        return new r0(this.f6998a.f(), this.f7000c).e();
    }

    @Override // ze.a, ze.e
    public int q() {
        long jP = this.f7000c.p();
        int i10 = (int) jP;
        if (jP == i10) {
            return i10;
        }
        cf.a.y(this.f7000c, "Failed to parse int for input '" + jP + '\'', 0, null, 6, null);
        throw new md.i();
    }

    @Override // ze.a, ze.e
    public Void r() {
        return null;
    }

    @Override // ze.a, ze.e
    public String s() {
        return this.f7004g.m() ? this.f7000c.t() : this.f7000c.q();
    }

    @Override // ze.a, ze.e
    public long u() {
        return this.f7000c.p();
    }

    @Override // ze.a, ze.e
    public <T> T v(we.a<? extends T> aVar) {
        ae.r.f(aVar, "deserializer");
        try {
            if ((aVar instanceof af.b) && !this.f6998a.f().l()) {
                String strC = t0.c(aVar.getDescriptor(), this.f6998a);
                String strL = this.f7000c.l(strC, this.f7004g.m());
                we.a<T> aVarC = strL != null ? ((af.b) aVar).c(this, strL) : null;
                if (aVarC == null) {
                    return (T) t0.d(this, aVar);
                }
                this.f7003f = new a(strC);
                return aVarC.deserialize(this);
            }
            return aVar.deserialize(this);
        } catch (we.c e10) {
            String message = e10.getMessage();
            ae.r.c(message);
            if (je.w.L(message, "at path", false, 2, null)) {
                throw e10;
            }
            throw new we.c(e10.a(), e10.getMessage() + " at path: " + this.f7000c.f6913b.a(), e10);
        }
    }

    @Override // ze.a, ze.e
    public boolean w() {
        b0 b0Var = this.f7005h;
        return ((b0Var != null ? b0Var.b() : false) || cf.a.N(this.f7000c, false, 1, null)) ? false : true;
    }

    @Override // ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        int i10 = b.f7007a[this.f6999b.ordinal()];
        int iM = i10 != 2 ? i10 != 4 ? M() : O(fVar) : N();
        if (this.f6999b != c1.MAP) {
            this.f7000c.f6913b.g(iM);
        }
        return iM;
    }
}
