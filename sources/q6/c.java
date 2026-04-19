package q6;

import ae.j;
import ae.r;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18994c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18996b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final c a(List<? extends Object> list) {
            r.f(list, "pigeonVar_list");
            Object obj = list.get(0);
            r.d(obj, "null cannot be cast to non-null type com.aheaditec.freerasp.generated.PackageInfo");
            Object obj2 = list.get(1);
            r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            return new c((b) obj, (String) obj2);
        }
    }

    public c(b bVar, String str) {
        r.f(bVar, "packageInfo");
        r.f(str, "reason");
        this.f18995a = bVar;
        this.f18996b = str;
    }

    public final List<Object> a() {
        return u.p(this.f18995a, this.f18996b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.b(this.f18995a, cVar.f18995a) && r.b(this.f18996b, cVar.f18996b);
    }

    public int hashCode() {
        return (this.f18995a.hashCode() * 31) + this.f18996b.hashCode();
    }

    public String toString() {
        return "SuspiciousAppInfo(packageInfo=" + this.f18995a + ", reason=" + this.f18996b + ')';
    }
}
