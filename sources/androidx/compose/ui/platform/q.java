package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f3066a = new q();

    private q() {
    }

    public final void a(View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
