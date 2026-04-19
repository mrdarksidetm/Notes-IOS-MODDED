package r;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.widget.n0;

/* JADX INFO: loaded from: classes.dex */
public class b extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19121a;

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.G);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n0.a(this, getContext());
        a aVar = new a(this);
        this.f19121a = aVar;
        aVar.c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f19121a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
