package nd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class v extends u {
    public static <T> int x(Iterable<? extends T> iterable, int i10) {
        ae.r.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final <T> Integer y(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> z(Iterable<? extends Iterable<? extends T>> iterable) {
        ae.r.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            z.C(arrayList, it.next());
        }
        return arrayList;
    }
}
