package q2;

import ae.i;
import ae.j;
import ae.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection<d>, be.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18974c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f18975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18976b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final e a() {
            return h.a().b();
        }
    }

    public e(List<d> list) {
        this.f18975a = list;
        this.f18976b = list.size();
    }

    public boolean a(d dVar) {
        return this.f18975a.contains(dVar);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return a((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f18975a.containsAll(collection);
    }

    public final d d(int i10) {
        return this.f18975a.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && r.b(this.f18975a, ((e) obj).f18975a);
    }

    public final List<d> f() {
        return this.f18975a;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f18975a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f18975a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<d> iterator() {
        return this.f18975a.iterator();
    }

    public int l() {
        return this.f18976b;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super d> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i.b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f18975a + ')';
    }
}
