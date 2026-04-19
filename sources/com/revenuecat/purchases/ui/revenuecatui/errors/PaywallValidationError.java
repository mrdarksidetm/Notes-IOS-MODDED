package com.revenuecat.purchases.ui.revenuecatui.errors;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.strings.PaywallValidationErrorStrings;
import java.util.Arrays;
import java.util.Set;
import md.q;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallValidationError extends Throwable {

    public static final class InvalidIcons extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set<String> invalidIcons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidIcons(Set<String> set) {
            super(null);
            r.f(set, "invalidIcons");
            this.invalidIcons = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidIcons copy$default(InvalidIcons invalidIcons, Set set, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = invalidIcons.invalidIcons;
            }
            return invalidIcons.copy(set);
        }

        public final Set<String> component1() {
            return this.invalidIcons;
        }

        public final InvalidIcons copy(Set<String> set) {
            r.f(set, "invalidIcons");
            return new InvalidIcons(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidIcons) && r.b(this.invalidIcons, ((InvalidIcons) obj).invalidIcons);
        }

        public final Set<String> getInvalidIcons() {
            return this.invalidIcons;
        }

        public int hashCode() {
            return this.invalidIcons.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidIcons(invalidIcons=" + this.invalidIcons + ')';
        }
    }

    public static final class InvalidTemplate extends PaywallValidationError {
        public static final int $stable = 0;
        private final String templateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidTemplate(String str) {
            super(null);
            r.f(str, "templateName");
            this.templateName = str;
        }

        public static /* synthetic */ InvalidTemplate copy$default(InvalidTemplate invalidTemplate, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = invalidTemplate.templateName;
            }
            return invalidTemplate.copy(str);
        }

        public final String component1() {
            return this.templateName;
        }

        public final InvalidTemplate copy(String str) {
            r.f(str, "templateName");
            return new InvalidTemplate(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidTemplate) && r.b(this.templateName, ((InvalidTemplate) obj).templateName);
        }

        public final String getTemplateName() {
            return this.templateName;
        }

        public int hashCode() {
            return this.templateName.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidTemplate(templateName=" + this.templateName + ')';
        }
    }

    public static final class InvalidVariables extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set<String> unrecognizedVariables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidVariables(Set<String> set) {
            super(null);
            r.f(set, "unrecognizedVariables");
            this.unrecognizedVariables = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidVariables copy$default(InvalidVariables invalidVariables, Set set, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = invalidVariables.unrecognizedVariables;
            }
            return invalidVariables.copy(set);
        }

        public final Set<String> component1() {
            return this.unrecognizedVariables;
        }

        public final InvalidVariables copy(Set<String> set) {
            r.f(set, "unrecognizedVariables");
            return new InvalidVariables(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidVariables) && r.b(this.unrecognizedVariables, ((InvalidVariables) obj).unrecognizedVariables);
        }

        public final Set<String> getUnrecognizedVariables() {
            return this.unrecognizedVariables;
        }

        public int hashCode() {
            return this.unrecognizedVariables.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidVariables(unrecognizedVariables=" + this.unrecognizedVariables + ')';
        }
    }

    public static final class MissingImageLocalization extends PaywallValidationError {
        public static final int $stable = 0;
        private final String key;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingImageLocalization(String str) {
            super(null);
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.key = str;
            String str2 = String.format(PaywallValidationErrorStrings.MISSING_IMAGE_LOCALIZATION, Arrays.copyOf(new Object[]{str}, 1));
            r.e(str2, "format(this, *args)");
            this.message = str2;
        }

        public /* synthetic */ MissingImageLocalization(String str, j jVar) {
            this(str);
        }

        /* JADX INFO: renamed from: copy-O7mdLQw$default, reason: not valid java name */
        public static /* synthetic */ MissingImageLocalization m235copyO7mdLQw$default(MissingImageLocalization missingImageLocalization, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = missingImageLocalization.key;
            }
            return missingImageLocalization.m237copyO7mdLQw(str);
        }

        /* JADX INFO: renamed from: component1-z7Tp-4o, reason: not valid java name */
        public final String m236component1z7Tp4o() {
            return this.key;
        }

        /* JADX INFO: renamed from: copy-O7mdLQw, reason: not valid java name */
        public final MissingImageLocalization m237copyO7mdLQw(String str) {
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return new MissingImageLocalization(str, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingImageLocalization) && LocalizationKey.m64equalsimpl0(this.key, ((MissingImageLocalization) obj).key);
        }

        /* JADX INFO: renamed from: getKey-z7Tp-4o, reason: not valid java name */
        public final String m238getKeyz7Tp4o() {
            return this.key;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return LocalizationKey.m65hashCodeimpl(this.key);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingImageLocalization(key=" + ((Object) LocalizationKey.m66toStringimpl(this.key)) + ')';
        }
    }

    public static final class MissingPaywall extends PaywallValidationError {
        public static final int $stable = 0;
        public static final MissingPaywall INSTANCE = new MissingPaywall();

        private MissingPaywall() {
            super(null);
        }
    }

    public static final class MissingStringLocalization extends PaywallValidationError {
        public static final int $stable = 0;
        private final String key;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingStringLocalization(String str) {
            super(null);
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.key = str;
            String str2 = String.format(PaywallValidationErrorStrings.MISSING_STRING_LOCALIZATION, Arrays.copyOf(new Object[]{str}, 1));
            r.e(str2, "format(this, *args)");
            this.message = str2;
        }

        public /* synthetic */ MissingStringLocalization(String str, j jVar) {
            this(str);
        }

        /* JADX INFO: renamed from: copy-O7mdLQw$default, reason: not valid java name */
        public static /* synthetic */ MissingStringLocalization m239copyO7mdLQw$default(MissingStringLocalization missingStringLocalization, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = missingStringLocalization.key;
            }
            return missingStringLocalization.m241copyO7mdLQw(str);
        }

        /* JADX INFO: renamed from: component1-z7Tp-4o, reason: not valid java name */
        public final String m240component1z7Tp4o() {
            return this.key;
        }

        /* JADX INFO: renamed from: copy-O7mdLQw, reason: not valid java name */
        public final MissingStringLocalization m241copyO7mdLQw(String str) {
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return new MissingStringLocalization(str, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingStringLocalization) && LocalizationKey.m64equalsimpl0(this.key, ((MissingStringLocalization) obj).key);
        }

        /* JADX INFO: renamed from: getKey-z7Tp-4o, reason: not valid java name */
        public final String m242getKeyz7Tp4o() {
            return this.key;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return LocalizationKey.m65hashCodeimpl(this.key);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingStringLocalization(key=" + ((Object) LocalizationKey.m66toStringimpl(this.key)) + ')';
        }
    }

    public static final class MissingTierConfigurations extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set<String> tierIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingTierConfigurations(Set<String> set) {
            super(null);
            r.f(set, "tierIds");
            this.tierIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MissingTierConfigurations copy$default(MissingTierConfigurations missingTierConfigurations, Set set, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = missingTierConfigurations.tierIds;
            }
            return missingTierConfigurations.copy(set);
        }

        public final Set<String> component1() {
            return this.tierIds;
        }

        public final MissingTierConfigurations copy(Set<String> set) {
            r.f(set, "tierIds");
            return new MissingTierConfigurations(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingTierConfigurations) && r.b(this.tierIds, ((MissingTierConfigurations) obj).tierIds);
        }

        public final Set<String> getTierIds() {
            return this.tierIds;
        }

        public int hashCode() {
            return this.tierIds.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingTierConfigurations(tierIds=" + this.tierIds + ')';
        }
    }

    public static final class MissingTiers extends PaywallValidationError {
        public static final int $stable = 0;
        public static final MissingTiers INSTANCE = new MissingTiers();

        private MissingTiers() {
            super(null);
        }
    }

    private PaywallValidationError() {
    }

    public /* synthetic */ PaywallValidationError(j jVar) {
        this();
    }

    public final String associatedErrorString(Offering offering) {
        String str;
        r.f(offering, "offering");
        if (this instanceof InvalidIcons) {
            str = String.format(PaywallValidationErrorStrings.INVALID_ICONS, Arrays.copyOf(new Object[]{c0.h0(((InvalidIcons) this).getInvalidIcons(), null, null, null, 0, null, null, 63, null)}, 1));
        } else if (this instanceof InvalidTemplate) {
            str = String.format(PaywallValidationErrorStrings.INVALID_TEMPLATE_NAME, Arrays.copyOf(new Object[]{((InvalidTemplate) this).getTemplateName()}, 1));
        } else if (this instanceof InvalidVariables) {
            str = String.format(PaywallValidationErrorStrings.INVALID_VARIABLES, Arrays.copyOf(new Object[]{c0.h0(((InvalidVariables) this).getUnrecognizedVariables(), null, null, null, 0, null, null, 63, null)}, 1));
        } else if (this instanceof MissingPaywall) {
            str = String.format(PaywallValidationErrorStrings.MISSING_PAYWALL, Arrays.copyOf(new Object[]{offering.getIdentifier()}, 1));
        } else if (this instanceof MissingTiers) {
            str = String.format(PaywallValidationErrorStrings.MISSING_TIERS, Arrays.copyOf(new Object[]{offering.getIdentifier()}, 1));
        } else {
            if (!(this instanceof MissingTierConfigurations)) {
                if (this instanceof MissingStringLocalization) {
                    return ((MissingStringLocalization) this).getMessage();
                }
                if (this instanceof MissingImageLocalization) {
                    return ((MissingImageLocalization) this).getMessage();
                }
                throw new q();
            }
            str = String.format(PaywallValidationErrorStrings.MISSING_TIER_CONFIGURATIONS, Arrays.copyOf(new Object[]{c0.h0(((MissingTierConfigurations) this).getTierIds(), null, null, null, 0, null, null, 63, null)}, 1));
        }
        r.e(str, "format(this, *args)");
        return str;
    }
}
