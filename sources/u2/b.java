package u2;

import ae.r;
import l1.j0;
import l1.q1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
final class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q1 f21516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f21517c;

    public b(q1 q1Var, float f10) {
        this.f21516b = q1Var;
        this.f21517c = f10;
    }

    @Override // u2.m
    public float a() {
        return this.f21517c;
    }

    @Override // u2.m
    public long c() {
        return j0.f14524b.j();
    }

    @Override // u2.m
    public z e() {
        return this.f21516b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.b(this.f21516b, bVar.f21516b) && Float.compare(this.f21517c, bVar.f21517c) == 0;
    }

    public final q1 f() {
        return this.f21516b;
    }

    public int hashCode() {
        return (this.f21516b.hashCode() * 31) + Float.hashCode(this.f21517c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f21516b + ", alpha=" + this.f21517c + ')';
    }
}
