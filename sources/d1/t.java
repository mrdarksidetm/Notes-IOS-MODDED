package d1;

import d1.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import w0.f;

/* JADX INFO: loaded from: classes.dex */
final class t<K, V> extends s<K, V, V> {
    public t(x<K, V> xVar) {
        super(xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!a().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(V v10) {
        y.b();
        throw new md.i();
    }

    public Void l(Collection<? extends V> collection) {
        y.b();
        throw new md.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f0<K, V> iterator() {
        return new f0<>(a(), ((w0.d) a().e().i().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return a().j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        w0.f<K, V> fVarI;
        int iJ;
        boolean z10;
        k kVarD;
        Set setH0 = nd.c0.H0(collection);
        x<K, V> xVarA = a();
        boolean z11 = false;
        do {
            synchronized (y.f9436a) {
                i0 i0VarF = xVarA.f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x.a aVar = (x.a) p.F((x.a) i0VarF);
                fVarI = aVar.i();
                iJ = aVar.j();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(fVarI);
            f.a<K, V> aVarN = fVarI.n();
            z10 = true;
            for (Map.Entry<K, V> entry : xVarA.entrySet()) {
                if (setH0.contains(entry.getValue())) {
                    aVarN.remove(entry.getKey());
                    z11 = true;
                }
            }
            md.i0 i0Var2 = md.i0.f15558a;
            w0.f<K, V> fVarBuild = aVarN.build();
            if (ae.r.b(fVarBuild, fVarI)) {
                break;
            }
            i0 i0VarF2 = xVarA.f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            x.a aVar2 = (x.a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                x.a aVar3 = (x.a) p.h0(aVar2, xVarA, kVarD);
                synchronized (y.f9436a) {
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, xVarA);
        } while (!z10);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        w0.f<K, V> fVarI;
        int iJ;
        boolean z10;
        k kVarD;
        Set setH0 = nd.c0.H0(collection);
        x<K, V> xVarA = a();
        boolean z11 = false;
        do {
            synchronized (y.f9436a) {
                i0 i0VarF = xVarA.f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x.a aVar = (x.a) p.F((x.a) i0VarF);
                fVarI = aVar.i();
                iJ = aVar.j();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(fVarI);
            f.a<K, V> aVarN = fVarI.n();
            z10 = true;
            for (Map.Entry<K, V> entry : xVarA.entrySet()) {
                if (!setH0.contains(entry.getValue())) {
                    aVarN.remove(entry.getKey());
                    z11 = true;
                }
            }
            md.i0 i0Var2 = md.i0.f15558a;
            w0.f<K, V> fVarBuild = aVarN.build();
            if (ae.r.b(fVarBuild, fVarI)) {
                break;
            }
            i0 i0VarF2 = xVarA.f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            x.a aVar2 = (x.a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                x.a aVar3 = (x.a) p.h0(aVar2, xVarA, kVarD);
                synchronized (y.f9436a) {
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, xVarA);
        } while (!z10);
        return z11;
    }
}
