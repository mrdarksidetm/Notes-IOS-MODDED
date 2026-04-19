package nd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class z extends y {
    public static <T> boolean C(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ae.r.f(collection, "<this>");
        ae.r.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean D(Collection<? super T> collection, T[] tArr) {
        ae.r.f(collection, "<this>");
        ae.r.f(tArr, "elements");
        return collection.addAll(o.c(tArr));
    }

    public static final <T> Collection<T> E(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : c0.C0(iterable);
    }

    private static final <T> boolean F(Iterable<? extends T> iterable, zd.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final <T> boolean G(List<T> list, zd.l<? super T, Boolean> lVar, boolean z10) {
        if (!(list instanceof RandomAccess)) {
            ae.r.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(ae.n0.b(list), lVar, z10);
        }
        l0 it = new ge.i(0, u.o(list)).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t10 = list.get(iNextInt);
            if (lVar.invoke(t10).booleanValue() != z10) {
                if (i10 != iNextInt) {
                    list.set(i10, t10);
                }
                i10++;
            }
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iO = u.o(list);
        if (i10 > iO) {
            return true;
        }
        while (true) {
            list.remove(iO);
            if (iO == i10) {
                return true;
            }
            iO--;
        }
    }

    public static <T> boolean H(Iterable<? extends T> iterable, zd.l<? super T, Boolean> lVar) {
        ae.r.f(iterable, "<this>");
        ae.r.f(lVar, "predicate");
        return F(iterable, lVar, true);
    }

    public static final <T> boolean I(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ae.r.f(collection, "<this>");
        ae.r.f(iterable, "elements");
        return collection.removeAll(E(iterable));
    }

    public static <T> boolean J(List<T> list, zd.l<? super T, Boolean> lVar) {
        ae.r.f(list, "<this>");
        ae.r.f(lVar, "predicate");
        return G(list, lVar, true);
    }

    public static <T> T K(List<T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T L(List<T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T M(List<T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(u.o(list));
    }

    public static <T> T N(List<T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(u.o(list));
    }

    public static <T> boolean O(Iterable<? extends T> iterable, zd.l<? super T, Boolean> lVar) {
        ae.r.f(iterable, "<this>");
        ae.r.f(lVar, "predicate");
        return F(iterable, lVar, false);
    }

    public static final <T> boolean P(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ae.r.f(collection, "<this>");
        ae.r.f(iterable, "elements");
        return collection.retainAll(E(iterable));
    }
}
