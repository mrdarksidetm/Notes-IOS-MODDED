package e7;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10642c;

    public c(String str, String str2, String str3) {
        ae.r.f(str, "cameraName");
        ae.r.f(str2, "cameraType");
        ae.r.f(str3, "cameraOrientation");
        this.f10640a = str;
        this.f10641b = str2;
        this.f10642c = str3;
    }

    public final String a() {
        return this.f10640a;
    }

    public final String b() {
        return this.f10642c;
    }

    public final String c() {
        return this.f10641b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ae.r.b(this.f10640a, cVar.f10640a) && ae.r.b(this.f10641b, cVar.f10641b) && ae.r.b(this.f10642c, cVar.f10642c);
    }

    public int hashCode() {
        return (((this.f10640a.hashCode() * 31) + this.f10641b.hashCode()) * 31) + this.f10642c.hashCode();
    }

    public String toString() {
        return "CameraInfo(cameraName=" + this.f10640a + ", cameraType=" + this.f10641b + ", cameraOrientation=" + this.f10642c + ')';
    }
}
