package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t0.l;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f21000w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21001x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f21002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f21003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f21004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<d> f21005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<d, q0> f21006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21015n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21020s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x1 f21023v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r0 f21016o = new r0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r0 f21017p = new r0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r0 f21018q = new r0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21021t = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final List<d> b(v2 v2Var, int i10, v2 v2Var2, boolean z10, boolean z11, boolean z12) {
            boolean z13;
            List<d> listM;
            int i11;
            HashMap map;
            int i12;
            int iJ0 = v2Var.j0(i10);
            int i13 = i10 + iJ0;
            int iP = v2Var.P(i10);
            int iP2 = v2Var.P(i13);
            int i14 = iP2 - iP;
            boolean zM = v2Var.M(i10);
            v2Var2.o0(iJ0);
            v2Var2.p0(i14, v2Var2.a0());
            if (v2Var.f21007f < i13) {
                v2Var.x0(i13);
            }
            if (v2Var.f21011j < iP2) {
                v2Var.z0(iP2, i13);
            }
            int[] iArr = v2Var2.f21003b;
            int iA0 = v2Var2.a0();
            nd.o.f(v2Var.f21003b, iArr, iA0 * 5, i10 * 5, i13 * 5);
            Object[] objArr = v2Var2.f21004c;
            int i15 = v2Var2.f21009h;
            nd.o.h(v2Var.f21004c, objArr, i15, iP, iP2);
            int iC0 = v2Var2.c0();
            u2.b0(iArr, iA0, iC0);
            int i16 = iA0 - i10;
            int i17 = iA0 + iJ0;
            int iQ = i15 - v2Var2.Q(iArr, iA0);
            int i18 = v2Var2.f21013l;
            int i19 = v2Var2.f21012k;
            int length = objArr.length;
            int i20 = i18;
            int i21 = iA0;
            while (true) {
                z13 = 0;
                if (i21 >= i17) {
                    break;
                }
                if (i21 != iA0) {
                    i12 = i17;
                    u2.b0(iArr, i21, u2.T(iArr, i21) + i16);
                } else {
                    i12 = i17;
                }
                int i22 = iQ;
                u2.X(iArr, i21, v2Var2.S(v2Var2.Q(iArr, i21) + iQ, i20 >= i21 ? v2Var2.f21011j : 0, i19, length));
                if (i21 == i20) {
                    i20++;
                }
                i21++;
                iQ = i22;
                i17 = i12;
            }
            int i23 = i17;
            v2Var2.f21013l = i20;
            int iP3 = u2.P(v2Var.f21005d, i10, v2Var.d0());
            int iP4 = u2.P(v2Var.f21005d, i13, v2Var.d0());
            if (iP3 < iP4) {
                ArrayList arrayList = v2Var.f21005d;
                ArrayList arrayList2 = new ArrayList(iP4 - iP3);
                for (int i24 = iP3; i24 < iP4; i24++) {
                    d dVar = (d) arrayList.get(i24);
                    dVar.c(dVar.a() + i16);
                    arrayList2.add(dVar);
                }
                v2Var2.f21005d.addAll(u2.P(v2Var2.f21005d, v2Var2.a0(), v2Var2.d0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listM = arrayList2;
            } else {
                listM = nd.u.m();
            }
            if ((!listM.isEmpty()) && (map = v2Var.f21006e) != null) {
                HashMap map2 = v2Var2.f21006e;
                int size = listM.size();
                for (int i25 = 0; i25 < size; i25++) {
                    d dVar2 = listM.get(i25);
                    q0 q0Var = (q0) map.get(dVar2);
                    if (q0Var != null) {
                        map.remove(dVar2);
                        if (map2 == null) {
                            a aVar = v2.f21000w;
                            map2 = new HashMap();
                            v2Var2.f21006e = map2;
                        }
                        map2.put(dVar2, q0Var);
                    }
                }
                if (map.isEmpty()) {
                    v2Var.f21006e = null;
                }
            }
            int iC02 = v2Var2.c0();
            q0 q0VarA1 = v2Var2.a1(iC0);
            if (q0VarA1 != null) {
                int i26 = -1;
                int I = iC02 + 1;
                int iA02 = v2Var2.a0();
                while (true) {
                    i11 = i26;
                    i26 = I;
                    if (i26 >= iA02) {
                        break;
                    }
                    I = u2.I(v2Var2.f21003b, i26) + i26;
                }
                q0VarA1.b(v2Var2, i11, iA02);
            }
            int iF0 = v2Var.F0(i10);
            if (z12) {
                if (z10) {
                    boolean z14 = iF0 >= 0;
                    if (z14) {
                        v2Var.c1();
                        v2Var.E(iF0 - v2Var.a0());
                        v2Var.c1();
                    }
                    v2Var.E(i10 - v2Var.a0());
                    boolean zL0 = v2Var.L0();
                    if (z14) {
                        v2Var.W0();
                        v2Var.T();
                        v2Var.W0();
                        v2Var.T();
                    }
                    z13 = zL0;
                } else {
                    boolean zM0 = v2Var.M0(i10, iJ0);
                    v2Var.N0(iP, i14, i10 - 1);
                    z13 = zM0;
                }
            }
            if ((!z13) == 0) {
                o.u("Unexpectedly removed anchors".toString());
                throw new md.i();
            }
            v2Var2.f21015n += u2.N(iArr, iA0) ? 1 : u2.Q(iArr, iA0);
            if (z11) {
                v2Var2.f21019r = i23;
                v2Var2.f21009h = i15 + i14;
            }
            if (zM) {
                v2Var2.k1(iC0);
            }
            return listM;
        }

        static /* synthetic */ List c(a aVar, v2 v2Var, int i10, v2 v2Var2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(v2Var, i10, v2Var2, z10, z11, z12);
        }
    }

    public static final class b implements Iterator<Object>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v2 f21026c;

        b(int i10, int i11, v2 v2Var) {
            this.f21025b = i11;
            this.f21026c = v2Var;
            this.f21024a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21024a < this.f21025b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f21026c.f21004c;
            v2 v2Var = this.f21026c;
            int i10 = this.f21024a;
            this.f21024a = i10 + 1;
            return objArr[v2Var.R(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v2(s2 s2Var) {
        this.f21002a = s2Var;
        this.f21003b = s2Var.r();
        this.f21004c = s2Var.t();
        this.f21005d = s2Var.o();
        this.f21006e = s2Var.v();
        this.f21007f = s2Var.s();
        this.f21008g = (this.f21003b.length / 5) - s2Var.s();
        this.f21011j = s2Var.u();
        this.f21012k = this.f21004c.length - s2Var.u();
        this.f21013l = s2Var.s();
        this.f21020s = s2Var.s();
    }

    private final int E0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int G0(int[] iArr, int i10) {
        return H0(u2.T(iArr, g0(i10)));
    }

    private final int H(int[] iArr, int i10) {
        return Q(iArr, i10) + u2.E(u2.H(iArr, i10) >> 29);
    }

    private final int H0(int i10) {
        return i10 > -2 ? i10 : d0() + i10 + 2;
    }

    private final int I0(int i10, int i11) {
        return i10 < i11 ? i10 : -((d0() - i10) + 2);
    }

    private final boolean J(int i10) {
        int iJ0 = i10 + 1;
        int iJ02 = i10 + j0(i10);
        while (iJ0 < iJ02) {
            if (u2.C(this.f21003b, g0(iJ0))) {
                return true;
            }
            iJ0 += j0(iJ0);
        }
        return false;
    }

    private final void J0() {
        x1 x1Var = this.f21023v;
        if (x1Var != null) {
            while (x1Var.b()) {
                l1(x1Var.d(), x1Var);
            }
        }
    }

    private final void K() {
        int i10 = this.f21011j;
        nd.o.q(this.f21004c, null, i10, this.f21012k + i10);
    }

    private final boolean K0(int i10, int i11, HashMap<d, q0> map) {
        int i12 = i11 + i10;
        int iP = u2.P(this.f21005d, i12, Y() - this.f21008g);
        if (iP >= this.f21005d.size()) {
            iP--;
        }
        int i13 = iP + 1;
        int i14 = 0;
        while (iP >= 0) {
            d dVar = this.f21005d.get(iP);
            int iG = G(dVar);
            if (iG < i10) {
                break;
            }
            if (iG < i12) {
                dVar.c(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(dVar);
                }
                if (i14 == 0) {
                    i14 = iP + 1;
                }
                i13 = iP;
            }
            iP--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f21005d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int i10) {
        return i10 >= 0 && u2.C(this.f21003b, g0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0(int i10, int i11) {
        if (i11 > 0) {
            ArrayList<d> arrayList = this.f21005d;
            x0(i10);
            zK0 = arrayList.isEmpty() ^ true ? K0(i10, i11, this.f21006e) : false;
            this.f21007f = i10;
            this.f21008g += i11;
            int i12 = this.f21013l;
            if (i12 > i10) {
                this.f21013l = Math.max(i10, i12 - i11);
            }
            int i13 = this.f21020s;
            if (i13 >= this.f21007f) {
                this.f21020s = i13 - i11;
            }
            int i14 = this.f21021t;
            if (N(i14)) {
                k1(i14);
            }
        }
        return zK0;
    }

    private final boolean N(int i10) {
        return i10 >= 0 && u2.D(this.f21003b, g0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f21012k;
            int i14 = i10 + i11;
            z0(i14, i12);
            this.f21011j = i10;
            this.f21012k = i13 + i11;
            nd.o.q(this.f21004c, null, i10, i14);
            int i15 = this.f21010i;
            if (i15 >= i10) {
                this.f21010i = i15 - i11;
            }
        }
    }

    private final int O(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int i10) {
        return Q(this.f21003b, g0(i10));
    }

    private final int P0() {
        int iY = (Y() - this.f21008g) - this.f21017p.h();
        this.f21020s = iY;
        return iY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        return i10 >= Y() ? this.f21004c.length - this.f21012k : O(u2.F(iArr, i10), this.f21012k, this.f21004c.length);
    }

    private final void Q0() {
        this.f21017p.i((Y() - this.f21008g) - this.f21020s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i10) {
        return i10 < this.f21011j ? i10 : i10 + this.f21012k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final void X(int i10, int i11, int i12) {
        int iI0 = I0(i10, this.f21007f);
        while (i12 < i11) {
            u2.b0(this.f21003b, g0(i12), iI0);
            int I = u2.I(this.f21003b, g0(i12)) + i12;
            X(i12, I, i12 + 1);
            i12 = I;
        }
    }

    private final int Y() {
        return this.f21003b.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z0(int[] iArr, int i10) {
        return i10 >= Y() ? this.f21004c.length - this.f21012k : O(u2.V(iArr, i10), this.f21012k, this.f21004c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 a1(int i10) {
        d dVarG1;
        HashMap<d, q0> map = this.f21006e;
        if (map == null || (dVarG1 = g1(i10)) == null) {
            return null;
        }
        return map.get(dVarG1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e1(int i10, Object obj, boolean z10, Object obj2) {
        int I;
        q0 q0VarA1;
        int i11 = this.f21021t;
        byte b10 = this.f21014m > 0;
        this.f21018q.i(this.f21015n);
        if (b10 == true) {
            o0(1);
            int i12 = this.f21019r;
            int iG0 = g0(i12);
            l.a aVar = l.f20813a;
            int i13 = obj != aVar.a() ? 1 : 0;
            int i14 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            u2.M(this.f21003b, iG0, i10, z10, i13, i14, this.f21021t, this.f21009h);
            this.f21010i = this.f21009h;
            int i15 = (z10 ? 1 : 0) + i13 + i14;
            if (i15 > 0) {
                p0(i15, i12);
                Object[] objArr = this.f21004c;
                int i16 = this.f21009h;
                if (z10) {
                    objArr[i16] = obj2;
                    i16++;
                }
                if (i13 != 0) {
                    objArr[i16] = obj;
                    i16++;
                }
                if (i14 != 0) {
                    objArr[i16] = obj2;
                    i16++;
                }
                this.f21009h = i16;
            }
            this.f21015n = 0;
            I = i12 + 1;
            this.f21021t = i12;
            this.f21019r = I;
            if (i11 >= 0 && (q0VarA1 = a1(i11)) != null) {
                q0VarA1.i(this, i12);
            }
        } else {
            this.f21016o.i(i11);
            Q0();
            int i17 = this.f21019r;
            int iG02 = g0(i17);
            if (!ae.r.b(obj2, l.f20813a.a())) {
                if (z10) {
                    n1(obj2);
                } else {
                    j1(obj2);
                }
            }
            this.f21009h = Z0(this.f21003b, iG02);
            this.f21010i = Q(this.f21003b, g0(this.f21019r + 1));
            this.f21015n = u2.Q(this.f21003b, iG02);
            this.f21021t = i17;
            this.f21019r = i17 + 1;
            I = i17 + u2.I(this.f21003b, iG02);
        }
        this.f21020s = I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g0(int i10) {
        return i10 < this.f21007f ? i10 : i10 + this.f21008g;
    }

    private final void i1(int i10, int i11) {
        d dVar;
        int iA;
        d dVar2;
        int iA2;
        int i12;
        int iY = Y() - this.f21008g;
        if (i10 >= i11) {
            for (int iP = u2.P(this.f21005d, i11, iY); iP < this.f21005d.size() && (iA = (dVar = this.f21005d.get(iP)).a()) >= 0; iP++) {
                dVar.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = u2.P(this.f21005d, i10, iY); iP2 < this.f21005d.size() && (iA2 = (dVar2 = this.f21005d.get(iP2)).a()) < 0 && (i12 = iA2 + iY) < i11; iP2++) {
            dVar2.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1(int i10) {
        if (i10 >= 0) {
            x1 x1Var = this.f21023v;
            if (x1Var == null) {
                x1Var = new x1(null, 1, 0 == true ? 1 : 0);
                this.f21023v = x1Var;
            }
            x1Var.a(i10);
        }
    }

    private final void l1(int i10, x1 x1Var) {
        int iG0 = g0(i10);
        boolean zJ = J(i10);
        if (u2.D(this.f21003b, iG0) != zJ) {
            u2.W(this.f21003b, iG0, zJ);
            int iF0 = F0(i10);
            if (iF0 >= 0) {
                x1Var.a(iF0);
            }
        }
    }

    private final void m1(int[] iArr, int i10, int i11) {
        u2.X(iArr, i10, S(i11, this.f21011j, this.f21012k, this.f21004c.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(int i10) {
        if (i10 > 0) {
            int i11 = this.f21019r;
            x0(i11);
            int i12 = this.f21007f;
            int i13 = this.f21008g;
            int[] iArr = this.f21003b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                nd.o.f(iArr, iArr2, 0, 0, i12 * 5);
                nd.o.f(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f21003b = iArr2;
                i13 = i15;
            }
            int i16 = this.f21020s;
            if (i16 >= i12) {
                this.f21020s = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f21007f = i17;
            this.f21008g = i13 - i10;
            int iS = S(i14 > 0 ? P(i11 + i10) : 0, this.f21013l >= i12 ? this.f21011j : 0, this.f21012k, this.f21004c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                u2.X(this.f21003b, i18, iS);
            }
            int i19 = this.f21013l;
            if (i19 >= i12) {
                this.f21013l = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i10, int i11) {
        if (i10 > 0) {
            z0(this.f21009h, i11);
            int i12 = this.f21011j;
            int i13 = this.f21012k;
            if (i13 < i10) {
                Object[] objArr = this.f21004c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                nd.o.h(objArr, objArr2, 0, 0, i12);
                nd.o.h(objArr, objArr2, i12 + i16, i17, length);
                this.f21004c = objArr2;
                i13 = i16;
            }
            int i18 = this.f21010i;
            if (i18 >= i12) {
                this.f21010i = i18 + i10;
            }
            this.f21011j = i12 + i10;
            this.f21012k = i13 - i10;
        }
    }

    private final void p1(int i10, Object obj) {
        int iG0 = g0(i10);
        int[] iArr = this.f21003b;
        if (iG0 < iArr.length && u2.N(iArr, iG0)) {
            this.f21004c[R(E0(this.f21003b, iG0))] = obj;
            return;
        }
        o.u(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw new md.i();
    }

    public static /* synthetic */ void t0(v2 v2Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = v2Var.f21021t;
        }
        v2Var.s0(i10);
    }

    private final void u0(int i10, int i11, int i12) {
        d dVar;
        int iG;
        int i13 = i12 + i10;
        int iD0 = d0();
        int iP = u2.P(this.f21005d, i10, iD0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.f21005d.size() && (iG = G((dVar = this.f21005d.get(iP)))) >= i10 && iG < i13) {
                arrayList.add(dVar);
                this.f21005d.remove(iP);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar2 = (d) arrayList.get(i15);
            int iG2 = G(dVar2) + i14;
            if (iG2 >= this.f21007f) {
                dVar2.c(-(iD0 - iG2));
            } else {
                dVar2.c(iG2);
            }
            this.f21005d.add(u2.P(this.f21005d, iG2, iD0), dVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i10) {
        int i11 = this.f21008g;
        int i12 = this.f21007f;
        if (i12 != i10) {
            if (!this.f21005d.isEmpty()) {
                i1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f21003b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    nd.o.f(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    nd.o.f(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iY = Y();
            o.S(i12 < iY);
            while (i12 < iY) {
                int iT = u2.T(this.f21003b, i12);
                int iI0 = I0(H0(iT), i10);
                if (iI0 != iT) {
                    u2.b0(this.f21003b, i12, iI0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f21007f = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int i10, int i11) {
        int i12 = this.f21012k;
        int i13 = this.f21011j;
        int i14 = this.f21013l;
        if (i13 != i10) {
            Object[] objArr = this.f21004c;
            if (i10 < i13) {
                nd.o.h(objArr, objArr, i10 + i12, i10, i13);
            } else {
                nd.o.h(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int iMin = Math.min(i11 + 1, d0());
        if (i14 != iMin) {
            int length = this.f21004c.length - i12;
            if (iMin < i14) {
                int iG0 = g0(iMin);
                int iG02 = g0(i14);
                int i15 = this.f21007f;
                while (iG0 < iG02) {
                    int iF = u2.F(this.f21003b, iG0);
                    if (!(iF >= 0)) {
                        o.u("Unexpected anchor value, expected a positive anchor".toString());
                        throw new md.i();
                    }
                    u2.X(this.f21003b, iG0, -((length - iF) + 1));
                    iG0++;
                    if (iG0 == i15) {
                        iG0 += this.f21008g;
                    }
                }
            } else {
                int iG03 = g0(i14);
                int iG04 = g0(iMin);
                while (iG03 < iG04) {
                    int iF2 = u2.F(this.f21003b, iG03);
                    if (!(iF2 < 0)) {
                        o.u("Unexpected anchor value, expected a negative anchor".toString());
                        throw new md.i();
                    }
                    u2.X(this.f21003b, iG03, iF2 + length + 1);
                    iG03++;
                    if (iG03 == this.f21007f) {
                        iG03 += this.f21008g;
                    }
                }
            }
            this.f21013l = iMin;
        }
        this.f21011j = i10;
    }

    public final List<d> A0(d dVar, int i10, v2 v2Var) {
        o.S(v2Var.f21014m > 0);
        o.S(this.f21014m == 0);
        o.S(dVar.b());
        int iG = G(dVar) + i10;
        int i11 = this.f21019r;
        o.S(i11 <= iG && iG < this.f21020s);
        int iF0 = F0(iG);
        int iJ0 = j0(iG);
        int iD0 = r0(iG) ? 1 : D0(iG);
        List<d> listC = a.c(f21000w, this, iG, v2Var, false, false, false, 32, null);
        k1(iF0);
        boolean z10 = iD0 > 0;
        while (iF0 >= i11) {
            int iG0 = g0(iF0);
            int[] iArr = this.f21003b;
            u2.Y(iArr, iG0, u2.I(iArr, iG0) - iJ0);
            if (z10) {
                if (u2.N(this.f21003b, iG0)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.f21003b;
                    u2.a0(iArr2, iG0, u2.Q(iArr2, iG0) - iD0);
                }
            }
            iF0 = F0(iF0);
        }
        if (z10) {
            o.S(this.f21015n >= iD0);
            this.f21015n -= iD0;
        }
        return listC;
    }

    public final Object B0(int i10) {
        int iG0 = g0(i10);
        if (u2.N(this.f21003b, iG0)) {
            return this.f21004c[R(E0(this.f21003b, iG0))];
        }
        return null;
    }

    public final Object C0(d dVar) {
        return B0(dVar.e(this));
    }

    public final int D0(int i10) {
        return u2.Q(this.f21003b, g0(i10));
    }

    public final void E(int i10) {
        if (!(i10 >= 0)) {
            o.u("Cannot seek backwards".toString());
            throw new md.i();
        }
        if (!(this.f21014m <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f21019r + i10;
        if (i11 >= this.f21021t && i11 <= this.f21020s) {
            this.f21019r = i11;
            int iQ = Q(this.f21003b, g0(i11));
            this.f21009h = iQ;
            this.f21010i = iQ;
            return;
        }
        o.u(("Cannot seek outside the current group (" + this.f21021t + '-' + this.f21020s + ')').toString());
        throw new md.i();
    }

    public final d F(int i10) {
        ArrayList<d> arrayList = this.f21005d;
        int iU = u2.U(arrayList, i10, d0());
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        if (i10 > this.f21007f) {
            i10 = -(d0() - i10);
        }
        d dVar = new d(i10);
        arrayList.add(-(iU + 1), dVar);
        return dVar;
    }

    public final int F0(int i10) {
        return G0(this.f21003b, i10);
    }

    public final int G(d dVar) {
        int iA = dVar.a();
        return iA < 0 ? iA + d0() : iA;
    }

    public final void I() {
        int i10 = this.f21014m;
        this.f21014m = i10 + 1;
        if (i10 == 0) {
            Q0();
        }
    }

    public final void L() {
        this.f21022u = true;
        if (this.f21016o.d()) {
            x0(d0());
            z0(this.f21004c.length - this.f21012k, this.f21007f);
            K();
            J0();
        }
        this.f21002a.l(this, this.f21003b, this.f21007f, this.f21004c, this.f21011j, this.f21005d, this.f21006e);
    }

    public final boolean L0() {
        d dVarG1;
        if (!(this.f21014m == 0)) {
            o.u("Cannot remove group while inserting".toString());
            throw new md.i();
        }
        int i10 = this.f21019r;
        int i11 = this.f21009h;
        int iV0 = V0();
        q0 q0VarA1 = a1(this.f21021t);
        if (q0VarA1 != null && (dVarG1 = g1(i10)) != null) {
            q0VarA1.g(dVarG1);
        }
        x1 x1Var = this.f21023v;
        if (x1Var != null) {
            while (x1Var.b() && x1Var.c() >= i10) {
                x1Var.d();
            }
        }
        boolean zM0 = M0(i10, this.f21019r - i10);
        N0(i11, this.f21009h - i11, i10 - 1);
        this.f21019r = i10;
        this.f21009h = i11;
        this.f21015n -= iV0;
        return zM0;
    }

    public final void O0() {
        if (!(this.f21014m == 0)) {
            o.u("Cannot reset when inserting".toString());
            throw new md.i();
        }
        J0();
        this.f21019r = 0;
        this.f21020s = Y() - this.f21008g;
        this.f21009h = 0;
        this.f21010i = 0;
        this.f21015n = 0;
    }

    public final Object R0(int i10, int i11, Object obj) {
        int iZ0 = Z0(this.f21003b, g0(i10));
        int i12 = iZ0 + i11;
        if (i12 >= iZ0 && i12 < Q(this.f21003b, g0(i10 + 1))) {
            int iR = R(i12);
            Object[] objArr = this.f21004c;
            Object obj2 = objArr[iR];
            objArr[iR] = obj;
            return obj2;
        }
        o.u(("Write to an invalid slot index " + i11 + " for group " + i10).toString());
        throw new md.i();
    }

    public final Object S0(int i10, Object obj) {
        return R0(this.f21019r, i10, obj);
    }

    public final int T() {
        boolean z10 = this.f21014m > 0;
        int i10 = this.f21019r;
        int i11 = this.f21020s;
        int i12 = this.f21021t;
        int iG0 = g0(i12);
        int i13 = this.f21015n;
        int i14 = i10 - i12;
        boolean zN = u2.N(this.f21003b, iG0);
        if (z10) {
            u2.Y(this.f21003b, iG0, i14);
            u2.a0(this.f21003b, iG0, i13);
            this.f21015n = this.f21018q.h() + (zN ? 1 : i13);
            this.f21021t = G0(this.f21003b, i12);
        } else {
            if ((i10 != i11 ? 0 : 1) == 0) {
                o.u("Expected to be at the end of a group".toString());
                throw new md.i();
            }
            int I = u2.I(this.f21003b, iG0);
            int iQ = u2.Q(this.f21003b, iG0);
            u2.Y(this.f21003b, iG0, i14);
            u2.a0(this.f21003b, iG0, i13);
            int iH = this.f21016o.h();
            P0();
            this.f21021t = iH;
            int iG02 = G0(this.f21003b, i12);
            int iH2 = this.f21018q.h();
            this.f21015n = iH2;
            if (iG02 == iH) {
                this.f21015n = iH2 + (zN ? 0 : i13 - iQ);
            } else {
                int i15 = i14 - I;
                int i16 = zN ? 0 : i13 - iQ;
                if (i15 != 0 || i16 != 0) {
                    while (iG02 != 0 && iG02 != iH && (i16 != 0 || i15 != 0)) {
                        int iG03 = g0(iG02);
                        if (i15 != 0) {
                            u2.Y(this.f21003b, iG03, u2.I(this.f21003b, iG03) + i15);
                        }
                        if (i16 != 0) {
                            int[] iArr = this.f21003b;
                            u2.a0(iArr, iG03, u2.Q(iArr, iG03) + i16);
                        }
                        if (u2.N(this.f21003b, iG03)) {
                            i16 = 0;
                        }
                        iG02 = G0(this.f21003b, iG02);
                    }
                }
                this.f21015n += i16;
            }
        }
        return i13;
    }

    public final void T0(Object obj) {
        int i10 = this.f21009h;
        if (i10 <= this.f21010i) {
            this.f21004c[R(i10 - 1)] = obj;
        } else {
            o.u("Writing to an invalid slot".toString());
            throw new md.i();
        }
    }

    public final void U() {
        int i10 = this.f21014m;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i11 = i10 - 1;
        this.f21014m = i11;
        if (i11 == 0) {
            if (this.f21018q.b() == this.f21016o.b()) {
                P0();
            } else {
                o.u("startGroup/endGroup mismatch while inserting".toString());
                throw new md.i();
            }
        }
    }

    public final Object U0() {
        if (this.f21014m > 0) {
            p0(1, this.f21021t);
        }
        Object[] objArr = this.f21004c;
        int i10 = this.f21009h;
        this.f21009h = i10 + 1;
        return objArr[R(i10)];
    }

    public final void V(int i10) {
        if (!(this.f21014m <= 0)) {
            o.u("Cannot call ensureStarted() while inserting".toString());
            throw new md.i();
        }
        int i11 = this.f21021t;
        if (i11 != i10) {
            if (!(i10 >= i11 && i10 < this.f21020s)) {
                o.u(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw new md.i();
            }
            int i12 = this.f21019r;
            int i13 = this.f21009h;
            int i14 = this.f21010i;
            this.f21019r = i10;
            c1();
            this.f21019r = i12;
            this.f21009h = i13;
            this.f21010i = i14;
        }
    }

    public final int V0() {
        int iG0 = g0(this.f21019r);
        int I = this.f21019r + u2.I(this.f21003b, iG0);
        this.f21019r = I;
        this.f21009h = Q(this.f21003b, g0(I));
        if (u2.N(this.f21003b, iG0)) {
            return 1;
        }
        return u2.Q(this.f21003b, iG0);
    }

    public final void W(d dVar) {
        V(dVar.e(this));
    }

    public final void W0() {
        int i10 = this.f21020s;
        this.f21019r = i10;
        this.f21009h = Q(this.f21003b, g0(i10));
    }

    public final Object X0(int i10, int i11) {
        int iZ0 = Z0(this.f21003b, g0(i10));
        int i12 = i11 + iZ0;
        if (iZ0 <= i12 && i12 < Q(this.f21003b, g0(i10 + 1))) {
            return this.f21004c[R(i12)];
        }
        return l.f20813a.a();
    }

    public final Object Y0(d dVar, int i10) {
        return X0(G(dVar), i10);
    }

    public final boolean Z() {
        return this.f21022u;
    }

    public final int a0() {
        return this.f21019r;
    }

    public final int b0() {
        return this.f21020s;
    }

    public final void b1(int i10, Object obj, Object obj2) {
        e1(i10, obj, false, obj2);
    }

    public final int c0() {
        return this.f21021t;
    }

    public final void c1() {
        if (!(this.f21014m == 0)) {
            o.u("Key must be supplied when inserting".toString());
            throw new md.i();
        }
        l.a aVar = l.f20813a;
        e1(0, aVar.a(), false, aVar.a());
    }

    public final int d0() {
        return Y() - this.f21008g;
    }

    public final void d1(int i10, Object obj) {
        e1(i10, obj, false, l.f20813a.a());
    }

    public final s2 e0() {
        return this.f21002a;
    }

    public final Object f0(int i10) {
        int iG0 = g0(i10);
        return u2.J(this.f21003b, iG0) ? this.f21004c[H(this.f21003b, iG0)] : l.f20813a.a();
    }

    public final void f1(int i10, Object obj) {
        e1(i10, obj, true, l.f20813a.a());
    }

    public final d g1(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < d0()) {
            z10 = true;
        }
        if (z10) {
            return u2.G(this.f21005d, i10, d0());
        }
        return null;
    }

    public final int h0(int i10) {
        return u2.O(this.f21003b, g0(i10));
    }

    public final Object h1(Object obj) {
        Object objU0 = U0();
        T0(obj);
        return objU0;
    }

    public final Object i0(int i10) {
        int iG0 = g0(i10);
        if (u2.L(this.f21003b, iG0)) {
            return this.f21004c[u2.S(this.f21003b, iG0)];
        }
        return null;
    }

    public final int j0(int i10) {
        return u2.I(this.f21003b, g0(i10));
    }

    public final void j1(Object obj) {
        int iG0 = g0(this.f21019r);
        if (u2.J(this.f21003b, iG0)) {
            this.f21004c[R(H(this.f21003b, iG0))] = obj;
        } else {
            o.u("Updating the data of a group that was not created with a data slot".toString());
            throw new md.i();
        }
    }

    public final Iterator<Object> k0() {
        int iQ = Q(this.f21003b, g0(this.f21019r));
        int[] iArr = this.f21003b;
        int i10 = this.f21019r;
        return new b(iQ, Q(iArr, g0(i10 + j0(i10))), this);
    }

    public final boolean l0(int i10) {
        return m0(i10, this.f21019r);
    }

    public final boolean m0(int i10, int i11) {
        int iC;
        return i10 > i11 && i10 < (i11 == this.f21021t ? this.f21020s : (i11 <= this.f21016o.g(0) && (iC = this.f21016o.c(i11)) >= 0) ? (Y() - this.f21008g) - this.f21017p.f(iC) : j0(i11) + i11);
    }

    public final boolean n0(int i10) {
        int i11 = this.f21021t;
        return (i10 > i11 && i10 < this.f21020s) || (i11 == 0 && i10 == 0);
    }

    public final void n1(Object obj) {
        p1(this.f21019r, obj);
    }

    public final void o1(d dVar, Object obj) {
        p1(dVar.e(this), obj);
    }

    public final boolean q0() {
        int i10 = this.f21019r;
        return i10 < this.f21020s && u2.N(this.f21003b, g0(i10));
    }

    public final boolean r0(int i10) {
        return u2.N(this.f21003b, g0(i10));
    }

    public final void s0(int i10) {
        int iG0 = g0(i10);
        if (u2.K(this.f21003b, iG0)) {
            return;
        }
        u2.Z(this.f21003b, iG0, true);
        if (u2.D(this.f21003b, iG0)) {
            return;
        }
        k1(F0(i10));
    }

    public String toString() {
        return "SlotWriter(current = " + this.f21019r + " end=" + this.f21020s + " size = " + d0() + " gap=" + this.f21007f + '-' + (this.f21007f + this.f21008g) + ')';
    }

    public final List<d> v0(s2 s2Var, int i10, boolean z10) {
        o.S(this.f21014m > 0);
        if (i10 != 0 || this.f21019r != 0 || this.f21002a.s() != 0 || u2.I(s2Var.r(), i10) != s2Var.s()) {
            v2 v2VarA = s2Var.A();
            try {
                return f21000w.b(v2VarA, i10, this, true, true, z10);
            } finally {
                v2VarA.L();
            }
        }
        int[] iArr = this.f21003b;
        Object[] objArr = this.f21004c;
        ArrayList<d> arrayList = this.f21005d;
        HashMap<d, q0> map = this.f21006e;
        int[] iArrR = s2Var.r();
        int iS = s2Var.s();
        Object[] objArrT = s2Var.t();
        int iU = s2Var.u();
        HashMap<d, q0> mapV = s2Var.v();
        this.f21003b = iArrR;
        this.f21004c = objArrT;
        this.f21005d = s2Var.o();
        this.f21007f = iS;
        this.f21008g = (iArrR.length / 5) - iS;
        this.f21011j = iU;
        this.f21012k = objArrT.length - iU;
        this.f21013l = iS;
        this.f21006e = mapV;
        s2Var.C(iArr, 0, objArr, 0, arrayList, map);
        return this.f21005d;
    }

    public final void w0(int i10) {
        if (!(this.f21014m == 0)) {
            o.u("Cannot move a group while inserting".toString());
            throw new md.i();
        }
        if (!(i10 >= 0)) {
            o.u("Parameter offset is out of bounds".toString());
            throw new md.i();
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f21019r;
        int i12 = this.f21021t;
        int i13 = this.f21020s;
        int I = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            I += u2.I(this.f21003b, g0(I));
            if (!(I <= i13)) {
                o.u("Parameter offset is out of bounds".toString());
                throw new md.i();
            }
        }
        int I2 = u2.I(this.f21003b, g0(I));
        int i15 = this.f21009h;
        int iQ = Q(this.f21003b, g0(I));
        int i16 = I + I2;
        int iQ2 = Q(this.f21003b, g0(i16));
        int i17 = iQ2 - iQ;
        p0(i17, Math.max(this.f21019r - 1, 0));
        o0(I2);
        int[] iArr = this.f21003b;
        int iG0 = g0(i16) * 5;
        nd.o.f(iArr, iArr, g0(i11) * 5, iG0, (I2 * 5) + iG0);
        if (i17 > 0) {
            Object[] objArr = this.f21004c;
            nd.o.h(objArr, objArr, i15, R(iQ + i17), R(iQ2 + i17));
        }
        int i18 = iQ + i17;
        int i19 = i18 - i15;
        int i20 = this.f21011j;
        int i21 = this.f21012k;
        int length = this.f21004c.length;
        int i22 = this.f21013l;
        int i23 = i11 + I2;
        int i24 = i11;
        while (i24 < i23) {
            int iG02 = g0(i24);
            int i25 = i20;
            int i26 = i19;
            m1(iArr, iG02, S(Q(iArr, iG02) - i19, i22 < iG02 ? 0 : i25, i21, length));
            i24++;
            i20 = i25;
            i19 = i26;
        }
        u0(i16, i11, I2);
        if (!(!M0(i16, I2))) {
            o.u("Unexpectedly removed anchors".toString());
            throw new md.i();
        }
        X(i12, this.f21020s, i11);
        if (i17 > 0) {
            N0(i18, i17, i16 - 1);
        }
    }

    public final List<d> y0(int i10, s2 s2Var, int i11) {
        o.S(this.f21014m <= 0 && j0(this.f21019r + i10) == 1);
        int i12 = this.f21019r;
        int i13 = this.f21009h;
        int i14 = this.f21010i;
        E(i10);
        c1();
        I();
        v2 v2VarA = s2Var.A();
        try {
            List<d> listC = a.c(f21000w, v2VarA, i11, this, false, true, false, 32, null);
            v2VarA.L();
            U();
            T();
            this.f21019r = i12;
            this.f21009h = i13;
            this.f21010i = i14;
            return listC;
        } catch (Throwable th) {
            v2VarA.L();
            throw th;
        }
    }
}
