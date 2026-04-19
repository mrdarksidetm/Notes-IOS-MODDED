package v1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z.m<a> f21899a = new z.m<>(0, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f21901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21903d;

        private a(long j10, long j11, boolean z10, int i10) {
            this.f21900a = j10;
            this.f21901b = j11;
            this.f21902c = z10;
            this.f21903d = i10;
        }

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, ae.j jVar) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f21902c;
        }

        public final long b() {
            return this.f21901b;
        }

        public final long c() {
            return this.f21900a;
        }
    }

    public final void a() {
        this.f21899a.b();
    }

    public final h b(d0 d0Var, n0 n0Var) {
        long jK;
        boolean zA;
        long jV;
        z.m mVar = new z.m(d0Var.b().size());
        List<e0> listB = d0Var.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = listB.get(i10);
            a aVarE = this.f21899a.e(e0Var.c());
            if (aVarE == null) {
                jK = e0Var.k();
                jV = e0Var.f();
                zA = false;
            } else {
                long jC = aVarE.c();
                jK = jC;
                zA = aVarE.a();
                jV = n0Var.v(aVarE.b());
            }
            mVar.i(e0Var.c(), new b0(e0Var.c(), e0Var.k(), e0Var.f(), e0Var.a(), e0Var.h(), jK, jV, zA, false, e0Var.j(), e0Var.b(), e0Var.i(), e0Var.e(), null));
            if (e0Var.a()) {
                this.f21899a.i(e0Var.c(), new a(e0Var.k(), e0Var.g(), e0Var.a(), e0Var.j(), null));
            } else {
                this.f21899a.j(e0Var.c());
            }
        }
        return new h(mVar, d0Var);
    }
}
