package h0;

/* JADX INFO: loaded from: classes.dex */
final class o implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11701e;

    public o(int i10, int i11, int i12, int i13) {
        this.f11698b = i10;
        this.f11699c = i11;
        this.f11700d = i12;
        this.f11701e = i13;
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return this.f11698b;
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return this.f11701e;
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return this.f11700d;
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return this.f11699c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f11698b == oVar.f11698b && this.f11699c == oVar.f11699c && this.f11700d == oVar.f11700d && this.f11701e == oVar.f11701e;
    }

    public int hashCode() {
        return (((((this.f11698b * 31) + this.f11699c) * 31) + this.f11700d) * 31) + this.f11701e;
    }

    public String toString() {
        return "Insets(left=" + this.f11698b + ", top=" + this.f11699c + ", right=" + this.f11700d + ", bottom=" + this.f11701e + ')';
    }
}
