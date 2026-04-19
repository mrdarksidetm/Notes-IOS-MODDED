package d7;

import a7.d;
import d7.v;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends v<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9576b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9577c = new v.a(d.b.V_1, d.b.V_4, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f9578a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Map<String, String> map) {
        super(null);
        ae.r.f(map, "value");
        this.f9578a = map;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append((String) entry.getKey());
            sb2.append((String) entry.getValue());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public Map<String, String> b() {
        return this.f9578a;
    }
}
