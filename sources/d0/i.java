package d0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l1.z f9230b;

    private i(float f10, l1.z zVar) {
        this.f9229a = f10;
        this.f9230b = zVar;
    }

    public /* synthetic */ i(float f10, l1.z zVar, ae.j jVar) {
        this(f10, zVar);
    }

    public final l1.z a() {
        return this.f9230b;
    }

    public final float b() {
        return this.f9229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w2.h.o(this.f9229a, iVar.f9229a) && ae.r.b(this.f9230b, iVar.f9230b);
    }

    public int hashCode() {
        return (w2.h.p(this.f9229a) * 31) + this.f9230b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) w2.h.q(this.f9229a)) + ", brush=" + this.f9230b + ')';
    }
}
