package q0;

import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18520d;

    private d(long j10, long j11, long j12, long j13) {
        this.f18517a = j10;
        this.f18518b = j11;
        this.f18519c = j12;
        this.f18520d = j13;
    }

    public /* synthetic */ d(long j10, long j11, long j12, long j13, ae.j jVar) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean z10) {
        return z10 ? this.f18517a : this.f18519c;
    }

    public final long b(boolean z10) {
        return z10 ? this.f18518b : this.f18520d;
    }

    public final d c(long j10, long j11, long j12, long j13) {
        j0.a aVar = l1.j0.f14524b;
        return new d((j10 > aVar.j() ? 1 : (j10 == aVar.j() ? 0 : -1)) != 0 ? j10 : this.f18517a, (j11 > aVar.j() ? 1 : (j11 == aVar.j() ? 0 : -1)) != 0 ? j11 : this.f18518b, (j12 > aVar.j() ? 1 : (j12 == aVar.j() ? 0 : -1)) != 0 ? j12 : this.f18519c, j13 != aVar.j() ? j13 : this.f18520d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l1.j0.w(this.f18517a, dVar.f18517a) && l1.j0.w(this.f18518b, dVar.f18518b) && l1.j0.w(this.f18519c, dVar.f18519c) && l1.j0.w(this.f18520d, dVar.f18520d);
    }

    public int hashCode() {
        return (((((l1.j0.C(this.f18517a) * 31) + l1.j0.C(this.f18518b)) * 31) + l1.j0.C(this.f18519c)) * 31) + l1.j0.C(this.f18520d);
    }
}
