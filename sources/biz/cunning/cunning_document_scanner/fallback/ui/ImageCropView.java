package biz.cunning.cunning_document_scanner.fallback.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.r;
import s5.f;
import t5.a;
import u5.b;
import u5.c;
import v5.d;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCropView extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f5870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PointF f5871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f5872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f5873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f5874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f5877k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ae.r.f(context, "context");
        ae.r.f(attributeSet, "attrs");
        Paint paint = new Paint(1);
        this.f5873g = paint;
        this.f5874h = new Paint();
        this.f5875i = getHeight();
        this.f5876j = getWidth();
        this.f5877k = 104857600;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
    }

    private final boolean c(PointF pointF) {
        return pointF.x >= getImagePreviewBounds().left && pointF.y >= getImagePreviewBounds().top && pointF.x <= getImagePreviewBounds().right && pointF.y <= getImagePreviewBounds().bottom;
    }

    private final void d() {
        this.f5874h.setStyle(Paint.Style.FILL);
        Paint paint = this.f5874h;
        Drawable drawable = getDrawable();
        ae.r.e(drawable, "getDrawable(...)");
        Bitmap bitmapB = h3.a.b(drawable, 0, 0, null, 7, null);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapB, tileMode, tileMode));
    }

    private final float getRatio() {
        return getImagePreviewBounds().height() / getDrawable().getIntrinsicHeight();
    }

    public final void e(Bitmap bitmap, int i10, int i11) {
        ae.r.f(bitmap, "photo");
        float width = bitmap.getWidth() / bitmap.getHeight();
        int dimension = (int) getContext().getResources().getDimension(f.f19975a);
        int i12 = (int) (bitmap.getHeight() > bitmap.getWidth() ? i10 / width : i10 * width);
        this.f5875i = i12;
        this.f5875i = Integer.min(i12, i11 - dimension);
        this.f5876j = i10;
        getLayoutParams().height = this.f5875i;
        getLayoutParams().width = this.f5876j;
        requestLayout();
    }

    public final d getCorners() {
        d dVar = this.f5870d;
        ae.r.c(dVar);
        return dVar;
    }

    public final RectF getImagePreviewBounds() {
        float f10;
        float f11 = this.f5876j / this.f5875i;
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        int i10 = this.f5876j;
        float f12 = i10;
        int i11 = this.f5875i;
        float f13 = i11;
        float f14 = 0.0f;
        if (intrinsicWidth > f11) {
            float f15 = (i11 - (i10 / intrinsicWidth)) / 2;
            f10 = f15 + 0.0f;
            f13 -= f15;
        } else {
            float f16 = (i10 - (i11 * intrinsicWidth)) / 2;
            f12 -= f16;
            f14 = f16 + 0.0f;
            f10 = 0.0f;
        }
        return new RectF(f14, f10, f12, f13);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        ae.r.f(canvas, "canvas");
        super.onDraw(canvas);
        d dVar = this.f5870d;
        if (dVar != null) {
            ae.r.c(dVar);
            c.b(canvas, dVar, getResources().getDimension(f.f19976b), this.f5873g, this.f5874h, this.f5872f, getImagePreviewBounds(), getRatio(), getResources().getDimension(f.f19978d), getResources().getDimension(f.f19977c));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVarC;
        ae.r.f(motionEvent, "event");
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5871e = pointF;
            d dVar = this.f5870d;
            ae.r.c(dVar);
            aVarC = dVar.c(pointF);
        } else {
            if (action != 1) {
                if (action == 2) {
                    float f10 = pointF.x;
                    PointF pointF2 = this.f5871e;
                    ae.r.c(pointF2);
                    float f11 = f10 - pointF2.x;
                    float f12 = pointF.y;
                    PointF pointF3 = this.f5871e;
                    ae.r.c(pointF3);
                    float f13 = f12 - pointF3.y;
                    d dVar2 = this.f5870d;
                    ae.r.c(dVar2);
                    PointF pointF4 = dVar2.d().get(this.f5872f);
                    ae.r.c(pointF4);
                    float f14 = pointF4.x + f11;
                    d dVar3 = this.f5870d;
                    ae.r.c(dVar3);
                    PointF pointF5 = dVar3.d().get(this.f5872f);
                    ae.r.c(pointF5);
                    if (c(new PointF(f14, pointF5.y + f13))) {
                        d dVar4 = this.f5870d;
                        ae.r.c(dVar4);
                        a aVar = this.f5872f;
                        ae.r.c(aVar);
                        dVar4.j(aVar, f11, f13);
                    }
                    this.f5871e = pointF;
                }
                invalidate();
                return true;
            }
            aVarC = null;
            this.f5871e = null;
        }
        this.f5872f = aVarC;
        invalidate();
        return true;
    }

    public final void setCropper(d dVar) {
        ae.r.f(dVar, "cropperCorners");
        this.f5870d = dVar;
    }

    public final void setImage(Bitmap bitmap) {
        ae.r.f(bitmap, "photo");
        int byteCount = bitmap.getByteCount();
        int i10 = this.f5877k;
        if (byteCount > i10) {
            bitmap = b.a(bitmap, i10);
        }
        setImageBitmap(bitmap);
        d();
    }
}
