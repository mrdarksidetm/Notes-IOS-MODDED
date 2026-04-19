package androidx.compose.foundation.layout;

import a2.r0;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends r0<r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2462c;

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.f2461b = f10;
        this.f2462c = f11;
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, ae.j jVar) {
        this(f10, f11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return w2.h.o(this.f2461b, unspecifiedConstraintsElement.f2461b) && w2.h.o(this.f2462c, unspecifiedConstraintsElement.f2462c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public r a() {
        return new r(this.f2461b, this.f2462c, null);
    }

    @Override // a2.r0
    public int hashCode() {
        return (w2.h.p(this.f2461b) * 31) + w2.h.p(this.f2462c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(r rVar) {
        rVar.b2(this.f2461b);
        rVar.a2(this.f2462c);
    }
}
