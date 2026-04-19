package com.google.firebase.auth;

import ba.o0;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes2.dex */
final class k extends b.AbstractC0181b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b.AbstractC0181b f8965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8966b;

    k(FirebaseAuth firebaseAuth, b.AbstractC0181b abstractC0181b) {
        this.f8965a = abstractC0181b;
        this.f8966b = firebaseAuth;
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onCodeSent(String str, b.a aVar) {
        this.f8965a.onVerificationCompleted(b.a(str, (String) w8.m.k(this.f8966b.f8889g.e())));
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationCompleted(o0 o0Var) {
        this.f8965a.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.b.AbstractC0181b
    public final void onVerificationFailed(x9.l lVar) {
        this.f8965a.onVerificationFailed(lVar);
    }
}
