package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f8527a;

    t(u uVar) {
        this.f8527a = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f8527a.f8530a;
        vVar.f8536b.disconnect(vVar.f8536b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
