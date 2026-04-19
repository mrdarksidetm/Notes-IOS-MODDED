package d7;

import a7.d;
import d7.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends v<List<? extends e7.u>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9546b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9547c = new v.a(d.b.V_4, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e7.u> f9548a;

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
            return pd.b.a((String) t10, (String) t11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(List<e7.u> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9548a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        List<e7.u> listB = b();
        ArrayList arrayList = new ArrayList(nd.v.x(listB, 10));
        for (e7.u uVar : listB) {
            arrayList.add(uVar.a() + uVar.b());
        }
        Iterator it = nd.c0.u0(arrayList, new b()).iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<e7.u> b() {
        return this.f9548a;
    }
}
