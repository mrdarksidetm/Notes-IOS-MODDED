package k;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import e.m;
import p.b;

/* JADX INFO: loaded from: classes.dex */
public class e extends m implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.app.d f14281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.a f14282e;

    public e(Context context, int i10) {
        super(context, f(context, i10));
        this.f14282e = new c.a() { // from class: k.d
            @Override // androidx.core.view.c.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f14280a.g(keyEvent);
            }
        };
        androidx.appcompat.app.d dVarE = e();
        dVarE.N(f(context, i10));
        dVarE.y(null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j.a.f13356z, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // e.m, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.c.e(this.f14282e, getWindow().getDecorView(), this, keyEvent);
    }

    public androidx.appcompat.app.d e() {
        if (this.f14281d == null) {
            this.f14281d = androidx.appcompat.app.d.i(this, this);
        }
        return this.f14281d;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) e().j(i10);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().H(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().u();
    }

    @Override // e.m, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().y(bundle);
    }

    @Override // e.m, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().E();
    }

    @Override // k.b
    public void onSupportActionModeFinished(p.b bVar) {
    }

    @Override // k.b
    public void onSupportActionModeStarted(p.b bVar) {
    }

    @Override // k.b
    public p.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(int i10) {
        e().I(i10);
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(View view) {
        e().J(view);
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().K(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().O(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().O(charSequence);
    }
}
