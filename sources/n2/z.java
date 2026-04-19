package n2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends r implements List<s>, be.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ List<s> f15908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<s> f15909i;

    /* JADX WARN: Multi-variable type inference failed */
    public z(List<? extends s> list) {
        super(null);
        this.f15908h = list;
        if (!(!list.isEmpty())) {
            throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
        }
        this.f15909i = new ArrayList(list);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof s) {
            return o((s) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f15908h.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && ae.r.b(this.f15909i, ((z) obj).f15909i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f15909i.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof s) {
            return u((s) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f15908h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<s> iterator() {
        return this.f15908h.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof s) {
            return v((s) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<s> listIterator() {
        return this.f15908h.listIterator();
    }

    @Override // java.util.List
    public ListIterator<s> listIterator(int i10) {
        return this.f15908h.listIterator(i10);
    }

    public boolean o(s sVar) {
        return this.f15908h.contains(sVar);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public s get(int i10) {
        return this.f15908h.get(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ s remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<s> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<s> s() {
        return this.f15909i;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ s set(int i10, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return t();
    }

    @Override // java.util.List
    public void sort(Comparator<? super s> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<s> subList(int i10, int i11) {
        return this.f15908h.subList(i10, i11);
    }

    public int t() {
        return this.f15908h.size();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f15909i + ')';
    }

    public int u(s sVar) {
        return this.f15908h.indexOf(sVar);
    }

    public int v(s sVar) {
        return this.f15908h.lastIndexOf(sVar);
    }
}
