package com.revenuecat.purchases.hybridcommon.ui;

import ae.j;
import ae.r;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.lifecycle.y;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallDisplayCallback;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFragment extends n implements PaywallResultHandler {
    public static final Companion Companion = new Companion(null);
    private static final String notPresentedPaywallResult = "NOT_PRESENTED";
    public static final String tag = "revenuecat-paywall-fragment";
    private PaywallActivityLauncher launcher;
    private PaywallFragmentViewModel viewModel;

    public static final class Companion {

        public enum OptionKey {
            REQUIRED_ENTITLEMENT_IDENTIFIER("requiredEntitlementIdentifier"),
            SHOULD_DISPLAY_DISMISS_BUTTON("shouldDisplayDismissButton"),
            OFFERING_IDENTIFIER("offeringIdentifier"),
            FONT_FAMILY("fontProvider");

            private final String key;

            OptionKey(String str) {
                this.key = str;
            }

            public final String getKey() {
                return this.key;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.revenuecat.purchases.hybridcommon.ui.PaywallFragment newInstance(androidx.fragment.app.o r2, java.lang.String r3, com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener r4, java.lang.Boolean r5, com.revenuecat.purchases.hybridcommon.ui.PaywallSource r6, com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily r7) {
            /*
                r1 = this;
                java.lang.String r0 = "activity"
                ae.r.f(r2, r0)
                java.lang.String r0 = "paywallSource"
                ae.r.f(r6, r0)
                androidx.lifecycle.y r0 = new androidx.lifecycle.y
                r0.<init>(r2)
                java.lang.Class<com.revenuecat.purchases.hybridcommon.ui.PaywallFragmentViewModel> r2 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragmentViewModel.class
                androidx.lifecycle.w r2 = r0.a(r2)
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragmentViewModel r2 = (com.revenuecat.purchases.hybridcommon.ui.PaywallFragmentViewModel) r2
                r2.setPaywallResultListener(r4)
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment r2 = new com.revenuecat.purchases.hybridcommon.ui.PaywallFragment
                r2.<init>()
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$Companion$OptionKey r0 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER
                java.lang.String r0 = r0.getKey()
                r4.putString(r0, r3)
                if (r5 == 0) goto L3c
                boolean r3 = r5.booleanValue()
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$Companion$OptionKey r5 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON
                java.lang.String r5 = r5.getKey()
                r4.putBoolean(r5, r3)
            L3c:
                boolean r3 = r6 instanceof com.revenuecat.purchases.hybridcommon.ui.PaywallSource.Offering
                if (r3 == 0) goto L54
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$Companion$OptionKey r3 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.OptionKey.OFFERING_IDENTIFIER
                java.lang.String r3 = r3.getKey()
                com.revenuecat.purchases.hybridcommon.ui.PaywallSource$Offering r6 = (com.revenuecat.purchases.hybridcommon.ui.PaywallSource.Offering) r6
                com.revenuecat.purchases.Offering r5 = r6.getValue()
                java.lang.String r5 = r5.getIdentifier()
            L50:
                r4.putString(r3, r5)
                goto L67
            L54:
                boolean r3 = r6 instanceof com.revenuecat.purchases.hybridcommon.ui.PaywallSource.OfferingIdentifier
                if (r3 == 0) goto L65
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$Companion$OptionKey r3 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.OptionKey.OFFERING_IDENTIFIER
                java.lang.String r3 = r3.getKey()
                com.revenuecat.purchases.hybridcommon.ui.PaywallSource$OfferingIdentifier r6 = (com.revenuecat.purchases.hybridcommon.ui.PaywallSource.OfferingIdentifier) r6
                java.lang.String r5 = r6.getValue()
                goto L50
            L65:
                boolean r3 = r6 instanceof com.revenuecat.purchases.hybridcommon.ui.PaywallSource.DefaultOffering
            L67:
                if (r7 == 0) goto L72
                com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$Companion$OptionKey r3 = com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.OptionKey.FONT_FAMILY
                java.lang.String r3 = r3.getKey()
                r4.putParcelable(r3, r7)
            L72:
                r2.setArguments(r4)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.ui.PaywallFragment.Companion.newInstance(androidx.fragment.app.o, java.lang.String, com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener, java.lang.Boolean, com.revenuecat.purchases.hybridcommon.ui.PaywallSource, com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily):com.revenuecat.purchases.hybridcommon.ui.PaywallFragment");
        }
    }

    private final PaywallFontFamily getFontFamily() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        Companion.OptionKey optionKey = Companion.OptionKey.FONT_FAMILY;
        if (!arguments.containsKey(optionKey.getKey())) {
            arguments = null;
        }
        if (arguments != null) {
            return (PaywallFontFamily) (Build.VERSION.SDK_INT >= 33 ? arguments.getParcelable(optionKey.getKey(), PaywallFontFamily.class) : arguments.getParcelable(optionKey.getKey()));
        }
        return null;
    }

    private final String getOfferingIdentifierArg() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.OFFERING_IDENTIFIER.getKey());
        }
        return null;
    }

    private final String getRequiredEntitlementIdentifier() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER.getKey());
        }
        return null;
    }

    private final Boolean getShouldDisplayDismissButtonArg() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        Companion.OptionKey optionKey = Companion.OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON;
        if (arguments.containsKey(optionKey.getKey())) {
            return Boolean.valueOf(arguments.getBoolean(optionKey.getKey()));
        }
        return null;
    }

    private final void launchPaywall() {
        PaywallActivityLauncher paywallActivityLauncher;
        Offering offering;
        boolean zBooleanValue;
        int i10;
        String offeringIdentifierArg = getOfferingIdentifierArg();
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        PaywallFontFamily fontFamily = getFontFamily();
        PaywallActivityLauncher paywallActivityLauncher2 = null;
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        if (shouldDisplayDismissButtonArg != null && offeringIdentifierArg != null) {
            PaywallActivityLauncher paywallActivityLauncher3 = this.launcher;
            if (paywallActivityLauncher3 == null) {
                r.t("launcher");
            } else {
                paywallActivityLauncher2 = paywallActivityLauncher3;
            }
            paywallActivityLauncher2.launch(offeringIdentifierArg, customParcelizableFontProvider, shouldDisplayDismissButtonArg.booleanValue());
            return;
        }
        if (shouldDisplayDismissButtonArg != null) {
            PaywallActivityLauncher paywallActivityLauncher4 = this.launcher;
            if (paywallActivityLauncher4 == null) {
                r.t("launcher");
                paywallActivityLauncher = null;
            } else {
                paywallActivityLauncher = paywallActivityLauncher4;
            }
            offering = null;
            zBooleanValue = shouldDisplayDismissButtonArg.booleanValue();
            i10 = 1;
        } else {
            PaywallActivityLauncher paywallActivityLauncher5 = this.launcher;
            if (offeringIdentifierArg != null) {
                if (paywallActivityLauncher5 == null) {
                    r.t("launcher");
                    paywallActivityLauncher5 = null;
                }
                PaywallActivityLauncher.launch$default(paywallActivityLauncher5, offeringIdentifierArg, (ParcelizableFontProvider) customParcelizableFontProvider, false, 4, (Object) null);
                return;
            }
            if (paywallActivityLauncher5 == null) {
                r.t("launcher");
                paywallActivityLauncher = null;
            } else {
                paywallActivityLauncher = paywallActivityLauncher5;
            }
            offering = null;
            zBooleanValue = false;
            i10 = 5;
        }
        PaywallActivityLauncher.launch$default(paywallActivityLauncher, offering, customParcelizableFontProvider, zBooleanValue, i10, (Object) null);
    }

    private final void launchPaywallIfNeeded(String str) {
        PaywallActivityLauncher paywallActivityLauncher;
        Offering offering;
        boolean zBooleanValue;
        int i10;
        PaywallActivityLauncher paywallActivityLauncher2;
        PaywallActivityLauncher paywallActivityLauncher3;
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        String offeringIdentifierArg = getOfferingIdentifierArg();
        PaywallFontFamily fontFamily = getFontFamily();
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        PaywallDisplayCallback paywallDisplayCallback = new PaywallDisplayCallback() { // from class: com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.activity.PaywallDisplayCallback
            public void onPaywallDisplayResult(boolean z10) {
                if (z10) {
                    return;
                }
                PaywallFragmentViewModel paywallFragmentViewModel = this.this$0.viewModel;
                if (paywallFragmentViewModel == null) {
                    r.t("viewModel");
                    paywallFragmentViewModel = null;
                }
                PaywallResultListener paywallResultListener = paywallFragmentViewModel.getPaywallResultListener();
                if (paywallResultListener != null) {
                    paywallResultListener.onPaywallResult("NOT_PRESENTED");
                }
            }
        };
        if (shouldDisplayDismissButtonArg != null && offeringIdentifierArg != null) {
            PaywallActivityLauncher paywallActivityLauncher4 = this.launcher;
            if (paywallActivityLauncher4 == null) {
                r.t("launcher");
                paywallActivityLauncher3 = null;
            } else {
                paywallActivityLauncher3 = paywallActivityLauncher4;
            }
            paywallActivityLauncher3.launchIfNeeded(str, offeringIdentifierArg, customParcelizableFontProvider, shouldDisplayDismissButtonArg.booleanValue(), paywallDisplayCallback);
            return;
        }
        if (shouldDisplayDismissButtonArg != null) {
            PaywallActivityLauncher paywallActivityLauncher5 = this.launcher;
            if (paywallActivityLauncher5 == null) {
                r.t("launcher");
                paywallActivityLauncher = null;
            } else {
                paywallActivityLauncher = paywallActivityLauncher5;
            }
            offering = null;
            zBooleanValue = shouldDisplayDismissButtonArg.booleanValue();
            i10 = 2;
        } else {
            PaywallActivityLauncher paywallActivityLauncher6 = this.launcher;
            if (offeringIdentifierArg != null) {
                if (paywallActivityLauncher6 == null) {
                    r.t("launcher");
                    paywallActivityLauncher2 = null;
                } else {
                    paywallActivityLauncher2 = paywallActivityLauncher6;
                }
                PaywallActivityLauncher.launchIfNeeded$default(paywallActivityLauncher2, str, offeringIdentifierArg, (ParcelizableFontProvider) customParcelizableFontProvider, false, paywallDisplayCallback, 8, (Object) null);
                return;
            }
            if (paywallActivityLauncher6 == null) {
                r.t("launcher");
                paywallActivityLauncher = null;
            } else {
                paywallActivityLauncher = paywallActivityLauncher6;
            }
            offering = null;
            zBooleanValue = false;
            i10 = 10;
        }
        PaywallActivityLauncher.launchIfNeeded$default(paywallActivityLauncher, str, offering, customParcelizableFontProvider, zBooleanValue, paywallDisplayCallback, i10, (Object) null);
    }

    public static final PaywallFragment newInstance(o oVar, String str, PaywallResultListener paywallResultListener, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily) {
        return Companion.newInstance(oVar, str, paywallResultListener, bool, paywallSource, paywallFontFamily);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler, h.b
    public void onActivityResult(PaywallResult paywallResult) {
        r.f(paywallResult, "result");
        PaywallFragmentViewModel paywallFragmentViewModel = this.viewModel;
        PaywallFragmentViewModel paywallFragmentViewModel2 = null;
        if (paywallFragmentViewModel == null) {
            r.t("viewModel");
            paywallFragmentViewModel = null;
        }
        PaywallResultListener paywallResultListener = paywallFragmentViewModel.getPaywallResultListener();
        if (paywallResultListener != null) {
            paywallResultListener.onPaywallResult(paywallResult);
        }
        PaywallFragmentViewModel paywallFragmentViewModel3 = this.viewModel;
        if (paywallFragmentViewModel3 == null) {
            r.t("viewModel");
        } else {
            paywallFragmentViewModel2 = paywallFragmentViewModel3;
        }
        PaywallResultListener paywallResultListener2 = paywallFragmentViewModel2.getPaywallResultListener();
        if (paywallResultListener2 != null) {
            paywallResultListener2.onPaywallResult(PaywallResultExtensionsKt.getName(paywallResult));
        }
    }

    @Override // androidx.fragment.app.n
    public void onCreate(Bundle bundle) {
        i0 i0Var;
        super.onCreate(bundle);
        this.launcher = new PaywallActivityLauncher(this, this);
        o oVarRequireActivity = requireActivity();
        r.e(oVarRequireActivity, "requireActivity()");
        this.viewModel = (PaywallFragmentViewModel) new y(oVarRequireActivity).a(PaywallFragmentViewModel.class);
        String requiredEntitlementIdentifier = getRequiredEntitlementIdentifier();
        if (requiredEntitlementIdentifier != null) {
            launchPaywallIfNeeded(requiredEntitlementIdentifier);
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            launchPaywall();
        }
    }
}
