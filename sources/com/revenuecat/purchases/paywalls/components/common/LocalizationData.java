package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface LocalizationData {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<LocalizationData> serializer() {
            return LocalizationDataSerializer.INSTANCE;
        }
    }

    public static final class Image implements LocalizationData {
        public static final Companion Companion = new Companion(null);
        private final ThemeImageUrls value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Image> serializer() {
                return LocalizationData$Image$$serializer.INSTANCE;
            }
        }

        private /* synthetic */ Image(ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Image m43boximpl(ThemeImageUrls themeImageUrls) {
            return new Image(themeImageUrls);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ThemeImageUrls m44constructorimpl(ThemeImageUrls themeImageUrls) {
            r.f(themeImageUrls, "value");
            return themeImageUrls;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m45equalsimpl(ThemeImageUrls themeImageUrls, Object obj) {
            return (obj instanceof Image) && r.b(themeImageUrls, ((Image) obj).m49unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m46equalsimpl0(ThemeImageUrls themeImageUrls, ThemeImageUrls themeImageUrls2) {
            return r.b(themeImageUrls, themeImageUrls2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m47hashCodeimpl(ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m48toStringimpl(ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(Object obj) {
            return m45equalsimpl(this.value, obj);
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m47hashCodeimpl(this.value);
        }

        public String toString() {
            return m48toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ThemeImageUrls m49unboximpl() {
            return this.value;
        }
    }

    public static final class Text implements LocalizationData {
        public static final Companion Companion = new Companion(null);
        private final String value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Text> serializer() {
                return LocalizationData$Text$$serializer.INSTANCE;
            }
        }

        private /* synthetic */ Text(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Text m52boximpl(String str) {
            return new Text(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m53constructorimpl(String str) {
            r.f(str, "value");
            return str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m54equalsimpl(String str, Object obj) {
            return (obj instanceof Text) && r.b(str, ((Text) obj).m58unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m55equalsimpl0(String str, String str2) {
            return r.b(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m56hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m57toStringimpl(String str) {
            return "Text(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m54equalsimpl(this.value, obj);
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m56hashCodeimpl(this.value);
        }

        public String toString() {
            return m57toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m58unboximpl() {
            return this.value;
        }
    }
}
