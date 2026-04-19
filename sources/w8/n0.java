package w8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22650a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f22652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22653d;

    public static int a(Context context) {
        b(context);
        return f22653d;
    }

    private static void b(Context context) {
        synchronized (f22650a) {
            if (f22651b) {
                return;
            }
            f22651b = true;
            try {
                Bundle bundle = g9.d.a(context).a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f22652c = bundle.getString("com.google.app.id");
                f22653d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
        }
    }
}
