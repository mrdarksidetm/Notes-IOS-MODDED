package androidx.core.app;

import android.app.Notification;
import android.app.Notification$CallStyle;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f3184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f3185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l[] f3186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l[] f3187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f3191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f3192i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f3193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f3194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3195l;

        /* JADX INFO: renamed from: androidx.core.app.g$a$a, reason: collision with other inner class name */
        public static final class C0069a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f3196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f3197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f3198c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f3199d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f3200e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<l> f3201f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f3202g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f3203h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f3204i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f3205j;

            public C0069a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0069a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f3199d = true;
                this.f3203h = true;
                this.f3196a = iconCompat;
                this.f3197b = d.d(charSequence);
                this.f3198c = pendingIntent;
                this.f3200e = bundle;
                this.f3201f = lVarArr == null ? null : new ArrayList<>(Arrays.asList(lVarArr));
                this.f3199d = z10;
                this.f3202g = i10;
                this.f3203h = z11;
                this.f3204i = z12;
                this.f3205j = z13;
            }

            private void b() {
                if (this.f3204i && this.f3198c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<l> arrayList3 = this.f3201f;
                if (arrayList3 != null) {
                    for (l lVar : arrayList3) {
                        if (lVar.j()) {
                            arrayList.add(lVar);
                        } else {
                            arrayList2.add(lVar);
                        }
                    }
                }
                l[] lVarArr = arrayList.isEmpty() ? null : (l[]) arrayList.toArray(new l[arrayList.size()]);
                return new a(this.f3196a, this.f3197b, this.f3198c, this.f3200e, arrayList2.isEmpty() ? null : (l[]) arrayList2.toArray(new l[arrayList2.size()]), lVarArr, this.f3199d, this.f3202g, this.f3203h, this.f3204i, this.f3205j);
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.h(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, l[] lVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f3189f = true;
            this.f3185b = iconCompat;
            if (iconCompat != null && iconCompat.k() == 2) {
                this.f3192i = iconCompat.i();
            }
            this.f3193j = d.d(charSequence);
            this.f3194k = pendingIntent;
            this.f3184a = bundle == null ? new Bundle() : bundle;
            this.f3186c = lVarArr;
            this.f3187d = lVarArr2;
            this.f3188e = z10;
            this.f3190g = i10;
            this.f3189f = z11;
            this.f3191h = z12;
            this.f3195l = z13;
        }

        public PendingIntent a() {
            return this.f3194k;
        }

        public boolean b() {
            return this.f3188e;
        }

        public Bundle c() {
            return this.f3184a;
        }

        public IconCompat d() {
            int i10;
            if (this.f3185b == null && (i10 = this.f3192i) != 0) {
                this.f3185b = IconCompat.h(null, "", i10);
            }
            return this.f3185b;
        }

        public l[] e() {
            return this.f3186c;
        }

        public int f() {
            return this.f3190g;
        }

        public boolean g() {
            return this.f3189f;
        }

        public CharSequence h() {
            return this.f3193j;
        }

        public boolean i() {
            return this.f3195l;
        }

        public boolean j() {
            return this.f3191h;
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f3206e;

        @Override // androidx.core.app.g.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.g.f
        public void b(d3.i iVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f3244b).bigText(this.f3206e);
            if (this.f3246d) {
                bigTextStyleBigText.setSummaryText(this.f3245c);
            }
        }

        @Override // androidx.core.app.g.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f3206e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f3208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<k> f3209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f3210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f3211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f3212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f3213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f3214h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f3215i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f3216j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f3217k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3218l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3219m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f3220n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f3221o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        f f3222p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f3223q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f3224r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f3225s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3226t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3227u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f3228v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f3229w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f3230x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f3231y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f3232z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f3208b = new ArrayList<>();
            this.f3209c = new ArrayList<>();
            this.f3210d = new ArrayList<>();
            this.f3220n = true;
            this.f3232z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f3207a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f3219m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public d a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3208b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new h(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z10) {
            j(16, z10);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f3213g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f3212f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f3211e = d(charSequence);
            return this;
        }

        public d k(boolean z10) {
            this.f3232z = z10;
            return this;
        }

        public d l(int i10) {
            this.f3219m = i10;
            return this;
        }

        public d m(int i10) {
            this.R.icon = i10;
            return this;
        }

        public d n(f fVar) {
            if (this.f3222p != fVar) {
                this.f3222p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d p(long j10) {
            this.R.when = j10;
            return this;
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k f3234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f3235g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f3236h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f3237i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f3238j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f3239k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f3240l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f3241m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f3242n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification$CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification$CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification$CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification$CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification$CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification$CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification$CallStyle d(Notification$CallStyle notification$CallStyle, int i10) {
                return notification$CallStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            static Notification$CallStyle f(Notification$CallStyle notification$CallStyle, int i10) {
                return notification$CallStyle.setDeclineButtonColorHint(i10);
            }

            static Notification$CallStyle g(Notification$CallStyle notification$CallStyle, boolean z10) {
                return notification$CallStyle.setIsVideo(z10);
            }

            static Notification$CallStyle h(Notification$CallStyle notification$CallStyle, Icon icon) {
                return notification$CallStyle.setVerificationIcon(icon);
            }

            static Notification$CallStyle i(Notification$CallStyle notification$CallStyle, CharSequence charSequence) {
                return notification$CallStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            Resources resources;
            int i10;
            int i11 = this.f3233e;
            if (i11 == 1) {
                resources = this.f3243a.f3207a.getResources();
                i10 = c3.e.f6349e;
            } else if (i11 == 2) {
                resources = this.f3243a.f3207a.getResources();
                i10 = c3.e.f6350f;
            } else {
                if (i11 != 3) {
                    return null;
                }
                resources = this.f3243a.f3207a.getResources();
                i10 = c3.e.f6351g;
            }
            return resources.getString(i10);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.getColor(this.f3243a.f3207a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3243a.f3207a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C0069a(IconCompat.g(this.f3243a.f3207a, i10), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i10 = c3.c.f6317b;
            int i11 = c3.c.f6316a;
            PendingIntent pendingIntent = this.f3235g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f3238j;
            return k(z10 ? i10 : i11, z10 ? c3.e.f6346b : c3.e.f6345a, this.f3239k, c3.b.f6314a, pendingIntent);
        }

        private a m() {
            int i10;
            Integer num;
            int i11;
            int i12 = c3.c.f6318c;
            PendingIntent pendingIntent = this.f3236h;
            if (pendingIntent == null) {
                i10 = c3.e.f6348d;
                num = this.f3240l;
                i11 = c3.b.f6315b;
                pendingIntent = this.f3237i;
            } else {
                i10 = c3.e.f6347c;
                num = this.f3240l;
                i11 = c3.b.f6315b;
            }
            return k(i12, i10, num, i11, pendingIntent);
        }

        @Override // androidx.core.app.g.f
        public void a(Bundle bundle) {
            Parcelable parcelableI;
            String str;
            super.a(bundle);
            bundle.putInt("android.callType", this.f3233e);
            bundle.putBoolean("android.callIsVideo", this.f3238j);
            k kVar = this.f3234f;
            if (kVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    parcelableI = c.b(kVar.h());
                    str = "android.callPerson";
                } else {
                    parcelableI = kVar.i();
                    str = "android.callPersonCompat";
                }
                bundle.putParcelable(str, parcelableI);
            }
            IconCompat iconCompat = this.f3241m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.r(this.f3243a.f3207a)));
            }
            bundle.putCharSequence("android.verificationText", this.f3242n);
            bundle.putParcelable("android.answerIntent", this.f3235g);
            bundle.putParcelable("android.declineIntent", this.f3236h);
            bundle.putParcelable("android.hangUpIntent", this.f3237i);
            Integer num = this.f3239k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3240l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.g.f
        public void b(d3.i iVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            notification$CallStyleA = null;
            Notification$CallStyle notification$CallStyleA = null;
            charSequenceI = null;
            if (i10 < 31) {
                Notification.Builder builderA = iVar.a();
                k kVar = this.f3234f;
                builderA.setContentTitle(kVar != null ? kVar.c() : null);
                Bundle bundle = this.f3243a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f3243a.D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                k kVar2 = this.f3234f;
                if (kVar2 != null) {
                    if (kVar2.a() != null) {
                        b.c(builderA, this.f3234f.a().r(this.f3243a.f3207a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f3234f.h());
                    } else {
                        a.a(builderA, this.f3234f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f3233e;
            if (i11 == 1) {
                notification$CallStyleA = d.a(this.f3234f.h(), this.f3236h, this.f3235g);
            } else if (i11 == 2) {
                notification$CallStyleA = d.b(this.f3234f.h(), this.f3237i);
            } else if (i11 == 3) {
                notification$CallStyleA = d.c(this.f3234f.h(), this.f3237i, this.f3235g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3233e));
            }
            if (notification$CallStyleA != null) {
                notification$CallStyleA.setBuilder(iVar.a());
                Integer num = this.f3239k;
                if (num != null) {
                    d.d(notification$CallStyleA, num.intValue());
                }
                Integer num2 = this.f3240l;
                if (num2 != null) {
                    d.f(notification$CallStyleA, num2.intValue());
                }
                d.i(notification$CallStyleA, this.f3242n);
                IconCompat iconCompat = this.f3241m;
                if (iconCompat != null) {
                    d.h(notification$CallStyleA, iconCompat.r(this.f3243a.f3207a));
                }
                d.g(notification$CallStyleA, this.f3238j);
            }
        }

        @Override // androidx.core.app.g.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            int i10 = 2;
            ArrayList<a> arrayList2 = this.f3243a.f3208b;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (aVarL != null && i10 == 1) {
                        arrayList.add(aVarL);
                        i10--;
                    }
                }
            }
            if (aVarL != null && i10 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f3243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f3244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f3245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3246d = false;

        public void a(Bundle bundle) {
            if (this.f3246d) {
                bundle.putCharSequence("android.summaryText", this.f3245c);
            }
            CharSequence charSequence = this.f3244b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(d3.i iVar);

        protected abstract String c();

        public RemoteViews d(d3.i iVar) {
            return null;
        }

        public RemoteViews e(d3.i iVar) {
            return null;
        }

        public RemoteViews f(d3.i iVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f3243a != dVar) {
                this.f3243a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
