package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import java.util.Locale;
import java.util.Map;
import md.i0;
import md.x;
import nd.r0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class LogHandlerWithMapping implements LogHandler {
    private final l<Map<String, String>, i0> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public LogHandlerWithMapping(l<? super Map<String, String>, i0> lVar) {
        r.f(lVar, "callback");
        this.callback = lVar;
    }

    private final void invokeCallback(LogLevel logLevel, String str) {
        l<Map<String, String>, i0> lVar = this.callback;
        String upperCase = logLevel.name().toUpperCase(Locale.ROOT);
        r.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        lVar.invoke(r0.h(x.a("logLevel", upperCase), x.a("message", str)));
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void d(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        invokeCallback(LogLevel.DEBUG, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String str, String str2, Throwable th) {
        r.f(str, "tag");
        r.f(str2, "msg");
        if (th != null) {
            String str3 = str2 + ". Throwable: " + th;
            if (str3 != null) {
                str2 = str3;
            }
        }
        invokeCallback(LogLevel.ERROR, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        invokeCallback(LogLevel.INFO, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        invokeCallback(LogLevel.VERBOSE, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String str, String str2) {
        r.f(str, "tag");
        r.f(str2, "msg");
        invokeCallback(LogLevel.WARN, str2);
    }
}
