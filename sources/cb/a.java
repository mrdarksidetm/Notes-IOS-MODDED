package cb;

import ae.r;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import jc.a;
import sc.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements jc.a, c.d, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6785a = "keyboardHeightEventChannel";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.b f6786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f6787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kc.c f6788d;

    /* JADX INFO: renamed from: cb.a$a, reason: collision with other inner class name */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0156a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.b f6791c;

        ViewTreeObserverOnGlobalLayoutListenerC0156a(View view, a aVar, c.b bVar) {
            this.f6789a = view;
            this.f6790b = aVar;
            this.f6791c = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c.b bVar;
            double d10;
            Activity activity;
            Resources resources;
            Rect rect = new Rect();
            this.f6789a.getWindowVisibleDisplayFrame(rect);
            int height = this.f6789a.getHeight();
            int iF = this.f6790b.f();
            int i10 = height - rect.bottom;
            if (this.f6790b.g()) {
                i10 -= iF;
            }
            kc.c cVar = this.f6790b.f6788d;
            DisplayMetrics displayMetrics = (cVar == null || (activity = cVar.getActivity()) == null || (resources = activity.getResources()) == null) ? null : resources.getDisplayMetrics();
            float f10 = i10 / (displayMetrics != null ? displayMetrics.density : 1.0f);
            if (i10 > ((double) height) * 0.15d) {
                bVar = this.f6791c;
                if (bVar == null) {
                    return;
                } else {
                    d10 = f10;
                }
            } else {
                bVar = this.f6791c;
                if (bVar == null) {
                    return;
                } else {
                    d10 = 0.0d;
                }
            }
            bVar.success(Double.valueOf(d10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f() {
        kc.c cVar;
        Activity activity;
        Resources resources;
        Activity activity2;
        Resources resources2;
        kc.c cVar2 = this.f6788d;
        Integer numValueOf = (cVar2 == null || (activity2 = cVar2.getActivity()) == null || (resources2 = activity2.getResources()) == null) ? null : Integer.valueOf(resources2.getIdentifier("navigation_bar_height", "dimen", "android"));
        if (numValueOf == null || numValueOf.intValue() <= 0 || (cVar = this.f6788d) == null || (activity = cVar.getActivity()) == null || (resources = activity.getResources()) == null) {
            return 0;
        }
        return resources.getDimensionPixelSize(numValueOf.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        Activity activity;
        Window window;
        kc.c cVar = this.f6788d;
        View decorView = (cVar == null || (activity = cVar.getActivity()) == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        WindowInsets rootWindowInsets = decorView != null ? decorView.getRootWindowInsets() : null;
        if (rootWindowInsets == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 30 ? rootWindowInsets.isVisible(WindowInsets$Type.navigationBars()) : rootWindowInsets.getSystemWindowInsetBottom() > 0;
    }

    @Override // sc.c.d
    public void a(Object obj, c.b bVar) {
        ViewTreeObserver viewTreeObserver;
        Activity activity;
        Window window;
        View decorView;
        this.f6786b = bVar;
        kc.c cVar = this.f6788d;
        View rootView = (cVar == null || (activity = cVar.getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0156a(rootView, this, bVar));
    }

    @Override // sc.c.d
    public void b(Object obj) {
        this.f6786b = null;
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        r.f(cVar, "binding");
        this.f6788d = cVar;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        c cVar = new c(bVar.b(), this.f6785a);
        this.f6787c = cVar;
        cVar.d(this);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.f6788d = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f6788d = null;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        c cVar = this.f6787c;
        if (cVar != null) {
            cVar.d(null);
        }
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        r.f(cVar, "binding");
        this.f6788d = cVar;
    }
}
