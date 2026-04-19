package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes2.dex */
public final class GetBillingConfigUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z10) {
        this.appInBackground = z10;
    }

    public static /* synthetic */ GetBillingConfigUseCaseParams copy$default(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = getBillingConfigUseCaseParams.appInBackground;
        }
        return getBillingConfigUseCaseParams.copy(z10);
    }

    public final boolean component1() {
        return this.appInBackground;
    }

    public final GetBillingConfigUseCaseParams copy(boolean z10) {
        return new GetBillingConfigUseCaseParams(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBillingConfigUseCaseParams) && this.appInBackground == ((GetBillingConfigUseCaseParams) obj).appInBackground;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        boolean z10 = this.appInBackground;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return "GetBillingConfigUseCaseParams(appInBackground=" + this.appInBackground + ')';
    }
}
