package i0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import j0.d;
import t0.e2;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f12171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f12172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0.t f12173c;

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f12175b = i10;
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
                t0.o.U(726189336, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            j jVar = o.this.f12172b;
            int i11 = this.f12175b;
            d.a<i> aVar = jVar.d().get(i11);
            aVar.c().a().invoke(r.f12183a, Integer.valueOf(i11 - aVar.b()), lVar, 6);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f12178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f12177b = i10;
            this.f12178c = obj;
            this.f12179d = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            o.this.f(this.f12177b, this.f12178c, lVar, e2.a(this.f12179d | 1));
        }
    }

    public o(h0 h0Var, j jVar, j0.t tVar) {
        this.f12171a = h0Var;
        this.f12172b = jVar;
        this.f12173c = tVar;
    }

    @Override // j0.q
    public Object a(int i10) {
        Object objA = e().a(i10);
        return objA == null ? this.f12172b.f(i10) : objA;
    }

    @Override // j0.q
    public int b(Object obj) {
        return e().b(obj);
    }

    @Override // j0.q
    public int c() {
        return this.f12172b.e();
    }

    @Override // j0.q
    public Object d(int i10) {
        return this.f12172b.c(i10);
    }

    @Override // i0.n
    public j0.t e() {
        return this.f12173c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return ae.r.b(this.f12172b, ((o) obj).f12172b);
        }
        return false;
    }

    @Override // j0.q
    public void f(int i10, Object obj, t0.l lVar, int i11) {
        t0.l lVarP = lVar.p(1493551140);
        if (t0.o.I()) {
            t0.o.U(1493551140, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        j0.z.a(obj, i10, this.f12171a.r(), b1.c.b(lVarP, 726189336, true, new a(i10)), lVarP, ((i11 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3592);
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(i10, obj, i11));
        }
    }

    @Override // i0.n
    public g0 g() {
        return this.f12172b.i();
    }

    public int hashCode() {
        return this.f12172b.hashCode();
    }
}
