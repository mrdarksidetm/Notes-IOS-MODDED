package l4;

import ae.r;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f14768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.fragment.app.n nVar, ViewGroup viewGroup) {
        super(nVar, "Attempting to add fragment " + nVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        r.f(nVar, "fragment");
        r.f(viewGroup, "container");
        this.f14768b = viewGroup;
    }
}
