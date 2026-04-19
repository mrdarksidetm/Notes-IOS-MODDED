package i0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12160c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z.u<Object, i0.d> f12158a = z.z.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j0.t f12159b = j0.t.f13763a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z.v<Object> f12161d = z.b0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<x> f12162e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<x> f12163f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<x> f12164g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<x> f12165h = new ArrayList();

    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0.t f12166a;

        public a(j0.t tVar) {
            this.f12166a = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(Integer.valueOf(this.f12166a.b(((x) t10).g())), Integer.valueOf(this.f12166a.b(((x) t11).g())));
        }
    }

    public static final class b<T> implements Comparator {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(Integer.valueOf(l.this.f12159b.b(((x) t10).g())), Integer.valueOf(l.this.f12159b.b(((x) t11).g())));
        }
    }

    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0.t f12168a;

        public c(j0.t tVar) {
            this.f12168a = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(Integer.valueOf(this.f12168a.b(((x) t11).g())), Integer.valueOf(this.f12168a.b(((x) t10).g())));
        }
    }

    public static final class d<T> implements Comparator {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(Integer.valueOf(l.this.f12159b.b(((x) t11).g())), Integer.valueOf(l.this.f12159b.b(((x) t10).g())));
        }
    }

    private final boolean c(x xVar) {
        int iN = xVar.n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (m.c(xVar.m(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final void d(x xVar, int i10, i0.d dVar) {
        int i11;
        int i12;
        Object obj;
        long j10;
        int i13;
        long jC = xVar.c();
        if (xVar.o()) {
            i13 = 0;
            i12 = 1;
            obj = null;
            j10 = jC;
            i11 = i10;
        } else {
            i11 = 0;
            i12 = 2;
            obj = null;
            j10 = jC;
            i13 = i10;
        }
        long jG = w2.n.g(j10, i13, i11, i12, obj);
        j0.f[] fVarArrA = dVar.a();
        for (j0.f fVar : fVarArrA) {
            if (fVar != null) {
                long jC2 = xVar.c();
                long jA = w2.o.a(w2.n.j(jC2) - w2.n.j(jC), w2.n.k(jC2) - w2.n.k(jC));
                fVar.r(w2.o.a(w2.n.j(jG) + w2.n.j(jA), w2.n.k(jG) + w2.n.k(jA)));
            }
        }
    }

    static /* synthetic */ void e(l lVar, x xVar, int i10, i0.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i0.d dVarB = lVar.f12158a.b(xVar.g());
            ae.r.c(dVarB);
            dVar = dVarB;
        }
        lVar.d(xVar, i10, dVar);
    }

    private final void h(x xVar) {
        i0.d dVarB = this.f12158a.b(xVar.g());
        ae.r.c(dVarB);
        for (j0.f fVar : dVarB.a()) {
            if (fVar != null) {
                long jC = xVar.c();
                long jI = fVar.i();
                if (!w2.n.i(jI, j0.f.f13639m.a()) && !w2.n.i(jI, jC)) {
                    fVar.f(w2.o.a(w2.n.j(jC) - w2.n.j(jI), w2.n.k(jC) - w2.n.k(jI)));
                }
                fVar.r(jC);
            }
        }
    }

    public final j0.f b(Object obj, int i10) {
        i0.d dVarB;
        j0.f[] fVarArrA;
        if (this.f12158a.e() || (dVarB = this.f12158a.b(obj)) == null || (fVarArrA = dVarB.a()) == null) {
            return null;
        }
        return fVarArrA[i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0316 A[LOOP:9: B:128:0x02fc->B:138:0x0316, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0314 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r36, int r37, int r38, java.util.List<i0.x> r39, i0.y r40, i0.g0 r41, boolean r42, le.n0 r43) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.f(int, int, int, java.util.List, i0.y, i0.g0, boolean, le.n0):void");
    }

    public final void g() {
        this.f12158a.h();
        this.f12159b = j0.t.f13763a;
        this.f12160c = -1;
    }
}
