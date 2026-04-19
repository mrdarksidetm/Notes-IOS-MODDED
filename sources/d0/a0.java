package d0;

import b2.u0;
import b2.w0;
import t0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<y> f9160a = t0.v.e(a.f9161a);

    static final class a extends ae.s implements zd.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9161a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return q.f9288a;
        }
    }

    public static final class b extends ae.s implements zd.l<w0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f9162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0.k f9163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, g0.k kVar) {
            super(1);
            this.f9162a = yVar;
            this.f9163b = kVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("indication");
            w0Var.a().c("indication", this.f9162a);
            w0Var.a().c("interactionSource", this.f9163b);
        }
    }

    static final class c extends ae.s implements zd.q<androidx.compose.ui.e, t0.l, Integer, androidx.compose.ui.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f9164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0.k f9165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y yVar, g0.k kVar) {
            super(3);
            this.f9164a = yVar;
            this.f9165b = kVar;
        }

        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
            lVar.e(-353972293);
            if (t0.o.I()) {
                t0.o.U(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
            }
            y yVar = this.f9164a;
            if (yVar == null) {
                yVar = f0.f9197a;
            }
            z zVarA = yVar.a(this.f9165b, lVar, 0);
            lVar.e(1157296644);
            boolean zN = lVar.N(zVarA);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new b0(zVarA);
                lVar.E(objF);
            }
            lVar.K();
            b0 b0Var = (b0) objF;
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return b0Var;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, Integer num) {
            return invoke(eVar, lVar, num.intValue());
        }
    }

    public static final a2<y> a() {
        return f9160a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, g0.k kVar, y yVar) {
        return androidx.compose.ui.c.a(eVar, u0.c() ? new b(yVar, kVar) : u0.a(), new c(yVar, kVar));
    }
}
