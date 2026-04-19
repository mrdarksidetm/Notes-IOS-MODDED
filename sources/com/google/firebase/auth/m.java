package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ba.a0;
import ca.g1;
import ca.r0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.d;

/* JADX INFO: loaded from: classes2.dex */
final class m extends r0<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f8970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ba.j f8971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8972c;

    m(FirebaseAuth firebaseAuth, a0 a0Var, ba.j jVar) {
        this.f8970a = a0Var;
        this.f8971b = jVar;
        this.f8972c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    @Override // ca.r0
    public final Task<ba.i> d(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        return this.f8972c.f8887e.zza(this.f8972c.f8883a, this.f8970a, (ba.h) this.f8971b, str, (g1) this.f8972c.new d());
    }
}
