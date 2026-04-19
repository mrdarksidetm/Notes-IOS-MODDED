package da;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class p {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final da.c<?> f9906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f9907b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f9908c = new HashSet();

        b(da.c<?> cVar) {
            this.f9906a = cVar;
        }

        void a(b bVar) {
            this.f9907b.add(bVar);
        }

        void b(b bVar) {
            this.f9908c.add(bVar);
        }

        da.c<?> c() {
            return this.f9906a;
        }

        Set<b> d() {
            return this.f9907b;
        }

        boolean e() {
            return this.f9907b.isEmpty();
        }

        boolean f() {
            return this.f9908c.isEmpty();
        }

        void g(b bVar) {
            this.f9908c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0<?> f9909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9910b;

        private c(d0<?> d0Var, boolean z10) {
            this.f9909a = d0Var;
            this.f9910b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f9909a.equals(this.f9909a) && cVar.f9910b == this.f9910b;
        }

        public int hashCode() {
            return ((this.f9909a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9910b).hashCode();
        }
    }

    static void a(List<da.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<da.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<da.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            da.c<?> next = it.next();
            b bVar3 = new b(next);
            for (d0<? super Object> d0Var : next.j()) {
                c cVar = new c(d0Var, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f9910b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", d0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
