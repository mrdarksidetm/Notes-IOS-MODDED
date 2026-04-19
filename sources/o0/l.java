package o0;

import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16253b;

    private l(long j10, long j11) {
        this.f16252a = j10;
        this.f16253b = j11;
    }

    public /* synthetic */ l(long j10, long j11, ae.j jVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f16253b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return j0.w(this.f16252a, lVar.f16252a) && j0.w(this.f16253b, lVar.f16253b);
    }

    public int hashCode() {
        return (j0.C(this.f16252a) * 31) + j0.C(this.f16253b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) j0.D(this.f16252a)) + ", selectionBackgroundColor=" + ((Object) j0.D(this.f16253b)) + ')';
    }
}
