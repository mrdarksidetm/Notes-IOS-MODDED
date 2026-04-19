package te;

import ae.j;
import md.i0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class d<Q> implements c<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<Object, f<?>, Object, i0> f21376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q<Object, Object, Object, Object> f21377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q<f<?>, Object, Object, l<Throwable, i0>> f21378d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Object obj, q<Object, ? super f<?>, Object, i0> qVar, q<Object, Object, Object, ? extends Object> qVar2, q<? super f<?>, Object, Object, ? extends l<? super Throwable, i0>> qVar3) {
        this.f21375a = obj;
        this.f21376b = qVar;
        this.f21377c = qVar2;
        this.f21378d = qVar3;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, q qVar3, int i10, j jVar) {
        this(obj, qVar, qVar2, (i10 & 8) != 0 ? null : qVar3);
    }
}
