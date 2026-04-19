package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PackageConfigurationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import ge.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import md.q;
import md.s;
import md.t;
import md.u;
import md.x;
import nd.c0;
import nd.q0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageConfigurationFactory {
    public static final PackageConfigurationFactory INSTANCE = new PackageConfigurationFactory();

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

    private PackageConfigurationFactory() {
    }

    private final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX INFO: renamed from: makeMultiTierPackageConfiguration-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m198makeMultiTierPackageConfigurationbMdYcbs(com.revenuecat.purchases.paywalls.PaywallData r19, java.util.List<java.lang.String> r20, java.util.List<com.revenuecat.purchases.Package> r21, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider r22, java.util.Set<java.lang.String> r23, java.util.Set<java.lang.String> r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationFactory.m198makeMultiTierPackageConfigurationbMdYcbs(com.revenuecat.purchases.paywalls.PaywallData, java.util.List, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider, java.util.Set, java.util.Set, java.lang.String):java.lang.Object");
    }

    /* JADX INFO: renamed from: makeMultiplePackageConfiguration-bMdYcbs, reason: not valid java name */
    private final Object m199makeMultiplePackageConfigurationbMdYcbs(List<Package> list, VariableDataProvider variableDataProvider, Set<String> set, Set<String> set2, PaywallData paywallData, String str, String str2) {
        Object next;
        s<Locale, List<TemplateConfiguration.PackageInfo>> sVarMakePackageInfo = makePackageInfo(list, variableDataProvider, set, set2, paywallData, str2);
        Locale localeA = sVarMakePackageInfo.a();
        List<TemplateConfiguration.PackageInfo> listB = sVarMakePackageInfo.b();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) c0.Y(listB);
        Iterator<T> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (r.b(((TemplateConfiguration.PackageInfo) next).getRcPackage().getIdentifier(), str)) {
                break;
            }
        }
        TemplateConfiguration.PackageInfo packageInfo2 = (TemplateConfiguration.PackageInfo) next;
        if (packageInfo2 == null) {
            packageInfo2 = packageInfo;
        }
        t.a aVar = t.f15576b;
        return t.b(x.a(localeA, new TemplateConfiguration.PackageConfiguration.Multiple(new TemplateConfiguration.PackageConfiguration.MultiPackage(packageInfo, packageInfo2, listB))));
    }

    private final s<Locale, List<TemplateConfiguration.PackageInfo>> makePackageInfo(List<Package> list, VariableDataProvider variableDataProvider, Set<String> set, Set<String> set2, PaywallData paywallData, String str) {
        String str2 = str;
        Price priceMostExpensivePricePerMonth = mostExpensivePricePerMonth(list);
        s<Locale, PaywallData.LocalizedConfiguration> localizedConfiguration = paywallData.getLocalizedConfiguration();
        Locale localeA = localizedConfiguration.a();
        PaywallData.LocalizedConfiguration localizedConfigurationB = localizedConfiguration.b();
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        for (Package r12 : list) {
            boolean zCurrentlySubscribed = PackageConfigurationFactoryKt.currentlySubscribed(r12, set, set2);
            Double dProductDiscount = INSTANCE.productDiscount(StoreProduct.DefaultImpls.pricePerMonth$default(r12.getProduct(), null, 1, null), priceMostExpensivePricePerMonth);
            arrayList.add(new TemplateConfiguration.PackageInfo(r12, ProcessedLocalizedConfiguration.Companion.create(variableDataProvider, new VariableProcessor.PackageContext(dProductDiscount, str2 != null ? paywallData.getZeroDecimalPlaceCountries().contains(str2) : false), localizedConfigurationB, r12, localeA), zCurrentlySubscribed, dProductDiscount));
            str2 = str;
            priceMostExpensivePricePerMonth = priceMostExpensivePricePerMonth;
        }
        return x.a(localeA, arrayList);
    }

    /* JADX INFO: renamed from: makeSinglePackageConfiguration-hUnOzRk, reason: not valid java name */
    private final Object m200makeSinglePackageConfigurationhUnOzRk(List<Package> list, VariableDataProvider variableDataProvider, Set<String> set, Set<String> set2, PaywallData paywallData, String str) {
        s<Locale, List<TemplateConfiguration.PackageInfo>> sVarMakePackageInfo = makePackageInfo(list, variableDataProvider, set, set2, paywallData, str);
        Locale localeA = sVarMakePackageInfo.a();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) c0.Y(sVarMakePackageInfo.b());
        t.a aVar = t.f15576b;
        return t.b(x.a(localeA, new TemplateConfiguration.PackageConfiguration.Single(packageInfo)));
    }

    private final Price mostExpensivePricePerMonth(List<Package> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            Price pricePricePerMonth$default = StoreProduct.DefaultImpls.pricePerMonth$default(((Package) it.next()).getProduct(), null, 1, null);
            if (pricePricePerMonth$default != null) {
                arrayList.add(pricePricePerMonth$default);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long amountMicros = ((Price) next).getAmountMicros();
                do {
                    Object next2 = it2.next();
                    long amountMicros2 = ((Price) next2).getAmountMicros();
                    if (amountMicros < amountMicros2) {
                        next = next2;
                        amountMicros = amountMicros2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Price) next;
    }

    private final Double productDiscount(Price price, Price price2) {
        if (price == null) {
            return null;
        }
        long amountMicros = price.getAmountMicros();
        if (price2 == null) {
            return null;
        }
        long amountMicros2 = price2.getAmountMicros();
        if (amountMicros >= amountMicros2) {
            return null;
        }
        return Double.valueOf((amountMicros2 - amountMicros) / amountMicros2);
    }

    private final List<TemplateConfiguration.PackageInfo> reprocessPackagesForTiers(List<Package> list, List<String> list2, PaywallData.LocalizedConfiguration localizedConfiguration, VariableDataProvider variableDataProvider, Set<String> set, Set<String> set2, Locale locale, String str, List<String> list3) {
        String str2 = str;
        ArrayList<Package> arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(((Package) obj).getIdentifier())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Package) it.next());
        }
        Price priceMostExpensivePricePerMonth = mostExpensivePricePerMonth(arrayList2);
        ArrayList arrayList3 = new ArrayList(v.x(arrayList, 10));
        for (Package r32 : arrayList) {
            Double dProductDiscount = INSTANCE.productDiscount(StoreProduct.DefaultImpls.pricePerMonth$default(r32.getProduct(), null, 1, null), priceMostExpensivePricePerMonth);
            arrayList3.add(new TemplateConfiguration.PackageInfo(r32, ProcessedLocalizedConfiguration.Companion.create(variableDataProvider, new VariableProcessor.PackageContext(dProductDiscount, str2 != null ? list3.contains(str2) : false), localizedConfiguration, r32, locale), PackageConfigurationFactoryKt.currentlySubscribed(r32, set, set2), dProductDiscount));
            str2 = str;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: createPackageConfiguration-tZkwj4A, reason: not valid java name */
    public final Object m201createPackageConfigurationtZkwj4A(VariableDataProvider variableDataProvider, List<Package> list, Set<String> set, Set<String> set2, List<String> list2, String str, PackageConfigurationType packageConfigurationType, PaywallData paywallData, String str2) {
        r.f(variableDataProvider, "variableDataProvider");
        r.f(list, "availablePackages");
        r.f(set, "activelySubscribedProductIdentifiers");
        r.f(set2, "nonSubscriptionProductIdentifiers");
        r.f(list2, "packageIdsInConfig");
        r.f(packageConfigurationType, "configurationType");
        r.f(paywallData, "paywallData");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(v.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((Package) obj).getIdentifier(), obj);
        }
        List<Package> arrayList = new ArrayList<>();
        for (String str3 : list2) {
            Package r11 = (Package) linkedHashMap.get(str3);
            if (r11 == null) {
                Logger.INSTANCE.d("Package with id " + str3 + " not found. Ignoring.");
            }
            if (r11 != null) {
                arrayList.add(r11);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = list;
        }
        if (arrayList.isEmpty()) {
            t.a aVar = t.f15576b;
            return t.b(u.a(new PackageConfigurationError("No packages found for ids " + list2)));
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[packageConfigurationType.ordinal()];
        if (i10 == 1) {
            return m200makeSinglePackageConfigurationhUnOzRk(arrayList, variableDataProvider, set, set2, paywallData, str2);
        }
        if (i10 == 2) {
            return m199makeMultiplePackageConfigurationbMdYcbs(arrayList, variableDataProvider, set, set2, paywallData, str, str2);
        }
        if (i10 == 3) {
            return m198makeMultiTierPackageConfigurationbMdYcbs(paywallData, list2, list, variableDataProvider, set, set2, str2);
        }
        throw new q();
    }
}
