package z1;

import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<?> f24140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f24141b;

    public m(c<?> cVar) {
        super(null);
        this.f24140a = cVar;
        this.f24141b = k3.e(null, null, 2, null);
    }

    private final Object c() {
        return this.f24141b.getValue();
    }

    private final void e(Object obj) {
        this.f24141b.setValue(obj);
    }

    @Override // z1.g
    public boolean a(c<?> cVar) {
        return cVar == this.f24140a;
    }

    @Override // z1.g
    public <T> T b(c<T> cVar) {
        if (!(cVar == this.f24140a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        T t10 = (T) c();
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public <T> void d(c<T> cVar, T t10) {
        if (!(cVar == this.f24140a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        e(t10);
    }
}
