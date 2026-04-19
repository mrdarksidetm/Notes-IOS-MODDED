package biz.cunning.cunning_document_scanner.fallback.ui;

import ae.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.p;
import androidx.core.content.a;
import s5.e;
import s5.f;
import u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class DoneButton extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f5868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f5869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r.f(context, "context");
        r.f(attributeSet, "attrs");
        Paint paint = new Paint(1);
        this.f5868d = paint;
        Paint paint2 = new Paint(1);
        this.f5869e = paint2;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimension(f.f19980f));
        paint2.setColor(a.getColor(context, e.f19974a));
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        r.f(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = 2;
        float width = getWidth() / f10;
        float height = getHeight() / f10;
        float width2 = (getWidth() - this.f5868d.getStrokeWidth()) / f10;
        float dimension = width2 - getResources().getDimension(f.f19979e);
        canvas.drawCircle(width, height, width2, this.f5868d);
        canvas.drawCircle(width, height, dimension, this.f5869e);
        Drawable drawable = getDrawable();
        r.e(drawable, "getDrawable(...)");
        c.a(canvas, width, height, drawable);
    }
}
