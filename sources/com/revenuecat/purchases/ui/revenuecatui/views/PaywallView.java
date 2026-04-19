package com.revenuecat.purchases.ui.revenuecatui.views;

import ae.j;
import ae.r;
import ae.s;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.a;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import md.i0;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallView extends a {
    public static final int $stable = 8;
    private zd.a<i0> dismissHandler;
    private FontProvider initialFontProvider;
    private String initialOfferingId;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final k1<PaywallOptions> paywallOptionsState;
    private Boolean shouldDisplayDismissButton;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$Content$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallView.this.Content(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$init$1, reason: invalid class name and case insensitive filesystem */
    static final class C07671 extends s implements zd.a<i0> {
        C07671() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zd.a aVar = PaywallView.this.dismissHandler;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context) {
        this(context, null, null, null, null, null, 62, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                r.f(customerInfo, "customerInfo");
                r.f(storeTransaction, "storeTransaction");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package r22) {
                r.f(r22, "rcPackage");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseStarted(r22);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreStarted();
                }
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                r.f(customerInfo, "customerInfo");
                r.f(storeTransaction, "storeTransaction");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package r22) {
                r.f(r22, "rcPackage");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseStarted(r22);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreStarted();
                }
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering) {
        this(context, offering, null, null, null, null, 60, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, null, null, 56, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, null, null, 48, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool) {
        this(context, offering, paywallListener, fontProvider, bool, null, 32, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, zd.a<i0> aVar) {
        super(context, null, 0, 6, null);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                r.f(customerInfo, "customerInfo");
                r.f(storeTransaction, "storeTransaction");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package r22) {
                r.f(r22, "rcPackage");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseStarted(r22);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                r.f(customerInfo, "customerInfo");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreError(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreStarted();
                }
            }
        };
        setPaywallListener(paywallListener);
        setDismissHandler(aVar);
        setOfferingId(offering != null ? offering.getIdentifier() : null);
        this.shouldDisplayDismissButton = bool;
        this.initialFontProvider = fontProvider;
        init(context, null);
    }

    public /* synthetic */ PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, zd.a aVar, int i10, j jVar) {
        this(context, (i10 & 2) != 0 ? null : offering, (i10 & 4) != 0 ? null : paywallListener, (i10 & 8) != 0 ? null : fontProvider, (i10 & 16) != 0 ? null : bool, (i10 & 32) == 0 ? aVar : null);
    }

    private static final PaywallOptions Content$lambda$1(k1<PaywallOptions> k1Var) {
        return k1Var.getValue();
    }

    private final PaywallOptions getPaywallOptions() {
        return this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attributeSet) {
        parseAttributes(context, attributeSet);
        PaywallOptions.Builder offeringId$revenuecatui_defaultsRelease = new PaywallOptions.Builder(new C07671()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingId$revenuecatui_defaultsRelease(this.initialOfferingId);
        Boolean bool = this.shouldDisplayDismissButton;
        setPaywallOptions(offeringId$revenuecatui_defaultsRelease.setShouldDisplayDismissButton(bool != null ? bool.booleanValue() : false).build());
    }

    private final void parseAttributes(Context context, AttributeSet attributeSet) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.Companion;
        int[] iArr = R.styleable.PaywallView;
        r.e(iArr, "PaywallView");
        PaywallViewAttributesReader.PaywallViewAttributes attributes = companion.parseAttributes(context, attributeSet, iArr);
        if (attributes == null) {
            return;
        }
        String strComponent1 = attributes.component1();
        FontProvider fontProviderComponent2 = attributes.component2();
        Boolean boolComponent3 = attributes.component3();
        setOfferingId(strComponent1);
        this.initialFontProvider = fontProviderComponent2;
        this.shouldDisplayDismissButton = boolComponent3;
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(l lVar, int i10) {
        l lVarP = lVar.p(1456977972);
        if (o.I()) {
            o.U(1456977972, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallView.Content (PaywallView.kt:149)");
        }
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        if (objF == l.f20813a.a()) {
            objF = this.paywallOptionsState;
            lVarP.E(objF);
        }
        lVarP.K();
        PaywallKt.Paywall(Content$lambda$1((k1) objF), lVarP, 0);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(i10));
    }

    public final void setDismissHandler(zd.a<i0> aVar) {
        this.dismissHandler = aVar;
    }

    public final void setDisplayDismissButton(boolean z10) {
        setPaywallOptions(PaywallOptions.copy$default(getPaywallOptions(), null, z10, null, null, null, null, null, com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowMinWidthMinor, null));
    }

    public final void setFontProvider(FontProvider fontProvider) {
        setPaywallOptions(PaywallOptions.copy$default(getPaywallOptions(), null, false, fontProvider, null, null, null, null, com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowFixedWidthMinor, null));
    }

    public final void setOfferingId(String str) {
        setPaywallOptions(PaywallOptions.copy$default(getPaywallOptions(), str == null ? OfferingSelection.None.INSTANCE : new OfferingSelection.OfferingId(str), false, null, null, null, null, null, com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_windowNoTitle, null));
    }

    public final void setPaywallListener(PaywallListener paywallListener) {
        this.listener = paywallListener;
    }
}
