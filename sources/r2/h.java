package r2;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final void a(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        textPaint.setAlpha(ce.c.d(ge.o.k(f10, 0.0f, 1.0f) * 255));
    }
}
