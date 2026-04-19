package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import b2.n1;
import g2.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1.h f3060a = new k1.h(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f3061b;

    static final class a extends ae.s implements zd.l<a2.f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3062a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(a2.f0 f0Var) {
            g2.l lVarG = f0Var.G();
            return Boolean.valueOf((lVarG != null && lVarG.u()) && lVarG.f(g2.k.f11332a.v()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(g2.p pVar) {
        return pVar.v().u() || pVar.v().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(g2.p pVar) {
        return (pVar.y() || pVar.v().f(g2.s.f11377a.l())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(g2.p pVar, g2.l lVar) {
        Iterator<Map.Entry<? extends g2.w<?>, ? extends Object>> it = lVar.iterator();
        while (it.hasNext()) {
            if (!pVar.m().f(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final View D(b2.g0 g0Var, int i10) {
        Object next;
        Iterator<T> it = g0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a2.f0) ((Map.Entry) next).getKey()).m0() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.b) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(int i10) {
        i.a aVar = g2.i.f11320b;
        if (g2.i.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (g2.i.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (g2.i.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (g2.i.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (g2.i.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(g2.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof g2.a)) {
            return false;
        }
        g2.a aVar2 = (g2.a) obj;
        if (!ae.r.b(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(g2.p pVar) {
        return g2.m.a(pVar.m(), g2.s.f11377a.d()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(g2.p pVar) {
        if (pVar.v().f(g2.k.f11332a.v()) && !ae.r.b(g2.m.a(pVar.v(), g2.s.f11377a.g()), Boolean.TRUE)) {
            return true;
        }
        a2.f0 f0VarS = s(pVar.p(), a.f3062a);
        if (f0VarS != null) {
            g2.l lVarG = f0VarS.G();
            if (!(lVarG != null ? ae.r.b(g2.m.a(lVarG, g2.s.f11377a.g()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y r(List<y> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).d() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2.f0 s(a2.f0 f0Var, zd.l<? super a2.f0, Boolean> lVar) {
        do {
            f0Var = f0Var.k0();
            if (f0Var == null) {
                return null;
            }
        } while (!lVar.invoke(f0Var).booleanValue());
        return f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, n1> t(g2.r rVar) {
        g2.p pVarA = rVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pVarA.p().j() && pVarA.p().G0()) {
            k1.h hVarI = pVarA.i();
            u(new Region(ce.c.d(hVarI.f()), ce.c.d(hVarI.i()), ce.c.d(hVarI.g()), ce.c.d(hVarI.c())), pVarA, linkedHashMap, pVarA, new Region());
        }
        return linkedHashMap;
    }

    private static final void u(Region region, g2.p pVar, Map<Integer, n1> map, g2.p pVar2, Region region2) {
        y1.t tVarO;
        boolean z10 = false;
        boolean z11 = (pVar2.p().j() && pVar2.p().G0()) ? false : true;
        if (!region.isEmpty() || pVar2.n() == pVar.n()) {
            if (!z11 || pVar2.w()) {
                k1.h hVarU = pVar2.u();
                int iD = ce.c.d(hVarU.f());
                int iD2 = ce.c.d(hVarU.i());
                int iD3 = ce.c.d(hVarU.g());
                int iD4 = ce.c.d(hVarU.c());
                region2.set(iD, iD2, iD3, iD4);
                int iN = pVar2.n() == pVar.n() ? -1 : pVar2.n();
                if (region2.op(region, Region.Op.INTERSECT)) {
                    map.put(Integer.valueOf(iN), new n1(pVar2, region2.getBounds()));
                    List<g2.p> listS = pVar2.s();
                    for (int size = listS.size() - 1; -1 < size; size--) {
                        u(region, pVar, map, listS.get(size), region2);
                    }
                    if (A(pVar2)) {
                        region.op(iD, iD2, iD3, iD4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (!pVar2.w()) {
                    if (iN == -1) {
                        map.put(Integer.valueOf(iN), new n1(pVar2, region2.getBounds()));
                        return;
                    }
                    return;
                }
                g2.p pVarQ = pVar2.q();
                if (pVarQ != null && (tVarO = pVarQ.o()) != null && tVarO.j()) {
                    z10 = true;
                }
                k1.h hVarI = z10 ? pVarQ.i() : f3060a;
                map.put(Integer.valueOf(iN), new n1(pVar2, new Rect(ce.c.d(hVarI.f()), ce.c.d(hVarI.i()), ce.c.d(hVarI.g()), ce.c.d(hVarI.c()))));
            }
        }
    }

    public static final boolean v() {
        return f3061b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(g2.p pVar) {
        List list = (List) g2.m.a(pVar.v(), g2.s.f11377a.c());
        if (list != null) {
            return (String) nd.c0.a0(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(g2.p pVar) {
        List list = (List) g2.m.a(pVar.v(), g2.s.f11377a.y());
        if (list != null) {
            return y2.a.d(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(g2.p pVar) {
        return pVar.m().f(g2.s.f11377a.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(a2.f0 f0Var, a2.f0 f0Var2) {
        a2.f0 f0VarK0 = f0Var2.k0();
        if (f0VarK0 == null) {
            return false;
        }
        return ae.r.b(f0VarK0, f0Var) || z(f0Var, f0VarK0);
    }
}
