package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends c<String> implements e4.d, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f3509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e4.d f3510d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f3511b;

    static {
        c0 c0Var = new c0();
        f3509c = c0Var;
        c0Var.e();
        f3510d = c0Var;
    }

    public c0() {
        this(10);
    }

    public c0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private c0(ArrayList<Object> arrayList) {
        this.f3511b = arrayList;
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof g ? ((g) obj).D() : y.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof e4.d) {
            collection = ((e4.d) collection).i();
        }
        boolean zAddAll = this.f3511b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f3511b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // e4.d
    public void c(g gVar) {
        a();
        this.f3511b.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f3511b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f3511b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String strD = gVar.D();
            if (gVar.s()) {
                this.f3511b.set(i10, strD);
            }
            return strD;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = y.j(bArr);
        if (y.g(bArr)) {
            this.f3511b.set(i10, strJ);
        }
        return strJ;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // e4.d
    public List<?> i() {
        return Collections.unmodifiableList(this.f3511b);
    }

    @Override // e4.d
    public e4.d j() {
        return p() ? new e4.i(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c0 g(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f3511b);
        return new c0((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object objRemove = this.f3511b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // e4.d
    public Object m(int i10) {
        return this.f3511b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return d(this.f3511b.set(i10, str));
    }

    @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.y.i
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3511b.size();
    }
}
