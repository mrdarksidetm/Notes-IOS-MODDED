package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ca.r0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class n extends r0<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f8973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ba.e f8974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8975c;

    n(FirebaseAuth firebaseAuth, String str, ba.e eVar) {
        this.f8973a = str;
        this.f8974b = eVar;
        this.f8975c = firebaseAuth;
    }

    @Override // ca.r0
    public final Task<Void> d(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f8973a;
            sb2 = new StringBuilder("Email link sign in for ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f8973a;
            sb2 = new StringBuilder("Got reCAPTCHA token for email link sign in for ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        return this.f8975c.f8887e.zzb(this.f8975c.f8883a, this.f8973a, this.f8974b, this.f8975c.f8893k, str);
    }
}
