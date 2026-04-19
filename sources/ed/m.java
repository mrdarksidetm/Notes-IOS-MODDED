package ed;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> b(Throwable th) {
        if (th instanceof c0) {
            return nd.u.p(((c0) th).a(), th.getMessage(), ((c0) th).b());
        }
        return nd.u.p(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
