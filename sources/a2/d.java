package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f58a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zd.l<a2.c, md.i0> f59b = b.f61a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zd.l<a2.c, md.i0> f60c = c.f62a;

    public static final class a implements z1.k {
        a() {
        }

        @Override // z1.k
        public <T> T p(z1.c<T> cVar) {
            return cVar.a().invoke();
        }
    }

    static final class b extends ae.s implements zd.l<a2.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61a = new b();

        b() {
            super(1);
        }

        public final void a(a2.c cVar) {
            cVar.e2();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(a2.c cVar) {
            a(cVar);
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.l<a2.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f62a = new c();

        c() {
            super(1);
        }

        public final void a(a2.c cVar) {
            cVar.i2();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(a2.c cVar) {
            a(cVar);
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(a2.c cVar) {
        e.c cVarO = k.k(cVar).h0().o();
        ae.r.d(cVarO, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((q1) cVarO).a2();
    }
}
