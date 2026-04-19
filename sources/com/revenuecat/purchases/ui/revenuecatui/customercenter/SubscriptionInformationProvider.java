package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.SubscriptionInformation;
import ie.g;
import ie.m;
import v2.a;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriptionInformationProvider implements a<SubscriptionInformation> {
    private final g<SubscriptionInformation> values = m.i(new SubscriptionInformation("Basic", "Monthly", "$4.99", "June 1st, 2024", true, true), new SubscriptionInformation("Basic", "Yearly", "$49.99", "June 1st, 2024", false, true), new SubscriptionInformation("Basic", "Weekly", "$1.99", "June 1st, 2024", false, false));

    @Override // v2.a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // v2.a
    public g<SubscriptionInformation> getValues() {
        return this.values;
    }
}
