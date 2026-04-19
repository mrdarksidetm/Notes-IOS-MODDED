package c0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class i1<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f6080c;

    public i1() {
        this(0, 0, null, 7, null);
    }

    public i1(int i10, int i11, b0 b0Var) {
        this.f6078a = i10;
        this.f6079b = i11;
        this.f6080c = b0Var;
    }

    public /* synthetic */ i1(int i10, int i11, b0 b0Var, int i12, ae.j jVar) {
        this((i12 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? d0.c() : b0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return i1Var.f6078a == this.f6078a && i1Var.f6079b == this.f6079b && ae.r.b(i1Var.f6080c, this.f6080c);
    }

    @Override // c0.a0, c0.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends q> w1<V> a(j1<T, V> j1Var) {
        return new w1<>(this.f6078a, this.f6079b, this.f6080c);
    }

    public int hashCode() {
        return (((this.f6078a * 31) + this.f6080c.hashCode()) * 31) + this.f6079b;
    }
}
