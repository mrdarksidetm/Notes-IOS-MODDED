package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f7823a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7824b = b.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f7825c;

    private b() {
    }

    public static b a() {
        return f7823a;
    }

    public e a(Context context) {
        if (f7825c == null) {
            synchronized (b.class) {
                if (f7825c == null) {
                    f7825c = com.amazon.a.a.a((Application) context.getApplicationContext()) ? new com.amazon.device.iap.internal.c.e() : new com.amazon.device.iap.internal.a.d();
                }
            }
        }
        return f7825c;
    }
}
