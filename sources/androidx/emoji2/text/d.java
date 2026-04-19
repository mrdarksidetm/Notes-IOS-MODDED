package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: loaded from: classes.dex */
class d implements e.InterfaceC0093e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f3793b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f3794a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f3794a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f3793b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0093e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.b.a(this.f3794a, sbB.toString());
    }
}
