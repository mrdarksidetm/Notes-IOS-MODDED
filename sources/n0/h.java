package n0;

import ae.s;
import i2.d0;
import t0.k2;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public final class h implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0.i f15656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f15658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0.d f15659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.compose.ui.e f15660f;

    static final class a extends s implements zd.a<r> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return h.this.f15658d.d();
        }
    }

    static final class b extends s implements zd.a<r> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return h.this.f15658d.d();
        }
    }

    static final class c extends s implements zd.a<d0> {
        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return h.this.f15658d.e();
        }
    }

    private h(long j10, o0.i iVar, long j11, j jVar) {
        this.f15655a = j10;
        this.f15656b = iVar;
        this.f15657c = j11;
        this.f15658d = jVar;
        this.f15660f = m0.c.a(i.b(iVar, j10, new a()), iVar);
    }

    public /* synthetic */ h(long j10, o0.i iVar, long j11, j jVar, int i10, ae.j jVar2) {
        this(j10, iVar, j11, (i10 & 8) != 0 ? j.f15673c.a() : jVar, null);
    }

    public /* synthetic */ h(long j10, o0.i iVar, long j11, j jVar, ae.j jVar2) {
        this(j10, iVar, j11, jVar);
    }

    @Override // t0.k2
    public void b() {
        o0.d dVar = this.f15659e;
        if (dVar != null) {
            this.f15656b.b(dVar);
            this.f15659e = null;
        }
    }

    @Override // t0.k2
    public void c() {
        o0.d dVar = this.f15659e;
        if (dVar != null) {
            this.f15656b.b(dVar);
            this.f15659e = null;
        }
    }

    @Override // t0.k2
    public void d() {
        this.f15659e = this.f15656b.d(new o0.c(this.f15655a, new b(), new c()));
    }

    public final void e(n1.f fVar) {
        o0.e eVar = this.f15656b.f().get(Long.valueOf(this.f15655a));
        if (eVar == null) {
            return;
        }
        if (eVar.b()) {
            eVar.a();
            throw null;
        }
        eVar.c();
        throw null;
    }

    public final androidx.compose.ui.e f() {
        return this.f15660f;
    }

    public final void g(r rVar) {
        this.f15658d = j.c(this.f15658d, rVar, null, 2, null);
        this.f15656b.g(this.f15655a);
    }

    public final void h(d0 d0Var) {
        this.f15658d = j.c(this.f15658d, null, d0Var, 1, null);
    }
}
