package d0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    static final class a extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9236a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
            g2.v.x(xVar, g2.h.f11315d.a());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return g2.o.c(eVar, true, a.f9236a);
    }
}
