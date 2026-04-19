package le;

/* JADX INFO: loaded from: classes2.dex */
final class i1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15037a;

    public i1(boolean z10) {
        this.f15037a = z10;
    }

    @Override // le.u1
    public n2 b() {
        return null;
    }

    @Override // le.u1
    public boolean isActive() {
        return this.f15037a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
