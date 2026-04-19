package b0;

import c0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.b f5097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<w2.p, w2.p> f5098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0<w2.p> f5099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5100d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(f1.b bVar, zd.l<? super w2.p, w2.p> lVar, e0<w2.p> e0Var, boolean z10) {
        this.f5097a = bVar;
        this.f5098b = lVar;
        this.f5099c = e0Var;
        this.f5100d = z10;
    }

    public final f1.b a() {
        return this.f5097a;
    }

    public final e0<w2.p> b() {
        return this.f5099c;
    }

    public final boolean c() {
        return this.f5100d;
    }

    public final zd.l<w2.p, w2.p> d() {
        return this.f5098b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return ae.r.b(this.f5097a, hVar.f5097a) && ae.r.b(this.f5098b, hVar.f5098b) && ae.r.b(this.f5099c, hVar.f5099c) && this.f5100d == hVar.f5100d;
    }

    public int hashCode() {
        return (((((this.f5097a.hashCode() * 31) + this.f5098b.hashCode()) * 31) + this.f5099c.hashCode()) * 31) + Boolean.hashCode(this.f5100d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f5097a + ", size=" + this.f5098b + ", animationSpec=" + this.f5099c + ", clip=" + this.f5100d + ')';
    }
}
