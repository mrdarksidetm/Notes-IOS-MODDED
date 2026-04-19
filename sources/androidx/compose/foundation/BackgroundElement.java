package androidx.compose.foundation;

import a2.r0;
import ae.r;
import b2.w0;
import l1.j0;
import l1.t1;
import l1.z;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends r0<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f2186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f2188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zd.l<w0, i0> f2189f;

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j10, z zVar, float f10, t1 t1Var, zd.l<? super w0, i0> lVar) {
        this.f2185b = j10;
        this.f2186c = zVar;
        this.f2187d = f10;
        this.f2188e = t1Var;
        this.f2189f = lVar;
    }

    public /* synthetic */ BackgroundElement(long j10, z zVar, float f10, t1 t1Var, zd.l lVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? j0.f14524b.j() : j10, (i10 & 2) != 0 ? null : zVar, f10, t1Var, lVar, null);
    }

    public /* synthetic */ BackgroundElement(long j10, z zVar, float f10, t1 t1Var, zd.l lVar, ae.j jVar) {
        this(j10, zVar, f10, t1Var, lVar);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement != null && j0.w(this.f2185b, backgroundElement.f2185b) && r.b(this.f2186c, backgroundElement.f2186c)) {
            return ((this.f2187d > backgroundElement.f2187d ? 1 : (this.f2187d == backgroundElement.f2187d ? 0 : -1)) == 0) && r.b(this.f2188e, backgroundElement.f2188e);
        }
        return false;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f2185b, this.f2186c, this.f2187d, this.f2188e, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iC = j0.C(this.f2185b) * 31;
        z zVar = this.f2186c;
        return ((((iC + (zVar != null ? zVar.hashCode() : 0)) * 31) + Float.hashCode(this.f2187d)) * 31) + this.f2188e.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(d dVar) {
        dVar.d2(this.f2185b);
        dVar.c2(this.f2186c);
        dVar.b(this.f2187d);
        dVar.d1(this.f2188e);
    }
}
