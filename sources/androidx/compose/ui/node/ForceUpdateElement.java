package androidx.compose.ui.node;

import a2.r0;
import ae.r;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
final class ForceUpdateElement extends r0<e.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0<?> f2826b;

    public ForceUpdateElement(r0<?> r0Var) {
        this.f2826b = r0Var;
    }

    @Override // a2.r0
    public e.c a() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // a2.r0
    public void c(e.c cVar) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && r.b(this.f2826b, ((ForceUpdateElement) obj).f2826b);
    }

    public final r0<?> g() {
        return this.f2826b;
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2826b.hashCode();
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.f2826b + ')';
    }
}
