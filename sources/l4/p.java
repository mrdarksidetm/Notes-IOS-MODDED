package l4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.fragment.app.n f14769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.n nVar, androidx.fragment.app.n nVar2, int i10) {
        super(nVar, "Attempting to nest fragment " + nVar + " within the view of parent fragment " + nVar2 + " via container with ID " + i10 + " without using parent's childFragmentManager");
        r.f(nVar, "fragment");
        r.f(nVar2, "expectedParentFragment");
        this.f14769b = nVar2;
        this.f14770c = i10;
    }
}
