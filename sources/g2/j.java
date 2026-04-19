package g2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<Float> f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<Float> f11330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11331c;

    public j(zd.a<Float> aVar, zd.a<Float> aVar2, boolean z10) {
        this.f11329a = aVar;
        this.f11330b = aVar2;
        this.f11331c = z10;
    }

    public final zd.a<Float> a() {
        return this.f11330b;
    }

    public final boolean b() {
        return this.f11331c;
    }

    public final zd.a<Float> c() {
        return this.f11329a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f11329a.invoke().floatValue() + ", maxValue=" + this.f11330b.invoke().floatValue() + ", reverseScrolling=" + this.f11331c + ')';
    }
}
