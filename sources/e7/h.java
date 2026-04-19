package e7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10653c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f10654d = new h(nd.u.m(), nd.u.m());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<md.s<String, String>> f10655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<List<md.s<String, String>>> f10656b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final h a() {
            return h.f10654d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<md.s<String, String>> list, List<? extends List<md.s<String, String>>> list2) {
        ae.r.f(list, "commonInfo");
        ae.r.f(list2, "perProcessorInfo");
        this.f10655a = list;
        this.f10656b = list2;
    }

    public final h b(List<md.s<String, String>> list, List<? extends List<md.s<String, String>>> list2) {
        ae.r.f(list, "commonInfo");
        ae.r.f(list2, "perProcessorInfo");
        return new h(list, list2);
    }

    public final List<md.s<String, String>> c() {
        return this.f10655a;
    }

    public final List<List<md.s<String, String>>> d() {
        return this.f10656b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return ae.r.b(this.f10655a, hVar.f10655a) && ae.r.b(this.f10656b, hVar.f10656b);
    }

    public int hashCode() {
        return (this.f10655a.hashCode() * 31) + this.f10656b.hashCode();
    }

    public String toString() {
        return "CpuInfo(commonInfo=" + this.f10655a + ", perProcessorInfo=" + this.f10656b + ')';
    }
}
