package androidx.compose.ui.platform;

import android.view.View;
import l1.n1;

/* JADX INFO: loaded from: classes.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f2892a = new d0();

    private d0() {
    }

    public final void a(View view, n1 n1Var) {
        view.setRenderEffect(n1Var != null ? n1Var.a() : null);
    }
}
