package l2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14691b;

    public n(boolean z10, boolean z11) {
        this.f14690a = z10;
        this.f14691b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f14690a);
        textPaint.setStrikeThruText(this.f14691b);
    }
}
