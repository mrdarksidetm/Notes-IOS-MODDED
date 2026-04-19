package l1;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f14637a = new x();

    private x() {
    }

    public final BlendModeColorFilter a(long j10, int i10) {
        return new BlendModeColorFilter(l0.i(j10), a.a(i10));
    }

    public final w b(BlendModeColorFilter blendModeColorFilter) {
        return new w(l0.b(blendModeColorFilter.getColor()), a.b(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
