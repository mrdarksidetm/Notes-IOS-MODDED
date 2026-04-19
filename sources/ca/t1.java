package ca;

/* JADX INFO: loaded from: classes2.dex */
final class t1 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6750c;

    t1() {
    }

    @Override // ca.p1
    public final m1 a() {
        return new q1(this.f6748a, this.f6749b, this.f6750c);
    }

    @Override // ca.p1
    public final p1 b(String str) {
        this.f6749b = str;
        return this;
    }

    @Override // ca.p1
    public final p1 c(String str) {
        this.f6750c = str;
        return this;
    }

    @Override // ca.p1
    public final p1 d(String str) {
        this.f6748a = str;
        return this;
    }
}
