package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import ae.j;
import ae.r;
import android.app.Activity;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.b;
import le.k;
import le.n0;
import md.i0;
import md.u;
import nd.y0;
import oe.f0;
import oe.g;
import oe.h0;
import oe.s;
import q0.h;
import sd.d;
import t0.k1;
import t0.k3;
import t0.p3;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class MockViewModel extends w implements PaywallViewModel {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long fakePurchaseDelayMillis = 2000;
    private final k1<PurchasesError> _actionError;
    private final k1<Boolean> _actionInProgress;
    private final s<PaywallState> _state;
    private final boolean allowsPurchases;
    private int clearActionErrorCallCount;
    private int closePaywallCallCount;
    private int purchaseSelectedPackageCallCount;
    private List<Activity> purchaseSelectedPackageParams;
    private int refreshStateIfColorsChangedCallCount;
    private int refreshStateIfLocaleChangedCallCount;
    private int restorePurchasesCallCount;
    private int selectPackageCallCount;
    private List<TemplateConfiguration.PackageInfo> selectPackageCallParams;
    private final boolean shouldErrorOnUnsupportedMethods;
    private int trackPaywallImpressionIfNeededCallCount;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1, reason: invalid class name */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel", f = "TestData.kt", l = {534}, m = "awaitSimulateActionInProgress")
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
            return MockViewModel.this.awaitSimulateActionInProgress(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$simulateActionInProgress$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$simulateActionInProgress$1", f = "TestData.kt", l = {528}, m = "invokeSuspend")
    static final class C06821 extends sd.j implements p<n0, qd.d<? super i0>, Object> {
        int label;

        C06821(qd.d<? super C06821> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return MockViewModel.this.new C06821(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((C06821) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.label;
            if (i10 == 0) {
                u.b(obj);
                MockViewModel mockViewModel = MockViewModel.this;
                this.label = 1;
                if (mockViewModel.awaitSimulateActionInProgress(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public MockViewModel(PaywallMode paywallMode, Offering offering, boolean z10, boolean z11) {
        r.f(paywallMode, "mode");
        r.f(offering, "offering");
        this.allowsPurchases = z10;
        this.shouldErrorOnUnsupportedMethods = z11;
        VariableDataProvider variableDataProvider = new VariableDataProvider(getResourceProvider(), false, 2, null);
        Set setB = y0.b();
        Set setB2 = y0.b();
        PaywallData paywall = offering.getPaywall();
        r.c(paywall);
        PaywallTemplate.Companion companion = PaywallTemplate.Companion;
        PaywallData paywall2 = offering.getPaywall();
        r.c(paywall2);
        PaywallTemplate paywallTemplateFromId = companion.fromId(paywall2.getTemplateName());
        r.c(paywallTemplateFromId);
        this._state = h0.a(OfferingToStateMapperKt.toPaywallState(offering, variableDataProvider, setB, setB2, paywallMode, paywall, paywallTemplateFromId, false, "US"));
        this._actionInProgress = k3.e(Boolean.FALSE, null, 2, null);
        this._actionError = k3.e(null, null, 2, null);
        this.selectPackageCallParams = new ArrayList();
        this.purchaseSelectedPackageParams = new ArrayList();
    }

    public /* synthetic */ MockViewModel(PaywallMode paywallMode, Offering offering, boolean z10, boolean z11, int i10, j jVar) {
        this((i10 & 1) != 0 ? PaywallMode.Companion.getDefault() : paywallMode, offering, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? true : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitSimulateActionInProgress(qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel) r0
            md.u.b(r7)
            goto L4f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            md.u.b(r7)
            t0.k1<java.lang.Boolean> r7 = r6._actionInProgress
            java.lang.Boolean r2 = sd.a.a(r3)
            r7.setValue(r2)
            r4 = 2000(0x7d0, double:9.88E-321)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = le.x0.a(r4, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r0 = r6
        L4f:
            t0.k1<java.lang.Boolean> r7 = r0._actionInProgress
            r0 = 0
            java.lang.Boolean r0 = sd.a.a(r0)
            r7.setValue(r0)
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.awaitSimulateActionInProgress(qd.d):java.lang.Object");
    }

    private final void simulateActionInProgress() {
        k.d(x.a(this), null, null, new C06821(null), 3, null);
    }

    private final void unsupportedMethod(String str) {
        if (this.shouldErrorOnUnsupportedMethods) {
            throw new IllegalStateException(str.toString());
        }
    }

    static /* synthetic */ void unsupportedMethod$default(MockViewModel mockViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Not supported";
        }
        mockViewModel.unsupportedMethod(str);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
        this.clearActionErrorCallCount++;
        this._actionError.setValue(null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall() {
        this.closePaywallCallCount++;
        unsupportedMethod$default(this, null, 1, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<PurchasesError> getActionError() {
        return this._actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public p3<Boolean> getActionInProgress() {
        return this._actionInProgress;
    }

    public final int getClearActionErrorCallCount() {
        return this.clearActionErrorCallCount;
    }

    public final int getClosePaywallCallCount() {
        return this.closePaywallCallCount;
    }

    public final int getPurchaseSelectedPackageCallCount() {
        return this.purchaseSelectedPackageCallCount;
    }

    public final List<Activity> getPurchaseSelectedPackageParams() {
        return this.purchaseSelectedPackageParams;
    }

    public final int getRefreshStateIfColorsChangedCallCount() {
        return this.refreshStateIfColorsChangedCallCount;
    }

    public final int getRefreshStateIfLocaleChangedCallCount() {
        return this.refreshStateIfLocaleChangedCallCount;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return new MockResourceProvider();
    }

    public final int getRestorePurchasesCallCount() {
        return this.restorePurchasesCallCount;
    }

    public final int getSelectPackageCallCount() {
        return this.selectPackageCallCount;
    }

    public final List<TemplateConfiguration.PackageInfo> getSelectPackageCallParams() {
        return this.selectPackageCallParams;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public f0<PaywallState> getState() {
        return g.a(this._state);
    }

    public final int getTrackPaywallImpressionIfNeededCallCount() {
        return this.trackPaywallImpressionIfNeededCallCount;
    }

    public final PaywallState.Loaded.Legacy loadedLegacyState() {
        return PaywallStateKt.loadedLegacy(getState().getValue());
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
        this.purchaseSelectedPackageCallCount++;
        this.purchaseSelectedPackageParams.add(activity);
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't purchase mock view model");
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(h hVar, boolean z10) {
        r.f(hVar, "colorScheme");
        this.refreshStateIfColorsChangedCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
        this.refreshStateIfLocaleChangedCallCount++;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
        this.restorePurchasesCallCount++;
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't restore purchases");
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
        r.f(packageInfo, "packageToSelect");
        this.selectPackageCallCount++;
        this.selectPackageCallParams.add(packageInfo);
        unsupportedMethod$default(this, null, 1, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
        this.trackPaywallImpressionIfNeededCallCount++;
    }
}
