package com.revenuecat.purchases.customercenter;

import ae.i0;
import ae.j;
import ae.r;
import ae.s;
import af.j1;
import af.k0;
import af.n1;
import af.y;
import af.z0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import he.c;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import md.l;
import md.n;
import md.p;
import md.q;
import we.b;
import we.e;
import ye.f;
import zd.a;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class CustomerCenterConfigData {
    public static final Companion Companion = new Companion(null);
    private final Appearance appearance;
    private final String lastPublishedAppVersion;
    private final Localization localization;
    private final Map<Screen.ScreenType, Screen> screens;
    private final Support support;

    public static final class Appearance {
        public static final Companion Companion = new Companion(null);
        private final ColorInformation dark;
        private final ColorInformation light;

        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accentColor;
            private final PaywallColor backgroundColor;
            private final PaywallColor buttonBackgroundColor;
            private final PaywallColor buttonTextColor;
            private final PaywallColor textColor;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<ColorInformation> serializer() {
                    return CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
                }
            }

            public ColorInformation() {
                this((PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31, (j) null);
            }

            public /* synthetic */ ColorInformation(int i10, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, j1 j1Var) {
                if ((i10 & 0) != 0) {
                    z0.a(i10, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                if ((i10 & 1) == 0) {
                    this.accentColor = null;
                } else {
                    this.accentColor = paywallColor;
                }
                if ((i10 & 2) == 0) {
                    this.textColor = null;
                } else {
                    this.textColor = paywallColor2;
                }
                if ((i10 & 4) == 0) {
                    this.backgroundColor = null;
                } else {
                    this.backgroundColor = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.buttonTextColor = null;
                } else {
                    this.buttonTextColor = paywallColor4;
                }
                if ((i10 & 16) == 0) {
                    this.buttonBackgroundColor = null;
                } else {
                    this.buttonBackgroundColor = paywallColor5;
                }
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                this.accentColor = paywallColor;
                this.textColor = paywallColor2;
                this.backgroundColor = paywallColor3;
                this.buttonTextColor = paywallColor4;
                this.buttonBackgroundColor = paywallColor5;
            }

            public /* synthetic */ ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i10, j jVar) {
                this((i10 & 1) != 0 ? null : paywallColor, (i10 & 2) != 0 ? null : paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, (i10 & 16) != 0 ? null : paywallColor5);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallColor = colorInformation.accentColor;
                }
                if ((i10 & 2) != 0) {
                    paywallColor2 = colorInformation.textColor;
                }
                PaywallColor paywallColor6 = paywallColor2;
                if ((i10 & 4) != 0) {
                    paywallColor3 = colorInformation.backgroundColor;
                }
                PaywallColor paywallColor7 = paywallColor3;
                if ((i10 & 8) != 0) {
                    paywallColor4 = colorInformation.buttonTextColor;
                }
                PaywallColor paywallColor8 = paywallColor4;
                if ((i10 & 16) != 0) {
                    paywallColor5 = colorInformation.buttonBackgroundColor;
                }
                return colorInformation.copy(paywallColor, paywallColor6, paywallColor7, paywallColor8, paywallColor5);
            }

            public static /* synthetic */ void getAccentColor$annotations() {
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonTextColor$annotations() {
            }

            public static /* synthetic */ void getTextColor$annotations() {
            }

            public static final /* synthetic */ void write$Self(ColorInformation colorInformation, d dVar, f fVar) {
                if (dVar.r(fVar, 0) || colorInformation.accentColor != null) {
                    dVar.k(fVar, 0, PaywallColor.Serializer.INSTANCE, colorInformation.accentColor);
                }
                if (dVar.r(fVar, 1) || colorInformation.textColor != null) {
                    dVar.k(fVar, 1, PaywallColor.Serializer.INSTANCE, colorInformation.textColor);
                }
                if (dVar.r(fVar, 2) || colorInformation.backgroundColor != null) {
                    dVar.k(fVar, 2, PaywallColor.Serializer.INSTANCE, colorInformation.backgroundColor);
                }
                if (dVar.r(fVar, 3) || colorInformation.buttonTextColor != null) {
                    dVar.k(fVar, 3, PaywallColor.Serializer.INSTANCE, colorInformation.buttonTextColor);
                }
                if (dVar.r(fVar, 4) || colorInformation.buttonBackgroundColor != null) {
                    dVar.k(fVar, 4, PaywallColor.Serializer.INSTANCE, colorInformation.buttonBackgroundColor);
                }
            }

            public final PaywallColor component1() {
                return this.accentColor;
            }

            public final PaywallColor component2() {
                return this.textColor;
            }

            public final PaywallColor component3() {
                return this.backgroundColor;
            }

            public final PaywallColor component4() {
                return this.buttonTextColor;
            }

            public final PaywallColor component5() {
                return this.buttonBackgroundColor;
            }

            public final ColorInformation copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                return new ColorInformation(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return r.b(this.accentColor, colorInformation.accentColor) && r.b(this.textColor, colorInformation.textColor) && r.b(this.backgroundColor, colorInformation.backgroundColor) && r.b(this.buttonTextColor, colorInformation.buttonTextColor) && r.b(this.buttonBackgroundColor, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                PaywallColor paywallColor = this.accentColor;
                int iHashCode = (paywallColor == null ? 0 : paywallColor.hashCode()) * 31;
                PaywallColor paywallColor2 = this.textColor;
                int iHashCode2 = (iHashCode + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31;
                PaywallColor paywallColor3 = this.backgroundColor;
                int iHashCode3 = (iHashCode2 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.buttonTextColor;
                int iHashCode4 = (iHashCode3 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.buttonBackgroundColor;
                return iHashCode4 + (paywallColor5 != null ? paywallColor5.hashCode() : 0);
            }

            public String toString() {
                return "ColorInformation(accentColor=" + this.accentColor + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonTextColor=" + this.buttonTextColor + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ')';
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Appearance> serializer() {
                return CustomerCenterConfigData$Appearance$$serializer.INSTANCE;
            }
        }

        public Appearance() {
            this((ColorInformation) null, (ColorInformation) (0 == true ? 1 : 0), 3, (j) (0 == true ? 1 : 0));
        }

        public /* synthetic */ Appearance(int i10, ColorInformation colorInformation, ColorInformation colorInformation2, j1 j1Var) {
            if ((i10 & 0) != 0) {
                z0.a(i10, 0, CustomerCenterConfigData$Appearance$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.light = null;
            } else {
                this.light = colorInformation;
            }
            if ((i10 & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = colorInformation2;
            }
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2) {
            this.light = colorInformation;
            this.dark = colorInformation2;
        }

        public /* synthetic */ Appearance(ColorInformation colorInformation, ColorInformation colorInformation2, int i10, j jVar) {
            this((i10 & 1) != 0 ? null : colorInformation, (i10 & 2) != 0 ? null : colorInformation2);
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, ColorInformation colorInformation, ColorInformation colorInformation2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                colorInformation = appearance.light;
            }
            if ((i10 & 2) != 0) {
                colorInformation2 = appearance.dark;
            }
            return appearance.copy(colorInformation, colorInformation2);
        }

        public static final /* synthetic */ void write$Self(Appearance appearance, d dVar, f fVar) {
            if (dVar.r(fVar, 0) || appearance.light != null) {
                dVar.k(fVar, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.light);
            }
            if (dVar.r(fVar, 1) || appearance.dark != null) {
                dVar.k(fVar, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.dark);
            }
        }

        public final ColorInformation component1() {
            return this.light;
        }

        public final ColorInformation component2() {
            return this.dark;
        }

        public final Appearance copy(ColorInformation colorInformation, ColorInformation colorInformation2) {
            return new Appearance(colorInformation, colorInformation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) obj;
            return r.b(this.light, appearance.light) && r.b(this.dark, appearance.dark);
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public int hashCode() {
            ColorInformation colorInformation = this.light;
            int iHashCode = (colorInformation == null ? 0 : colorInformation.hashCode()) * 31;
            ColorInformation colorInformation2 = this.dark;
            return iHashCode + (colorInformation2 != null ? colorInformation2.hashCode() : 0);
        }

        public String toString() {
            return "Appearance(light=" + this.light + ", dark=" + this.dark + ')';
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<CustomerCenterConfigData> serializer() {
            return CustomerCenterConfigData$$serializer.INSTANCE;
        }
    }

    public static final class HelpPath {
        private final PathDetail.FeedbackSurvey feedbackSurvey;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f9099id;
        private final PathDetail.PromotionalOffer promotionalOffer;
        private final String title;
        private final PathType type;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {null, null, PathType.Companion.serializer(), null, null};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<HelpPath> serializer() {
                return CustomerCenterConfigData$HelpPath$$serializer.INSTANCE;
            }
        }

        public static abstract class PathDetail {
            public static final Companion Companion = new Companion(null);
            private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$Companion$1, reason: invalid class name */
                static final class AnonymousClass1 extends s implements a<b<Object>> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    AnonymousClass1() {
                        super(0);
                    }

                    @Override // zd.a
                    public final b<Object> invoke() {
                        return new e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail", i0.b(PathDetail.class), new c[]{i0.b(FeedbackSurvey.class), i0.b(PromotionalOffer.class)}, new b[]{CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) PathDetail.$cachedSerializer$delegate.getValue();
                }

                public final b<PathDetail> serializer() {
                    return get$cachedSerializer();
                }
            }

            public static final class FeedbackSurvey extends PathDetail {
                private final List<Option> options;
                private final String title;
                public static final Companion Companion = new Companion(null);
                private static final b<Object>[] $childSerializers = {null, new af.e(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE)};

                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(j jVar) {
                        this();
                    }

                    public final b<FeedbackSurvey> serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE;
                    }
                }

                public static final class Option {
                    public static final Companion Companion = new Companion(null);

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    private final String f9100id;
                    private final PromotionalOffer promotionalOffer;
                    private final String title;

                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(j jVar) {
                            this();
                        }

                        public final b<Option> serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ Option(int i10, String str, String str2, PromotionalOffer promotionalOffer, j1 j1Var) {
                        if (3 != (i10 & 3)) {
                            z0.a(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f9100id = str;
                        this.title = str2;
                        if ((i10 & 4) == 0) {
                            this.promotionalOffer = null;
                        } else {
                            this.promotionalOffer = promotionalOffer;
                        }
                    }

                    public Option(String str, String str2, PromotionalOffer promotionalOffer) {
                        r.f(str, "id");
                        r.f(str2, com.amazon.a.a.o.b.S);
                        this.f9100id = str;
                        this.title = str2;
                        this.promotionalOffer = promotionalOffer;
                    }

                    public /* synthetic */ Option(String str, String str2, PromotionalOffer promotionalOffer, int i10, j jVar) {
                        this(str, str2, (i10 & 4) != 0 ? null : promotionalOffer);
                    }

                    public static /* synthetic */ Option copy$default(Option option, String str, String str2, PromotionalOffer promotionalOffer, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = option.f9100id;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = option.title;
                        }
                        if ((i10 & 4) != 0) {
                            promotionalOffer = option.promotionalOffer;
                        }
                        return option.copy(str, str2, promotionalOffer);
                    }

                    public static /* synthetic */ void getPromotionalOffer$annotations() {
                    }

                    public static final /* synthetic */ void write$Self(Option option, d dVar, f fVar) {
                        dVar.w(fVar, 0, option.f9100id);
                        dVar.w(fVar, 1, option.title);
                        if (dVar.r(fVar, 2) || option.promotionalOffer != null) {
                            dVar.k(fVar, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, option.promotionalOffer);
                        }
                    }

                    public final String component1() {
                        return this.f9100id;
                    }

                    public final String component2() {
                        return this.title;
                    }

                    public final PromotionalOffer component3() {
                        return this.promotionalOffer;
                    }

                    public final Option copy(String str, String str2, PromotionalOffer promotionalOffer) {
                        r.f(str, "id");
                        r.f(str2, com.amazon.a.a.o.b.S);
                        return new Option(str, str2, promotionalOffer);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) obj;
                        return r.b(this.f9100id, option.f9100id) && r.b(this.title, option.title) && r.b(this.promotionalOffer, option.promotionalOffer);
                    }

                    public final String getId() {
                        return this.f9100id;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int iHashCode = ((this.f9100id.hashCode() * 31) + this.title.hashCode()) * 31;
                        PromotionalOffer promotionalOffer = this.promotionalOffer;
                        return iHashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode());
                    }

                    public String toString() {
                        return "Option(id=" + this.f9100id + ", title=" + this.title + ", promotionalOffer=" + this.promotionalOffer + ')';
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ FeedbackSurvey(int i10, String str, List list, j1 j1Var) {
                    super(i10, j1Var);
                    if (3 != (i10 & 3)) {
                        z0.a(i10, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.options = list;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FeedbackSurvey(String str, List<Option> list) {
                    super(null);
                    r.f(str, com.amazon.a.a.o.b.S);
                    r.f(list, "options");
                    this.title = str;
                    this.options = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ FeedbackSurvey copy$default(FeedbackSurvey feedbackSurvey, String str, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = feedbackSurvey.title;
                    }
                    if ((i10 & 2) != 0) {
                        list = feedbackSurvey.options;
                    }
                    return feedbackSurvey.copy(str, list);
                }

                public static final /* synthetic */ void write$Self(FeedbackSurvey feedbackSurvey, d dVar, f fVar) {
                    PathDetail.write$Self(feedbackSurvey, dVar, fVar);
                    b<Object>[] bVarArr = $childSerializers;
                    dVar.w(fVar, 0, feedbackSurvey.title);
                    dVar.E(fVar, 1, bVarArr[1], feedbackSurvey.options);
                }

                public final String component1() {
                    return this.title;
                }

                public final List<Option> component2() {
                    return this.options;
                }

                public final FeedbackSurvey copy(String str, List<Option> list) {
                    r.f(str, com.amazon.a.a.o.b.S);
                    r.f(list, "options");
                    return new FeedbackSurvey(str, list);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FeedbackSurvey)) {
                        return false;
                    }
                    FeedbackSurvey feedbackSurvey = (FeedbackSurvey) obj;
                    return r.b(this.title, feedbackSurvey.title) && r.b(this.options, feedbackSurvey.options);
                }

                public final List<Option> getOptions() {
                    return this.options;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.options.hashCode();
                }

                public String toString() {
                    return "FeedbackSurvey(title=" + this.title + ", options=" + this.options + ')';
                }
            }

            public static final class PromotionalOffer extends PathDetail {
                public static final Companion Companion = new Companion(null);
                private final String androidOfferId;
                private final boolean eligible;
                private final String subtitle;
                private final String title;

                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(j jVar) {
                        this();
                    }

                    public final b<PromotionalOffer> serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ PromotionalOffer(int i10, String str, boolean z10, String str2, String str3, j1 j1Var) {
                    super(i10, j1Var);
                    if (15 != (i10 & 15)) {
                        z0.a(i10, 15, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE.getDescriptor());
                    }
                    this.androidOfferId = str;
                    this.eligible = z10;
                    this.title = str2;
                    this.subtitle = str3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PromotionalOffer(String str, boolean z10, String str2, String str3) {
                    super(null);
                    r.f(str, "androidOfferId");
                    r.f(str2, com.amazon.a.a.o.b.S);
                    r.f(str3, "subtitle");
                    this.androidOfferId = str;
                    this.eligible = z10;
                    this.title = str2;
                    this.subtitle = str3;
                }

                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z10, String str2, String str3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i10 & 2) != 0) {
                        z10 = promotionalOffer.eligible;
                    }
                    if ((i10 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    return promotionalOffer.copy(str, z10, str2, str3);
                }

                public static /* synthetic */ void getAndroidOfferId$annotations() {
                }

                public static final /* synthetic */ void write$Self(PromotionalOffer promotionalOffer, d dVar, f fVar) {
                    PathDetail.write$Self(promotionalOffer, dVar, fVar);
                    dVar.w(fVar, 0, promotionalOffer.androidOfferId);
                    dVar.j(fVar, 1, promotionalOffer.eligible);
                    dVar.w(fVar, 2, promotionalOffer.title);
                    dVar.w(fVar, 3, promotionalOffer.subtitle);
                }

                public final String component1() {
                    return this.androidOfferId;
                }

                public final boolean component2() {
                    return this.eligible;
                }

                public final String component3() {
                    return this.title;
                }

                public final String component4() {
                    return this.subtitle;
                }

                public final PromotionalOffer copy(String str, boolean z10, String str2, String str3) {
                    r.f(str, "androidOfferId");
                    r.f(str2, com.amazon.a.a.o.b.S);
                    r.f(str3, "subtitle");
                    return new PromotionalOffer(str, z10, str2, str3);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromotionalOffer)) {
                        return false;
                    }
                    PromotionalOffer promotionalOffer = (PromotionalOffer) obj;
                    return r.b(this.androidOfferId, promotionalOffer.androidOfferId) && this.eligible == promotionalOffer.eligible && r.b(this.title, promotionalOffer.title) && r.b(this.subtitle, promotionalOffer.subtitle);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [int] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                public int hashCode() {
                    int iHashCode = this.androidOfferId.hashCode() * 31;
                    boolean z10 = this.eligible;
                    ?? r12 = z10;
                    if (z10) {
                        r12 = 1;
                    }
                    return ((((iHashCode + r12) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode();
                }

                public String toString() {
                    return "PromotionalOffer(androidOfferId=" + this.androidOfferId + ", eligible=" + this.eligible + ", title=" + this.title + ", subtitle=" + this.subtitle + ')';
                }
            }

            private PathDetail() {
            }

            public /* synthetic */ PathDetail(int i10, j1 j1Var) {
            }

            public /* synthetic */ PathDetail(j jVar) {
                this();
            }

            public static final /* synthetic */ void write$Self(PathDetail pathDetail, d dVar, f fVar) {
            }
        }

        public enum PathType {
            MISSING_PURCHASE,
            REFUND_REQUEST,
            CHANGE_PLANS,
            CANCEL,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathType$Companion$1, reason: invalid class name */
                static final class AnonymousClass1 extends s implements a<b<Object>> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    AnonymousClass1() {
                        super(0);
                    }

                    @Override // zd.a
                    public final b<Object> invoke() {
                        return y.b("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType", PathType.values());
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) PathType.$cachedSerializer$delegate.getValue();
                }

                public final b<PathType> serializer() {
                    return get$cachedSerializer();
                }
            }
        }

        public /* synthetic */ HelpPath(int i10, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, j1 j1Var) {
            if (7 != (i10 & 7)) {
                z0.a(i10, 7, CustomerCenterConfigData$HelpPath$$serializer.INSTANCE.getDescriptor());
            }
            this.f9099id = str;
            this.title = str2;
            this.type = pathType;
            if ((i10 & 8) == 0) {
                this.promotionalOffer = null;
            } else {
                this.promotionalOffer = promotionalOffer;
            }
            if ((i10 & 16) == 0) {
                this.feedbackSurvey = null;
            } else {
                this.feedbackSurvey = feedbackSurvey;
            }
        }

        public HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey) {
            r.f(str, "id");
            r.f(str2, com.amazon.a.a.o.b.S);
            r.f(pathType, "type");
            this.f9099id = str;
            this.title = str2;
            this.type = pathType;
            this.promotionalOffer = promotionalOffer;
            this.feedbackSurvey = feedbackSurvey;
        }

        public /* synthetic */ HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, int i10, j jVar) {
            this(str, str2, pathType, (i10 & 8) != 0 ? null : promotionalOffer, (i10 & 16) != 0 ? null : feedbackSurvey);
        }

        public static /* synthetic */ HelpPath copy$default(HelpPath helpPath, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpPath.f9099id;
            }
            if ((i10 & 2) != 0) {
                str2 = helpPath.title;
            }
            String str3 = str2;
            if ((i10 & 4) != 0) {
                pathType = helpPath.type;
            }
            PathType pathType2 = pathType;
            if ((i10 & 8) != 0) {
                promotionalOffer = helpPath.promotionalOffer;
            }
            PathDetail.PromotionalOffer promotionalOffer2 = promotionalOffer;
            if ((i10 & 16) != 0) {
                feedbackSurvey = helpPath.feedbackSurvey;
            }
            return helpPath.copy(str, str3, pathType2, promotionalOffer2, feedbackSurvey);
        }

        public static /* synthetic */ void getFeedbackSurvey$annotations() {
        }

        public static /* synthetic */ void getPromotionalOffer$annotations() {
        }

        public static final /* synthetic */ void write$Self(HelpPath helpPath, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            dVar.w(fVar, 0, helpPath.f9099id);
            dVar.w(fVar, 1, helpPath.title);
            dVar.E(fVar, 2, bVarArr[2], helpPath.type);
            if (dVar.r(fVar, 3) || helpPath.promotionalOffer != null) {
                dVar.k(fVar, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, helpPath.promotionalOffer);
            }
            if (dVar.r(fVar, 4) || helpPath.feedbackSurvey != null) {
                dVar.k(fVar, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, helpPath.feedbackSurvey);
            }
        }

        public final String component1() {
            return this.f9099id;
        }

        public final String component2() {
            return this.title;
        }

        public final PathType component3() {
            return this.type;
        }

        public final PathDetail.PromotionalOffer component4() {
            return this.promotionalOffer;
        }

        public final PathDetail.FeedbackSurvey component5() {
            return this.feedbackSurvey;
        }

        public final HelpPath copy(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey) {
            r.f(str, "id");
            r.f(str2, com.amazon.a.a.o.b.S);
            r.f(pathType, "type");
            return new HelpPath(str, str2, pathType, promotionalOffer, feedbackSurvey);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpPath)) {
                return false;
            }
            HelpPath helpPath = (HelpPath) obj;
            return r.b(this.f9099id, helpPath.f9099id) && r.b(this.title, helpPath.title) && this.type == helpPath.type && r.b(this.promotionalOffer, helpPath.promotionalOffer) && r.b(this.feedbackSurvey, helpPath.feedbackSurvey);
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getId() {
            return this.f9099id;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((((this.f9099id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31;
            PathDetail.PromotionalOffer promotionalOffer = this.promotionalOffer;
            int iHashCode2 = (iHashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode())) * 31;
            PathDetail.FeedbackSurvey feedbackSurvey = this.feedbackSurvey;
            return iHashCode2 + (feedbackSurvey != null ? feedbackSurvey.hashCode() : 0);
        }

        public String toString() {
            return "HelpPath(id=" + this.f9099id + ", title=" + this.title + ", type=" + this.type + ", promotionalOffer=" + this.promotionalOffer + ", feedbackSurvey=" + this.feedbackSurvey + ')';
        }
    }

    public static final class Localization {
        private static final b<Object>[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final String locale;
        private final Map<String, String> localizedStrings;

        public enum CommonLocalizedString {
            NO_THANKS,
            NO_SUBSCRIPTIONS_FOUND,
            TRY_CHECK_RESTORE,
            RESTORE_PURCHASES,
            CANCEL,
            BILLING_CYCLE,
            CURRENT_PRICE,
            EXPIRED,
            EXPIRES,
            NEXT_BILLING_DATE,
            REFUND_CANCELED,
            REFUND_ERROR_GENERIC,
            REFUND_GRANTED,
            REFUND_STATUS,
            SUB_EARLIEST_EXPIRATION,
            SUB_EARLIEST_RENEWAL,
            SUB_EXPIRED,
            CONTACT_SUPPORT,
            DEFAULT_BODY,
            DEFAULT_SUBJECT,
            DISMISS,
            UPDATE_WARNING_TITLE,
            UPDATE_WARNING_DESCRIPTION,
            UPDATE_WARNING_UPDATE,
            UPDATE_WARNING_IGNORE,
            PLEASE_CONTACT_SUPPORT,
            APPLE_SUBSCRIPTION_MANAGE,
            GOOGLE_SUBSCRIPTION_MANAGE,
            AMAZON_SUBSCRIPTION_MANAGE,
            PLATFORM_MISMATCH,
            GOING_TO_CHECK_PURCHASES,
            CHECK_PAST_PURCHASES,
            PURCHASES_RECOVERED,
            PURCHASES_RECOVERED_EXPLANATION,
            PURCHASES_NOT_RECOVERED;

            public static final Companion Companion = new Companion(null);
            private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$CommonLocalizedString$Companion$1, reason: invalid class name */
                static final class AnonymousClass1 extends s implements a<b<Object>> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    AnonymousClass1() {
                        super(0);
                    }

                    @Override // zd.a
                    public final b<Object> invoke() {
                        return y.a("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString", CommonLocalizedString.values(), new String[]{"no_thanks", "no_subscriptions_found", "try_check_restore", "restore_purchases", "cancel", "billing_cycle", "current_price", "expired", "expires", "next_billing_date", "refund_canceled", "refund_error_generic", "refund_granted", "refund_status", "sub_earliest_expiration", "sub_earliest_renewal", "sub_expired", "contact_support", "default_body", "default_subject", "dismiss", "update_warning_title", "update_warning_description", "update_warning_update", "update_warning_ignore", "please_contact_support", "apple_subscription_manage", "google_subscription_manage", "amazon_subscription_manage", "platform_mismatch", "going_to_check_purchases", "check_past_purchases", "purchases_recovered", "purchases_recovered_explanation", "purchases_not_recovered"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) CommonLocalizedString.$cachedSerializer$delegate.getValue();
                }

                public final b<CommonLocalizedString> serializer() {
                    return get$cachedSerializer();
                }
            }

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonLocalizedString.values().length];
                    try {
                        iArr[CommonLocalizedString.NO_THANKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_SUBSCRIPTIONS_FOUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonLocalizedString.TRY_CHECK_RESTORE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESTORE_PURCHASES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CommonLocalizedString.CANCEL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CommonLocalizedString.BILLING_CYCLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CommonLocalizedString.CURRENT_PRICE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRES.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_CANCELED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_ERROR_GENERIC.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_GRANTED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_STATUS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_EXPIRATION.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_RENEWAL.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EXPIRED.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[CommonLocalizedString.CONTACT_SUPPORT.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_BODY.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_SUBJECT.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISMISS.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_TITLE.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_DESCRIPTION.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_UPDATE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_IGNORE.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLATFORM_MISMATCH.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLEASE_CONTACT_SUPPORT.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[CommonLocalizedString.APPLE_SUBSCRIPTION_MANAGE.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_SUBSCRIPTION_MANAGE.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_SUBSCRIPTION_MANAGE.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOING_TO_CHECK_PURCHASES.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHECK_PAST_PURCHASES.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_RECOVERED.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final String getDefaultValue() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return "No, thanks";
                    case 2:
                        return "No Subscriptions found";
                    case 3:
                        return "We can try checking your Apple account for any previous purchases";
                    case 4:
                        return "Restore purchases";
                    case 5:
                        return "Cancel";
                    case 6:
                        return "Billing cycle";
                    case 7:
                        return "Current price";
                    case 8:
                        return "Expired";
                    case 9:
                        return "Expires";
                    case 10:
                        return "Next billing date";
                    case 11:
                        return "Refund canceled";
                    case 12:
                        return "An error occurred while processing the refund request. Please try again.";
                    case 13:
                        return "Refund granted successfully!";
                    case 14:
                        return "Refund status";
                    case 15:
                        return "This is your subscription with the earliest expiration date.";
                    case 16:
                        return "This is your subscription with the earliest billing date.";
                    case 17:
                        return "This subscription has expired.";
                    case 18:
                        return "Contact support";
                    case 19:
                        return "Please describe your issue or question.";
                    case 20:
                        return "Support Request";
                    case 21:
                        return "Dismiss";
                    case 22:
                        return "Update available";
                    case 23:
                        return "Downloading the latest version of the app may help solve the problem.";
                    case 24:
                        return "Update";
                    case 25:
                        return "Continue";
                    case 26:
                        return "Platform mismatch";
                    case 27:
                        return "Please contact support to manage your subscription.";
                    case 28:
                        return "You can manage your subscription by using the App Store app on an Apple device.";
                    case 29:
                        return "You can manage your subscription by using the Play Store app on an Android device";
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        return "You can manage your subscription in the Amazon Appstore app on an Amazon device.";
                    case 31:
                        return "Let’s take a look! We’re going to check your account for missing purchases.";
                    case 32:
                        return "Check past purchases";
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        return "Purchases recovered!";
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        return "We applied the previously purchased items to your account. Sorry for the inconvenience.";
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        return "We couldn't find any additional purchases under this account. Contact support for assistance if you think this is an error.";
                    default:
                        throw new q();
                }
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Localization> serializer() {
                return CustomerCenterConfigData$Localization$$serializer.INSTANCE;
            }
        }

        static {
            n1 n1Var = n1.f790a;
            $childSerializers = new b[]{null, new k0(n1Var, n1Var)};
        }

        public /* synthetic */ Localization(int i10, String str, Map map, j1 j1Var) {
            if (3 != (i10 & 3)) {
                z0.a(i10, 3, CustomerCenterConfigData$Localization$$serializer.INSTANCE.getDescriptor());
            }
            this.locale = str;
            this.localizedStrings = map;
        }

        public Localization(String str, Map<String, String> map) {
            r.f(str, "locale");
            r.f(map, "localizedStrings");
            this.locale = str;
            this.localizedStrings = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Localization copy$default(Localization localization, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = localization.locale;
            }
            if ((i10 & 2) != 0) {
                map = localization.localizedStrings;
            }
            return localization.copy(str, map);
        }

        public static /* synthetic */ void getLocalizedStrings$annotations() {
        }

        public static final /* synthetic */ void write$Self(Localization localization, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            dVar.w(fVar, 0, localization.locale);
            dVar.E(fVar, 1, bVarArr[1], localization.localizedStrings);
        }

        public final String commonLocalizedString(CommonLocalizedString commonLocalizedString) {
            r.f(commonLocalizedString, SubscriberAttributeKt.JSON_NAME_KEY);
            Map<String, String> map = this.localizedStrings;
            String lowerCase = commonLocalizedString.name().toLowerCase(Locale.ROOT);
            r.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String str = map.get(lowerCase);
            return str == null ? commonLocalizedString.getDefaultValue() : str;
        }

        public final String component1() {
            return this.locale;
        }

        public final Map<String, String> component2() {
            return this.localizedStrings;
        }

        public final Localization copy(String str, Map<String, String> map) {
            r.f(str, "locale");
            r.f(map, "localizedStrings");
            return new Localization(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) obj;
            return r.b(this.locale, localization.locale) && r.b(this.localizedStrings, localization.localizedStrings);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map<String, String> getLocalizedStrings() {
            return this.localizedStrings;
        }

        public int hashCode() {
            return (this.locale.hashCode() * 31) + this.localizedStrings.hashCode();
        }

        public String toString() {
            return "Localization(locale=" + this.locale + ", localizedStrings=" + this.localizedStrings + ')';
        }
    }

    public static final class Screen {
        private final List<HelpPath> paths;
        private final String subtitle;
        private final String title;
        private final ScreenType type;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {ScreenType.Companion.serializer(), null, null, null};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Screen> serializer() {
                return CustomerCenterConfigData$Screen$$serializer.INSTANCE;
            }
        }

        public enum ScreenType {
            MANAGEMENT,
            NO_ACTIVE,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

            public static final class Companion {

                /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen$ScreenType$Companion$1, reason: invalid class name */
                static final class AnonymousClass1 extends s implements a<b<Object>> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    AnonymousClass1() {
                        super(0);
                    }

                    @Override // zd.a
                    public final b<Object> invoke() {
                        return y.b("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType", ScreenType.values());
                    }
                }

                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) ScreenType.$cachedSerializer$delegate.getValue();
                }

                public final b<ScreenType> serializer() {
                    return get$cachedSerializer();
                }
            }
        }

        public /* synthetic */ Screen(int i10, ScreenType screenType, String str, String str2, List list, j1 j1Var) {
            if (11 != (i10 & 11)) {
                z0.a(i10, 11, CustomerCenterConfigData$Screen$$serializer.INSTANCE.getDescriptor());
            }
            this.type = screenType;
            this.title = str;
            if ((i10 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.paths = list;
        }

        public Screen(ScreenType screenType, String str, String str2, List<HelpPath> list) {
            r.f(screenType, "type");
            r.f(str, com.amazon.a.a.o.b.S);
            r.f(list, "paths");
            this.type = screenType;
            this.title = str;
            this.subtitle = str2;
            this.paths = list;
        }

        public /* synthetic */ Screen(ScreenType screenType, String str, String str2, List list, int i10, j jVar) {
            this(screenType, str, (i10 & 4) != 0 ? null : str2, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Screen copy$default(Screen screen, ScreenType screenType, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                screenType = screen.type;
            }
            if ((i10 & 2) != 0) {
                str = screen.title;
            }
            if ((i10 & 4) != 0) {
                str2 = screen.subtitle;
            }
            if ((i10 & 8) != 0) {
                list = screen.paths;
            }
            return screen.copy(screenType, str, str2, list);
        }

        public static /* synthetic */ void getPaths$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final /* synthetic */ void write$Self(Screen screen, d dVar, f fVar) {
            dVar.E(fVar, 0, $childSerializers[0], screen.type);
            dVar.w(fVar, 1, screen.title);
            if (dVar.r(fVar, 2) || screen.subtitle != null) {
                dVar.k(fVar, 2, EmptyStringToNullSerializer.INSTANCE, screen.subtitle);
            }
            dVar.E(fVar, 3, HelpPathsSerializer.INSTANCE, screen.paths);
        }

        public final ScreenType component1() {
            return this.type;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final List<HelpPath> component4() {
            return this.paths;
        }

        public final Screen copy(ScreenType screenType, String str, String str2, List<HelpPath> list) {
            r.f(screenType, "type");
            r.f(str, com.amazon.a.a.o.b.S);
            r.f(list, "paths");
            return new Screen(screenType, str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.type == screen.type && r.b(this.title, screen.title) && r.b(this.subtitle, screen.subtitle) && r.b(this.paths, screen.paths);
        }

        public final List<HelpPath> getPaths() {
            return this.paths;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ScreenType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paths.hashCode();
        }

        public String toString() {
            return "Screen(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paths=" + this.paths + ')';
        }
    }

    public static final class Support {
        public static final Companion Companion = new Companion(null);
        private final String email;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Support> serializer() {
                return CustomerCenterConfigData$Support$$serializer.INSTANCE;
            }
        }

        public Support() {
            this((String) null, 1, (j) (0 == true ? 1 : 0));
        }

        public /* synthetic */ Support(int i10, String str, j1 j1Var) {
            if ((i10 & 0) != 0) {
                z0.a(i10, 0, CustomerCenterConfigData$Support$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
            }
        }

        public Support(String str) {
            this.email = str;
        }

        public /* synthetic */ Support(String str, int i10, j jVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Support copy$default(Support support, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = support.email;
            }
            return support.copy(str);
        }

        public static /* synthetic */ void getEmail$annotations() {
        }

        public static final /* synthetic */ void write$Self(Support support, d dVar, f fVar) {
            boolean z10 = true;
            if (!dVar.r(fVar, 0) && support.email == null) {
                z10 = false;
            }
            if (z10) {
                dVar.k(fVar, 0, EmptyStringToNullSerializer.INSTANCE, support.email);
            }
        }

        public final String component1() {
            return this.email;
        }

        public final Support copy(String str) {
            return new Support(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Support) && r.b(this.email, ((Support) obj).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Support(email=" + this.email + ')';
        }
    }

    public /* synthetic */ CustomerCenterConfigData(int i10, Map map, Appearance appearance, Localization localization, Support support, String str, j1 j1Var) {
        if (15 != (i10 & 15)) {
            z0.a(i10, 15, CustomerCenterConfigData$$serializer.INSTANCE.getDescriptor());
        }
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        if ((i10 & 16) == 0) {
            this.lastPublishedAppVersion = null;
        } else {
            this.lastPublishedAppVersion = str;
        }
    }

    public CustomerCenterConfigData(Map<Screen.ScreenType, Screen> map, Appearance appearance, Localization localization, Support support, String str) {
        r.f(map, "screens");
        r.f(appearance, "appearance");
        r.f(localization, "localization");
        r.f(support, "support");
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        this.lastPublishedAppVersion = str;
    }

    public /* synthetic */ CustomerCenterConfigData(Map map, Appearance appearance, Localization localization, Support support, String str, int i10, j jVar) {
        this(map, appearance, localization, support, (i10 & 16) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerCenterConfigData copy$default(CustomerCenterConfigData customerCenterConfigData, Map map, Appearance appearance, Localization localization, Support support, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = customerCenterConfigData.screens;
        }
        if ((i10 & 2) != 0) {
            appearance = customerCenterConfigData.appearance;
        }
        Appearance appearance2 = appearance;
        if ((i10 & 4) != 0) {
            localization = customerCenterConfigData.localization;
        }
        Localization localization2 = localization;
        if ((i10 & 8) != 0) {
            support = customerCenterConfigData.support;
        }
        Support support2 = support;
        if ((i10 & 16) != 0) {
            str = customerCenterConfigData.lastPublishedAppVersion;
        }
        return customerCenterConfigData.copy(map, appearance2, localization2, support2, str);
    }

    public static /* synthetic */ void getLastPublishedAppVersion$annotations() {
    }

    public static /* synthetic */ void getScreens$annotations() {
    }

    public static final /* synthetic */ void write$Self(CustomerCenterConfigData customerCenterConfigData, d dVar, f fVar) {
        dVar.E(fVar, 0, ScreenMapSerializer.INSTANCE, customerCenterConfigData.screens);
        dVar.E(fVar, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, customerCenterConfigData.appearance);
        dVar.E(fVar, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, customerCenterConfigData.localization);
        dVar.E(fVar, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, customerCenterConfigData.support);
        if (dVar.r(fVar, 4) || customerCenterConfigData.lastPublishedAppVersion != null) {
            dVar.k(fVar, 4, EmptyStringToNullSerializer.INSTANCE, customerCenterConfigData.lastPublishedAppVersion);
        }
    }

    public final Map<Screen.ScreenType, Screen> component1() {
        return this.screens;
    }

    public final Appearance component2() {
        return this.appearance;
    }

    public final Localization component3() {
        return this.localization;
    }

    public final Support component4() {
        return this.support;
    }

    public final String component5() {
        return this.lastPublishedAppVersion;
    }

    public final CustomerCenterConfigData copy(Map<Screen.ScreenType, Screen> map, Appearance appearance, Localization localization, Support support, String str) {
        r.f(map, "screens");
        r.f(appearance, "appearance");
        r.f(localization, "localization");
        r.f(support, "support");
        return new CustomerCenterConfigData(map, appearance, localization, support, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterConfigData)) {
            return false;
        }
        CustomerCenterConfigData customerCenterConfigData = (CustomerCenterConfigData) obj;
        return r.b(this.screens, customerCenterConfigData.screens) && r.b(this.appearance, customerCenterConfigData.appearance) && r.b(this.localization, customerCenterConfigData.localization) && r.b(this.support, customerCenterConfigData.support) && r.b(this.lastPublishedAppVersion, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Map<Screen.ScreenType, Screen> getScreens() {
        return this.screens;
    }

    public final Support getSupport() {
        return this.support;
    }

    public int hashCode() {
        int iHashCode = ((((((this.screens.hashCode() * 31) + this.appearance.hashCode()) * 31) + this.localization.hashCode()) * 31) + this.support.hashCode()) * 31;
        String str = this.lastPublishedAppVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomerCenterConfigData(screens=" + this.screens + ", appearance=" + this.appearance + ", localization=" + this.localization + ", support=" + this.support + ", lastPublishedAppVersion=" + this.lastPublishedAppVersion + ')';
    }
}
