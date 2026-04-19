package m0;

import a2.g;
import ae.r;
import androidx.compose.ui.e;
import i2.d;
import i2.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s<List<d.b<u>>, List<d.b<q<String, l, Integer, i0>>>> f15139a = new s<>(nd.u.m(), nd.u.m());

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    static final class C0344a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0344a f15140a = new C0344a();

        /* JADX INFO: renamed from: m0.a$a$a, reason: collision with other inner class name */
        static final class C0345a extends ae.s implements zd.l<t0.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<t0> f15141a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0345a(List<? extends t0> list) {
                super(1);
                this.f15141a = list;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                List<t0> list = this.f15141a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t0.a.j(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        C0344a() {
        }

        @Override // y1.e0
        public final f0 a(g0 g0Var, List<? extends d0> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).I(j10));
            }
            return g0.z0(g0Var, w2.b.n(j10), w2.b.m(j10), null, new C0345a(arrayList), 4, null);
        }
    }

    static final class b extends ae.s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2.d f15142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<d.b<q<String, l, Integer, i0>>> f15143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2.d dVar, List<d.b<q<String, l, Integer, i0>>> list, int i10) {
            super(2);
            this.f15142a = dVar;
            this.f15143b = list;
            this.f15144c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            a.a(this.f15142a, this.f15143b, lVar, e2.a(this.f15144c | 1));
        }
    }

    public static final void a(i2.d dVar, List<d.b<q<String, l, Integer, i0>>> list, l lVar, int i10) {
        l lVarP = lVar.p(-1794596951);
        if (o.I()) {
            o.U(-1794596951, i10, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            d.b<q<String, l, Integer, i0>> bVar = list.get(i12);
            q<String, l, Integer, i0> qVarA = bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            C0344a c0344a = C0344a.f15140a;
            lVarP.e(-1323940314);
            e.a aVar = androidx.compose.ui.e.f2662a;
            int iA = t0.i.a(lVarP, i11);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            zd.a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA2 = y1.u.a(aVar);
            if (!(lVarP.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, c0344a, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            qVarA.invoke(dVar.subSequence(iB, iC).j(), lVarP, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            i12++;
            i11 = 0;
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(dVar, list, i10));
        }
    }

    public static final boolean b(i2.d dVar) {
        return dVar.m("androidx.compose.foundation.text.inlineContent", 0, dVar.j().length());
    }

    public static final s<List<d.b<u>>, List<d.b<q<String, l, Integer, i0>>>> c(i2.d dVar, Map<String, f> map) {
        if (map == null || map.isEmpty()) {
            return f15139a;
        }
        List<d.b<String>> listI = dVar.i("androidx.compose.foundation.text.inlineContent", 0, dVar.j().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<String> bVar = listI.get(i10);
            f fVar = map.get(bVar.e());
            if (fVar != null) {
                arrayList.add(new d.b(fVar.b(), bVar.f(), bVar.d()));
                arrayList2.add(new d.b(fVar.a(), bVar.f(), bVar.d()));
            }
        }
        return new s<>(arrayList, arrayList2);
    }
}
