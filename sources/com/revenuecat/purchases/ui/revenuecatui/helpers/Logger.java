package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    private static final String TAG = "RevenueCatUI";

    private Logger() {
    }

    public final void d(String str) {
        r.f(str, "message");
        Log.d(TAG, str);
    }

    public final void e(String str) {
        r.f(str, "message");
        Log.e(TAG, str);
    }

    public final void e(String str, Throwable th) {
        r.f(str, "message");
        r.f(th, "throwable");
        Log.e(TAG, str, th);
    }

    public final void i(String str) {
        r.f(str, "message");
        Log.i(TAG, str);
    }

    public final void w(String str) {
        r.f(str, "message");
        Log.w(TAG, str);
    }
}
