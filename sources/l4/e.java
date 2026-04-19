package l4;

import ae.r;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f14763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.n nVar, ViewGroup viewGroup) {
        super(nVar, "Attempting to use <fragment> tag to add fragment " + nVar + " to container " + viewGroup);
        r.f(nVar, "fragment");
        this.f14763b = viewGroup;
    }
}
