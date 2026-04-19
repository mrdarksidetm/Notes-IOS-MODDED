package p2;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18092b;

    public d0(int i10, int i11) {
        this.f18091a = i10;
        this.f18092b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f18091a == d0Var.f18091a && this.f18092b == d0Var.f18092b;
    }

    public int hashCode() {
        return (this.f18091a * 31) + this.f18092b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f18091a + ", end=" + this.f18092b + ')';
    }
}
