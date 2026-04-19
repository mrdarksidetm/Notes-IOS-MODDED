package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8839a;

    private u() {
    }

    /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f8839a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        q9.j.a(this.f8839a, Context.class);
        return new w(this.f8839a, null);
    }
}
