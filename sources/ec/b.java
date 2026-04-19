package ec;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f10800b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, io.flutter.embedding.engine.c> f10801a = new HashMap();

    b() {
    }

    public static b b() {
        if (f10800b == null) {
            synchronized (b.class) {
                if (f10800b == null) {
                    f10800b = new b();
                }
            }
        }
        return f10800b;
    }

    public io.flutter.embedding.engine.c a(String str) {
        return this.f10801a.get(str);
    }
}
