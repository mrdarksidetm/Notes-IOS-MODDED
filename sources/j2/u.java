package j2;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f13875a = new u();

    private u() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
