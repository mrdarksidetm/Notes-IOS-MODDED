package com.revenuecat.purchases.hybridcommon.ui;

import ae.r;
import androidx.fragment.app.o;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallHelpersKt {
    public static final void presentPaywallFromFragment(o oVar) {
        r.f(oVar, "fragment");
        presentPaywallFromFragment$default(oVar, null, null, null, null, 30, null);
    }

    public static final void presentPaywallFromFragment(o oVar, PresentPaywallOptions presentPaywallOptions) {
        r.f(oVar, "fragment");
        r.f(presentPaywallOptions, "options");
        oVar.getSupportFragmentManager().o().d(PaywallFragment.Companion.newInstance(oVar, presentPaywallOptions.getRequiredEntitlementIdentifier(), presentPaywallOptions.getPaywallResultListener(), presentPaywallOptions.getShouldDisplayDismissButton(), presentPaywallOptions.getPaywallSource(), presentPaywallOptions.getFontFamily()), PaywallFragment.tag).f();
    }

    public static final void presentPaywallFromFragment(o oVar, String str) {
        r.f(oVar, "fragment");
        presentPaywallFromFragment$default(oVar, str, null, null, null, 28, null);
    }

    public static final void presentPaywallFromFragment(o oVar, String str, PaywallResultListener paywallResultListener) {
        r.f(oVar, "fragment");
        presentPaywallFromFragment$default(oVar, str, paywallResultListener, null, null, 24, null);
    }

    public static final void presentPaywallFromFragment(o oVar, String str, PaywallResultListener paywallResultListener, Boolean bool) {
        r.f(oVar, "fragment");
        presentPaywallFromFragment$default(oVar, str, paywallResultListener, bool, null, 16, null);
    }

    public static final void presentPaywallFromFragment(o oVar, String str, PaywallResultListener paywallResultListener, Boolean bool, Offering offering) {
        r.f(oVar, "fragment");
        presentPaywallFromFragment(oVar, new PresentPaywallOptions(offering != null ? new PaywallSource.Offering(offering) : PaywallSource.DefaultOffering.INSTANCE, str, paywallResultListener, bool, null, 16, null));
    }

    public static /* synthetic */ void presentPaywallFromFragment$default(o oVar, String str, PaywallResultListener paywallResultListener, Boolean bool, Offering offering, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            paywallResultListener = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            offering = null;
        }
        presentPaywallFromFragment(oVar, str, paywallResultListener, bool, offering);
    }
}
