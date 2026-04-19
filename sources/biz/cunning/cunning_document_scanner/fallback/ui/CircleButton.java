package biz.cunning.cunning_document_scanner.fallback.ui;

import ae.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.p;
import s5.f;

/* JADX INFO: loaded from: classes.dex */
public final class CircleButton extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f5867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r.f(context, "context");
        r.f(attributeSet, "attrs");
        Paint paint = new Paint(1);
        this.f5867d = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimension(f.f19981g));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        r.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() - this.f5867d.getStrokeWidth()) / 2, this.f5867d);
    }
}
