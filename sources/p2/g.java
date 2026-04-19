package p2;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18122b;

    public g(int i10, int i11) {
        this.f18121a = i10;
        this.f18122b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18121a == gVar.f18121a && this.f18122b == gVar.f18122b;
    }

    public int hashCode() {
        return (this.f18121a * 31) + this.f18122b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f18121a + ", lengthAfterCursor=" + this.f18122b + ')';
    }
}
