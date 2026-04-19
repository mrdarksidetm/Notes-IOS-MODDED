package o3;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0367a f16290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f16291c;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0367a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public a(Context context) {
        this.f16289a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f16291c = null;
        this.f16290b = null;
    }

    public void i(InterfaceC0367a interfaceC0367a) {
        this.f16290b = interfaceC0367a;
    }

    public void j(b bVar) {
        if (this.f16291c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f16291c = bVar;
    }
}
