package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<w0> f20975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<w0> f20978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<Integer, n0> f20979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final md.l f20980f;

    static final class a extends ae.s implements zd.a<HashMap<Object, LinkedHashSet<w0>>> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<Object, LinkedHashSet<w0>> invoke() {
            HashMap<Object, LinkedHashSet<w0>> mapJ = o.J();
            t1 t1Var = t1.this;
            int size = t1Var.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                w0 w0Var = t1Var.b().get(i10);
                o.M(mapJ, o.D(w0Var), w0Var);
            }
            return mapJ;
        }
    }

    public t1(List<w0> list, int i10) {
        this.f20975a = list;
        this.f20976b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.f20978d = new ArrayList();
        HashMap<Integer, n0> map = new HashMap<>();
        int size = list.size();
        int iC = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w0 w0Var = this.f20975a.get(i11);
            map.put(Integer.valueOf(w0Var.b()), new n0(i11, iC, w0Var.c()));
            iC += w0Var.c();
        }
        this.f20979e = map;
        this.f20980f = md.n.b(new a());
    }

    public final int a() {
        return this.f20977c;
    }

    public final List<w0> b() {
        return this.f20975a;
    }

    public final HashMap<Object, LinkedHashSet<w0>> c() {
        return (HashMap) this.f20980f.getValue();
    }

    public final w0 d(int i10, Object obj) {
        return (w0) o.L(c(), obj != null ? new v0(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f20976b;
    }

    public final List<w0> f() {
        return this.f20978d;
    }

    public final int g(w0 w0Var) {
        n0 n0Var = this.f20979e.get(Integer.valueOf(w0Var.b()));
        if (n0Var != null) {
            return n0Var.b();
        }
        return -1;
    }

    public final boolean h(w0 w0Var) {
        return this.f20978d.add(w0Var);
    }

    public final void i(w0 w0Var, int i10) {
        this.f20979e.put(Integer.valueOf(w0Var.b()), new n0(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i10 > i11) {
            for (n0 n0Var : this.f20979e.values()) {
                int iB = n0Var.b();
                if (i10 <= iB && iB < i10 + i12) {
                    i14 = (iB - i10) + i11;
                } else if (i11 <= iB && iB < i10) {
                    i14 = iB + i12;
                }
                n0Var.e(i14);
            }
            return;
        }
        if (i11 > i10) {
            for (n0 n0Var2 : this.f20979e.values()) {
                int iB2 = n0Var2.b();
                if (i10 <= iB2 && iB2 < i10 + i12) {
                    i13 = (iB2 - i10) + i11;
                } else if (i10 + 1 <= iB2 && iB2 < i11) {
                    i13 = iB2 - i12;
                }
                n0Var2.e(i13);
            }
        }
    }

    public final void k(int i10, int i11) {
        if (i10 > i11) {
            for (n0 n0Var : this.f20979e.values()) {
                int iC = n0Var.c();
                if (iC == i10) {
                    n0Var.f(i11);
                } else if (i11 <= iC && iC < i10) {
                    n0Var.f(iC + 1);
                }
            }
            return;
        }
        if (i11 > i10) {
            for (n0 n0Var2 : this.f20979e.values()) {
                int iC2 = n0Var2.c();
                if (iC2 == i10) {
                    n0Var2.f(i11);
                } else if (i10 + 1 <= iC2 && iC2 < i11) {
                    n0Var2.f(iC2 - 1);
                }
            }
        }
    }

    public final void l(int i10) {
        this.f20977c = i10;
    }

    public final int m(w0 w0Var) {
        n0 n0Var = this.f20979e.get(Integer.valueOf(w0Var.b()));
        if (n0Var != null) {
            return n0Var.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int iB;
        n0 n0Var = this.f20979e.get(Integer.valueOf(i10));
        if (n0Var == null) {
            return false;
        }
        int iB2 = n0Var.b();
        int iA = i11 - n0Var.a();
        n0Var.d(i11);
        if (iA == 0) {
            return true;
        }
        for (n0 n0Var2 : this.f20979e.values()) {
            if (n0Var2.b() >= iB2 && !ae.r.b(n0Var2, n0Var) && (iB = n0Var2.b() + iA) >= 0) {
                n0Var2.e(iB);
            }
        }
        return true;
    }

    public final int o(w0 w0Var) {
        n0 n0Var = this.f20979e.get(Integer.valueOf(w0Var.b()));
        return n0Var != null ? n0Var.a() : w0Var.c();
    }
}
