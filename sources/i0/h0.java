package i0;

import j0.b0;
import j0.l0;
import java.util.List;
import t0.f3;
import t0.i1;
import t0.k1;
import t0.k3;
import t0.w2;
import y1.v0;
import y1.w0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements e0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f12100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1<w> f12101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.m f12102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1 f12104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w2.d f12105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0.z f12107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0.d<b0.a> f12111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f12112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v0 f12113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w0 f12114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final j0.a f12115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k1 f12116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f12117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final j0.i f12118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i0.e f12119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final j0.a0 f12120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final k1<md.i0> f12121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k1 f12122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final k1 f12123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final j0.b0 f12124y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f12099z = new c(null);
    private static final c1.j<h0, ?> A = c1.a.a(a.f12125a, b.f12126a);

    static final class a extends ae.s implements zd.p<c1.l, h0, List<? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12125a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(c1.l lVar, h0 h0Var) {
            return nd.u.p(Integer.valueOf(h0Var.m()), Integer.valueOf(h0Var.n()));
        }
    }

    static final class b extends ae.s implements zd.l<List<? extends Integer>, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12126a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(List<Integer> list) {
            return new h0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public final c1.j<h0, ?> a() {
            return h0.A;
        }
    }

    static final class d extends ae.s implements zd.l<Integer, List<? extends md.s<? extends Integer, ? extends w2.b>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f12127a = new d();

        d() {
            super(1);
        }

        public final List<md.s<Integer, w2.b>> a(int i10) {
            return nd.u.m();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ List<? extends md.s<? extends Integer, ? extends w2.b>> invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final class e implements w0 {
        e() {
        }

        @Override // y1.w0
        public void t(v0 v0Var) {
            h0.this.I(v0Var);
        }
    }

    @sd.d(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {289, 290}, m = "scroll")
    static final class f extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f12131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f12132d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12134f;

        f(qd.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12132d = obj;
            this.f12134f |= Integer.MIN_VALUE;
            return h0.this.e(null, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    static final class g extends sd.j implements zd.p<e0.x, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12135a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, qd.d<? super g> dVar) {
            super(2, dVar);
            this.f12137c = i10;
            this.f12138d = i11;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0.x xVar, qd.d<? super md.i0> dVar) {
            return ((g) create(xVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return h0.this.new g(this.f12137c, this.f12138d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f12135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            h0.this.L(this.f12137c, this.f12138d);
            return md.i0.f15558a;
        }
    }

    static final class h extends ae.s implements zd.l<Float, Float> {
        h() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-h0.this.B(-f10));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public h0(int i10, int i11) {
        c0 c0Var = new c0(i10, i11);
        this.f12100a = c0Var;
        this.f12101b = f3.i(i0.f12144a, f3.k());
        this.f12102c = g0.l.a();
        this.f12104e = w2.a(0);
        this.f12105f = w2.f.a(1.0f, 1.0f);
        this.f12106g = true;
        this.f12107h = e0.a0.a(new h());
        this.f12109j = true;
        this.f12110k = -1;
        this.f12111l = new v0.d<>(new b0.a[16], 0);
        this.f12114o = new e();
        this.f12115p = new j0.a();
        this.f12116q = k3.e(d.f12127a, null, 2, null);
        this.f12117r = new l();
        this.f12118s = new j0.i();
        this.f12119t = new i0.e(this);
        this.f12120u = new j0.a0();
        c0Var.b();
        this.f12121v = l0.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f12122w = k3.e(bool, null, 2, null);
        this.f12123x = k3.e(bool, null, 2, null);
        this.f12124y = new j0.b0();
    }

    public /* synthetic */ h0(int i10, int i11, int i12, ae.j jVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    static /* synthetic */ void A(h0 h0Var, float f10, u uVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uVar = h0Var.f12101b.getValue();
        }
        h0Var.z(f10, uVar);
    }

    public static /* synthetic */ Object D(h0 h0Var, int i10, int i11, qd.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return h0Var.C(i10, i11, dVar);
    }

    private void E(boolean z10) {
        this.f12123x.setValue(Boolean.valueOf(z10));
    }

    private void F(boolean z10) {
        this.f12122w.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void i(h0 h0Var, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        h0Var.h(wVar, z10);
    }

    private final void j(u uVar) {
        int iB;
        if (this.f12110k == -1 || !(!uVar.c().isEmpty())) {
            return;
        }
        boolean z10 = this.f12112m;
        List<k> listC = uVar.c();
        if (z10) {
            k kVar = (k) nd.c0.j0(listC);
            iB = (this.f12106g ? kVar.b() : kVar.a()) + 1;
        } else {
            k kVar2 = (k) nd.c0.Y(listC);
            iB = (this.f12106g ? kVar2.b() : kVar2.a()) - 1;
        }
        if (this.f12110k != iB) {
            this.f12110k = -1;
            v0.d<b0.a> dVar = this.f12111l;
            int iO = dVar.o();
            if (iO > 0) {
                int i10 = 0;
                b0.a[] aVarArrN = dVar.n();
                do {
                    aVarArrN[i10].cancel();
                    i10++;
                } while (i10 < iO);
            }
            this.f12111l.i();
        }
    }

    private final void z(float f10, u uVar) {
        int iB;
        int index;
        v0.d<b0.a> dVar;
        int iO;
        j0.b0 b0Var = this.f12124y;
        if (this.f12109j && (!uVar.c().isEmpty())) {
            boolean z10 = f10 < 0.0f;
            if (z10) {
                k kVar = (k) nd.c0.j0(uVar.c());
                iB = (this.f12106g ? kVar.b() : kVar.a()) + 1;
                index = ((k) nd.c0.j0(uVar.c())).getIndex() + 1;
            } else {
                k kVar2 = (k) nd.c0.Y(uVar.c());
                iB = (this.f12106g ? kVar2.b() : kVar2.a()) - 1;
                index = ((k) nd.c0.Y(uVar.c())).getIndex() - 1;
            }
            if (iB != this.f12110k) {
                if (index >= 0 && index < uVar.b()) {
                    if (this.f12112m != z10 && (iO = (dVar = this.f12111l).o()) > 0) {
                        b0.a[] aVarArrN = dVar.n();
                        int i10 = 0;
                        do {
                            aVarArrN[i10].cancel();
                            i10++;
                        } while (i10 < iO);
                    }
                    this.f12112m = z10;
                    this.f12110k = iB;
                    this.f12111l.i();
                    List<md.s<Integer, w2.b>> listInvoke = u().invoke(Integer.valueOf(iB));
                    int size = listInvoke.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        md.s<Integer, w2.b> sVar = listInvoke.get(i11);
                        this.f12111l.b(b0Var.a(sVar.c().intValue(), sVar.d().t()));
                    }
                }
            }
        }
    }

    public final float B(float f10) {
        if ((f10 < 0.0f && !a()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f12103d) <= 0.5f)) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f12103d).toString());
        }
        float f11 = this.f12103d + f10;
        this.f12103d = f11;
        if (Math.abs(f11) > 0.5f) {
            w value = this.f12101b.getValue();
            float f12 = this.f12103d;
            if (value.m(ce.c.d(f12))) {
                h(value, true);
                l0.d(this.f12121v);
                z(f12 - this.f12103d, value);
            } else {
                v0 v0Var = this.f12113n;
                if (v0Var != null) {
                    v0Var.l();
                }
                A(this, f12 - this.f12103d, null, 2, null);
            }
        }
        if (Math.abs(this.f12103d) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f12103d;
        this.f12103d = 0.0f;
        return f13;
    }

    public final Object C(int i10, int i11, qd.d<? super md.i0> dVar) {
        Object objF = e0.z.f(this, null, new g(i10, i11, null), dVar, 1, null);
        return objF == rd.d.e() ? objF : md.i0.f15558a;
    }

    public final void G(w2.d dVar) {
        this.f12105f = dVar;
    }

    public final void H(zd.l<? super Integer, ? extends List<md.s<Integer, w2.b>>> lVar) {
        this.f12116q.setValue(lVar);
    }

    public final void I(v0 v0Var) {
        this.f12113n = v0Var;
    }

    public final void J(int i10) {
        this.f12104e.k(i10);
    }

    public final void K(boolean z10) {
        this.f12106g = z10;
    }

    public final void L(int i10, int i11) {
        this.f12100a.d(i10, i11);
        this.f12117r.g();
        v0 v0Var = this.f12113n;
        if (v0Var != null) {
            v0Var.l();
        }
    }

    public final int M(n nVar, int i10) {
        return this.f12100a.j(nVar, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e0.z
    public boolean a() {
        return ((Boolean) this.f12122w.getValue()).booleanValue();
    }

    @Override // e0.z
    public boolean b() {
        return this.f12107h.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e0.z
    public boolean c() {
        return ((Boolean) this.f12123x.getValue()).booleanValue();
    }

    @Override // e0.z
    public float d(float f10) {
        return this.f12107h.d(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(d0.c0 r6, zd.p<? super e0.x, ? super qd.d<? super md.i0>, ? extends java.lang.Object> r7, qd.d<? super md.i0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i0.h0.f
            if (r0 == 0) goto L13
            r0 = r8
            i0.h0$f r0 = (i0.h0.f) r0
            int r1 = r0.f12134f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12134f = r1
            goto L18
        L13:
            i0.h0$f r0 = new i0.h0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12132d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f12134f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            md.u.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f12131c
            r7 = r6
            zd.p r7 = (zd.p) r7
            java.lang.Object r6 = r0.f12130b
            d0.c0 r6 = (d0.c0) r6
            java.lang.Object r2 = r0.f12129a
            i0.h0 r2 = (i0.h0) r2
            md.u.b(r8)
            goto L5a
        L45:
            md.u.b(r8)
            j0.a r8 = r5.f12115p
            r0.f12129a = r5
            r0.f12130b = r6
            r0.f12131c = r7
            r0.f12134f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            e0.z r8 = r2.f12107h
            r2 = 0
            r0.f12129a = r2
            r0.f12130b = r2
            r0.f12131c = r2
            r0.f12134f = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            md.i0 r6 = md.i0.f15558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h0.e(d0.c0, zd.p, qd.d):java.lang.Object");
    }

    public final void h(w wVar, boolean z10) {
        this.f12103d -= wVar.g();
        this.f12101b.setValue(wVar);
        if (z10) {
            this.f12100a.i(wVar.i());
        } else {
            this.f12100a.h(wVar);
            j(wVar);
        }
        E(wVar.e());
        F(wVar.f());
        this.f12108i++;
    }

    public final j0.a k() {
        return this.f12115p;
    }

    public final j0.i l() {
        return this.f12118s;
    }

    public final int m() {
        return this.f12100a.a();
    }

    public final int n() {
        return this.f12100a.c();
    }

    public final g0.m o() {
        return this.f12102c;
    }

    public final u p() {
        return this.f12101b.getValue();
    }

    public final ge.i q() {
        return this.f12100a.b().getValue();
    }

    public final j0.a0 r() {
        return this.f12120u;
    }

    public final l s() {
        return this.f12117r;
    }

    public final k1<md.i0> t() {
        return this.f12121v;
    }

    public final zd.l<Integer, List<md.s<Integer, w2.b>>> u() {
        return (zd.l) this.f12116q.getValue();
    }

    public final j0.b0 v() {
        return this.f12124y;
    }

    public final v0 w() {
        return this.f12113n;
    }

    public final w0 x() {
        return this.f12114o;
    }

    public final float y() {
        return this.f12103d;
    }
}
