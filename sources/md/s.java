package md;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f15574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f15575b;

    public s(A a10, B b10) {
        this.f15574a = a10;
        this.f15575b = b10;
    }

    public final A a() {
        return this.f15574a;
    }

    public final B b() {
        return this.f15575b;
    }

    public final A c() {
        return this.f15574a;
    }

    public final B d() {
        return this.f15575b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return ae.r.b(this.f15574a, sVar.f15574a) && ae.r.b(this.f15575b, sVar.f15575b);
    }

    public int hashCode() {
        A a10 = this.f15574a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f15575b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f15574a + ", " + this.f15575b + ')';
    }
}
