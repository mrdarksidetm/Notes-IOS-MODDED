package com.revenuecat.purchases.hybridcommon;

import ae.r;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorContainer {
    private final int code;
    private final Map<String, Object> info;
    private final String message;

    public ErrorContainer(int i10, String str, Map<String, ? extends Object> map) {
        r.f(str, "message");
        r.f(map, "info");
        this.code = i10;
        this.message = str;
        this.info = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorContainer copy$default(ErrorContainer errorContainer, int i10, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorContainer.code;
        }
        if ((i11 & 2) != 0) {
            str = errorContainer.message;
        }
        if ((i11 & 4) != 0) {
            map = errorContainer.info;
        }
        return errorContainer.copy(i10, str, map);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map<String, Object> component3() {
        return this.info;
    }

    public final ErrorContainer copy(int i10, String str, Map<String, ? extends Object> map) {
        r.f(str, "message");
        r.f(map, "info");
        return new ErrorContainer(i10, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorContainer)) {
            return false;
        }
        ErrorContainer errorContainer = (ErrorContainer) obj;
        return this.code == errorContainer.code && r.b(this.message, errorContainer.message) && r.b(this.info, errorContainer.info);
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.info.hashCode();
    }

    public String toString() {
        return "ErrorContainer(code=" + this.code + ", message=" + this.message + ", info=" + this.info + ')';
    }
}
