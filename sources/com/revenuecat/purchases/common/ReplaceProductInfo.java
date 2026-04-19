package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.StoreTransaction;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplaceProductInfo {
    private final StoreTransaction oldPurchase;
    private final ReplacementMode replacementMode;

    public ReplaceProductInfo(StoreTransaction storeTransaction, ReplacementMode replacementMode) {
        r.f(storeTransaction, "oldPurchase");
        this.oldPurchase = storeTransaction;
        this.replacementMode = replacementMode;
    }

    public /* synthetic */ ReplaceProductInfo(StoreTransaction storeTransaction, ReplacementMode replacementMode, int i10, j jVar) {
        this(storeTransaction, (i10 & 2) != 0 ? null : replacementMode);
    }

    public static /* synthetic */ ReplaceProductInfo copy$default(ReplaceProductInfo replaceProductInfo, StoreTransaction storeTransaction, ReplacementMode replacementMode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeTransaction = replaceProductInfo.oldPurchase;
        }
        if ((i10 & 2) != 0) {
            replacementMode = replaceProductInfo.replacementMode;
        }
        return replaceProductInfo.copy(storeTransaction, replacementMode);
    }

    public final StoreTransaction component1() {
        return this.oldPurchase;
    }

    public final ReplacementMode component2() {
        return this.replacementMode;
    }

    public final ReplaceProductInfo copy(StoreTransaction storeTransaction, ReplacementMode replacementMode) {
        r.f(storeTransaction, "oldPurchase");
        return new ReplaceProductInfo(storeTransaction, replacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceProductInfo)) {
            return false;
        }
        ReplaceProductInfo replaceProductInfo = (ReplaceProductInfo) obj;
        return r.b(this.oldPurchase, replaceProductInfo.oldPurchase) && r.b(this.replacementMode, replaceProductInfo.replacementMode);
    }

    public final StoreTransaction getOldPurchase() {
        return this.oldPurchase;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        int iHashCode = this.oldPurchase.hashCode() * 31;
        ReplacementMode replacementMode = this.replacementMode;
        return iHashCode + (replacementMode == null ? 0 : replacementMode.hashCode());
    }

    public String toString() {
        return "ReplaceProductInfo(oldPurchase=" + this.oldPurchase + ", replacementMode=" + this.replacementMode + ')';
    }
}
