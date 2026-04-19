package a4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
final class j<T> extends n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Throwable th) {
        super(null);
        r.f(th, "readException");
        this.f438a = th;
    }

    public final Throwable a() {
        return this.f438a;
    }
}
