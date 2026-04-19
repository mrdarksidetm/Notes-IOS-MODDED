package le;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd.l<Throwable, md.i0> f14999b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Object obj, zd.l<? super Throwable, md.i0> lVar) {
        this.f14998a = obj;
        this.f14999b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return ae.r.b(this.f14998a, d0Var.f14998a) && ae.r.b(this.f14999b, d0Var.f14999b);
    }

    public int hashCode() {
        Object obj = this.f14998a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f14999b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f14998a + ", onCancellation=" + this.f14999b + ')';
    }
}
