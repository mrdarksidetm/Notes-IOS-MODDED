package b2;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f5370a = new k2();

    private k2() {
    }

    public final void a(androidx.compose.ui.platform.i iVar) {
        ViewParent parent = iVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(iVar, iVar);
        }
    }
}
