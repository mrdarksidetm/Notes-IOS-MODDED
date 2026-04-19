package t0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20773a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zd.p<l, Integer, md.i0> f20774b = b1.c.c(954879418, false, a.f20776a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static zd.p<l, Integer, md.i0> f20775c = b1.c.c(1918065384, false, b.f20777a);

    static final class a extends ae.s implements zd.p<l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20776a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:607)");
            }
            if (o.I()) {
                o.T();
            }
        }
    }

    static final class b extends ae.s implements zd.p<l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20777a = new b();

        b() {
            super(2);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:739)");
            }
            if (o.I()) {
                o.T();
            }
        }
    }

    public final zd.p<l, Integer, md.i0> a() {
        return f20774b;
    }

    public final zd.p<l, Integer, md.i0> b() {
        return f20775c;
    }
}
