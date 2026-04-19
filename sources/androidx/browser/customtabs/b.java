package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import d.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.b f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1980c;

    class a extends a.AbstractBinderC0213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1981a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x.a f1982b;

        /* JADX INFO: renamed from: androidx.browser.customtabs.b$a$a, reason: collision with other inner class name */
        class RunnableC0033a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1984a;

            RunnableC0033a(Bundle bundle) {
                this.f1984a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onUnminimized(this.f1984a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.b$a$b, reason: collision with other inner class name */
        class RunnableC0034b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1987b;

            RunnableC0034b(int i10, Bundle bundle) {
                this.f1986a = i10;
                this.f1987b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onNavigationEvent(this.f1986a, this.f1987b);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1989a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1990b;

            c(String str, Bundle bundle) {
                this.f1989a = str;
                this.f1990b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.extraCallback(this.f1989a, this.f1990b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1992a;

            d(Bundle bundle) {
                this.f1992a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onMessageChannelReady(this.f1992a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1995b;

            e(String str, Bundle bundle) {
                this.f1994a = str;
                this.f1995b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onPostMessage(this.f1994a, this.f1995b);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f1998b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f1999c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f2000d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1997a = i10;
                this.f1998b = uri;
                this.f1999c = z10;
                this.f2000d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onRelationshipValidationResult(this.f1997a, this.f1998b, this.f1999c, this.f2000d);
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2003b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f2004c;

            g(int i10, int i11, Bundle bundle) {
                this.f2002a = i10;
                this.f2003b = i11;
                this.f2004c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onActivityResized(this.f2002a, this.f2003b, this.f2004c);
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2006a;

            h(Bundle bundle) {
                this.f2006a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onWarmupCompleted(this.f2006a);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2009b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f2010c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f2011d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f2012e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2013f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f2008a = i10;
                this.f2009b = i11;
                this.f2010c = i12;
                this.f2011d = i13;
                this.f2012e = i14;
                this.f2013f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onActivityLayout(this.f2008a, this.f2009b, this.f2010c, this.f2011d, this.f2012e, this.f2013f);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2015a;

            j(Bundle bundle) {
                this.f2015a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1982b.onMinimized(this.f2015a);
            }
        }

        a(x.a aVar) {
            this.f1982b = aVar;
        }

        @Override // d.a
        public void A(int i10, int i11, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new g(i10, i11, bundle));
        }

        @Override // d.a
        public void E(String str, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new c(str, bundle));
        }

        @Override // d.a
        public void F(Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new h(bundle));
        }

        @Override // d.a
        public void G(int i10, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new RunnableC0034b(i10, bundle));
        }

        @Override // d.a
        public void N(String str, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new e(str, bundle));
        }

        @Override // d.a
        public void Q(Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new d(bundle));
        }

        @Override // d.a
        public void R(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new f(i10, uri, z10, bundle));
        }

        @Override // d.a
        public void g(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // d.a
        public Bundle i(String str, Bundle bundle) {
            x.a aVar = this.f1982b;
            if (aVar == null) {
                return null;
            }
            return aVar.extraCallbackWithResult(str, bundle);
        }

        @Override // d.a
        public void s(Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new j(bundle));
        }

        @Override // d.a
        public void w(Bundle bundle) {
            if (this.f1982b == null) {
                return;
            }
            this.f1981a.post(new RunnableC0033a(bundle));
        }
    }

    b(d.b bVar, ComponentName componentName, Context context) {
        this.f1978a = bVar;
        this.f1979b = componentName;
        this.f1980c = context;
    }

    public static boolean a(Context context, String str, d dVar) {
        dVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    private a.AbstractBinderC0213a b(x.a aVar) {
        return new a(aVar);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private h f(x.a aVar, PendingIntent pendingIntent) {
        boolean zL;
        a.AbstractBinderC0213a abstractBinderC0213aB = b(aVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zL = this.f1978a.u(abstractBinderC0213aB, bundle);
            } else {
                zL = this.f1978a.l(abstractBinderC0213aB);
            }
            if (zL) {
                return new h(this.f1978a, abstractBinderC0213aB, this.f1979b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public h e(x.a aVar) {
        return f(aVar, null);
    }

    public boolean g(long j10) {
        try {
            return this.f1978a.p(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
