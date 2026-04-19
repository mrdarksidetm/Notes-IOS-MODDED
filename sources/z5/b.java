package z5;

import ae.m;
import ae.r;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j6.h;
import j6.q;
import l1.k0;
import le.d1;
import le.k;
import le.n0;
import le.o0;
import le.w2;
import md.i0;
import md.u;
import oe.h0;
import oe.s;
import t0.f3;
import t0.k1;
import t0.k2;
import t0.k3;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o1.c implements k2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0494b f24176v = new C0494b(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final l<c, c> f24177w = a.f24193a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n0 f24178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s<k1.l> f24179h = h0.a(k1.l.c(k1.l.f14359b.b()));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f24180i = k3.e(null, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k1 f24181j = k3.e(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k1 f24182k = k3.e(null, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f24183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o1.c f24184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super c, ? extends c> f24185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l<? super c, i0> f24186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y1.f f24187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final k1 f24190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final k1 f24191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k1 f24192u;

    static final class a extends ae.s implements l<c, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24193a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(c cVar) {
            return cVar;
        }
    }

    /* JADX INFO: renamed from: z5.b$b, reason: collision with other inner class name */
    public static final class C0494b {
        private C0494b() {
        }

        public /* synthetic */ C0494b(ae.j jVar) {
            this();
        }

        public final l<c, c> a() {
            return b.f24177w;
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24194a = new a();

            private a() {
                super(null);
            }

            @Override // z5.b.c
            public o1.c a() {
                return null;
            }
        }

        /* JADX INFO: renamed from: z5.b$c$b, reason: collision with other inner class name */
        public static final class C0495b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final o1.c f24195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final j6.f f24196b;

            public C0495b(o1.c cVar, j6.f fVar) {
                super(null);
                this.f24195a = cVar;
                this.f24196b = fVar;
            }

            public static /* synthetic */ C0495b c(C0495b c0495b, o1.c cVar, j6.f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = c0495b.f24195a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0495b.f24196b;
                }
                return c0495b.b(cVar, fVar);
            }

            @Override // z5.b.c
            public o1.c a() {
                return this.f24195a;
            }

            public final C0495b b(o1.c cVar, j6.f fVar) {
                return new C0495b(cVar, fVar);
            }

            public final j6.f d() {
                return this.f24196b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0495b)) {
                    return false;
                }
                C0495b c0495b = (C0495b) obj;
                return r.b(this.f24195a, c0495b.f24195a) && r.b(this.f24196b, c0495b.f24196b);
            }

            public int hashCode() {
                o1.c cVar = this.f24195a;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f24196b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f24195a + ", result=" + this.f24196b + ')';
            }
        }

        /* JADX INFO: renamed from: z5.b$c$c, reason: collision with other inner class name */
        public static final class C0496c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final o1.c f24197a;

            public C0496c(o1.c cVar) {
                super(null);
                this.f24197a = cVar;
            }

            @Override // z5.b.c
            public o1.c a() {
                return this.f24197a;
            }

            public final C0496c b(o1.c cVar) {
                return new C0496c(cVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0496c) && r.b(this.f24197a, ((C0496c) obj).f24197a);
            }

            public int hashCode() {
                o1.c cVar = this.f24197a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f24197a + ')';
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final o1.c f24198a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final q f24199b;

            public d(o1.c cVar, q qVar) {
                super(null);
                this.f24198a = cVar;
                this.f24199b = qVar;
            }

            @Override // z5.b.c
            public o1.c a() {
                return this.f24198a;
            }

            public final q b() {
                return this.f24199b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return r.b(this.f24198a, dVar.f24198a) && r.b(this.f24199b, dVar.f24199b);
            }

            public int hashCode() {
                return (this.f24198a.hashCode() * 31) + this.f24199b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f24198a + ", result=" + this.f24199b + ')';
            }
        }

        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public abstract o1.c a();
    }

    @sd.d(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {243}, m = "invokeSuspend")
    static final class d extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24200a;

        static final class a extends ae.s implements zd.a<j6.h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f24202a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f24202a = bVar;
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j6.h invoke() {
                return this.f24202a.y();
            }
        }

        /* JADX INFO: renamed from: z5.b$d$b, reason: collision with other inner class name */
        @sd.d(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {242}, m = "invokeSuspend")
        static final class C0497b extends sd.j implements p<j6.h, qd.d<? super c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f24203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f24204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f24205c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0497b(b bVar, qd.d<? super C0497b> dVar) {
                super(2, dVar);
                this.f24205c = bVar;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j6.h hVar, qd.d<? super c> dVar) {
                return ((C0497b) create(hVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new C0497b(this.f24205c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                b bVar;
                Object objE = rd.d.e();
                int i10 = this.f24204b;
                if (i10 == 0) {
                    u.b(obj);
                    b bVar2 = this.f24205c;
                    x5.e eVarW = bVar2.w();
                    b bVar3 = this.f24205c;
                    j6.h hVarP = bVar3.P(bVar3.y());
                    this.f24203a = bVar2;
                    this.f24204b = 1;
                    Object objA = eVarW.a(hVarP, this);
                    if (objA == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) this.f24203a;
                    u.b(obj);
                }
                return bVar.O((j6.i) obj);
            }
        }

        /* synthetic */ class c implements oe.f, m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f24206a;

            c(b bVar) {
                this.f24206a = bVar;
            }

            @Override // ae.m
            public final md.g<?> a() {
                return new ae.a(2, this.f24206a, b.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            @Override // oe.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object b(c cVar, qd.d<? super i0> dVar) {
                Object objC = d.c(this.f24206a, cVar, dVar);
                return objC == rd.d.e() ? objC : i0.f15558a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof oe.f) && (obj instanceof m)) {
                    return r.b(a(), ((m) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        d(qd.d<? super d> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object c(b bVar, c cVar, qd.d dVar) {
            bVar.Q(cVar);
            return i0.f15558a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f24200a;
            if (i10 == 0) {
                u.b(obj);
                oe.e eVarR = oe.g.r(f3.p(new a(b.this)), new C0497b(b.this, null));
                c cVar = new c(b.this);
                this.f24200a = 1;
                if (eVarR.a(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public static final class e implements l6.a {
        public e() {
        }

        @Override // l6.a
        public void a(Drawable drawable) {
        }

        @Override // l6.a
        public void b(Drawable drawable) {
        }

        @Override // l6.a
        public void c(Drawable drawable) {
            b.this.Q(new c.C0496c(drawable != null ? b.this.N(drawable) : null));
        }
    }

    static final class f implements k6.j {

        public static final class a implements oe.e<k6.i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f24209a;

            /* JADX INFO: renamed from: z5.b$f$a$a, reason: collision with other inner class name */
            public static final class C0498a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f24210a;

                /* JADX INFO: renamed from: z5.b$f$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                public static final class C0499a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f24211a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f24212b;

                    public C0499a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f24211a = obj;
                        this.f24212b |= Integer.MIN_VALUE;
                        return C0498a.this.b(null, this);
                    }
                }

                public C0498a(oe.f fVar) {
                    this.f24210a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r7, qd.d r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof z5.b.f.a.C0498a.C0499a
                        if (r0 == 0) goto L13
                        r0 = r8
                        z5.b$f$a$a$a r0 = (z5.b.f.a.C0498a.C0499a) r0
                        int r1 = r0.f24212b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f24212b = r1
                        goto L18
                    L13:
                        z5.b$f$a$a$a r0 = new z5.b$f$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f24211a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f24212b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        md.u.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        md.u.b(r8)
                        oe.f r8 = r6.f24210a
                        k1.l r7 = (k1.l) r7
                        long r4 = r7.m()
                        k6.i r7 = z5.c.b(r4)
                        if (r7 == 0) goto L4b
                        r0.f24212b = r3
                        java.lang.Object r7 = r8.b(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        md.i0 r7 = md.i0.f15558a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: z5.b.f.a.C0498a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public a(oe.e eVar) {
                this.f24209a = eVar;
            }

            @Override // oe.e
            public Object a(oe.f<? super k6.i> fVar, qd.d dVar) {
                Object objA = this.f24209a.a(new C0498a(fVar), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        f() {
        }

        @Override // k6.j
        public final Object c(qd.d<? super k6.i> dVar) {
            return oe.g.l(new a(b.this.f24179h), dVar);
        }
    }

    public b(j6.h hVar, x5.e eVar) {
        c.a aVar = c.a.f24194a;
        this.f24183l = aVar;
        this.f24185n = f24177w;
        this.f24187p = y1.f.f23237a.b();
        this.f24188q = n1.f.S.b();
        this.f24190s = k3.e(aVar, null, 2, null);
        this.f24191t = k3.e(hVar, null, 2, null);
        this.f24192u = k3.e(eVar, null, 2, null);
    }

    private final void A(float f10) {
        this.f24181j.setValue(Float.valueOf(f10));
    }

    private final void B(k0 k0Var) {
        this.f24182k.setValue(k0Var);
    }

    private final void G(o1.c cVar) {
        this.f24180i.setValue(cVar);
    }

    private final void J(c cVar) {
        this.f24190s.setValue(cVar);
    }

    private final void L(o1.c cVar) {
        this.f24184m = cVar;
        G(cVar);
    }

    private final void M(c cVar) {
        this.f24183l = cVar;
        J(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o1.c N(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? o1.b.b(l1.g.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f24188q, 6, null) : new t7.a(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c O(j6.i iVar) {
        if (iVar instanceof q) {
            q qVar = (q) iVar;
            return new c.d(N(qVar.a()), qVar);
        }
        if (!(iVar instanceof j6.f)) {
            throw new md.q();
        }
        Drawable drawableA = iVar.a();
        return new c.C0495b(drawableA != null ? N(drawableA) : null, (j6.f) iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j6.h P(j6.h hVar) {
        h.a aVarM = j6.h.R(hVar, null, 1, null).m(new e());
        if (hVar.q().m() == null) {
            aVarM.l(new f());
        }
        if (hVar.q().l() == null) {
            aVarM.k(j.g(this.f24187p));
        }
        if (hVar.q().k() != k6.e.EXACT) {
            aVarM.e(k6.e.INEXACT);
        }
        return aVarM.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(c cVar) {
        c cVar2 = this.f24183l;
        c cVarInvoke = this.f24185n.invoke(cVar);
        M(cVarInvoke);
        o1.c cVarZ = z(cVar2, cVarInvoke);
        if (cVarZ == null) {
            cVarZ = cVarInvoke.a();
        }
        L(cVarZ);
        if (this.f24178g != null && cVar2.a() != cVarInvoke.a()) {
            Object objA = cVar2.a();
            k2 k2Var = objA instanceof k2 ? (k2) objA : null;
            if (k2Var != null) {
                k2Var.c();
            }
            Object objA2 = cVarInvoke.a();
            k2 k2Var2 = objA2 instanceof k2 ? (k2) objA2 : null;
            if (k2Var2 != null) {
                k2Var2.d();
            }
        }
        l<? super c, i0> lVar = this.f24186o;
        if (lVar != null) {
            lVar.invoke(cVarInvoke);
        }
    }

    private final void t() {
        n0 n0Var = this.f24178g;
        if (n0Var != null) {
            o0.d(n0Var, null, 1, null);
        }
        this.f24178g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float u() {
        return ((Number) this.f24181j.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k0 v() {
        return (k0) this.f24182k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final o1.c x() {
        return (o1.c) this.f24180i.getValue();
    }

    private final z5.f z(c cVar, c cVar2) {
        j6.i iVarD;
        if (!(cVar2 instanceof c.d)) {
            if (cVar2 instanceof c.C0495b) {
                iVarD = ((c.C0495b) cVar2).d();
            }
            return null;
        }
        iVarD = ((c.d) cVar2).b();
        n6.c cVarA = iVarD.b().P().a(z5.c.f24214a, iVarD);
        if (cVarA instanceof n6.a) {
            n6.a aVar = (n6.a) cVarA;
            return new z5.f(cVar instanceof c.C0496c ? cVar.a() : null, cVar2.a(), this.f24187p, aVar.b(), ((iVarD instanceof q) && ((q) iVarD).d()) ? false : true, aVar.c());
        }
        return null;
    }

    public final void C(y1.f fVar) {
        this.f24187p = fVar;
    }

    public final void D(int i10) {
        this.f24188q = i10;
    }

    public final void E(x5.e eVar) {
        this.f24192u.setValue(eVar);
    }

    public final void F(l<? super c, i0> lVar) {
        this.f24186o = lVar;
    }

    public final void H(boolean z10) {
        this.f24189r = z10;
    }

    public final void I(j6.h hVar) {
        this.f24191t.setValue(hVar);
    }

    public final void K(l<? super c, ? extends c> lVar) {
        this.f24185n = lVar;
    }

    @Override // o1.c
    protected boolean a(float f10) {
        A(f10);
        return true;
    }

    @Override // t0.k2
    public void b() {
        t();
        Object obj = this.f24184m;
        k2 k2Var = obj instanceof k2 ? (k2) obj : null;
        if (k2Var != null) {
            k2Var.b();
        }
    }

    @Override // t0.k2
    public void c() {
        t();
        Object obj = this.f24184m;
        k2 k2Var = obj instanceof k2 ? (k2) obj : null;
        if (k2Var != null) {
            k2Var.c();
        }
    }

    @Override // t0.k2
    public void d() {
        if (this.f24178g != null) {
            return;
        }
        n0 n0VarA = o0.a(w2.b(null, 1, null).plus(d1.c().m0()));
        this.f24178g = n0VarA;
        Object obj = this.f24184m;
        k2 k2Var = obj instanceof k2 ? (k2) obj : null;
        if (k2Var != null) {
            k2Var.d();
        }
        if (!this.f24189r) {
            k.d(n0VarA, null, null, new d(null), 3, null);
        } else {
            Drawable drawableF = j6.h.R(y(), null, 1, null).d(w().c()).a().F();
            Q(new c.C0496c(drawableF != null ? N(drawableF) : null));
        }
    }

    @Override // o1.c
    protected boolean e(k0 k0Var) {
        B(k0Var);
        return true;
    }

    @Override // o1.c
    public long k() {
        o1.c cVarX = x();
        return cVarX != null ? cVarX.k() : k1.l.f14359b.a();
    }

    @Override // o1.c
    protected void m(n1.f fVar) {
        this.f24179h.setValue(k1.l.c(fVar.c()));
        o1.c cVarX = x();
        if (cVarX != null) {
            cVarX.j(fVar, fVar.c(), u(), v());
        }
    }

    public final x5.e w() {
        return (x5.e) this.f24192u.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j6.h y() {
        return (j6.h) this.f24191t.getValue();
    }
}
