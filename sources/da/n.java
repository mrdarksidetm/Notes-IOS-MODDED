package da;

import android.util.Log;
import c0.u0;
import com.google.firebase.components.ComponentRegistrar;
import da.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class n implements d, fa.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ma.b<Set<Object>> f9892i = new ma.b() { // from class: da.k
        @Override // ma.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<c<?>, ma.b<?>> f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<d0<?>, ma.b<?>> f9894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<d0<?>, x<?>> f9895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ma.b<ComponentRegistrar>> f9896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f9897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f9898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f9899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f9900h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f9901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ma.b<ComponentRegistrar>> f9902b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c<?>> f9903c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f9904d = i.f9885a;

        b(Executor executor) {
            this.f9901a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f9903c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f9902b.add(new ma.b() { // from class: da.o
                @Override // ma.b
                public final Object get() {
                    return n.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<ma.b<ComponentRegistrar>> collection) {
            this.f9902b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f9901a, this.f9902b, this.f9903c, this.f9904d);
        }

        public b g(i iVar) {
            this.f9904d = iVar;
            return this;
        }
    }

    private n(Executor executor, Iterable<ma.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f9893a = new HashMap();
        this.f9894b = new HashMap();
        this.f9895c = new HashMap();
        this.f9897e = new HashSet();
        this.f9899g = new AtomicReference<>();
        u uVar = new u(executor);
        this.f9898f = uVar;
        this.f9900h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(uVar, u.class, ka.d.class, ka.c.class));
        arrayList.add(c.s(this, fa.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f9896d = o(iterable);
        l(arrayList);
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<ma.b<ComponentRegistrar>> it = this.f9896d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f9900h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9897e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f9897e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f9893a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f9893a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f9893a.put(cVar, new w(new ma.b() { // from class: da.j
                    @Override // ma.b
                    public final Object get() {
                        return this.f9886a.p(cVar);
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        s();
    }

    private void m(Map<c<?>, ma.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, ma.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            ma.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f9898f.c();
    }

    private static <T> List<T> o(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c cVar) {
        return cVar.h().a(new e0(cVar, this));
    }

    private void s() {
        Boolean bool = this.f9899g.get();
        if (bool != null) {
            m(this.f9893a, bool.booleanValue());
        }
    }

    private void t() {
        Map map;
        d0<?> d0VarB;
        Object objC;
        for (c<?> cVar : this.f9893a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.f() && !this.f9895c.containsKey(qVar.b())) {
                    map = this.f9895c;
                    d0VarB = qVar.b();
                    objC = x.b(Collections.emptySet());
                } else if (this.f9894b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.b()));
                    }
                    if (!qVar.f()) {
                        map = this.f9894b;
                        d0VarB = qVar.b();
                        objC = b0.c();
                    }
                }
                map.put(d0VarB, objC);
            }
        }
    }

    private List<Runnable> u(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final ma.b<?> bVar = this.f9893a.get(cVar);
                for (d0<? super Object> d0Var : cVar.j()) {
                    if (this.f9894b.containsKey(d0Var)) {
                        final b0 b0Var = (b0) this.f9894b.get(d0Var);
                        arrayList.add(new Runnable() { // from class: da.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                b0Var.f(bVar);
                            }
                        });
                    } else {
                        this.f9894b.put(d0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> v() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, ma.b<?>> entry : this.f9893a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                ma.b<?> value = entry.getValue();
                for (d0<? super Object> d0Var : key.j()) {
                    if (!map.containsKey(d0Var)) {
                        map.put(d0Var, new HashSet());
                    }
                    ((Set) map.get(d0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f9895c.containsKey(entry2.getKey())) {
                final x<?> xVar = this.f9895c.get(entry2.getKey());
                for (final ma.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: da.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f9895c.put((d0) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // da.d
    public synchronized <T> ma.b<Set<T>> e(d0<T> d0Var) {
        x<?> xVar = this.f9895c.get(d0Var);
        if (xVar != null) {
            return xVar;
        }
        return (ma.b<Set<T>>) f9892i;
    }

    @Override // da.d
    public synchronized <T> ma.b<T> g(d0<T> d0Var) {
        c0.c(d0Var, "Null interface requested.");
        return (ma.b) this.f9894b.get(d0Var);
    }

    public void n(boolean z10) {
        HashMap map;
        if (u0.a(this.f9899g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f9893a);
            }
            m(map, z10);
        }
    }
}
