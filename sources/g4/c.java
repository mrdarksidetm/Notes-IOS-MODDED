package g4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Paint f11453g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f11454f;

    public c(m mVar) {
        super(mVar);
    }

    private TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f11454f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f11454f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (f11453g == null) {
            TextPaint textPaint = new TextPaint();
            f11453g = textPaint;
            textPaint.setColor(e.c().d());
            f11453g.setStyle(Paint.Style.FILL);
        }
        return f11453g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintC = c(charSequence, i10, i11, paint2);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f10, f10 + b(), i12, i14);
        }
        if (e.c().j()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, e());
        }
        m mVarA = a();
        float f11 = i13;
        if (textPaintC != null) {
            paint2 = textPaintC;
        }
        mVarA.a(canvas, f10, f11, paint2);
    }
}
