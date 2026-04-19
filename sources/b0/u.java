package b0;

import c0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0<Float> f5152c;

    private u(float f10, long j10, e0<Float> e0Var) {
        this.f5150a = f10;
        this.f5151b = j10;
        this.f5152c = e0Var;
    }

    public /* synthetic */ u(float f10, long j10, e0 e0Var, ae.j jVar) {
        this(f10, j10, e0Var);
    }

    public final e0<Float> a() {
        return this.f5152c;
    }

    public final float b() {
        return this.f5150a;
    }

    public final long c() {
        return this.f5151b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f5150a, uVar.f5150a) == 0 && androidx.compose.ui.graphics.g.e(this.f5151b, uVar.f5151b) && ae.r.b(this.f5152c, uVar.f5152c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f5150a) * 31) + androidx.compose.ui.graphics.g.h(this.f5151b)) * 31) + this.f5152c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f5150a + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.g.i(this.f5151b)) + ", animationSpec=" + this.f5152c + ')';
    }
}
