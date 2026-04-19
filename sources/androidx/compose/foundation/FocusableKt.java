package androidx.compose.foundation;

import a2.r0;
import ae.s;
import b2.t0;
import b2.u0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t0 f2199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f2200b;

    static final class a extends s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0.m f2202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, g0.m mVar) {
            super(1);
            this.f2201a = z10;
            this.f2202b = mVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("focusableInNonTouchMode");
            w0Var.a().c("enabled", Boolean.valueOf(this.f2201a));
            w0Var.a().c("interactionSource", this.f2202b);
        }
    }

    public static final class b extends s implements zd.l<w0, i0> {
        public b() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("focusGroup");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f2199a = new t0(u0.c() ? new b() : u0.a());
        f2200b = new r0<i>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // a2.r0
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public i a() {
                return new i();
            }

            @Override // a2.r0
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // a2.r0
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public void c(i iVar) {
            }
        };
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z10, g0.m mVar) {
        return eVar.h(z10 ? androidx.compose.ui.focus.c.a(new FocusableElement(mVar)) : androidx.compose.ui.e.f2662a);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, g0.m mVar) {
        return u0.b(eVar, new a(z10, mVar), a(androidx.compose.ui.e.f2662a.h(f2200b), z10, mVar));
    }
}
