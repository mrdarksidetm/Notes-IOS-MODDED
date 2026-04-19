package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1973d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f1974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f1975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f1976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1977d;

        public a a() {
            return new a(this.f1974a, this.f1975b, this.f1976c, this.f1977d);
        }

        public C0032a b(int i10) {
            this.f1976c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        public C0032a c(int i10) {
            this.f1977d = Integer.valueOf(i10);
            return this;
        }

        public C0032a d(int i10) {
            this.f1975b = Integer.valueOf(i10);
            return this;
        }

        public C0032a e(int i10) {
            this.f1974a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1970a = num;
        this.f1971b = num2;
        this.f1972c = num3;
        this.f1973d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1970a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1971b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1972c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1973d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
