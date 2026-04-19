package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.j;
import ae.r;
import android.net.Uri;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l1.j0;
import nd.t;
import nd.v;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateConfiguration {
    private final PaywallData.Configuration.ColorInformation colors;
    private final PaywallData.Configuration configuration;
    private final Colors darkModeColors;
    private final Images images;
    private final Map<String, Images> imagesByTier;
    private final Colors lightModeColors;
    private final Locale locale;
    private final PaywallMode mode;
    private final PackageConfiguration packages;
    private final PaywallTemplate template;

    public static final class Colors {
        public static final int $stable = 0;
        private final long accent1;
        private final long accent2;
        private final long accent3;
        private final long background;
        private final long callToActionBackground;
        private final long callToActionForeground;
        private final j0 callToActionSecondaryBackground;
        private final j0 closeButton;
        private final long text1;
        private final long text2;
        private final long text3;
        private final j0 tierControlBackground;
        private final j0 tierControlForeground;
        private final j0 tierControlSelectedBackground;
        private final j0 tierControlSelectedForeground;

        private Colors(long j10, long j11, long j12, long j13, long j14, long j15, j0 j0Var, long j16, long j17, long j18, j0 j0Var2, j0 j0Var3, j0 j0Var4, j0 j0Var5, j0 j0Var6) {
            this.background = j10;
            this.text1 = j11;
            this.text2 = j12;
            this.text3 = j13;
            this.callToActionBackground = j14;
            this.callToActionForeground = j15;
            this.callToActionSecondaryBackground = j0Var;
            this.accent1 = j16;
            this.accent2 = j17;
            this.accent3 = j18;
            this.closeButton = j0Var2;
            this.tierControlBackground = j0Var3;
            this.tierControlForeground = j0Var4;
            this.tierControlSelectedBackground = j0Var5;
            this.tierControlSelectedForeground = j0Var6;
        }

        public /* synthetic */ Colors(long j10, long j11, long j12, long j13, long j14, long j15, j0 j0Var, long j16, long j17, long j18, j0 j0Var2, j0 j0Var3, j0 j0Var4, j0 j0Var5, j0 j0Var6, j jVar) {
            this(j10, j11, j12, j13, j14, j15, j0Var, j16, j17, j18, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m203component10d7_KjU() {
            return this.background;
        }

        /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name */
        public final long m204component100d7_KjU() {
            return this.accent3;
        }

        /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name */
        public final j0 m205component11QN2ZGVo() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name */
        public final j0 m206component12QN2ZGVo() {
            return this.tierControlBackground;
        }

        /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name */
        public final j0 m207component13QN2ZGVo() {
            return this.tierControlForeground;
        }

        /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name */
        public final j0 m208component14QN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        /* JADX INFO: renamed from: component15-QN2ZGVo, reason: not valid java name */
        public final j0 m209component15QN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m210component20d7_KjU() {
            return this.text1;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
        public final long m211component30d7_KjU() {
            return this.text2;
        }

        /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
        public final long m212component40d7_KjU() {
            return this.text3;
        }

        /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
        public final long m213component50d7_KjU() {
            return this.callToActionBackground;
        }

        /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
        public final long m214component60d7_KjU() {
            return this.callToActionForeground;
        }

        /* JADX INFO: renamed from: component7-QN2ZGVo, reason: not valid java name */
        public final j0 m215component7QN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name */
        public final long m216component80d7_KjU() {
            return this.accent1;
        }

        /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name */
        public final long m217component90d7_KjU() {
            return this.accent2;
        }

        /* JADX INFO: renamed from: copy-VbAgQ-U, reason: not valid java name */
        public final Colors m218copyVbAgQU(long j10, long j11, long j12, long j13, long j14, long j15, j0 j0Var, long j16, long j17, long j18, j0 j0Var2, j0 j0Var3, j0 j0Var4, j0 j0Var5, j0 j0Var6) {
            return new Colors(j10, j11, j12, j13, j14, j15, j0Var, j16, j17, j18, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) obj;
            return j0.w(this.background, colors.background) && j0.w(this.text1, colors.text1) && j0.w(this.text2, colors.text2) && j0.w(this.text3, colors.text3) && j0.w(this.callToActionBackground, colors.callToActionBackground) && j0.w(this.callToActionForeground, colors.callToActionForeground) && r.b(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && j0.w(this.accent1, colors.accent1) && j0.w(this.accent2, colors.accent2) && j0.w(this.accent3, colors.accent3) && r.b(this.closeButton, colors.closeButton) && r.b(this.tierControlBackground, colors.tierControlBackground) && r.b(this.tierControlForeground, colors.tierControlForeground) && r.b(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && r.b(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
        }

        /* JADX INFO: renamed from: getAccent1-0d7_KjU, reason: not valid java name */
        public final long m219getAccent10d7_KjU() {
            return this.accent1;
        }

        /* JADX INFO: renamed from: getAccent2-0d7_KjU, reason: not valid java name */
        public final long m220getAccent20d7_KjU() {
            return this.accent2;
        }

        /* JADX INFO: renamed from: getAccent3-0d7_KjU, reason: not valid java name */
        public final long m221getAccent30d7_KjU() {
            return this.accent3;
        }

        /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m222getBackground0d7_KjU() {
            return this.background;
        }

        /* JADX INFO: renamed from: getCallToActionBackground-0d7_KjU, reason: not valid java name */
        public final long m223getCallToActionBackground0d7_KjU() {
            return this.callToActionBackground;
        }

        /* JADX INFO: renamed from: getCallToActionForeground-0d7_KjU, reason: not valid java name */
        public final long m224getCallToActionForeground0d7_KjU() {
            return this.callToActionForeground;
        }

        /* JADX INFO: renamed from: getCallToActionSecondaryBackground-QN2ZGVo, reason: not valid java name */
        public final j0 m225getCallToActionSecondaryBackgroundQN2ZGVo() {
            return this.callToActionSecondaryBackground;
        }

        /* JADX INFO: renamed from: getCloseButton-QN2ZGVo, reason: not valid java name */
        public final j0 m226getCloseButtonQN2ZGVo() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: getText1-0d7_KjU, reason: not valid java name */
        public final long m227getText10d7_KjU() {
            return this.text1;
        }

        /* JADX INFO: renamed from: getText2-0d7_KjU, reason: not valid java name */
        public final long m228getText20d7_KjU() {
            return this.text2;
        }

        /* JADX INFO: renamed from: getText3-0d7_KjU, reason: not valid java name */
        public final long m229getText30d7_KjU() {
            return this.text3;
        }

        /* JADX INFO: renamed from: getTierControlBackground-QN2ZGVo, reason: not valid java name */
        public final j0 m230getTierControlBackgroundQN2ZGVo() {
            return this.tierControlBackground;
        }

        /* JADX INFO: renamed from: getTierControlForeground-QN2ZGVo, reason: not valid java name */
        public final j0 m231getTierControlForegroundQN2ZGVo() {
            return this.tierControlForeground;
        }

        /* JADX INFO: renamed from: getTierControlSelectedBackground-QN2ZGVo, reason: not valid java name */
        public final j0 m232getTierControlSelectedBackgroundQN2ZGVo() {
            return this.tierControlSelectedBackground;
        }

        /* JADX INFO: renamed from: getTierControlSelectedForeground-QN2ZGVo, reason: not valid java name */
        public final j0 m233getTierControlSelectedForegroundQN2ZGVo() {
            return this.tierControlSelectedForeground;
        }

        public int hashCode() {
            int iC = ((((((((((j0.C(this.background) * 31) + j0.C(this.text1)) * 31) + j0.C(this.text2)) * 31) + j0.C(this.text3)) * 31) + j0.C(this.callToActionBackground)) * 31) + j0.C(this.callToActionForeground)) * 31;
            j0 j0Var = this.callToActionSecondaryBackground;
            int iC2 = (((((((iC + (j0Var == null ? 0 : j0.C(j0Var.E()))) * 31) + j0.C(this.accent1)) * 31) + j0.C(this.accent2)) * 31) + j0.C(this.accent3)) * 31;
            j0 j0Var2 = this.closeButton;
            int iC3 = (iC2 + (j0Var2 == null ? 0 : j0.C(j0Var2.E()))) * 31;
            j0 j0Var3 = this.tierControlBackground;
            int iC4 = (iC3 + (j0Var3 == null ? 0 : j0.C(j0Var3.E()))) * 31;
            j0 j0Var4 = this.tierControlForeground;
            int iC5 = (iC4 + (j0Var4 == null ? 0 : j0.C(j0Var4.E()))) * 31;
            j0 j0Var5 = this.tierControlSelectedBackground;
            int iC6 = (iC5 + (j0Var5 == null ? 0 : j0.C(j0Var5.E()))) * 31;
            j0 j0Var6 = this.tierControlSelectedForeground;
            return iC6 + (j0Var6 != null ? j0.C(j0Var6.E()) : 0);
        }

        public String toString() {
            return "Colors(background=" + ((Object) j0.D(this.background)) + ", text1=" + ((Object) j0.D(this.text1)) + ", text2=" + ((Object) j0.D(this.text2)) + ", text3=" + ((Object) j0.D(this.text3)) + ", callToActionBackground=" + ((Object) j0.D(this.callToActionBackground)) + ", callToActionForeground=" + ((Object) j0.D(this.callToActionForeground)) + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + ((Object) j0.D(this.accent1)) + ", accent2=" + ((Object) j0.D(this.accent2)) + ", accent3=" + ((Object) j0.D(this.accent3)) + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
        }
    }

    public static final class Images {
        public static final int $stable = 8;
        private final Uri backgroundUri;
        private final Uri headerUri;
        private final Uri iconUri;

        public Images(Uri uri, Uri uri2, Uri uri3) {
            this.iconUri = uri;
            this.backgroundUri = uri2;
            this.headerUri = uri3;
        }

        public static /* synthetic */ Images copy$default(Images images, Uri uri, Uri uri2, Uri uri3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = images.iconUri;
            }
            if ((i10 & 2) != 0) {
                uri2 = images.backgroundUri;
            }
            if ((i10 & 4) != 0) {
                uri3 = images.headerUri;
            }
            return images.copy(uri, uri2, uri3);
        }

        public final Uri component1() {
            return this.iconUri;
        }

        public final Uri component2() {
            return this.backgroundUri;
        }

        public final Uri component3() {
            return this.headerUri;
        }

        public final Images copy(Uri uri, Uri uri2, Uri uri3) {
            return new Images(uri, uri2, uri3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return r.b(this.iconUri, images.iconUri) && r.b(this.backgroundUri, images.backgroundUri) && r.b(this.headerUri, images.headerUri);
        }

        public final Uri getBackgroundUri() {
            return this.backgroundUri;
        }

        public final Uri getHeaderUri() {
            return this.headerUri;
        }

        public final Uri getIconUri() {
            return this.iconUri;
        }

        public int hashCode() {
            Uri uri = this.iconUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            Uri uri2 = this.backgroundUri;
            int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Uri uri3 = this.headerUri;
            return iHashCode2 + (uri3 != null ? uri3.hashCode() : 0);
        }

        public String toString() {
            return "Images(iconUri=" + this.iconUri + ", backgroundUri=" + this.backgroundUri + ", headerUri=" + this.headerUri + ')';
        }
    }

    public static abstract class PackageConfiguration {
        public static final int $stable = 0;

        public static final class MultiPackage {
            public static final int $stable = 8;
            private final List<PackageInfo> all;

            /* JADX INFO: renamed from: default, reason: not valid java name */
            private final PackageInfo f5default;
            private final PackageInfo first;

            public MultiPackage(PackageInfo packageInfo, PackageInfo packageInfo2, List<PackageInfo> list) {
                r.f(packageInfo, "first");
                r.f(packageInfo2, "default");
                r.f(list, "all");
                this.first = packageInfo;
                this.f5default = packageInfo2;
                this.all = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MultiPackage copy$default(MultiPackage multiPackage, PackageInfo packageInfo, PackageInfo packageInfo2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    packageInfo = multiPackage.first;
                }
                if ((i10 & 2) != 0) {
                    packageInfo2 = multiPackage.f5default;
                }
                if ((i10 & 4) != 0) {
                    list = multiPackage.all;
                }
                return multiPackage.copy(packageInfo, packageInfo2, list);
            }

            public final PackageInfo component1() {
                return this.first;
            }

            public final PackageInfo component2() {
                return this.f5default;
            }

            public final List<PackageInfo> component3() {
                return this.all;
            }

            public final MultiPackage copy(PackageInfo packageInfo, PackageInfo packageInfo2, List<PackageInfo> list) {
                r.f(packageInfo, "first");
                r.f(packageInfo2, "default");
                r.f(list, "all");
                return new MultiPackage(packageInfo, packageInfo2, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiPackage)) {
                    return false;
                }
                MultiPackage multiPackage = (MultiPackage) obj;
                return r.b(this.first, multiPackage.first) && r.b(this.f5default, multiPackage.f5default) && r.b(this.all, multiPackage.all);
            }

            public final List<PackageInfo> getAll() {
                return this.all;
            }

            public final PackageInfo getDefault() {
                return this.f5default;
            }

            public final PackageInfo getFirst() {
                return this.first;
            }

            public int hashCode() {
                return (((this.first.hashCode() * 31) + this.f5default.hashCode()) * 31) + this.all.hashCode();
            }

            public String toString() {
                return "MultiPackage(first=" + this.first + ", default=" + this.f5default + ", all=" + this.all + ')';
            }
        }

        public static final class MultiTier extends PackageConfiguration {
            public static final int $stable = 8;
            private final List<TierInfo> allTiers;
            private final TierInfo defaultTier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiTier(TierInfo tierInfo, List<TierInfo> list) {
                super(null);
                r.f(tierInfo, "defaultTier");
                r.f(list, "allTiers");
                this.defaultTier = tierInfo;
                this.allTiers = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MultiTier copy$default(MultiTier multiTier, TierInfo tierInfo, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    tierInfo = multiTier.defaultTier;
                }
                if ((i10 & 2) != 0) {
                    list = multiTier.allTiers;
                }
                return multiTier.copy(tierInfo, list);
            }

            public final TierInfo component1() {
                return this.defaultTier;
            }

            public final List<TierInfo> component2() {
                return this.allTiers;
            }

            public final MultiTier copy(TierInfo tierInfo, List<TierInfo> list) {
                r.f(tierInfo, "defaultTier");
                r.f(list, "allTiers");
                return new MultiTier(tierInfo, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultiTier)) {
                    return false;
                }
                MultiTier multiTier = (MultiTier) obj;
                return r.b(this.defaultTier, multiTier.defaultTier) && r.b(this.allTiers, multiTier.allTiers);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                List<TierInfo> list = this.allTiers;
                ArrayList arrayList = new ArrayList(v.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TierInfo) it.next()).getPackages());
                }
                return v.z(arrayList);
            }

            public final List<TierInfo> getAllTiers() {
                return this.allTiers;
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.defaultTier.getDefaultPackage();
            }

            public final TierInfo getDefaultTier() {
                return this.defaultTier;
            }

            public int hashCode() {
                return (this.defaultTier.hashCode() * 31) + this.allTiers.hashCode();
            }

            public String toString() {
                return "MultiTier(defaultTier=" + this.defaultTier + ", allTiers=" + this.allTiers + ')';
            }
        }

        public static final class Multiple extends PackageConfiguration {
            public static final int $stable = 8;
            private final MultiPackage multiPackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Multiple(MultiPackage multiPackage) {
                super(null);
                r.f(multiPackage, "multiPackage");
                this.multiPackage = multiPackage;
            }

            public static /* synthetic */ Multiple copy$default(Multiple multiple, MultiPackage multiPackage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    multiPackage = multiple.multiPackage;
                }
                return multiple.copy(multiPackage);
            }

            public final MultiPackage component1() {
                return this.multiPackage;
            }

            public final Multiple copy(MultiPackage multiPackage) {
                r.f(multiPackage, "multiPackage");
                return new Multiple(multiPackage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Multiple) && r.b(this.multiPackage, ((Multiple) obj).multiPackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                return this.multiPackage.getAll();
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.multiPackage.getDefault();
            }

            public final MultiPackage getMultiPackage() {
                return this.multiPackage;
            }

            public int hashCode() {
                return this.multiPackage.hashCode();
            }

            public String toString() {
                return "Multiple(multiPackage=" + this.multiPackage + ')';
            }
        }

        public static final class Single extends PackageConfiguration {
            public static final int $stable = 8;
            private final PackageInfo singlePackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Single(PackageInfo packageInfo) {
                super(null);
                r.f(packageInfo, "singlePackage");
                this.singlePackage = packageInfo;
            }

            public static /* synthetic */ Single copy$default(Single single, PackageInfo packageInfo, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    packageInfo = single.singlePackage;
                }
                return single.copy(packageInfo);
            }

            public final PackageInfo component1() {
                return this.singlePackage;
            }

            public final Single copy(PackageInfo packageInfo) {
                r.f(packageInfo, "singlePackage");
                return new Single(packageInfo);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Single) && r.b(this.singlePackage, ((Single) obj).singlePackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public List<PackageInfo> getAll() {
                return t.d(this.singlePackage);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration
            public PackageInfo getDefault() {
                return this.singlePackage;
            }

            public final PackageInfo getSinglePackage() {
                return this.singlePackage;
            }

            public int hashCode() {
                return this.singlePackage.hashCode();
            }

            public String toString() {
                return "Single(singlePackage=" + this.singlePackage + ')';
            }
        }

        private PackageConfiguration() {
        }

        public /* synthetic */ PackageConfiguration(j jVar) {
            this();
        }

        public abstract List<PackageInfo> getAll();

        public abstract PackageInfo getDefault();
    }

    public static final class PackageInfo {
        public static final int $stable = 8;
        private final boolean currentlySubscribed;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final ProcessedLocalizedConfiguration localization;
        private final Package rcPackage;

        public PackageInfo(Package r22, ProcessedLocalizedConfiguration processedLocalizedConfiguration, boolean z10, Double d10) {
            r.f(r22, "rcPackage");
            r.f(processedLocalizedConfiguration, "localization");
            this.rcPackage = r22;
            this.localization = processedLocalizedConfiguration;
            this.currentlySubscribed = z10;
            this.discountRelativeToMostExpensivePerMonth = d10;
        }

        public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, Package r12, ProcessedLocalizedConfiguration processedLocalizedConfiguration, boolean z10, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                r12 = packageInfo.rcPackage;
            }
            if ((i10 & 2) != 0) {
                processedLocalizedConfiguration = packageInfo.localization;
            }
            if ((i10 & 4) != 0) {
                z10 = packageInfo.currentlySubscribed;
            }
            if ((i10 & 8) != 0) {
                d10 = packageInfo.discountRelativeToMostExpensivePerMonth;
            }
            return packageInfo.copy(r12, processedLocalizedConfiguration, z10, d10);
        }

        public final Package component1() {
            return this.rcPackage;
        }

        public final ProcessedLocalizedConfiguration component2() {
            return this.localization;
        }

        public final boolean component3() {
            return this.currentlySubscribed;
        }

        public final Double component4() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final PackageInfo copy(Package r22, ProcessedLocalizedConfiguration processedLocalizedConfiguration, boolean z10, Double d10) {
            r.f(r22, "rcPackage");
            r.f(processedLocalizedConfiguration, "localization");
            return new PackageInfo(r22, processedLocalizedConfiguration, z10, d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackageInfo)) {
                return false;
            }
            PackageInfo packageInfo = (PackageInfo) obj;
            return r.b(this.rcPackage, packageInfo.rcPackage) && r.b(this.localization, packageInfo.localization) && this.currentlySubscribed == packageInfo.currentlySubscribed && r.b(this.discountRelativeToMostExpensivePerMonth, packageInfo.discountRelativeToMostExpensivePerMonth);
        }

        public final boolean getCurrentlySubscribed() {
            return this.currentlySubscribed;
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final ProcessedLocalizedConfiguration getLocalization() {
            return this.localization;
        }

        public final Package getRcPackage() {
            return this.rcPackage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = ((this.rcPackage.hashCode() * 31) + this.localization.hashCode()) * 31;
            boolean z10 = this.currentlySubscribed;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int i10 = (iHashCode + r12) * 31;
            Double d10 = this.discountRelativeToMostExpensivePerMonth;
            return i10 + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            return "PackageInfo(rcPackage=" + this.rcPackage + ", localization=" + this.localization + ", currentlySubscribed=" + this.currentlySubscribed + ", discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ')';
        }
    }

    public static final class TierInfo {
        public static final int $stable = 8;
        private final PackageInfo defaultPackage;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f9122id;
        private final String name;
        private final List<PackageInfo> packages;

        public TierInfo(String str, String str2, PackageInfo packageInfo, List<PackageInfo> list) {
            r.f(str, "name");
            r.f(str2, "id");
            r.f(packageInfo, "defaultPackage");
            r.f(list, "packages");
            this.name = str;
            this.f9122id = str2;
            this.defaultPackage = packageInfo;
            this.packages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TierInfo copy$default(TierInfo tierInfo, String str, String str2, PackageInfo packageInfo, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tierInfo.name;
            }
            if ((i10 & 2) != 0) {
                str2 = tierInfo.f9122id;
            }
            if ((i10 & 4) != 0) {
                packageInfo = tierInfo.defaultPackage;
            }
            if ((i10 & 8) != 0) {
                list = tierInfo.packages;
            }
            return tierInfo.copy(str, str2, packageInfo, list);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f9122id;
        }

        public final PackageInfo component3() {
            return this.defaultPackage;
        }

        public final List<PackageInfo> component4() {
            return this.packages;
        }

        public final TierInfo copy(String str, String str2, PackageInfo packageInfo, List<PackageInfo> list) {
            r.f(str, "name");
            r.f(str2, "id");
            r.f(packageInfo, "defaultPackage");
            r.f(list, "packages");
            return new TierInfo(str, str2, packageInfo, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TierInfo)) {
                return false;
            }
            TierInfo tierInfo = (TierInfo) obj;
            return r.b(this.name, tierInfo.name) && r.b(this.f9122id, tierInfo.f9122id) && r.b(this.defaultPackage, tierInfo.defaultPackage) && r.b(this.packages, tierInfo.packages);
        }

        public final PackageInfo getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getId() {
            return this.f9122id;
        }

        public final String getName() {
            return this.name;
        }

        public final List<PackageInfo> getPackages() {
            return this.packages;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.f9122id.hashCode()) * 31) + this.defaultPackage.hashCode()) * 31) + this.packages.hashCode();
        }

        public String toString() {
            return "TierInfo(name=" + this.name + ", id=" + this.f9122id + ", defaultPackage=" + this.defaultPackage + ", packages=" + this.packages + ')';
        }
    }

    public TemplateConfiguration(PaywallTemplate paywallTemplate, PaywallMode paywallMode, PackageConfiguration packageConfiguration, PaywallData.Configuration configuration, Images images, Map<String, Images> map, PaywallData.Configuration.ColorInformation colorInformation, Locale locale) {
        r.f(paywallTemplate, "template");
        r.f(paywallMode, "mode");
        r.f(packageConfiguration, "packages");
        r.f(configuration, "configuration");
        r.f(images, "images");
        r.f(map, "imagesByTier");
        r.f(colorInformation, "colors");
        r.f(locale, "locale");
        this.template = paywallTemplate;
        this.mode = paywallMode;
        this.packages = packageConfiguration;
        this.configuration = configuration;
        this.images = images;
        this.imagesByTier = map;
        this.colors = colorInformation;
        this.locale = locale;
        ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
        PaywallData.Configuration.Colors dark = colorInformation.getDark();
        this.darkModeColors = colorsFactory.create(dark == null ? colorInformation.getLight() : dark);
        this.lightModeColors = colorsFactory.create(colorInformation.getLight());
    }

    public final PaywallTemplate component1() {
        return this.template;
    }

    public final PaywallMode component2() {
        return this.mode;
    }

    public final PackageConfiguration component3() {
        return this.packages;
    }

    public final PaywallData.Configuration component4() {
        return this.configuration;
    }

    public final Images component5() {
        return this.images;
    }

    public final Map<String, Images> component6() {
        return this.imagesByTier;
    }

    public final PaywallData.Configuration.ColorInformation component7() {
        return this.colors;
    }

    public final Locale component8() {
        return this.locale;
    }

    public final TemplateConfiguration copy(PaywallTemplate paywallTemplate, PaywallMode paywallMode, PackageConfiguration packageConfiguration, PaywallData.Configuration configuration, Images images, Map<String, Images> map, PaywallData.Configuration.ColorInformation colorInformation, Locale locale) {
        r.f(paywallTemplate, "template");
        r.f(paywallMode, "mode");
        r.f(packageConfiguration, "packages");
        r.f(configuration, "configuration");
        r.f(images, "images");
        r.f(map, "imagesByTier");
        r.f(colorInformation, "colors");
        r.f(locale, "locale");
        return new TemplateConfiguration(paywallTemplate, paywallMode, packageConfiguration, configuration, images, map, colorInformation, locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateConfiguration)) {
            return false;
        }
        TemplateConfiguration templateConfiguration = (TemplateConfiguration) obj;
        return this.template == templateConfiguration.template && this.mode == templateConfiguration.mode && r.b(this.packages, templateConfiguration.packages) && r.b(this.configuration, templateConfiguration.configuration) && r.b(this.images, templateConfiguration.images) && r.b(this.imagesByTier, templateConfiguration.imagesByTier) && r.b(this.colors, templateConfiguration.colors) && r.b(this.locale, templateConfiguration.locale);
    }

    public final PaywallData.Configuration.ColorInformation getColors() {
        return this.colors;
    }

    public final PaywallData.Configuration getConfiguration() {
        return this.configuration;
    }

    public final Colors getCurrentColors(l lVar, int i10) {
        if (o.I()) {
            o.U(-1598555926, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.getCurrentColors (TemplateConfiguration.kt:27)");
        }
        Colors colors = d0.o.a(lVar, 0) ? this.darkModeColors : this.lightModeColors;
        if (o.I()) {
            o.T();
        }
        return colors;
    }

    public final Colors getCurrentColorsForTier(TierInfo tierInfo, l lVar, int i10) {
        Colors colorsCreate;
        r.f(tierInfo, "tier");
        if (o.I()) {
            o.U(844077603, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.getCurrentColorsForTier (TemplateConfiguration.kt:33)");
        }
        Map<String, PaywallData.Configuration.ColorInformation> colorsByTier = this.configuration.getColorsByTier();
        Colors currentColors = null;
        PaywallData.Configuration.ColorInformation colorInformation = colorsByTier != null ? colorsByTier.get(tierInfo.getId()) : null;
        if (colorInformation != null) {
            if (d0.o.a(lVar, 0)) {
                ColorsFactory colorsFactory = ColorsFactory.INSTANCE;
                PaywallData.Configuration.Colors dark = colorInformation.getDark();
                if (dark == null) {
                    dark = colorInformation.getLight();
                }
                colorsCreate = colorsFactory.create(dark);
            } else {
                colorsCreate = ColorsFactory.INSTANCE.create(colorInformation.getLight());
            }
            currentColors = colorsCreate;
        }
        if (currentColors == null) {
            currentColors = getCurrentColors(lVar, 8);
        }
        if (o.I()) {
            o.T();
        }
        return currentColors;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Map<String, Images> getImagesByTier() {
        return this.imagesByTier;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final PaywallMode getMode() {
        return this.mode;
    }

    public final PackageConfiguration getPackages() {
        return this.packages;
    }

    public final PaywallTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return (((((((((((((this.template.hashCode() * 31) + this.mode.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.configuration.hashCode()) * 31) + this.images.hashCode()) * 31) + this.imagesByTier.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.locale.hashCode();
    }

    public String toString() {
        return "TemplateConfiguration(template=" + this.template + ", mode=" + this.mode + ", packages=" + this.packages + ", configuration=" + this.configuration + ", images=" + this.images + ", imagesByTier=" + this.imagesByTier + ", colors=" + this.colors + ", locale=" + this.locale + ')';
    }
}
