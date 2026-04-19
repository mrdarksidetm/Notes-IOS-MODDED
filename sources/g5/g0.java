package g5;

import f5.m;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements WebMessageCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m.a f11463a;

    public g0(m.a aVar) {
        this.f11463a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        f5.l lVarC = androidx.webkit.internal.j.c((WebMessageBoundaryInterface) nf.a.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (lVarC != null) {
            this.f11463a.onMessage(new androidx.webkit.internal.k(invocationHandler), lVarC);
        }
    }
}
