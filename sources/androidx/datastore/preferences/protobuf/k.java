package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.l1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class k implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3655a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3656a;

        static {
            int[] iArr = new int[k1.b.values().length];
            f3656a = iArr;
            try {
                iArr[k1.b.f3670j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3656a[k1.b.f3669i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3656a[k1.b.f3667g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3656a[k1.b.f3677q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3656a[k1.b.f3679s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3656a[k1.b.f3675o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3656a[k1.b.f3668h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3656a[k1.b.f3665e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3656a[k1.b.f3678r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3656a[k1.b.f3680t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3656a[k1.b.f3666f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3656a[k1.b.f3671k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k(j jVar) {
        j jVar2 = (j) y.b(jVar, "output");
        this.f3655a = jVar2;
        jVar2.f3643a = this;
    }

    public static k P(j jVar) {
        k kVar = jVar.f3643a;
        return kVar != null ? kVar : new k(jVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, g0.a<Boolean, V> aVar) {
        this.f3655a.W0(i10, 2);
        this.f3655a.Y0(g0.b(aVar, Boolean.valueOf(z10), v10));
        g0.e(this.f3655a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, g0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f3655a.W0(i10, 2);
            this.f3655a.Y0(g0.b(aVar, Integer.valueOf(i13), v10));
            g0.e(this.f3655a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, g0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f3655a.W0(i10, 2);
            this.f3655a.Y0(g0.b(aVar, Long.valueOf(j10), v10));
            g0.e(this.f3655a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, g0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f3656a[aVar.f3576a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f3576a);
        }
    }

    private <V> void U(int i10, g0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f3655a.W0(i10, 2);
            this.f3655a.Y0(g0.b(aVar, str, v10));
            g0.e(this.f3655a, aVar, str, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f3655a.U0(i10, (String) obj);
        } else {
            this.f3655a.o0(i10, (g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.k0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += j.e(list.get(i12).booleanValue());
        }
        this.f3655a.Y0(iE);
        while (i11 < list.size()) {
            this.f3655a.l0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void B(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.X0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += j.X(list.get(i12).intValue());
        }
        this.f3655a.Y0(iX);
        while (i11 < list.size()) {
            this.f3655a.Y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void C(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.S0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += j.S(list.get(i12).longValue());
        }
        this.f3655a.Y0(iS);
        while (i11 < list.size()) {
            this.f3655a.T0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void D(int i10, long j10) {
        this.f3655a.S0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void E(int i10, float f10) {
        this.f3655a.y0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void F(int i10) {
        this.f3655a.W0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void G(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.Q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += j.Q(list.get(i12).intValue());
        }
        this.f3655a.Y0(iQ);
        while (i11 < list.size()) {
            this.f3655a.R0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void H(int i10, int i11) {
        this.f3655a.s0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void I(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.G0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += j.y(list.get(i12).longValue());
        }
        this.f3655a.Y0(iY);
        while (i11 < list.size()) {
            this.f3655a.H0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void J(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.s0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += j.l(list.get(i12).intValue());
        }
        this.f3655a.Y0(iL);
        while (i11 < list.size()) {
            this.f3655a.t0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void K(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.q0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += j.j(list.get(i12).doubleValue());
        }
        this.f3655a.Y0(iJ);
        while (i11 < list.size()) {
            this.f3655a.r0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public <K, V> void L(int i10, g0.a<K, V> aVar, Map<K, V> map) {
        if (this.f3655a.e0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f3655a.W0(i10, 2);
            this.f3655a.Y0(g0.b(aVar, entry.getKey(), entry.getValue()));
            g0.e(this.f3655a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void M(int i10, int i11) {
        this.f3655a.Q0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void N(int i10, List<g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f3655a.o0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void O(int i10, Object obj, z0 z0Var) {
        this.f3655a.B0(i10, (n0) obj, z0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.y0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += j.r(list.get(i12).floatValue());
        }
        this.f3655a.Y0(iR);
        while (i11 < list.size()) {
            this.f3655a.z0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void b(int i10, int i11) {
        this.f3655a.X0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public final void c(int i10, Object obj) {
        if (obj instanceof g) {
            this.f3655a.L0(i10, (g) obj);
        } else {
            this.f3655a.K0(i10, (n0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void d(int i10, int i11) {
        this.f3655a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void e(int i10, double d10) {
        this.f3655a.q0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void f(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += j.O(list.get(i12).longValue());
        }
        this.f3655a.Y0(iO);
        while (i11 < list.size()) {
            this.f3655a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void g(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.Z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += j.Z(list.get(i12).longValue());
        }
        this.f3655a.Y0(iZ);
        while (i11 < list.size()) {
            this.f3655a.a1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void h(int i10, long j10) {
        this.f3655a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public l1.a i() {
        return l1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void j(int i10, List<?> list, z0 z0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            z(i10, list.get(i11), z0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void k(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof e4.d)) {
            while (i11 < list.size()) {
                this.f3655a.U0(i10, list.get(i11));
                i11++;
            }
        } else {
            e4.d dVar = (e4.d) list;
            while (i11 < list.size()) {
                V(i10, dVar.m(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void l(int i10, List<?> list, z0 z0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), z0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void m(int i10, String str) {
        this.f3655a.U0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void n(int i10, long j10) {
        this.f3655a.Z0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void o(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.E0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += j.w(list.get(i12).intValue());
        }
        this.f3655a.Y0(iW);
        while (i11 < list.size()) {
            this.f3655a.F0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void p(int i10, long j10) {
        this.f3655a.G0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void q(int i10, boolean z10) {
        this.f3655a.k0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void r(int i10, int i11) {
        this.f3655a.M0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void s(int i10) {
        this.f3655a.W0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void t(int i10, int i11) {
        this.f3655a.E0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void u(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.w0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += j.p(list.get(i12).longValue());
        }
        this.f3655a.Y0(iP);
        while (i11 < list.size()) {
            this.f3655a.x0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void v(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += j.M(list.get(i12).intValue());
        }
        this.f3655a.Y0(iM);
        while (i11 < list.size()) {
            this.f3655a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void w(int i10, g gVar) {
        this.f3655a.o0(i10, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void x(int i10, long j10) {
        this.f3655a.O0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void y(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3655a.u0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f3655a.W0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += j.n(list.get(i12).intValue());
        }
        this.f3655a.Y0(iN);
        while (i11 < list.size()) {
            this.f3655a.v0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l1
    public void z(int i10, Object obj, z0 z0Var) {
        this.f3655a.I0(i10, (n0) obj, z0Var);
    }
}
