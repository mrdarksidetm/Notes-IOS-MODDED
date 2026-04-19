package r8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z8.a f19231a = new z8.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f19231a.a("getFallbackSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentC;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f19231a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentC;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f19231a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static q8.b d(Intent intent) {
        if (intent == null) {
            return new q8.b(null, Status.f8387h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new q8.b(googleSignInAccount, Status.f8385f);
        }
        if (status == null) {
            status = Status.f8387h;
        }
        return new q8.b(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u8.c e(com.google.android.gms.common.api.e r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            z8.a r0 = r8.q.f19231a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.a(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "getEligibleSavedSignInResult()"
            r0.a(r3, r2)
            w8.m.k(r8)
            r8.r r2 = r8.r.c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.b()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.r()
            android.accounts.Account r5 = r8.r()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.D()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.C()
            if (r4 == 0) goto L59
            boolean r4 = r2.C()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.A()
            java.lang.String r5 = r2.A()
            boolean r4 = w8.k.b(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.z()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.z()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            r8.r r2 = r8.r.c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.a()
            if (r2 == 0) goto L1f
            boolean r4 = r2.E()
            if (r4 != 0) goto L1f
            q8.b r4 = new q8.b
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f8385f
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.a(r8, r7)
            u8.c r6 = u8.e.b(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            q8.b r7 = new q8.b
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            u8.c r6 = u8.e.b(r7, r6)
            return r6
        La9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.a(r1, r9)
            r8.k r9 = new r8.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.b r6 = r6.a(r9)
            v8.i r7 = new v8.i
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.q.e(com.google.android.gms.common.api.e, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):u8.c");
    }

    public static u8.d f(com.google.android.gms.common.api.e eVar, Context context, boolean z10) {
        f19231a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        h(context);
        return z10 ? f.a(strE) : eVar.b(new o(eVar));
    }

    public static u8.d g(com.google.android.gms.common.api.e eVar, Context context, boolean z10) {
        f19231a.a("Signing out", new Object[0]);
        h(context);
        return z10 ? u8.e.c(Status.f8385f, eVar) : eVar.b(new m(eVar));
    }

    private static void h(Context context) {
        r.c(context).d();
        Iterator<com.google.android.gms.common.api.e> it = com.google.android.gms.common.api.e.c().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        com.google.android.gms.common.api.internal.c.a();
    }
}
