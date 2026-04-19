package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f8833a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.k f8834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.k f8835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.k f8836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.k f8837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q9.k f8838f;

    /* synthetic */ s(Context context, r rVar) {
        q9.h hVarB = q9.i.b(context);
        this.f8834b = hVarB;
        q9.k kVarB = q9.g.b(ac.f8724a);
        this.f8835c = kVarB;
        au auVar = new au(hVarB, l.f8826a);
        this.f8836d = auVar;
        q9.k kVarB2 = q9.g.b(new al(hVarB, kVarB, auVar, l.f8826a));
        this.f8837e = kVarB2;
        this.f8838f = q9.g.b(new ab(kVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f8838f.a();
    }
}
