package t0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b0 f20881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20882b = new n1("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f20883c = new n1("provider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20884d = new n1("compositionLocalMap");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f20885e = new n1("providerValues");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f20886f = new n1("providers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f20887g = new n1("reference");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<t0> f20888h = new Comparator() { // from class: t0.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o.b((t0) obj, (t0) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 A(List<t0> list, int i10, int i11) {
        int iY = y(list, i10);
        if (iY >= list.size()) {
            return null;
        }
        t0 t0Var = list.get(iY);
        if (t0Var.b() < i11) {
            return t0Var;
        }
        return null;
    }

    public static final Object B() {
        return f20884d;
    }

    public static final Object C() {
        return f20882b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object D(w0 w0Var) {
        return w0Var.d() != null ? new v0(Integer.valueOf(w0Var.a()), w0Var.d()) : Integer.valueOf(w0Var.a());
    }

    public static final Object E() {
        return f20883c;
    }

    public static final Object F() {
        return f20886f;
    }

    public static final Object G() {
        return f20887g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(List<t0> list, int i10, d2 d2Var, Object obj) {
        int iZ = z(list, i10);
        v0.b bVar = null;
        if (iZ < 0) {
            int i11 = -(iZ + 1);
            if (obj != null) {
                bVar = new v0.b();
                bVar.add(obj);
            }
            list.add(i11, new t0(d2Var, i10, bVar));
            return;
        }
        t0 t0Var = list.get(iZ);
        if (obj == null) {
            t0Var.e(null);
            return;
        }
        v0.b<Object> bVarA = t0Var.a();
        if (bVarA != null) {
            bVarA.add(obj);
        }
    }

    public static final boolean I() {
        b0 b0Var = f20881a;
        return b0Var != null && b0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> J() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(r2 r2Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (r2Var.M(i10) == i11) {
            return i11;
        }
        if (r2Var.M(i11) == i10) {
            return i10;
        }
        if (r2Var.M(i10) == r2Var.M(i11)) {
            return r2Var.M(i10);
        }
        int iW = w(r2Var, i10, i12);
        int iW2 = w(r2Var, i11, i12);
        int i13 = iW - iW2;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = r2Var.M(i10);
        }
        int i15 = iW2 - iW;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = r2Var.M(i11);
        }
        while (i10 != i11) {
            i10 = r2Var.M(i10);
            i11 = r2Var.M(i11);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V L(HashMap<K, LinkedHashSet<V>> map, K k10) {
        V v10;
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null || (v10 = (V) nd.c0.Z(linkedHashSet)) == null) {
            return null;
        }
        N(map, k10, v10);
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean M(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k10, linkedHashSet);
        }
        return linkedHashSet.add(v10);
    }

    private static final <K, V> md.i0 N(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v10);
        if (linkedHashSet.isEmpty()) {
            map.remove(k10);
        }
        return md.i0.f15558a;
    }

    public static final void O(v2 v2Var, j2 j2Var) {
        Iterator<Object> itK0 = v2Var.k0();
        while (itK0.hasNext()) {
            Object next = itK0.next();
            if (next instanceof j) {
                j2Var.b((j) next);
            }
            if (next instanceof l2) {
                j2Var.a(((l2) next).a());
            }
            if (next instanceof d2) {
                ((d2) next).x();
            }
        }
        v2Var.L0();
    }

    private static final void P(v2 v2Var, int i10, int i11, Object obj) {
        if (obj == v2Var.R0(i10, i11, l.f20813a.a())) {
            return;
        }
        u("Slot table is out of sync".toString());
        throw new md.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 Q(List<t0> list, int i10) {
        int iZ = z(list, i10);
        if (iZ >= 0) {
            return list.remove(iZ);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(List<t0> list, int i10, int i11) {
        int iY = y(list, i10);
        while (iY < list.size() && list.get(iY).b() < i11) {
            list.remove(iY);
        }
    }

    public static final void S(boolean z10) {
        if (z10) {
            return;
        }
        u("Check failed".toString());
        throw new md.i();
    }

    public static final void T() {
        b0 b0Var = f20881a;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public static final void U(int i10, int i11, int i12, String str) {
        b0 b0Var = f20881a;
        if (b0Var != null) {
            b0Var.a(i10, i11, i12, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(t0 t0Var, t0 t0Var2) {
        return ae.r.g(t0Var.b(), t0Var2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> s(s2 s2Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        r2 r2VarZ = s2Var.z();
        try {
            t(r2VarZ, arrayList, s2Var.d(dVar));
            md.i0 i0Var = md.i0.f15558a;
            return arrayList;
        } finally {
            r2VarZ.d();
        }
    }

    private static final void t(r2 r2Var, List<Object> list, int i10) {
        if (r2Var.G(i10)) {
            list.add(r2Var.I(i10));
            return;
        }
        int iB = i10 + 1;
        int iB2 = i10 + r2Var.B(i10);
        while (iB < iB2) {
            t(r2Var, list, iB);
            iB += r2Var.B(iB);
        }
    }

    public static final Void u(String str) {
        throw new k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void v(v2 v2Var, j2 j2Var) {
        int iA0 = v2Var.a0();
        int iB0 = v2Var.b0();
        while (iA0 < iB0) {
            Object objB0 = v2Var.B0(iA0);
            if (objB0 instanceof j) {
                j2Var.c((j) objB0);
            }
            int iZ0 = v2Var.Z0(v2Var.f21003b, v2Var.g0(iA0));
            int i10 = iA0 + 1;
            int iQ = v2Var.Q(v2Var.f21003b, v2Var.g0(i10));
            for (int i11 = iZ0; i11 < iQ; i11++) {
                int i12 = i11 - iZ0;
                Object obj = v2Var.f21004c[v2Var.R(i11)];
                if (obj instanceof l2) {
                    k2 k2VarA = ((l2) obj).a();
                    if (!(k2VarA instanceof n2)) {
                        P(v2Var, iA0, i12, obj);
                        j2Var.a(k2VarA);
                    }
                } else if (obj instanceof d2) {
                    P(v2Var, iA0, i12, obj);
                    ((d2) obj).x();
                }
            }
            iA0 = i10;
        }
    }

    private static final int w(r2 r2Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = r2Var.M(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<t0> x(List<t0> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iY = y(list, i10); iY < list.size(); iY++) {
            t0 t0Var = list.get(iY);
            if (t0Var.b() >= i11) {
                break;
            }
            arrayList.add(t0Var);
        }
        return arrayList;
    }

    private static final int y(List<t0> list, int i10) {
        int iZ = z(list, i10);
        return iZ < 0 ? -(iZ + 1) : iZ;
    }

    private static final int z(List<t0> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iG = ae.r.g(list.get(i12).b(), i10);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }
}
