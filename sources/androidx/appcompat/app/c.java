package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.y0;
import d3.g0;
import e.x;
import o4.r;
import o4.s;
import p.b;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.o implements k.b, g0.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private d mDelegate;
    private Resources mResources;

    class a implements d.c {
        a() {
        }

        @Override // x4.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().C(bundle);
            return bundle;
        }
    }

    class b implements g.b {
        b() {
        }

        @Override // g.b
        public void a(Context context) {
            d delegate = c.this.getDelegate();
            delegate.t();
            delegate.y(c.this.getSavedStateRegistry().b(c.DELEGATE_TAG));
        }
    }

    public c() {
        initDelegate();
    }

    public c(int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        r.b(getWindow().getDecorView(), this);
        s.b(getWindow().getDecorView(), this);
        x4.g.b(getWindow().getDecorView(), this);
        x.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.a, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().j(i10);
    }

    public d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = d.h(this, this);
        }
        return this.mDelegate;
    }

    public k.a getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && y0.c()) {
            this.mResources = new y0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // d3.g0.a
    public Intent getSupportParentActivityIntent() {
        return d3.h.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    @Override // androidx.activity.a, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(g0 g0Var) {
        g0Var.b(this);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    protected void onLocalesChanged(androidx.core.os.c cVar) {
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    protected void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.a, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A(bundle);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(g0 g0Var) {
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().D();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().E();
    }

    @Override // k.b
    public void onSupportActionModeFinished(p.b bVar) {
    }

    @Override // k.b
    public void onSupportActionModeStarted(p.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        g0 g0VarF = g0.f(this);
        onCreateSupportNavigateUpTaskStack(g0VarF);
        onPrepareSupportNavigateUpTaskStack(g0VarF);
        g0VarF.k();
        try {
            androidx.core.app.a.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().O(charSequence);
    }

    @Override // k.b
    public p.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.r()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.a, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().I(i10);
    }

    @Override // androidx.activity.a, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().J(view);
    }

    @Override // androidx.activity.a, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().K(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().M(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().N(i10);
    }

    public p.b startSupportActionMode(b.a aVar) {
        return getDelegate().P(aVar);
    }

    @Override // androidx.fragment.app.o
    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        d3.h.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().H(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return d3.h.f(this, intent);
    }
}
