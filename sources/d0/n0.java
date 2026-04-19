package d0;

import com.google.android.gms.common.api.a;
import t0.f3;
import t0.i1;
import t0.p3;
import t0.w2;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements e0.z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f9267i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c1.j<n0, ?> f9268j = c1.k.a(a.f9277a, b.f9278a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i1 f9269a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f9273e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i1 f9270b = w2.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.m f9271c = g0.l.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i1 f9272d = w2.a(a.e.API_PRIORITY_OTHER);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0.z f9274f = e0.a0.a(new f());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p3 f9275g = f3.e(new e());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p3 f9276h = f3.e(new d());

    static final class a extends ae.s implements zd.p<c1.l, n0, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9277a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(c1.l lVar, n0 n0Var) {
            return Integer.valueOf(n0Var.m());
        }
    }

    static final class b extends ae.s implements zd.l<Integer, n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9278a = new b();

        b() {
            super(1);
        }

        public final n0 a(int i10) {
            return new n0(i10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ n0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public final c1.j<n0, ?> a() {
            return n0.f9268j;
        }
    }

    static final class d extends ae.s implements zd.a<Boolean> {
        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(n0.this.m() > 0);
        }
    }

    static final class e extends ae.s implements zd.a<Boolean> {
        e() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(n0.this.m() < n0.this.l());
        }
    }

    static final class f extends ae.s implements zd.l<Float, Float> {
        f() {
            super(1);
        }

        public final Float a(float f10) {
            float fM = n0.this.m() + f10 + n0.this.f9273e;
            float fK = ge.o.k(fM, 0.0f, n0.this.l());
            boolean z10 = !(fM == fK);
            float fM2 = fK - n0.this.m();
            int iD = ce.c.d(fM2);
            n0 n0Var = n0.this;
            n0Var.o(n0Var.m() + iD);
            n0.this.f9273e = fM2 - iD;
            if (z10) {
                f10 = fM2;
            }
            return Float.valueOf(f10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    public n0(int i10) {
        this.f9269a = w2.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int i10) {
        this.f9269a.k(i10);
    }

    @Override // e0.z
    public boolean a() {
        return ((Boolean) this.f9275g.getValue()).booleanValue();
    }

    @Override // e0.z
    public boolean b() {
        return this.f9274f.b();
    }

    @Override // e0.z
    public boolean c() {
        return ((Boolean) this.f9276h.getValue()).booleanValue();
    }

    @Override // e0.z
    public float d(float f10) {
        return this.f9274f.d(f10);
    }

    @Override // e0.z
    public Object e(c0 c0Var, zd.p<? super e0.x, ? super qd.d<? super md.i0>, ? extends Object> pVar, qd.d<? super md.i0> dVar) {
        Object objE = this.f9274f.e(c0Var, pVar, dVar);
        return objE == rd.d.e() ? objE : md.i0.f15558a;
    }

    public final g0.m k() {
        return this.f9271c;
    }

    public final int l() {
        return this.f9272d.e();
    }

    public final int m() {
        return this.f9269a.e();
    }

    public final void n(int i10) {
        this.f9272d.k(i10);
        d1.k kVarC = d1.k.f9368e.c();
        try {
            d1.k kVarL = kVarC.l();
            try {
                if (m() > i10) {
                    o(i10);
                }
                md.i0 i0Var = md.i0.f15558a;
            } finally {
                kVarC.s(kVarL);
            }
        } finally {
            kVarC.d();
        }
    }

    public final void p(int i10) {
        this.f9270b.k(i10);
    }
}
