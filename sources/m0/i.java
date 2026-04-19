package m0;

import ae.s;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import w2.n;
import w2.o;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class i implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<List<k1.h>> f15181a;

    static final class a extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<md.s<t0, n>> f15182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends md.s<? extends t0, n>> list) {
            super(1);
            this.f15182a = list;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            List<md.s<t0, n>> list = this.f15182a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    md.s<t0, n> sVar = list.get(i10);
                    t0.a.h(aVar, sVar.a(), sVar.b().n(), 0.0f, 2, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(zd.a<? extends List<k1.h>> aVar) {
        this.f15181a = aVar;
    }

    @Override // y1.e0
    public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        List<k1.h> listInvoke = this.f15181a.invoke();
        ArrayList arrayList = null;
        if (listInvoke != null) {
            ArrayList arrayList2 = new ArrayList(listInvoke.size());
            int size = listInvoke.size();
            for (int i10 = 0; i10 < size; i10++) {
                k1.h hVar = listInvoke.get(i10);
                md.s sVar = hVar != null ? new md.s(list.get(i10).I(w2.c.b(0, (int) Math.floor(hVar.k()), 0, (int) Math.floor(hVar.e()), 5, null)), n.b(o.a(ce.c.d(hVar.f()), ce.c.d(hVar.i())))) : null;
                if (sVar != null) {
                    arrayList2.add(sVar);
                }
            }
            arrayList = arrayList2;
        }
        return g0.z0(g0Var, w2.b.n(j10), w2.b.m(j10), null, new a(arrayList), 4, null);
    }
}
