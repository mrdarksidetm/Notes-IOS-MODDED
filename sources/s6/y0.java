package s6;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f20401a;

    public static String a() {
        if (f20401a == null) {
            synchronized (y0.class) {
                if (f20401a == null) {
                    f20401a = UUID.randomUUID().toString();
                }
            }
        }
        return f20401a;
    }
}
