package i8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import t8.h;
import t8.i;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    t8.a f12590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    zzf f12591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f12592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f12593d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f12594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f12595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f12596g;

    /* JADX INFO: renamed from: i8.a$a, reason: collision with other inner class name */
    public static final class C0303a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f12598b;

        public C0303a(String str, boolean z10) {
            this.f12597a = str;
            this.f12598b = z10;
        }

        public String a() {
            return this.f12597a;
        }

        public boolean b() {
            return this.f12598b;
        }

        public String toString() {
            String str = this.f12597a;
            boolean z10 = this.f12598b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        m.k(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f12595f = context;
        this.f12592c = false;
        this.f12596g = j10;
    }

    public static C0303a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0303a c0303aB = aVar.b();
            aVar.e(c0303aB, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0303aB;
        } finally {
        }
    }

    private final void f() {
        synchronized (this.f12593d) {
            c cVar = this.f12594e;
            if (cVar != null) {
                cVar.f12602c.countDown();
                try {
                    this.f12594e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f12596g;
            if (j10 > 0) {
                this.f12594e = new c(this, j10);
            }
        }
    }

    public C0303a b() {
        C0303a c0303a;
        m.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f12592c) {
                m.k(this.f12590a);
                m.k(this.f12591b);
                c0303a = new C0303a(this.f12591b.zzc(), this.f12591b.zze(true));
            } else {
                synchronized (this.f12593d) {
                    c cVar = this.f12594e;
                    if (cVar == null || !cVar.f12603d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.f12592c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    m.k(this.f12590a);
                    m.k(this.f12591b);
                    try {
                        c0303a = new C0303a(this.f12591b.zzc(), this.f12591b.zze(true));
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
        }
        f();
        return c0303a;
    }

    public final void c() {
        m.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f12595f == null || this.f12590a == null) {
                return;
            }
            try {
                if (this.f12592c) {
                    d9.b.b().c(this.f12595f, this.f12590a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f12592c = false;
            this.f12591b = null;
            this.f12590a = null;
        }
    }

    protected final void d(boolean z10) {
        m.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f12592c) {
                c();
            }
            Context context = this.f12595f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iH = h.f().h(context, 12451000);
                if (iH != 0 && iH != 2) {
                    throw new IOException("Google Play services not available");
                }
                t8.a aVar = new t8.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!d9.b.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f12590a = aVar;
                    try {
                        this.f12591b = zze.zza(aVar.b(10000L, TimeUnit.MILLISECONDS));
                        this.f12592c = true;
                        if (z10) {
                            f();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new i(9);
            }
        }
    }

    final boolean e(C0303a c0303a, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0303a != null) {
            map.put("limit_ad_tracking", true != c0303a.b() ? "0" : "1");
            String strA = c0303a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new b(this, map).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
