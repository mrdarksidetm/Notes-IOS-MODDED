package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import r8.q;
import v8.l;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.google.android.gms.common.api.d<GoogleSignInOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f8365a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f8366b = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, l8.a.f14777b, googleSignInOptions, (l) new v8.a());
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, l8.a.f14777b, googleSignInOptions, new d.a.C0176a().c(new v8.a()).a());
    }

    private final synchronized int f() {
        int i10;
        i10 = f8366b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            t8.g gVarM = t8.g.m();
            int iH = gVarM.h(applicationContext, 12451000);
            if (iH == 0) {
                f8366b = 4;
                i10 = 4;
            } else if (gVarM.b(applicationContext, iH, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f8366b = 2;
                i10 = 2;
            } else {
                f8366b = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    public Intent c() {
        Context applicationContext = getApplicationContext();
        int iF = f();
        int i10 = iF - 1;
        if (iF != 0) {
            return i10 != 2 ? i10 != 3 ? q.b(applicationContext, getApiOptions()) : q.c(applicationContext, getApiOptions()) : q.a(applicationContext, getApiOptions());
        }
        throw null;
    }

    public Task<Void> d() {
        return w8.l.b(q.f(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }

    public Task<GoogleSignInAccount> e() {
        return w8.l.a(q.e(asGoogleApiClient(), getApplicationContext(), getApiOptions(), f() == 3), f8365a);
    }

    public Task<Void> signOut() {
        return w8.l.b(q.g(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }
}
