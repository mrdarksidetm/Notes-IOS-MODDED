package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public class m extends Dialog implements o4.e, u, x4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.j f10097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x4.e f10098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f10099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i10) {
        super(context, i10);
        ae.r.f(context, "context");
        this.f10098b = x4.e.f22970d.a(this);
        this.f10099c = new r(new Runnable() { // from class: e.l
            @Override // java.lang.Runnable
            public final void run() {
                m.d(this.f10096a);
            }
        });
    }

    public /* synthetic */ m(Context context, int i10, int i11, ae.j jVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final androidx.lifecycle.j b() {
        androidx.lifecycle.j jVar = this.f10097a;
        if (jVar != null) {
            return jVar;
        }
        androidx.lifecycle.j jVar2 = new androidx.lifecycle.j(this);
        this.f10097a = jVar2;
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m mVar) {
        ae.r.f(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ae.r.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        ae.r.c(window);
        View decorView = window.getDecorView();
        ae.r.e(decorView, "window!!.decorView");
        o4.r.b(decorView, this);
        Window window2 = getWindow();
        ae.r.c(window2);
        View decorView2 = window2.getDecorView();
        ae.r.e(decorView2, "window!!.decorView");
        x.b(decorView2, this);
        Window window3 = getWindow();
        ae.r.c(window3);
        View decorView3 = window3.getDecorView();
        ae.r.e(decorView3, "window!!.decorView");
        x4.g.b(decorView3, this);
    }

    @Override // o4.e
    public androidx.lifecycle.g getLifecycle() {
        return b();
    }

    @Override // e.u
    public final r getOnBackPressedDispatcher() {
        return this.f10099c;
    }

    @Override // x4.f
    public x4.d getSavedStateRegistry() {
        return this.f10098b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f10099c.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            r rVar = this.f10099c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            ae.r.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            rVar.o(onBackInvokedDispatcher);
        }
        this.f10098b.d(bundle);
        b().h(g.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        ae.r.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f10098b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().h(g.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().h(g.a.ON_DESTROY);
        this.f10097a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        ae.r.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ae.r.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
