package j0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.b2;
import t0.e2;
import t0.o2;
import y1.r0;
import y1.s0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    static final class a extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f13793a;

        /* JADX INFO: renamed from: j0.z$a$a, reason: collision with other inner class name */
        public static final class C0326a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f13794a;

            public C0326a(y yVar) {
                this.f13794a = yVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f13794a.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(1);
            this.f13793a = yVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            return new C0326a(this.f13793a);
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f13797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f13798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13799e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i10, a0 a0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, int i11) {
            super(2);
            this.f13795a = obj;
            this.f13796b = i10;
            this.f13797c = a0Var;
            this.f13798d = pVar;
            this.f13799e = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            z.a(this.f13795a, this.f13796b, this.f13797c, this.f13798d, lVar, e2.a(this.f13799e | 1));
        }
    }

    public static final void a(Object obj, int i10, a0 a0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i11) {
        t0.l lVarP = lVar.p(-2079116560);
        if (t0.o.I()) {
            t0.o.U(-2079116560, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        lVarP.e(511388516);
        boolean zN = lVarP.N(obj) | lVarP.N(a0Var);
        Object objF = lVarP.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new y(obj, a0Var);
            lVarP.E(objF);
        }
        lVarP.K();
        y yVar = (y) objF;
        yVar.g(i10);
        yVar.i((r0) lVarP.P(s0.a()));
        lVarP.e(-913235405);
        boolean zN2 = lVarP.N(yVar);
        Object objF2 = lVarP.f();
        if (zN2 || objF2 == t0.l.f20813a.a()) {
            objF2 = new a(yVar);
            lVarP.E(objF2);
        }
        lVarP.K();
        t0.l0.b(yVar, (zd.l) objF2, lVarP, 0);
        t0.v.a(s0.a().c(yVar), pVar, lVarP, 0 | b2.f20629d | ((i11 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(obj, i10, a0Var, pVar, i11));
        }
    }
}
