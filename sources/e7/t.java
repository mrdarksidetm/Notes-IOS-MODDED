package e7;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f10690a;

    static final class a extends ae.s implements zd.a<String> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String glEsVersion = t.this.f10690a.getDeviceConfigurationInfo().getGlEsVersion();
            ae.r.e(glEsVersion, "activityManager.deviceCo…igurationInfo.glEsVersion");
            return glEsVersion;
        }
    }

    public t(ActivityManager activityManager) {
        ae.r.f(activityManager, "activityManager");
        this.f10690a = activityManager;
    }

    @Override // e7.s
    public String a() {
        return (String) g7.a.a(new a(), "");
    }
}
