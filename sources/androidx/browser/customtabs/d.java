package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import d.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ServiceConnection {
    private Context mApplicationContext;

    class a extends b {
        a(d.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(b.a.b(iBinder), componentName, this.mApplicationContext));
    }

    void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
