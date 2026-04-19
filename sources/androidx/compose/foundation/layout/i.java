package androidx.compose.foundation.layout;

import b2.u0;
import b2.w0;
import h0.u;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class a extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f2509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(1);
            this.f2509a = uVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("height");
            w0Var.a().c("intrinsicSize", this.f2509a);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, u uVar) {
        return eVar.h(new IntrinsicHeightElement(uVar, true, u0.c() ? new a(uVar) : u0.a()));
    }
}
