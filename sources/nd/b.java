package nd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b1 f16097a = b1.f16101b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f16098b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16099a;

        static {
            int[] iArr = new int[b1.values().length];
            try {
                iArr[b1.f16102c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b1.f16100a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16099a = iArr;
        }
    }

    private final boolean f() {
        this.f16097a = b1.f16103d;
        c();
        return this.f16097a == b1.f16100a;
    }

    protected abstract void c();

    protected final void d() {
        this.f16097a = b1.f16102c;
    }

    protected final void e(T t10) {
        this.f16098b = t10;
        this.f16097a = b1.f16100a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        b1 b1Var = this.f16097a;
        if (!(b1Var != b1.f16103d)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f16099a[b1Var.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return f();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16097a = b1.f16101b;
        return this.f16098b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
