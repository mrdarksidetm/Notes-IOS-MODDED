package te;

import ae.j;
import md.i0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<Object, f<?>, Object, i0> f21372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q<f<?>, Object, Object, l<Throwable, i0>> f21373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q<Object, Object, Object, Object> f21374d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj, q<Object, ? super f<?>, Object, i0> qVar, q<? super f<?>, Object, Object, ? extends l<? super Throwable, i0>> qVar2) {
        this.f21371a = obj;
        this.f21372b = qVar;
        this.f21373c = qVar2;
        this.f21374d = g.f21391a;
    }

    public /* synthetic */ b(Object obj, q qVar, q qVar2, int i10, j jVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
