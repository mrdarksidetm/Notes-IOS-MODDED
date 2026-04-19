package nd;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class z0 extends y0 {
    public static <T> Set<T> e(Set<? extends T> set, Iterable<? extends T> iterable) {
        ae.r.f(set, "<this>");
        ae.r.f(iterable, "elements");
        Collection<?> collectionE = z.E(iterable);
        if (collectionE.isEmpty()) {
            return c0.H0(set);
        }
        if (!(collectionE instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionE);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!collectionE.contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> f(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        ae.r.f(set, "<this>");
        ae.r.f(iterable, "elements");
        Integer numY = v.y(iterable);
        if (numY != null) {
            size = set.size() + numY.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(size));
        linkedHashSet.addAll(set);
        z.C(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
