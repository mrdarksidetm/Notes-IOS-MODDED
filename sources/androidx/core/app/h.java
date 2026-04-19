package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h implements d3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f3248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.d f3249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f3250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f3251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f3252f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f3253g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f3255i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.h$h, reason: collision with other inner class name */
    static class C0070h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    h(g.d dVar) {
        int i10;
        this.f3249c = dVar;
        Context context = dVar.f3207a;
        this.f3247a = context;
        this.f3248b = Build.VERSION.SDK_INT >= 26 ? e.a(context, dVar.K) : new Notification.Builder(dVar.f3207a);
        Notification notification = dVar.R;
        this.f3248b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f3215i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f3211e).setContentText(dVar.f3212f).setContentInfo(dVar.f3217k).setContentIntent(dVar.f3213g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f3214h, (notification.flags & 128) != 0).setNumber(dVar.f3218l).setProgress(dVar.f3226t, dVar.f3227u, dVar.f3228v);
        Notification.Builder builder = this.f3248b;
        IconCompat iconCompat = dVar.f3216j;
        c.b(builder, iconCompat == null ? null : iconCompat.r(context));
        this.f3248b.setSubText(dVar.f3223q).setUsesChronometer(dVar.f3221o).setPriority(dVar.f3219m);
        g.f fVar = dVar.f3222p;
        if (fVar instanceof g.e) {
            Iterator<g.a> it = ((g.e) fVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<g.a> it2 = dVar.f3208b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.f3253g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f3250d = dVar.H;
        this.f3251e = dVar.I;
        this.f3248b.setShowWhen(dVar.f3220n);
        a.i(this.f3248b, dVar.f3232z);
        a.g(this.f3248b, dVar.f3229w);
        a.j(this.f3248b, dVar.f3231y);
        a.h(this.f3248b, dVar.f3230x);
        this.f3254h = dVar.O;
        b.b(this.f3248b, dVar.C);
        b.c(this.f3248b, dVar.E);
        b.f(this.f3248b, dVar.F);
        b.d(this.f3248b, dVar.G);
        b.e(this.f3248b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(f(dVar.f3209c), dVar.U) : dVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f3248b, (String) it3.next());
            }
        }
        this.f3255i = dVar.J;
        if (dVar.f3210d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < dVar.f3210d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), i.a(dVar.f3210d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3253g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = dVar.T;
        if (obj != null) {
            c.c(this.f3248b, obj);
        }
        this.f3248b.setExtras(dVar.D);
        d.e(this.f3248b, dVar.f3225s);
        RemoteViews remoteViews = dVar.H;
        if (remoteViews != null) {
            d.c(this.f3248b, remoteViews);
        }
        RemoteViews remoteViews2 = dVar.I;
        if (remoteViews2 != null) {
            d.b(this.f3248b, remoteViews2);
        }
        RemoteViews remoteViews3 = dVar.J;
        if (remoteViews3 != null) {
            d.d(this.f3248b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f3248b, dVar.L);
            e.e(this.f3248b, dVar.f3224r);
            e.f(this.f3248b, dVar.M);
            e.g(this.f3248b, dVar.N);
            e.d(this.f3248b, dVar.O);
            if (dVar.B) {
                e.c(this.f3248b, dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f3248b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<k> it4 = dVar.f3209c.iterator();
            while (it4.hasNext()) {
                f.a(this.f3248b, it4.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f3248b, dVar.Q);
            g.b(this.f3248b, g.c.a(null));
        }
        if (i14 >= 31 && (i10 = dVar.P) != 0) {
            C0070h.b(this.f3248b, i10);
        }
        if (dVar.S) {
            if (this.f3249c.f3230x) {
                this.f3254h = 2;
            } else {
                this.f3254h = 1;
            }
            this.f3248b.setVibrate(null);
            this.f3248b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f3248b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f3249c.f3229w)) {
                    a.g(this.f3248b, "silent");
                }
                e.d(this.f3248b, this.f3254h);
            }
        }
    }

    private void b(g.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.q() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : l.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            C0070h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f3248b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        z.b bVar = new z.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<k> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // d3.i
    public Notification.Builder a() {
        return this.f3248b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        g.f fVar = this.f3249c.f3222p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f3249c.H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (fVar != null && (remoteViewsF = this.f3249c.f3222p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (fVar != null && (bundleA = androidx.core.app.g.a(notificationD)) != null) {
            fVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3248b.build();
        }
        Notification notificationBuild = this.f3248b.build();
        if (this.f3254h != 0) {
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f3254h == 2) {
                g(notificationBuild);
            }
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f3254h == 1) {
                g(notificationBuild);
            }
        }
        return notificationBuild;
    }
}
