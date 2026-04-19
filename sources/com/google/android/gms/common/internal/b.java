package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import w8.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private t8.b zzB;
    private boolean zzC;
    private volatile s zzD;
    y zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final com.google.android.gms.common.internal.e zzn;
    private final t8.h zzo;
    private final Object zzp;
    private final Object zzq;
    private w8.h zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private p zzu;
    private int zzv;
    private final a zzw;
    private final InterfaceC0178b zzx;
    private final int zzy;
    private final String zzz;
    private static final t8.d[] zze = new t8.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void c(int i10);

        void f(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0178b {
        void b(t8.b bVar);
    }

    public interface c {
        void a(t8.b bVar);
    }

    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(t8.b bVar) {
            if (bVar.B()) {
                b bVar2 = b.this;
                bVar2.getRemoteService(null, bVar2.getScopes());
            } else if (b.this.zzx != null) {
                b.this.zzx.b(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected b(Context context, Handler handler, com.google.android.gms.common.internal.e eVar, t8.h hVar, int i10, a aVar, InterfaceC0178b interfaceC0178b) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        w8.m.l(context, "Context must not be null");
        this.zzl = context;
        w8.m.l(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        w8.m.l(eVar, "Supervisor must not be null");
        this.zzn = eVar;
        w8.m.l(hVar, "API availability must not be null");
        this.zzo = hVar;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0178b;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected b(Context context, Looper looper, int i10, a aVar, InterfaceC0178b interfaceC0178b, String str) {
        com.google.android.gms.common.internal.e eVarC = com.google.android.gms.common.internal.e.c(context);
        t8.h hVarF = t8.h.f();
        w8.m.k(aVar);
        w8.m.k(interfaceC0178b);
        this(context, looper, eVarC, hVarF, i10, aVar, interfaceC0178b, str);
    }

    protected b(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, t8.h hVar, int i10, a aVar, InterfaceC0178b interfaceC0178b, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        w8.m.l(context, "Context must not be null");
        this.zzl = context;
        w8.m.l(looper, "Looper must not be null");
        this.zzm = looper;
        w8.m.l(eVar, "Supervisor must not be null");
        this.zzn = eVar;
        w8.m.l(hVar, "API availability must not be null");
        this.zzo = hVar;
        this.zzb = new m(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0178b;
        this.zzz = str;
    }

    static /* bridge */ /* synthetic */ void zzj(b bVar, s sVar) {
        bVar.zzD = sVar;
        if (bVar.usesClientTelemetry()) {
            w8.d dVar = sVar.f8612d;
            w8.n.b().c(dVar == null ? null : dVar.C());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(b bVar, int i10) {
        int i11;
        int i12;
        synchronized (bVar.zzp) {
            i11 = bVar.zzv;
        }
        if (i11 == 3) {
            bVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, bVar.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.zzp) {
            if (bVar.zzv != i10) {
                return false;
            }
            bVar.zzp(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(b bVar) {
        if (bVar.zzC || TextUtils.isEmpty(bVar.getServiceDescriptor()) || TextUtils.isEmpty(bVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(bVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i10, IInterface iInterface) {
        y yVar;
        w8.m.a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                p pVar = this.zzu;
                if (pVar != null) {
                    com.google.android.gms.common.internal.e eVar = this.zzn;
                    String strB = this.zza.b();
                    w8.m.k(strB);
                    eVar.g(strB, this.zza.a(), 4225, pVar, zze(), this.zza.c());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                p pVar2 = this.zzu;
                if (pVar2 != null && (yVar = this.zza) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + yVar.b() + " on " + yVar.a());
                    com.google.android.gms.common.internal.e eVar2 = this.zzn;
                    String strB2 = this.zza.b();
                    w8.m.k(strB2);
                    eVar2.g(strB2, this.zza.a(), 4225, pVar2, zze(), this.zza.c());
                    this.zzd.incrementAndGet();
                }
                p pVar3 = new p(this, this.zzd.get());
                this.zzu = pVar3;
                y yVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new y(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new y(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = yVar2;
                if (yVar2.c() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                }
                com.google.android.gms.common.internal.e eVar3 = this.zzn;
                String strB3 = this.zza.b();
                w8.m.k(strB3);
                if (!eVar3.h(new r0(strB3, this.zza.a(), 4225, this.zza.c()), pVar3, zze(), getBindServiceExecutor())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.zza.b() + " on " + this.zza.a());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                w8.m.k(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.zzo.h(this.zzl, getMinApkVersion());
        if (iH == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), iH, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        w8.m.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    protected abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n) this.zzt.get(i10)).d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        w8.h hVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            hVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (hVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(hVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) u8.a.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public t8.d[] getApiFeatures() {
        return zze;
    }

    public final t8.d[] getAvailableFeatures() {
        s sVar = this.zzD;
        if (sVar == null) {
            return null;
        }
        return sVar.f8610b;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        y yVar;
        if (!isConnected() || (yVar = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return yVar.a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return t8.h.f21327a;
    }

    public void getRemoteService(f fVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = t8.h.f21327a;
        Scope[] scopeArr = com.google.android.gms.common.internal.c.f8566o;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        t8.d[] dVarArr = com.google.android.gms.common.internal.c.f8567p;
        com.google.android.gms.common.internal.c cVar = new com.google.android.gms.common.internal.c(6, i11, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        cVar.f8571d = this.zzl.getPackageName();
        cVar.f8574g = getServiceRequestExtraArgs;
        if (set != null) {
            cVar.f8573f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            cVar.f8575h = account;
            if (fVar != null) {
                cVar.f8572e = fVar.asBinder();
            }
        } else if (requiresAccount()) {
            cVar.f8575h = getAccount();
        }
        cVar.f8576i = zze;
        cVar.f8577j = getApiFeatures();
        if (usesClientTelemetry()) {
            cVar.f8580m = true;
        }
        try {
            synchronized (this.zzq) {
                w8.h hVar = this.zzr;
                if (hVar != null) {
                    hVar.n(new o(this, this.zzd.get()), cVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t10 = (T) this.zzs;
            w8.m.l(t10, "Client is connected but service is null");
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            w8.h hVar = this.zzr;
            if (hVar == null) {
                return null;
            }
            return hVar.asBinder();
        }
    }

    protected abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public w8.d getTelemetryConfiguration() {
        s sVar = this.zzD;
        if (sVar == null) {
            return null;
        }
        return sVar.f8612d;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    protected void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(t8.b bVar) {
        this.zzi = bVar.u();
        this.zzj = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new q(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    protected void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        w8.m.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new r(this, i10, null)));
    }
}
