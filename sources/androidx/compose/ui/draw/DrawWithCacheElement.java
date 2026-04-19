package androidx.compose.ui.draw;

import a2.r0;
import ae.r;
import i1.f;
import i1.k;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends r0<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<f, k> f2641b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(l<? super f, k> lVar) {
        this.f2641b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && r.b(this.f2641b, ((DrawWithCacheElement) obj).f2641b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(new f(), this.f2641b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2641b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(a aVar) {
        aVar.c2(this.f2641b);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f2641b + ')';
    }
}
