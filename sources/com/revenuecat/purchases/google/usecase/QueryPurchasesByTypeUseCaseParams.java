package com.revenuecat.purchases.google.usecase;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesByTypeUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final String productType;

    public QueryPurchasesByTypeUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z10, String str) {
        r.f(dateProvider, "dateProvider");
        r.f(str, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z10;
        this.productType = str;
    }

    public /* synthetic */ QueryPurchasesByTypeUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z10, String str, int i10, j jVar) {
        this((i10 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, z10, str);
    }

    public static /* synthetic */ QueryPurchasesByTypeUseCaseParams copy$default(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateProvider = queryPurchasesByTypeUseCaseParams.dateProvider;
        }
        if ((i10 & 2) != 0) {
            diagnosticsTracker = queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i10 & 4) != 0) {
            z10 = queryPurchasesByTypeUseCaseParams.appInBackground;
        }
        if ((i10 & 8) != 0) {
            str = queryPurchasesByTypeUseCaseParams.productType;
        }
        return queryPurchasesByTypeUseCaseParams.copy(dateProvider, diagnosticsTracker, z10, str);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final boolean component3() {
        return this.appInBackground;
    }

    public final String component4() {
        return this.productType;
    }

    public final QueryPurchasesByTypeUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z10, String str) {
        r.f(dateProvider, "dateProvider");
        r.f(str, "productType");
        return new QueryPurchasesByTypeUseCaseParams(dateProvider, diagnosticsTracker, z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchasesByTypeUseCaseParams)) {
            return false;
        }
        QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams = (QueryPurchasesByTypeUseCaseParams) obj;
        return r.b(this.dateProvider, queryPurchasesByTypeUseCaseParams.dateProvider) && r.b(this.diagnosticsTrackerIfEnabled, queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesByTypeUseCaseParams.appInBackground && r.b(this.productType, queryPurchasesByTypeUseCaseParams.productType);
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final String getProductType() {
        return this.productType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iHashCode2 = (iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31;
        boolean z10 = this.appInBackground;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((iHashCode2 + r12) * 31) + this.productType.hashCode();
    }

    public String toString() {
        return "QueryPurchasesByTypeUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", appInBackground=" + this.appInBackground + ", productType=" + this.productType + ')';
    }
}
