package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2018b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.c$c, reason: collision with other inner class name */
    private static class C0035c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f2021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f2022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f2023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f2024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f2025g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2028j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f2019a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.C0032a f2020b = new a.C0032a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2026h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2027i = true;

        public d() {
        }

        public d(h hVar) {
            if (hVar != null) {
                i(hVar);
            }
        }

        private void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f2019a.hasExtra("com.android.browser.headers") ? this.f2019a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f2019a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void j(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f2019a.putExtras(bundle);
        }

        private void k() {
            if (this.f2022d == null) {
                this.f2022d = a.a();
            }
            C0035c.a(this.f2022d, this.f2028j);
        }

        public d a(String str, PendingIntent pendingIntent) {
            if (this.f2021c == null) {
                this.f2021c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f2021c.add(bundle);
            return this;
        }

        public c b() {
            if (!this.f2019a.hasExtra("android.support.customtabs.extra.SESSION")) {
                j(null, null);
            }
            ArrayList<Bundle> arrayList = this.f2021c;
            if (arrayList != null) {
                this.f2019a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2023e;
            if (arrayList2 != null) {
                this.f2019a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2019a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2027i);
            this.f2019a.putExtras(this.f2020b.a().a());
            Bundle bundle = this.f2025g;
            if (bundle != null) {
                this.f2019a.putExtras(bundle);
            }
            if (this.f2024f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f2024f);
                this.f2019a.putExtras(bundle2);
            }
            this.f2019a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f2026h);
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                k();
            }
            ActivityOptions activityOptions = this.f2022d;
            return new c(this.f2019a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f2019a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f2019a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        public d e(androidx.browser.customtabs.a aVar) {
            this.f2025g = aVar.a();
            return this;
        }

        public d f(Context context, int i10, int i11) {
            this.f2019a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", d3.c.a(context, i10, i11).b());
            return this;
        }

        public d g(boolean z10) {
            this.f2027i = z10;
            return this;
        }

        public d h(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.f2019a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            this.f2019a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            this.f2019a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
            return this;
        }

        public d i(h hVar) {
            this.f2019a.setPackage(hVar.f().getPackageName());
            j(hVar.e(), hVar.g());
            return this;
        }

        public d l(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f2026h = i10;
            if (i10 == 1) {
                this.f2019a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f2019a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f2019a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public d m(boolean z10) {
            this.f2019a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public d n(Context context, int i10, int i11) {
            this.f2022d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public d o(boolean z10) {
            this.f2019a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }
    }

    c(Intent intent, Bundle bundle) {
        this.f2017a = intent;
        this.f2018b = bundle;
    }

    public static int a() {
        return 5;
    }

    public static Intent c(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public void b(Context context, Uri uri) {
        this.f2017a.setData(uri);
        androidx.core.content.a.startActivity(context, this.f2017a, this.f2018b);
    }
}
