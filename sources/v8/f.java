package v8;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void j(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T r(String str, Class<T> cls);

    Activity s();

    void startActivityForResult(Intent intent, int i10);
}
