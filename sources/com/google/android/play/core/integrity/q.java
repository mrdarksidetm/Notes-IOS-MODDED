package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8832a;

    private q() {
    }

    /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f8832a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        q9.j.a(this.f8832a, Context.class);
        return new s(this.f8832a, null);
    }
}
