package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements e1.a, Iterable<e1.b>, be.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20961b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20966g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<d, q0> f20968i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20960a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f20962c = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<d> f20967h = new ArrayList<>();

    public final v2 A() {
        if (!(!this.f20965f)) {
            o.u("Cannot start a writer when another writer is pending".toString());
            throw new md.i();
        }
        if (!(this.f20964e <= 0)) {
            o.u("Cannot start a writer when a reader is pending".toString());
            throw new md.i();
        }
        this.f20965f = true;
        this.f20966g++;
        return new v2(this);
    }

    public final boolean B(d dVar) {
        if (dVar.b()) {
            int iU = u2.U(this.f20967h, dVar.a(), this.f20961b);
            if (iU >= 0 && ae.r.b(this.f20967h.get(iU), dVar)) {
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList, HashMap<d, q0> map) {
        this.f20960a = iArr;
        this.f20961b = i10;
        this.f20962c = objArr;
        this.f20963d = i11;
        this.f20967h = arrayList;
        this.f20968i = map;
    }

    public final Object D(int i10, int i11) {
        int iV = u2.V(this.f20960a, i10);
        int i12 = i10 + 1;
        return i11 >= 0 && i11 < (i12 < this.f20961b ? u2.F(this.f20960a, i12) : this.f20962c.length) - iV ? this.f20962c[iV + i11] : l.f20813a.a();
    }

    public final q0 E(int i10) {
        d dVarF;
        HashMap<d, q0> map = this.f20968i;
        if (map == null || (dVarF = F(i10)) == null) {
            return null;
        }
        return map.get(dVarF);
    }

    public final d F(int i10) {
        if (!(!this.f20965f)) {
            o.u("use active SlotWriter to crate an anchor for location instead".toString());
            throw new md.i();
        }
        if (i10 >= 0 && i10 < this.f20961b) {
            return u2.G(this.f20967h, i10, this.f20961b);
        }
        return null;
    }

    public final d a(int i10) {
        if (!(!this.f20965f)) {
            o.u("use active SlotWriter to create an anchor location instead".toString());
            throw new md.i();
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f20961b) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<d> arrayList = this.f20967h;
        int iU = u2.U(arrayList, i10, this.f20961b);
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        d dVar = new d(i10);
        arrayList.add(-(iU + 1), dVar);
        return dVar;
    }

    public final int d(d dVar) {
        if (!(!this.f20965f)) {
            o.u("Use active SlotWriter to determine anchor location instead".toString());
            throw new md.i();
        }
        if (dVar.b()) {
            return dVar.a();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final void f(r2 r2Var, HashMap<d, q0> map) {
        if (!(r2Var.v() == this && this.f20964e > 0)) {
            o.u("Unexpected reader close()".toString());
            throw new md.i();
        }
        this.f20964e--;
        if (map != null) {
            synchronized (this) {
                HashMap<d, q0> map2 = this.f20968i;
                if (map2 != null) {
                    map2.putAll(map);
                } else {
                    this.f20968i = map;
                }
                md.i0 i0Var = md.i0.f15558a;
            }
        }
    }

    public boolean isEmpty() {
        return this.f20961b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<e1.b> iterator() {
        return new o0(this, 0, this.f20961b);
    }

    public final void l(v2 v2Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList, HashMap<d, q0> map) {
        if (!(v2Var.e0() == this && this.f20965f)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.f20965f = false;
        C(iArr, i10, objArr, i11, arrayList, map);
    }

    public final boolean n() {
        return this.f20961b > 0 && u2.D(this.f20960a, 0);
    }

    public final ArrayList<d> o() {
        return this.f20967h;
    }

    public final int[] r() {
        return this.f20960a;
    }

    public final int s() {
        return this.f20961b;
    }

    public final Object[] t() {
        return this.f20962c;
    }

    public final int u() {
        return this.f20963d;
    }

    public final HashMap<d, q0> v() {
        return this.f20968i;
    }

    public final int w() {
        return this.f20966g;
    }

    public final boolean x() {
        return this.f20965f;
    }

    public final boolean y(int i10, d dVar) {
        if (!(!this.f20965f)) {
            o.u("Writer is active".toString());
            throw new md.i();
        }
        if (!(i10 >= 0 && i10 < this.f20961b)) {
            o.u("Invalid group index".toString());
            throw new md.i();
        }
        if (B(dVar)) {
            int I = u2.I(this.f20960a, i10) + i10;
            int iA = dVar.a();
            if (i10 <= iA && iA < I) {
                return true;
            }
        }
        return false;
    }

    public final r2 z() {
        if (this.f20965f) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f20964e++;
        return new r2(this);
    }
}
