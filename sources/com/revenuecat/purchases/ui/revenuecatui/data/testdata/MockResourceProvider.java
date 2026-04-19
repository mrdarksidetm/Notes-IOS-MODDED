package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class MockResourceProvider implements ResourceProvider {
    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getApplicationName() {
        return "Mock Paywall";
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public Locale getLocale() {
        Locale locale = Locale.getDefault();
        r.e(locale, "getDefault()");
        return locale;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider
    public String getString(int i10, Object... objArr) {
        r.f(objArr, "formatArgs");
        if (i10 == R.string.restore_purchases) {
            return "Restore purchases";
        }
        if (i10 == R.string.annual) {
            return "Annual";
        }
        if (i10 == R.string.semester) {
            return "6 month";
        }
        if (i10 == R.string.quarter) {
            return "3 month";
        }
        if (i10 == R.string.bimonthly) {
            return "2 month";
        }
        if (i10 == R.string.monthly) {
            return "Monthly";
        }
        if (i10 == R.string.weekly) {
            return "Weekly";
        }
        if (i10 == R.string.lifetime) {
            return "Lifetime";
        }
        if (i10 == R.string.continue_cta) {
            return "Continue";
        }
        if (i10 == R.string.default_offer_details_with_intro_offer) {
            return "Start your {{ sub_offer_duration }} trial, then {{ total_price_and_per_month }}.";
        }
        if (i10 == R.string.package_discount) {
            return objArr[0] + "% off";
        }
        throw new IllegalStateException(("Unknown string resource " + i10).toString());
    }
}
