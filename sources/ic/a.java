package ic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import gd.h;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FlutterMutatorsStack f12627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dc.a f12633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f12634h;

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0304a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f12635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f12636b;

        ViewTreeObserverOnGlobalFocusChangeListenerC0304a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f12635a = onFocusChangeListener;
            this.f12636b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f12635a;
            View view3 = this.f12636b;
            onFocusChangeListener.onFocusChange(view3, h.d(view3));
        }
    }

    public a(Context context, float f10, dc.a aVar) {
        super(context, null);
        this.f12628b = f10;
        this.f12633g = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f12627a.getFinalMatrix());
        float f10 = this.f12628b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f12629c, -this.f12630d);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.f12627a = flutterMutatorsStack;
        this.f12629c = i10;
        this.f12630d = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f12634h) == null) {
            return;
        }
        this.f12634h = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f12627a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f12629c, -this.f12630d);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
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
        if (this.f12633g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f12629c;
            this.f12631e = i11;
            i10 = this.f12630d;
            this.f12632f = i10;
            f10 = i11;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f12631e, this.f12632f);
                this.f12631e = this.f12629c;
                this.f12632f = this.f12630d;
                return this.f12633g.l(motionEvent, matrix);
            }
            f10 = this.f12629c;
            i10 = this.f12630d;
        }
        matrix.postTranslate(f10, i10);
        return this.f12633g.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f12634h == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0304a viewTreeObserverOnGlobalFocusChangeListenerC0304a = new ViewTreeObserverOnGlobalFocusChangeListenerC0304a(onFocusChangeListener, this);
            this.f12634h = viewTreeObserverOnGlobalFocusChangeListenerC0304a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0304a);
        }
    }
}
