package y6;

import ae.r;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f23371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23375e;

    public c(File file, String str, String str2, String str3, boolean z10) {
        r.f(file, "file");
        r.f(str, "fileName");
        r.f(str2, "saveFileNamePrefix");
        r.f(str3, "saveFileNameSuffix");
        this.f23371a = file;
        this.f23372b = str;
        this.f23373c = str2;
        this.f23374d = str3;
        this.f23375e = z10;
    }

    public final File a() {
        return this.f23371a;
    }

    public final String b() {
        return this.f23373c;
    }

    public final boolean c() {
        return this.f23375e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.b(this.f23371a, cVar.f23371a) && r.b(this.f23372b, cVar.f23372b) && r.b(this.f23373c, cVar.f23373c) && r.b(this.f23374d, cVar.f23374d) && this.f23375e == cVar.f23375e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.f23371a.hashCode() * 31) + this.f23372b.hashCode()) * 31) + this.f23373c.hashCode()) * 31) + this.f23374d.hashCode()) * 31;
        boolean z10 = this.f23375e;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "DestinationSaveFileInfo(file=" + this.f23371a + ", fileName=" + this.f23372b + ", saveFileNamePrefix=" + this.f23373c + ", saveFileNameSuffix=" + this.f23374d + ", isTempFile=" + this.f23375e + ')';
    }
}
