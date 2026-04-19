package y1;

import a2.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends f0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f23352b = new x0();

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23353a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
        }
    }

    static final class b extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f23354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var) {
            super(1);
            this.f23354a = t0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.n(aVar, this.f23354a, 0, 0, 0.0f, null, 12, null);
        }
    }

    static final class c extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<t0> f23355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends t0> list) {
            super(1);
            this.f23355a = list;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            List<t0> list = this.f23355a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t0.a.n(aVar, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    private x0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // y1.e0
    public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        int iG;
        int iF;
        Map map;
        zd.l bVar;
        if (list.isEmpty()) {
            iG = w2.b.p(j10);
            iF = w2.b.o(j10);
            map = null;
            bVar = a.f23353a;
        } else {
            if (list.size() != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(list.get(i10).I(j10));
                }
                int size2 = arrayList.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    t0 t0Var = (t0) arrayList.get(i11);
                    iMax = Math.max(t0Var.q0(), iMax);
                    iMax2 = Math.max(t0Var.d0(), iMax2);
                }
                return g0.z0(g0Var, w2.c.g(j10, iMax), w2.c.f(j10, iMax2), null, new c(arrayList), 4, null);
            }
            t0 t0VarI = list.get(0).I(j10);
            iG = w2.c.g(j10, t0VarI.q0());
            iF = w2.c.f(j10, t0VarI.d0());
            map = null;
            bVar = new b(t0VarI);
        }
        return g0.z0(g0Var, iG, iF, map, bVar, 4, null);
    }
}
