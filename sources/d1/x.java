package d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import w0.f;

/* JADX INFO: loaded from: classes.dex */
public final class x<K, V> implements g0, Map<K, V>, be.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i0 f9430a = new a(w0.a.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f9431b = new q(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<K> f9432c = new r(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection<V> f9433d = new t(this);

    public static final class a<K, V> extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private w0.f<K, ? extends V> f9434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9435d;

        public a(w0.f<K, ? extends V> fVar) {
            this.f9434c = fVar;
        }

        @Override // d1.i0
        public void c(i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) i0Var;
            synchronized (y.f9436a) {
                this.f9434c = aVar.f9434c;
                this.f9435d = aVar.f9435d;
                md.i0 i0Var2 = md.i0.f15558a;
            }
        }

        @Override // d1.i0
        public i0 d() {
            return new a(this.f9434c);
        }

        public final w0.f<K, V> i() {
            return this.f9434c;
        }

        public final int j() {
            return this.f9435d;
        }

        public final void k(w0.f<K, ? extends V> fVar) {
            this.f9434c = fVar;
        }

        public final void l(int i10) {
            this.f9435d = i10;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        return this.f9431b;
    }

    public Set<K> c() {
        return this.f9432c;
    }

    @Override // java.util.Map
    public void clear() {
        k kVarD;
        i0 i0VarF = f();
        ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) p.F((a) i0VarF);
        aVar.i();
        w0.f<K, V> fVarA = w0.a.a();
        if (fVarA != aVar.i()) {
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (y.f9436a) {
                    aVar3.k(fVarA);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            p.Q(kVarD, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return e().i().containsValue(obj);
    }

    public final int d() {
        return e().j();
    }

    public final a<K, V> e() {
        i0 i0VarF = f();
        ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) p.X((a) i0VarF, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // d1.g0
    public i0 f() {
        return this.f9430a;
    }

    public int g() {
        return e().i().size();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return e().i().get(obj);
    }

    public Collection<V> i() {
        return this.f9433d;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return e().i().isEmpty();
    }

    public final boolean j(V v10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ae.r.b(((Map.Entry) next).getValue(), v10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    @Override // d1.g0
    public void n(i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f9430a = (a) i0Var;
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        w0.f<K, V> fVarI;
        int iJ;
        V vPut;
        k kVarD;
        boolean z10;
        do {
            synchronized (y.f9436a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) p.F((a) i0VarF);
                fVarI = aVar.i();
                iJ = aVar.j();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(fVarI);
            f.a<K, V> aVarN = fVarI.n();
            vPut = aVarN.put(k10, v10);
            w0.f<K, V> fVarBuild = aVarN.build();
            if (ae.r.b(fVarBuild, fVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (y.f9436a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        w0.f<K, V> fVarI;
        int iJ;
        k kVarD;
        boolean z10;
        do {
            synchronized (y.f9436a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) p.F((a) i0VarF);
                fVarI = aVar.i();
                iJ = aVar.j();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(fVarI);
            f.a<K, V> aVarN = fVarI.n();
            aVarN.putAll(map);
            w0.f<K, V> fVarBuild = aVarN.build();
            if (ae.r.b(fVarBuild, fVarI)) {
                return;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (y.f9436a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        w0.f<K, V> fVarI;
        int iJ;
        V vRemove;
        k kVarD;
        boolean z10;
        do {
            synchronized (y.f9436a) {
                i0 i0VarF = f();
                ae.r.d(i0VarF, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) p.F((a) i0VarF);
                fVarI = aVar.i();
                iJ = aVar.j();
                md.i0 i0Var = md.i0.f15558a;
            }
            ae.r.c(fVarI);
            f.a<K, V> aVarN = fVarI.n();
            vRemove = aVarN.remove(obj);
            w0.f<K, V> fVarBuild = aVarN.build();
            if (ae.r.b(fVarBuild, fVarI)) {
                break;
            }
            i0 i0VarF2 = f();
            ae.r.d(i0VarF2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i0VarF2;
            p.J();
            synchronized (p.I()) {
                kVarD = k.f9368e.d();
                a aVar3 = (a) p.h0(aVar2, this, kVarD);
                synchronized (y.f9436a) {
                    z10 = true;
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(kVarD, this);
        } while (!z10);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
