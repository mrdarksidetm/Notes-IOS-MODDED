package v8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f22274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f22275b;

    public t(s sVar) {
        this.f22275b = sVar;
    }

    public final void a(Context context) {
        this.f22274a = context;
    }

    public final synchronized void b() {
        Context context = this.f22274a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f22274a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22275b.a();
            b();
        }
    }
}
