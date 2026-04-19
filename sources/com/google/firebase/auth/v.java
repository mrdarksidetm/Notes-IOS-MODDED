package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8987a;

    v(FirebaseAuth firebaseAuth) {
        this.f8987a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f8987a.f8886d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f8987a);
        }
    }
}
