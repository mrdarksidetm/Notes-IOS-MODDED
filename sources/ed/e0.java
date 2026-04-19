package ed;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10819c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10821b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final e0 a(List<? extends Object> list) {
            ae.r.f(list, "pigeonVar_list");
            String str = (String) list.get(0);
            Object obj = list.get(1);
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new e0(str, ((Boolean) obj).booleanValue());
        }
    }

    public e0(String str, boolean z10) {
        this.f10820a = str;
        this.f10821b = z10;
    }

    public final String a() {
        return this.f10820a;
    }

    public final List<Object> b() {
        return nd.u.p(this.f10820a, Boolean.valueOf(this.f10821b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return ae.r.b(this.f10820a, e0Var.f10820a) && this.f10821b == e0Var.f10821b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        String str = this.f10820a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.f10821b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f10820a + ", useDataStore=" + this.f10821b + ")";
    }
}
