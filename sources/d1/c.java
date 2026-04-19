package d1;

import d1.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f9328p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9329q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f9330r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v0.b<g0> f9334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<? extends g0> f9335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n f9336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f9337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9339o;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public c(int i10, n nVar, zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
        super(i10, nVar, null);
        this.f9331g = lVar;
        this.f9332h = lVar2;
        this.f9336l = n.f9390e.a();
        this.f9337m = f9330r;
        this.f9338n = 1;
    }

    private final void A() {
        v0.b<g0> bVarE = E();
        if (bVarE != null) {
            Q();
            O(null);
            int iF = f();
            Object[] objArrN = bVarE.n();
            int size = bVarE.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = objArrN[i10];
                ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (i0 i0VarF = ((g0) obj).f(); i0VarF != null; i0VarF = i0VarF.e()) {
                    if (i0VarF.f() == iF || nd.c0.S(this.f9336l, Integer.valueOf(i0VarF.f()))) {
                        i0VarF.h(0);
                    }
                }
            }
        }
        b();
    }

    private final void M() {
        int length = this.f9337m.length;
        for (int i10 = 0; i10 < length; i10++) {
            p.Y(this.f9337m[i10]);
        }
    }

    private final void Q() {
        if (!(!this.f9339o)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void R() {
        /*
            r3 = this;
            boolean r0 = r3.f9339o
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = d1.k.a(r3)
            if (r0 < 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.R():void");
    }

    public final void B() {
        I(f());
        md.i0 i0Var = md.i0.f15558a;
        if (D() || e()) {
            return;
        }
        int iF = f();
        synchronized (p.I()) {
            int i10 = p.f9406e;
            p.f9406e = i10 + 1;
            u(i10);
            p.f9405d = p.f9405d.v(f());
        }
        v(p.z(g(), iF + 1, f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d1.l C() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.C():d1.l");
    }

    public final boolean D() {
        return this.f9339o;
    }

    public v0.b<g0> E() {
        return this.f9334j;
    }

    public final n F() {
        return this.f9336l;
    }

    public final int[] G() {
        return this.f9337m;
    }

    public final l H(int i10, Map<i0, ? extends i0> map, n nVar) {
        n nVar2;
        i0 i0VarW;
        i0 i0VarL;
        n nVarU = g().v(f()).u(this.f9336l);
        v0.b<g0> bVarE = E();
        ae.r.c(bVarE);
        Object[] objArrN = bVarE.n();
        int size = bVarE.size();
        ArrayList arrayList = null;
        List<? extends g0> listN0 = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = objArrN[i11];
            ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            g0 g0Var = (g0) obj;
            i0 i0VarF = g0Var.f();
            i0 i0VarW2 = p.W(i0VarF, i10, nVar);
            if (i0VarW2 == null || (i0VarW = p.W(i0VarF, f(), nVarU)) == null || ae.r.b(i0VarW2, i0VarW)) {
                nVar2 = nVarU;
            } else {
                nVar2 = nVarU;
                i0 i0VarW3 = p.W(i0VarF, f(), g());
                if (i0VarW3 == null) {
                    p.V();
                    throw new md.i();
                }
                if (map == null || (i0VarL = map.get(i0VarW2)) == null) {
                    i0VarL = g0Var.l(i0VarW, i0VarW2, i0VarW3);
                }
                if (i0VarL == null) {
                    return new l.a(this);
                }
                if (!ae.r.b(i0VarL, i0VarW3)) {
                    if (ae.r.b(i0VarL, i0VarW2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(md.x.a(g0Var, i0VarW2.d()));
                        if (listN0 == null) {
                            listN0 = new ArrayList();
                        }
                        listN0.add(g0Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!ae.r.b(i0VarL, i0VarW) ? md.x.a(g0Var, i0VarL) : md.x.a(g0Var, i0VarW.d()));
                    }
                }
            }
            i11++;
            nVarU = nVar2;
        }
        if (arrayList != null) {
            B();
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                md.s sVar = (md.s) arrayList.get(i12);
                g0 g0Var2 = (g0) sVar.a();
                i0 i0Var = (i0) sVar.b();
                i0Var.h(f());
                synchronized (p.I()) {
                    i0Var.g(g0Var2.f());
                    g0Var2.n(i0Var);
                    md.i0 i0Var2 = md.i0.f15558a;
                }
            }
        }
        if (listN0 != null) {
            int size3 = listN0.size();
            for (int i13 = 0; i13 < size3; i13++) {
                bVarE.remove(listN0.get(i13));
            }
            List<? extends g0> list = this.f9335k;
            if (list != null) {
                listN0 = nd.c0.n0(list, listN0);
            }
            this.f9335k = listN0;
        }
        return l.b.f9378a;
    }

    public final void I(int i10) {
        synchronized (p.I()) {
            this.f9336l = this.f9336l.v(i10);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void J(n nVar) {
        synchronized (p.I()) {
            this.f9336l = this.f9336l.u(nVar);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void K(int i10) {
        if (i10 >= 0) {
            this.f9337m = nd.o.v(this.f9337m, i10);
        }
    }

    public final void L(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f9337m;
        if (!(iArr2.length == 0)) {
            iArr = nd.o.w(iArr2, iArr);
        }
        this.f9337m = iArr;
    }

    public final void N(boolean z10) {
        this.f9339o = z10;
    }

    public void O(v0.b<g0> bVar) {
        this.f9334j = bVar;
    }

    public c P(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
        d dVar;
        z();
        R();
        I(f());
        synchronized (p.I()) {
            int i10 = p.f9406e;
            p.f9406e = i10 + 1;
            p.f9405d = p.f9405d.v(i10);
            n nVarG = g();
            v(nVarG.v(i10));
            dVar = new d(i10, p.z(nVarG, f() + 1, i10), p.L(lVar, h(), false, 4, null), p.M(lVar2, k()), this);
        }
        if (!D() && !e()) {
            int iF = f();
            synchronized (p.I()) {
                int i11 = p.f9406e;
                p.f9406e = i11 + 1;
                u(i11);
                p.f9405d = p.f9405d.v(f());
                md.i0 i0Var = md.i0.f15558a;
            }
            v(p.z(g(), iF + 1, f()));
        }
        return dVar;
    }

    @Override // d1.k
    public void c() {
        p.f9405d = p.f9405d.r(f()).o(this.f9336l);
    }

    @Override // d1.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // d1.k
    public zd.l<Object, md.i0> h() {
        return this.f9331g;
    }

    @Override // d1.k
    public boolean i() {
        return false;
    }

    @Override // d1.k
    public int j() {
        return this.f9333i;
    }

    @Override // d1.k
    public zd.l<Object, md.i0> k() {
        return this.f9332h;
    }

    @Override // d1.k
    public void m(k kVar) {
        this.f9338n++;
    }

    @Override // d1.k
    public void n(k kVar) {
        int i10 = this.f9338n;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("no pending nested snapshots".toString());
        }
        int i11 = i10 - 1;
        this.f9338n = i11;
        if (i11 != 0 || this.f9339o) {
            return;
        }
        A();
    }

    @Override // d1.k
    public void o() {
        if (this.f9339o || e()) {
            return;
        }
        B();
    }

    @Override // d1.k
    public void p(g0 g0Var) {
        v0.b<g0> bVarE = E();
        if (bVarE == null) {
            bVarE = new v0.b<>();
            O(bVarE);
        }
        bVarE.add(g0Var);
    }

    @Override // d1.k
    public void r() {
        M();
        super.r();
    }

    @Override // d1.k
    public void w(int i10) {
        this.f9333i = i10;
    }

    @Override // d1.k
    public k x(zd.l<Object, md.i0> lVar) {
        e eVar;
        z();
        R();
        int iF = f();
        I(f());
        synchronized (p.I()) {
            int i10 = p.f9406e;
            p.f9406e = i10 + 1;
            p.f9405d = p.f9405d.v(i10);
            eVar = new e(i10, p.z(g(), iF + 1, i10), lVar, this);
        }
        if (!D() && !e()) {
            int iF2 = f();
            synchronized (p.I()) {
                int i11 = p.f9406e;
                p.f9406e = i11 + 1;
                u(i11);
                p.f9405d = p.f9405d.v(f());
                md.i0 i0Var = md.i0.f15558a;
            }
            v(p.z(g(), iF2 + 1, f()));
        }
        return eVar;
    }
}
