package androidx.compose.foundation.layout;

import ae.f0;
import java.util.List;
import md.i0;
import y1.d0;
import y1.e0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class e implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.b f2487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2488b;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2489a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
        }
    }

    static final class b extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f2491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f2492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f2495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var, d0 d0Var, g0 g0Var, int i10, int i11, e eVar) {
            super(1);
            this.f2490a = t0Var;
            this.f2491b = d0Var;
            this.f2492c = g0Var;
            this.f2493d = i10;
            this.f2494e = i11;
            this.f2495f = eVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            d.f(aVar, this.f2490a, this.f2491b, this.f2492c.getLayoutDirection(), this.f2493d, this.f2494e, this.f2495f.f2487a);
        }
    }

    static final class c extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0[] f2496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<d0> f2497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f2498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f2499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f2500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f2501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(t0[] t0VarArr, List<? extends d0> list, g0 g0Var, f0 f0Var, f0 f0Var2, e eVar) {
            super(1);
            this.f2496a = t0VarArr;
            this.f2497b = list;
            this.f2498c = g0Var;
            this.f2499d = f0Var;
            this.f2500e = f0Var2;
            this.f2501f = eVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0[] t0VarArr = this.f2496a;
            List<d0> list = this.f2497b;
            g0 g0Var = this.f2498c;
            f0 f0Var = this.f2499d;
            f0 f0Var2 = this.f2500e;
            e eVar = this.f2501f;
            int length = t0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                t0 t0Var = t0VarArr[i10];
                ae.r.d(t0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                d.f(aVar, t0Var, list.get(i11), g0Var.getLayoutDirection(), f0Var.f703a, f0Var2.f703a, eVar.f2487a);
                i10++;
                i11++;
            }
        }
    }

    public e(f1.b bVar, boolean z10) {
        this.f2487a = bVar;
        this.f2488b = z10;
    }

    @Override // y1.e0
    public y1.f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        int iP;
        int iO;
        t0 t0VarI;
        if (list.isEmpty()) {
            return g0.z0(g0Var, w2.b.p(j10), w2.b.o(j10), null, a.f2489a, 4, null);
        }
        long jE = this.f2488b ? j10 : w2.b.e(j10, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            d0 d0Var = list.get(0);
            if (d.e(d0Var)) {
                iP = w2.b.p(j10);
                iO = w2.b.o(j10);
                t0VarI = d0Var.I(w2.b.f22395b.c(w2.b.p(j10), w2.b.o(j10)));
            } else {
                t0VarI = d0Var.I(jE);
                iP = Math.max(w2.b.p(j10), t0VarI.q0());
                iO = Math.max(w2.b.o(j10), t0VarI.d0());
            }
            int i10 = iP;
            int i11 = iO;
            return g0.z0(g0Var, i10, i11, null, new b(t0VarI, d0Var, g0Var, i10, i11, this), 4, null);
        }
        t0[] t0VarArr = new t0[list.size()];
        f0 f0Var = new f0();
        f0Var.f703a = w2.b.p(j10);
        f0 f0Var2 = new f0();
        f0Var2.f703a = w2.b.o(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            d0 d0Var2 = list.get(i12);
            if (d.e(d0Var2)) {
                z10 = true;
            } else {
                t0 t0VarI2 = d0Var2.I(jE);
                t0VarArr[i12] = t0VarI2;
                f0Var.f703a = Math.max(f0Var.f703a, t0VarI2.q0());
                f0Var2.f703a = Math.max(f0Var2.f703a, t0VarI2.d0());
            }
        }
        if (z10) {
            int i13 = f0Var.f703a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = f0Var2.f703a;
            long jA = w2.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                d0 d0Var3 = list.get(i16);
                if (d.e(d0Var3)) {
                    t0VarArr[i16] = d0Var3.I(jA);
                }
            }
        }
        return g0.z0(g0Var, f0Var.f703a, f0Var2.f703a, null, new c(t0VarArr, list, g0Var, f0Var, f0Var2, this), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return ae.r.b(this.f2487a, eVar.f2487a) && this.f2488b == eVar.f2488b;
    }

    public int hashCode() {
        return (this.f2487a.hashCode() * 31) + Boolean.hashCode(this.f2488b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f2487a + ", propagateMinConstraints=" + this.f2488b + ')';
    }
}
