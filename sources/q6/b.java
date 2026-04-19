package q6;

import ae.j;
import ae.r;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f18988f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18993e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final b a(List<? extends Object> list) {
            r.f(list, "pigeonVar_list");
            Object obj = list.get(0);
            r.d(obj, "null cannot be cast to non-null type kotlin.String");
            return new b((String) obj, (String) list.get(1), (String) list.get(2), (String) list.get(3), (String) list.get(4));
        }
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        r.f(str, "packageName");
        this.f18989a = str;
        this.f18990b = str2;
        this.f18991c = str3;
        this.f18992d = str4;
        this.f18993e = str5;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, int i10, j jVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }

    public final List<Object> a() {
        return u.p(this.f18989a, this.f18990b, this.f18991c, this.f18992d, this.f18993e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.b(this.f18989a, bVar.f18989a) && r.b(this.f18990b, bVar.f18990b) && r.b(this.f18991c, bVar.f18991c) && r.b(this.f18992d, bVar.f18992d) && r.b(this.f18993e, bVar.f18993e);
    }

    public int hashCode() {
        int iHashCode = this.f18989a.hashCode() * 31;
        String str = this.f18990b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18991c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18992d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18993e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PackageInfo(packageName=" + this.f18989a + ", appIcon=" + this.f18990b + ", appName=" + this.f18991c + ", version=" + this.f18992d + ", installationSource=" + this.f18993e + ')';
    }
}
