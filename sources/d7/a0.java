package d7;

import a7.d;
import d7.v;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends v<List<? extends e7.u>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9540b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9541c = new v.a(d.b.V_1, d.b.V_4, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.u> f9542a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(List<e7.u> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9542a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (e7.u uVar : b()) {
            sb2.append(uVar.a());
            sb2.append(uVar.b());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.u> b() {
        return this.f9542a;
    }
}
