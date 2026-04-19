package b2;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.l<w0, md.i0> f5413a = a.f5415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f5414b;

    static final class a extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5415a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
        }
    }

    public static final zd.l<w0, md.i0> a() {
        return f5413a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, zd.l<? super w0, md.i0> lVar, androidx.compose.ui.e eVar2) {
        t0 t0Var = new t0(lVar);
        return eVar.h(t0Var).h(eVar2).h(t0Var.a());
    }

    public static final boolean c() {
        return f5414b;
    }
}
