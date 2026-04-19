package cf;

import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
abstract class c extends af.r0 implements bf.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bf.a f6919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bf.h f6920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final bf.f f6921e;

    private c(bf.a aVar, bf.h hVar) {
        this.f6919c = aVar;
        this.f6920d = hVar;
        this.f6921e = b().f();
    }

    public /* synthetic */ c(bf.a aVar, bf.h hVar, ae.j jVar) {
        this(aVar, hVar);
    }

    private final bf.o d0(bf.w wVar, String str) {
        bf.o oVar = wVar instanceof bf.o ? (bf.o) wVar : null;
        if (oVar != null) {
            return oVar;
        }
        throw e0.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final bf.h f0() {
        bf.h hVarE0;
        String strU = U();
        return (strU == null || (hVarE0 = e0(strU)) == null) ? s0() : hVarE0;
    }

    private final Void t0(String str) {
        throw e0.f(-1, "Failed to parse '" + str + '\'', f0().toString());
    }

    @Override // af.o1, ze.e
    public ze.e F(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return U() != null ? super.F(fVar) : new h0(b(), s0()).F(fVar);
    }

    @Override // af.r0
    protected String Z(String str, String str2) {
        ae.r.f(str, "parentName");
        ae.r.f(str2, "childName");
        return str2;
    }

    @Override // ze.c
    public df.c a() {
        return b().a();
    }

    @Override // bf.g
    public bf.a b() {
        return this.f6919c;
    }

    @Override // ze.e
    public ze.c c(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        bf.h hVarF0 = f0();
        ye.j jVarE = fVar.e();
        if (ae.r.b(jVarE, k.b.f24012a) ? true : jVarE instanceof ye.d) {
            bf.a aVarB = b();
            if (hVarF0 instanceof bf.b) {
                return new n0(aVarB, (bf.b) hVarF0);
            }
            throw e0.e(-1, "Expected " + ae.i0.b(bf.b.class) + " as the serialized body of " + fVar.a() + ", but had " + ae.i0.b(hVarF0.getClass()));
        }
        if (!ae.r.b(jVarE, k.c.f24013a)) {
            bf.a aVarB2 = b();
            if (hVarF0 instanceof bf.u) {
                return new l0(aVarB2, (bf.u) hVarF0, null, null, 12, null);
            }
            throw e0.e(-1, "Expected " + ae.i0.b(bf.u.class) + " as the serialized body of " + fVar.a() + ", but had " + ae.i0.b(hVarF0.getClass()));
        }
        bf.a aVarB3 = b();
        ye.f fVarA = d1.a(fVar.i(0), aVarB3.a());
        ye.j jVarE2 = fVarA.e();
        if ((jVarE2 instanceof ye.e) || ae.r.b(jVarE2, j.b.f24010a)) {
            bf.a aVarB4 = b();
            if (hVarF0 instanceof bf.u) {
                return new p0(aVarB4, (bf.u) hVarF0);
            }
            throw e0.e(-1, "Expected " + ae.i0.b(bf.u.class) + " as the serialized body of " + fVar.a() + ", but had " + ae.i0.b(hVarF0.getClass()));
        }
        if (!aVarB3.f().b()) {
            throw e0.d(fVarA);
        }
        bf.a aVarB5 = b();
        if (hVarF0 instanceof bf.b) {
            return new n0(aVarB5, (bf.b) hVarF0);
        }
        throw e0.e(-1, "Expected " + ae.i0.b(bf.b.class) + " as the serialized body of " + fVar.a() + ", but had " + ae.i0.b(hVarF0.getClass()));
    }

    @Override // ze.c
    public void d(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
    }

    protected abstract bf.h e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String str) {
        ae.r.f(str, "tag");
        bf.w wVarR0 = r0(str);
        if (!b().f().m() && d0(wVarR0, "boolean").d()) {
            throw e0.f(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean boolE = bf.i.e(wVarR0);
            if (boolE != null) {
                return boolE.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String str) {
        ae.r.f(str, "tag");
        try {
            int iK = bf.i.k(r0(str));
            boolean z10 = false;
            if (-128 <= iK && iK <= 127) {
                z10 = true;
            }
            Byte bValueOf = z10 ? Byte.valueOf((byte) iK) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            t0("byte");
            throw new md.i();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String str) {
        ae.r.f(str, "tag");
        try {
            return je.y.b1(r0(str).a());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String str) {
        ae.r.f(str, "tag");
        try {
            double dG = bf.i.g(r0(str));
            if (!b().f().a()) {
                if (!((Double.isInfinite(dG) || Double.isNaN(dG)) ? false : true)) {
                    throw e0.a(Double.valueOf(dG), str, f0().toString());
                }
            }
            return dG;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String str, ye.f fVar) {
        ae.r.f(str, "tag");
        ae.r.f(fVar, "enumDescriptor");
        return f0.j(fVar, b(), r0(str).a(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String str) {
        ae.r.f(str, "tag");
        try {
            float fI = bf.i.i(r0(str));
            if (!b().f().a()) {
                if (!((Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true)) {
                    throw e0.a(Float.valueOf(fI), str, f0().toString());
                }
            }
            return fI;
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ze.e P(String str, ye.f fVar) {
        ae.r.f(str, "tag");
        ae.r.f(fVar, "inlineDescriptor");
        return x0.b(fVar) ? new z(new y0(r0(str).a()), b()) : super.P(str, fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String str) {
        ae.r.f(str, "tag");
        try {
            return bf.i.k(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String str) {
        ae.r.f(str, "tag");
        try {
            return bf.i.q(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new md.i();
        }
    }

    @Override // bf.g
    public bf.h p() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String str) {
        ae.r.f(str, "tag");
        try {
            int iK = bf.i.k(r0(str));
            boolean z10 = false;
            if (-32768 <= iK && iK <= 32767) {
                z10 = true;
            }
            Short shValueOf = z10 ? Short.valueOf((short) iK) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            t0("short");
            throw new md.i();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new md.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String str) {
        ae.r.f(str, "tag");
        bf.w wVarR0 = r0(str);
        if (b().f().m() || d0(wVarR0, "string").d()) {
            if (wVarR0 instanceof bf.s) {
                throw e0.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return wVarR0.a();
        }
        throw e0.f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
    }

    protected final bf.w r0(String str) {
        ae.r.f(str, "tag");
        bf.h hVarE0 = e0(str);
        bf.w wVar = hVarE0 instanceof bf.w ? (bf.w) hVarE0 : null;
        if (wVar != null) {
            return wVar;
        }
        throw e0.f(-1, "Expected JsonPrimitive at " + str + ", found " + hVarE0, f0().toString());
    }

    public abstract bf.h s0();

    @Override // af.o1, ze.e
    public <T> T v(we.a<? extends T> aVar) {
        ae.r.f(aVar, "deserializer");
        return (T) t0.d(this, aVar);
    }

    @Override // af.o1, ze.e
    public boolean w() {
        return !(f0() instanceof bf.s);
    }
}
