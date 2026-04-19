package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f8840a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.k f8841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.k f8842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.k f8843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.k f8844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q9.k f8845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q9.k f8846g;

    /* synthetic */ w(Context context, v vVar) {
        q9.h hVarB = q9.i.b(context);
        this.f8841b = hVarB;
        q9.k kVarB = q9.g.b(bb.f8777a);
        this.f8842c = kVarB;
        au auVar = new au(hVarB, n.f8831a);
        this.f8843d = auVar;
        q9.k kVarB2 = q9.g.b(new bp(hVarB, kVarB, auVar, n.f8831a));
        this.f8844e = kVarB2;
        q9.k kVarB3 = q9.g.b(new bu(kVarB2));
        this.f8845f = kVarB3;
        this.f8846g = q9.g.b(new ba(kVarB2, kVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f8846g.a();
    }
}
