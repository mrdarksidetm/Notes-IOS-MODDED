package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.internal.a;
import f5.m;
import g5.g0;
import g5.l0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class k extends f5.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebMessagePort f4957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebMessagePortBoundaryInterface f4958b;

    public k(WebMessagePort webMessagePort) {
        this.f4957a = webMessagePort;
    }

    public k(InvocationHandler invocationHandler) {
        this.f4958b = (WebMessagePortBoundaryInterface) nf.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static WebMessage f(f5.l lVar) {
        return g5.b.b(lVar);
    }

    public static WebMessagePort[] g(f5.m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = mVarArr[i10].b();
        }
        return webMessagePortArr;
    }

    public static f5.l h(WebMessage webMessage) {
        return g5.b.d(webMessage);
    }

    private WebMessagePortBoundaryInterface i() {
        if (this.f4958b == null) {
            this.f4958b = (WebMessagePortBoundaryInterface) nf.a.a(WebMessagePortBoundaryInterface.class, l0.c().h(this.f4957a));
        }
        return this.f4958b;
    }

    private WebMessagePort j() {
        if (this.f4957a == null) {
            this.f4957a = l0.c().g(Proxy.getInvocationHandler(this.f4958b));
        }
        return this.f4957a;
    }

    public static f5.m[] k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        f5.m[] mVarArr = new f5.m[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            mVarArr[i10] = new k(webMessagePortArr[i10]);
        }
        return mVarArr;
    }

    @Override // f5.m
    public void a() {
        a.b bVar = m.B;
        if (bVar.c()) {
            g5.b.a(j());
        } else {
            if (!bVar.d()) {
                throw m.a();
            }
            i().close();
        }
    }

    @Override // f5.m
    public WebMessagePort b() {
        return j();
    }

    @Override // f5.m
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(i());
    }

    @Override // f5.m
    public void d(f5.l lVar) {
        a.b bVar = m.A;
        if (bVar.c() && lVar.e() == 0) {
            g5.b.h(j(), f(lVar));
        } else {
            if (!bVar.d() || !j.a(lVar.e())) {
                throw m.a();
            }
            i().postMessage(nf.a.c(new j(lVar)));
        }
    }

    @Override // f5.m
    public void e(m.a aVar) {
        a.b bVar = m.D;
        if (bVar.d()) {
            i().setWebMessageCallback(nf.a.c(new g0(aVar)));
        } else {
            if (!bVar.c()) {
                throw m.a();
            }
            g5.b.l(j(), aVar);
        }
    }
}
