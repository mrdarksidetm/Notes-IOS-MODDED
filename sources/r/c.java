package r;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.n0;

/* JADX INFO: loaded from: classes.dex */
public class c extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f19122a;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.I);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n0.a(this, getContext());
        d dVar = new d(this);
        this.f19122a = dVar;
        dVar.c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f19122a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f19122a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f19122a.g(canvas);
    }
}
