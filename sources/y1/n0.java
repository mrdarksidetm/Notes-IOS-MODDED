package y1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    public static final class a extends ae.s implements zd.l<b2.w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l f23276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zd.l lVar) {
            super(1);
            this.f23276a = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(b2.w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b2.w0 w0Var) {
            w0Var.b("onSizeChanged");
            w0Var.a().c("onSizeChanged", this.f23276a);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, zd.l<? super w2.p, md.i0> lVar) {
        return eVar.h(new o0(lVar, b2.u0.c() ? new a(lVar) : b2.u0.a()));
    }
}
