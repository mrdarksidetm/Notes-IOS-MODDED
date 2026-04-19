package io.objectbox.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Integer f13321e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TARGET> f13322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<TARGET, Integer> f13323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map<TARGET, Boolean> f13324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<TARGET, Boolean> f13325d;

    private void a() {
        this.f13322a.getClass();
    }

    private void b() {
        a();
        if (this.f13324c == null) {
            synchronized (this) {
                if (this.f13324c == null) {
                    this.f13324c = new LinkedHashMap();
                    this.f13325d = new LinkedHashMap();
                    this.f13323b = new HashMap();
                    for (TARGET target : this.f13322a) {
                        Integer numPut = this.f13323b.put(target, f13321e);
                        if (numPut != null) {
                            this.f13323b.put(target, Integer.valueOf(numPut.intValue() + 1));
                        }
                    }
                }
            }
        }
    }

    private void d(TARGET target) {
        b();
        Integer numPut = this.f13323b.put(target, f13321e);
        if (numPut != null) {
            this.f13323b.put(target, Integer.valueOf(numPut.intValue() + 1));
        }
        this.f13324c.put(target, Boolean.TRUE);
        this.f13325d.remove(target);
    }

    private void f(Collection<? extends TARGET> collection) {
        b();
        Iterator<? extends TARGET> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    private void k(TARGET target) {
        b();
        Integer numRemove = this.f13323b.remove(target);
        if (numRemove != null) {
            if (numRemove.intValue() == 1) {
                this.f13323b.remove(target);
                this.f13324c.remove(target);
                this.f13325d.put(target, Boolean.TRUE);
            } else {
                if (numRemove.intValue() > 1) {
                    this.f13323b.put(target, Integer.valueOf(numRemove.intValue() - 1));
                    return;
                }
                throw new IllegalStateException("Illegal count: " + numRemove);
            }
        }
    }

    @Override // java.util.List
    public synchronized void add(int i10, TARGET target) {
        d(target);
        this.f13322a.add(i10, target);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(TARGET target) {
        d(target);
        return this.f13322a.add(target);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i10, Collection<? extends TARGET> collection) {
        f(collection);
        return this.f13322a.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection<? extends TARGET> collection) {
        f(collection);
        return this.f13322a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        b();
        List<TARGET> list = this.f13322a;
        if (list != null) {
            Iterator<TARGET> it = list.iterator();
            while (it.hasNext()) {
                this.f13325d.put(it.next(), Boolean.TRUE);
            }
            list.clear();
        }
        Map<TARGET, Boolean> map = this.f13324c;
        if (map != null) {
            map.clear();
        }
        Map<TARGET, Integer> map2 = this.f13323b;
        if (map2 != null) {
            map2.clear();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        a();
        return this.f13322a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        a();
        return this.f13322a.containsAll(collection);
    }

    @Override // java.util.List
    public TARGET get(int i10) {
        a();
        return this.f13322a.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        a();
        return this.f13322a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        a();
        return this.f13322a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<TARGET> iterator() {
        a();
        return this.f13322a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        a();
        return this.f13322a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<TARGET> listIterator() {
        a();
        return this.f13322a.listIterator();
    }

    @Override // java.util.List
    public ListIterator<TARGET> listIterator(int i10) {
        a();
        return this.f13322a.listIterator(i10);
    }

    @Override // java.util.List
    public synchronized TARGET remove(int i10) {
        TARGET targetRemove;
        b();
        targetRemove = this.f13322a.remove(i10);
        k(targetRemove);
        return targetRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean zRemove;
        b();
        zRemove = this.f13322a.remove(obj);
        if (zRemove) {
            k(obj);
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        boolean zRemove;
        zRemove = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        boolean z10;
        b();
        z10 = false;
        ArrayList arrayList = null;
        for (TARGET target : this.f13322a) {
            if (!collection.contains(target)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(target);
                z10 = true;
            }
        }
        if (arrayList != null) {
            removeAll(arrayList);
        }
        return z10;
    }

    @Override // java.util.List
    public synchronized TARGET set(int i10, TARGET target) {
        TARGET target2;
        b();
        target2 = this.f13322a.set(i10, target);
        k(target2);
        d(target);
        return target2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        a();
        return this.f13322a.size();
    }

    @Override // java.util.List
    public List<TARGET> subList(int i10, int i11) {
        a();
        return this.f13322a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        a();
        return this.f13322a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        a();
        return (T[]) this.f13322a.toArray(tArr);
    }
}
