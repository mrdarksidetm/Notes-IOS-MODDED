package p2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.d f18089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18090b;

    public c0(i2.d dVar, int i10) {
        this.f18089a = dVar;
        this.f18090b = i10;
    }

    public c0(String str, int i10) {
        this(new i2.d(str, null, null, 6, null), i10);
    }

    public final String a() {
        return this.f18089a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return ae.r.b(a(), c0Var.a()) && this.f18090b == c0Var.f18090b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f18090b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + a() + "', newCursorPosition=" + this.f18090b + ')';
    }
}
