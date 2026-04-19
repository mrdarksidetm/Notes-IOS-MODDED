package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class DateActive {
    private final boolean inGracePeriod;
    private final boolean isActive;

    public DateActive(boolean z10, boolean z11) {
        this.isActive = z10;
        this.inGracePeriod = z11;
    }

    public static /* synthetic */ DateActive copy$default(DateActive dateActive, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dateActive.isActive;
        }
        if ((i10 & 2) != 0) {
            z11 = dateActive.inGracePeriod;
        }
        return dateActive.copy(z10, z11);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final boolean component2() {
        return this.inGracePeriod;
    }

    public final DateActive copy(boolean z10, boolean z11) {
        return new DateActive(z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateActive)) {
            return false;
        }
        DateActive dateActive = (DateActive) obj;
        return this.isActive == dateActive.isActive && this.inGracePeriod == dateActive.inGracePeriod;
    }

    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z10 = this.isActive;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.inGracePeriod;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "DateActive(isActive=" + this.isActive + ", inGracePeriod=" + this.inGracePeriod + ')';
    }
}
