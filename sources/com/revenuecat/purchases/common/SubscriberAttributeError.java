package com.revenuecat.purchases.common;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributeError {
    private final String keyName;
    private final String message;

    public SubscriberAttributeError(String str, String str2) {
        r.f(str, "keyName");
        r.f(str2, "message");
        this.keyName = str;
        this.message = str2;
    }

    public static /* synthetic */ SubscriberAttributeError copy$default(SubscriberAttributeError subscriberAttributeError, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriberAttributeError.keyName;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriberAttributeError.message;
        }
        return subscriberAttributeError.copy(str, str2);
    }

    public final String component1() {
        return this.keyName;
    }

    public final String component2() {
        return this.message;
    }

    public final SubscriberAttributeError copy(String str, String str2) {
        r.f(str, "keyName");
        r.f(str2, "message");
        return new SubscriberAttributeError(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberAttributeError)) {
            return false;
        }
        SubscriberAttributeError subscriberAttributeError = (SubscriberAttributeError) obj;
        return r.b(this.keyName, subscriberAttributeError.keyName) && r.b(this.message, subscriberAttributeError.message);
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.keyName.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        return "SubscriberAttributeError(keyName=" + this.keyName + ", message=" + this.message + ')';
    }
}
