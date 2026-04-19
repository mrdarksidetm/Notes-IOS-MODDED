package androidx.compose.ui.graphics;

import a2.r0;
import ae.j;
import ae.r;
import l1.j0;
import l1.n1;
import l1.t1;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends r0<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f2749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f2750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f2751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f2752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f2753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f2754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f2755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f2756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t1 f2757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n1 f2759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f2760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f2761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f2762r;

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10) {
        this.f2746b = f10;
        this.f2747c = f11;
        this.f2748d = f12;
        this.f2749e = f13;
        this.f2750f = f14;
        this.f2751g = f15;
        this.f2752h = f16;
        this.f2753i = f17;
        this.f2754j = f18;
        this.f2755k = f19;
        this.f2756l = j10;
        this.f2757m = t1Var;
        this.f2758n = z10;
        this.f2759o = n1Var;
        this.f2760p = j11;
        this.f2761q = j12;
        this.f2762r = i10;
    }

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10, j jVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, t1Var, z10, n1Var, j11, j12, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f2746b, graphicsLayerElement.f2746b) == 0 && Float.compare(this.f2747c, graphicsLayerElement.f2747c) == 0 && Float.compare(this.f2748d, graphicsLayerElement.f2748d) == 0 && Float.compare(this.f2749e, graphicsLayerElement.f2749e) == 0 && Float.compare(this.f2750f, graphicsLayerElement.f2750f) == 0 && Float.compare(this.f2751g, graphicsLayerElement.f2751g) == 0 && Float.compare(this.f2752h, graphicsLayerElement.f2752h) == 0 && Float.compare(this.f2753i, graphicsLayerElement.f2753i) == 0 && Float.compare(this.f2754j, graphicsLayerElement.f2754j) == 0 && Float.compare(this.f2755k, graphicsLayerElement.f2755k) == 0 && g.e(this.f2756l, graphicsLayerElement.f2756l) && r.b(this.f2757m, graphicsLayerElement.f2757m) && this.f2758n == graphicsLayerElement.f2758n && r.b(this.f2759o, graphicsLayerElement.f2759o) && j0.w(this.f2760p, graphicsLayerElement.f2760p) && j0.w(this.f2761q, graphicsLayerElement.f2761q) && b.e(this.f2762r, graphicsLayerElement.f2762r);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.f2746b, this.f2747c, this.f2748d, this.f2749e, this.f2750f, this.f2751g, this.f2752h, this.f2753i, this.f2754j, this.f2755k, this.f2756l, this.f2757m, this.f2758n, this.f2759o, this.f2760p, this.f2761q, this.f2762r, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.f2746b) * 31) + Float.hashCode(this.f2747c)) * 31) + Float.hashCode(this.f2748d)) * 31) + Float.hashCode(this.f2749e)) * 31) + Float.hashCode(this.f2750f)) * 31) + Float.hashCode(this.f2751g)) * 31) + Float.hashCode(this.f2752h)) * 31) + Float.hashCode(this.f2753i)) * 31) + Float.hashCode(this.f2754j)) * 31) + Float.hashCode(this.f2755k)) * 31) + g.h(this.f2756l)) * 31) + this.f2757m.hashCode()) * 31) + Boolean.hashCode(this.f2758n)) * 31;
        n1 n1Var = this.f2759o;
        return ((((((iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31) + j0.C(this.f2760p)) * 31) + j0.C(this.f2761q)) * 31) + b.f(this.f2762r);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(f fVar) {
        fVar.t(this.f2746b);
        fVar.m(this.f2747c);
        fVar.b(this.f2748d);
        fVar.u(this.f2749e);
        fVar.i(this.f2750f);
        fVar.H(this.f2751g);
        fVar.z(this.f2752h);
        fVar.e(this.f2753i);
        fVar.h(this.f2754j);
        fVar.y(this.f2755k);
        fVar.b1(this.f2756l);
        fVar.d1(this.f2757m);
        fVar.U0(this.f2758n);
        fVar.n(this.f2759o);
        fVar.K0(this.f2760p);
        fVar.e1(this.f2761q);
        fVar.o(this.f2762r);
        fVar.j2();
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f2746b + ", scaleY=" + this.f2747c + ", alpha=" + this.f2748d + ", translationX=" + this.f2749e + ", translationY=" + this.f2750f + ", shadowElevation=" + this.f2751g + ", rotationX=" + this.f2752h + ", rotationY=" + this.f2753i + ", rotationZ=" + this.f2754j + ", cameraDistance=" + this.f2755k + ", transformOrigin=" + ((Object) g.i(this.f2756l)) + ", shape=" + this.f2757m + ", clip=" + this.f2758n + ", renderEffect=" + this.f2759o + ", ambientShadowColor=" + ((Object) j0.D(this.f2760p)) + ", spotShadowColor=" + ((Object) j0.D(this.f2761q)) + ", compositingStrategy=" + ((Object) b.g(this.f2762r)) + ')';
    }
}
