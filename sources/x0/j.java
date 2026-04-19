package x0;

import ae.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import nd.o;
import nd.p;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public final class j<E> extends b<E> implements w0.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22932c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22933d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f22934e = new j(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f22935b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final j a() {
            return j.f22934e;
        }
    }

    public j(Object[] objArr) {
        this.f22935b = objArr;
        a1.a.a(objArr.length <= 32);
    }

    private final Object[] f(int i10) {
        return new Object[i10];
    }

    @Override // nd.a
    public int a() {
        return this.f22935b.length;
    }

    @Override // java.util.List, w0.e
    public w0.e<E> add(int i10, E e10) {
        a1.d.b(i10, size());
        if (i10 == size()) {
            return add((Object) e10);
        }
        if (size() < 32) {
            Object[] objArrF = f(size() + 1);
            o.l(this.f22935b, objArrF, 0, 0, i10, 6, null);
            o.h(this.f22935b, objArrF, i10 + 1, i10, size());
            objArrF[i10] = e10;
            return new j(objArrF);
        }
        Object[] objArr = this.f22935b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        r.e(objArrCopyOf, "copyOf(this, size)");
        o.h(this.f22935b, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = e10;
        return new e(objArrCopyOf, l.c(this.f22935b[31]), size() + 1, 0);
    }

    @Override // java.util.Collection, java.util.List, w0.e
    public w0.e<E> add(E e10) {
        if (size() >= 32) {
            return new e(this.f22935b, l.c(e10), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22935b, size() + 1);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = e10;
        return new j(objArrCopyOf);
    }

    @Override // x0.b, java.util.Collection, java.util.List, w0.e
    public w0.e<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            e.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22935b, size() + collection.size());
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // w0.e
    public e.a<E> builder() {
        return new f(this, null, this.f22935b, 0);
    }

    @Override // nd.c, java.util.List
    public E get(int i10) {
        a1.d.a(i10, size());
        return (E) this.f22935b[i10];
    }

    @Override // w0.e
    public w0.e<E> h(int i10) {
        a1.d.a(i10, size());
        if (size() == 1) {
            return f22934e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22935b, size() - 1);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        o.h(this.f22935b, objArrCopyOf, i10, i10 + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // nd.c, java.util.List
    public int indexOf(Object obj) {
        return p.V(this.f22935b, obj);
    }

    @Override // nd.c, java.util.List
    public int lastIndexOf(Object obj) {
        return p.t0(this.f22935b, obj);
    }

    @Override // nd.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        a1.d.b(i10, size());
        return new c(this.f22935b, i10, size());
    }

    @Override // w0.e
    public w0.e<E> q(zd.l<? super E, Boolean> lVar) {
        Object[] objArrCopyOf = this.f22935b;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f22935b[i10];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.f22935b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    r.e(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f22934e : new j(o.n(objArrCopyOf, 0, size));
    }

    @Override // nd.c, java.util.List
    public w0.e<E> set(int i10, E e10) {
        a1.d.a(i10, size());
        Object[] objArr = this.f22935b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        r.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = e10;
        return new j(objArrCopyOf);
    }
}
