package com.revenuecat.purchases.paywalls.components.properties;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ThemeImageUrls {
    public static final Companion Companion = new Companion(null);
    private final ImageUrls dark;
    private final ImageUrls light;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ThemeImageUrls> serializer() {
            return ThemeImageUrls$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ThemeImageUrls(int i10, ImageUrls imageUrls, ImageUrls imageUrls2, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, ThemeImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.light = imageUrls;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = imageUrls2;
        }
    }

    public ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2) {
        r.f(imageUrls, "light");
        this.light = imageUrls;
        this.dark = imageUrls2;
    }

    public /* synthetic */ ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2, int i10, j jVar) {
        this(imageUrls, (i10 & 2) != 0 ? null : imageUrls2);
    }

    public static final /* synthetic */ void write$Self(ThemeImageUrls themeImageUrls, d dVar, f fVar) {
        ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
        dVar.E(fVar, 0, imageUrls$$serializer, themeImageUrls.light);
        if (dVar.r(fVar, 1) || themeImageUrls.dark != null) {
            dVar.k(fVar, 1, imageUrls$$serializer, themeImageUrls.dark);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeImageUrls)) {
            return false;
        }
        ThemeImageUrls themeImageUrls = (ThemeImageUrls) obj;
        return r.b(this.light, themeImageUrls.light) && r.b(this.dark, themeImageUrls.dark);
    }

    public final /* synthetic */ ImageUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ ImageUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        ImageUrls imageUrls = this.dark;
        return iHashCode + (imageUrls == null ? 0 : imageUrls.hashCode());
    }

    public String toString() {
        return "ThemeImageUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }
}
