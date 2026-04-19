package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<b, a> f7512a = new HashMap();

    private boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t10, T t11, b bVar) {
        if (t10.compareTo(t11) <= 0) {
            this.f7512a.put(bVar, new a(bVar, "'" + t10 + "' <= '" + t11 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f7512a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public <T> c a(T t10, T t11, b bVar) {
        if (!a(t10, t11)) {
            this.f7512a.put(bVar, new a(bVar, "'" + t10 + "' != '" + t11 + "'"));
        }
        return this;
    }

    public boolean a() {
        return !this.f7512a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.f7512a.containsKey(bVar);
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f7512a.values().iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Verifier:");
        Iterator<a> it = this.f7512a.values().iterator();
        while (it.hasNext()) {
            sb2.append("\n\t" + it.next());
        }
        return sb2.toString();
    }
}
