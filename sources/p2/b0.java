package p2;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18087b;

    public b0(int i10, int i11) {
        this.f18086a = i10;
        this.f18087b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f18086a == b0Var.f18086a && this.f18087b == b0Var.f18087b;
    }

    public int hashCode() {
        return (this.f18086a * 31) + this.f18087b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f18086a + ", end=" + this.f18087b + ')';
    }
}
