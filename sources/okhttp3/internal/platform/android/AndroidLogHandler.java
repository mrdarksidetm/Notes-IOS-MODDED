package okhttp3.internal.platform.android;

import ae.r;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f17577a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        r.f(logRecord, "record");
        AndroidLog androidLog = AndroidLog.f17574a;
        String loggerName = logRecord.getLoggerName();
        r.e(loggerName, "record.loggerName");
        int iB = AndroidLogKt.b(logRecord);
        String message = logRecord.getMessage();
        r.e(message, "record.message");
        androidLog.a(loggerName, iB, message, logRecord.getThrown());
    }
}
