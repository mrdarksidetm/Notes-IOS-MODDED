package com.revenuecat.purchases.ui.revenuecatui.activity;

import ae.j;
import ae.r;
import ae.s;
import android.app.Activity;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import h.c;
import h.d;
import java.lang.ref.WeakReference;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallActivityLauncher {
    public static final int $stable = 8;
    private final d<PaywallActivityArgs> activityResultLauncher;
    private final WeakReference<Activity> weakActivity;
    private final WeakReference<n> weakFragment;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<Boolean, i0> {
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(boolean z10) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z10);
            }
            if (z10) {
                PaywallActivityLauncher paywallActivityLauncher = this.this$0;
                String str = this.$requiredEntitlementIdentifier;
                Offering offering = this.$offering;
                paywallActivityLauncher.launchPaywallWithArgs(new PaywallActivityArgs(str, offering != null ? offering.getIdentifier() : null, this.$fontProvider, this.$shouldDisplayDismissButton));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<Boolean, i0> {
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ String $offeringIdentifier;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offeringIdentifier = str2;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(boolean z10) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z10);
            }
            if (z10) {
                this.this$0.launchPaywallWithArgs(new PaywallActivityArgs(this.$requiredEntitlementIdentifier, this.$offeringIdentifier, this.$fontProvider, this.$shouldDisplayDismissButton));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements l<Boolean, i0> {
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
            super(1);
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(boolean z10) {
            if (z10) {
                PaywallActivityLauncher paywallActivityLauncher = PaywallActivityLauncher.this;
                Offering offering = this.$offering;
                paywallActivityLauncher.launchPaywallWithArgs(new PaywallActivityArgs((String) null, offering != null ? offering.getIdentifier() : null, this.$fontProvider, this.$shouldDisplayDismissButton, 1, (j) null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallActivityLauncher(c cVar, PaywallResultHandler paywallResultHandler) {
        r.f(cVar, "resultCaller");
        r.f(paywallResultHandler, "resultHandler");
        this.weakActivity = new WeakReference<>(cVar instanceof Activity ? (Activity) cVar : null);
        this.weakFragment = new WeakReference<>(cVar instanceof n ? (n) cVar : null);
        this.activityResultLauncher = cVar.registerForActivityResult(new PaywallContract(), paywallResultHandler);
    }

    private final boolean isActivityFinishing() {
        o activity;
        Activity activity2 = this.weakActivity.get();
        n nVar = this.weakFragment.get();
        if (activity2 == null) {
            if ((nVar != null ? nVar.getActivity() : null) == null) {
                return true;
            }
        }
        if (activity2 != null && activity2.isFinishing()) {
            return true;
        }
        return nVar != null && (activity = nVar.getActivity()) != null && activity.isFinishing();
    }

    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = null;
        }
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        paywallActivityLauncher.launch(offering, parcelizableFontProvider, z10);
    }

    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, String str, ParcelizableFontProvider parcelizableFontProvider, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        paywallActivityLauncher.launch(str, parcelizableFontProvider, z10);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = null;
        }
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        paywallActivityLauncher.launchIfNeeded(offering, parcelizableFontProvider, z10, (l<? super CustomerInfo, Boolean>) lVar);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, PaywallDisplayCallback paywallDisplayCallback, int i10, Object obj) {
        Offering offering2 = (i10 & 2) != 0 ? null : offering;
        ParcelizableFontProvider parcelizableFontProvider2 = (i10 & 4) != 0 ? null : parcelizableFontProvider;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        paywallActivityLauncher.launchIfNeeded(str, offering2, parcelizableFontProvider2, z10, (i10 & 16) != 0 ? null : paywallDisplayCallback);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10, PaywallDisplayCallback paywallDisplayCallback, int i10, Object obj) {
        ParcelizableFontProvider parcelizableFontProvider2 = (i10 & 4) != 0 ? null : parcelizableFontProvider;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        paywallActivityLauncher.launchIfNeeded(str, str2, parcelizableFontProvider2, z10, (i10 & 16) != 0 ? null : paywallDisplayCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPaywallWithArgs(PaywallActivityArgs paywallActivityArgs) {
        if (isActivityFinishing()) {
            Logger.INSTANCE.e("Not displaying paywall because activity/fragment is finishing or has finished.");
        } else {
            this.activityResultLauncher.a(paywallActivityArgs);
        }
    }

    public final void launch() {
        launch$default(this, (Offering) null, (ParcelizableFontProvider) null, false, 7, (Object) null);
    }

    public final void launch(Offering offering) {
        launch$default(this, offering, (ParcelizableFontProvider) null, false, 6, (Object) null);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        launch$default(this, offering, parcelizableFontProvider, false, 4, (Object) null);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, offering != null ? offering.getIdentifier() : null, parcelizableFontProvider, z10, 1, (j) null));
    }

    public final /* synthetic */ void launch(String str, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        r.f(str, "offeringIdentifier");
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, str, parcelizableFontProvider, z10, 1, (j) null));
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, l<? super CustomerInfo, Boolean> lVar) {
        r.f(lVar, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, parcelizableFontProvider, false, lVar, 4, null);
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, l<? super CustomerInfo, Boolean> lVar) {
        r.f(lVar, "shouldDisplayBlock");
        HelperFunctionsKt.shouldDisplayPaywall(lVar, new AnonymousClass3(offering, parcelizableFontProvider, z10));
    }

    public final void launchIfNeeded(Offering offering, l<? super CustomerInfo, Boolean> lVar) {
        r.f(lVar, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, null, false, lVar, 6, null);
    }

    public final void launchIfNeeded(String str) {
        r.f(str, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, str, (Offering) null, (ParcelizableFontProvider) null, false, (PaywallDisplayCallback) null, 30, (Object) null);
    }

    public final void launchIfNeeded(String str, Offering offering) {
        r.f(str, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, str, offering, (ParcelizableFontProvider) null, false, (PaywallDisplayCallback) null, 28, (Object) null);
    }

    public final void launchIfNeeded(String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        r.f(str, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, str, offering, parcelizableFontProvider, false, (PaywallDisplayCallback) null, 24, (Object) null);
    }

    public final void launchIfNeeded(String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        r.f(str, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, str, offering, parcelizableFontProvider, z10, (PaywallDisplayCallback) null, 16, (Object) null);
    }

    public final void launchIfNeeded(String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, PaywallDisplayCallback paywallDisplayCallback) {
        r.f(str, "requiredEntitlementIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(str), new AnonymousClass1(paywallDisplayCallback, this, str, offering, parcelizableFontProvider, z10));
    }

    public final /* synthetic */ void launchIfNeeded(String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10, PaywallDisplayCallback paywallDisplayCallback) {
        r.f(str, "requiredEntitlementIdentifier");
        r.f(str2, "offeringIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(str), new AnonymousClass2(paywallDisplayCallback, this, str, str2, parcelizableFontProvider, z10));
    }

    public final void launchIfNeeded(l<? super CustomerInfo, Boolean> lVar) {
        r.f(lVar, "shouldDisplayBlock");
        launchIfNeeded$default(this, null, null, false, lVar, 7, null);
    }
}
