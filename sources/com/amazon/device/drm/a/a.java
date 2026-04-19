package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f7725a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f7726b;

    private a() {
    }

    public static a a() {
        return f7725a;
    }

    public c a(Context context) {
        if (f7726b == null) {
            synchronized (a.class) {
                if (f7726b == null) {
                    f7726b = com.amazon.a.a.a((Application) context.getApplicationContext()) ? new com.amazon.device.drm.a.d.c() : new com.amazon.device.drm.a.b.c();
                }
            }
        }
        return f7726b;
    }
}
