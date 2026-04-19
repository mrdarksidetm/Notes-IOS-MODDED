package com.revenuecat.purchases.hybridcommon.ui;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallSource {

    public static final class DefaultOffering extends PaywallSource {
        public static final DefaultOffering INSTANCE = new DefaultOffering();

        private DefaultOffering() {
            super(null);
        }
    }

    public static final class Offering extends PaywallSource {
        private final com.revenuecat.purchases.Offering value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offering(com.revenuecat.purchases.Offering offering) {
            super(null);
            r.f(offering, "value");
            this.value = offering;
        }

        public final com.revenuecat.purchases.Offering getValue() {
            return this.value;
        }
    }

    public static final class OfferingIdentifier extends PaywallSource {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingIdentifier(String str) {
            super(null);
            r.f(str, "value");
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    private PaywallSource() {
    }

    public /* synthetic */ PaywallSource(j jVar) {
        this();
    }
}
