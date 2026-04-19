package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ColorScheme {
    private static final b<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final ColorInfo dark;
    private final ColorInfo light;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ColorScheme> serializer() {
            return ColorScheme$$serializer.INSTANCE;
        }
    }

    static {
        c cVarB = i0.b(ColorInfo.class);
        c[] cVarArr = {i0.b(ColorInfo.Alias.class), i0.b(ColorInfo.Gradient.Linear.class), i0.b(ColorInfo.Gradient.Radial.class), i0.b(ColorInfo.Hex.class)};
        ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = ColorInfo$Alias$$serializer.INSTANCE;
        ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = ColorInfo$Gradient$Linear$$serializer.INSTANCE;
        ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = ColorInfo$Gradient$Radial$$serializer.INSTANCE;
        ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = ColorInfo$Hex$$serializer.INSTANCE;
        $childSerializers = new b[]{new e("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", cVarB, cVarArr, new b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0]), new e("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", i0.b(ColorInfo.class), new c[]{i0.b(ColorInfo.Alias.class), i0.b(ColorInfo.Gradient.Linear.class), i0.b(ColorInfo.Gradient.Radial.class), i0.b(ColorInfo.Hex.class)}, new b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0])};
    }

    public /* synthetic */ ColorScheme(int i10, ColorInfo colorInfo, ColorInfo colorInfo2, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, ColorScheme$$serializer.INSTANCE.getDescriptor());
        }
        this.light = colorInfo;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = colorInfo2;
        }
    }

    public ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2) {
        r.f(colorInfo, "light");
        this.light = colorInfo;
        this.dark = colorInfo2;
    }

    public /* synthetic */ ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2, int i10, j jVar) {
        this(colorInfo, (i10 & 2) != 0 ? null : colorInfo2);
    }

    public static final /* synthetic */ void write$Self(ColorScheme colorScheme, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, bVarArr[0], colorScheme.light);
        if (dVar.r(fVar, 1) || colorScheme.dark != null) {
            dVar.k(fVar, 1, bVarArr[1], colorScheme.dark);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) obj;
        return r.b(this.light, colorScheme.light) && r.b(this.dark, colorScheme.dark);
    }

    public final /* synthetic */ ColorInfo getDark() {
        return this.dark;
    }

    public final /* synthetic */ ColorInfo getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        ColorInfo colorInfo = this.dark;
        return iHashCode + (colorInfo == null ? 0 : colorInfo.hashCode());
    }

    public String toString() {
        return "ColorScheme(light=" + this.light + ", dark=" + this.dark + ')';
    }
}
