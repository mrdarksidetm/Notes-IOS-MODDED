package d0;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import l1.f1;
import l1.j1;
import l1.m1;
import l1.t1;
import l1.u1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static final class a extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9199a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
        }
    }

    static final class b extends ae.s implements zd.l<n1.c, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l1.z f9200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n1.g f9203d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l1.z zVar, long j10, long j11, n1.g gVar) {
            super(1);
            this.f9200a = zVar;
            this.f9201b = j10;
            this.f9202c = j11;
            this.f9203d = gVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.c cVar) {
            invoke2(cVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.c cVar) {
            cVar.u1();
            n1.f.H0(cVar, this.f9200a, this.f9201b, this.f9202c, 0.0f, this.f9203d, null, 0, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, null);
        }
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, i iVar, t1 t1Var) {
        return h(eVar, iVar.b(), iVar.a(), t1Var);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, long j10, t1 t1Var) {
        return h(eVar, f10, new u1(j10, null), t1Var);
    }

    public static /* synthetic */ androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, long j10, t1 t1Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            t1Var = m1.a();
        }
        return f(eVar, f10, j10, t1Var);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f10, l1.z zVar, t1 t1Var) {
        return eVar.h(new BorderModifierNodeElement(f10, zVar, t1Var, null));
    }

    private static final k1.j i(float f10, k1.j jVar) {
        return new k1.j(f10, f10, jVar.j() - f10, jVar.d() - f10, m(jVar.h(), f10), m(jVar.i(), f10), m(jVar.c(), f10), m(jVar.b(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 j(f1 f1Var, k1.j jVar, float f10, boolean z10) {
        f1Var.reset();
        f1Var.m(jVar);
        if (!z10) {
            f1 f1VarA = l1.p.a();
            f1VarA.m(i(f10, jVar));
            f1Var.e(f1Var, f1VarA, j1.f14539a.a());
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1.k k(i1.f fVar) {
        return fVar.f(a.f9199a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1.k l(i1.f fVar, l1.z zVar, long j10, long j11, boolean z10, float f10) {
        return fVar.f(new b(zVar, z10 ? k1.f.f14338b.c() : j10, z10 ? fVar.c() : j11, z10 ? n1.j.f15736a : new n1.k(f10, 0.0f, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10, float f10) {
        return k1.b.a(Math.max(0.0f, k1.a.d(j10) - f10), Math.max(0.0f, k1.a.e(j10) - f10));
    }
}
