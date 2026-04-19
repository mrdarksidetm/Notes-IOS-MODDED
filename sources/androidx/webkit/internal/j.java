package androidx.webkit.internal;

import g5.i0;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class j implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f4955b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f5.l f4956a;

    public j(f5.l lVar) {
        this.f4956a = lVar;
    }

    public static boolean a(int i10) {
        if (i10 != 0) {
            return i10 == 1 && m.C.d();
        }
        return true;
    }

    private static f5.m[] b(InvocationHandler[] invocationHandlerArr) {
        f5.m[] mVarArr = new f5.m[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            mVarArr[i10] = new k(invocationHandlerArr[i10]);
        }
        return mVarArr;
    }

    public static f5.l c(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        f5.m[] mVarArrB = b(webMessageBoundaryInterface.getPorts());
        if (!m.C.d()) {
            return new f5.l(webMessageBoundaryInterface.getData(), mVarArrB);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) nf.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new f5.l(webMessagePayloadBoundaryInterface.getAsString(), mVarArrB);
        }
        if (type != 1) {
            return null;
        }
        return new f5.l(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), mVarArrB);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.f4956a.c();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        i0 i0Var;
        int iE = this.f4956a.e();
        if (iE == 0) {
            i0Var = new i0(this.f4956a.c());
        } else {
            if (iE != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f4956a.e());
            }
            byte[] bArrB = this.f4956a.b();
            Objects.requireNonNull(bArrB);
            i0Var = new i0(bArrB);
        }
        return nf.a.c(i0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        f5.m[] mVarArrD = this.f4956a.d();
        if (mVarArrD == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[mVarArrD.length];
        for (int i10 = 0; i10 < mVarArrD.length; i10++) {
            invocationHandlerArr[i10] = mVarArrD[i10].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f4955b;
    }
}
