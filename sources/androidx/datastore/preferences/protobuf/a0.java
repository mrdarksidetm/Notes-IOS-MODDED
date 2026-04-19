package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0 f3495f;

    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, a0> f3496a;

        private b(Map.Entry<K, a0> entry) {
            this.f3496a = entry;
        }

        public a0 a() {
            return this.f3496a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f3496a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a0 value = this.f3496a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof n0) {
                return this.f3496a.getValue().d((n0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f3497a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f3497a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f3497a.next();
            return next.getValue() instanceof a0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3497a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f3497a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public n0 f() {
        return c(this.f3495f);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
