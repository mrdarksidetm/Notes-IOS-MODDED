package l4;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.n nVar, String str) {
        super(nVar, "Attempting to reuse fragment " + nVar + " with previous ID " + str);
        r.f(nVar, "fragment");
        r.f(str, "previousFragmentId");
        this.f14741b = str;
    }
}
