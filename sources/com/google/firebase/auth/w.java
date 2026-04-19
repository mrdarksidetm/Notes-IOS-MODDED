package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ba.a0;
import ca.r0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;

/* JADX INFO: loaded from: classes2.dex */
final class w extends r0<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f8988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f8989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a0 f8990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f8991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f8992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8993f;

    w(FirebaseAuth firebaseAuth, String str, boolean z10, a0 a0Var, String str2, String str3) {
        this.f8988a = str;
        this.f8989b = z10;
        this.f8990c = a0Var;
        this.f8991d = str2;
        this.f8992e = str3;
        this.f8993f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // ca.r0
    public final Task<ba.i> d(String str) {
        String str2;
        StringBuilder sb2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f8988a;
            sb2 = new StringBuilder("Logging in as ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f8988a;
            sb2 = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        return this.f8989b ? this.f8993f.f8887e.zzb(this.f8993f.f8883a, (a0) w8.m.k(this.f8990c), this.f8988a, this.f8991d, this.f8992e, str, this.f8993f.new d()) : this.f8993f.f8887e.zzb(this.f8993f.f8883a, this.f8988a, this.f8991d, this.f8992e, str, this.f8993f.new c());
    }
}
