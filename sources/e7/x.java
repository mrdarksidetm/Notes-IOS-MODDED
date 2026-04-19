package e7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f10697b;

    public x(String str, List<String> list) {
        ae.r.f(str, "name");
        ae.r.f(list, "capabilities");
        this.f10696a = str;
        this.f10697b = list;
    }

    public final List<String> a() {
        return this.f10697b;
    }

    public final String b() {
        return this.f10696a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return ae.r.b(this.f10696a, xVar.f10696a) && ae.r.b(this.f10697b, xVar.f10697b);
    }

    public int hashCode() {
        return (this.f10696a.hashCode() * 31) + this.f10697b.hashCode();
    }

    public String toString() {
        return "MediaCodecInfo(name=" + this.f10696a + ", capabilities=" + this.f10697b + ')';
    }
}
