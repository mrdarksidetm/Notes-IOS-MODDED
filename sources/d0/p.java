package d0;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final boolean a(t0.l lVar, int i10) {
        if (t0.o.I()) {
            t0.o.U(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z10 = (((Configuration) lVar.P(androidx.compose.ui.platform.r.f())).uiMode & 48) == 32;
        if (t0.o.I()) {
            t0.o.T();
        }
        return z10;
    }
}
