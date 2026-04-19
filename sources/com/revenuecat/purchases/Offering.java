package com.revenuecat.purchases;

import ae.j;
import ae.r;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import md.l;
import md.n;

/* JADX INFO: loaded from: classes2.dex */
public final class Offering {
    private final l annual$delegate;
    private final List<Package> availablePackages;
    private final String identifier;
    private final l lifetime$delegate;
    private final Map<String, Object> metadata;
    private final l monthly$delegate;
    private final PaywallData paywall;
    private final String serverDescription;
    private final l sixMonth$delegate;
    private final l threeMonth$delegate;
    private final l twoMonth$delegate;
    private final l weekly$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list) {
        this(str, str2, map, list, null, 16, null);
        r.f(str, "identifier");
        r.f(str2, "serverDescription");
        r.f(map, "metadata");
        r.f(list, "availablePackages");
    }

    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData) {
        r.f(str, "identifier");
        r.f(str2, "serverDescription");
        r.f(map, "metadata");
        r.f(list, "availablePackages");
        this.identifier = str;
        this.serverDescription = str2;
        this.metadata = map;
        this.availablePackages = list;
        this.paywall = paywallData;
        this.lifetime$delegate = n.b(new Offering$lifetime$2(this));
        this.annual$delegate = n.b(new Offering$annual$2(this));
        this.sixMonth$delegate = n.b(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = n.b(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = n.b(new Offering$twoMonth$2(this));
        this.monthly$delegate = n.b(new Offering$monthly$2(this));
        this.weekly$delegate = n.b(new Offering$weekly$2(this));
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, int i10, j jVar) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map map, List list, PaywallData paywallData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            map = offering.metadata;
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            list = offering.availablePackages;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            paywallData = offering.paywall;
        }
        return offering.copy(str, str3, map2, list2, paywallData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (r.b(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                break;
            }
        }
        return (Package) next;
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    public final PaywallData component5() {
        return this.paywall;
    }

    public final Offering copy(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData) {
        r.f(str, "identifier");
        r.f(str2, "serverDescription");
        r.f(map, "metadata");
        r.f(list, "availablePackages");
        return new Offering(str, str2, map, list, paywallData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return r.b(this.identifier, offering.identifier) && r.b(this.serverDescription, offering.serverDescription) && r.b(this.metadata, offering.metadata) && r.b(this.availablePackages, offering.availablePackages) && r.b(this.paywall, offering.paywall);
    }

    public final Package get(String str) {
        r.f(str, "s");
        return getPackage(str);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String str, String str2) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(str2, "default");
        Object obj = this.metadata.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String str) {
        r.f(str, "identifier");
        for (Package r12 : this.availablePackages) {
            if (r.b(r12.getIdentifier(), str)) {
                return r12;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        return iHashCode + (paywallData == null ? 0 : paywallData.hashCode());
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ')';
    }
}
