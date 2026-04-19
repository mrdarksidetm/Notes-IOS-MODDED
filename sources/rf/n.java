package rf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uf.a0;
import uf.w;
import uf.y;

/* JADX INFO: loaded from: classes2.dex */
public class n implements vf.b, sf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f19532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Character, xf.a> f19533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vf.c f19534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Character, List<sf.h>> f19535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sf.m f19536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f19539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f19540i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<a0> f19541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f19542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f19543c;

        a(List<a0> list, boolean z10, boolean z11) {
            this.f19541a = list;
            this.f19543c = z10;
            this.f19542b = z11;
        }
    }

    public n(vf.c cVar) {
        Map<Character, xf.a> mapF = f(cVar.b());
        this.f19533b = mapF;
        this.f19534c = cVar;
        HashMap map = new HashMap();
        this.f19535d = map;
        map.put('\\', Collections.singletonList(new sf.c()));
        map.put('`', Collections.singletonList(new sf.d()));
        map.put('&', Collections.singletonList(new sf.f()));
        map.put('<', Arrays.asList(new sf.b(), new sf.g()));
        this.f19532a = g(mapF.keySet(), map.keySet());
    }

    private a B(xf.a aVar, char c10) {
        boolean z10;
        int iN = this.f19536e.n();
        sf.l lVarO = this.f19536e.o();
        if (this.f19536e.g(c10) < aVar.c()) {
            this.f19536e.q(lVarO);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f19536e.q(lVarO);
        while (this.f19536e.i(c10)) {
            sf.m mVar = this.f19536e;
            arrayList.add(C(mVar.d(lVarO, mVar.o())));
            lVarO = this.f19536e.o();
        }
        int iM = this.f19536e.m();
        boolean z11 = false;
        boolean z12 = iN == 0 || tf.f.i(iN);
        boolean z13 = iN == 0 || tf.f.k(iN);
        boolean z14 = iM == 0 || tf.f.i(iM);
        boolean z15 = iM == 0 || tf.f.k(iM);
        boolean z16 = !z15 && (!z14 || z13 || z12);
        boolean z17 = !z13 && (!z12 || z15 || z14);
        if (c10 == '_') {
            z10 = z16 && (!z17 || z12);
            if (z17 && (!z16 || z14)) {
                z11 = true;
            }
        } else {
            boolean z18 = z16 && c10 == aVar.d();
            if (z17 && c10 == aVar.a()) {
                z11 = true;
            }
            z10 = z18;
        }
        return new a(arrayList, z10, z11);
    }

    private a0 C(vf.h hVar) {
        a0 a0Var = new a0(hVar.c());
        a0Var.k(hVar.e());
        return a0Var;
    }

    private void c(e eVar) {
        e eVar2 = this.f19540i;
        if (eVar2 != null) {
            eVar2.f19487h = true;
        }
        this.f19540i = eVar;
    }

    private static void d(char c10, xf.a aVar, Map<Character, xf.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    private static void e(Iterable<xf.a> iterable, Map<Character, xf.a> map) {
        t tVar;
        for (xf.a aVar : iterable) {
            char cD = aVar.d();
            char cA = aVar.a();
            if (cD == cA) {
                xf.a aVar2 = map.get(Character.valueOf(cD));
                if (aVar2 == null || aVar2.d() != aVar2.a()) {
                    d(cD, aVar, map);
                } else {
                    if (aVar2 instanceof t) {
                        tVar = (t) aVar2;
                    } else {
                        t tVar2 = new t(cD);
                        tVar2.e(aVar2);
                        tVar = tVar2;
                    }
                    tVar.e(aVar);
                    map.put(Character.valueOf(cD), tVar);
                }
            } else {
                d(cD, aVar, map);
                d(cA, aVar, map);
            }
        }
    }

    public static Map<Character, xf.a> f(List<xf.a> list) {
        HashMap map = new HashMap();
        e(Arrays.asList(new sf.a(), new sf.n()), map);
        e(list, map);
        return map;
    }

    public static BitSet g(Set<Character> set, Set<Character> set2) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        Iterator<Character> it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(it2.next().charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        return bitSet;
    }

    private void h(uf.s sVar) {
        if (sVar.c() == null) {
            return;
        }
        j(sVar.c(), sVar.d());
    }

    private void i(a0 a0Var, a0 a0Var2, int i10) {
        if (a0Var == null || a0Var2 == null || a0Var == a0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(a0Var.n());
        y yVar = null;
        if (this.f19537f) {
            yVar = new y();
            yVar.a(a0Var.g());
        }
        uf.s sVarE = a0Var.e();
        uf.s sVarE2 = a0Var2.e();
        while (sVarE != sVarE2) {
            sb2.append(((a0) sVarE).n());
            if (yVar != null) {
                yVar.a(sVarE.g());
            }
            uf.s sVarE3 = sVarE.e();
            sVarE.m();
            sVarE = sVarE3;
        }
        a0Var.o(sb2.toString());
        if (yVar != null) {
            a0Var.k(yVar.d());
        }
    }

    private void j(uf.s sVar, uf.s sVar2) {
        int length = 0;
        a0 a0Var = null;
        a0 a0Var2 = null;
        while (sVar != null) {
            if (sVar instanceof a0) {
                a0Var2 = (a0) sVar;
                if (a0Var == null) {
                    a0Var = a0Var2;
                }
                length += a0Var2.n().length();
            } else {
                i(a0Var, a0Var2, length);
                h(sVar);
                length = 0;
                a0Var = null;
                a0Var2 = null;
            }
            if (sVar == sVar2) {
                break;
            } else {
                sVar = sVar.e();
            }
        }
        i(a0Var, a0Var2, length);
    }

    private uf.s k() {
        sf.l lVarO = this.f19536e.o();
        this.f19536e.h();
        if (!this.f19536e.i('[')) {
            sf.m mVar = this.f19536e;
            return C(mVar.d(lVarO, mVar.o()));
        }
        sf.l lVarO2 = this.f19536e.o();
        a0 a0VarC = C(this.f19536e.d(lVarO, lVarO2));
        c(e.a(a0VarC, lVarO, lVarO2, this.f19540i, this.f19539h));
        return a0VarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private uf.s l() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.n.l():uf.s");
    }

    private List<? extends uf.s> m(xf.a aVar, char c10) {
        a aVarB = B(aVar, c10);
        if (aVarB == null) {
            return null;
        }
        List<a0> list = aVarB.f19541a;
        f fVar = new f(list, c10, aVarB.f19543c, aVarB.f19542b, this.f19539h);
        this.f19539h = fVar;
        f fVar2 = fVar.f19493f;
        if (fVar2 != null) {
            fVar2.f19494g = fVar;
        }
        return list;
    }

    private List<? extends uf.s> n() {
        uf.s sVarO;
        List<? extends uf.s> listM;
        char cL = this.f19536e.l();
        if (cL == 0) {
            return null;
        }
        if (cL == '\n') {
            sVarO = o();
        } else if (cL == '!') {
            sVarO = k();
        } else if (cL == '[') {
            sVarO = s();
        } else if (cL != ']') {
            if (this.f19532a.get(cL)) {
                List<sf.h> list = this.f19535d.get(Character.valueOf(cL));
                if (list != null) {
                    sf.l lVarO = this.f19536e.o();
                    Iterator<sf.h> it = list.iterator();
                    while (it.hasNext()) {
                        sf.j jVarA = it.next().a(this);
                        if (jVarA instanceof sf.k) {
                            sf.k kVar = (sf.k) jVarA;
                            uf.s sVarC = kVar.c();
                            this.f19536e.q(kVar.d());
                            if (this.f19537f && sVarC.g().isEmpty()) {
                                sf.m mVar = this.f19536e;
                                sVarC.k(mVar.d(lVarO, mVar.o()).e());
                            }
                            return Collections.singletonList(sVarC);
                        }
                        this.f19536e.q(lVarO);
                    }
                }
                xf.a aVar = this.f19533b.get(Character.valueOf(cL));
                if (aVar != null && (listM = m(aVar, cL)) != null) {
                    return listM;
                }
            }
            sVarO = t();
        } else {
            sVarO = l();
        }
        return Collections.singletonList(sVarO);
    }

    private uf.s o() {
        this.f19536e.h();
        return this.f19538g >= 2 ? new uf.i() : new w();
    }

    private String p(sf.m mVar) {
        String strC;
        char cL = mVar.l();
        sf.l lVarO = mVar.o();
        if (!tf.e.a(mVar)) {
            return null;
        }
        if (cL == '<') {
            String strC2 = mVar.d(lVarO, mVar.o()).c();
            strC = strC2.substring(1, strC2.length() - 1);
        } else {
            strC = mVar.d(lVarO, mVar.o()).c();
        }
        return tf.c.d(strC);
    }

    private String r(sf.m mVar) {
        sf.l lVarO = mVar.o();
        if (!tf.e.d(mVar)) {
            return null;
        }
        String strC = mVar.d(lVarO, mVar.o()).c();
        return tf.c.d(strC.substring(1, strC.length() - 1));
    }

    private uf.s s() {
        sf.l lVarO = this.f19536e.o();
        this.f19536e.h();
        sf.l lVarO2 = this.f19536e.o();
        a0 a0VarC = C(this.f19536e.d(lVarO, lVarO2));
        c(e.b(a0VarC, lVarO, lVarO2, this.f19540i, this.f19539h));
        return a0VarC;
    }

    private uf.s t() {
        char cL;
        int iP;
        sf.l lVarO = this.f19536e.o();
        do {
            this.f19536e.h();
            cL = this.f19536e.l();
            if (cL == 0) {
                break;
            }
        } while (!this.f19532a.get(cL));
        sf.m mVar = this.f19536e;
        vf.h hVarD = mVar.d(lVarO, mVar.o());
        String strC = hVarD.c();
        if (cL != '\n') {
            if (cL == 0) {
                iP = tf.f.p(strC, strC.length() - 1, 0) + 1;
            }
            a0 a0Var = new a0(strC);
            a0Var.k(hVarD.e());
            return a0Var;
        }
        iP = tf.f.n(' ', strC, strC.length() - 1, 0) + 1;
        this.f19538g = strC.length() - iP;
        strC = strC.substring(0, iP);
        a0 a0Var2 = new a0(strC);
        a0Var2.k(hVarD.e());
        return a0Var2;
    }

    private void u(f fVar) {
        boolean z10;
        HashMap map = new HashMap();
        f fVar2 = this.f19539h;
        while (fVar2 != null) {
            f fVar3 = fVar2.f19493f;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c10 = fVar2.f19489b;
            xf.a aVar = this.f19533b.get(Character.valueOf(c10));
            if (fVar2.f() && aVar != null) {
                char cD = aVar.d();
                f fVar4 = fVar2.f19493f;
                int iB = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != map.get(Character.valueOf(c10))) {
                    if (fVar4.d() && fVar4.f19489b == cD) {
                        iB = aVar.b(fVar4, fVar2);
                        if (iB > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    fVar4 = fVar4.f19493f;
                }
                z10 = false;
                if (z10) {
                    for (int i10 = 0; i10 < iB; i10++) {
                        List<a0> list = fVar4.f19488a;
                        list.remove(list.size() - 1).m();
                    }
                    for (int i11 = 0; i11 < iB; i11++) {
                        fVar2.f19488a.remove(0).m();
                    }
                    y(fVar4, fVar2);
                    if (fVar4.length() == 0) {
                        w(fVar4);
                    }
                    if (fVar2.length() == 0) {
                        f fVar5 = fVar2.f19494g;
                        w(fVar2);
                        fVar2 = fVar5;
                    }
                } else if (!z11) {
                    map.put(Character.valueOf(c10), fVar2.f19493f);
                    if (!fVar2.d()) {
                        x(fVar2);
                    }
                }
            }
            fVar2 = fVar2.f19494g;
        }
        while (true) {
            f fVar6 = this.f19539h;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                x(fVar6);
            }
        }
    }

    private void v(f fVar) {
        f fVar2 = fVar.f19493f;
        if (fVar2 != null) {
            fVar2.f19494g = fVar.f19494g;
        }
        f fVar3 = fVar.f19494g;
        if (fVar3 == null) {
            this.f19539h = fVar2;
        } else {
            fVar3.f19493f = fVar2;
        }
    }

    private void w(f fVar) {
        v(fVar);
    }

    private void x(f fVar) {
        v(fVar);
    }

    private void y(f fVar, f fVar2) {
        f fVar3 = fVar2.f19493f;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f19493f;
            x(fVar3);
            fVar3 = fVar4;
        }
    }

    private void z() {
        this.f19540i = this.f19540i.f19484e;
    }

    void A(vf.h hVar) {
        this.f19536e = sf.m.k(hVar);
        this.f19537f = !hVar.e().isEmpty();
        this.f19538g = 0;
        this.f19539h = null;
        this.f19540i = null;
    }

    @Override // sf.i
    public sf.m a() {
        return this.f19536e;
    }

    @Override // vf.b
    public void b(vf.h hVar, uf.s sVar) {
        A(hVar);
        while (true) {
            List<? extends uf.s> listN = n();
            if (listN == null) {
                u(null);
                h(sVar);
                return;
            } else {
                Iterator<? extends uf.s> it = listN.iterator();
                while (it.hasNext()) {
                    sVar.b(it.next());
                }
            }
        }
    }

    String q(sf.m mVar) {
        if (!mVar.i('[')) {
            return null;
        }
        sf.l lVarO = mVar.o();
        if (!tf.e.c(mVar)) {
            return null;
        }
        sf.l lVarO2 = mVar.o();
        if (!mVar.i(']')) {
            return null;
        }
        String strC = mVar.d(lVarO, lVarO2).c();
        if (strC.length() > 999) {
            return null;
        }
        return strC;
    }
}
