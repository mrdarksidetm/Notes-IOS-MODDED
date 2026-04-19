package com.revenuecat.purchases.common.networking;

import ae.j;
import ae.r;
import ae.s;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.NetworkStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import md.l;
import md.n;
import md.q;
import md.x;
import nd.r0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ETagManager {
    public static final Companion Companion = new Companion(null);
    private final DateProvider dateProvider;
    private final l<SharedPreferences> prefs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.networking.ETagManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements a<SharedPreferences> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final SharedPreferences invoke() {
            return ETagManager.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            r.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            r.e(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ETagManager(Context context, l<? extends SharedPreferences> lVar, DateProvider dateProvider) {
        r.f(context, "context");
        r.f(lVar, "prefs");
        r.f(dateProvider, "dateProvider");
        this.prefs = lVar;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ ETagManager(Context context, l lVar, DateProvider dateProvider, int i10, j jVar) {
        this(context, (i10 & 2) != 0 ? n.b(new AnonymousClass1(context)) : lVar, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public static /* synthetic */ Map getETagHeaders$purchases_defaultsRelease$default(ETagManager eTagManager, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eTagManager.getETagHeaders$purchases_defaultsRelease(str, z10, z11);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = this.prefs.getValue().getString(str, null);
        if (string != null) {
            return HTTPResultWithETag.Companion.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult hTTPResult) {
        int responseCode = hTTPResult.getResponseCode();
        return (responseCode == 304 || responseCode >= 500 || hTTPResult.getVerificationResult() == VerificationResult.FAILED) ? false : true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag hTTPResultWithETag, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[hTTPResultWithETag.getHttpResult().getVerificationResult().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    return false;
                }
                throw new q();
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        this.prefs.getValue().edit().putString(str, new HTTPResultWithETag(new ETagData(str2, this.dateProvider.getNow()), HTTPResult.copy$default(hTTPResult, 0, null, HTTPResult.Origin.CACHE, null, null, 27, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_defaultsRelease() {
        this.prefs.getValue().edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_defaultsRelease(String str, boolean z10, boolean z11) {
        ETagData eTagData;
        Date lastRefreshTime;
        r.f(str, "path");
        String string = null;
        HTTPResultWithETag storedResultSavedInSharedPreferences = z11 ? null : getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences == null || (eTagData = storedResultSavedInSharedPreferences.getETagData()) == null || !shouldUseETag(storedResultSavedInSharedPreferences, z10)) {
            eTagData = null;
        }
        md.s[] sVarArr = new md.s[2];
        String eTag = eTagData != null ? eTagData.getETag() : null;
        if (eTag == null) {
            eTag = "";
        }
        sVarArr[0] = x.a("X-RevenueCat-ETag", eTag);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            string = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        sVarArr[1] = x.a(HTTPRequest.ETAG_LAST_REFRESH_NAME, string);
        return r0.h(sVarArr);
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_defaultsRelease(int i10, String str, String str2, String str3, boolean z10, Date date, VerificationResult verificationResult) {
        HTTPResult hTTPResultCopy$default;
        r.f(str, "payload");
        r.f(str3, "urlPathWithVersion");
        r.f(verificationResult, "verificationResult");
        HTTPResult hTTPResult = new HTTPResult(i10, str, HTTPResult.Origin.BACKEND, date, verificationResult);
        if (str2 != null) {
            if (shouldUseCachedVersion$purchases_defaultsRelease(i10)) {
                HTTPResult storedResult$purchases_defaultsRelease = getStoredResult$purchases_defaultsRelease(str3);
                if (storedResult$purchases_defaultsRelease != null) {
                    hTTPResultCopy$default = HTTPResult.copy$default(storedResult$purchases_defaultsRelease, 0, null, null, date == null ? storedResult$purchases_defaultsRelease.getRequestDate() : date, verificationResult, 7, null);
                } else {
                    hTTPResultCopy$default = null;
                }
                if (hTTPResultCopy$default != null) {
                    return hTTPResultCopy$default;
                }
                if (!z10) {
                    return null;
                }
                LogIntent logIntent = LogIntent.WARNING;
                String str4 = String.format(NetworkStrings.ETAG_CALL_ALREADY_RETRIED, Arrays.copyOf(new Object[]{hTTPResult}, 1));
                r.e(str4, "format(this, *args)");
                LogWrapperKt.log(logIntent, str4);
                return hTTPResult;
            }
            storeBackendResultIfNoError$purchases_defaultsRelease(str3, hTTPResult, str2);
        }
        return hTTPResult;
    }

    public final HTTPResult getStoredResult$purchases_defaultsRelease(String str) {
        r.f(str, "path");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_defaultsRelease(int i10) {
        return i10 == 304;
    }

    public final void storeBackendResultIfNoError$purchases_defaultsRelease(String str, HTTPResult hTTPResult, String str2) {
        r.f(str, "path");
        r.f(hTTPResult, "resultFromBackend");
        r.f(str2, "eTagInResponse");
        if (shouldStoreBackendResult(hTTPResult)) {
            storeResult(str, hTTPResult, str2);
        }
    }
}
