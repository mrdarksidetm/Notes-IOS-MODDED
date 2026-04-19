package s9;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20474a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f20476c;

    c(Class<?> cls) {
        this.f20475b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f20476c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f20474a) {
            Logger logger2 = this.f20476c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f20475b);
            this.f20476c = logger3;
            return logger3;
        }
    }
}
