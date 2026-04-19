package l3;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f14706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14708f;

    public e(String str, String str2, String str3, int i10) {
        this.f14703a = (String) n3.g.h(str);
        this.f14704b = (String) n3.g.h(str2);
        this.f14705c = (String) n3.g.h(str3);
        this.f14706d = null;
        n3.g.a(i10 != 0);
        this.f14707e = i10;
        this.f14708f = a(str, str2, str3);
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f14703a = (String) n3.g.h(str);
        this.f14704b = (String) n3.g.h(str2);
        this.f14705c = (String) n3.g.h(str3);
        this.f14706d = (List) n3.g.h(list);
        this.f14707e = 0;
        this.f14708f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f14706d;
    }

    public int c() {
        return this.f14707e;
    }

    String d() {
        return this.f14708f;
    }

    public String e() {
        return this.f14703a;
    }

    public String f() {
        return this.f14704b;
    }

    public String g() {
        return this.f14705c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f14703a + ", mProviderPackage: " + this.f14704b + ", mQuery: " + this.f14705c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f14706d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f14706d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f14707e);
        return sb2.toString();
    }
}
