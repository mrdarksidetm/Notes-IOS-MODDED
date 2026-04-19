package v8;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends p9.d implements e.b, e.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0174a f22243h = o9.e.f16427c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.AbstractC0174a f22246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f22247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w8.c f22248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o9.f f22249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f22250g;

    public g0(Context context, Handler handler, w8.c cVar) {
        a.AbstractC0174a abstractC0174a = f22243h;
        this.f22244a = context;
        this.f22245b = handler;
        this.f22248e = (w8.c) w8.m.l(cVar, "ClientSettings must not be null");
        this.f22247d = cVar.h();
        this.f22246c = abstractC0174a;
    }

    static /* bridge */ /* synthetic */ void W(g0 g0Var, p9.l lVar) {
        t8.b bVarU = lVar.u();
        if (bVarU.B()) {
            com.google.android.gms.common.internal.i iVar = (com.google.android.gms.common.internal.i) w8.m.k(lVar.x());
            bVarU = iVar.u();
            if (bVarU.B()) {
                g0Var.f22250g.c(iVar.x(), g0Var.f22247d);
            } else {
                String strValueOf = String.valueOf(bVarU);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                g0Var.f22250g.b(bVarU);
            }
        } else {
            g0Var.f22250g.b(bVarU);
        }
        g0Var.f22249f.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, o9.f] */
    public final void X(f0 f0Var) {
        o9.f fVar = this.f22249f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f22248e.l(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0174a abstractC0174a = this.f22246c;
        Context context = this.f22244a;
        Handler handler = this.f22245b;
        w8.c cVar = this.f22248e;
        this.f22249f = abstractC0174a.buildClient(context, handler.getLooper(), cVar, cVar.i(), (e.b) this, (e.c) this);
        this.f22250g = f0Var;
        Set set = this.f22247d;
        if (set == null || set.isEmpty()) {
            this.f22245b.post(new d0(this));
        } else {
            this.f22249f.b();
        }
    }

    public final void Y() {
        o9.f fVar = this.f22249f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // v8.h
    public final void b(t8.b bVar) {
        this.f22250g.b(bVar);
    }

    @Override // v8.d
    public final void c(int i10) {
        this.f22250g.d(i10);
    }

    @Override // v8.d
    public final void f(Bundle bundle) {
        this.f22249f.a(this);
    }

    @Override // p9.f
    public final void m(p9.l lVar) {
        this.f22245b.post(new e0(this, lVar));
    }
}
