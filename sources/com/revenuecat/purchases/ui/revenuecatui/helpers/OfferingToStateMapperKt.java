package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationType;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfigurationFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.t;
import md.u;
import nd.c0;
import nd.v;
import nd.y0;
import nd.z;
import nd.z0;
import q0.h;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingToStateMapperKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageConfigurationType.values().length];
            try {
                iArr[PackageConfigurationType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageConfigurationType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageConfigurationType.MULTITIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final <T> Set<T> getMissingElements(Set<? extends T> set, Set<? extends T> set2) {
        if (set2 == null) {
            set2 = y0.b();
        }
        Set<T> setE = z0.e(set, c0.H0(set2));
        if (!setE.isEmpty()) {
            return setE;
        }
        return null;
    }

    public static final PaywallState toPaywallState(Offering offering, VariableDataProvider variableDataProvider, Set<String> set, Set<String> set2, PaywallMode paywallMode, PaywallData paywallData, PaywallTemplate paywallTemplate, boolean z10, String str) {
        r.f(offering, "<this>");
        r.f(variableDataProvider, "variableDataProvider");
        r.f(set, "activelySubscribedProductIdentifiers");
        r.f(set2, "nonSubscriptionProductIdentifiers");
        r.f(paywallMode, "mode");
        r.f(paywallData, "validatedPaywallData");
        r.f(paywallTemplate, "template");
        Object objM234createeH_QyT8 = TemplateConfigurationFactory.INSTANCE.m234createeH_QyT8(variableDataProvider, paywallMode, paywallData, offering.getAvailablePackages(), set, set2, paywallTemplate, str);
        Throwable thE = t.e(objM234createeH_QyT8);
        if (thE == null) {
            TemplateConfiguration templateConfiguration = (TemplateConfiguration) objM234createeH_QyT8;
            return new PaywallState.Loaded.Legacy(offering, templateConfiguration, templateConfiguration.getPackages().getDefault(), z10);
        }
        String message = thE.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new PaywallState.Error(message);
    }

    private static final PaywallValidationError validate(PaywallData.LocalizedConfiguration localizedConfiguration) {
        PaywallValidationError.InvalidVariables invalidVariablesValidateVariables = validateVariables(localizedConfiguration);
        if (invalidVariablesValidateVariables != null) {
            return invalidVariablesValidateVariables;
        }
        PaywallValidationError.InvalidIcons invalidIconsValidateIcons = validateIcons(localizedConfiguration);
        if (invalidIconsValidateIcons != null) {
            return invalidIconsValidateIcons;
        }
        return null;
    }

    private static final Object validate(PaywallData paywallData) {
        Throwable thValidate;
        Object objA;
        PaywallTemplate paywallTemplateValidateTemplate = validateTemplate(paywallData);
        if (paywallTemplateValidateTemplate != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[paywallTemplateValidateTemplate.getConfigurationType().ordinal()];
            if (i10 == 1 || i10 == 2) {
                thValidate = validate(paywallData.getLocalizedConfiguration().b());
                if (thValidate != null) {
                    t.a aVar = t.f15576b;
                    objA = u.a(thValidate);
                }
                return t.b(paywallTemplateValidateTemplate);
            }
            if (i10 == 3) {
                List<PaywallData.Configuration.Tier> tiers = paywallData.getConfig().getTiers();
                if (tiers == null) {
                    tiers = nd.u.m();
                }
                if (tiers.isEmpty()) {
                    t.a aVar2 = t.f15576b;
                    thValidate = PaywallValidationError.MissingTiers.INSTANCE;
                } else {
                    ArrayList arrayList = new ArrayList(v.x(tiers, 10));
                    Iterator<T> it = tiers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PaywallData.Configuration.Tier) it.next()).getId());
                    }
                    Set setH0 = c0.H0(arrayList);
                    Map<String, PaywallData.Configuration.ColorInformation> colorsByTier = paywallData.getConfig().getColorsByTier();
                    Set missingElements = getMissingElements(setH0, colorsByTier != null ? colorsByTier.keySet() : null);
                    if (missingElements != null) {
                        t.a aVar3 = t.f15576b;
                        thValidate = new PaywallValidationError.MissingTierConfigurations(missingElements);
                    } else {
                        Map<String, PaywallData.Configuration.Images> imagesByTier = paywallData.getConfig().getImagesByTier();
                        Set missingElements2 = getMissingElements(setH0, imagesByTier != null ? imagesByTier.keySet() : null);
                        if (missingElements2 != null) {
                            Logger.INSTANCE.w("Missing images for tier(s): " + c0.h0(missingElements2, f.f7478a, null, null, 0, null, null, 62, null));
                        }
                        Map<String, PaywallData.LocalizedConfiguration> mapB = paywallData.getTieredLocalizedConfiguration().b();
                        Set missingElements3 = getMissingElements(setH0, mapB.keySet());
                        if (missingElements3 != null) {
                            t.a aVar4 = t.f15576b;
                            thValidate = new PaywallValidationError.MissingTierConfigurations(missingElements3);
                        } else {
                            Iterator<T> it2 = mapB.entrySet().iterator();
                            while (it2.hasNext()) {
                                PaywallValidationError paywallValidationErrorValidate = validate((PaywallData.LocalizedConfiguration) ((Map.Entry) it2.next()).getValue());
                                if (paywallValidationErrorValidate != null) {
                                    t.a aVar5 = t.f15576b;
                                    objA = u.a(paywallValidationErrorValidate);
                                }
                            }
                        }
                    }
                }
                objA = u.a(thValidate);
            }
            return t.b(paywallTemplateValidateTemplate);
        }
        t.a aVar6 = t.f15576b;
        objA = u.a(new PaywallValidationError.InvalidTemplate(paywallData.getTemplateName()));
        return t.b(objA);
    }

    private static final PaywallValidationError.InvalidIcons validateIcons(PaywallData.LocalizedConfiguration localizedConfiguration) {
        List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = features.iterator();
        while (it.hasNext()) {
            String strValidateIcons$validateIcon = validateIcons$validateIcon((PaywallData.LocalizedConfiguration.Feature) it.next());
            if (strValidateIcons$validateIcon != null) {
                arrayList.add(strValidateIcons$validateIcon);
            }
        }
        Set setH0 = c0.H0(arrayList);
        if (!setH0.isEmpty()) {
            return new PaywallValidationError.InvalidIcons(setH0);
        }
        return null;
    }

    private static final String validateIcons$validateIcon(PaywallData.LocalizedConfiguration.Feature feature) {
        String iconID = feature.getIconID();
        if (iconID != null) {
            if (PaywallIconName.Companion.fromValue(iconID) == null) {
                return iconID;
            }
        }
        return null;
    }

    private static final PaywallTemplate validateTemplate(PaywallData paywallData) {
        return PaywallTemplate.Companion.fromId(paywallData.getTemplateName());
    }

    private static final PaywallValidationError.InvalidVariables validateVariables(PaywallData.LocalizedConfiguration localizedConfiguration) {
        Set setF = z0.f(z0.f(z0.f(z0.f(z0.f(z0.f(validateVariables$validateVariablesInProperty(localizedConfiguration.getTitle()), validateVariables$validateVariablesInProperty(localizedConfiguration.getSubtitle())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToAction())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToActionWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetails())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetailsWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferName()));
        List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        for (PaywallData.LocalizedConfiguration.Feature feature : features) {
            z.C(arrayList, z0.f(validateVariables$validateVariablesInProperty(feature.getTitle()), validateVariables$validateVariablesInProperty(feature.getContent())));
        }
        Set setF2 = z0.f(setF, arrayList);
        if (!setF2.isEmpty()) {
            return new PaywallValidationError.InvalidVariables(setF2);
        }
        return null;
    }

    private static final Set<String> validateVariables$validateVariablesInProperty(String str) {
        Set<String> setValidateVariables;
        return (str == null || (setValidateVariables = VariableProcessor.INSTANCE.validateVariables(str)) == null) ? y0.b() : setValidateVariables;
    }

    public static final PaywallValidationResult validatedPaywall(Offering offering, h hVar, ResourceProvider resourceProvider) {
        r.f(offering, "<this>");
        r.f(hVar, "currentColorScheme");
        r.f(resourceProvider, "resourceProvider");
        PaywallData paywall = offering.getPaywall();
        if (paywall == null) {
            PaywallData.Companion companion = PaywallData.Companion;
            return new PaywallValidationResult(PaywallDataExtensionsKt.createDefault(companion, offering.getAvailablePackages(), hVar, resourceProvider), PaywallDataExtensionsKt.getDefaultTemplate(companion), PaywallValidationError.MissingPaywall.INSTANCE);
        }
        Object objValidate = validate(paywall);
        Throwable thE = t.e(objValidate);
        if (thE == null) {
            return new PaywallValidationResult(paywall, (PaywallTemplate) objValidate, null, 4, null);
        }
        PaywallData.Companion companion2 = PaywallData.Companion;
        PaywallData paywallDataCreateDefaultForIdentifiers = PaywallDataExtensionsKt.createDefaultForIdentifiers(companion2, paywall.getConfig().getPackageIds(), hVar, resourceProvider);
        PaywallTemplate defaultTemplate = PaywallDataExtensionsKt.getDefaultTemplate(companion2);
        r.d(thE, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError");
        return new PaywallValidationResult(paywallDataCreateDefaultForIdentifiers, defaultTemplate, (PaywallValidationError) thE);
    }
}
