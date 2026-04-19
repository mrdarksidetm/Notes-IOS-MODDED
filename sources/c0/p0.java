package c0;

import c0.n0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0<T, E extends n0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z.q<E> f6182c;

    private p0() {
        this.f6180a = RCHTTPStatusCodes.UNSUCCESSFUL;
        this.f6182c = z.h.a();
    }

    public /* synthetic */ p0(ae.j jVar) {
        this();
    }

    public final int a() {
        return this.f6181b;
    }

    public final int b() {
        return this.f6180a;
    }

    public final z.q<E> c() {
        return this.f6182c;
    }

    public final void d(int i10) {
        this.f6180a = i10;
    }

    public final E e(E e10, b0 b0Var) {
        e10.c(b0Var);
        return e10;
    }
}
