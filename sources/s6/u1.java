package s6;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyguardManager f20329a;

    public u1(KeyguardManager keyguardManager) {
        this.f20329a = keyguardManager;
    }

    public static u1 a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager != null) {
            return new u1(keyguardManager);
        }
        return null;
    }

    public boolean b() {
        return c();
    }

    public final boolean c() {
        return this.f20329a.isDeviceSecure();
    }
}
