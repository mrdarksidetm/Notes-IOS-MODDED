package b7;

import ae.r;
import ae.s;
import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f5517a;

    /* JADX INFO: renamed from: b7.a$a, reason: collision with other inner class name */
    static final class C0131a extends s implements zd.a<String> {
        C0131a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String string = Settings.Secure.getString(a.this.f5517a, "android_id");
            r.e(string, "getString(\n             ….ANDROID_ID\n            )");
            return string;
        }
    }

    public a(ContentResolver contentResolver) {
        r.f(contentResolver, "contentResolver");
        this.f5517a = contentResolver;
    }

    public final String b() {
        return (String) g7.a.a(new C0131a(), "");
    }
}
