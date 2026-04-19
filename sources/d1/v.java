package d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public final class v<T> implements g0, List<T>, RandomAccess, be.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i0 f9422a = new a(w0.a.b());

    public static final class a<T> extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private w0.e<? extends T> f9423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9425e;

        public a(w0.e<? extends T> eVar) {
            this.f9423c = eVar;
        }

        @Override // d1.i0
        public void c(i0 i0Var) {
            synchronized (w.f9429a) {
                ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f9423c = ((a) i0Var).f9423c;
                this.f9424d = ((a) i0Var).f9424d;
                this.f9425e = ((a) i0Var).f9425e;
                md.i0 i0Var2 = md.i0.f15558a;
            }
        }

        @Override // d1.i0
        public i0 d() {
            return new a(this.f9423c);
        }

        public final w0.e<T> i() {
            return this.f9423c;
        }

        public final int j() {
            return this.f9424d;
        }

        public final int k() {
            return this.f9425e;
        }

        public final void l(w0.e<? extends T> eVar) {
            this.f9423c = eVar;
        }

        public final void m(int i10) {
            this.f9424d = i10;
        }

        public final void n(int i10) {
            this.f9425e = i10;
        }
    }

    static final class b extends ae.s implements zd.l<List<T>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<T> f9427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f9426a = i10;
            this.f9427b = collection;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.addAll(this.f9426a, this.f9427b));
        }
    }

    static final class c extends ae.s implements zd.l<List<T>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection<T> f9428a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f9428a = collection;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f9428a));
        }
    }

    private final boolean r(zd.l<? super List<T>, Boolean> lVar) {
        int iJ;
        w0.e<T> eVarI;
        Boolean boolInvoke;
        k kVarD;
        boolean z10;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            e.a<T> aVarBuilder = eVarI.builder();
            boolInvoke = lVar.invoke(aVarBuilder);
            w0.e<T> eVarBuild = aVarBuilder.build();
            if (ae.r.b(eVarBuild, eVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarBuild);
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    public final a<T> a() {
        i0 i0VarF = f();
        ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) p.X((a) i0VarF, this);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        int iJ;
        w0.e<T> eVarI;
        k kVarD;
        boolean z10;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarAdd = eVarI.add(i10, t10);
            if (ae.r.b(eVarAdd, eVarI)) {
                return;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        int iJ;
        w0.e<T> eVarI;
        boolean z10;
        k kVarD;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarAdd = eVarI.add(t10);
            z10 = false;
            if (ae.r.b(eVarAdd, eVarI)) {
                return false;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        return r(new b(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int iJ;
        w0.e<T> eVarI;
        boolean z10;
        k kVarD;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarAddAll = eVarI.addAll(collection);
            z10 = false;
            if (ae.r.b(eVarAddAll, eVarI)) {
                return false;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAddAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        k kVarD;
        i0 i0VarF = f();
        ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) i0VarF;
        p.J();
        synchronized (p.I()) {
            kVarD = k.f9368e.d();
            a aVar2 = (a) p.h0(aVar, this, kVarD);
            synchronized (w.f9429a) {
                aVar2.l(w0.a.b());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        p.Q(kVarD, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return a().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return a().i().containsAll(collection);
    }

    public int d() {
        return a().i().size();
    }

    @Override // d1.g0
    public i0 f() {
        return this.f9422a;
    }

    @Override // java.util.List
    public T get(int i10) {
        return a().i().get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return a().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return a().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return a().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new b0(this, 0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new b0(this, i10);
    }

    @Override // d1.g0
    public void n(i0 i0Var) {
        i0Var.g(f());
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f9422a = (a) i0Var;
    }

    public final int o() {
        i0 i0VarF = f();
        ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) p.F((a) i0VarF)).k();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return s(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iJ;
        w0.e<T> eVarI;
        boolean z10;
        k kVarD;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarRemove = eVarI.remove(obj);
            z10 = false;
            if (ae.r.b(eVarRemove, eVarI)) {
                return false;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        int iJ;
        w0.e<T> eVarI;
        boolean z10;
        k kVarD;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarRemoveAll = eVarI.removeAll((Collection<? extends T>) collection);
            z10 = false;
            if (ae.r.b(eVarRemoveAll, eVarI)) {
                return false;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemoveAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        return r(new c(collection));
    }

    public T s(int i10) {
        int iJ;
        w0.e<T> eVarI;
        k kVarD;
        boolean z10;
        T t10 = get(i10);
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVarH = eVarI.h(i10);
            if (ae.r.b(eVarH, eVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarH);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return t10;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        int iJ;
        w0.e<T> eVarI;
        k kVarD;
        boolean z10;
        T t11 = get(i10);
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            w0.e<T> eVar = eVarI.set(i10, t10);
            if (ae.r.b(eVar, eVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVar);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        if ((i10 >= 0 && i10 <= i11) && i11 <= size()) {
            return new j0(this, i10, i11);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    public final void t(int i10, int i11) {
        int iJ;
        w0.e<T> eVarI;
        k kVarD;
        boolean z10;
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            e.a<T> aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).clear();
            w0.e<T> eVarBuild = aVarBuilder.build();
            if (ae.r.b(eVarBuild, eVarI)) {
                return;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarBuild);
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }

    public final int u(Collection<? extends T> collection, int i10, int i11) {
        int iJ;
        w0.e<T> eVarI;
        k kVarD;
        boolean z10;
        int size = size();
        do {
            synchronized (w.f9429a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) i0VarF);
                iJ = aVar.j();
                eVarI = aVar.i();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(eVarI);
            e.a<T> aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).retainAll(collection);
            w0.e<T> eVarBuild = aVarBuilder.build();
            if (ae.r.b(eVarBuild, eVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (w.f9429a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarBuild);
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return size - size();
    }
}
