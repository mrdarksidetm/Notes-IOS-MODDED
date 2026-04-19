package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    private static class a extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.flutter.plugin.platform.a f13039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f13040b;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f13039a = aVar;
            this.f13040b = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f13039a.b(this.f13040b, view, accessibilityEvent);
        }
    }

    private static class b extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputMethodManager f13041a;

        b(Context context) {
            this(context, null);
        }

        private b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f13041a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.f13041a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f13041a : super.getSystemService(str);
        }
    }

    private static class c extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f13042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WindowManager f13043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f13044c;

        c(Context context, i iVar, Context context2) {
            super(context);
            this.f13042a = iVar;
            this.f13044c = context2;
        }

        private WindowManager a() {
            if (this.f13043b == null) {
                this.f13043b = this.f13042a;
            }
            return this.f13043b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i10 = 0; i10 < stackTrace.length && i10 < 11; i10++) {
                if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f13044c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private wc.g f13045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f13046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f13047c;

        d() {
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z10) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z10;
    }

    public SingleViewPresentation(Context context, Display display, wc.g gVar, io.flutter.plugin.platform.a aVar, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        dVar.f13045a = gVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public wc.g getView() {
        return this.state.f13045a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f13047c == null) {
            this.state.f13047c = new f(getContext());
        }
        if (this.state.f13046b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            d dVar = this.state;
            dVar.f13046b = new i(windowManager, dVar.f13047c);
        }
        this.container = new FrameLayout(getContext());
        c cVar = new c(getContext(), this.state.f13046b, this.outerContext);
        View view = this.state.f13045a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(cVar);
        } else {
            cc.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f13047c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
