package t0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f20621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<T> f20622b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f20623c;

    public a(T t10) {
        this.f20621a = t10;
        this.f20623c = t10;
    }

    @Override // t0.e
    public T b() {
        return this.f20623c;
    }

    @Override // t0.e
    public final void clear() {
        this.f20622b.clear();
        l(this.f20621a);
        k();
    }

    @Override // t0.e
    public void d(T t10) {
        this.f20622b.add(b());
        l(t10);
    }

    @Override // t0.e
    public void g() {
        if (!(!this.f20622b.isEmpty())) {
            throw new IllegalStateException("empty stack".toString());
        }
        l(this.f20622b.remove(r0.size() - 1));
    }

    public final T j() {
        return this.f20621a;
    }

    protected abstract void k();

    protected void l(T t10) {
        this.f20623c = t10;
    }
}
