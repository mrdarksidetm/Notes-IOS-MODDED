package i2;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12392a;

    public k0(String str) {
        super(null);
        this.f12392a = str;
    }

    public final String a() {
        return this.f12392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && ae.r.b(this.f12392a, ((k0) obj).f12392a);
    }

    public int hashCode() {
        return this.f12392a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f12392a + ')';
    }
}
