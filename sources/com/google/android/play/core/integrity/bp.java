package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bp implements q9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.k f8810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.k f8811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.k f8812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.k f8813d;

    public bp(q9.k kVar, q9.k kVar2, q9.k kVar3, q9.k kVar4) {
        this.f8810a = kVar;
        this.f8811b = kVar2;
        this.f8812c = kVar3;
        this.f8813d = kVar4;
    }

    @Override // q9.k
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f8810a.a(), (q9.y) this.f8811b.a(), ((au) this.f8812c).a(), new j());
    }
}
