package q0;

import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18896d;

    private s(long j10, long j11, long j12, long j13) {
        this.f18893a = j10;
        this.f18894b = j11;
        this.f18895c = j12;
        this.f18896d = j13;
    }

    public /* synthetic */ s(long j10, long j11, long j12, long j13, ae.j jVar) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean z10) {
        return z10 ? this.f18893a : this.f18895c;
    }

    public final long b(boolean z10) {
        return z10 ? this.f18894b : this.f18896d;
    }

    public final s c(long j10, long j11, long j12, long j13) {
        j0.a aVar = l1.j0.f14524b;
        return new s((j10 > aVar.j() ? 1 : (j10 == aVar.j() ? 0 : -1)) != 0 ? j10 : this.f18893a, (j11 > aVar.j() ? 1 : (j11 == aVar.j() ? 0 : -1)) != 0 ? j11 : this.f18894b, (j12 > aVar.j() ? 1 : (j12 == aVar.j() ? 0 : -1)) != 0 ? j12 : this.f18895c, j13 != aVar.j() ? j13 : this.f18896d, null);
    }

    public final long e() {
        return this.f18894b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l1.j0.w(this.f18893a, sVar.f18893a) && l1.j0.w(this.f18894b, sVar.f18894b) && l1.j0.w(this.f18895c, sVar.f18895c) && l1.j0.w(this.f18896d, sVar.f18896d);
    }

    public int hashCode() {
        return (((((l1.j0.C(this.f18893a) * 31) + l1.j0.C(this.f18894b)) * 31) + l1.j0.C(this.f18895c)) * 31) + l1.j0.C(this.f18896d);
    }
}
