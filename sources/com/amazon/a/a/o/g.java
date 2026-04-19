package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f7513a = new WeakHashMap<>();

    public void a(T t10) {
        this.f7513a.put(t10, null);
    }

    public boolean a() {
        return this.f7513a.isEmpty();
    }

    public int b() {
        return this.f7513a.size();
    }

    public void b(T t10) {
        this.f7513a.remove(t10);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f7513a.keySet().iterator();
    }

    public String toString() {
        return this.f7513a.keySet().toString();
    }
}
