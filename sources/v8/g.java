package v8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a.f, ServiceConnection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f22231l = g.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f22234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f22236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f22237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f22238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IBinder f22239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f22241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f22242k;

    private final void e() {
        if (Thread.currentThread() != this.f22237f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    final /* synthetic */ void b() {
        this.f22240i = false;
        this.f22239h = null;
        this.f22236e.c(1);
    }

    final /* synthetic */ void c(IBinder iBinder) {
        this.f22240i = false;
        this.f22239h = iBinder;
        String.valueOf(iBinder);
        this.f22236e.f(new Bundle());
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void connect(b.c cVar) {
        e();
        String.valueOf(this.f22239h);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f22234c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f22232a).setAction(this.f22233b);
            }
            boolean zBindService = this.f22235d.bindService(intent, this, com.google.android.gms.common.internal.e.b());
            this.f22240i = zBindService;
            if (!zBindService) {
                this.f22239h = null;
                this.f22238g.b(new t8.b(16));
            }
            String.valueOf(this.f22239h);
        } catch (SecurityException e10) {
            this.f22240i = false;
            this.f22239h = null;
            throw e10;
        }
    }

    public final void d(String str) {
        this.f22242k = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        e();
        String.valueOf(this.f22239h);
        try {
            this.f22235d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f22240i = false;
        this.f22239h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        e();
        this.f22241j = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final t8.d[] getAvailableFeatures() {
        return new t8.d[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getEndpointPackageName() {
        String str = this.f22232a;
        if (str != null) {
            return str;
        }
        w8.m.k(this.f22234c);
        return this.f22234c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getLastDisconnectMessage() {
        return this.f22241j;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(com.google.android.gms.common.internal.f fVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        e();
        return this.f22239h != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        e();
        return this.f22240i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f22237f.post(new Runnable() { // from class: v8.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f22277a.c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22237f.post(new Runnable() { // from class: v8.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f22276a.b();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(b.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
