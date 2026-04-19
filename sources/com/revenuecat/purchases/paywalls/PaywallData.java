package com.revenuecat.purchases.paywalls;

import ae.j;
import ae.r;
import af.e;
import af.j1;
import af.k0;
import af.n1;
import af.z0;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import md.s;
import md.x;
import nd.c0;
import nd.r0;
import nd.u;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData {
    private static final b<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final String defaultLocale;
    private final Map<String, LocalizedConfiguration> localization;
    private final Map<String, Map<String, LocalizedConfiguration>> localizationByTier;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallData> serializer() {
            return PaywallData$$serializer.INSTANCE;
        }
    }

    public static final class Configuration {
        private static final b<Object>[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final Map<String, ColorInformation> colorsByTier;
        private final String defaultPackage;
        private final String defaultTier;
        private final boolean displayRestorePurchases;
        private final Map<String, Images> imagesByTier;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        private final List<Tier> tiers;

        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final Colors dark;
            private final Colors light;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<ColorInformation> serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ColorInformation(int i10, Colors colors, Colors colors2, j1 j1Var) {
                if (1 != (i10 & 1)) {
                    z0.a(i10, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i10 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public ColorInformation(Colors colors, Colors colors2) {
                r.f(colors, "light");
                this.light = colors;
                this.dark = colors2;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i10, j jVar) {
                this(colors, (i10 & 2) != 0 ? null : colors2);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i10 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final /* synthetic */ void write$Self(ColorInformation colorInformation, d dVar, f fVar) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                dVar.E(fVar, 0, paywallData$Configuration$Colors$$serializer, colorInformation.light);
                if (dVar.r(fVar, 1) || colorInformation.dark != null) {
                    dVar.k(fVar, 1, paywallData$Configuration$Colors$$serializer, colorInformation.dark);
                }
            }

            public final Colors component1() {
                return this.light;
            }

            public final Colors component2() {
                return this.dark;
            }

            public final ColorInformation copy(Colors colors, Colors colors2) {
                r.f(colors, "light");
                return new ColorInformation(colors, colors2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return r.b(this.light, colorInformation.light) && r.b(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }
        }

        public static final class Colors {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;
            private final PaywallColor tierControlBackground;
            private final PaywallColor tierControlForeground;
            private final PaywallColor tierControlSelectedBackground;
            private final PaywallColor tierControlSelectedForeground;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Colors> serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Colors(int i10, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, j1 j1Var) {
                if (51 != (i10 & 51)) {
                    z0.a(i10, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i10 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i10 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i10 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i10 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i10 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i10 & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i10 & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i10 & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i10 & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i10 & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            public Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15) {
                r.f(paywallColor, "background");
                r.f(paywallColor2, "text1");
                r.f(paywallColor5, "callToActionBackground");
                r.f(paywallColor6, "callToActionForeground");
                this.background = paywallColor;
                this.text1 = paywallColor2;
                this.text2 = paywallColor3;
                this.text3 = paywallColor4;
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                this.callToActionSecondaryBackground = paywallColor7;
                this.accent1 = paywallColor8;
                this.accent2 = paywallColor9;
                this.accent3 = paywallColor10;
                this.closeButton = paywallColor11;
                this.tierControlBackground = paywallColor12;
                this.tierControlForeground = paywallColor13;
                this.tierControlSelectedBackground = paywallColor14;
                this.tierControlSelectedForeground = paywallColor15;
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, int i10, j jVar) {
                this(paywallColor, paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i10 & 64) != 0 ? null : paywallColor7, (i10 & 128) != 0 ? null : paywallColor8, (i10 & 256) != 0 ? null : paywallColor9, (i10 & 512) != 0 ? null : paywallColor10, (i10 & 1024) != 0 ? null : paywallColor11, (i10 & 2048) != 0 ? null : paywallColor12, (i10 & 4096) != 0 ? null : paywallColor13, (i10 & 8192) != 0 ? null : paywallColor14, (i10 & 16384) != 0 ? null : paywallColor15);
            }

            public static /* synthetic */ void getAccent1$annotations() {
            }

            public static /* synthetic */ void getAccent2$annotations() {
            }

            public static /* synthetic */ void getAccent3$annotations() {
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            public static /* synthetic */ void getCloseButton$annotations() {
            }

            public static /* synthetic */ void getText1$annotations() {
            }

            public static /* synthetic */ void getText2$annotations() {
            }

            public static /* synthetic */ void getText3$annotations() {
            }

            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public static final /* synthetic */ void write$Self(Colors colors, d dVar, f fVar) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                dVar.E(fVar, 0, serializer, colors.background);
                dVar.E(fVar, 1, serializer, colors.text1);
                if (dVar.r(fVar, 2) || colors.text2 != null) {
                    dVar.k(fVar, 2, serializer, colors.text2);
                }
                if (dVar.r(fVar, 3) || colors.text3 != null) {
                    dVar.k(fVar, 3, serializer, colors.text3);
                }
                dVar.E(fVar, 4, serializer, colors.callToActionBackground);
                dVar.E(fVar, 5, serializer, colors.callToActionForeground);
                if (dVar.r(fVar, 6) || colors.callToActionSecondaryBackground != null) {
                    dVar.k(fVar, 6, serializer, colors.callToActionSecondaryBackground);
                }
                if (dVar.r(fVar, 7) || colors.accent1 != null) {
                    dVar.k(fVar, 7, serializer, colors.accent1);
                }
                if (dVar.r(fVar, 8) || colors.accent2 != null) {
                    dVar.k(fVar, 8, serializer, colors.accent2);
                }
                if (dVar.r(fVar, 9) || colors.accent3 != null) {
                    dVar.k(fVar, 9, serializer, colors.accent3);
                }
                if (dVar.r(fVar, 10) || colors.closeButton != null) {
                    dVar.k(fVar, 10, serializer, colors.closeButton);
                }
                if (dVar.r(fVar, 11) || colors.tierControlBackground != null) {
                    dVar.k(fVar, 11, serializer, colors.tierControlBackground);
                }
                if (dVar.r(fVar, 12) || colors.tierControlForeground != null) {
                    dVar.k(fVar, 12, serializer, colors.tierControlForeground);
                }
                if (dVar.r(fVar, 13) || colors.tierControlSelectedBackground != null) {
                    dVar.k(fVar, 13, serializer, colors.tierControlSelectedBackground);
                }
                if (dVar.r(fVar, 14) || colors.tierControlSelectedForeground != null) {
                    dVar.k(fVar, 14, serializer, colors.tierControlSelectedForeground);
                }
            }

            public final PaywallColor component1() {
                return this.background;
            }

            public final PaywallColor component10() {
                return this.accent3;
            }

            public final PaywallColor component11() {
                return this.closeButton;
            }

            public final PaywallColor component12() {
                return this.tierControlBackground;
            }

            public final PaywallColor component13() {
                return this.tierControlForeground;
            }

            public final PaywallColor component14() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor component15() {
                return this.tierControlSelectedForeground;
            }

            public final PaywallColor component2() {
                return this.text1;
            }

            public final PaywallColor component3() {
                return this.text2;
            }

            public final PaywallColor component4() {
                return this.text3;
            }

            public final PaywallColor component5() {
                return this.callToActionBackground;
            }

            public final PaywallColor component6() {
                return this.callToActionForeground;
            }

            public final PaywallColor component7() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor component8() {
                return this.accent1;
            }

            public final PaywallColor component9() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15) {
                r.f(paywallColor, "background");
                r.f(paywallColor2, "text1");
                r.f(paywallColor5, "callToActionBackground");
                r.f(paywallColor6, "callToActionForeground");
                return new Colors(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, paywallColor6, paywallColor7, paywallColor8, paywallColor9, paywallColor10, paywallColor11, paywallColor12, paywallColor13, paywallColor14, paywallColor15);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return r.b(this.background, colors.background) && r.b(this.text1, colors.text1) && r.b(this.text2, colors.text2) && r.b(this.text3, colors.text3) && r.b(this.callToActionBackground, colors.callToActionBackground) && r.b(this.callToActionForeground, colors.callToActionForeground) && r.b(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && r.b(this.accent1, colors.accent1) && r.b(this.accent2, colors.accent2) && r.b(this.accent3, colors.accent3) && r.b(this.closeButton, colors.closeButton) && r.b(this.tierControlBackground, colors.tierControlBackground) && r.b(this.tierControlForeground, colors.tierControlForeground) && r.b(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && r.b(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int iHashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (((((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int iHashCode7 = (iHashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                int iHashCode8 = (iHashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                PaywallColor paywallColor8 = this.tierControlBackground;
                int iHashCode9 = (iHashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                PaywallColor paywallColor9 = this.tierControlForeground;
                int iHashCode10 = (iHashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int iHashCode11 = (iHashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                return iHashCode11 + (paywallColor11 != null ? paywallColor11.hashCode() : 0);
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Configuration> serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }
        }

        public static final class Images {
            public static final Companion Companion = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Images> serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (j) null);
            }

            public /* synthetic */ Images(int i10, String str, String str2, String str3, j1 j1Var) {
                if ((i10 & 0) != 0) {
                    z0.a(i10, 0, PaywallData$Configuration$Images$$serializer.INSTANCE.getDescriptor());
                }
                if ((i10 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i10 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i10 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i10, j jVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = images.header;
                }
                if ((i10 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i10 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getHeader$annotations() {
            }

            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final /* synthetic */ void write$Self(Images images, d dVar, f fVar) {
                if (dVar.r(fVar, 0) || images.header != null) {
                    dVar.k(fVar, 0, EmptyStringToNullSerializer.INSTANCE, images.header);
                }
                if (dVar.r(fVar, 1) || images.background != null) {
                    dVar.k(fVar, 1, EmptyStringToNullSerializer.INSTANCE, images.background);
                }
                if (dVar.r(fVar, 2) || images.icon != null) {
                    dVar.k(fVar, 2, EmptyStringToNullSerializer.INSTANCE, images.icon);
                }
            }

            public final String component1() {
                return this.header;
            }

            public final String component2() {
                return this.background;
            }

            public final String component3() {
                return this.icon;
            }

            public final Images copy(String str, String str2, String str3) {
                return new Images(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return r.b(this.header, images.header) && r.b(this.background, images.background) && r.b(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_defaultsRelease() {
                return u.r(this.header, this.background, this.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }
        }

        public static final class Tier {
            private final String defaultPackageId;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final String f9112id;
            private final List<String> packageIds;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {null, new e(n1.f790a), null};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Tier> serializer() {
                    return PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Tier(int i10, String str, List list, String str2, j1 j1Var) {
                if (7 != (i10 & 7)) {
                    z0.a(i10, 7, PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                }
                this.f9112id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            public Tier(String str, List<String> list, String str2) {
                r.f(str, "id");
                r.f(list, "packageIds");
                r.f(str2, "defaultPackageId");
                this.f9112id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Tier copy$default(Tier tier, String str, List list, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = tier.f9112id;
                }
                if ((i10 & 2) != 0) {
                    list = tier.packageIds;
                }
                if ((i10 & 4) != 0) {
                    str2 = tier.defaultPackageId;
                }
                return tier.copy(str, list, str2);
            }

            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            public static /* synthetic */ void getPackageIds$annotations() {
            }

            public static final /* synthetic */ void write$Self(Tier tier, d dVar, f fVar) {
                b<Object>[] bVarArr = $childSerializers;
                dVar.w(fVar, 0, tier.f9112id);
                dVar.E(fVar, 1, bVarArr[1], tier.packageIds);
                dVar.w(fVar, 2, tier.defaultPackageId);
            }

            public final String component1() {
                return this.f9112id;
            }

            public final List<String> component2() {
                return this.packageIds;
            }

            public final String component3() {
                return this.defaultPackageId;
            }

            public final Tier copy(String str, List<String> list, String str2) {
                r.f(str, "id");
                r.f(list, "packageIds");
                r.f(str2, "defaultPackageId");
                return new Tier(str, list, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) obj;
                return r.b(this.f9112id, tier.f9112id) && r.b(this.packageIds, tier.packageIds) && r.b(this.defaultPackageId, tier.defaultPackageId);
            }

            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final String getId() {
                return this.f9112id;
            }

            public final List<String> getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return (((this.f9112id.hashCode() * 31) + this.packageIds.hashCode()) * 31) + this.defaultPackageId.hashCode();
            }

            public String toString() {
                return "Tier(id=" + this.f9112id + ", packageIds=" + this.packageIds + ", defaultPackageId=" + this.defaultPackageId + ')';
            }
        }

        static {
            n1 n1Var = n1.f790a;
            $childSerializers = new b[]{new e(n1Var), null, null, null, new k0(n1Var, PaywallData$Configuration$Images$$serializer.INSTANCE), null, null, null, null, null, new k0(n1Var, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE), new e(PaywallData$Configuration$Tier$$serializer.INSTANCE), null};
        }

        public /* synthetic */ Configuration(int i10, List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, j1 j1Var) {
            if (512 != (i10 & 512)) {
                z0.a(i10, 512, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            this.packageIds = (i10 & 1) == 0 ? u.m() : list;
            if ((i10 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i10 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i10 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i10 & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            this.blurredBackgroundImage = (i10 & 32) == 0 ? false : z10;
            this.displayRestorePurchases = (i10 & 64) == 0 ? true : z11;
            if ((i10 & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i10 & 256) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i10 & 1024) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i10 & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i10 & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        public Configuration(List<String> list, String str, Images images, Images images2, Map<String, Images> map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map<String, ColorInformation> map2, List<Tier> list2, String str2) {
            r.f(list, "packageIds");
            r.f(colorInformation, "colors");
            this.packageIds = list;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z10;
            this.displayRestorePurchases = z11;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colorInformation;
            this.colorsByTier = map2;
            this.tiers = list2;
            this.defaultTier = str2;
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, Map map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i10, j jVar) {
            this((List<String>) ((i10 & 1) != 0 ? u.m() : list), (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : images, (i10 & 8) != 0 ? null : images2, (Map<String, Images>) ((i10 & 16) != 0 ? null : map), (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? true : z11, (i10 & 128) != 0 ? null : url, (i10 & 256) != 0 ? null : url2, colorInformation, (Map<String, ColorInformation>) ((i10 & 1024) != 0 ? null : map2), (List<Tier>) ((i10 & 2048) != 0 ? null : list2), (i10 & 4096) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> list, String str, Images images, Map<String, Images> map, ColorInformation colorInformation, Map<String, ColorInformation> map2, List<Tier> list2, boolean z10, boolean z11, URL url, URL url2) {
            this(list, str, images, (Images) null, map, z10, z11, url, url2, colorInformation, map2, list2, (String) null, 4104, (j) null);
            r.f(list, "packageIds");
            r.f(images, "images");
            r.f(colorInformation, "colors");
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Map map, ColorInformation colorInformation, Map map2, List list2, boolean z10, boolean z11, URL url, URL url2, int i10, j jVar) {
            this(list, (i10 & 2) != 0 ? null : str, images, (i10 & 8) != 0 ? null : map, colorInformation, (i10 & 32) != 0 ? null : map2, (i10 & 64) != 0 ? null : list2, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? null : url, (i10 & 1024) != 0 ? null : url2);
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self(Configuration configuration, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            if (dVar.r(fVar, 0) || !r.b(configuration.packageIds, u.m())) {
                dVar.E(fVar, 0, bVarArr[0], configuration.packageIds);
            }
            if (dVar.r(fVar, 1) || configuration.defaultPackage != null) {
                dVar.k(fVar, 1, n1.f790a, configuration.defaultPackage);
            }
            if (dVar.r(fVar, 2) || configuration.imagesWebp != null) {
                dVar.k(fVar, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.imagesWebp);
            }
            if (dVar.r(fVar, 3) || configuration.legacyImages != null) {
                dVar.k(fVar, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.legacyImages);
            }
            if (dVar.r(fVar, 4) || configuration.imagesByTier != null) {
                dVar.k(fVar, 4, bVarArr[4], configuration.imagesByTier);
            }
            if (dVar.r(fVar, 5) || configuration.blurredBackgroundImage) {
                dVar.j(fVar, 5, configuration.blurredBackgroundImage);
            }
            if (dVar.r(fVar, 6) || !configuration.displayRestorePurchases) {
                dVar.j(fVar, 6, configuration.displayRestorePurchases);
            }
            if (dVar.r(fVar, 7) || configuration.termsOfServiceURL != null) {
                dVar.k(fVar, 7, OptionalURLSerializer.INSTANCE, configuration.termsOfServiceURL);
            }
            if (dVar.r(fVar, 8) || configuration.privacyURL != null) {
                dVar.k(fVar, 8, OptionalURLSerializer.INSTANCE, configuration.privacyURL);
            }
            dVar.E(fVar, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, configuration.colors);
            if (dVar.r(fVar, 10) || configuration.colorsByTier != null) {
                dVar.k(fVar, 10, bVarArr[10], configuration.colorsByTier);
            }
            if (dVar.r(fVar, 11) || configuration.tiers != null) {
                dVar.k(fVar, 11, bVarArr[11], configuration.tiers);
            }
            if (dVar.r(fVar, 12) || configuration.defaultTier != null) {
                dVar.k(fVar, 12, n1.f790a, configuration.defaultTier);
            }
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        public final ColorInformation component10() {
            return this.colors;
        }

        public final Map<String, ColorInformation> component11() {
            return this.colorsByTier;
        }

        public final List<Tier> component12() {
            return this.tiers;
        }

        public final String component13() {
            return this.defaultTier;
        }

        public final String component2() {
            return this.defaultPackage;
        }

        public final Images component3$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images component4$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final Map<String, Images> component5() {
            return this.imagesByTier;
        }

        public final boolean component6() {
            return this.blurredBackgroundImage;
        }

        public final boolean component7() {
            return this.displayRestorePurchases;
        }

        public final URL component8() {
            return this.termsOfServiceURL;
        }

        public final URL component9() {
            return this.privacyURL;
        }

        public final Configuration copy(List<String> list, String str, Images images, Images images2, Map<String, Images> map, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, Map<String, ColorInformation> map2, List<Tier> list2, String str2) {
            r.f(list, "packageIds");
            r.f(colorInformation, "colors");
            return new Configuration(list, str, images, images2, map, z10, z11, url, url2, colorInformation, map2, list2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return r.b(this.packageIds, configuration.packageIds) && r.b(this.defaultPackage, configuration.defaultPackage) && r.b(this.imagesWebp, configuration.imagesWebp) && r.b(this.legacyImages, configuration.legacyImages) && r.b(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && r.b(this.termsOfServiceURL, configuration.termsOfServiceURL) && r.b(this.privacyURL, configuration.privacyURL) && r.b(this.colors, configuration.colors) && r.b(this.colorsByTier, configuration.colorsByTier) && r.b(this.tiers, configuration.tiers) && r.b(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map<String, ColorInformation> getColorsByTier() {
            return this.colorsByTier;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new Images(header, background, icon2);
        }

        public final Map<String, Images> getImagesByTier() {
            return this.imagesByTier;
        }

        public final Images getImagesWebp$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final List<Tier> getTiers() {
            return this.tiers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [int] */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            Map<String, Images> map = this.imagesByTier;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            boolean z10 = this.blurredBackgroundImage;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int i10 = (iHashCode5 + r12) * 31;
            boolean z11 = this.displayRestorePurchases;
            int i11 = (i10 + (z11 ? 1 : z11)) * 31;
            URL url = this.termsOfServiceURL;
            int iHashCode6 = (i11 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            int iHashCode7 = (((iHashCode6 + (url2 == null ? 0 : url2.hashCode())) * 31) + this.colors.hashCode()) * 31;
            Map<String, ColorInformation> map2 = this.colorsByTier;
            int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<Tier> list = this.tiers;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultTier;
            return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", imagesByTier=" + this.imagesByTier + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ", colorsByTier=" + this.colorsByTier + ", tiers=" + this.tiers + ", defaultTier=" + this.defaultTier + ')';
        }
    }

    public static final class LocalizedConfiguration {
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final Map<String, OfferOverride> offerOverrides;
        private final String subtitle;
        private final String tierName;
        private final String title;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new e(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), null, new k0(n1.f790a, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE)};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<LocalizedConfiguration> serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }
        }

        public static final class Feature {
            public static final Companion Companion = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Feature> serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Feature(int i10, String str, String str2, String str3, j1 j1Var) {
                if (1 != (i10 & 1)) {
                    z0.a(i10, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i10 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public Feature(String str, String str2, String str3) {
                r.f(str, com.amazon.a.a.o.b.S);
                this.title = str;
                this.content = str2;
                this.iconID = str3;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i10, j jVar) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = feature.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i10 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final /* synthetic */ void write$Self(Feature feature, d dVar, f fVar) {
                dVar.w(fVar, 0, feature.title);
                if (dVar.r(fVar, 1) || feature.content != null) {
                    dVar.k(fVar, 1, n1.f790a, feature.content);
                }
                if (dVar.r(fVar, 2) || feature.iconID != null) {
                    dVar.k(fVar, 2, n1.f790a, feature.iconID);
                }
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.content;
            }

            public final String component3() {
                return this.iconID;
            }

            public final Feature copy(String str, String str2, String str3) {
                r.f(str, com.amazon.a.a.o.b.S);
                return new Feature(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return r.b(this.title, feature.title) && r.b(this.content, feature.content) && r.b(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }
        }

        public static final class OfferOverride {
            public static final Companion Companion = new Companion(null);
            private final String offerBadge;
            private final String offerDetails;
            private final String offerDetailsWithIntroOffer;
            private final String offerDetailsWithMultipleIntroOffers;
            private final String offerName;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<OfferOverride> serializer() {
                    return PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ OfferOverride(int i10, String str, String str2, String str3, String str4, String str5, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i10 & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i10 & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i10 & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            public OfferOverride(String str, String str2, String str3, String str4, String str5) {
                r.f(str, "offerName");
                r.f(str2, "offerDetails");
                this.offerName = str;
                this.offerDetails = str2;
                this.offerDetailsWithIntroOffer = str3;
                this.offerDetailsWithMultipleIntroOffers = str4;
                this.offerBadge = str5;
            }

            public /* synthetic */ OfferOverride(String str, String str2, String str3, String str4, String str5, int i10, j jVar) {
                this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
            }

            public static /* synthetic */ OfferOverride copy$default(OfferOverride offerOverride, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offerOverride.offerName;
                }
                if ((i10 & 2) != 0) {
                    str2 = offerOverride.offerDetails;
                }
                String str6 = str2;
                if ((i10 & 4) != 0) {
                    str3 = offerOverride.offerDetailsWithIntroOffer;
                }
                String str7 = str3;
                if ((i10 & 8) != 0) {
                    str4 = offerOverride.offerDetailsWithMultipleIntroOffers;
                }
                String str8 = str4;
                if ((i10 & 16) != 0) {
                    str5 = offerOverride.offerBadge;
                }
                return offerOverride.copy(str, str6, str7, str8, str5);
            }

            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            public static /* synthetic */ void getOfferName$annotations() {
            }

            public static final /* synthetic */ void write$Self(OfferOverride offerOverride, d dVar, f fVar) {
                dVar.w(fVar, 0, offerOverride.offerName);
                dVar.w(fVar, 1, offerOverride.offerDetails);
                if (dVar.r(fVar, 2) || offerOverride.offerDetailsWithIntroOffer != null) {
                    dVar.k(fVar, 2, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithIntroOffer);
                }
                if (dVar.r(fVar, 3) || offerOverride.offerDetailsWithMultipleIntroOffers != null) {
                    dVar.k(fVar, 3, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithMultipleIntroOffers);
                }
                if (dVar.r(fVar, 4) || offerOverride.offerBadge != null) {
                    dVar.k(fVar, 4, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerBadge);
                }
            }

            public final String component1() {
                return this.offerName;
            }

            public final String component2() {
                return this.offerDetails;
            }

            public final String component3() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String component4() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String component5() {
                return this.offerBadge;
            }

            public final OfferOverride copy(String str, String str2, String str3, String str4, String str5) {
                r.f(str, "offerName");
                r.f(str2, "offerDetails");
                return new OfferOverride(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferOverride)) {
                    return false;
                }
                OfferOverride offerOverride = (OfferOverride) obj;
                return r.b(this.offerName, offerOverride.offerName) && r.b(this.offerDetails, offerOverride.offerDetails) && r.b(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && r.b(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && r.b(this.offerBadge, offerOverride.offerBadge);
            }

            public final String getOfferBadge() {
                return this.offerBadge;
            }

            public final String getOfferDetails() {
                return this.offerDetails;
            }

            public final String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            public final String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final String getOfferName() {
                return this.offerName;
            }

            public int hashCode() {
                int iHashCode = ((this.offerName.hashCode() * 31) + this.offerDetails.hashCode()) * 31;
                String str = this.offerDetailsWithIntroOffer;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.offerDetailsWithMultipleIntroOffers;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.offerBadge;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OfferOverride(offerName=" + this.offerName + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerBadge=" + this.offerBadge + ')';
            }
        }

        public /* synthetic */ LocalizedConfiguration(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, j1 j1Var) {
            if (5 != (i10 & 5)) {
                z0.a(i10, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i10 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i10 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i10 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i10 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i10 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i10 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i10 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i10 & 512) == 0) {
                this.features = u.m();
            } else {
                this.features = list;
            }
            if ((i10 & 1024) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            if ((i10 & 2048) == 0) {
                this.offerOverrides = r0.e();
            } else {
                this.offerOverrides = map;
            }
        }

        public LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list, String str10, Map<String, OfferOverride> map) {
            r.f(str, com.amazon.a.a.o.b.S);
            r.f(str3, "callToAction");
            r.f(list, "features");
            r.f(map, "offerOverrides");
            this.title = str;
            this.subtitle = str2;
            this.callToAction = str3;
            this.callToActionWithIntroOffer = str4;
            this.callToActionWithMultipleIntroOffers = str5;
            this.offerDetails = str6;
            this.offerDetailsWithIntroOffer = str7;
            this.offerDetailsWithMultipleIntroOffers = str8;
            this.offerName = str9;
            this.features = list;
            this.tierName = str10;
            this.offerOverrides = map;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, int i10, j jVar) {
            this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? u.m() : list, (i10 & 1024) != 0 ? null : str10, (i10 & 2048) != 0 ? r0.e() : map);
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferName$annotations() {
        }

        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static /* synthetic */ void getTierName$annotations() {
        }

        public static final /* synthetic */ void write$Self(LocalizedConfiguration localizedConfiguration, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            dVar.w(fVar, 0, localizedConfiguration.title);
            if (dVar.r(fVar, 1) || localizedConfiguration.subtitle != null) {
                dVar.k(fVar, 1, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.subtitle);
            }
            dVar.w(fVar, 2, localizedConfiguration.callToAction);
            if (dVar.r(fVar, 3) || localizedConfiguration.callToActionWithIntroOffer != null) {
                dVar.k(fVar, 3, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithIntroOffer);
            }
            if (dVar.r(fVar, 4) || localizedConfiguration.callToActionWithMultipleIntroOffers != null) {
                dVar.k(fVar, 4, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithMultipleIntroOffers);
            }
            if (dVar.r(fVar, 5) || localizedConfiguration.offerDetails != null) {
                dVar.k(fVar, 5, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetails);
            }
            if (dVar.r(fVar, 6) || localizedConfiguration.offerDetailsWithIntroOffer != null) {
                dVar.k(fVar, 6, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithIntroOffer);
            }
            if (dVar.r(fVar, 7) || localizedConfiguration.offerDetailsWithMultipleIntroOffers != null) {
                dVar.k(fVar, 7, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithMultipleIntroOffers);
            }
            if (dVar.r(fVar, 8) || localizedConfiguration.offerName != null) {
                dVar.k(fVar, 8, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerName);
            }
            if (dVar.r(fVar, 9) || !r.b(localizedConfiguration.features, u.m())) {
                dVar.E(fVar, 9, bVarArr[9], localizedConfiguration.features);
            }
            if (dVar.r(fVar, 10) || localizedConfiguration.tierName != null) {
                dVar.k(fVar, 10, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.tierName);
            }
            if (dVar.r(fVar, 11) || !r.b(localizedConfiguration.offerOverrides, r0.e())) {
                dVar.E(fVar, 11, bVarArr[11], localizedConfiguration.offerOverrides);
            }
        }

        public final String component1() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        public final String component11() {
            return this.tierName;
        }

        public final Map<String, OfferOverride> component12() {
            return this.offerOverrides;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.callToAction;
        }

        public final String component4() {
            return this.callToActionWithIntroOffer;
        }

        public final String component5() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final String component6() {
            return this.offerDetails;
        }

        public final String component7() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String component8() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String component9() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list, String str10, Map<String, OfferOverride> map) {
            r.f(str, com.amazon.a.a.o.b.S);
            r.f(str3, "callToAction");
            r.f(list, "features");
            r.f(map, "offerOverrides");
            return new LocalizedConfiguration(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return r.b(this.title, localizedConfiguration.title) && r.b(this.subtitle, localizedConfiguration.subtitle) && r.b(this.callToAction, localizedConfiguration.callToAction) && r.b(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && r.b(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && r.b(this.offerDetails, localizedConfiguration.offerDetails) && r.b(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && r.b(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && r.b(this.offerName, localizedConfiguration.offerName) && r.b(this.features, localizedConfiguration.features) && r.b(this.tierName, localizedConfiguration.tierName) && r.b(this.offerOverrides, localizedConfiguration.offerOverrides);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final Map<String, OfferOverride> getOfferOverrides() {
            return this.offerOverrides;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTierName() {
            return this.tierName;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
            String str2 = this.callToActionWithIntroOffer;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.features.hashCode()) * 31;
            String str8 = this.tierName;
            return ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.offerOverrides.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ", tierName=" + this.tierName + ", offerOverrides=" + this.offerOverrides + ')';
        }
    }

    static {
        n1 n1Var = n1.f790a;
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new b[]{null, null, null, null, new k0(n1Var, paywallData$LocalizedConfiguration$$serializer), new k0(n1Var, new k0(n1Var, paywallData$LocalizedConfiguration$$serializer)), null, null};
    }

    public /* synthetic */ PaywallData(int i10, String str, Configuration configuration, URL url, int i11, Map map, Map map2, List list, String str2, j1 j1Var) {
        if (23 != (i10 & 23)) {
            z0.a(i10, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i10 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        this.localization = map;
        if ((i10 & 32) == 0) {
            this.localizationByTier = r0.e();
        } else {
            this.localizationByTier = map2;
        }
        if ((i10 & 64) == 0) {
            this.zeroDecimalPlaceCountries = u.m();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i10 & 128) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallData(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map, Map<String, ? extends Map<String, LocalizedConfiguration>> map2, List<String> list, String str2) {
        r.f(str, "templateName");
        r.f(configuration, "config");
        r.f(url, "assetBaseURL");
        r.f(map, "localization");
        r.f(map2, "localizationByTier");
        r.f(list, "zeroDecimalPlaceCountries");
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        this.revision = i10;
        this.localization = map;
        this.localizationByTier = map2;
        this.zeroDecimalPlaceCountries = list;
        this.defaultLocale = str2;
    }

    public /* synthetic */ PaywallData(String str, Configuration configuration, URL url, int i10, Map map, Map map2, List list, String str2, int i11, j jVar) {
        this(str, configuration, url, (i11 & 8) != 0 ? 0 : i10, map, (i11 & 32) != 0 ? r0.e() : map2, (i11 & 64) != 0 ? u.m() : list, (i11 & 128) != 0 ? null : str2);
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getLocalizationByTier$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    private final s<Locale, Map<String, LocalizedConfiguration>> tieredConfigForLocales(List<Locale> list) {
        Object next;
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            Map<String, LocalizedConfiguration> mapTieredConfigForLocale = tieredConfigForLocale(localeConvertToCorrectlyFormattedLocale);
            if (mapTieredConfigForLocale != null) {
                return x.a(localeConvertToCorrectlyFormattedLocale, mapTieredConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localizationByTier.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (r.b(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return x.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) c0.X(this.localizationByTier.entrySet());
        return x.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self(PaywallData paywallData, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.w(fVar, 0, paywallData.templateName);
        dVar.E(fVar, 1, PaywallData$Configuration$$serializer.INSTANCE, paywallData.config);
        dVar.E(fVar, 2, URLSerializer.INSTANCE, paywallData.assetBaseURL);
        if (dVar.r(fVar, 3) || paywallData.revision != 0) {
            dVar.y(fVar, 3, paywallData.revision);
        }
        dVar.E(fVar, 4, bVarArr[4], paywallData.localization);
        if (dVar.r(fVar, 5) || !r.b(paywallData.localizationByTier, r0.e())) {
            dVar.E(fVar, 5, bVarArr[5], paywallData.localizationByTier);
        }
        if (dVar.r(fVar, 6) || !r.b(paywallData.zeroDecimalPlaceCountries, u.m())) {
            dVar.E(fVar, 6, GoogleListSerializer.INSTANCE, paywallData.zeroDecimalPlaceCountries);
        }
        if (dVar.r(fVar, 7) || paywallData.defaultLocale != null) {
            dVar.k(fVar, 7, n1.f790a, paywallData.defaultLocale);
        }
    }

    public final String component1() {
        return this.templateName;
    }

    public final Configuration component2() {
        return this.config;
    }

    public final URL component3() {
        return this.assetBaseURL;
    }

    public final int component4() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_defaultsRelease() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> component6$purchases_defaultsRelease() {
        return this.localizationByTier;
    }

    public final List<String> component7() {
        return this.zeroDecimalPlaceCountries;
    }

    public final String component8() {
        return this.defaultLocale;
    }

    public final LocalizedConfiguration configForLocale(Locale locale) {
        Object next;
        r.f(locale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(locale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator<T> it = this.localization.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final PaywallData copy(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map, Map<String, ? extends Map<String, LocalizedConfiguration>> map2, List<String> list, String str2) {
        r.f(str, "templateName");
        r.f(configuration, "config");
        r.f(url, "assetBaseURL");
        r.f(map, "localization");
        r.f(map2, "localizationByTier");
        r.f(list, "zeroDecimalPlaceCountries");
        return new PaywallData(str, configuration, url, i10, map, map2, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return r.b(this.templateName, paywallData.templateName) && r.b(this.config, paywallData.config) && r.b(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && r.b(this.localization, paywallData.localization) && r.b(this.localizationByTier, paywallData.localizationByTier) && r.b(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && r.b(this.defaultLocale, paywallData.defaultLocale);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_defaultsRelease() {
        return this.localization;
    }

    public final Map<String, Map<String, LocalizedConfiguration>> getLocalizationByTier$purchases_defaultsRelease() {
        return this.localizationByTier;
    }

    public final s<Locale, LocalizedConfiguration> getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final s<Locale, Map<String, LocalizedConfiguration>> getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(LocaleExtensionsKt.getDefaultLocales());
    }

    public final List<String> getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.templateName.hashCode() * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.localization.hashCode()) * 31) + this.localizationByTier.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        String str = this.defaultLocale;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final s<Locale, LocalizedConfiguration> localizedConfiguration(List<Locale> list) {
        Object next;
        r.f(list, "locales");
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            Locale localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            LocalizedConfiguration localizedConfigurationConfigForLocale = configForLocale(localeConvertToCorrectlyFormattedLocale);
            if (localizedConfigurationConfigForLocale != null) {
                return x.a(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator<T> it2 = this.localization.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (r.b(LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return x.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) c0.X(this.localization.entrySet());
        return x.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public final Map<String, LocalizedConfiguration> tieredConfigForLocale(Locale locale) {
        Object next;
        r.f(locale, "requiredLocale");
        Map<String, LocalizedConfiguration> map = this.localizationByTier.get(locale.toString());
        if (map != null) {
            return map;
        }
        Iterator<T> it = this.localizationByTier.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Map) entry.getValue();
        }
        return null;
    }

    public String toString() {
        return "PaywallData(templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ", localizationByTier=" + this.localizationByTier + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", defaultLocale=" + this.defaultLocale + ')';
    }
}
