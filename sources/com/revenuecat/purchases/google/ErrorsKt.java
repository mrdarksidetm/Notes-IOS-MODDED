package com.revenuecat.purchases.google;

import ae.r;
import com.android.billingclient.api.a;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorsKt {
    public static final String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";

    public static final PurchasesError billingResponseToPurchasesError(int i10, String str) {
        PurchasesErrorCode purchasesErrorCode;
        r.f(str, "underlyingErrorMessage");
        if (i10 != 12) {
            switch (i10) {
                case -3:
                case -1:
                case 2:
                case 6:
                    purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                    break;
                case -2:
                case 3:
                case 8:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseNotAllowedError;
                    break;
                case 0:
                default:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
                case 1:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseCancelledError;
                    break;
                case 4:
                    purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                    break;
                case 5:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                    break;
                case 7:
                    purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
                    break;
            }
        } else {
            purchasesErrorCode = PurchasesErrorCode.NetworkError;
        }
        return new PurchasesError(purchasesErrorCode, str);
    }

    public static final String getBillingResponseCodeName(int i10) {
        Field field;
        Field[] declaredFields = a.InterfaceC0173a.class.getDeclaredFields();
        r.e(declaredFields, "allPossibleBillingResponseCodes");
        int length = declaredFields.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i11];
            if (field.getInt(field) == i10) {
                break;
            }
            i11++;
        }
        String name = field != null ? field.getName() : null;
        return name == null ? String.valueOf(i10) : name;
    }
}
