package androidx.compose.ui.platform;

import a2.e1;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b2.i2;
import java.lang.ref.WeakReference;
import md.i0;
import t0.g2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<t0.q> cachedViewTreeCompositionContext;
    private t0.p composition;
    private boolean creatingComposition;
    private zd.a<i0> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private t0.q parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0058a extends ae.s implements zd.p<t0.l, Integer, i0> {
        C0058a() {
            super(2);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:251)");
            }
            a.this.Content(lVar, 8);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    public a(Context context) {
        this(context, null, 0, 6, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = z.f3110a.a().a(this);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, ae.j jVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final t0.q cacheIfAlive(t0.q qVar) {
        t0.q qVar2 = isAlive(qVar) ? qVar : null;
        if (qVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(qVar2);
        }
        return qVar;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = g0.c(this, resolveParentCompositionContext(), b1.c.c(-656146368, true, new C0058a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(t0.q qVar) {
        return !(qVar instanceof g2) || ((g2) qVar).d0().getValue().compareTo(g2.d.ShuttingDown) > 0;
    }

    private final t0.q resolveParentCompositionContext() {
        t0.q qVar;
        t0.q qVar2 = this.parentContext;
        if (qVar2 != null) {
            return qVar2;
        }
        t0.q qVarD = i2.d(this);
        t0.q qVar3 = null;
        t0.q qVarCacheIfAlive = qVarD != null ? cacheIfAlive(qVarD) : null;
        if (qVarCacheIfAlive != null) {
            return qVarCacheIfAlive;
        }
        WeakReference<t0.q> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (qVar = weakReference.get()) != null && isAlive(qVar)) {
            qVar3 = qVar;
        }
        t0.q qVar4 = qVar3;
        return qVar4 == null ? cacheIfAlive(i2.h(this)) : qVar4;
    }

    private final void setParentContext(t0.q qVar) {
        if (this.parentContext != qVar) {
            this.parentContext = qVar;
            if (qVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            t0.p pVar = this.composition;
            if (pVar != null) {
                pVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(t0.l lVar, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        checkAddView();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        checkAddView();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        checkAddView();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public final void createComposition() {
        if (!(this.parentContext != null || isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        t0.p pVar = this.composition;
        if (pVar != null) {
            pVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(t0.q qVar) {
        setParentContext(qVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((e1) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(z zVar) {
        zd.a<i0> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = zVar.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
