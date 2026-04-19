package n3;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f15915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15916b;

    public f(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f15915a = new Object[i10];
    }

    private final boolean c(T t10) {
        int i10 = this.f15916b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f15915a[i11] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // n3.e
    public boolean a(T t10) {
        r.f(t10, "instance");
        if (!(!c(t10))) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i10 = this.f15916b;
        Object[] objArr = this.f15915a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f15916b = i10 + 1;
        return true;
    }

    @Override // n3.e
    public T b() {
        int i10 = this.f15916b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T t10 = (T) this.f15915a[i11];
        r.d(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f15915a[i11] = null;
        this.f15916b--;
        return t10;
    }
}
