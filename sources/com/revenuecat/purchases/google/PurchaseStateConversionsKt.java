package com.revenuecat.purchases.google;

import ae.r;
import com.revenuecat.purchases.models.PurchaseState;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseStateConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(PurchaseState purchaseState) {
        r.f(purchaseState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new q();
    }

    public static final PurchaseState toRevenueCatPurchaseState(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return PurchaseState.PURCHASED;
            }
            if (i10 == 2) {
                return PurchaseState.PENDING;
            }
        }
        return PurchaseState.UNSPECIFIED_STATE;
    }
}
