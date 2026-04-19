package com.revenuecat.purchases.common;

import ae.j;

/* JADX INFO: loaded from: classes2.dex */
public enum BackendErrorCode {
    BackendInvalidPlatform(7000),
    BackendStoreProblem(7101),
    BackendCannotTransferPurchase(7102),
    BackendInvalidReceiptToken(7103),
    BackendInvalidAppStoreSharedSecret(7104),
    BackendInvalidPaymentModeOrIntroPriceNotProvided(7105),
    BackendProductIdForGoogleReceiptNotProvided(7106),
    BackendInvalidPlayStoreCredentials(7107),
    BackendInternalServerError(7110),
    BackendEmptyAppUserId(7220),
    BackendInvalidAuthToken(7224),
    BackendInvalidAPIKey(7225),
    BackendBadRequest(7226),
    BackendPlayStoreQuotaExceeded(7229),
    BackendPlayStoreInvalidPackageName(7230),
    BackendPlayStoreGenericError(7231),
    BackendUserIneligibleForPromoOffer(7232),
    BackendInvalidAppleSubscriptionKey(7234),
    BackendInvalidSubscriberAttributes(7263),
    BackendInvalidSubscriberAttributesBody(7264),
    BackendProductIDsMalformed(7662),
    BackendInvalidWebRedemptionToken(7849),
    BackendPurchaseBelongsToOtherUser(7852),
    BackendExpiredWebRedemptionToken(7853);

    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final BackendErrorCode valueOf(int i10) {
            for (BackendErrorCode backendErrorCode : BackendErrorCode.values()) {
                if (backendErrorCode.getValue() == i10) {
                    return backendErrorCode;
                }
            }
            return null;
        }
    }

    BackendErrorCode(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
