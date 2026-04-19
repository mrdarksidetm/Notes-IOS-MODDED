package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8983b;

    s(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f8982a = aVar;
        this.f8983b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8982a.a(this.f8983b);
    }
}
