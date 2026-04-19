package a7;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h7.a f640b;

    public a(int i10, h7.a aVar) {
        r.f(aVar, "hasher");
        this.f639a = i10;
        this.f640b = aVar;
    }

    public /* synthetic */ a(int i10, h7.a aVar, int i11, j jVar) {
        this(i10, (i11 & 2) != 0 ? new h7.b() : aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f639a == aVar.f639a && r.b(this.f640b, aVar.f640b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f639a) * 31) + this.f640b.hashCode();
    }

    public String toString() {
        return "Configuration(version=" + this.f639a + ", hasher=" + this.f640b + ')';
    }
}
