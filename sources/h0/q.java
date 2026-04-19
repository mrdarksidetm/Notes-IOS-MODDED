package h0;

import android.os.Build;
import android.view.View;
import androidx.core.view.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class q extends n.b implements Runnable, o3.h0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f11735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.core.view.o f11738f;

    public q(p0 p0Var) {
        super(!p0Var.c() ? 1 : 0);
        this.f11735c = p0Var;
    }

    @Override // o3.h0
    public androidx.core.view.o a(View view, androidx.core.view.o oVar) {
        this.f11738f = oVar;
        this.f11735c.j(oVar);
        if (this.f11736d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f11737e) {
            this.f11735c.i(oVar);
            p0.h(this.f11735c, oVar, 0, 2, null);
        }
        return this.f11735c.c() ? androidx.core.view.o.f3407b : oVar;
    }

    @Override // androidx.core.view.n.b
    public void c(androidx.core.view.n nVar) {
        this.f11736d = false;
        this.f11737e = false;
        androidx.core.view.o oVar = this.f11738f;
        if (nVar.a() != 0 && oVar != null) {
            this.f11735c.i(oVar);
            this.f11735c.j(oVar);
            p0.h(this.f11735c, oVar, 0, 2, null);
        }
        this.f11738f = null;
        super.c(nVar);
    }

    @Override // androidx.core.view.n.b
    public void d(androidx.core.view.n nVar) {
        this.f11736d = true;
        this.f11737e = true;
        super.d(nVar);
    }

    @Override // androidx.core.view.n.b
    public androidx.core.view.o e(androidx.core.view.o oVar, List<androidx.core.view.n> list) {
        p0.h(this.f11735c, oVar, 0, 2, null);
        return this.f11735c.c() ? androidx.core.view.o.f3407b : oVar;
    }

    @Override // androidx.core.view.n.b
    public n.a f(androidx.core.view.n nVar, n.a aVar) {
        this.f11736d = false;
        return super.f(nVar, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f11736d) {
            this.f11736d = false;
            this.f11737e = false;
            androidx.core.view.o oVar = this.f11738f;
            if (oVar != null) {
                this.f11735c.i(oVar);
                p0.h(this.f11735c, oVar, 0, 2, null);
                this.f11738f = null;
            }
        }
    }
}
