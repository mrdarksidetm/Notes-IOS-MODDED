package f2;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.r;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Resources a(l lVar, int i10) {
        if (o.I()) {
            o.U(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        lVar.P(r.f());
        Resources resources = ((Context) lVar.P(r.g())).getResources();
        if (o.I()) {
            o.T();
        }
        return resources;
    }
}
