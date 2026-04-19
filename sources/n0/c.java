package n0;

import ge.o;
import i2.g0;
import i2.h0;
import n2.t;
import nd.u;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f15607h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15608i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static c f15609j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f15610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f15611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w2.d f15612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.b f15613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0 f15614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f15615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f15616g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final c a(c cVar, r rVar, g0 g0Var, w2.d dVar, t.b bVar) {
            if (cVar != null && rVar == cVar.g() && ae.r.b(g0Var, cVar.f())) {
                if ((dVar.getDensity() == cVar.d().getDensity()) && bVar == cVar.e()) {
                    return cVar;
                }
            }
            c cVar2 = c.f15609j;
            if (cVar2 != null && rVar == cVar2.g() && ae.r.b(g0Var, cVar2.f())) {
                if ((dVar.getDensity() == cVar2.d().getDensity()) && bVar == cVar2.e()) {
                    return cVar2;
                }
            }
            c cVar3 = new c(rVar, h0.c(g0Var, rVar), dVar, bVar, null);
            c.f15609j = cVar3;
            return cVar3;
        }
    }

    private c(r rVar, g0 g0Var, w2.d dVar, t.b bVar) {
        this.f15610a = rVar;
        this.f15611b = g0Var;
        this.f15612c = dVar;
        this.f15613d = bVar;
        this.f15614e = h0.c(g0Var, rVar);
        this.f15615f = Float.NaN;
        this.f15616g = Float.NaN;
    }

    public /* synthetic */ c(r rVar, g0 g0Var, w2.d dVar, t.b bVar, ae.j jVar) {
        this(rVar, g0Var, dVar, bVar);
    }

    public final long c(long j10, int i10) {
        float height = this.f15616g;
        float height2 = this.f15615f;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = i2.r.a(d.f15617a, this.f15614e, w2.c.b(0, 0, 0, 0, 15, null), this.f15612c, this.f15613d, (96 & 32) != 0 ? u.m() : null, (96 & 64) != 0 ? u.m() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 1, (96 & 256) != 0 ? false : false).getHeight();
            height2 = i2.r.a(d.f15618b, this.f15614e, w2.c.b(0, 0, 0, 0, 15, null), this.f15612c, this.f15613d, (96 & 32) != 0 ? u.m() : null, (96 & 64) != 0 ? u.m() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 2, (96 & 256) != 0 ? false : false).getHeight() - height;
            this.f15616g = height;
            this.f15615f = height2;
        }
        return w2.c.a(w2.b.p(j10), w2.b.n(j10), i10 != 1 ? o.h(o.d(ce.c.d(height + (height2 * (i10 - 1))), 0), w2.b.m(j10)) : w2.b.o(j10), w2.b.m(j10));
    }

    public final w2.d d() {
        return this.f15612c;
    }

    public final t.b e() {
        return this.f15613d;
    }

    public final g0 f() {
        return this.f15611b;
    }

    public final r g() {
        return this.f15610a;
    }
}
