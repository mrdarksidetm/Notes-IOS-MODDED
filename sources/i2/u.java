package i2;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12415c;

    public final long a() {
        return this.f12414b;
    }

    public final int b() {
        return this.f12415c;
    }

    public final long c() {
        return this.f12413a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return w2.t.e(this.f12413a, uVar.f12413a) && w2.t.e(this.f12414b, uVar.f12414b) && v.i(this.f12415c, uVar.f12415c);
    }

    public int hashCode() {
        return (((w2.t.i(this.f12413a) * 31) + w2.t.i(this.f12414b)) * 31) + v.j(this.f12415c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) w2.t.j(this.f12413a)) + ", height=" + ((Object) w2.t.j(this.f12414b)) + ", placeholderVerticalAlign=" + ((Object) v.k(this.f12415c)) + ')';
    }
}
