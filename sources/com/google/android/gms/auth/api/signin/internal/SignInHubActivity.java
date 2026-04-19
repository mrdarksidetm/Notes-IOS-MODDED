package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f8369f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8370a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SignInConfiguration f8371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Intent f8374e;

    private final void L() {
        getSupportLoaderManager().c(0, null, new a(this, null));
        f8369f = false;
    }

    private final void M(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f8369f = false;
    }

    private final void N(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f8371b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f8370a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            M(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f8370a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.u() != null) {
                GoogleSignInAccount googleSignInAccountU = signInAccount.u();
                r rVarC = r.c(this);
                GoogleSignInOptions googleSignInOptionsU = this.f8371b.u();
                googleSignInAccountU.getClass();
                rVarC.e(googleSignInOptionsU, googleSignInAccountU);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountU);
                this.f8372c = true;
                this.f8373d = i11;
                this.f8374e = intent;
                L();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                M(intExtra);
                return;
            }
        }
        M(8);
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            M(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f8371b = signInConfiguration;
        if (bundle == null) {
            if (f8369f) {
                setResult(0);
                M(12502);
                return;
            } else {
                f8369f = true;
                N(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f8372c = z10;
        if (z10) {
            this.f8373d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f8374e = intent2;
            L();
        }
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f8369f = false;
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f8372c);
        if (this.f8372c) {
            bundle.putInt("signInResultCode", this.f8373d);
            bundle.putParcelable("signInResultData", this.f8374e);
        }
    }
}
