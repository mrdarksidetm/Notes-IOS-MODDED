package l4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.n f14767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.fragment.app.n nVar, String str) {
        super(str);
        r.f(nVar, "fragment");
        this.f14767a = nVar;
    }

    public final androidx.fragment.app.n a() {
        return this.f14767a;
    }
}
