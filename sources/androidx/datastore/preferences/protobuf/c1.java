package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class c1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c1<K, V>.e> f3513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f3514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile c1<K, V>.g f3516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f3517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c1<K, V>.c f3518g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends c1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // androidx.datastore.preferences.protobuf.c1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((t.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.c1
        public void r() {
            if (!q()) {
                for (int i10 = 0; i10 < m(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryL = l(i10);
                    if (((t.b) entryL.getKey()).e()) {
                        entryL.setValue(Collections.unmodifiableList((List) entryL.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((t.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.r();
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f3520b;

        private b() {
            this.f3519a = c1.this.f3513b.size();
        }

        /* synthetic */ b(c1 c1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f3520b == null) {
                this.f3520b = c1.this.f3517f.entrySet().iterator();
            }
            return this.f3520b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> next;
            if (b().hasNext()) {
                next = b().next();
            } else {
                List list = c1.this.f3513b;
                int i10 = this.f3519a - 1;
                this.f3519a = i10;
                next = (Map.Entry<K, V>) list.get(i10);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f3519a;
            return (i10 > 0 && i10 <= c1.this.f3513b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends c1<K, V>.g {
        private c() {
            super(c1.this, null);
        }

        /* synthetic */ c(c1 c1Var, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.c1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(c1.this, null);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f3523a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f3524b = new b();

        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f3523a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f3524b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<c1<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f3525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f3526b;

        e(K k10, V v10) {
            this.f3525a = k10;
            this.f3526b = v10;
        }

        e(c1 c1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f3525a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f3525a, entry.getKey()) && b(this.f3526b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3526b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f3525a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f3526b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            c1.this.h();
            V v11 = this.f3526b;
            this.f3526b = v10;
            return v11;
        }

        public String toString() {
            return this.f3525a + com.amazon.a.a.o.b.f.f7479b + this.f3526b;
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f3530c;

        private f() {
            this.f3528a = -1;
        }

        /* synthetic */ f(c1 c1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f3530c == null) {
                this.f3530c = c1.this.f3514c.entrySet().iterator();
            }
            return this.f3530c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f3529b = true;
            int i10 = this.f3528a + 1;
            this.f3528a = i10;
            return i10 < c1.this.f3513b.size() ? (Map.Entry<K, V>) c1.this.f3513b.get(this.f3528a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3528a + 1 >= c1.this.f3513b.size()) {
                return !c1.this.f3514c.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3529b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f3529b = false;
            c1.this.h();
            if (this.f3528a >= c1.this.f3513b.size()) {
                b().remove();
                return;
            }
            c1 c1Var = c1.this;
            int i10 = this.f3528a;
            this.f3528a = i10 - 1;
            c1Var.u(i10);
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(c1 c1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            c1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = c1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(c1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            c1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c1.this.size();
        }
    }

    private c1(int i10) {
        this.f3512a = i10;
        this.f3513b = Collections.emptyList();
        this.f3514c = Collections.emptyMap();
        this.f3517f = Collections.emptyMap();
    }

    /* synthetic */ c1(int i10, a aVar) {
        this(i10);
    }

    private int g(K k10) {
        int size = this.f3513b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f3513b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = k10.compareTo(this.f3513b.get(i11).getKey());
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f3515d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f3513b.isEmpty() || (this.f3513b instanceof ArrayList)) {
            return;
        }
        this.f3513b = new ArrayList(this.f3512a);
    }

    private SortedMap<K, V> p() {
        h();
        if (this.f3514c.isEmpty() && !(this.f3514c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3514c = treeMap;
            this.f3517f = treeMap.descendingMap();
        }
        return (SortedMap) this.f3514c;
    }

    static <FieldDescriptorType extends t.b<FieldDescriptorType>> c1<FieldDescriptorType, Object> s(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i10) {
        h();
        V value = this.f3513b.remove(i10).getValue();
        if (!this.f3514c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.f3513b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f3513b.isEmpty()) {
            this.f3513b.clear();
        }
        if (this.f3514c.isEmpty()) {
            return;
        }
        this.f3514c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f3514c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3516e == null) {
            this.f3516e = new g(this, null);
        }
        return this.f3516e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        int size = size();
        if (size != c1Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != c1Var.m()) {
            return entrySet().equals(c1Var.entrySet());
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (!l(i10).equals(c1Var.l(i10))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f3514c.equals(c1Var.f3514c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f3513b.get(iG).getValue() : this.f3514c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += this.f3513b.get(i10).hashCode();
        }
        return n() > 0 ? iHashCode + this.f3514c.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> i() {
        if (this.f3518g == null) {
            this.f3518g = new c(this, null);
        }
        return this.f3518g;
    }

    public Map.Entry<K, V> l(int i10) {
        return this.f3513b.get(i10);
    }

    public int m() {
        return this.f3513b.size();
    }

    public int n() {
        return this.f3514c.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        return this.f3514c.isEmpty() ? d.b() : this.f3514c.entrySet();
    }

    public boolean q() {
        return this.f3515d;
    }

    public void r() {
        if (this.f3515d) {
            return;
        }
        this.f3514c = this.f3514c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3514c);
        this.f3517f = this.f3517f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3517f);
        this.f3515d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return u(iG);
        }
        if (this.f3514c.isEmpty()) {
            return null;
        }
        return this.f3514c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3513b.size() + this.f3514c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        h();
        int iG = g(k10);
        if (iG >= 0) {
            return this.f3513b.get(iG).setValue(v10);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= this.f3512a) {
            return p().put(k10, v10);
        }
        int size = this.f3513b.size();
        int i11 = this.f3512a;
        if (size == i11) {
            c1<K, V>.e eVarRemove = this.f3513b.remove(i11 - 1);
            p().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f3513b.add(i10, new e(k10, v10));
        return null;
    }
}
