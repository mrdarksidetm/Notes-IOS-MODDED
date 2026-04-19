package u2;

import l1.j0;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
final class c implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21518b;

    private c(long j10) {
        this.f21518b = j10;
        if (!(j10 != j0.f14524b.j())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ c(long j10, ae.j jVar) {
        this(j10);
    }

    @Override // u2.m
    public float a() {
        return j0.x(c());
    }

    @Override // u2.m
    public long c() {
        return this.f21518b;
    }

    @Override // u2.m
    public z e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j0.w(this.f21518b, ((c) obj).f21518b);
    }

    public int hashCode() {
        return j0.C(this.f21518b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) j0.D(this.f21518b)) + ')';
    }
}
