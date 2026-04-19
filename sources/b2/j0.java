package b2;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f5308a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zd.p<t0.l, Integer, md.i0> f5309b = b1.c.c(-1759434350, false, a.f5310a);

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5310a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:110)");
            }
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    public final zd.p<t0.l, Integer, md.i0> a() {
        return f5309b;
    }
}
