package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallState {

    public static final class Error implements PaywallState {
        public static final int $stable = 0;
        private final String errorMessage;

        public Error(String str) {
            r.f(str, b.f7432f);
            this.errorMessage = str;
            Logger.INSTANCE.e("Paywall transitioned to error state: " + str);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Error copy(String str) {
            r.f(str, b.f7432f);
            return new Error(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && r.b(this.errorMessage, ((Error) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ')';
        }
    }

    public interface Loaded extends PaywallState {

        public static final class Components implements Loaded {
            public static final int $stable = 8;
            private final PaywallComponentsData data;
            private final Offering offering;

            public Components(Offering offering, PaywallComponentsData paywallComponentsData) {
                r.f(offering, "offering");
                r.f(paywallComponentsData, "data");
                this.offering = offering;
                this.data = paywallComponentsData;
            }

            public static /* synthetic */ Components copy$default(Components components, Offering offering, PaywallComponentsData paywallComponentsData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    offering = components.offering;
                }
                if ((i10 & 2) != 0) {
                    paywallComponentsData = components.data;
                }
                return components.copy(offering, paywallComponentsData);
            }

            public final Offering component1() {
                return this.offering;
            }

            public final PaywallComponentsData component2() {
                return this.data;
            }

            public final Components copy(Offering offering, PaywallComponentsData paywallComponentsData) {
                r.f(offering, "offering");
                r.f(paywallComponentsData, "data");
                return new Components(offering, paywallComponentsData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Components)) {
                    return false;
                }
                Components components = (Components) obj;
                return r.b(this.offering, components.offering) && r.b(this.data, components.data);
            }

            public final PaywallComponentsData getData() {
                return this.data;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded
            public Offering getOffering() {
                return this.offering;
            }

            public int hashCode() {
                return (this.offering.hashCode() * 31) + this.data.hashCode();
            }

            public String toString() {
                return "Components(offering=" + this.offering + ", data=" + this.data + ')';
            }
        }

        public static final class Legacy implements Loaded {
            public static final int $stable = 8;
            private final Offering offering;
            private final k1<TemplateConfiguration.PackageInfo> selectedPackage;
            private final boolean shouldDisplayDismissButton;
            private final TemplateConfiguration templateConfiguration;

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, TemplateConfiguration.PackageInfo packageInfo, boolean z10) {
                this(offering, templateConfiguration, (k1<TemplateConfiguration.PackageInfo>) k3.e(packageInfo, null, 2, null), z10);
                r.f(offering, "offering");
                r.f(templateConfiguration, "templateConfiguration");
                r.f(packageInfo, "selectedPackage");
            }

            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, k1<TemplateConfiguration.PackageInfo> k1Var, boolean z10) {
                r.f(offering, "offering");
                r.f(templateConfiguration, "templateConfiguration");
                r.f(k1Var, "selectedPackage");
                this.offering = offering;
                this.templateConfiguration = templateConfiguration;
                this.selectedPackage = k1Var;
                this.shouldDisplayDismissButton = z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Legacy copy$default(Legacy legacy, Offering offering, TemplateConfiguration templateConfiguration, k1 k1Var, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    offering = legacy.offering;
                }
                if ((i10 & 2) != 0) {
                    templateConfiguration = legacy.templateConfiguration;
                }
                if ((i10 & 4) != 0) {
                    k1Var = legacy.selectedPackage;
                }
                if ((i10 & 8) != 0) {
                    z10 = legacy.shouldDisplayDismissButton;
                }
                return legacy.copy(offering, templateConfiguration, k1Var, z10);
            }

            public final Offering component1() {
                return this.offering;
            }

            public final TemplateConfiguration component2() {
                return this.templateConfiguration;
            }

            public final k1<TemplateConfiguration.PackageInfo> component3() {
                return this.selectedPackage;
            }

            public final boolean component4() {
                return this.shouldDisplayDismissButton;
            }

            public final Legacy copy(Offering offering, TemplateConfiguration templateConfiguration, k1<TemplateConfiguration.PackageInfo> k1Var, boolean z10) {
                r.f(offering, "offering");
                r.f(templateConfiguration, "templateConfiguration");
                r.f(k1Var, "selectedPackage");
                return new Legacy(offering, templateConfiguration, k1Var, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) obj;
                return r.b(this.offering, legacy.offering) && r.b(this.templateConfiguration, legacy.templateConfiguration) && r.b(this.selectedPackage, legacy.selectedPackage) && this.shouldDisplayDismissButton == legacy.shouldDisplayDismissButton;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded
            public Offering getOffering() {
                return this.offering;
            }

            public final k1<TemplateConfiguration.PackageInfo> getSelectedPackage() {
                return this.selectedPackage;
            }

            public final boolean getShouldDisplayDismissButton() {
                return this.shouldDisplayDismissButton;
            }

            public final TemplateConfiguration getTemplateConfiguration() {
                return this.templateConfiguration;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [int] */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            public int hashCode() {
                int iHashCode = ((((this.offering.hashCode() * 31) + this.templateConfiguration.hashCode()) * 31) + this.selectedPackage.hashCode()) * 31;
                boolean z10 = this.shouldDisplayDismissButton;
                ?? r12 = z10;
                if (z10) {
                    r12 = 1;
                }
                return iHashCode + r12;
            }

            public final void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
                r.f(packageInfo, "packageInfo");
                this.selectedPackage.setValue(packageInfo);
            }

            public String toString() {
                return "Legacy(offering=" + this.offering + ", templateConfiguration=" + this.templateConfiguration + ", selectedPackage=" + this.selectedPackage + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ')';
            }
        }

        Offering getOffering();
    }

    public static final class Loading implements PaywallState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
