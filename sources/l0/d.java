package l0;

import ae.j;
import w2.h;

/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14484a;

    private d(float f10) {
        this.f14484a = f10;
    }

    public /* synthetic */ d(float f10, j jVar) {
        this(f10);
    }

    @Override // l0.b
    public float a(long j10, w2.d dVar) {
        return dVar.G0(this.f14484a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.o(this.f14484a, ((d) obj).f14484a);
    }

    public int hashCode() {
        return h.p(this.f14484a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f14484a + ".dp)";
    }
}
