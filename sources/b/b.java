package b;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5029a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f5029a + com.amazon.a.a.o.c.a.b.f7490a + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
