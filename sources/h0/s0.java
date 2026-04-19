package h0;

import b2.u0;
import b2.w0;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    public static final class a extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f11749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var) {
            super(1);
            this.f11749a = o0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("insetsBottomHeight");
            w0Var.a().c("insets", this.f11749a);
        }
    }

    static final class b extends ae.s implements zd.p<o0, w2.d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11750a = new b();

        b() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(o0 o0Var, w2.d dVar) {
            return Integer.valueOf(o0Var.b(dVar));
        }
    }

    public static final class c extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f11751a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var) {
            super(1);
            this.f11751a = o0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("insetsTopHeight");
            w0Var.a().c("insets", this.f11751a);
        }
    }

    static final class d extends ae.s implements zd.p<o0, w2.d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f11752a = new d();

        d() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(o0 o0Var, w2.d dVar) {
            return Integer.valueOf(o0Var.d(dVar));
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, o0 o0Var) {
        return eVar.h(new l(o0Var, u0.c() ? new a(o0Var) : u0.a(), b.f11750a));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, o0 o0Var) {
        return eVar.h(new l(o0Var, u0.c() ? new c(o0Var) : u0.a(), d.f11752a));
    }
}
