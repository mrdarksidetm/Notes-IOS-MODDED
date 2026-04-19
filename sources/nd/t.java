package nd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class t {
    public static <E> List<E> a(List<E> list) {
        ae.r.f(list, "builder");
        return ((od.a) list).t();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        ae.r.f(tArr, "<this>");
        if (z10 && ae.r.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ae.r.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> c(int i10) {
        return new od.a(i10);
    }

    public static <T> List<T> d(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        ae.r.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static <T> List<T> e(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        List<T> listE0 = c0.E0(iterable);
        Collections.shuffle(listE0);
        return listE0;
    }

    public static <T> T[] f(int i10, T[] tArr) {
        ae.r.f(tArr, "array");
        if (i10 < tArr.length) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
