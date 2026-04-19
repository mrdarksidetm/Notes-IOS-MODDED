package hf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f12021a = Logger.getLogger("okio.Okio");

    public static final g0 b(File file) {
        ae.r.f(file, "<this>");
        return u.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        ae.r.f(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? je.w.L(message, "getsockname failed", false, 2, null) : false;
    }

    public static final g0 d(File file, boolean z10) {
        ae.r.f(file, "<this>");
        return u.g(new FileOutputStream(file, z10));
    }

    public static final g0 e(OutputStream outputStream) {
        ae.r.f(outputStream, "<this>");
        return new y(outputStream, new j0());
    }

    public static final g0 f(Socket socket) throws IOException {
        ae.r.f(socket, "<this>");
        h0 h0Var = new h0(socket);
        OutputStream outputStream = socket.getOutputStream();
        ae.r.e(outputStream, "getOutputStream()");
        return h0Var.A(new y(outputStream, h0Var));
    }

    public static /* synthetic */ g0 g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u.f(file, z10);
    }

    public static final i0 h(File file) {
        ae.r.f(file, "<this>");
        return new q(new FileInputStream(file), j0.f11991e);
    }

    public static final i0 i(InputStream inputStream) {
        ae.r.f(inputStream, "<this>");
        return new q(inputStream, new j0());
    }

    public static final i0 j(Socket socket) throws IOException {
        ae.r.f(socket, "<this>");
        h0 h0Var = new h0(socket);
        InputStream inputStream = socket.getInputStream();
        ae.r.e(inputStream, "getInputStream()");
        return h0Var.B(new q(inputStream, h0Var));
    }
}
