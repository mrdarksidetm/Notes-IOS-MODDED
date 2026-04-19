package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.r;
import android.app.Activity;
import androidx.core.os.c;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.strings.PaywallValidationErrorStrings;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.b;
import le.k;
import le.n0;
import md.i0;
import md.u;
import nd.c0;
import nd.v;
import oe.f0;
import oe.g;
import oe.h0;
import oe.s;
import q0.h;
import sd.d;
import sd.j;
import t0.k1;
import t0.k3;
import t0.p3;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallViewModelImpl extends w implements PaywallViewModel {
    private final k1<PurchasesError> _actionError;
    private final k1<Boolean> _actionInProgress;
    private final s<h> _colorScheme;
    private final s<c> _lastLocaleList;
    private final s<PaywallState> _state;
    private boolean isDarkMode;
    private PaywallOptions options;
    private PaywallEvent.Data paywallPresentationData;
    private final PurchasesType purchases;
    private final ResourceProvider resourceProvider;
    private final l<CustomerInfo, Boolean> shouldDisplayBlock;
    private final VariableDataProvider variableDataProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$performPurchase$1, reason: invalid class name */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {276, 299}, m = "performPurchase")
    static final class AnonymousClass1 extends b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(qd.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.this.performPurchase(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$purchaseSelectedPackage$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$purchaseSelectedPackage$1", f = "PaywallViewModel.kt", l = {159}, m = "invokeSuspend")
    static final class C06791 extends j implements p<n0, qd.d<? super i0>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06791(Activity activity, qd.d<? super C06791> dVar) {
            super(2, dVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return PaywallViewModelImpl.this.new C06791(this.$activity, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((C06791) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.label;
            if (i10 == 0) {
                u.b(obj);
                PaywallViewModelImpl paywallViewModelImpl = PaywallViewModelImpl.this;
                Activity activity = this.$activity;
                this.label = 1;
                if (paywallViewModelImpl.handlePackagePurchase(activity, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            PaywallViewModelImpl.this.finishAction();
            return i0.f15558a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1", f = "PaywallViewModel.kt", l = {179, 180, 212}, m = "invokeSuspend")
    static final class C06801 extends j implements p<n0, qd.d<? super i0>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PurchasesAreCompletedBy.values().length];
                try {
                    iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C06801(qd.d<? super C06801> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return PaywallViewModelImpl.this.new C06801(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((C06801) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: PurchasesException -> 0x0018, TryCatch #0 {PurchasesException -> 0x0018, blocks: (B:7:0x0013, B:36:0x00a3, B:38:0x00c3, B:39:0x00c6, B:41:0x00ce, B:43:0x00dc, B:44:0x00e7, B:14:0x0027, B:54:0x0111, B:56:0x0117, B:58:0x0128, B:60:0x0136, B:61:0x0144, B:63:0x0148, B:65:0x014c, B:67:0x0154, B:17:0x0030, B:50:0x0100, B:20:0x0038, B:22:0x0041, B:24:0x0048, B:27:0x005e, B:28:0x0080, B:30:0x0088, B:32:0x008d, B:33:0x0094, B:46:0x00ee, B:68:0x015e, B:69:0x0169), top: B:76:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[Catch: PurchasesException -> 0x0018, TryCatch #0 {PurchasesException -> 0x0018, blocks: (B:7:0x0013, B:36:0x00a3, B:38:0x00c3, B:39:0x00c6, B:41:0x00ce, B:43:0x00dc, B:44:0x00e7, B:14:0x0027, B:54:0x0111, B:56:0x0117, B:58:0x0128, B:60:0x0136, B:61:0x0144, B:63:0x0148, B:65:0x014c, B:67:0x0154, B:17:0x0030, B:50:0x0100, B:20:0x0038, B:22:0x0041, B:24:0x0048, B:27:0x005e, B:28:0x0080, B:30:0x0088, B:32:0x008d, B:33:0x0094, B:46:0x00ee, B:68:0x015e, B:69:0x0169), top: B:76:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: PurchasesException -> 0x0018, TryCatch #0 {PurchasesException -> 0x0018, blocks: (B:7:0x0013, B:36:0x00a3, B:38:0x00c3, B:39:0x00c6, B:41:0x00ce, B:43:0x00dc, B:44:0x00e7, B:14:0x0027, B:54:0x0111, B:56:0x0117, B:58:0x0128, B:60:0x0136, B:61:0x0144, B:63:0x0148, B:65:0x014c, B:67:0x0154, B:17:0x0030, B:50:0x0100, B:20:0x0038, B:22:0x0041, B:24:0x0048, B:27:0x005e, B:28:0x0080, B:30:0x0088, B:32:0x008d, B:33:0x0094, B:46:0x00ee, B:68:0x015e, B:69:0x0169), top: B:76:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[Catch: PurchasesException -> 0x0018, TryCatch #0 {PurchasesException -> 0x0018, blocks: (B:7:0x0013, B:36:0x00a3, B:38:0x00c3, B:39:0x00c6, B:41:0x00ce, B:43:0x00dc, B:44:0x00e7, B:14:0x0027, B:54:0x0111, B:56:0x0117, B:58:0x0128, B:60:0x0136, B:61:0x0144, B:63:0x0148, B:65:0x014c, B:67:0x0154, B:17:0x0030, B:50:0x0100, B:20:0x0038, B:22:0x0041, B:24:0x0048, B:27:0x005e, B:28:0x0080, B:30:0x0088, B:32:0x008d, B:33:0x0094, B:46:0x00ee, B:68:0x015e, B:69:0x0169), top: B:76:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.C06801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1", f = "PaywallViewModel.kt", l = {336, 348}, m = "invokeSuspend")
    static final class C06811 extends j implements p<n0, qd.d<? super i0>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C06811(qd.d<? super C06811> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return PaywallViewModelImpl.this.new C06811(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((C06811) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: PurchasesException -> 0x002b, TryCatch #0 {PurchasesException -> 0x002b, blocks: (B:7:0x001a, B:33:0x00a1, B:11:0x0027, B:21:0x0050, B:23:0x0062, B:28:0x006f, B:29:0x0081, B:25:0x0068, B:16:0x0031, B:18:0x0041), top: B:38:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: PurchasesException -> 0x002b, TryCatch #0 {PurchasesException -> 0x002b, blocks: (B:7:0x001a, B:33:0x00a1, B:11:0x0027, B:21:0x0050, B:23:0x0062, B:28:0x006f, B:29:0x0081, B:25:0x0068, B:16:0x0031, B:18:0x0041), top: B:38:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.C06811.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchasesType, PaywallOptions paywallOptions, h hVar, boolean z10, l<? super CustomerInfo, Boolean> lVar, boolean z11) {
        r.f(resourceProvider, "resourceProvider");
        r.f(purchasesType, "purchases");
        r.f(paywallOptions, "options");
        r.f(hVar, "colorScheme");
        this.resourceProvider = resourceProvider;
        this.purchases = purchasesType;
        this.options = paywallOptions;
        this.isDarkMode = z10;
        this.shouldDisplayBlock = lVar;
        this.variableDataProvider = new VariableDataProvider(getResourceProvider(), z11);
        this._state = h0.a(PaywallState.Loading.INSTANCE);
        this._actionInProgress = k3.e(Boolean.FALSE, null, 2, null);
        this._actionError = k3.e(null, null, 2, null);
        this._lastLocaleList = h0.a(getCurrentLocaleList());
        this._colorScheme = h0.a(hVar);
        updateState();
        validateState();
    }

    public /* synthetic */ PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchasesType, PaywallOptions paywallOptions, h hVar, boolean z10, l lVar, boolean z11, int i10, ae.j jVar) {
        this(resourceProvider, (i10 & 2) != 0 ? new PurchasesImpl(null, 1, 0 == true ? 1 : 0) : purchasesType, paywallOptions, hVar, z10, lVar, (i10 & 64) != 0 ? false : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallState calculateState(Offering offering, CustomerInfo customerInfo, h hVar, String str) {
        if (offering.getAvailablePackages().isEmpty()) {
            return new PaywallState.Error("No packages available");
        }
        PaywallValidationResult paywallValidationResultValidatedPaywall = OfferingToStateMapperKt.validatedPaywall(offering, hVar, getResourceProvider());
        PaywallData paywallDataComponent1 = paywallValidationResultValidatedPaywall.component1();
        PaywallTemplate paywallTemplateComponent2 = paywallValidationResultValidatedPaywall.component2();
        PaywallValidationError paywallValidationErrorComponent3 = paywallValidationResultValidatedPaywall.component3();
        if (paywallValidationErrorComponent3 != null) {
            Logger logger = Logger.INSTANCE;
            logger.w(paywallValidationErrorComponent3.associatedErrorString(offering));
            logger.w(PaywallValidationErrorStrings.DISPLAYING_DEFAULT);
        }
        VariableDataProvider variableDataProvider = this.variableDataProvider;
        Set<String> activeSubscriptions = customerInfo.getActiveSubscriptions();
        List<Transaction> nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(v.x(nonSubscriptionTransactions, 10));
        Iterator<T> it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Transaction) it.next()).getProductIdentifier());
        }
        return OfferingToStateMapperKt.toPaywallState(offering, variableDataProvider, activeSubscriptions, c0.H0(arrayList), getMode(), paywallDataComponent1, paywallTemplateComponent2, this.options.getShouldDisplayDismissButton$revenuecatui_defaultsRelease(), str);
    }

    private final PaywallEvent.Data createEventData() {
        PaywallState value = getState().getValue();
        if (!(value instanceof PaywallState.Loaded.Legacy)) {
            Logger.INSTANCE.e("Unexpected state trying to create event data: " + value);
            return null;
        }
        PaywallState.Loaded.Legacy legacy = (PaywallState.Loaded.Legacy) value;
        Offering offering = legacy.getOffering();
        PaywallData paywall = legacy.getOffering().getPaywall();
        if (paywall == null) {
            Logger.INSTANCE.e("Null paywall revision trying to create event data");
            return null;
        }
        Locale localeC = this._lastLocaleList.getValue().c(0);
        if (localeC == null) {
            localeC = Locale.getDefault();
        }
        String identifier = offering.getIdentifier();
        int revision = paywall.getRevision();
        UUID uuidRandomUUID = UUID.randomUUID();
        r.e(uuidRandomUUID, "randomUUID()");
        String lowerCase = getMode().name().toLowerCase(Locale.ROOT);
        r.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String string = localeC.toString();
        r.e(string, "locale.toString()");
        return new PaywallEvent.Data(identifier, revision, uuidRandomUUID, lowerCase, string, this.isDarkMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAction() {
        this._actionInProgress.setValue(Boolean.FALSE);
    }

    private final c getCurrentLocaleList() {
        c cVarD = c.d();
        r.e(cVarD, "getDefault()");
        return cVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallListener getListener() {
        return this.options.getListener();
    }

    private final PaywallMode getMode() {
        return this.options.getMode$revenuecatui_defaultsRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseLogic getPurchaseLogic() {
        return this.options.getPurchaseLogic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handlePackagePurchase(Activity activity, qd.d<? super i0> dVar) throws Throwable {
        PaywallState value = this._state.getValue();
        if (value instanceof PaywallState.Loaded.Legacy) {
            TemplateConfiguration.PackageInfo value2 = ((PaywallState.Loaded.Legacy) value).getSelectedPackage().getValue();
            if (!value2.getCurrentlySubscribed()) {
                Object objPerformPurchase = performPurchase(activity, value2.getRcPackage(), dVar);
                return objPerformPurchase == rd.d.e() ? objPerformPurchase : i0.f15558a;
            }
            Logger.INSTANCE.d("Ignoring purchase request for already subscribed package");
        } else {
            Logger.INSTANCE.e("Unexpected state trying to purchase package: " + value);
        }
        return i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: PurchasesException -> 0x0044, TryCatch #0 {PurchasesException -> 0x0044, blocks: (B:13:0x002e, B:40:0x00ad, B:42:0x00b5, B:43:0x00c0, B:44:0x00cb, B:18:0x003f, B:51:0x00de, B:53:0x00e4, B:54:0x00f5, B:56:0x00f9, B:57:0x00fd, B:59:0x0101, B:61:0x0109), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[Catch: PurchasesException -> 0x0044, TryCatch #0 {PurchasesException -> 0x0044, blocks: (B:13:0x002e, B:40:0x00ad, B:42:0x00b5, B:43:0x00c0, B:44:0x00cb, B:18:0x003f, B:51:0x00de, B:53:0x00e4, B:54:0x00f5, B:56:0x00f9, B:57:0x00fd, B:59:0x0101, B:61:0x0109), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5 A[Catch: PurchasesException -> 0x0044, TryCatch #0 {PurchasesException -> 0x0044, blocks: (B:13:0x002e, B:40:0x00ad, B:42:0x00b5, B:43:0x00c0, B:44:0x00cb, B:18:0x003f, B:51:0x00de, B:53:0x00e4, B:54:0x00f5, B:56:0x00f9, B:57:0x00fd, B:59:0x0101, B:61:0x0109), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object performPurchase(android.app.Activity r8, com.revenuecat.purchases.Package r9, qd.d<? super md.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.performPurchase(android.app.Activity, com.revenuecat.purchases.Package, qd.d):java.lang.Object");
    }

    private final void track(PaywallEventType paywallEventType) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data != null) {
            UUID uuidRandomUUID = UUID.randomUUID();
            r.e(uuidRandomUUID, "randomUUID()");
            this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(uuidRandomUUID, new Date()), data, paywallEventType));
            return;
        }
        Logger.INSTANCE.e("Paywall event data is null, not tracking event " + paywallEventType);
    }

    private final void trackPaywallCancel() {
        track(PaywallEventType.CANCEL);
    }

    private final void trackPaywallClose() {
        if (this.paywallPresentationData != null) {
            track(PaywallEventType.CLOSE);
            this.paywallPresentationData = null;
        }
    }

    private final void updateState() {
        k.d(x.a(this), null, null, new C06811(null), 3, null);
    }

    private final void validateState() {
        if (this.purchases.getPurchasesAreCompletedBy() == PurchasesAreCompletedBy.MY_APP && this.options.getPurchaseLogic() == null) {
            this._state.setValue(new PaywallState.Error("myAppPurchaseLogic is null, but is required when purchases.purchasesAreCompletedBy is .MY_APP. App purchases will not be successful."));
        }
    }

    private final boolean verifyNoActionInProgressOrStartAction() {
        if (this._actionInProgress.getValue().booleanValue()) {
            Logger.INSTANCE.d("Ignoring purchase or restore because there already is an action in progress");
            return true;
        }
        this._actionInProgress.setValue(Boolean.TRUE);
        return false;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
        this._actionError.setValue(null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall() {
        Logger.INSTANCE.d("Paywalls: Close paywall initiated");
        trackPaywallClose();
        this.options.getDismissRequest().invoke();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<PurchasesError> getActionError() {
        return this._actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<Boolean> getActionInProgress() {
        return this._actionInProgress;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public f0<PaywallState> getState() {
        return g.a(this._state);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
        if (activity == null) {
            Logger.INSTANCE.e("Activity is null, not initiating package purchase");
        } else {
            if (verifyNoActionInProgressOrStartAction()) {
                return;
            }
            k.d(x.a(this), null, null, new C06791(activity, null), 3, null);
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(h hVar, boolean z10) {
        r.f(hVar, "colorScheme");
        if (this.isDarkMode != z10) {
            this.isDarkMode = z10;
        }
        if (r.b(this._colorScheme.getValue(), hVar)) {
            return;
        }
        this._colorScheme.setValue(hVar);
        updateState();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
        if (r.b(this._lastLocaleList.getValue(), getCurrentLocaleList())) {
            return;
        }
        this._lastLocaleList.setValue(getCurrentLocaleList());
        updateState();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
        if (verifyNoActionInProgressOrStartAction()) {
            return;
        }
        k.d(x.a(this), null, null, new C06801(null), 3, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
        r.f(packageInfo, "packageToSelect");
        PaywallState value = this._state.getValue();
        if (value instanceof PaywallState.Loaded.Legacy) {
            ((PaywallState.Loaded.Legacy) value).selectPackage(packageInfo);
            return;
        }
        Logger.INSTANCE.e("Unexpected state trying to select package: " + value);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
        if (this.paywallPresentationData == null) {
            this.paywallPresentationData = createEventData();
            track(PaywallEventType.IMPRESSION);
        }
    }

    public final void updateOptions(PaywallOptions paywallOptions) {
        r.f(paywallOptions, "options");
        if (r.b(this.options, paywallOptions)) {
            return;
        }
        this.options = paywallOptions;
        updateState();
    }
}
