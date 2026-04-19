package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static i.a f961a = new i.a(new i.b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f962b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static androidx.core.os.c f963c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static androidx.core.os.c f964d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f965e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f966f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z.b<WeakReference<d>> f967g = new z.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f968h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f969i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    d() {
    }

    static void F(d dVar) {
        synchronized (f968h) {
            G(dVar);
        }
    }

    private static void G(d dVar) {
        synchronized (f968h) {
            Iterator<WeakReference<d>> it = f967g.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    static void Q(final Context context) {
        if (v(context)) {
            if (k3.a.b()) {
                if (f966f) {
                    return;
                }
                f961a.execute(new Runnable() { // from class: k.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.appcompat.app.d.w(context);
                    }
                });
                return;
            }
            synchronized (f969i) {
                androidx.core.os.c cVar = f963c;
                if (cVar == null) {
                    if (f964d == null) {
                        f964d = androidx.core.os.c.b(i.b(context));
                    }
                    if (f964d.f()) {
                    } else {
                        f963c = f964d;
                    }
                } else if (!cVar.equals(f964d)) {
                    androidx.core.os.c cVar2 = f963c;
                    f964d = cVar2;
                    i.a(context, cVar2.h());
                }
            }
        }
    }

    static void d(d dVar) {
        synchronized (f968h) {
            G(dVar);
            f967g.add(new WeakReference<>(dVar));
        }
    }

    public static d h(Activity activity, k.b bVar) {
        return new e(activity, bVar);
    }

    public static d i(Dialog dialog, k.b bVar) {
        return new e(dialog, bVar);
    }

    public static androidx.core.os.c k() {
        if (k3.a.b()) {
            Object objP = p();
            if (objP != null) {
                return androidx.core.os.c.j(b.a(objP));
            }
        } else {
            androidx.core.os.c cVar = f963c;
            if (cVar != null) {
                return cVar;
            }
        }
        return androidx.core.os.c.e();
    }

    public static int m() {
        return f962b;
    }

    static Object p() {
        Context contextL;
        Iterator<WeakReference<d>> it = f967g.iterator();
        while (it.hasNext()) {
            d dVar = it.next().get();
            if (dVar != null && (contextL = dVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    static androidx.core.os.c r() {
        return f963c;
    }

    static boolean v(Context context) {
        if (f965e == null) {
            try {
                Bundle bundle = g.a(context).metaData;
                if (bundle != null) {
                    f965e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f965e = Boolean.FALSE;
            }
        }
        return f965e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        i.c(context);
        f966f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void I(int i10);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public void N(int i10) {
    }

    public abstract void O(CharSequence charSequence);

    public abstract p.b P(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public abstract k.a n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract androidx.appcompat.app.a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
