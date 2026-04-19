package androidx.compose.foundation.layout;

import b2.u0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    public static final class C0052a extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0052a(float f10, boolean z10) {
            super(1);
            this.f2473a = f10;
            this.f2474b = z10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("aspectRatio");
            w0Var.a().c("ratio", Float.valueOf(this.f2473a));
            w0Var.a().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f2474b));
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        return eVar.h(new AspectRatioElement(f10, z10, u0.c() ? new C0052a(f10, z10) : u0.a()));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(eVar, f10, z10);
    }
}
