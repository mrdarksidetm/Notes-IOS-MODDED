package u5;

import ae.r;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final void a(Canvas canvas, float f10, float f11, Drawable drawable) {
        Drawable drawableNewDrawable;
        r.f(canvas, "<this>");
        r.f(drawable, "drawable");
        Drawable.ConstantState constantState = drawable.getConstantState();
        Drawable drawableMutate = (constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
        if (drawableMutate != null) {
            float f12 = 2;
            drawableMutate.setBounds((int) (f10 - (drawable.getIntrinsicWidth() / f12)), (int) (f11 - (drawable.getIntrinsicHeight() / f12)), (int) (f10 + (drawable.getIntrinsicWidth() / f12)), (int) (f11 + (drawable.getIntrinsicHeight() / f12)));
        }
        if (drawableMutate != null) {
            drawableMutate.draw(canvas);
        }
    }

    public static final void b(Canvas canvas, v5.d dVar, float f10, Paint paint, Paint paint2, t5.a aVar, RectF rectF, float f11, float f12, float f13) {
        float f14;
        r.f(canvas, "<this>");
        r.f(dVar, "quad");
        r.f(paint, "cropperLinesAndCornersStyles");
        r.f(paint2, "cropperSelectedCornerFillStyles");
        r.f(rectF, "imagePreviewBounds");
        for (Map.Entry<t5.a, PointF> entry : dVar.d().entrySet()) {
            t5.a key = entry.getKey();
            PointF value = entry.getValue();
            if (key == aVar) {
                f14 = f12 * f10;
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f11, f11 / value.x, f11 / value.y);
                matrix.postTranslate(rectF.left, rectF.top);
                matrix.postScale(f13, f13, value.x, value.y);
                paint2.getShader().setLocalMatrix(matrix);
                canvas.drawCircle(value.x, value.y, f14, paint2);
            } else {
                f14 = f10;
            }
            canvas.drawCircle(value.x, value.y, f14, paint);
        }
        for (v5.b bVar : dVar.e()) {
            canvas.drawLine(bVar.a().x, bVar.a().y, bVar.b().x, bVar.b().y, paint);
        }
    }
}
