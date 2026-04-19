package h0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f11655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f11657c;

    public e0() {
        this(0.0f, false, null, 7, null);
    }

    public e0(float f10, boolean z10, k kVar) {
        this.f11655a = f10;
        this.f11656b = z10;
        this.f11657c = kVar;
    }

    public /* synthetic */ e0(float f10, boolean z10, k kVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : kVar);
    }

    public final k a() {
        return this.f11657c;
    }

    public final boolean b() {
        return this.f11656b;
    }

    public final float c() {
        return this.f11655a;
    }

    public final void d(k kVar) {
        this.f11657c = kVar;
    }

    public final void e(boolean z10) {
        this.f11656b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Float.compare(this.f11655a, e0Var.f11655a) == 0 && this.f11656b == e0Var.f11656b && ae.r.b(this.f11657c, e0Var.f11657c);
    }

    public final void f(float f10) {
        this.f11655a = f10;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f11655a) * 31) + Boolean.hashCode(this.f11656b)) * 31;
        k kVar = this.f11657c;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f11655a + ", fill=" + this.f11656b + ", crossAxisAlignment=" + this.f11657c + ')';
    }
}
