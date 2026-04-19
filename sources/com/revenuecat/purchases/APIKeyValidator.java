package com.revenuecat.purchases;

import ae.r;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes2.dex */
public final class APIKeyValidator {

    private enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        LEGACY,
        OTHER_PLATFORM
    }

    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        LEGACY,
        OTHER_PLATFORM
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        return v.G(str, "goog_", false, 2, null) ? APIKeyPlatform.GOOGLE : v.G(str, "amzn_", false, 2, null) ? APIKeyPlatform.AMAZON : !w.K(str, '_', false, 2, null) ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    public final ValidationResult validate(String str, Store store) {
        APIKeyPlatform aPIKeyPlatform;
        r.f(str, "apiKey");
        r.f(store, "configuredStore");
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(str);
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.GOOGLE;
        if ((apiKeyPlatform == aPIKeyPlatform2 && store == Store.PLAY_STORE) || (apiKeyPlatform == (aPIKeyPlatform = APIKeyPlatform.AMAZON) && store == Store.AMAZON)) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        APIKeyPlatform aPIKeyPlatform3 = APIKeyPlatform.OTHER_PLATFORM;
        return ValidationResult.OTHER_PLATFORM;
    }

    public final void validateAndLog(String str, Store store) {
        String str2;
        r.f(str, "apiKey");
        r.f(store, "configuredStore");
        int i10 = WhenMappings.$EnumSwitchMapping$0[validate(str, store).ordinal()];
        if (i10 == 1) {
            str2 = ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE;
        } else if (i10 == 2) {
            str2 = ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE;
        } else if (i10 == 3) {
            LogUtilsKt.debugLog(ConfigureStrings.LEGACY_API_KEY);
            return;
        } else if (i10 != 4) {
            return;
        } else {
            str2 = ConfigureStrings.INVALID_API_KEY;
        }
        LogUtilsKt.errorLog$default(str2, null, 2, null);
    }
}
