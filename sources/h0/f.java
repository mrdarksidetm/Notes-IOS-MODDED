package h0;

/* JADX INFO: loaded from: classes.dex */
final class f implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2.d f11658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.f f11660c;

    private f(w2.d dVar, long j10) {
        this.f11658a = dVar;
        this.f11659b = j10;
        this.f11660c = androidx.compose.foundation.layout.f.f2502a;
    }

    public /* synthetic */ f(w2.d dVar, long j10, ae.j jVar) {
        this(dVar, j10);
    }

    @Override // h0.c
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return this.f11660c.a(eVar);
    }

    @Override // h0.e
    public float b() {
        return w2.b.j(d()) ? this.f11658a.l0(w2.b.n(d())) : w2.h.f22405b.b();
    }

    @Override // h0.c
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, f1.b bVar) {
        return this.f11660c.c(eVar, bVar);
    }

    public long d() {
        return this.f11659b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ae.r.b(this.f11658a, fVar.f11658a) && w2.b.g(this.f11659b, fVar.f11659b);
    }

    public int hashCode() {
        return (this.f11658a.hashCode() * 31) + w2.b.q(this.f11659b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f11658a + ", constraints=" + ((Object) w2.b.s(this.f11659b)) + ')';
    }
}
