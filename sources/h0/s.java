package h0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11748d;

    public s(int i10, int i11, int i12, int i13) {
        this.f11745a = i10;
        this.f11746b = i11;
        this.f11747c = i12;
        this.f11748d = i13;
    }

    public final int a() {
        return this.f11748d;
    }

    public final int b() {
        return this.f11745a;
    }

    public final int c() {
        return this.f11747c;
    }

    public final int d() {
        return this.f11746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f11745a == sVar.f11745a && this.f11746b == sVar.f11746b && this.f11747c == sVar.f11747c && this.f11748d == sVar.f11748d;
    }

    public int hashCode() {
        return (((((this.f11745a * 31) + this.f11746b) * 31) + this.f11747c) * 31) + this.f11748d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f11745a + ", top=" + this.f11746b + ", right=" + this.f11747c + ", bottom=" + this.f11748d + ')';
    }
}
