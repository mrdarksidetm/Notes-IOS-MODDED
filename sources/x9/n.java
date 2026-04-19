package x9;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23107g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f23113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f23114g;

        public n a() {
            return new n(this.f23109b, this.f23108a, this.f23110c, this.f23111d, this.f23112e, this.f23113f, this.f23114g);
        }

        public b b(String str) {
            this.f23108a = w8.m.f(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f23109b = w8.m.f(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f23110c = str;
            return this;
        }

        public b e(String str) {
            this.f23111d = str;
            return this;
        }

        public b f(String str) {
            this.f23112e = str;
            return this;
        }

        public b g(String str) {
            this.f23114g = str;
            return this;
        }

        public b h(String str) {
            this.f23113f = str;
            return this;
        }
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        w8.m.o(!e9.o.b(str), "ApplicationId must be set.");
        this.f23102b = str;
        this.f23101a = str2;
        this.f23103c = str3;
        this.f23104d = str4;
        this.f23105e = str5;
        this.f23106f = str6;
        this.f23107g = str7;
    }

    public static n a(Context context) {
        w8.p pVar = new w8.p(context);
        String strA = pVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new n(strA, pVar.a("google_api_key"), pVar.a("firebase_database_url"), pVar.a("ga_trackingId"), pVar.a("gcm_defaultSenderId"), pVar.a("google_storage_bucket"), pVar.a("project_id"));
    }

    public String b() {
        return this.f23101a;
    }

    public String c() {
        return this.f23102b;
    }

    public String d() {
        return this.f23103c;
    }

    public String e() {
        return this.f23104d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return w8.k.b(this.f23102b, nVar.f23102b) && w8.k.b(this.f23101a, nVar.f23101a) && w8.k.b(this.f23103c, nVar.f23103c) && w8.k.b(this.f23104d, nVar.f23104d) && w8.k.b(this.f23105e, nVar.f23105e) && w8.k.b(this.f23106f, nVar.f23106f) && w8.k.b(this.f23107g, nVar.f23107g);
    }

    public String f() {
        return this.f23105e;
    }

    public String g() {
        return this.f23107g;
    }

    public String h() {
        return this.f23106f;
    }

    public int hashCode() {
        return w8.k.c(this.f23102b, this.f23101a, this.f23103c, this.f23104d, this.f23105e, this.f23106f, this.f23107g);
    }

    public String toString() {
        return w8.k.d(this).a("applicationId", this.f23102b).a("apiKey", this.f23101a).a("databaseUrl", this.f23103c).a("gcmSenderId", this.f23105e).a("storageBucket", this.f23106f).a("projectId", this.f23107g).toString();
    }
}
