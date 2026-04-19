package wc;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(23)
public class k extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dc.a f22873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f22874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalFocusChangeListener f22875g;

    class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f22876a;

        a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f22876a = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f22876a;
            k kVar = k.this;
            onFocusChangeListener.onFocusChange(kVar, gd.h.d(kVar));
        }
    }

    public k(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public k(Context context, j jVar) {
        this(context);
        this.f22874f = jVar;
        Surface surface = jVar.getSurface();
        if (surface == null || FlutterRenderer.f12912j) {
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public void a() {
        j jVar = this.f22874f;
        if (jVar != null) {
            jVar.release();
            this.f22874f = null;
        }
    }

    public void b(int i10, int i11) {
        j jVar = this.f22874f;
        if (jVar != null) {
            jVar.a(i10, i11);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f22875g) == null) {
            return;
        }
        this.f22875g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        j jVar = this.f22874f;
        if (jVar == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a RenderTarget.";
        } else {
            Surface surface = jVar.getSurface();
            if (surface.isValid()) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                if (canvasLockHardwareCanvas == null) {
                    invalidate();
                    return;
                }
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(canvasLockHardwareCanvas);
                    return;
                } finally {
                    this.f22874f.scheduleFrame();
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            }
            str = "Platform view cannot be composed without a valid RenderTarget surface.";
        }
        cc.b.b("PlatformViewWrapper", str);
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f22875g;
    }

    public int getRenderTargetHeight() {
        j jVar = this.f22874f;
        if (jVar != null) {
            return jVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        j jVar = this.f22874f;
        if (jVar != null) {
            return jVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f22873e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f22871c;
            this.f22869a = i11;
            i10 = this.f22872d;
            this.f22870b = i10;
            f10 = i11;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f22869a, this.f22870b);
                this.f22869a = this.f22871c;
                this.f22870b = this.f22872d;
                return this.f22873e.l(motionEvent, matrix);
            }
            f10 = this.f22871c;
            i10 = this.f22872d;
        }
        matrix.postTranslate(f10, i10);
        return this.f22873e.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f22871c = layoutParams.leftMargin;
        this.f22872d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f22875g == null) {
            a aVar = new a(onFocusChangeListener);
            this.f22875g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(dc.a aVar) {
        this.f22873e = aVar;
    }
}
