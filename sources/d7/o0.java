package d7;

import a7.d;
import d7.v;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends v<List<? extends e7.f0>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9626b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9627c = new v.a(d.b.V_1, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.f0> f9628a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(List<e7.f0> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9628a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (e7.f0 f0Var : b()) {
            sb2.append(f0Var.a());
            sb2.append(f0Var.b());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.f0> b() {
        return this.f9628a;
    }
}
