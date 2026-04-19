package nd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class u extends t {
    public static <T> ArrayList<T> g(T... tArr) {
        ae.r.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    public static final <T> Collection<T> h(T[] tArr) {
        ae.r.f(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T> int i(List<? extends T> list, int i10, int i11, zd.l<? super T, Integer> lVar) {
        ae.r.f(list, "<this>");
        ae.r.f(lVar, "comparison");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = lVar.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int j(List<? extends T> list, T t10, int i10, int i11) {
        ae.r.f(list, "<this>");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = pd.b.a(list.get(i13), t10);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, int i10, int i11, zd.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return i(list, i10, i11, lVar);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    public static <T> List<T> m() {
        return e0.f16117a;
    }

    public static ge.i n(Collection<?> collection) {
        ae.r.f(collection, "<this>");
        return new ge.i(0, collection.size() - 1);
    }

    public static <T> int o(List<? extends T> list) {
        ae.r.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> p(T... tArr) {
        ae.r.f(tArr, "elements");
        return tArr.length > 0 ? o.c(tArr) : m();
    }

    public static <T> List<T> q(T t10) {
        return t10 != null ? t.d(t10) : m();
    }

    public static <T> List<T> r(T... tArr) {
        ae.r.f(tArr, "elements");
        return p.I(tArr);
    }

    public static <T> List<T> s(T... tArr) {
        ae.r.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new j(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> t(List<? extends T> list) {
        ae.r.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : t.d(list.get(0)) : m();
    }

    private static final void u(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
