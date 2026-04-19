package v0;

import ae.j;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<E> f21871a;

    public c(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ c(int i10, int i11, j jVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    private c(SparseArray<E> sparseArray) {
        this.f21871a = sparseArray;
    }

    public final E a(int i10) {
        return this.f21871a.get(i10);
    }

    public final void b(int i10, E e10) {
        this.f21871a.put(i10, e10);
    }
}
