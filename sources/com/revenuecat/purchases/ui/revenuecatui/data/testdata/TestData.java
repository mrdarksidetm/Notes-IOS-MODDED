package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template1TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template2TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template3TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template4TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template5TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template7CustomPackagesTestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template7TestDataKt;
import java.net.URL;
import java.util.List;
import java.util.Map;
import l1.j0;
import nd.r0;
import nd.t;
import nd.u;
import q0.h;

/* JADX INFO: loaded from: classes2.dex */
public final class TestData {
    public static final TestData INSTANCE;
    private static final Offering offeringWithNoPaywall;
    private static final Offering template1Offering;
    private static final Offering template1OfferingNoFooter;
    private static final Offering template2Offering;
    private static final Offering template3Offering;
    private static final Offering template4Offering;
    private static final Offering template5Offering;
    private static final Offering template7CustomPackageOffering;
    private static final Offering template7Offering;

    public static final class Constants {
        public static final int $stable;
        private static final h currentColorScheme;
        public static final Constants INSTANCE = new Constants();
        private static final PaywallData.Configuration.Images images = new PaywallData.Configuration.Images("9a17e0a7_1689854430..jpeg", "9a17e0a7_1689854342..jpg", "9a17e0a7_1689854430..jpeg");
        private static final URL assetBaseURL = new URL("https://assets.pawwalls.com");
        private static final List<String> zeroDecimalPlaceCountries = u.p("PH", "KZ", "TW", "MX", "TH");
        private static final PaywallData.LocalizedConfiguration localization = new PaywallData.LocalizedConfiguration("Call to action for _better_ conversion.", "Lorem ipsum is simply dummy text of the ~printing and~ typesetting industry.", "Subscribe for {{ sub_price_per_month }}/mo", (String) null, (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", u.m(), (String) null, (Map) null, 3224, (j) null);

        static {
            j0.a aVar = j0.f14524b;
            currentColorScheme = new h(aVar.k(), aVar.k(), aVar.k(), aVar.k(), aVar.f(), aVar.a(), aVar.a(), aVar.a(), aVar.a(), aVar.c(), aVar.a(), aVar.e(), aVar.k(), aVar.k(), aVar.a(), aVar.e(), aVar.a(), aVar.d(), aVar.k(), aVar.g(), aVar.a(), aVar.k(), aVar.h(), aVar.k(), aVar.h(), aVar.k(), aVar.i(), aVar.g(), aVar.e(), null);
            $stable = 8;
        }

        private Constants() {
        }

        public final URL getAssetBaseURL() {
            return assetBaseURL;
        }

        public final h getCurrentColorScheme() {
            return currentColorScheme;
        }

        public final PaywallData.Configuration.Images getImages() {
            return images;
        }

        public final PaywallData.LocalizedConfiguration getLocalization() {
            return localization;
        }

        public final List<String> getZeroDecimalPlaceCountries() {
            return zeroDecimalPlaceCountries;
        }
    }

    public static final class Packages {
        public static final int $stable;
        public static final Packages INSTANCE = new Packages();
        private static final Package annual;
        private static final Package annualEuros;
        private static final Package annualTaiwan;
        private static final Package bimonthly;
        private static final Package custom;
        private static final Package lifetime;
        private static final Package monthly;
        private static final Package monthlyMexico;
        private static final Package quarterly;
        private static final Package quarterlyThailand;
        private static final Package semester;
        private static final Package unknown;
        private static final Package weekly;

        static {
            PackageType packageType = PackageType.WEEKLY;
            String identifier = packageType.getIdentifier();
            r.c(identifier);
            Price price = new Price("$1.49", 1490000L, "USD");
            Period.Unit unit = Period.Unit.WEEK;
            weekly = new Package(identifier, packageType, new TestStoreProduct("com.revenuecat.weekly_product", "Weekly", "Weekly (App name)", "Weekly", price, new Period(1, unit, "P1W"), null, null, 192, null), "offering");
            PackageType packageType2 = PackageType.MONTHLY;
            String identifier2 = packageType2.getIdentifier();
            r.c(identifier2);
            Price price2 = new Price("$7.99", 7990000L, "USD");
            Period.Unit unit2 = Period.Unit.MONTH;
            monthly = new Package(identifier2, packageType2, new TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", price2, new Period(1, unit2, "P1M"), null, null, 192, null), "offering");
            PackageType packageType3 = PackageType.ANNUAL;
            String identifier3 = packageType3.getIdentifier();
            r.c(identifier3);
            Price price3 = new Price("$67.99", 67990000L, "USD");
            Period.Unit unit3 = Period.Unit.YEAR;
            annual = new Package(identifier3, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", price3, new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), null, 128, null), "offering");
            String identifier4 = packageType3.getIdentifier();
            r.c(identifier4);
            annualEuros = new Package(identifier4, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new Price("67,99 €", 67990000L, "EUR"), new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), null, 128, null), "offering");
            PackageType packageType4 = PackageType.LIFETIME;
            String identifier5 = packageType4.getIdentifier();
            r.c(identifier5);
            lifetime = new Package(identifier5, packageType4, new TestStoreProduct("com.revenuecat.lifetime_product", "Lifetime", "Lifetime (App name)", "Lifetime", new Price("$1,000", 1000000000L, "USD"), null, null, null, 192, null), "offering");
            PackageType packageType5 = PackageType.TWO_MONTH;
            String identifier6 = packageType5.getIdentifier();
            r.c(identifier6);
            bimonthly = new Package(identifier6, packageType5, new TestStoreProduct("com.revenuecat.bimonthly_product", "2 month", "2 month (App name)", "2 month", new Price("$15.99", 15990000L, "USD"), new Period(2, unit2, "P2M"), null, new Price("$3.99", 3990000L, "USD"), 64, null), "offering");
            PackageType packageType6 = PackageType.THREE_MONTH;
            String identifier7 = packageType6.getIdentifier();
            r.c(identifier7);
            quarterly = new Package(identifier7, packageType6, new TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", new Price("$23.99", 23990000L, "USD"), new Period(3, unit2, "P3M"), new Period(2, unit, "P2W"), new Price("$3.99", 3990000L, "USD")), "offering");
            PackageType packageType7 = PackageType.SIX_MONTH;
            String identifier8 = packageType7.getIdentifier();
            r.c(identifier8);
            semester = new Package(identifier8, packageType7, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), null, null, 192, null), "offering");
            custom = new Package("Custom", PackageType.CUSTOM, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), null, null, 192, null), "offering");
            unknown = new Package("Unknown", PackageType.UNKNOWN, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), null, null, 192, null), "offering");
            String identifier9 = packageType3.getIdentifier();
            r.c(identifier9);
            annualTaiwan = new Package(identifier9, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new Price("NT$67.00", 67000000L, "TWD"), new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), null, 128, null), "offering");
            String identifier10 = packageType2.getIdentifier();
            r.c(identifier10);
            monthlyMexico = new Package(identifier10, packageType2, new TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", new Price("$8.00", 8000000L, "MXN"), new Period(1, unit2, "P1M"), null, null, 192, null), "offering");
            String identifier11 = packageType6.getIdentifier();
            r.c(identifier11);
            quarterlyThailand = new Package(identifier11, packageType6, new TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", new Price("THB24.00", 24000000L, "THB"), new Period(3, unit2, "P3M"), null, new Price("THB4.00", 4000000L, "THB"), 64, null), "offering");
            $stable = 8;
        }

        private Packages() {
        }

        public final Package getAnnual() {
            return annual;
        }

        public final Package getAnnualEuros() {
            return annualEuros;
        }

        public final Package getAnnualTaiwan() {
            return annualTaiwan;
        }

        public final Package getBimonthly() {
            return bimonthly;
        }

        public final Package getCustom() {
            return custom;
        }

        public final Package getLifetime() {
            return lifetime;
        }

        public final Package getMonthly() {
            return monthly;
        }

        public final Package getMonthlyMexico() {
            return monthlyMexico;
        }

        public final Package getQuarterly() {
            return quarterly;
        }

        public final Package getQuarterlyThailand() {
            return quarterlyThailand;
        }

        public final Package getSemester() {
            return semester;
        }

        public final Package getUnknown() {
            return unknown;
        }

        public final Package getWeekly() {
            return weekly;
        }
    }

    static {
        TestData testData = new TestData();
        INSTANCE = testData;
        Packages packages = Packages.INSTANCE;
        offeringWithNoPaywall = new Offering("Template1", "", r0.e(), t.d(packages.getMonthly()), null);
        template1Offering = new Offering("Template1", "", r0.e(), t.d(packages.getMonthly()), Template1TestDataKt.getTemplate1(testData));
        List listD = t.d(packages.getMonthly());
        Map mapE = r0.e();
        PaywallData template1 = Template1TestDataKt.getTemplate1(testData);
        PaywallData.Configuration config = Template1TestDataKt.getTemplate1(testData).getConfig();
        template1OfferingNoFooter = new Offering("Template1", "", mapE, listD, template1.copy((253 & 1) != 0 ? template1.templateName : null, (253 & 2) != 0 ? template1.config : config.copy((7743 & 1) != 0 ? config.packageIds : null, (7743 & 2) != 0 ? config.defaultPackage : null, (7743 & 4) != 0 ? config.imagesWebp : null, (7743 & 8) != 0 ? config.legacyImages : null, (7743 & 16) != 0 ? config.imagesByTier : null, (7743 & 32) != 0 ? config.blurredBackgroundImage : false, (7743 & 64) != 0 ? config.displayRestorePurchases : false, (7743 & 128) != 0 ? config.termsOfServiceURL : null, (7743 & 256) != 0 ? config.privacyURL : null, (7743 & 512) != 0 ? config.colors : null, (7743 & 1024) != 0 ? config.colorsByTier : null, (7743 & 2048) != 0 ? config.tiers : null, (7743 & 4096) != 0 ? config.defaultTier : null), (253 & 4) != 0 ? template1.assetBaseURL : null, (253 & 8) != 0 ? template1.revision : 0, (253 & 16) != 0 ? template1.localization : null, (253 & 32) != 0 ? template1.localizationByTier : null, (253 & 64) != 0 ? template1.zeroDecimalPlaceCountries : null, (253 & 128) != 0 ? template1.defaultLocale : null));
        template2Offering = new Offering("Template2", "", r0.e(), u.p(packages.getWeekly(), packages.getMonthly(), packages.getAnnual(), packages.getLifetime()), Template2TestDataKt.getTemplate2(testData));
        template3Offering = new Offering("Template3", "", r0.e(), t.d(packages.getMonthly()), Template3TestDataKt.getTemplate3(testData));
        template4Offering = new Offering("Template4", "", r0.e(), u.p(packages.getMonthly(), packages.getSemester(), packages.getAnnual(), packages.getWeekly()), Template4TestDataKt.getTemplate4(testData));
        template5Offering = new Offering("Template5", "", r0.e(), u.p(packages.getMonthly(), packages.getAnnual()), Template5TestDataKt.getTemplate5(testData));
        template7Offering = new Offering("Template7", "", r0.e(), u.p(packages.getMonthly(), packages.getAnnual(), packages.getBimonthly(), packages.getQuarterly(), packages.getSemester(), packages.getLifetime()), Template7TestDataKt.getTemplate7(testData));
        template7CustomPackageOffering = new Offering("Template7CustomPackage", "", r0.e(), u.p(packages.getMonthly(), packages.getAnnual(), packages.getBimonthly(), packages.getQuarterly(), packages.getSemester(), packages.getLifetime()), Template7CustomPackagesTestDataKt.getTemplate7CustomPackages(testData));
    }

    private TestData() {
    }

    public final Offering getOfferingWithNoPaywall() {
        return offeringWithNoPaywall;
    }

    public final Offering getTemplate1Offering() {
        return template1Offering;
    }

    public final Offering getTemplate1OfferingNoFooter() {
        return template1OfferingNoFooter;
    }

    public final Offering getTemplate2Offering() {
        return template2Offering;
    }

    public final Offering getTemplate3Offering() {
        return template3Offering;
    }

    public final Offering getTemplate4Offering() {
        return template4Offering;
    }

    public final Offering getTemplate5Offering() {
        return template5Offering;
    }

    public final Offering getTemplate7CustomPackageOffering() {
        return template7CustomPackageOffering;
    }

    public final Offering getTemplate7Offering() {
        return template7Offering;
    }
}
