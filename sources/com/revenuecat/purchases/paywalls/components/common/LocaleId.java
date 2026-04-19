package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class LocaleId {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<LocaleId> serializer() {
            return LocaleId$$serializer.INSTANCE;
        }
    }

    private /* synthetic */ LocaleId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LocaleId m34boximpl(String str) {
        return new LocaleId(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m35constructorimpl(String str) {
        r.f(str, "value");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m36equalsimpl(String str, Object obj) {
        return (obj instanceof LocaleId) && r.b(str, ((LocaleId) obj).m40unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m37equalsimpl0(String str, String str2) {
        return r.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m38hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m39toStringimpl(String str) {
        return "LocaleId(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m36equalsimpl(this.value, obj);
    }

    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m38hashCodeimpl(this.value);
    }

    public String toString() {
        return m39toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m40unboximpl() {
        return this.value;
    }
}
