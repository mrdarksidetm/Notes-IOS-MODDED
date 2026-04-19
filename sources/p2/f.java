package p2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18120b;

    public f(int i10, int i11) {
        this.f18119a = i10;
        this.f18120b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18119a == fVar.f18119a && this.f18120b == fVar.f18120b;
    }

    public int hashCode() {
        return (this.f18119a * 31) + this.f18120b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f18119a + ", lengthAfterCursor=" + this.f18120b + ')';
    }
}
