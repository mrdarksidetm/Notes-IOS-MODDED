package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f3504a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f1<?, ?> f3505b = C(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f1<?, ?> f3506c = C(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f1<?, ?> f3507d = new h1();

    static <UT, UB> UB A(int i10, List<Integer> list, y.e eVar, UB ub2, f1<UT, UB> f1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (eVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, iIntValue, ub2, f1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.a(iIntValue2)) {
                    ub2 = (UB) L(i10, iIntValue2, ub2, f1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static f1<?, ?> C(boolean z10) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (f1) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t10, T t11) {
        t<T> tVarC = pVar.c(t11);
        if (tVarC.n()) {
            return;
        }
        pVar.d(t10).u(tVarC);
    }

    static <T> void F(i0 i0Var, T t10, T t11, long j10) {
        i1.O(t10, j10, i0Var.a(i1.A(t10, j10), i1.A(t11, j10)));
    }

    static <T, UT, UB> void G(f1<UT, UB> f1Var, T t10, T t11) {
        f1Var.p(t10, f1Var.k(f1Var.g(t10), f1Var.g(t11)));
    }

    public static f1<?, ?> H() {
        return f3505b;
    }

    public static f1<?, ?> I() {
        return f3506c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!w.class.isAssignableFrom(cls) && (cls2 = f3504a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i10, int i11, UB ub2, f1<UT, UB> f1Var) {
        if (ub2 == null) {
            ub2 = f1Var.n();
        }
        f1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static f1<?, ?> M() {
        return f3507d;
    }

    public static void N(int i10, List<Boolean> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.A(i10, list, z10);
    }

    public static void O(int i10, List<g> list, l1 l1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.N(i10, list);
    }

    public static void P(int i10, List<Double> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.K(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.J(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.y(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.u(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.a(i10, list, z10);
    }

    public static void U(int i10, List<?> list, l1 l1Var, z0 z0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.l(i10, list, z0Var);
    }

    public static void V(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.o(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.I(i10, list, z10);
    }

    public static void X(int i10, List<?> list, l1 l1Var, z0 z0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.j(i10, list, z0Var);
    }

    public static void Y(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.v(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.f(i10, list, z10);
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.V(i10) + j.C(size) : size * j.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.G(i10, list, z10);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.C(i10, list, z10);
    }

    static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = size * j.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iV += j.h(list.get(i11));
        }
        return iV;
    }

    public static void c0(int i10, List<String> list, l1 l1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.k(i10, list);
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iE) : iE + (size * iV);
    }

    public static void d0(int i10, List<Integer> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.B(i10, list, z10);
    }

    static int e(List<Integer> list) {
        int iL;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iL = 0;
            while (i10 < size) {
                iL += j.l(xVar.o(i10));
                i10++;
            }
        } else {
            iL = 0;
            while (i10 < size) {
                iL += j.l(list.get(i10).intValue());
                i10++;
            }
        }
        return iL;
    }

    public static void e0(int i10, List<Long> list, l1 l1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1Var.g(i10, list, z10);
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.V(i10) + j.C(size * 4) : size * j.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.V(i10) + j.C(size * 8) : size * j.o(i10, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<n0> list, z0 z0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += j.s(i10, list.get(i11), z0Var);
        }
        return iS;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iL) : iL + (size * iV);
    }

    static int l(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iW = 0;
            while (i10 < size) {
                iW += j.w(xVar.o(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += j.w(list.get(i10).intValue());
                i10++;
            }
        }
        return iW;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? j.V(i10) + j.C(iN) : iN + (list.size() * j.V(i10));
    }

    static int n(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iY = 0;
            while (i10 < size) {
                iY += j.y(e0Var.o(i10));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += j.y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    static int o(int i10, Object obj, z0 z0Var) {
        return obj instanceof b0 ? j.A(i10, (b0) obj) : j.F(i10, (n0) obj, z0Var);
    }

    static int p(int i10, List<?> list, z0 z0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = j.V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iV += obj instanceof b0 ? j.B((b0) obj) : j.H((n0) obj, z0Var);
        }
        return iV;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iR) : iR + (size * iV);
    }

    static int r(List<Integer> list) {
        int iQ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iQ = 0;
            while (i10 < size) {
                iQ += j.Q(xVar.o(i10));
                i10++;
            }
        } else {
            iQ = 0;
            while (i10 < size) {
                iQ += j.Q(list.get(i10).intValue());
                i10++;
            }
        }
        return iQ;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iT) : iT + (size * iV);
    }

    static int t(List<Long> list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iS = 0;
            while (i10 < size) {
                iS += j.S(e0Var.o(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += j.S(list.get(i10).longValue());
                i10++;
            }
        }
        return iS;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = j.V(i10) * size;
        if (list instanceof e4.d) {
            e4.d dVar = (e4.d) list;
            while (i11 < size) {
                Object objM = dVar.m(i11);
                iV += objM instanceof g ? j.h((g) objM) : j.U((String) objM);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iV += obj instanceof g ? j.h((g) obj) : j.U((String) obj);
                i11++;
            }
        }
        return iV;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iW) : iW + (size * iV);
    }

    static int w(List<Integer> list) {
        int iX;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iX = 0;
            while (i10 < size) {
                iX += j.X(xVar.o(i10));
                i10++;
            }
        } else {
            iX = 0;
            while (i10 < size) {
                iX += j.X(list.get(i10).intValue());
                i10++;
            }
        }
        return iX;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iV = j.V(i10);
        return z10 ? iV + j.C(iY) : iY + (size * iV);
    }

    static int y(List<Long> list) {
        int iZ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iZ = 0;
            while (i10 < size) {
                iZ += j.Z(e0Var.o(i10));
                i10++;
            }
        } else {
            iZ = 0;
            while (i10 < size) {
                iZ += j.Z(list.get(i10).longValue());
                i10++;
            }
        }
        return iZ;
    }

    static <UT, UB> UB z(int i10, List<Integer> list, y.d<?> dVar, UB ub2, f1<UT, UB> f1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (dVar.a(iIntValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, iIntValue, ub2, f1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.a(iIntValue2) == null) {
                    ub2 = (UB) L(i10, iIntValue2, ub2, f1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
