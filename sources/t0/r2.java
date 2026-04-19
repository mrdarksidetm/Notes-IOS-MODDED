package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f20912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f20915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<d, q0> f20917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20924m;

    public r2(s2 s2Var) {
        this.f20912a = s2Var;
        this.f20913b = s2Var.r();
        int iS = s2Var.s();
        this.f20914c = iS;
        this.f20915d = s2Var.t();
        this.f20916e = s2Var.u();
        this.f20920i = iS;
        this.f20921j = -1;
    }

    private final Object J(int[] iArr, int i10) {
        return u2.N(iArr, i10) ? this.f20915d[u2.R(iArr, i10)] : l.f20813a.a();
    }

    private final Object L(int[] iArr, int i10) {
        if (u2.L(iArr, i10)) {
            return this.f20915d[u2.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return u2.J(iArr, i10) ? this.f20915d[u2.B(iArr, i10)] : l.f20813a.a();
    }

    public final Object A(int i10) {
        return L(this.f20913b, i10);
    }

    public final int B(int i10) {
        return u2.I(this.f20913b, i10);
    }

    public final boolean C(int i10) {
        return u2.K(this.f20913b, i10);
    }

    public final boolean D(int i10) {
        return u2.L(this.f20913b, i10);
    }

    public final boolean E() {
        return r() || this.f20919h == this.f20920i;
    }

    public final boolean F() {
        return u2.N(this.f20913b, this.f20919h);
    }

    public final boolean G(int i10) {
        return u2.N(this.f20913b, i10);
    }

    public final Object H() {
        int i10;
        if (this.f20922k > 0 || (i10 = this.f20923l) >= this.f20924m) {
            return l.f20813a.a();
        }
        Object[] objArr = this.f20915d;
        this.f20923l = i10 + 1;
        return objArr[i10];
    }

    public final Object I(int i10) {
        if (u2.N(this.f20913b, i10)) {
            return J(this.f20913b, i10);
        }
        return null;
    }

    public final int K(int i10) {
        return u2.Q(this.f20913b, i10);
    }

    public final int M(int i10) {
        return u2.T(this.f20913b, i10);
    }

    public final void N(int i10) {
        if (!(this.f20922k == 0)) {
            o.u("Cannot reposition while in an empty region".toString());
            throw new md.i();
        }
        this.f20919h = i10;
        int iT = i10 < this.f20914c ? u2.T(this.f20913b, i10) : -1;
        this.f20921j = iT;
        this.f20920i = iT < 0 ? this.f20914c : iT + u2.I(this.f20913b, iT);
        this.f20923l = 0;
        this.f20924m = 0;
    }

    public final void O(int i10) {
        int I = u2.I(this.f20913b, i10) + i10;
        int i11 = this.f20919h;
        if (i11 >= i10 && i11 <= I) {
            this.f20921j = i10;
            this.f20920i = I;
            this.f20923l = 0;
            this.f20924m = 0;
            return;
        }
        o.u(("Index " + i10 + " is not a parent of " + i11).toString());
        throw new md.i();
    }

    public final int P() {
        if (!(this.f20922k == 0)) {
            o.u("Cannot skip while in an empty region".toString());
            throw new md.i();
        }
        int iQ = u2.N(this.f20913b, this.f20919h) ? 1 : u2.Q(this.f20913b, this.f20919h);
        int i10 = this.f20919h;
        this.f20919h = i10 + u2.I(this.f20913b, i10);
        return iQ;
    }

    public final void Q() {
        if (this.f20922k == 0) {
            this.f20919h = this.f20920i;
        } else {
            o.u("Cannot skip the enclosing group while in an empty region".toString());
            throw new md.i();
        }
    }

    public final void R() {
        q0 q0Var;
        if (this.f20922k <= 0) {
            int i10 = this.f20921j;
            int i11 = this.f20919h;
            if (!(u2.T(this.f20913b, i11) == i10)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            HashMap<d, q0> map = this.f20917f;
            if (map != null && (q0Var = map.get(a(i10))) != null) {
                q0Var.h(this.f20912a, i11);
            }
            this.f20921j = i11;
            this.f20920i = u2.I(this.f20913b, i11) + i11;
            int i12 = i11 + 1;
            this.f20919h = i12;
            this.f20923l = u2.V(this.f20913b, i11);
            this.f20924m = i11 >= this.f20914c - 1 ? this.f20916e : u2.F(this.f20913b, i12);
        }
    }

    public final void S() {
        if (this.f20922k <= 0) {
            if (!u2.N(this.f20913b, this.f20919h)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            R();
        }
    }

    public final d a(int i10) {
        ArrayList<d> arrayListO = this.f20912a.o();
        int iU = u2.U(arrayListO, i10, this.f20914c);
        if (iU >= 0) {
            return arrayListO.get(iU);
        }
        d dVar = new d(i10);
        arrayListO.add(-(iU + 1), dVar);
        return dVar;
    }

    public final void c() {
        this.f20922k++;
    }

    public final void d() {
        this.f20918g = true;
        this.f20912a.f(this, this.f20917f);
    }

    public final boolean e(int i10) {
        return u2.D(this.f20913b, i10);
    }

    public final void f() {
        int i10 = this.f20922k;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.f20922k = i10 - 1;
    }

    public final void g() {
        if (this.f20922k == 0) {
            if (!(this.f20919h == this.f20920i)) {
                o.u("endGroup() not called at the end of a group".toString());
                throw new md.i();
            }
            int iT = u2.T(this.f20913b, this.f20921j);
            this.f20921j = iT;
            this.f20920i = iT < 0 ? this.f20914c : iT + u2.I(this.f20913b, iT);
        }
    }

    public final List<w0> h() {
        ArrayList arrayList = new ArrayList();
        if (this.f20922k > 0) {
            return arrayList;
        }
        int I = this.f20919h;
        int i10 = 0;
        while (I < this.f20920i) {
            arrayList.add(new w0(u2.O(this.f20913b, I), L(this.f20913b, I), I, u2.N(this.f20913b, I) ? 1 : u2.Q(this.f20913b, I), i10));
            I += u2.I(this.f20913b, I);
            i10++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f20918g;
    }

    public final int j() {
        return this.f20920i;
    }

    public final int k() {
        return this.f20919h;
    }

    public final Object l() {
        int i10 = this.f20919h;
        if (i10 < this.f20920i) {
            return b(this.f20913b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f20920i;
    }

    public final int n() {
        int i10 = this.f20919h;
        if (i10 < this.f20920i) {
            return u2.O(this.f20913b, i10);
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f20919h;
        if (i10 < this.f20920i) {
            return L(this.f20913b, i10);
        }
        return null;
    }

    public final int p() {
        return u2.I(this.f20913b, this.f20919h);
    }

    public final int q() {
        return this.f20923l - u2.V(this.f20913b, this.f20921j);
    }

    public final boolean r() {
        return this.f20922k > 0;
    }

    public final int s() {
        return this.f20921j;
    }

    public final int t() {
        int i10 = this.f20921j;
        if (i10 >= 0) {
            return u2.Q(this.f20913b, i10);
        }
        return 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f20919h + ", key=" + n() + ", parent=" + this.f20921j + ", end=" + this.f20920i + ')';
    }

    public final int u() {
        return this.f20914c;
    }

    public final s2 v() {
        return this.f20912a;
    }

    public final Object w(int i10) {
        return b(this.f20913b, i10);
    }

    public final Object x(int i10) {
        return y(this.f20919h, i10);
    }

    public final Object y(int i10, int i11) {
        int iV = u2.V(this.f20913b, i10);
        int i12 = i10 + 1;
        int i13 = iV + i11;
        return i13 < (i12 < this.f20914c ? u2.F(this.f20913b, i12) : this.f20916e) ? this.f20915d[i13] : l.f20813a.a();
    }

    public final int z(int i10) {
        return u2.O(this.f20913b, i10);
    }
}
