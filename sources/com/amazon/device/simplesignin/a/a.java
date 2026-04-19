package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7907a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f7908b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f7909c;

    private a() {
    }

    static a a() {
        return f7908b;
    }

    b a(Context context) {
        String str;
        String str2;
        if (f7909c == null) {
            synchronized (a.class) {
                if (f7909c == null) {
                    if (b(context)) {
                        f7909c = new com.amazon.device.simplesignin.a.c.b();
                        str = f7907a;
                        str2 = "SDK initialized in Sandbox mode.";
                    } else {
                        f7909c = new com.amazon.device.simplesignin.a.a.b();
                        str = f7907a;
                        str2 = "SDK initialized in Production mode.";
                    }
                    com.amazon.device.simplesignin.a.d.a.a(str, str2);
                }
            }
        }
        return f7909c;
    }

    boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }
}
