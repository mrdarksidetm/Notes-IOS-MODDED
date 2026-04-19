package d7;

import a7.d;
import d7.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends v<e7.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9582b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9583c = new v.a(d.b.V_4, null, f7.a.STABLE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f9584d = nd.x0.a("processor");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f9585e = nd.y0.d("bogomips", "cpu mhz");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7.h f9586a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e7.h hVar) {
        super(null);
        ae.r.f(hVar, "value");
        List<md.s<String, String>> listC = hVar.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            Set<String> set = f9584d;
            ae.r.e(((String) ((md.s) obj).c()).toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!set.contains(r4)) {
                arrayList.add(obj);
            }
        }
        List<List<md.s<String, String>>> listD = hVar.d();
        List<? extends List<md.s<String, String>>> arrayList2 = new ArrayList<>(nd.v.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Set<String> set2 = f9585e;
                ae.r.e(((String) ((md.s) obj2).c()).toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!set2.contains(r7)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(arrayList3);
        }
        this.f9586a = hVar.b(arrayList, arrayList2);
    }

    @Override // d7.v
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b().c());
        sb2.append(b().d());
        return sb2.toString();
    }

    public e7.h b() {
        return this.f9586a;
    }
}
