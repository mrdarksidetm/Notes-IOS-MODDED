package t;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f20608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f20609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f20610c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20611d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // t.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f20615d;
        }

        @Override // t.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f20614c;
        }
    }

    /* JADX INFO: renamed from: t.b$b, reason: collision with other inner class name */
    private static class C0423b<K, V> extends e<K, V> {
        C0423b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // t.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f20614c;
        }

        @Override // t.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f20615d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f20612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f20613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f20614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f20615d;

        c(K k10, V v10) {
            this.f20612a = k10;
            this.f20613b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20612a.equals(cVar.f20612a) && this.f20613b.equals(cVar.f20613b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20612a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20613b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20612a.hashCode() ^ this.f20613b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20612a + com.amazon.a.a.o.b.f.f7479b + this.f20613b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f20616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20617b = true;

        d() {
        }

        @Override // t.b.f
        void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f20616a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f20615d;
                this.f20616a = cVar3;
                this.f20617b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f20617b) {
                this.f20617b = false;
                cVar = b.this.f20608a;
            } else {
                c<K, V> cVar2 = this.f20616a;
                cVar = cVar2 != null ? cVar2.f20614c : null;
            }
            this.f20616a = cVar;
            return this.f20616a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20617b) {
                return b.this.f20608a != null;
            }
            c<K, V> cVar = this.f20616a;
            return (cVar == null || cVar.f20614c == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f20619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f20620b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f20619a = cVar2;
            this.f20620b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f20620b;
            c<K, V> cVar2 = this.f20619a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // t.b.f
        public void b(c<K, V> cVar) {
            if (this.f20619a == cVar && cVar == this.f20620b) {
                this.f20620b = null;
                this.f20619a = null;
            }
            c<K, V> cVar2 = this.f20619a;
            if (cVar2 == cVar) {
                this.f20619a = c(cVar2);
            }
            if (this.f20620b == cVar) {
                this.f20620b = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f20620b;
            this.f20620b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20620b != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f20608a;
    }

    protected c<K, V> b(K k10) {
        c<K, V> cVar = this.f20608a;
        while (cVar != null && !cVar.f20612a.equals(k10)) {
            cVar = cVar.f20614c;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f20610c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0423b c0423b = new C0423b(this.f20609b, this.f20608a);
        this.f20610c.put(c0423b, Boolean.FALSE);
        return c0423b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry<K, V> f() {
        return this.f20609b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f20608a, this.f20609b);
        this.f20610c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f20611d++;
        c<K, V> cVar2 = this.f20609b;
        if (cVar2 == null) {
            this.f20608a = cVar;
        } else {
            cVar2.f20614c = cVar;
            cVar.f20615d = cVar2;
        }
        this.f20609b = cVar;
        return cVar;
    }

    public V l(K k10, V v10) {
        c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.f20613b;
        }
        k(k10, v10);
        return null;
    }

    public V n(K k10) {
        c<K, V> cVarB = b(k10);
        if (cVarB == null) {
            return null;
        }
        this.f20611d--;
        if (!this.f20610c.isEmpty()) {
            Iterator<f<K, V>> it = this.f20610c.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(cVarB);
            }
        }
        c<K, V> cVar = cVarB.f20615d;
        c<K, V> cVar2 = cVarB.f20614c;
        if (cVar != null) {
            cVar.f20614c = cVar2;
        } else {
            this.f20608a = cVar2;
        }
        c<K, V> cVar3 = cVarB.f20614c;
        if (cVar3 != null) {
            cVar3.f20615d = cVar;
        } else {
            this.f20609b = cVar;
        }
        cVarB.f20614c = null;
        cVarB.f20615d = null;
        return cVarB.f20613b;
    }

    public int size() {
        return this.f20611d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
