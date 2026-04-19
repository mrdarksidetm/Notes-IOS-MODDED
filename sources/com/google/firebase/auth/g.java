package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8943b;

    g(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f8942a = bVar;
        this.f8943b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8942a.a(this.f8943b);
    }
}
