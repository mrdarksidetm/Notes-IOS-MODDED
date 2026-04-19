package nd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class c0 extends b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ie.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f16113a;

        public a(Iterable iterable) {
            this.f16113a = iterable;
        }

        @Override // ie.g
        public Iterator<T> iterator() {
            return this.f16113a.iterator();
        }
    }

    public static <T> HashSet<T> A0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return (HashSet) y0(iterable, new HashSet(q0.b(v.x(iterable, 12))));
    }

    public static int[] B0(Collection<Integer> collection) {
        ae.r.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> C0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return u.t(E0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u.m();
        }
        if (size != 1) {
            return F0(collection);
        }
        return t.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] D0(Collection<Long> collection) {
        ae.r.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> List<T> E0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return iterable instanceof Collection ? F0((Collection) iterable) : (List) y0(iterable, new ArrayList());
    }

    public static <T> List<T> F0(Collection<? extends T> collection) {
        ae.r.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> G0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) y0(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> H0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return y0.c((Set) y0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return y0.b();
        }
        if (size != 1) {
            return (Set) y0(iterable, new LinkedHashSet(q0.b(collection.size())));
        }
        return x0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> List<List<T>> I0(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int iH;
        ae.r.f(iterable, "<this>");
        a1.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = a1.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((iH = ge.o.h(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iH);
            for (int i13 = 0; i13 < iH; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T, R> List<R> J0(Iterable<? extends T> iterable, int i10, int i11, boolean z10, zd.l<? super List<? extends T>, ? extends R> lVar) {
        ae.r.f(iterable, "<this>");
        ae.r.f(lVar, "transform");
        a1.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = a1.b(iterable.iterator(), i10, i11, z10, true);
            while (itB.hasNext()) {
                arrayList.add(lVar.invoke((List) itB.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        u0 u0Var = new u0(list);
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size)) {
                break;
            }
            int iH = ge.o.h(i10, size - i12);
            if (!z10 && iH < i10) {
                break;
            }
            u0Var.d(i12, iH + i12);
            arrayList2.add(lVar.invoke(u0Var));
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T, R> List<md.s<T, R>> K0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ae.r.f(iterable, "<this>");
        ae.r.f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v.x(iterable, 10), v.x(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(md.x.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> ie.g<T> R(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean S(Iterable<? extends T> iterable, T t10) {
        ae.r.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : c0(iterable, t10) >= 0;
    }

    public static <T> List<T> T(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        ae.r.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                return u.m();
            }
            if (size == 1) {
                return t.d(i0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return u.t(arrayList);
    }

    public static <T> List<T> U(List<? extends T> list, int i10) {
        ae.r.f(list, "<this>");
        if (i10 >= 0) {
            return v0(list, ge.o.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> V(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        return (List) W(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C W(Iterable<? extends T> iterable, C c10) {
        ae.r.f(iterable, "<this>");
        ae.r.f(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T X(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) Y((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T Y(List<? extends T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T Z(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T a0(List<? extends T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T b0(List<? extends T> list, int i10) {
        ae.r.f(list, "<this>");
        if (i10 < 0 || i10 > u.o(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T> int c0(Iterable<? extends T> iterable, T t10) {
        ae.r.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                u.w();
            }
            if (ae.r.b(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Set<T> d0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        ae.r.f(iterable, "<this>");
        ae.r.f(iterable2, "other");
        Set<T> setG0 = G0(iterable);
        z.P(setG0, iterable2);
        return setG0;
    }

    public static final <T, A extends Appendable> A e0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(iterable, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            je.n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String g0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) {
        ae.r.f(iterable, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) e0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String h0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return g0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T i0(Iterable<? extends T> iterable) {
        T next;
        ae.r.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) j0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j0(List<? extends T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(u.o(list));
    }

    public static <T> T k0(List<? extends T> list) {
        ae.r.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T l0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> m0(Iterable<? extends T> iterable, T t10) {
        ae.r.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(v.x(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && ae.r.b(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> n0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ae.r.f(collection, "<this>");
        ae.r.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            z.C(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> o0(Collection<? extends T> collection, T t10) {
        ae.r.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> p0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C0(iterable);
        }
        List<T> listE0 = E0(iterable);
        b0.Q(listE0);
        return listE0;
    }

    public static <T> T q0(Iterable<? extends T> iterable) {
        ae.r.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T r0(List<? extends T> list) {
        ae.r.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T s0(List<? extends T> list) {
        ae.r.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> t0(List<? extends T> list, ge.i iVar) {
        ae.r.f(list, "<this>");
        ae.r.f(iVar, "indices");
        return iVar.isEmpty() ? u.m() : C0(list.subList(iVar.d().intValue(), iVar.f().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> u0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        ae.r.f(iterable, "<this>");
        ae.r.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listE0 = E0(iterable);
            y.B(listE0, comparator);
            return listE0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return C0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        o.z(array, comparator);
        return o.c(array);
    }

    public static <T> List<T> v0(Iterable<? extends T> iterable, int i10) {
        ae.r.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return u.m();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return C0(iterable);
            }
            if (i10 == 1) {
                return t.d(X(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return u.t(arrayList);
    }

    public static boolean[] w0(Collection<Boolean> collection) {
        ae.r.f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] x0(Collection<Byte> collection) {
        ae.r.f(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C y0(Iterable<? extends T> iterable, C c10) {
        ae.r.f(iterable, "<this>");
        ae.r.f(c10, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static float[] z0(Collection<Float> collection) {
        ae.r.f(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }
}
