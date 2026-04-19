package k6;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f14412b;

    public f(i iVar) {
        this.f14412b = iVar;
    }

    @Override // k6.j
    public Object c(qd.d<? super i> dVar) {
        return this.f14412b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && r.b(this.f14412b, ((f) obj).f14412b);
    }

    public int hashCode() {
        return this.f14412b.hashCode();
    }
}
