package com.revenuecat.purchases;

import ae.j;
import ae.r;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map<String, PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        r.f(map, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = map;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z10;
        this.firstTimeInForeground = z11;
    }

    public /* synthetic */ PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? r0.e() : map, (i10 & 4) == 0 ? productChangeCallback : null, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i10 & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i10 & 8) != 0) {
            z10 = purchasesState.appInBackground;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map2, productChangeCallback2, z12, z11);
    }

    public final Boolean component1() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    public final ProductChangeCallback component3() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final boolean component5() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        r.f(map, "purchaseCallbacksByProductId");
        return new PurchasesState(bool, map, productChangeCallback, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) obj;
        return r.b(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && r.b(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && r.b(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.purchaseCallbacksByProductId.hashCode()) * 31;
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        int iHashCode2 = (iHashCode + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31;
        boolean z10 = this.appInBackground;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode2 + r12) * 31;
        boolean z11 = this.firstTimeInForeground;
        return i10 + (z11 ? 1 : z11);
    }

    public String toString() {
        return "PurchasesState(allowSharingPlayStoreAccount=" + this.allowSharingPlayStoreAccount + ", purchaseCallbacksByProductId=" + this.purchaseCallbacksByProductId + ", deprecatedProductChangeCallback=" + this.deprecatedProductChangeCallback + ", appInBackground=" + this.appInBackground + ", firstTimeInForeground=" + this.firstTimeInForeground + ')';
    }
}
