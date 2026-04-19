package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
class f extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f13081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f13082b;

    public f(Context context) {
        super(context);
        this.f13081a = new Rect();
        this.f13082b = new Rect();
    }

    private static int a(int i10) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f13081a.set(i10, i11, i12, i13);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f13081a, layoutParams.x, layoutParams.y, this.f13082b);
            Rect rect = this.f13082b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(a(i10), a(i11));
        }
        super.onMeasure(i10, i11);
    }
}
