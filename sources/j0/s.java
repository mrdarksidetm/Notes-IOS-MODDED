package j0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import y1.e1;

/* JADX INFO: loaded from: classes.dex */
final class s implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f13761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, Integer> f13762b = new LinkedHashMap();

    public s(o oVar) {
        this.f13761a = oVar;
    }

    @Override // y1.e1
    public boolean a(Object obj, Object obj2) {
        return ae.r.b(this.f13761a.c(obj), this.f13761a.c(obj2));
    }

    @Override // y1.e1
    public void b(e1.a aVar) {
        this.f13762b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object objC = this.f13761a.c(it.next());
            Integer num = this.f13762b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f13762b.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
