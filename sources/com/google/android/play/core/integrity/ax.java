package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f8768a;

    static synchronized aw a(Context context) {
        if (f8768a == null) {
            u uVar = new u(null);
            uVar.a(q9.d.a(context));
            f8768a = uVar.b();
        }
        return f8768a;
    }
}
