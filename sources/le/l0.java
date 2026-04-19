package le;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static final void a(qd.g gVar, Throwable th) {
        try {
            k0 k0Var = (k0) gVar.get(k0.Q);
            if (k0Var != null) {
                k0Var.o(gVar, th);
            } else {
                qe.h.a(gVar, th);
            }
        } catch (Throwable th2) {
            qe.h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        md.f.a(runtimeException, th);
        return runtimeException;
    }
}
