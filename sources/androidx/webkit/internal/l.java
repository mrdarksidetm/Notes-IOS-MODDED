package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.internal.a;
import g5.l0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class l extends f5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebResourceError f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f4960b;

    public l(WebResourceError webResourceError) {
        this.f4959a = webResourceError;
    }

    public l(InvocationHandler invocationHandler) {
        this.f4960b = (WebResourceErrorBoundaryInterface) nf.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f4960b == null) {
            this.f4960b = (WebResourceErrorBoundaryInterface) nf.a.a(WebResourceErrorBoundaryInterface.class, l0.c().j(this.f4959a));
        }
        return this.f4960b;
    }

    private WebResourceError d() {
        if (this.f4959a == null) {
            this.f4959a = l0.c().i(Proxy.getInvocationHandler(this.f4960b));
        }
        return this.f4959a;
    }

    @Override // f5.n
    public CharSequence a() {
        a.b bVar = m.f4988v;
        if (bVar.c()) {
            return g5.b.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw m.a();
    }

    @Override // f5.n
    public int b() {
        a.b bVar = m.f4989w;
        if (bVar.c()) {
            return g5.b.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw m.a();
    }
}
