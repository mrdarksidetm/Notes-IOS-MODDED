package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleInstallmentsInfo implements InstallmentsInfo {
    private final int commitmentPaymentsCount;
    private final int renewalCommitmentPaymentsCount;

    public GoogleInstallmentsInfo(int i10, int i11) {
        this.commitmentPaymentsCount = i10;
        this.renewalCommitmentPaymentsCount = i11;
    }

    public static /* synthetic */ GoogleInstallmentsInfo copy$default(GoogleInstallmentsInfo googleInstallmentsInfo, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = googleInstallmentsInfo.commitmentPaymentsCount;
        }
        if ((i12 & 2) != 0) {
            i11 = googleInstallmentsInfo.renewalCommitmentPaymentsCount;
        }
        return googleInstallmentsInfo.copy(i10, i11);
    }

    public final int component1() {
        return this.commitmentPaymentsCount;
    }

    public final int component2() {
        return this.renewalCommitmentPaymentsCount;
    }

    public final GoogleInstallmentsInfo copy(int i10, int i11) {
        return new GoogleInstallmentsInfo(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleInstallmentsInfo)) {
            return false;
        }
        GoogleInstallmentsInfo googleInstallmentsInfo = (GoogleInstallmentsInfo) obj;
        return this.commitmentPaymentsCount == googleInstallmentsInfo.commitmentPaymentsCount && this.renewalCommitmentPaymentsCount == googleInstallmentsInfo.renewalCommitmentPaymentsCount;
    }

    @Override // com.revenuecat.purchases.models.InstallmentsInfo
    public int getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    @Override // com.revenuecat.purchases.models.InstallmentsInfo
    public int getRenewalCommitmentPaymentsCount() {
        return this.renewalCommitmentPaymentsCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.commitmentPaymentsCount) * 31) + Integer.hashCode(this.renewalCommitmentPaymentsCount);
    }

    public String toString() {
        return "GoogleInstallmentsInfo(commitmentPaymentsCount=" + this.commitmentPaymentsCount + ", renewalCommitmentPaymentsCount=" + this.renewalCommitmentPaymentsCount + ')';
    }
}
