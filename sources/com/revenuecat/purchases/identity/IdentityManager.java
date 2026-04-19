package com.revenuecat.purchases.identity;

import ae.r;
import ae.s;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import je.j;
import je.v;
import md.i0;
import zd.a;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityManager {
    private final j anonymousIdRegex;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$configure$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {
        AnonymousClass1() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IdentityManager.this.deviceCache.cleanupOldAttributionData();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements a<i0> {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ p<CustomerInfo, Boolean, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements p<CustomerInfo, Boolean, i0> {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ p<CustomerInfo, Boolean, i0> $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(IdentityManager identityManager, p<? super CustomerInfo, ? super Boolean, i0> pVar, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = pVar;
                this.$newAppUserID = str;
                this.$oldAppUserID = str2;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
                invoke(customerInfo, bool.booleanValue());
                return i0.f15558a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z10) {
                r.f(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str = this.$newAppUserID;
                String str2 = this.$oldAppUserID;
                synchronized (identityManager) {
                    LogIntent logIntent = LogIntent.USER;
                    String str3 = String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z10)}, 2));
                    r.e(str3, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str3);
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.offeringsCache.clearCache();
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                    identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                    i0 i0Var = i0.f15558a;
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z10));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, String str2, l<? super PurchasesError, i0> lVar, p<? super CustomerInfo, ? super Boolean, i0> pVar) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = lVar;
            this.$onSuccess = pVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str2, str), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C06071 extends s implements a<i0> {
        final /* synthetic */ l<PurchasesError, i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06071(l<? super PurchasesError, i0> lVar) {
            super(0);
            this.$completion = lVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IdentityManager identityManager = IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher) {
        r.f(deviceCache, "deviceCache");
        r.f(subscriberAttributesCache, "subscriberAttributesCache");
        r.f(subscriberAttributesManager, "subscriberAttributesManager");
        r.f(offeringsCache, "offeringsCache");
        r.f(backend, "backend");
        r.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        r.f(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
        this.anonymousIdRegex = new j("^\\$RCAnonymousID:([a-f0-9]{32})$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String str, String str2) {
        if (isUserIDAnonymous(str)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(str, str2);
        }
    }

    private final synchronized void enqueue(final a<i0> aVar) {
        this.dispatcher.enqueue(new Runnable() { // from class: sb.a
            @Override // java.lang.Runnable
            public final void run() {
                IdentityManager.enqueue$lambda$3(aVar);
            }
        }, Delay.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$3(a aVar) {
        r.f(aVar, "$command");
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$RCAnonymousID:");
        String string = UUID.randomUUID().toString();
        r.e(string, "randomUUID().toString()");
        Locale locale = Locale.ROOT;
        r.e(locale, "ROOT");
        String lowerCase = string.toLowerCase(locale);
        r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strC = v.C(lowerCase, "-", "", false, 4, null);
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        sb2.append(strC);
        return sb2.toString();
    }

    private final void invalidateCustomerInfoAndETagCacheIfNeeded(String str, SharedPreferences.Editor editor) {
        if (!r.b(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateCustomerInfoAndETagCache(this.deviceCache.getCachedCustomerInfo(str))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_CUSTOMER_INFO);
            this.deviceCache.clearCustomerInfoCache(str, editor);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String str) {
        return this.anonymousIdRegex.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String str) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(str);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateCustomerInfoAndETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || r.b(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:5:0x0005, B:12:0x0012, B:14:0x001b, B:25:0x003a, B:20:0x0026, B:22:0x002e, B:24:0x0036), top: B:30:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void configure(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lf
            boolean r2 = je.m.v(r6)     // Catch: java.lang.Throwable -> Ld
            if (r2 != r0) goto Lf
            r2 = r0
            goto L10
        Ld:
            r6 = move-exception
            goto L72
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L19
            com.revenuecat.purchases.common.LogIntent r2 = com.revenuecat.purchases.common.LogIntent.WARNING     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Identifying with empty App User ID will be treated as anonymous."
            com.revenuecat.purchases.common.LogWrapperKt.log(r2, r3)     // Catch: java.lang.Throwable -> Ld
        L19:
            if (r6 == 0) goto L26
            boolean r2 = je.m.v(r6)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L22
            goto L23
        L22:
            r6 = 0
        L23:
            if (r6 == 0) goto L26
            goto L3a
        L26:
            com.revenuecat.purchases.common.caching.DeviceCache r6 = r5.deviceCache     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = r6.getCachedAppUserID()     // Catch: java.lang.Throwable -> Ld
            if (r6 != 0) goto L3a
            com.revenuecat.purchases.common.caching.DeviceCache r6 = r5.deviceCache     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = r6.getLegacyCachedAppUserID()     // Catch: java.lang.Throwable -> Ld
            if (r6 != 0) goto L3a
            java.lang.String r6 = r5.generateRandomID()     // Catch: java.lang.Throwable -> Ld
        L3a:
            com.revenuecat.purchases.common.LogIntent r2 = com.revenuecat.purchases.common.LogIntent.USER     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Identifying App User ID: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Ld
            r4[r1] = r6     // Catch: java.lang.Throwable -> Ld
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "format(this, *args)"
            ae.r.e(r0, r1)     // Catch: java.lang.Throwable -> Ld
            com.revenuecat.purchases.common.LogWrapperKt.log(r2, r0)     // Catch: java.lang.Throwable -> Ld
            com.revenuecat.purchases.common.caching.DeviceCache r0 = r5.deviceCache     // Catch: java.lang.Throwable -> Ld
            android.content.SharedPreferences$Editor r0 = r0.startEditing()     // Catch: java.lang.Throwable -> Ld
            com.revenuecat.purchases.common.caching.DeviceCache r1 = r5.deviceCache     // Catch: java.lang.Throwable -> Ld
            r1.cacheAppUserID(r6, r0)     // Catch: java.lang.Throwable -> Ld
            com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache r1 = r5.subscriberAttributesCache     // Catch: java.lang.Throwable -> Ld
            r1.cleanUpSubscriberAttributeCache(r6, r0)     // Catch: java.lang.Throwable -> Ld
            r5.invalidateCustomerInfoAndETagCacheIfNeeded(r6, r0)     // Catch: java.lang.Throwable -> Ld
            r0.apply()     // Catch: java.lang.Throwable -> Ld
            com.revenuecat.purchases.identity.IdentityManager$configure$1 r6 = new com.revenuecat.purchases.identity.IdentityManager$configure$1     // Catch: java.lang.Throwable -> Ld
            r6.<init>()     // Catch: java.lang.Throwable -> Ld
            r5.enqueue(r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r5)
            return
        L72:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.identity.IdentityManager.configure(java.lang.String):void");
    }

    public final synchronized boolean currentUserIsAnonymous() {
        String cachedAppUserID;
        cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null) {
            cachedAppUserID = "";
        }
        return isUserIDAnonymous(cachedAppUserID) || r.b(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    public final void logIn(String str, p<? super CustomerInfo, ? super Boolean, i0> pVar, l<? super PurchasesError, i0> lVar) {
        r.f(str, "newAppUserID");
        r.f(pVar, "onSuccess");
        r.f(lVar, "onError");
        if (v.v(str)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            lVar.invoke(purchasesError);
        } else {
            LogIntent logIntent = LogIntent.USER;
            String str2 = String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), str}, 2));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, new AnonymousClass2(getCurrentAppUserID(), str, lVar, pVar));
        }
    }

    public final synchronized void logOut(l<? super PurchasesError, i0> lVar) {
        r.f(lVar, "completion");
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new C06071(lVar));
        } else {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            lVar.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
        }
    }

    public final void switchUser(String str) {
        r.f(str, "newAppUserID");
        String str2 = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogUtilsKt.debugLog(str2);
        resetAndSaveUserID(str);
    }
}
