package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ba.a0;
import ca.g1;
import ca.o1;
import ca.r0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;

/* JADX INFO: loaded from: classes2.dex */
final class d extends r0<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f8933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a0 f8934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ba.j f8935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8936d;

    d(FirebaseAuth firebaseAuth, boolean z10, a0 a0Var, ba.j jVar) {
        this.f8933a = z10;
        this.f8934b = a0Var;
        this.f8935c = jVar;
        this.f8936d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // ca.r0
    public final Task<ba.i> d(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        return this.f8933a ? this.f8936d.f8887e.zzb(this.f8936d.f8883a, (a0) w8.m.k(this.f8934b), this.f8935c, str, (g1) this.f8936d.new d()) : this.f8936d.f8887e.zza(this.f8936d.f8883a, this.f8935c, str, (o1) this.f8936d.new c());
    }
}
