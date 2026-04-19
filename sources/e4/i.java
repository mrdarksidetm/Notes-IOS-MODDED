package e4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractList<String> implements d, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10538a;

    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f10539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10540b;

        a(int i10) {
            this.f10540b = i10;
            this.f10539a = i.this.f10538a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10539a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f10539a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10539a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10539a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10539a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10539a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f10542a;

        b() {
            this.f10542a = i.this.f10538a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10542a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10542a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i(d dVar) {
        this.f10538a = dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f10538a.get(i10);
    }

    @Override // e4.d
    public void c(androidx.datastore.preferences.protobuf.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // e4.d
    public List<?> i() {
        return this.f10538a.i();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // e4.d
    public d j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // e4.d
    public Object m(int i10) {
        return this.f10538a.m(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10538a.size();
    }
}
