package d7;

import a7.d;
import d7.v;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends v<List<? extends e7.c>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9593b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9594c = new v.a(d.b.V_2, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.c> f9595a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<e7.c> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9595a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (e7.c cVar : b()) {
            sb2.append(cVar.a());
            sb2.append(cVar.c());
            sb2.append(cVar.b());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.c> b() {
        return this.f9595a;
    }
}
