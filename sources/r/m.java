package r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    void e(Drawable drawable);

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    void i();

    void j(l0 l0Var);

    boolean k();

    void l(int i10);

    Menu m();

    void n(int i10);

    int o();

    androidx.core.view.l p(int i10, long j10);

    void q(j.a aVar, e.a aVar2);

    void r(int i10);

    ViewGroup s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z10);

    int u();

    void v();

    void w();

    void x(boolean z10);
}
