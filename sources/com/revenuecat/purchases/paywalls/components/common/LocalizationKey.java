package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class LocalizationKey {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<LocalizationKey> serializer() {
            return LocalizationKey$$serializer.INSTANCE;
        }
    }

    private /* synthetic */ LocalizationKey(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LocalizationKey m61boximpl(String str) {
        return new LocalizationKey(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m62constructorimpl(String str) {
        r.f(str, "value");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m63equalsimpl(String str, Object obj) {
        return (obj instanceof LocalizationKey) && r.b(str, ((LocalizationKey) obj).m67unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m64equalsimpl0(String str, String str2) {
        return r.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m65hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m66toStringimpl(String str) {
        return "LocalizationKey(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m63equalsimpl(this.value, obj);
    }

    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m65hashCodeimpl(this.value);
    }

    public String toString() {
        return m66toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m67unboximpl() {
        return this.value;
    }
}
