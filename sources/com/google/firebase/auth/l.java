package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ca.r0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;

/* JADX INFO: loaded from: classes2.dex */
final class l extends r0<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f8967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f8968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8969c;

    l(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f8967a = str;
        this.f8968b = str2;
        this.f8969c = firebaseAuth;
    }

    @Override // ca.r0
    public final Task<ba.i> d(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f8967a;
            sb2 = new StringBuilder("Creating user with ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f8967a;
            sb2 = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        return this.f8969c.f8887e.zza(this.f8969c.f8883a, this.f8967a, this.f8968b, this.f8969c.f8893k, str, this.f8969c.new c());
    }
}
