package j0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements List<a>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f13609a;

    public interface a {
        int getIndex();

        Object getKey();
    }

    public a0() {
        this(new d1.v());
    }

    private a0(List<a> list) {
        this.f13609a = list;
    }

    public boolean a(a aVar) {
        return this.f13609a.contains(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a) {
            return a((a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13609a.containsAll(collection);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a get(int i10) {
        return this.f13609a.get(i10);
    }

    public int f() {
        return this.f13609a.size();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof a) {
            return l((a) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f13609a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f13609a.iterator();
    }

    public int l(a aVar) {
        return this.f13609a.indexOf(aVar);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof a) {
            return n((a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<a> listIterator() {
        return this.f13609a.listIterator();
    }

    @Override // java.util.List
    public ListIterator<a> listIterator(int i10) {
        return this.f13609a.listIterator(i10);
    }

    public int n(a aVar) {
        return this.f13609a.lastIndexOf(aVar);
    }

    public final void o(a aVar) {
        this.f13609a.add(aVar);
    }

    public final void r(a aVar) {
        this.f13609a.remove(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a remove(int i10) {
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
    public void replaceAll(UnaryOperator<a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a set(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<a> subList(int i10, int i11) {
        return this.f13609a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }
}
