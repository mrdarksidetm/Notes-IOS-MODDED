package l4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.fragment.app.n f14764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.fragment.app.n nVar, androidx.fragment.app.n nVar2, int i10) {
        super(nVar, "Attempting to set target fragment " + nVar2 + " with request code " + i10 + " for fragment " + nVar);
        r.f(nVar, "fragment");
        r.f(nVar2, "targetFragment");
        this.f14764b = nVar2;
        this.f14765c = i10;
    }
}
