package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import wc.j;

/* JADX INFO: loaded from: classes2.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static VirtualDisplay.Callback f13085i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SingleViewPresentation f13086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f13088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f13091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnFocusChangeListener f13092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private VirtualDisplay f13093h;

    class a extends VirtualDisplay.Callback {
        a() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    }

    class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f13094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f13095b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f13094a.postDelayed(bVar.f13095b, 128L);
            }
        }

        b(View view, Runnable runnable) {
            this.f13094a = view;
            this.f13095b = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c.a(this.f13094a, new a());
            this.f13094a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class c implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f13098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f13099b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f13098a.getViewTreeObserver().removeOnDrawListener(c.this);
            }
        }

        c(View view, Runnable runnable) {
            this.f13098a = view;
            this.f13099b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new c(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f13099b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f13099b = null;
            this.f13098a.post(new a());
        }
    }

    private h(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, wc.g gVar, j jVar, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        this.f13087b = context;
        this.f13088c = aVar;
        this.f13091f = jVar;
        this.f13092g = onFocusChangeListener;
        this.f13090e = i10;
        this.f13093h = virtualDisplay;
        this.f13089d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f13093h.getDisplay(), gVar, aVar, i10, onFocusChangeListener);
        this.f13086a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static h b(Context context, io.flutter.plugin.platform.a aVar, wc.g gVar, j jVar, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i10 == 0 || i11 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        jVar.a(i10, i11);
        VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i12, i10, i11, displayMetrics.densityDpi, jVar.getSurface(), 0, f13085i, null);
        if (virtualDisplayCreateVirtualDisplay == null) {
            return null;
        }
        return new h(context, aVar, virtualDisplayCreateVirtualDisplay, gVar, jVar, onFocusChangeListener, i12, obj);
    }

    @TargetApi(31)
    private void l(View view, int i10, int i11, Runnable runnable) {
        this.f13091f.a(i10, i11);
        this.f13093h.resize(i10, i11, this.f13089d);
        this.f13093h.setSurface(this.f13091f.getSurface());
        view.postDelayed(runnable, 0L);
    }

    public void a() {
        this.f13093h.setSurface(null);
    }

    public void c(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f13086a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void d() {
        this.f13086a.cancel();
        this.f13086a.detachState();
        this.f13093h.release();
        this.f13091f.release();
    }

    public int e() {
        j jVar = this.f13091f;
        if (jVar != null) {
            return jVar.getHeight();
        }
        return 0;
    }

    public int f() {
        j jVar = this.f13091f;
        if (jVar != null) {
            return jVar.getWidth();
        }
        return 0;
    }

    public View g() {
        SingleViewPresentation singleViewPresentation = this.f13086a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    void h() {
        SingleViewPresentation singleViewPresentation = this.f13086a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f13086a.getView().onInputConnectionLocked();
    }

    void i() {
        SingleViewPresentation singleViewPresentation = this.f13086a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f13086a.getView().onInputConnectionUnlocked();
    }

    public void j() {
        int iF = f();
        int iE = e();
        boolean zIsFocused = g().isFocused();
        SingleViewPresentation.d dVarDetachState = this.f13086a.detachState();
        this.f13093h.setSurface(null);
        this.f13093h.release();
        this.f13093h = ((DisplayManager) this.f13087b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f13090e, iF, iE, this.f13089d, this.f13091f.getSurface(), 0, f13085i, null);
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f13087b, this.f13093h.getDisplay(), this.f13088c, dVarDetachState, this.f13092g, zIsFocused);
        singleViewPresentation.show();
        this.f13086a.cancel();
        this.f13086a = singleViewPresentation;
    }

    public void k(int i10, int i11, Runnable runnable) {
        if (i10 == f() && i11 == e()) {
            g().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l(g(), i10, i11, runnable);
            return;
        }
        boolean zIsFocused = g().isFocused();
        SingleViewPresentation.d dVarDetachState = this.f13086a.detachState();
        this.f13093h.setSurface(null);
        this.f13093h.release();
        DisplayManager displayManager = (DisplayManager) this.f13087b.getSystemService("display");
        this.f13091f.a(i10, i11);
        this.f13093h = displayManager.createVirtualDisplay("flutter-vd#" + this.f13090e, i10, i11, this.f13089d, this.f13091f.getSurface(), 0, f13085i, null);
        View viewG = g();
        viewG.addOnAttachStateChangeListener(new b(viewG, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f13087b, this.f13093h.getDisplay(), this.f13088c, dVarDetachState, this.f13092g, zIsFocused);
        singleViewPresentation.show();
        this.f13086a.cancel();
        this.f13086a = singleViewPresentation;
    }
}
