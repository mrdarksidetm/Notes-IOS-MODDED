package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.i;
import ae.r;
import be.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import nd.c0;
import nd.t;

/* JADX INFO: loaded from: classes2.dex */
public final class NonEmptyList<A> implements List<A>, a {
    private final List<A> all;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonEmptyList(A a10, List<? extends A> list) {
        this(c0.n0(t.d(a10), list));
        r.f(list, "tail");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NonEmptyList(List<? extends A> list) {
        this.all = list;
    }

    @Override // java.util.List
    public void add(int i10, A a10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(A a10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.all.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        r.f(collection, "elements");
        return this.all.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        List<A> list;
        if (obj instanceof NonEmptyList) {
            list = this.all;
            obj = ((NonEmptyList) obj).all;
        } else {
            list = this.all;
        }
        return r.b(list, obj);
    }

    @Override // java.util.List
    public A get(int i10) {
        return this.all.get(i10);
    }

    public final /* synthetic */ Object getHead() {
        return c0.Y(this.all);
    }

    public int getSize() {
        return this.all.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.all.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.all.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<A> iterator() {
        return this.all.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.all.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<A> listIterator() {
        return this.all.listIterator();
    }

    @Override // java.util.List
    public ListIterator<A> listIterator(int i10) {
        return this.all.listIterator(i10);
    }

    @Override // java.util.List
    public A remove(int i10) {
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
    public void replaceAll(UnaryOperator<A> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public A set(int i10, A a10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super A> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<A> subList(int i10, int i11) {
        return this.all.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        r.f(tArr, "array");
        return (T[]) i.b(this, tArr);
    }

    public final /* synthetic */ List toList() {
        return this.all;
    }

    public String toString() {
        return "NonEmptyList(" + c0.h0(this.all, null, null, null, 0, null, null, 63, null) + ')';
    }
}
