package d0;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class v extends e.c implements z1.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.l<? super y1.r, md.i0> f9298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zd.l<y1.r, md.i0> f9299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final z1.g f9300p;

    static final class a extends ae.s implements zd.l<y1.r, md.i0> {
        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(y1.r rVar) {
            invoke2(rVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(y1.r rVar) {
            if (v.this.H1()) {
                v.this.b2().invoke(rVar);
                zd.l lVarC2 = v.this.c2();
                if (lVarC2 != null) {
                    lVarC2.invoke(rVar);
                }
            }
        }
    }

    public v(zd.l<? super y1.r, md.i0> lVar) {
        this.f9298n = lVar;
        a aVar = new a();
        this.f9299o = aVar;
        this.f9300p = z1.i.b(md.x.a(t.a(), aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zd.l<y1.r, md.i0> c2() {
        if (H1()) {
            return (zd.l) p(t.a());
        }
        return null;
    }

    public final zd.l<y1.r, md.i0> b2() {
        return this.f9298n;
    }

    @Override // z1.h
    public z1.g u0() {
        return this.f9300p;
    }
}
