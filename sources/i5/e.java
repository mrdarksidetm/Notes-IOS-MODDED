package i5;

import ae.i0;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12532a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12533b = i0.b(e.class).b();

    private e() {
    }

    public final int a() {
        String str;
        String str2;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f12524a.a() != j.LOG) {
                return 0;
            }
            str = f12533b;
            str2 = "Embedding extension version not found";
            Log.d(str, str2);
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f12524a.a() != j.LOG) {
                return 0;
            }
            str = f12533b;
            str2 = "Stub Extension";
            Log.d(str, str2);
            return 0;
        }
    }
}
