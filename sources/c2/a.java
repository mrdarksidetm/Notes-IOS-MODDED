package c2;

import ae.s;
import g2.c;
import g2.l;
import g2.m;
import g2.p;
import java.util.ArrayList;
import java.util.List;
import k1.f;
import k1.g;
import nd.c0;
import nd.u;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c2.a$a, reason: collision with other inner class name */
    static final class C0150a extends s implements zd.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0150a f6309a = new C0150a();

        C0150a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class b extends s implements zd.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6310a = new b();

        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List listM;
        Object objY;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listM = u.m();
        } else {
            listM = new ArrayList();
            p pVar = list.get(0);
            int iO = u.o(list);
            int i10 = 0;
            while (i10 < iO) {
                i10++;
                p pVar2 = list.get(i10);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                listM.add(f.d(g.a(Math.abs(f.o(pVar4.i().d()) - f.o(pVar3.i().d())), Math.abs(f.p(pVar4.i().d()) - f.p(pVar3.i().d())))));
                pVar = pVar2;
            }
        }
        if (listM.size() == 1) {
            objY = c0.Y(listM);
        } else {
            if (listM.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            objY = c0.Y(listM);
            int iO2 = u.o(listM);
            if (1 <= iO2) {
                int i11 = 1;
                while (true) {
                    objY = f.d(f.t(((f) objY).x(), ((f) listM.get(i11)).x()));
                    if (i11 == iO2) {
                        break;
                    }
                    i11++;
                }
            }
        }
        long jX = ((f) objY).x();
        return f.f(jX) < f.e(jX);
    }

    public static final boolean b(p pVar) {
        l lVarM = pVar.m();
        g2.s sVar = g2.s.f11377a;
        return (m.a(lVarM, sVar.a()) == null && m.a(pVar.m(), sVar.u()) == null) ? false : true;
    }

    private static final boolean c(g2.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(p pVar, p3.g gVar) {
        l lVarM = pVar.m();
        g2.s sVar = g2.s.f11377a;
        g2.b bVar = (g2.b) m.a(lVarM, sVar.a());
        if (bVar != null) {
            gVar.g0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.m(), sVar.u()) != null) {
            List<p> listS = pVar.s();
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = listS.get(i10);
                if (pVar2.m().f(g2.s.f11377a.v())) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zA = a(arrayList);
            gVar.g0(g.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void e(p pVar, p3.g gVar) {
        l lVarM = pVar.m();
        g2.s sVar = g2.s.f11377a;
        c cVar = (c) m.a(lVarM, sVar.b());
        if (cVar != null) {
            gVar.h0(g(cVar, pVar));
        }
        p pVarQ = pVar.q();
        if (pVarQ == null || m.a(pVarQ.m(), sVar.u()) == null) {
            return;
        }
        g2.b bVar = (g2.b) m.a(pVarQ.m(), sVar.a());
        if ((bVar == null || !c(bVar)) && pVar.m().f(sVar.v())) {
            ArrayList arrayList = new ArrayList();
            List<p> listS = pVarQ.s();
            int size = listS.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                p pVar2 = listS.get(i11);
                if (pVar2.m().f(g2.s.f11377a.v())) {
                    arrayList.add(pVar2);
                    if (pVar2.p().l0() < pVar.p().l0()) {
                        i10++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zA = a(arrayList);
                g.f fVarA = g.f.a(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) pVar.m().r(g2.s.f11377a.v(), C0150a.f6309a)).booleanValue());
                if (fVarA != null) {
                    gVar.h0(fVarA);
                }
            }
        }
    }

    private static final g.e f(g2.b bVar) {
        return g.e.a(bVar.b(), bVar.a(), false, 0);
    }

    private static final g.f g(c cVar, p pVar) {
        return g.f.a(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) pVar.m().r(g2.s.f11377a.v(), b.f6310a)).booleanValue());
    }
}
