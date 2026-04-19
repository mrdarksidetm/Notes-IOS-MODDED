package android.webkit;

import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class TracingController {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ TracingController getInstance();

    public abstract /* synthetic */ boolean isTracing();

    public abstract /* synthetic */ void start(TracingConfig tracingConfig);

    public abstract /* synthetic */ boolean stop(OutputStream outputStream, Executor executor);
}
