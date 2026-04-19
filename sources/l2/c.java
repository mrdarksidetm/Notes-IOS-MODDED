package l2;

import ae.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import j2.s0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (layout == null || paint == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(i15);
        if (lineForOffset == layout.getLineCount() - 1 && s0.l(layout, lineForOffset)) {
            float fA = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
            if (fA == 0.0f) {
                return;
            }
            r.c(canvas);
            canvas.translate(fA, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
