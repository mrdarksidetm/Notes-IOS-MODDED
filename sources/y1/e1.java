package y1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public interface e1 {

    public static final class a implements Collection<Object>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Object> f23236a;

        public a(Set<Object> set) {
            this.f23236a = set;
        }

        public /* synthetic */ a(Set set, int i10, ae.j jVar) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f23236a.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f23236a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f23236a.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f23236a.containsAll(collection);
        }

        public int d() {
            return this.f23236a.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f23236a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.f23236a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f23236a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.f23236a.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.f23236a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return ae.i.a(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ae.i.b(this, tArr);
        }
    }

    boolean a(Object obj, Object obj2);

    void b(a aVar);
}
