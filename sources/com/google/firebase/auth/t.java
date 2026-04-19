package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ na.b f8985b;

    t(FirebaseAuth firebaseAuth, na.b bVar) {
        this.f8984a = firebaseAuth;
        this.f8985b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f8984a.f8885c.iterator();
        while (it.hasNext()) {
            ((ca.a) it.next()).a(this.f8985b);
        }
        Iterator it2 = this.f8984a.f8884b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f8984a);
        }
    }
}
