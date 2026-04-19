package ba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class n0 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f5605a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f5606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f5607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f5608c;

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f5607b = bundle;
            Bundle bundle2 = new Bundle();
            this.f5608c = bundle2;
            this.f5606a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.i().q().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzads.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.n());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.i().p());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.k());
        }

        public a a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f5608c.putString(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public n0 b() {
            return new n0(this.f5607b);
        }

        public a c(List<String> list) {
            this.f5607b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f5612d;

        private b(String str) {
            this.f5609a = str;
        }

        public h a() {
            return x1.E(this.f5609a, this.f5610b, this.f5611c, this.f5612d);
        }

        public b b(String str) {
            this.f5611c = str;
            return this;
        }

        public b c(String str) {
            this.f5610b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f5610b = str;
            this.f5612d = str2;
            return this;
        }
    }

    private n0(Bundle bundle) {
        this.f5605a = bundle;
    }

    public static a d(String str) {
        return e(str, FirebaseAuth.getInstance());
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        w8.m.e(str);
        w8.m.k(firebaseAuth);
        if (!"facebook.com".equals(str) || zzafb.zza(firebaseAuth.i())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(w8.m.e(str));
    }

    @Override // ba.n
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5605a);
        activity.startActivity(intent);
    }

    @Override // ba.n
    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5605a);
        activity.startActivity(intent);
    }

    @Override // ba.n
    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f5605a);
        activity.startActivity(intent);
    }
}
