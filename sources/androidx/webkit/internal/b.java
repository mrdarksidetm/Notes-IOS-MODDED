package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static ServiceInfo a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    static PackageManager.ComponentInfoFlags b(long j10) {
        return PackageManager.ComponentInfoFlags.of(j10);
    }
}
