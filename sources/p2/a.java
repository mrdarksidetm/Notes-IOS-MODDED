package p2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.d f18075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18076b;

    public a(i2.d dVar, int i10) {
        this.f18075a = dVar;
        this.f18076b = i10;
    }

    public a(String str, int i10) {
        this(new i2.d(str, null, null, 6, null), i10);
    }

    public final String a() {
        return this.f18075a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ae.r.b(a(), aVar.a()) && this.f18076b == aVar.f18076b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f18076b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + a() + "', newCursorPosition=" + this.f18076b + ')';
    }
}
