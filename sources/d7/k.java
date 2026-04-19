package d7;

import a7.d;
import d7.v;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v<List<? extends e7.x>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9599b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9600c = new v.a(d.b.V_2, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.x> f9601a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List<e7.x> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9601a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (e7.x xVar : b()) {
            sb2.append(xVar.b());
            Iterator<T> it = xVar.a().iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.x> b() {
        return this.f9601a;
    }
}
