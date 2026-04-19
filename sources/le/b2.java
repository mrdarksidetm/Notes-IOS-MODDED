package le;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient a2 f14987a;

    public b2(String str, Throwable th, a2 a2Var) {
        super(str);
        this.f14987a = a2Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b2) {
                b2 b2Var = (b2) obj;
                if (!ae.r.b(b2Var.getMessage(), getMessage()) || !ae.r.b(b2Var.f14987a, this.f14987a) || !ae.r.b(b2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        ae.r.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f14987a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f14987a;
    }
}
