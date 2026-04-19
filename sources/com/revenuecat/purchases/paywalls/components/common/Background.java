package com.revenuecat.purchases.paywalls.components.common;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface Background {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Color implements Background {
        public static final Companion Companion = new Companion(null);
        private final ColorScheme value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Color> serializer() {
                return Background$Color$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Color(int i10, ColorScheme colorScheme, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, Background$Color$$serializer.INSTANCE.getDescriptor());
            }
            this.value = colorScheme;
        }

        public Color(ColorScheme colorScheme) {
            r.f(colorScheme, "value");
            this.value = colorScheme;
        }

        public static /* synthetic */ Color copy$default(Color color, ColorScheme colorScheme, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                colorScheme = color.value;
            }
            return color.copy(colorScheme);
        }

        public final ColorScheme component1() {
            return this.value;
        }

        public final Color copy(ColorScheme colorScheme) {
            r.f(colorScheme, "value");
            return new Color(colorScheme);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Color) && r.b(this.value, ((Color) obj).value);
        }

        public final /* synthetic */ ColorScheme getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Color(value=" + this.value + ')';
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<Background> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.common.Background", i0.b(Background.class), new c[]{i0.b(Color.class), i0.b(Image.class)}, new b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public static final class Image implements Background {
        public static final Companion Companion = new Companion(null);
        private final ThemeImageUrls value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Image> serializer() {
                return Background$Image$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Image(int i10, ThemeImageUrls themeImageUrls, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, Background$Image$$serializer.INSTANCE.getDescriptor());
            }
            this.value = themeImageUrls;
        }

        public Image(ThemeImageUrls themeImageUrls) {
            r.f(themeImageUrls, "value");
            this.value = themeImageUrls;
        }

        public static /* synthetic */ Image copy$default(Image image, ThemeImageUrls themeImageUrls, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                themeImageUrls = image.value;
            }
            return image.copy(themeImageUrls);
        }

        public final ThemeImageUrls component1() {
            return this.value;
        }

        public final Image copy(ThemeImageUrls themeImageUrls) {
            r.f(themeImageUrls, "value");
            return new Image(themeImageUrls);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && r.b(this.value, ((Image) obj).value);
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Image(value=" + this.value + ')';
        }
    }
}
