package md;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static void a(Throwable th, Throwable th2) {
        ae.r.f(th, "<this>");
        ae.r.f(th2, "exception");
        if (th != th2) {
            ud.b.f21763a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        ae.r.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        ae.r.e(string, "toString(...)");
        return string;
    }
}
