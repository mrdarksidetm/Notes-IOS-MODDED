package androidx.compose.foundation.layout;

import b2.w0;
import h0.y;
import h0.z;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    static final class a extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f2520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f2522d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f2519a = f10;
            this.f2520b = f11;
            this.f2521c = f12;
            this.f2522d = f13;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("padding");
            w0Var.a().c("start", w2.h.i(this.f2519a));
            w0Var.a().c("top", w2.h.i(this.f2520b));
            w0Var.a().c("end", w2.h.i(this.f2521c));
            w0Var.a().c("bottom", w2.h.i(this.f2522d));
        }
    }

    static final class b extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f2524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f2523a = f10;
            this.f2524b = f11;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("padding");
            w0Var.a().c("horizontal", w2.h.i(this.f2523a));
            w0Var.a().c("vertical", w2.h.i(this.f2524b));
        }
    }

    static final class c extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f2525a = f10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("padding");
            w0Var.c(w2.h.i(this.f2525a));
        }
    }

    static final class d extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f2526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y yVar) {
            super(1);
            this.f2526a = yVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("padding");
            w0Var.a().c("paddingValues", this.f2526a);
        }
    }

    public static final y a(float f10) {
        return new z(f10, f10, f10, f10, null);
    }

    public static final y b(float f10, float f11) {
        return new z(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ y c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w2.h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = w2.h.m(0);
        }
        return b(f10, f11);
    }

    public static final y d(float f10, float f11, float f12, float f13) {
        return new z(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ y e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w2.h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = w2.h.m(0);
        }
        if ((i10 & 4) != 0) {
            f12 = w2.h.m(0);
        }
        if ((i10 & 8) != 0) {
            f13 = w2.h.m(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(y yVar, w2.r rVar) {
        return rVar == w2.r.Ltr ? yVar.b(rVar) : yVar.d(rVar);
    }

    public static final float g(y yVar, w2.r rVar) {
        return rVar == w2.r.Ltr ? yVar.d(rVar) : yVar.b(rVar);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, y yVar) {
        return eVar.h(new PaddingValuesElement(yVar, new d(yVar)));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        return eVar.h(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.h(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w2.h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = w2.h.m(0);
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        return eVar.h(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w2.h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = w2.h.m(0);
        }
        if ((i10 & 4) != 0) {
            f12 = w2.h.m(0);
        }
        if ((i10 & 8) != 0) {
            f13 = w2.h.m(0);
        }
        return l(eVar, f10, f11, f12, f13);
    }
}
