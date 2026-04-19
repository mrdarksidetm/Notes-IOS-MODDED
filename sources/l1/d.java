package l1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final ColorFilter a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? x.f14637a.a(j10, i10) : new PorterDuffColorFilter(l0.i(j10), a.c(i10));
    }

    public static final ColorFilter b(k0 k0Var) {
        return k0Var.a();
    }
}
