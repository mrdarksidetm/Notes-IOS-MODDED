package md;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class w<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zd.a<? extends T> f15584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f15585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15586c;

    public w(zd.a<? extends T> aVar, Object obj) {
        ae.r.f(aVar, "initializer");
        this.f15584a = aVar;
        this.f15585b = e0.f15551a;
        this.f15586c = obj == null ? this : obj;
    }

    public /* synthetic */ w(zd.a aVar, Object obj, int i10, ae.j jVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f15585b != e0.f15551a;
    }

    @Override // md.l
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f15585b;
        e0 e0Var = e0.f15551a;
        if (t10 != e0Var) {
            return t10;
        }
        synchronized (this.f15586c) {
            tInvoke = (T) this.f15585b;
            if (tInvoke == e0Var) {
                zd.a<? extends T> aVar = this.f15584a;
                ae.r.c(aVar);
                tInvoke = aVar.invoke();
                this.f15585b = tInvoke;
                this.f15584a = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
