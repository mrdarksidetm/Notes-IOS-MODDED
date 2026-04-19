package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.LogHandler;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class LogWrapperKt {
    private static LogHandler currentLogHandler = new DefaultLogHandler();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogIntent.values().length];
            try {
                iArr[LogIntent.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogIntent.GOOGLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogIntent.GOOGLE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogIntent.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogIntent.PURCHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogIntent.RC_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogIntent.RC_PURCHASE_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LogIntent.RC_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LogIntent.USER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LogIntent.WARNING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LogIntent.AMAZON_WARNING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LogIntent.AMAZON_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LogHandler getCurrentLogHandler() {
        return currentLogHandler;
    }

    public static final void log(LogIntent logIntent, String str) {
        r.f(logIntent, "intent");
        r.f(str, "message");
        String str2 = c0.h0(logIntent.getEmojiList(), "", null, null, 0, null, null, 62, null) + ' ' + str;
        switch (WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
            case 5:
            case 8:
            case 9:
                LogUtilsKt.debugLog(str2);
                break;
            case 2:
            case 6:
            case 12:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
            case 3:
            case 10:
            case 11:
                LogUtilsKt.warnLog(str2);
                break;
            case 4:
            case 7:
                LogUtilsKt.infoLog(str2);
                break;
        }
    }

    public static final void setCurrentLogHandler(LogHandler logHandler) {
        r.f(logHandler, "<set-?>");
        currentLogHandler = logHandler;
    }
}
