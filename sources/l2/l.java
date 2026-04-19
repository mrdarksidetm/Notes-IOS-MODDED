package l2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f14686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f14688d;

    public l(int i10, float f10, float f11, float f12) {
        this.f14685a = i10;
        this.f14686b = f10;
        this.f14687c = f11;
        this.f14688d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f14688d, this.f14686b, this.f14687c, this.f14685a);
    }
}
