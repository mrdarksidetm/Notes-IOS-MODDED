package nd;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class u0<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f16135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16137d;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(List<? extends E> list) {
        ae.r.f(list, "list");
        this.f16135b = list;
    }

    @Override // nd.a
    public int a() {
        return this.f16137d;
    }

    public final void d(int i10, int i11) {
        c.f16106a.d(i10, i11, this.f16135b.size());
        this.f16136c = i10;
        this.f16137d = i11 - i10;
    }

    @Override // nd.c, java.util.List
    public E get(int i10) {
        c.f16106a.b(i10, this.f16137d);
        return this.f16135b.get(this.f16136c + i10);
    }
}
