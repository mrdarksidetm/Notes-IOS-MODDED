package da;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<d0<? super T>> f9857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<q> f9858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g<T> f9861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f9862g;

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<d0<? super T>> f9864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<q> f9865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g<T> f9868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f9869g;

        @SafeVarargs
        private b(d0<T> d0Var, d0<? super T>... d0VarArr) {
            this.f9863a = null;
            HashSet hashSet = new HashSet();
            this.f9864b = hashSet;
            this.f9865c = new HashSet();
            this.f9866d = 0;
            this.f9867e = 0;
            this.f9869g = new HashSet();
            c0.c(d0Var, "Null interface");
            hashSet.add(d0Var);
            for (d0<? super T> d0Var2 : d0VarArr) {
                c0.c(d0Var2, "Null interface");
            }
            Collections.addAll(this.f9864b, d0VarArr);
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f9863a = null;
            HashSet hashSet = new HashSet();
            this.f9864b = hashSet;
            this.f9865c = new HashSet();
            this.f9866d = 0;
            this.f9867e = 0;
            this.f9869g = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(d0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                c0.c(cls2, "Null interface");
                this.f9864b.add(d0.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> e() {
            this.f9867e = 1;
            return this;
        }

        private void f(d0<?> d0Var) {
            c0.a(!this.f9864b.contains(d0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            c0.c(qVar, "Null dependency");
            f(qVar.b());
            this.f9865c.add(qVar);
            return this;
        }

        public c<T> c() {
            c0.d(this.f9868f != null, "Missing required property: factory.");
            return new c<>(this.f9863a, new HashSet(this.f9864b), new HashSet(this.f9865c), this.f9866d, this.f9867e, this.f9868f, this.f9869g);
        }

        public b<T> d(g<T> gVar) {
            this.f9868f = (g) c0.c(gVar, "Null factory");
            return this;
        }
    }

    private c(String str, Set<d0<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f9856a = str;
        this.f9857b = Collections.unmodifiableSet(set);
        this.f9858c = Collections.unmodifiableSet(set2);
        this.f9859d = i10;
        this.f9860e = i11;
        this.f9861f = gVar;
        this.f9862g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(d0<T> d0Var) {
        return new b<>(d0Var, new d0[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(d0<T> d0Var, d0<? super T>... d0VarArr) {
        return new b<>(d0Var, d0VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).d(new g() { // from class: da.b
            @Override // da.g
            public final Object a(d dVar) {
                return c.q(t10, dVar);
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).d(new g() { // from class: da.a
            @Override // da.g
            public final Object a(d dVar) {
                return c.r(t10, dVar);
            }
        }).c();
    }

    public Set<q> g() {
        return this.f9858c;
    }

    public g<T> h() {
        return this.f9861f;
    }

    public String i() {
        return this.f9856a;
    }

    public Set<d0<? super T>> j() {
        return this.f9857b;
    }

    public Set<Class<?>> k() {
        return this.f9862g;
    }

    public boolean n() {
        return this.f9859d == 1;
    }

    public boolean o() {
        return this.f9859d == 2;
    }

    public boolean p() {
        return this.f9860e == 0;
    }

    public c<T> t(g<T> gVar) {
        return new c<>(this.f9856a, this.f9857b, this.f9858c, this.f9859d, this.f9860e, gVar, this.f9862g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f9857b.toArray()) + ">{" + this.f9859d + ", type=" + this.f9860e + ", deps=" + Arrays.toString(this.f9858c.toArray()) + "}";
    }
}
