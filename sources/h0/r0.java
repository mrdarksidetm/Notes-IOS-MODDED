package h0;

import b2.u0;
import b2.w0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z1.l<o0> f11741a = z1.e.a(a.f11742a);

    static final class a extends ae.s implements zd.a<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11742a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return q0.a(0, 0, 0, 0);
        }
    }

    public static final class b extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l f11743a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zd.l lVar) {
            super(1);
            this.f11743a = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("onConsumedWindowInsetsChanged");
            w0Var.a().c("block", this.f11743a);
        }
    }

    static final class c extends ae.s implements zd.q<androidx.compose.ui.e, t0.l, Integer, androidx.compose.ui.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<o0, md.i0> f11744a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(zd.l<? super o0, md.i0> lVar) {
            super(3);
            this.f11744a = lVar;
        }

        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
            lVar.e(-1608161351);
            if (t0.o.I()) {
                t0.o.U(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            zd.l<o0, md.i0> lVar2 = this.f11744a;
            lVar.e(1157296644);
            boolean zN = lVar.N(lVar2);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new j(lVar2);
                lVar.E(objF);
            }
            lVar.K();
            j jVar = (j) objF;
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return jVar;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, Integer num) {
            return invoke(eVar, lVar, num.intValue());
        }
    }

    public static final z1.l<o0> a() {
        return f11741a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, zd.l<? super o0, md.i0> lVar) {
        return androidx.compose.ui.c.a(eVar, u0.c() ? new b(lVar) : u0.a(), new c(lVar));
    }
}
