package r0;

import ae.r;
import k1.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f19137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19141e;

    public c(h hVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19137a = hVar;
        this.f19138b = z10;
        this.f19139c = z11;
        this.f19140d = z12;
        this.f19141e = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.b(this.f19137a, cVar.f19137a) && this.f19138b == cVar.f19138b && this.f19139c == cVar.f19139c && this.f19140d == cVar.f19140d && this.f19141e == cVar.f19141e;
    }

    public int hashCode() {
        return (((((((this.f19137a.hashCode() * 31) + Boolean.hashCode(this.f19138b)) * 31) + Boolean.hashCode(this.f19139c)) * 31) + Boolean.hashCode(this.f19140d)) * 31) + Boolean.hashCode(this.f19141e);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.f19137a + ", isFlat=" + this.f19138b + ", isVertical=" + this.f19139c + ", isSeparating=" + this.f19140d + ", isOccluding=" + this.f19141e + ')';
    }
}
