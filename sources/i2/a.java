package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import j2.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2.d f12288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f12292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CharSequence f12293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<k1.h> f12294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final md.l f12295h;

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0296a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12296a;

        static {
            int[] iArr = new int[u2.h.values().length];
            try {
                iArr[u2.h.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u2.h.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12296a = iArr;
        }
    }

    static final class b extends ae.s implements zd.a<k2.a> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2.a invoke() {
            return new k2.a(a.this.D(), a.this.f12292e.D());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private a(r2.d dVar, int i10, boolean z10, long j10) {
        List<k1.h> listM;
        k1.h hVar;
        float fA;
        float fJ;
        float fV;
        float fB;
        int iJ;
        this.f12288a = dVar;
        this.f12289b = i10;
        this.f12290c = z10;
        this.f12291d = j10;
        if ((w2.b.o(j10) == 0 && w2.b.p(j10) == 0) != true) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if ((i10 >= 1) != true) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        g0 g0VarI = dVar.i();
        boolean zK = i2.b.k(g0VarI, z10);
        CharSequence charSequenceF = dVar.f();
        this.f12293f = zK ? i2.b.i(charSequenceF) : charSequenceF;
        int iL = i2.b.l(g0VarI.B());
        boolean zK2 = u2.i.k(g0VarI.B(), u2.i.f21560b.c());
        int iN = i2.b.n(g0VarI.x().c());
        int iM = i2.b.m(u2.e.e(g0VarI.t()));
        int iO = i2.b.o(u2.e.f(g0VarI.t()));
        int iP = i2.b.p(u2.e.g(g0VarI.t()));
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        r0 r0VarZ = z(iL, zK2 ? 1 : 0, truncateAt, i10, iN, iM, iO, iP);
        if (z10 && r0VarZ.e() > w2.b.m(j10) && i10 > 1 && (iJ = i2.b.j(r0VarZ, w2.b.m(j10))) >= 0 && iJ != i10) {
            r0VarZ = z(iL, zK2 ? 1 : 0, truncateAt, ge.o.d(iJ, 1), iN, iM, iO, iP);
        }
        this.f12292e = r0VarZ;
        E().c(g0VarI.i(), k1.m.a(getWidth(), getHeight()), g0VarI.f());
        for (t2.b bVar : C(this.f12292e)) {
            bVar.c(k1.m.a(getWidth(), getHeight()));
        }
        CharSequence charSequence = this.f12293f;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), l2.j.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                l2.j jVar = (l2.j) obj;
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iP2 = this.f12292e.p(spanStart);
                ?? r10 = iP2 >= this.f12289b;
                ?? r11 = this.f12292e.m(iP2) > 0 && spanEnd > this.f12292e.n(iP2);
                ?? r62 = spanEnd > this.f12292e.o(iP2);
                if (r11 == true || r62 == true || r10 == true) {
                    hVar = null;
                } else {
                    int i11 = C0296a.f12296a[j(spanStart).ordinal()];
                    if (i11 == 1) {
                        fA = A(spanStart, true);
                    } else {
                        if (i11 != 2) {
                            throw new md.q();
                        }
                        fA = A(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fA;
                    r0 r0Var = this.f12292e;
                    switch (jVar.c()) {
                        case 0:
                            fJ = r0Var.j(iP2);
                            fV = fJ - jVar.b();
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 1:
                            fV = r0Var.v(iP2);
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 2:
                            fJ = r0Var.k(iP2);
                            fV = fJ - jVar.b();
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 3:
                            fV = ((r0Var.v(iP2) + r0Var.k(iP2)) - jVar.b()) / 2;
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 4:
                            fB = jVar.a().ascent;
                            fV = fB + r0Var.j(iP2);
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 5:
                            fV = (jVar.a().descent + r0Var.j(iP2)) - jVar.b();
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fV = fB + r0Var.j(iP2);
                            hVar = new k1.h(fA, fV, fD, jVar.b() + fV);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(hVar);
            }
            listM = arrayList;
        } else {
            listM = nd.u.m();
        }
        this.f12294g = listM;
        this.f12295h = md.n.a(md.p.f15571c, new b());
    }

    public /* synthetic */ a(r2.d dVar, int i10, boolean z10, long j10, ae.j jVar) {
        this(dVar, i10, z10, j10);
    }

    private final t2.b[] C(r0 r0Var) {
        if (!(r0Var.D() instanceof Spanned)) {
            return new t2.b[0];
        }
        CharSequence charSequenceD = r0Var.D();
        ae.r.d(charSequenceD, "null cannot be cast to non-null type android.text.Spanned");
        t2.b[] bVarArr = (t2.b[]) ((Spanned) charSequenceD).getSpans(0, r0Var.D().length(), t2.b.class);
        return bVarArr.length == 0 ? new t2.b[0] : bVarArr;
    }

    private final void F(l1.b0 b0Var) {
        Canvas canvasD = l1.c.d(b0Var);
        if (v()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f12292e.G(canvasD);
        if (v()) {
            canvasD.restore();
        }
    }

    private final r0 z(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        return new r0(this.f12293f, getWidth(), E(), i10, truncateAt, this.f12288a.j(), 1.0f, 0.0f, r2.c.b(this.f12288a.i()), true, i12, i14, i15, i16, i13, i11, null, null, this.f12288a.h(), 196736, null);
    }

    public float A(int i10, boolean z10) {
        return z10 ? r0.A(this.f12292e, i10, false, 2, null) : r0.C(this.f12292e, i10, false, 2, null);
    }

    public final float B(int i10) {
        return this.f12292e.j(i10);
    }

    public final Locale D() {
        return this.f12288a.k().getTextLocale();
    }

    public final r2.g E() {
        return this.f12288a.k();
    }

    @Override // i2.m
    public float a() {
        return this.f12288a.a();
    }

    @Override // i2.m
    public void c(long j10, float[] fArr, int i10) {
        this.f12292e.a(e0.j(j10), e0.i(j10), fArr, i10);
    }

    @Override // i2.m
    public u2.h d(int i10) {
        return this.f12292e.y(this.f12292e.p(i10)) == 1 ? u2.h.Ltr : u2.h.Rtl;
    }

    @Override // i2.m
    public float e(int i10) {
        return this.f12292e.v(i10);
    }

    @Override // i2.m
    public float f() {
        return B(q() - 1);
    }

    @Override // i2.m
    public k1.h g(int i10) {
        if (i10 >= 0 && i10 <= this.f12293f.length()) {
            float fA = r0.A(this.f12292e, i10, false, 2, null);
            int iP = this.f12292e.p(i10);
            return new k1.h(fA, this.f12292e.v(iP), fA, this.f12292e.k(iP));
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f12293f.length() + ']').toString());
    }

    @Override // i2.m
    public float getHeight() {
        return this.f12292e.e();
    }

    @Override // i2.m
    public float getWidth() {
        return w2.b.n(this.f12291d);
    }

    @Override // i2.m
    public int h(int i10) {
        return this.f12292e.p(i10);
    }

    @Override // i2.m
    public float i() {
        return B(0);
    }

    @Override // i2.m
    public u2.h j(int i10) {
        return this.f12292e.F(i10) ? u2.h.Rtl : u2.h.Ltr;
    }

    @Override // i2.m
    public float k(int i10) {
        return this.f12292e.k(i10);
    }

    @Override // i2.m
    public int l(long j10) {
        return this.f12292e.x(this.f12292e.q((int) k1.f.p(j10)), k1.f.o(j10));
    }

    @Override // i2.m
    public k1.h m(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12293f.length()) {
            z10 = true;
        }
        if (z10) {
            RectF rectFB = this.f12292e.b(i10);
            return new k1.h(rectFB.left, rectFB.top, rectFB.right, rectFB.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f12293f.length() + ')').toString());
    }

    @Override // i2.m
    public List<k1.h> n() {
        return this.f12294g;
    }

    @Override // i2.m
    public int o(int i10) {
        return this.f12292e.u(i10);
    }

    @Override // i2.m
    public int p(int i10, boolean z10) {
        return z10 ? this.f12292e.w(i10) : this.f12292e.o(i10);
    }

    @Override // i2.m
    public int q() {
        return this.f12292e.l();
    }

    @Override // i2.m
    public float r(int i10) {
        return this.f12292e.t(i10);
    }

    @Override // i2.m
    public void s(l1.b0 b0Var, l1.z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        int iA = E().a();
        r2.g gVarE = E();
        gVarE.c(zVar, k1.m.a(getWidth(), getHeight()), f10);
        gVarE.f(s1Var);
        gVarE.g(jVar);
        gVarE.e(gVar);
        gVarE.b(i10);
        F(b0Var);
        E().b(iA);
    }

    @Override // i2.m
    public void t(l1.b0 b0Var, long j10, s1 s1Var, u2.j jVar, n1.g gVar, int i10) {
        int iA = E().a();
        r2.g gVarE = E();
        gVarE.d(j10);
        gVarE.f(s1Var);
        gVarE.g(jVar);
        gVarE.e(gVar);
        gVarE.b(i10);
        F(b0Var);
        E().b(iA);
    }

    @Override // i2.m
    public boolean v() {
        return this.f12292e.c();
    }

    @Override // i2.m
    public int w(float f10) {
        return this.f12292e.q((int) f10);
    }

    @Override // i2.m
    public float x(int i10) {
        return this.f12292e.s(i10);
    }
}
