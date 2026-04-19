package com.revenuecat.purchases.data;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class LogInResult {
    private final boolean created;
    private final CustomerInfo customerInfo;

    public LogInResult(CustomerInfo customerInfo, boolean z10) {
        r.f(customerInfo, "customerInfo");
        this.customerInfo = customerInfo;
        this.created = z10;
    }

    public static /* synthetic */ LogInResult copy$default(LogInResult logInResult, CustomerInfo customerInfo, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customerInfo = logInResult.customerInfo;
        }
        if ((i10 & 2) != 0) {
            z10 = logInResult.created;
        }
        return logInResult.copy(customerInfo, z10);
    }

    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    public final boolean component2() {
        return this.created;
    }

    public final LogInResult copy(CustomerInfo customerInfo, boolean z10) {
        r.f(customerInfo, "customerInfo");
        return new LogInResult(customerInfo, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogInResult)) {
            return false;
        }
        LogInResult logInResult = (LogInResult) obj;
        return r.b(this.customerInfo, logInResult.customerInfo) && this.created == logInResult.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.customerInfo.hashCode() * 31;
        boolean z10 = this.created;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "LogInResult(customerInfo=" + this.customerInfo + ", created=" + this.created + ')';
    }
}
