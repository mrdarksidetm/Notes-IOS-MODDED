package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ba.o0;
import ca.m1;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes2.dex */
final class j extends b.AbstractC0181b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f8961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ m1 f8962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ b.AbstractC0181b f8963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8964d;

    j(FirebaseAuth firebaseAuth, a aVar, m1 m1Var, b.AbstractC0181b abstractC0181b) {
        this.f8961a = aVar;
        this.f8962b = m1Var;
        this.f8963c = abstractC0181b;
        this.f8964d = firebaseAuth;
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f8963c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeSent(String str, b.a aVar) {
        this.f8963c.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationCompleted(o0 o0Var) {
        this.f8963c.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationFailed(x9.l lVar) {
        if (zzadg.zza(lVar)) {
            this.f8961a.b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f8961a.j());
            FirebaseAuth.i0(this.f8961a);
            return;
        }
        if (TextUtils.isEmpty(this.f8962b.c())) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f8961a.j() + ", error - " + lVar.getMessage());
            this.f8963c.onVerificationFailed(lVar);
            return;
        }
        if (zzadg.zzb(lVar) && this.f8964d.m0().d("PHONE_PROVIDER") && TextUtils.isEmpty(this.f8962b.b())) {
            this.f8961a.d(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.f8961a.j());
            FirebaseAuth.i0(this.f8961a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.f8961a.j() + ", error - " + lVar.getMessage());
        this.f8963c.onVerificationFailed(lVar);
    }
}
