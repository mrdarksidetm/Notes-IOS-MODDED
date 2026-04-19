package com.revenuecat.purchases.ui.revenuecatui.views;

import ae.j;
import ae.r;
import ae.s;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.v;
import b1.c;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import md.i0;
import t0.k1;
import t0.k3;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public class PaywallFooterView extends FrameLayout {
    public static final int $stable = 8;
    private a<i0> dismissHandler;
    private boolean initialCondensed;
    private FontProvider initialFontProvider;
    private String initialOfferingId;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final k1<PaywallOptions> paywallOptionsState;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView$init$1, reason: invalid class name */
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
            a aVar = PaywallFooterView.this.dismissHandler;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context) {
        this(context, null, null, null, false, null, 62, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView$internalListener$1
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
    public PaywallFooterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView$internalListener$1
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
    public PaywallFooterView(Context context, Offering offering) {
        this(context, offering, null, null, false, null, 60, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, false, null, 56, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, false, null, 48, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10) {
        this(context, offering, paywallListener, fontProvider, z10, null, 32, null);
        r.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, a<i0> aVar) {
        super(context);
        r.f(context, "context");
        this.paywallOptionsState = k3.e(new PaywallOptions.Builder(new PaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView$internalListener$1
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
        this.initialFontProvider = fontProvider;
        this.initialCondensed = z10;
        init(context, null);
    }

    public /* synthetic */ PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, a aVar, int i10, j jVar) {
        this(context, (i10 & 2) != 0 ? null : offering, (i10 & 4) != 0 ? null : paywallListener, (i10 & 8) != 0 ? null : fontProvider, (i10 & 16) != 0 ? false : z10, (i10 & 32) == 0 ? aVar : null);
    }

    private final PaywallOptions getPaywallOptions() {
        return this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attributeSet) {
        parseAttributes(context, attributeSet);
        setPaywallOptions(new PaywallOptions.Builder(new AnonymousClass1()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingId$revenuecatui_defaultsRelease(this.initialOfferingId).build());
        v vVar = new v(context, null, 0, 6, null);
        vVar.setContent(c.c(2089623926, true, new PaywallFooterView$init$2$1(this)));
        addView(vVar);
    }

    private final void parseAttributes(Context context, AttributeSet attributeSet) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.Companion;
        int[] iArr = R.styleable.PaywallFooterView;
        r.e(iArr, "PaywallFooterView");
        PaywallViewAttributesReader.PaywallViewAttributes attributes = companion.parseAttributes(context, attributeSet, iArr);
        if (attributes == null) {
            return;
        }
        String strComponent1 = attributes.component1();
        FontProvider fontProviderComponent2 = attributes.component2();
        Boolean boolComponent4 = attributes.component4();
        setOfferingId(strComponent1);
        this.initialFontProvider = fontProviderComponent2;
        if (boolComponent4 != null) {
            this.initialCondensed = boolComponent4.booleanValue();
        }
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    public final void setDismissHandler(a<i0> aVar) {
        this.dismissHandler = aVar;
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
