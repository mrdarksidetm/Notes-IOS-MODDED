package a4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
final class h<T> extends n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super(null);
        r.f(th, "finalException");
        this.f437a = th;
    }

    public final Throwable a() {
        return this.f437a;
    }
}
