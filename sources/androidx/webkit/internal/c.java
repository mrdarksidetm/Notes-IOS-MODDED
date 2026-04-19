package androidx.webkit.internal;

import g5.i0;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class c extends f5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f4940a;

    class a implements Callable<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f4941a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f4941a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new c(this.f4941a);
        }
    }

    public c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f4940a = jsReplyProxyBoundaryInterface;
    }

    public static c c(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) nf.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (c) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // f5.b
    public void a(String str) {
        if (!m.U.d()) {
            throw m.a();
        }
        this.f4940a.postMessage(str);
    }

    @Override // f5.b
    public void b(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!m.C.d()) {
            throw m.a();
        }
        this.f4940a.postMessageWithPayload(nf.a.c(new i0(bArr)));
    }
}
