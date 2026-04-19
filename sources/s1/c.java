package s1;

import ae.j;
import t0.k1;
import t0.k3;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<a, Boolean> f19917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f19918b;

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i10, l<? super a, Boolean> lVar) {
        this.f19917a = lVar;
        this.f19918b = k3.e(a.c(i10), null, 2, null);
    }

    public /* synthetic */ c(int i10, l lVar, j jVar) {
        this(i10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s1.b
    public int a() {
        return ((a) this.f19918b.getValue()).i();
    }

    public void b(int i10) {
        this.f19918b.setValue(a.c(i10));
    }
}
