package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import d.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2039a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.b f2040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a f2041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f2042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f2043e;

    class a extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f2044a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x.b f2045b;

        a(x.b bVar) {
            this.f2045b = bVar;
        }

        @Override // d.c
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            Handler handler = this.f2044a;
            final x.b bVar = this.f2045b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.g
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.onGreatestScrollPercentageIncreased(i10, bundle);
                }
            });
        }

        @Override // d.c
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            Handler handler = this.f2044a;
            final x.b bVar = this.f2045b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.f
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.onSessionEnded(z10, bundle);
                }
            });
        }

        @Override // d.c
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            Handler handler = this.f2044a;
            final x.b bVar = this.f2045b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.e
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.onVerticalScrollEvent(z10, bundle);
                }
            });
        }
    }

    h(d.b bVar, d.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2040b = bVar;
        this.f2041c = aVar;
        this.f2042d = componentName;
        this.f2043e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2043e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private c.a c(x.b bVar) {
        return new a(bVar);
    }

    private Bundle d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f2043e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder e() {
        return this.f2041c.asBinder();
    }

    ComponentName f() {
        return this.f2042d;
    }

    PendingIntent g() {
        return this.f2043e;
    }

    public boolean h(Bundle bundle) {
        try {
            return this.f2040b.J(this.f2041c, b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean i(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2040b.H(this.f2041c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int j(String str, Bundle bundle) {
        int iQ;
        Bundle bundleB = b(bundle);
        synchronized (this.f2039a) {
            try {
                try {
                    iQ = this.f2040b.q(this.f2041c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iQ;
    }

    public boolean k(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleD = d(uri2);
            if (bundleD == null) {
                return this.f2040b.L(this.f2041c, uri);
            }
            bundle.putAll(bundleD);
            return this.f2040b.v(this.f2041c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean l(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        a(bundle);
        try {
            return this.f2040b.T(this.f2041c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean m(x.b bVar, Bundle bundle) {
        try {
            return this.f2040b.r(this.f2041c, c(bVar).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean n(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        a(bundle);
        try {
            return this.f2040b.T(this.f2041c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean o(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f2040b.S(this.f2041c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
