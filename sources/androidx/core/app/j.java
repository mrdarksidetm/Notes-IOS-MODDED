package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3258c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set<String> f3259d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3260e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f3262b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private j(Context context) {
        this.f3261a = context;
        this.f3262b = (NotificationManager) context.getSystemService("notification");
    }

    public static j b(Context context) {
        return new j(context);
    }

    public boolean a() {
        return a.a(this.f3262b);
    }
}
