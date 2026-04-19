package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ca.r0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class o extends r0<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f8976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ba.e f8977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8978c;

    o(FirebaseAuth firebaseAuth, String str, ba.e eVar) {
        this.f8976a = str;
        this.f8977b = eVar;
        this.f8978c = firebaseAuth;
    }

    @Override // ca.r0
    public final Task<Void> d(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f8976a;
            sb2 = new StringBuilder("Password reset request ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f8976a;
            sb2 = new StringBuilder("Got reCAPTCHA token for password reset of email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        return this.f8978c.f8887e.zza(this.f8978c.f8883a, this.f8976a, this.f8977b, this.f8978c.f8893k, str);
    }
}
