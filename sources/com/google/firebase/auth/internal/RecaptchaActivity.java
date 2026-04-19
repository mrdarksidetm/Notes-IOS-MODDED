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
import ca.v1;
import ca.x1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.internal.p002firebaseauthapi.zzadl;
import com.google.android.gms.internal.p002firebaseauthapi.zzadx;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import e9.h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import x9.f;

/* JADX INFO: loaded from: classes2.dex */
public class RecaptchaActivity extends o implements zzadl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f8953b = "RecaptchaActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f8954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h1 f8955d = h1.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8956a = false;

    private final Uri.Builder J(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f fVarO = f.o(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarO);
        v1.c().d(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strB = x1.a(getApplicationContext(), fVarO.r()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e(f8953b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            L(t.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m()) ? firebaseAuth.m() : zzadx.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        return builder;
    }

    static /* synthetic */ Uri K(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            z9.a aVar = (z9.a) task.getResult();
            if (aVar.a() != null) {
                Log.w(f8953b, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar.a()));
            }
            builderBuildUpon.fragment("fac=" + aVar.b());
        } else {
            Log.e(f8953b, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }

    private final void L(Status status) {
        f8954c = 0L;
        this.f8956a = false;
        Intent intent = new Intent();
        f1.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        N(intent);
        f8955d.a(this);
        finish();
    }

    private final boolean N(Intent intent) {
        return t4.a.b(this).d(intent);
    }

    private final void O() {
        f8954c = 0L;
        this.f8956a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        N(intent);
        f8955d.a(this);
        finish();
    }

    final /* synthetic */ void M(String str, Task task) {
        boolean z10 = false;
        if (!(getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
            Log.e(f8953b, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzadk.zzb(this, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            androidx.browser.customtabs.c cVarB = new c.d().b();
            cVarB.f2017a.addFlags(1073741824);
            cVarB.f2017a.addFlags(268435456);
            cVarB.b(this, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f8953b, "Could not do operation - unknown action: " + action);
            O();
            return;
        }
        long jA = e9.f.b().a();
        if (jA - f8954c < 30000) {
            Log.e(f8953b, "Could not start operation - already in progress");
            return;
        }
        f8954c = jA;
        if (bundle != null) {
            this.f8956a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
            if (this.f8956a) {
                O();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(e9.a.a(this, packageName)).toLowerCase(Locale.US);
                f fVarO = f.o(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarO);
                if (zzafb.zza(fVarO)) {
                    zza(J(Uri.parse(zzafb.zza(fVarO.q().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.v0());
                } else {
                    new zzadj(packageName, lowerCase, intent, fVarO, this).executeOnExecutor(firebaseAuth.A0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f8953b, "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzadk.zzb(this, packageName);
            }
            this.f8956a = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            L(f1.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            O();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String strG = v1.c().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(strG)) {
            Log.e(f8953b, "Failed to find registration for this event - failing to prevent session injection.");
            L(t.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = x1.a(getApplicationContext(), f.o(strG).r()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f8954c = 0L;
        this.f8956a = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (N(intent3)) {
            f8955d.a(this);
        } else {
            p0.f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f8956a);
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
            zzadl.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(final Uri uri, final String str, ma.b<aa.a> bVar) {
        aa.a aVar = bVar.get();
        (aVar != null ? aVar.a(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return RecaptchaActivity.K(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f8959a.M(str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str, Status status) {
        if (status == null) {
            O();
        } else {
            L(status);
        }
    }
}
