package d7;

import a7.d;
import d7.v;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends v<List<? extends e7.c0>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9632b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9633c = new v.a(d.b.V_2, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.c0> f9634a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(((e7.c0) t10).a(), ((e7.c0) t11).a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(List<e7.c0> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9634a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = nd.c0.u0(b(), new b()).iterator();
        while (it.hasNext()) {
            sb2.append(((e7.c0) it.next()).a());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.c0> b() {
        return this.f9634a;
    }
}
