package g5;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements f5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f11461a;

    private e0(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f11461a = scriptHandlerBoundaryInterface;
    }

    public static e0 a(InvocationHandler invocationHandler) {
        return new e0((ScriptHandlerBoundaryInterface) nf.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // f5.f
    public void remove() {
        this.f11461a.remove();
    }
}
