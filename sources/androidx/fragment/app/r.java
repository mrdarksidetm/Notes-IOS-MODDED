package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<?> f4227a;

    private r(t<?> tVar) {
        this.f4227a = tVar;
    }

    public static r b(t<?> tVar) {
        return new r((t) n3.g.i(tVar, "callbacks == null"));
    }

    public void a(n nVar) {
        w wVarG = this.f4227a.g();
        t<?> tVar = this.f4227a;
        wVarG.m(tVar, tVar, nVar);
    }

    public void c() {
        this.f4227a.g().y();
    }

    public boolean d(MenuItem menuItem) {
        return this.f4227a.g().B(menuItem);
    }

    public void e() {
        this.f4227a.g().C();
    }

    public void f() {
        this.f4227a.g().E();
    }

    public void g() {
        this.f4227a.g().N();
    }

    public void h() {
        this.f4227a.g().R();
    }

    public void i() {
        this.f4227a.g().S();
    }

    public void j() {
        this.f4227a.g().U();
    }

    public boolean k() {
        return this.f4227a.g().b0(true);
    }

    public w l() {
        return this.f4227a.g();
    }

    public void m() {
        this.f4227a.g().a1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4227a.g().x0().onCreateView(view, str, context, attributeSet);
    }
}
