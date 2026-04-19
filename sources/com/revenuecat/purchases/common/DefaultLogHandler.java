package com.revenuecat.purchases.common;

import ae.r;
import android.util.Log;
import com.revenuecat.purchases.LogHandler;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultLogHandler implements LogHandler {
    @Override // com.revenuecat.purchases.LogHandler
    public void d(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        Log.d(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String str, String str2, Throwable th) {
        r.f(str, "tag");
        r.f(str2, "msg");
        if (th != null) {
            Log.e(str, str2, th);
        } else {
            Log.e(str, str2);
        }
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        Log.i(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        Log.v(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        Log.w(str, str2);
    }
}
