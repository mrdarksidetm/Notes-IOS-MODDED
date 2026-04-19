package a7;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f644d;

    public b(String str, String str2, String str3, String str4) {
        r.f(str, "deviceId");
        r.f(str2, "gsfId");
        r.f(str3, "androidId");
        r.f(str4, "mediaDrmId");
        this.f641a = str;
        this.f642b = str2;
        this.f643c = str3;
        this.f644d = str4;
    }

    public final String a() {
        return this.f643c;
    }

    public final String b() {
        return this.f644d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.b(this.f641a, bVar.f641a) && r.b(this.f642b, bVar.f642b) && r.b(this.f643c, bVar.f643c) && r.b(this.f644d, bVar.f644d);
    }

    public int hashCode() {
        return (((((this.f641a.hashCode() * 31) + this.f642b.hashCode()) * 31) + this.f643c.hashCode()) * 31) + this.f644d.hashCode();
    }

    public String toString() {
        return "DeviceIdResult(deviceId=" + this.f641a + ", gsfId=" + this.f642b + ", androidId=" + this.f643c + ", mediaDrmId=" + this.f644d + ')';
    }
}
