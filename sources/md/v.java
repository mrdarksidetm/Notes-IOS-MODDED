package md;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class v<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15579d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<v<?>, Object> f15580e = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile zd.a<? extends T> f15581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f15582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15583c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public v(zd.a<? extends T> aVar) {
        ae.r.f(aVar, "initializer");
        this.f15581a = aVar;
        e0 e0Var = e0.f15551a;
        this.f15582b = e0Var;
        this.f15583c = e0Var;
    }

    public boolean a() {
        return this.f15582b != e0.f15551a;
    }

    @Override // md.l
    public T getValue() {
        T t10 = (T) this.f15582b;
        e0 e0Var = e0.f15551a;
        if (t10 != e0Var) {
            return t10;
        }
        zd.a<? extends T> aVar = this.f15581a;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (b3.b.a(f15580e, this, e0Var, tInvoke)) {
                this.f15581a = null;
                return tInvoke;
            }
        }
        return (T) this.f15582b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
