package l1;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class y extends n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1 f14643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f14645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14646e;

    private y(n1 n1Var, float f10, float f11, int i10) {
        super(null);
        this.f14643b = n1Var;
        this.f14644c = f10;
        this.f14645d = f11;
        this.f14646e = i10;
    }

    public /* synthetic */ y(n1 n1Var, float f10, float f11, int i10, ae.j jVar) {
        this(n1Var, f10, f11, i10);
    }

    @Override // l1.n1
    protected RenderEffect b() {
        return p1.f14562a.a(this.f14643b, this.f14644c, this.f14645d, this.f14646e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f14644c == yVar.f14644c) {
            return ((this.f14645d > yVar.f14645d ? 1 : (this.f14645d == yVar.f14645d ? 0 : -1)) == 0) && x1.f(this.f14646e, yVar.f14646e) && ae.r.b(this.f14643b, yVar.f14643b);
        }
        return false;
    }

    public int hashCode() {
        n1 n1Var = this.f14643b;
        return ((((((n1Var != null ? n1Var.hashCode() : 0) * 31) + Float.hashCode(this.f14644c)) * 31) + Float.hashCode(this.f14645d)) * 31) + x1.g(this.f14646e);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.f14643b + ", radiusX=" + this.f14644c + ", radiusY=" + this.f14645d + ", edgeTreatment=" + ((Object) x1.h(this.f14646e)) + ')';
    }
}
