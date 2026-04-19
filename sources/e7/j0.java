package e7;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f10663a;

    static final class a extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f10665b = str;
        }

        @Override // zd.a
        public final String invoke() {
            String string = Settings.Global.getString(j0.this.f10663a, this.f10665b);
            ae.r.e(string, "getString(contentResolver, key)");
            return string;
        }
    }

    static final class b extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f10667b = str;
        }

        @Override // zd.a
        public final String invoke() {
            String string = Settings.Secure.getString(j0.this.f10663a, this.f10667b);
            ae.r.e(string, "getString(contentResolver, key)");
            return string;
        }
    }

    static final class c extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f10669b = str;
        }

        @Override // zd.a
        public final String invoke() {
            String string = Settings.System.getString(j0.this.f10663a, this.f10669b);
            ae.r.e(string, "getString(contentResolver, key)");
            return string;
        }
    }

    public j0(ContentResolver contentResolver) {
        ae.r.f(contentResolver, "contentResolver");
        this.f10663a = contentResolver;
    }

    private final String t(String str) {
        return (String) g7.a.a(new a(str), "");
    }

    private final String u(String str) {
        return (String) g7.a.a(new b(str), "");
    }

    private final String v(String str) {
        return (String) g7.a.a(new c(str), "");
    }

    @Override // e7.i0
    public String a() {
        return t("adb_enabled");
    }

    @Override // e7.i0
    public String b() {
        return v("date_format");
    }

    @Override // e7.i0
    public String c() {
        return v("end_button_behavior");
    }

    @Override // e7.i0
    public String d() {
        return u("default_input_method");
    }

    @Override // e7.i0
    public String e() {
        return u("accessibility_enabled");
    }

    @Override // e7.i0
    public String f() {
        return t("transition_animation_scale");
    }

    @Override // e7.i0
    public String g() {
        return Build.VERSION.SDK_INT >= 28 ? u("rtt_calling_mode") : "";
    }

    @Override // e7.i0
    public String h() {
        return v("auto_punctuate");
    }

    @Override // e7.i0
    public String i() {
        return v("alarm_alert");
    }

    @Override // e7.i0
    public String j() {
        return t("http_proxy");
    }

    @Override // e7.i0
    public String k() {
        return v("font_scale");
    }

    @Override // e7.i0
    public String l() {
        return v("screen_off_timeout");
    }

    @Override // e7.i0
    public String m() {
        return v("auto_replace");
    }

    @Override // e7.i0
    public String n() {
        return t("window_animation_scale");
    }

    @Override // e7.i0
    public String o() {
        return t("development_settings_enabled");
    }

    @Override // e7.i0
    public String p() {
        return t("data_roaming");
    }

    @Override // e7.i0
    public String q() {
        return u("touch_exploration_enabled");
    }

    @Override // e7.i0
    public String r() {
        return v("time_12_24");
    }
}
