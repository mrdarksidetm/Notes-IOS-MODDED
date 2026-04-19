package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.c;
import androidx.fragment.app.o;
import ca.f1;
import ca.h1;
import ca.p0;
import ca.t;
import ca.u1;
import ca.v1;
import ca.x1;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.internal.p002firebaseauthapi.zzadl;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import e9.h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import x8.e;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GenericIdpActivity extends o implements zzadl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f8950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h1 f8951c = h1.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8952a = false;

    private final Uri.Builder J(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(f.f7478a, stringArrayListExtra);
        String strL = L(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza = zzadk.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = strJoin;
        v1.c().e(getApplicationContext(), str, string, strZza, action, stringExtra2, stringExtra3, stringExtra4);
        String strB = x1.a(getApplicationContext(), x9.f.o(stringExtra4).r()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            M(t.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(strL)) {
            builder.appendQueryParameter("customParameters", strL);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    static /* synthetic */ Uri K(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            z9.a aVar = (z9.a) task.getResult();
            if (aVar.a() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar.a()));
            }
            builderBuildUpon.fragment("fac=" + aVar.b());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }

    private static String L(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    private final void M(Status status) {
        f8950b = 0L;
        this.f8952a = false;
        Intent intent = new Intent();
        f1.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (N(intent)) {
            f8951c.a(this);
        } else {
            p0.b(getApplicationContext(), status);
        }
        finish();
    }

    private final boolean N(Intent intent) {
        return t4.a.b(this).d(intent);
    }

    private final void O() {
        f8950b = 0L;
        this.f8952a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (N(intent)) {
            f8951c.a(this);
        } else {
            p0.b(this, t.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            O();
            return;
        }
        long jA = e9.f.b().a();
        if (jA - f8950b < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f8950b = jA;
        if (bundle != null) {
            this.f8952a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.a, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f8952a) {
                O();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(e9.a.a(this, packageName)).toLowerCase(Locale.US);
                x9.f fVarO = x9.f.o(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarO);
                if (zzafb.zza(fVarO)) {
                    zza(J(Uri.parse(zzafb.zza(fVarO.q().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.v0());
                } else {
                    new zzadj(packageName, lowerCase, getIntent(), fVarO, this).executeOnExecutor(firebaseAuth.A0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzadk.zzb(this, packageName);
            }
            this.f8952a = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            M(f1.b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            O();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        u1 u1VarB = v1.c().b(this, packageName2, stringExtra2);
        if (u1VarB == null) {
            O();
        }
        if (booleanExtra) {
            stringExtra = x1.a(getApplicationContext(), x9.f.o(u1VarB.a()).r()).c(stringExtra);
        }
        zzahr zzahrVar = new zzahr(u1VarB, stringExtra);
        String strE = u1VarB.e();
        String strB = u1VarB.b();
        zzahrVar.zzb(strE);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strB)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + strB);
            O();
            return;
        }
        f8950b = 0L;
        this.f8952a = false;
        Intent intent2 = new Intent();
        e.e(zzahrVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strB);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (N(intent2)) {
            f8951c.a(this);
        } else {
            p0.c(getApplicationContext(), zzahrVar, strB, strE);
        }
        finish();
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f8952a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return J(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza(String str) {
        return zzafb.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(final Uri uri, final String str, ma.b<aa.a> bVar) {
        aa.a aVar = bVar.get();
        (aVar != null ? aVar.a(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return GenericIdpActivity.K(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: ca.j0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity genericIdpActivity = this.f6696a;
                String str2 = str;
                boolean z10 = false;
                if (!(genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzadk.zzb(genericIdpActivity, str2);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    z10 = true;
                }
                if (z10) {
                    androidx.browser.customtabs.c cVarB = new c.d().b();
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    cVarB.b(genericIdpActivity, (Uri) task.getResult());
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str2);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str, Status status) {
        if (status == null) {
            O();
        } else {
            M(status);
        }
    }
}
