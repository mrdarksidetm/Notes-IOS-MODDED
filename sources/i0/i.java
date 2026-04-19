package i0;

import j0.n;

/* JADX INFO: loaded from: classes.dex */
public final class i implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<Integer, Object> f12140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.p<s, Integer, b> f12141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<Integer, Object> f12142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.r<q, Integer, t0.l, Integer, md.i0> f12143d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(zd.l<? super Integer, ? extends Object> lVar, zd.p<? super s, ? super Integer, b> pVar, zd.l<? super Integer, ? extends Object> lVar2, zd.r<? super q, ? super Integer, ? super t0.l, ? super Integer, md.i0> rVar) {
        this.f12140a = lVar;
        this.f12141b = pVar;
        this.f12142c = lVar2;
        this.f12143d = rVar;
    }

    public final zd.r<q, Integer, t0.l, Integer, md.i0> a() {
        return this.f12143d;
    }

    public final zd.p<s, Integer, b> b() {
        return this.f12141b;
    }

    @Override // j0.n.a
    public zd.l<Integer, Object> getKey() {
        return this.f12140a;
    }

    @Override // j0.n.a
    public zd.l<Integer, Object> getType() {
        return this.f12142c;
    }
}
