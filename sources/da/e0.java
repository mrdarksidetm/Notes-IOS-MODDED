package da;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class e0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<d0<?>> f9873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<d0<?>> f9874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<d0<?>> f9875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<d0<?>> f9876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<d0<?>> f9877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f9878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f9879g;

    private static class a implements ka.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f9880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ka.c f9881b;

        public a(Set<Class<?>> set, ka.c cVar) {
            this.f9880a = set;
            this.f9881b = cVar;
        }

        @Override // ka.c
        public void a(ka.a<?> aVar) {
            if (!this.f9880a.contains(aVar.a())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f9881b.a(aVar);
        }
    }

    e0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.d()) {
                boolean zF = qVar.f();
                d0<?> d0VarB = qVar.b();
                if (zF) {
                    hashSet4.add(d0VarB);
                } else {
                    hashSet.add(d0VarB);
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else {
                boolean zF2 = qVar.f();
                d0<?> d0VarB2 = qVar.b();
                if (zF2) {
                    hashSet5.add(d0VarB2);
                } else {
                    hashSet2.add(d0VarB2);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(d0.b(ka.c.class));
        }
        this.f9873a = Collections.unmodifiableSet(hashSet);
        this.f9874b = Collections.unmodifiableSet(hashSet2);
        this.f9875c = Collections.unmodifiableSet(hashSet3);
        this.f9876d = Collections.unmodifiableSet(hashSet4);
        this.f9877e = Collections.unmodifiableSet(hashSet5);
        this.f9878f = cVar.k();
        this.f9879g = dVar;
    }

    @Override // da.d
    public <T> T a(Class<T> cls) {
        if (!this.f9873a.contains(d0.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f9879g.a(cls);
        return !cls.equals(ka.c.class) ? t10 : (T) new a(this.f9878f, (ka.c) t10);
    }

    @Override // da.d
    public <T> Set<T> b(d0<T> d0Var) {
        if (this.f9876d.contains(d0Var)) {
            return this.f9879g.b(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", d0Var));
    }

    @Override // da.d
    public <T> ma.b<T> c(Class<T> cls) {
        return g(d0.b(cls));
    }

    @Override // da.d
    public <T> ma.b<Set<T>> e(d0<T> d0Var) {
        if (this.f9877e.contains(d0Var)) {
            return this.f9879g.e(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", d0Var));
    }

    @Override // da.d
    public <T> T f(d0<T> d0Var) {
        if (this.f9873a.contains(d0Var)) {
            return (T) this.f9879g.f(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", d0Var));
    }

    @Override // da.d
    public <T> ma.b<T> g(d0<T> d0Var) {
        if (this.f9874b.contains(d0Var)) {
            return this.f9879g.g(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", d0Var));
    }
}
