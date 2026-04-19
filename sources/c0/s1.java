package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
final class s1<V extends q> implements o1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f6195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f6196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f6197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f6198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f6199e;

    public s1(g0 g0Var) {
        this.f6195a = g0Var;
        this.f6199e = g0Var.a();
    }

    @Override // c0.o1
    public float a() {
        return this.f6199e;
    }

    @Override // c0.o1
    public V b(long j10, V v10, V v11) {
        if (this.f6196b == null) {
            this.f6196b = (V) r.g(v10);
        }
        V v12 = this.f6196b;
        if (v12 == null) {
            ae.r.t("valueVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f6196b;
            if (v13 == null) {
                ae.r.t("valueVector");
                v13 = null;
            }
            v13.e(i10, this.f6195a.e(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f6196b;
        if (v14 != null) {
            return v14;
        }
        ae.r.t("valueVector");
        return null;
    }

    @Override // c0.o1
    public V c(V v10, V v11) {
        if (this.f6198d == null) {
            this.f6198d = (V) r.g(v10);
        }
        V v12 = this.f6198d;
        if (v12 == null) {
            ae.r.t("targetVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f6198d;
            if (v13 == null) {
                ae.r.t("targetVector");
                v13 = null;
            }
            v13.e(i10, this.f6195a.d(v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f6198d;
        if (v14 != null) {
            return v14;
        }
        ae.r.t("targetVector");
        return null;
    }

    @Override // c0.o1
    public V d(long j10, V v10, V v11) {
        if (this.f6197c == null) {
            this.f6197c = (V) r.g(v10);
        }
        V v12 = this.f6197c;
        if (v12 == null) {
            ae.r.t("velocityVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f6197c;
            if (v13 == null) {
                ae.r.t("velocityVector");
                v13 = null;
            }
            v13.e(i10, this.f6195a.b(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f6197c;
        if (v14 != null) {
            return v14;
        }
        ae.r.t("velocityVector");
        return null;
    }

    @Override // c0.o1
    public long e(V v10, V v11) {
        if (this.f6197c == null) {
            this.f6197c = (V) r.g(v10);
        }
        V v12 = this.f6197c;
        if (v12 == null) {
            ae.r.t("velocityVector");
            v12 = null;
        }
        int iB = v12.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f6195a.c(v10.a(i10), v11.a(i10)));
        }
        return jMax;
    }
}
