package h0;

/* JADX INFO: loaded from: classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11797d;

    private z(float f10, float f11, float f12, float f13) {
        this.f11794a = f10;
        this.f11795b = f11;
        this.f11796c = f12;
        this.f11797d = f13;
    }

    public /* synthetic */ z(float f10, float f11, float f12, float f13, ae.j jVar) {
        this(f10, f11, f12, f13);
    }

    @Override // h0.y
    public float a() {
        return this.f11797d;
    }

    @Override // h0.y
    public float b(w2.r rVar) {
        return rVar == w2.r.Ltr ? this.f11796c : this.f11794a;
    }

    @Override // h0.y
    public float c() {
        return this.f11795b;
    }

    @Override // h0.y
    public float d(w2.r rVar) {
        return rVar == w2.r.Ltr ? this.f11794a : this.f11796c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return w2.h.o(this.f11794a, zVar.f11794a) && w2.h.o(this.f11795b, zVar.f11795b) && w2.h.o(this.f11796c, zVar.f11796c) && w2.h.o(this.f11797d, zVar.f11797d);
    }

    public int hashCode() {
        return (((((w2.h.p(this.f11794a) * 31) + w2.h.p(this.f11795b)) * 31) + w2.h.p(this.f11796c)) * 31) + w2.h.p(this.f11797d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) w2.h.q(this.f11794a)) + ", top=" + ((Object) w2.h.q(this.f11795b)) + ", end=" + ((Object) w2.h.q(this.f11796c)) + ", bottom=" + ((Object) w2.h.q(this.f11797d)) + ')';
    }
}
