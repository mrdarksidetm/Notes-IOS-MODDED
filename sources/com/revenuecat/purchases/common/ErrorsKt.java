package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import md.q;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackendErrorCode.values().length];
            try {
                iArr[BackendErrorCode.BackendStoreProblem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackendErrorCode.BackendCannotTransferPurchase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidReceiptToken.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPlayStoreCredentials.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAuthToken.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAPIKey.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPaymentModeOrIntroPriceNotProvided.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BackendErrorCode.BackendProductIdForGoogleReceiptNotProvided.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BackendErrorCode.BackendEmptyAppUserId.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreQuotaExceeded.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreInvalidPackageName.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidPlatform.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BackendErrorCode.BackendPlayStoreGenericError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BackendErrorCode.BackendUserIneligibleForPromoOffer.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidSubscriberAttributes.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidSubscriberAttributesBody.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAppStoreSharedSecret.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidAppleSubscriptionKey.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BackendErrorCode.BackendBadRequest.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BackendErrorCode.BackendInternalServerError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BackendErrorCode.BackendProductIDsMalformed.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BackendErrorCode.BackendInvalidWebRedemptionToken.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BackendErrorCode.BackendPurchaseBelongsToOtherUser.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BackendErrorCode.BackendExpiredWebRedemptionToken.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final PurchasesError toPurchasesError(BackendErrorCode backendErrorCode, String str) {
        return new PurchasesError(toPurchasesErrorCode(backendErrorCode), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.revenuecat.purchases.PurchasesError toPurchasesError(com.revenuecat.purchases.common.networking.HTTPResult r5) {
        /*
            java.lang.String r0 = "<this>"
            ae.r.f(r5, r0)
            java.lang.Integer r0 = r5.getBackendErrorCode()
            java.lang.String r5 = r5.getBackendErrorMessage()
            if (r5 != 0) goto L11
            java.lang.String r5 = ""
        L11:
            if (r0 == 0) goto L25
            int r1 = r0.intValue()
            com.revenuecat.purchases.common.BackendErrorCode$Companion r2 = com.revenuecat.purchases.common.BackendErrorCode.Companion
            com.revenuecat.purchases.common.BackendErrorCode r1 = r2.valueOf(r1)
            if (r1 == 0) goto L25
            com.revenuecat.purchases.PurchasesError r1 = toPurchasesError(r1, r5)
            if (r1 != 0) goto L49
        L25:
            com.revenuecat.purchases.PurchasesError r1 = new com.revenuecat.purchases.PurchasesError
            com.revenuecat.purchases.PurchasesErrorCode r2 = com.revenuecat.purchases.PurchasesErrorCode.UnknownBackendError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Backend Code: "
            r3.append(r4)
            if (r0 != 0) goto L37
            java.lang.String r0 = "N/A"
        L37:
            r3.append(r0)
            java.lang.String r0 = " - "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r2, r5)
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(com.revenuecat.purchases.common.networking.HTTPResult):com.revenuecat.purchases.PurchasesError");
    }

    public static final PurchasesError toPurchasesError(Exception exc) {
        r.f(exc, "<this>");
        return exc instanceof JSONException ? true : exc instanceof IOException ? new PurchasesError(PurchasesErrorCode.NetworkError, exc.getLocalizedMessage()) : exc instanceof SecurityException ? new PurchasesError(PurchasesErrorCode.InsufficientPermissionsError, ((SecurityException) exc).getLocalizedMessage()) : exc instanceof SignatureVerificationException ? new PurchasesError(PurchasesErrorCode.SignatureVerificationError, ((SignatureVerificationException) exc).getLocalizedMessage()) : new PurchasesError(PurchasesErrorCode.UnknownError, exc.getLocalizedMessage());
    }

    private static final PurchasesErrorCode toPurchasesErrorCode(BackendErrorCode backendErrorCode) {
        switch (WhenMappings.$EnumSwitchMapping$0[backendErrorCode.ordinal()]) {
            case 1:
            case 10:
            case 13:
                return PurchasesErrorCode.StoreProblemError;
            case 2:
                return PurchasesErrorCode.ReceiptAlreadyInUseError;
            case 3:
                return PurchasesErrorCode.InvalidReceiptError;
            case 4:
            case 5:
            case 6:
                return PurchasesErrorCode.InvalidCredentialsError;
            case 7:
            case 8:
            case 22:
            case 24:
                return PurchasesErrorCode.PurchaseInvalidError;
            case 9:
                return PurchasesErrorCode.InvalidAppUserIdError;
            case 11:
            case 12:
                return PurchasesErrorCode.ConfigurationError;
            case 14:
                return PurchasesErrorCode.IneligibleError;
            case 15:
            case 16:
                return PurchasesErrorCode.InvalidSubscriberAttributesError;
            case 17:
            case 18:
            case 19:
            case 20:
                return PurchasesErrorCode.UnexpectedBackendResponseError;
            case 21:
                return PurchasesErrorCode.UnsupportedError;
            case 23:
                return PurchasesErrorCode.ProductAlreadyPurchasedError;
            default:
                throw new q();
        }
    }
}
