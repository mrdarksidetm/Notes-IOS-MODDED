package d7;

import a7.d;
import d7.v;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends v<List<? extends String>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9573b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9574c = new v.a(d.b.V_1, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f9575a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List<String> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9575a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<String> b() {
        return this.f9575a;
    }
}
