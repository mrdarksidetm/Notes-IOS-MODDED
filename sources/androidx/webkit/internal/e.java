package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.internal.a;
import g5.l0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class e extends f5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f4944b;

    public e(SafeBrowsingResponse safeBrowsingResponse) {
        this.f4943a = safeBrowsingResponse;
    }

    public e(InvocationHandler invocationHandler) {
        this.f4944b = (SafeBrowsingResponseBoundaryInterface) nf.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface d() {
        if (this.f4944b == null) {
            this.f4944b = (SafeBrowsingResponseBoundaryInterface) nf.a.a(SafeBrowsingResponseBoundaryInterface.class, l0.c().c(this.f4943a));
        }
        return this.f4944b;
    }

    private SafeBrowsingResponse e() {
        if (this.f4943a == null) {
            this.f4943a = l0.c().b(Proxy.getInvocationHandler(this.f4944b));
        }
        return this.f4943a;
    }

    @Override // f5.e
    public void a(boolean z10) {
        a.f fVar = m.f4990x;
        if (fVar.c()) {
            g5.m.a(e(), z10);
        } else {
            if (!fVar.d()) {
                throw m.a();
            }
            d().backToSafety(z10);
        }
    }

    @Override // f5.e
    public void b(boolean z10) {
        a.f fVar = m.f4991y;
        if (fVar.c()) {
            g5.m.c(e(), z10);
        } else {
            if (!fVar.d()) {
                throw m.a();
            }
            d().proceed(z10);
        }
    }

    @Override // f5.e
    public void c(boolean z10) {
        a.f fVar = m.f4992z;
        if (fVar.c()) {
            g5.m.e(e(), z10);
        } else {
            if (!fVar.d()) {
                throw m.a();
            }
            d().showInterstitial(z10);
        }
    }
}
