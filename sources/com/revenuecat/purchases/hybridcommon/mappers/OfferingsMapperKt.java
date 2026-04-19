package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.s;
import md.x;
import nd.q0;
import nd.r0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsMapperKt {
    public static final Map<String, Object> map(Offering offering) {
        r.f(offering, "<this>");
        s[] sVarArr = new s[11];
        sVarArr[0] = x.a("identifier", offering.getIdentifier());
        sVarArr[1] = x.a("serverDescription", offering.getServerDescription());
        sVarArr[2] = x.a("metadata", offering.getMetadata());
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(v.x(availablePackages, 10));
        Iterator<T> it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(map((Package) it.next()));
        }
        sVarArr[3] = x.a("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        sVarArr[4] = x.a("lifetime", lifetime != null ? map(lifetime) : null);
        Package annual = offering.getAnnual();
        sVarArr[5] = x.a("annual", annual != null ? map(annual) : null);
        Package sixMonth = offering.getSixMonth();
        sVarArr[6] = x.a("sixMonth", sixMonth != null ? map(sixMonth) : null);
        Package threeMonth = offering.getThreeMonth();
        sVarArr[7] = x.a("threeMonth", threeMonth != null ? map(threeMonth) : null);
        Package twoMonth = offering.getTwoMonth();
        sVarArr[8] = x.a("twoMonth", twoMonth != null ? map(twoMonth) : null);
        Package monthly = offering.getMonthly();
        sVarArr[9] = x.a("monthly", monthly != null ? map(monthly) : null);
        Package weekly = offering.getWeekly();
        sVarArr[10] = x.a("weekly", weekly != null ? map(weekly) : null);
        return r0.h(sVarArr);
    }

    public static final Map<String, Object> map(Offerings offerings) {
        r.f(offerings, "<this>");
        s[] sVarArr = new s[2];
        Map<String, Offering> all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        sVarArr[0] = x.a("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        sVarArr[1] = x.a("current", current != null ? map(current) : null);
        return r0.h(sVarArr);
    }

    public static final Map<String, Object> map(Package r32) {
        r.f(r32, "<this>");
        return r0.h(x.a("identifier", r32.getIdentifier()), x.a("packageType", r32.getPackageType().name()), x.a("product", StoreProductMapperKt.map(r32.getProduct())), x.a("offeringIdentifier", r32.getPresentedOfferingContext().getOfferingIdentifier()), x.a("presentedOfferingContext", map(r32.getPresentedOfferingContext())));
    }

    public static final Map<String, Object> map(PresentedOfferingContext.TargetingContext targetingContext) {
        r.f(targetingContext, "<this>");
        return r0.h(x.a("revision", Integer.valueOf(targetingContext.getRevision())), x.a("ruleId", targetingContext.getRuleId()));
    }

    public static final Map<String, Object> map(PresentedOfferingContext presentedOfferingContext) {
        r.f(presentedOfferingContext, "<this>");
        s[] sVarArr = new s[3];
        sVarArr[0] = x.a("offeringIdentifier", presentedOfferingContext.getOfferingIdentifier());
        sVarArr[1] = x.a("placementIdentifier", presentedOfferingContext.getPlacementIdentifier());
        PresentedOfferingContext.TargetingContext targetingContext = presentedOfferingContext.getTargetingContext();
        sVarArr[2] = x.a("targetingContext", targetingContext != null ? map(targetingContext) : null);
        return r0.h(sVarArr);
    }
}
