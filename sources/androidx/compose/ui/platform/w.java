package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class w extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3102a;

    public w(Context context) {
        super(context);
        setClipChildren(false);
        setTag(f1.e.J, Boolean.TRUE);
    }

    public final void a(l1.b0 b0Var, View view, long j10) {
        super.drawChild(l1.c.d(b0Var), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z10;
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i10);
            ae.r.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((a0) childAt).s()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            this.f3102a = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f3102a = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f3102a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
