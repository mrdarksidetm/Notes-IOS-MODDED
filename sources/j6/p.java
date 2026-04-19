package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import k6.c;
import le.a2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.e f14051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o6.t f14052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o6.n f14053c;

    public p(x5.e eVar, o6.t tVar, o6.r rVar) {
        this.f14051a = eVar;
        this.f14052b = tVar;
        this.f14053c = o6.f.a(rVar);
    }

    private final boolean d(h hVar, k6.i iVar) {
        if (o6.a.d(hVar.j())) {
            return c(hVar, hVar.j()) && this.f14053c.a(iVar);
        }
        return true;
    }

    private final boolean e(h hVar) {
        return hVar.O().isEmpty() || nd.p.F(o6.j.p(), hVar.j());
    }

    public final boolean a(m mVar) {
        return !o6.a.d(mVar.f()) || this.f14053c.b();
    }

    public final f b(h hVar, Throwable th) {
        Drawable drawableT;
        if (!(th instanceof k) || (drawableT = hVar.u()) == null) {
            drawableT = hVar.t();
        }
        return new f(drawableT, hVar, th);
    }

    public final boolean c(h hVar, Bitmap.Config config) {
        if (!o6.a.d(config)) {
            return true;
        }
        if (!hVar.h()) {
            return false;
        }
        l6.a aVarM = hVar.M();
        if (aVarM instanceof l6.b) {
            View view = ((l6.b) aVarM).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final m f(h hVar, k6.i iVar) {
        Bitmap.Config configJ = e(hVar) && d(hVar, iVar) ? hVar.j() : Bitmap.Config.ARGB_8888;
        b bVarD = this.f14052b.b() ? hVar.D() : b.DISABLED;
        k6.c cVarB = iVar.b();
        c.b bVar = c.b.f14406a;
        return new m(hVar.l(), configJ, hVar.k(), iVar, (ae.r.b(cVarB, bVar) || ae.r.b(iVar.a(), bVar)) ? k6.h.FIT : hVar.J(), o6.i.a(hVar), hVar.i() && hVar.O().isEmpty() && configJ != Bitmap.Config.ALPHA_8, hVar.I(), hVar.r(), hVar.x(), hVar.L(), hVar.E(), hVar.C(), hVar.s(), bVarD);
    }

    public final o g(h hVar, a2 a2Var) {
        androidx.lifecycle.g gVarZ = hVar.z();
        l6.a aVarM = hVar.M();
        return aVarM instanceof l6.b ? new t(this.f14051a, hVar, (l6.b) aVarM, gVarZ, a2Var) : new a(gVarZ, a2Var);
    }
}
