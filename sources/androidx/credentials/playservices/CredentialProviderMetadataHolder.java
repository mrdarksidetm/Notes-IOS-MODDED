package androidx.credentials.playservices;

import ae.r;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f3482a = new a();

    public final class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        r.f(intent, "intent");
        return this.f3482a;
    }
}
