package b2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<androidx.compose.ui.viewinterop.b, a2.f0> f5260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<a2.f0, androidx.compose.ui.viewinterop.b> f5261b;

    public g0(Context context) {
        super(context);
        setClipChildren(false);
        this.f5260a = new HashMap<>();
        this.f5261b = new HashMap<>();
    }

    public Void a(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.b, a2.f0> getHolderToLayoutNode() {
        return this.f5260a;
    }

    public final HashMap<a2.f0, androidx.compose.ui.viewinterop.b> getLayoutNodeToHolder() {
        return this.f5261b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) a(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (androidx.compose.ui.viewinterop.b bVar : this.f5260a.keySet()) {
            bVar.layout(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator<T> it = this.f5260a.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.b) it.next()).g();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a2.f0 f0Var = this.f5260a.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                a2.f0.k1(f0Var, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
