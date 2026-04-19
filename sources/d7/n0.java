package d7;

import a7.d;
import d7.v;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends v<List<? extends md.s<? extends String, ? extends String>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9620b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9621c = new v.a(d.b.V_2, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<md.s<String, String>> f9622a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(List<md.s<String, String>> list) {
        super(null);
        ae.r.f(list, "value");
        this.f9622a = list;
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            md.s sVar = (md.s) it.next();
            sb2.append((String) sVar.c());
            sb2.append((String) sVar.d());
        }
        String string = sb2.toString();
        ae.r.e(string, "sb.toString()");
        return string;
    }

    public List<md.s<String, String>> b() {
        return this.f9622a;
    }
}
