package pa;

/* JADX INFO: loaded from: classes2.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18300b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f18299a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f18300b = str2;
    }

    @Override // pa.f
    public String b() {
        return this.f18299a;
    }

    @Override // pa.f
    public String c() {
        return this.f18300b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18299a.equals(fVar.b()) && this.f18300b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f18299a.hashCode() ^ 1000003) * 1000003) ^ this.f18300b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f18299a + ", version=" + this.f18300b + "}";
    }
}
