package b2;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    static final class a extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f5400a = str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
            g2.v.B(xVar, this.f5400a);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, String str) {
        return g2.o.d(eVar, false, new a(str), 1, null);
    }
}
