package nd;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class y0 extends x0 {
    public static <T> Set<T> b() {
        return g0.f16119a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        ae.r.f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : x0.a(set.iterator().next()) : b();
    }

    public static <T> Set<T> d(T... tArr) {
        ae.r.f(tArr, "elements");
        return tArr.length > 0 ? p.N0(tArr) : b();
    }
}
