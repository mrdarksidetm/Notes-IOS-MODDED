package hf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class h0 extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f11977o;

    public h0(Socket socket) {
        ae.r.f(socket, "socket");
        this.f11977o = socket;
    }

    @Override // hf.a
    protected void C() {
        Level level;
        StringBuilder sb2;
        Logger logger;
        Throwable th;
        try {
            this.f11977o.close();
        } catch (AssertionError e10) {
            if (!u.e(e10)) {
                throw e10;
            }
            Logger logger2 = v.f12021a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            th = e10;
            logger = logger2;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f11977o);
            logger.log(level, sb2.toString(), th);
        } catch (Exception e11) {
            Logger logger3 = v.f12021a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            th = e11;
            logger = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f11977o);
            logger.log(level, sb2.toString(), th);
        }
    }

    @Override // hf.a
    protected IOException y(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
