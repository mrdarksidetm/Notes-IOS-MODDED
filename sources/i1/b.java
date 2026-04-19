package i1;

import ae.s;
import l1.m1;
import l1.o1;
import l1.t1;
import l1.x1;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static final class a extends s implements zd.l<androidx.compose.ui.graphics.d, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f12272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f12273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t1 f12275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12276e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, int i10, t1 t1Var, boolean z10) {
            super(1);
            this.f12272a = f10;
            this.f12273b = f11;
            this.f12274c = i10;
            this.f12275d = t1Var;
            this.f12276e = z10;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            float fG0 = dVar.G0(this.f12272a);
            float fG02 = dVar.G0(this.f12273b);
            dVar.n((fG0 <= 0.0f || fG02 <= 0.0f) ? null : o1.a(fG0, fG02, this.f12274c));
            t1 t1VarA = this.f12275d;
            if (t1VarA == null) {
                t1VarA = m1.a();
            }
            dVar.d1(t1VarA);
            dVar.U0(this.f12276e);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return i0.f15558a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11, t1 t1Var) {
        int iB;
        boolean z10;
        if (t1Var != null) {
            iB = x1.f14638a.a();
            z10 = true;
        } else {
            iB = x1.f14638a.b();
            z10 = false;
        }
        float f12 = 0;
        return ((w2.h.l(f10, w2.h.m(f12)) <= 0 || w2.h.l(f11, w2.h.m(f12)) <= 0) && !z10) ? eVar : androidx.compose.ui.graphics.c.a(eVar, new a(f10, f11, iB, t1Var, z10));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, t1 t1Var) {
        return a(eVar, f10, f10, t1Var);
    }
}
