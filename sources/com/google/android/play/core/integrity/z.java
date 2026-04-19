package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f8852a;

    static synchronized s a(Context context) {
        if (f8852a == null) {
            q qVar = new q(null);
            qVar.a(q9.d.a(context));
            f8852a = qVar.b();
        }
        return f8852a;
    }
}
