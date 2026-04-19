package d1;

import ae.n0;
import d1.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.q0;
import w0.f;

/* JADX INFO: loaded from: classes.dex */
final class q<K, V> extends s<K, V, Map.Entry<K, V>> {
    public q(x<K, V> xVar) {
        super(xVar);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (n0.l(obj)) {
            return n((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(Map.Entry<K, V> entry) {
        y.b();
        throw new md.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new c0(a(), ((w0.d) a().e().i().entrySet()).iterator());
    }

    public Void l(Collection<? extends Map.Entry<K, V>> collection) {
        y.b();
        throw new md.i();
    }

    public boolean n(Map.Entry<K, V> entry) {
        return ae.r.b(a().get(entry.getKey()), entry.getValue());
    }

    public boolean o(Map.Entry<K, V> entry) {
        return a().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (n0.l(obj)) {
            return o((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        w0.f<K, V> fVarI;
        int iJ;
        boolean z10;
        k kVarD;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ge.o.d(q0.b(nd.v.x(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            md.s sVarA = md.x.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
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
            for (Map.Entry<K, V> entry2 : xVarA.entrySet()) {
                if ((linkedHashMap.containsKey(entry2.getKey()) && ae.r.b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    aVarN.remove(entry2.getKey());
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
