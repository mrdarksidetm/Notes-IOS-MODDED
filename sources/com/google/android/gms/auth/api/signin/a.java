package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import r8.q;
import r8.r;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) m.k(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.c(context).a();
    }

    public static Task<GoogleSignInAccount> c(Intent intent) {
        q8.b bVarD = q.d(intent);
        GoogleSignInAccount googleSignInAccountA = bVarD.a();
        return (!bVarD.getStatus().B() || googleSignInAccountA == null) ? Tasks.forException(w8.a.a(bVarD.getStatus())) : Tasks.forResult(googleSignInAccountA);
    }

    public static boolean d(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.z().containsAll(hashSet);
    }

    public static void e(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        m.l(activity, "Please provide a non-null Activity");
        m.l(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(f(activity, googleSignInAccount, scopeArr), i10);
    }

    private static Intent f(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.f(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.t())) {
            aVar.h((String) m.k(googleSignInAccount.t()));
        }
        return new b(activity, aVar.a()).c();
    }
}
