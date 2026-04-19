package j0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.e2;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f13753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f13755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, int i10, Object obj) {
            super(2);
            this.f13753a = qVar;
            this.f13754b = i10;
            this.f13755c = obj;
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
                t0.o.U(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
            }
            this.f13753a.f(this.f13754b, this.f13755c, lVar, 64);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f13756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f13757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f13759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13760e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f13756a = qVar;
            this.f13757b = obj;
            this.f13758c = i10;
            this.f13759d = obj2;
            this.f13760e = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            p.a(this.f13756a, this.f13757b, this.f13758c, this.f13759d, lVar, e2.a(this.f13760e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(q qVar, Object obj, int i10, Object obj2, t0.l lVar, int i11) {
        int i12;
        t0.l lVarP = lVar.p(1439843069);
        if ((i11 & 14) == 0) {
            i12 = (lVarP.N(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(obj) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarP.h(i10) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarP.N(obj2) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((c1.d) obj).f(obj2, b1.c.b(lVarP, 980966366, true, new a(qVar, i10, obj2)), lVarP, 568);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(qVar, obj, i10, obj2, i11));
        }
    }
}
