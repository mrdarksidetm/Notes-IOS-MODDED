package androidx.compose.foundation.layout;

import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    static final class a extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f2512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f2511a = f10;
            this.f2512b = f11;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b(com.amazon.device.iap.internal.c.b.as);
            w0Var.a().c("x", w2.h.i(this.f2511a));
            w0Var.a().c("y", w2.h.i(this.f2512b));
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.h(new OffsetElement(f10, f11, true, new a(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w2.h.m(0);
        }
        if ((i10 & 2) != 0) {
            f11 = w2.h.m(0);
        }
        return a(eVar, f10, f11);
    }
}
