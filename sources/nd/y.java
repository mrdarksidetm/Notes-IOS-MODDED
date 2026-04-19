package nd;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class y extends x {
    public static <T extends Comparable<? super T>> void A(List<T> list) {
        ae.r.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void B(List<T> list, Comparator<? super T> comparator) {
        ae.r.f(list, "<this>");
        ae.r.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
