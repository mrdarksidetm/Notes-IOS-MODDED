package md;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class j0<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zd.a<? extends T> f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f15566b;

    public j0(zd.a<? extends T> aVar) {
        ae.r.f(aVar, "initializer");
        this.f15565a = aVar;
        this.f15566b = e0.f15551a;
    }

    public boolean a() {
        return this.f15566b != e0.f15551a;
    }

    @Override // md.l
    public T getValue() {
        if (this.f15566b == e0.f15551a) {
            zd.a<? extends T> aVar = this.f15565a;
            ae.r.c(aVar);
            this.f15566b = aVar.invoke();
            this.f15565a = null;
        }
        return (T) this.f15566b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
