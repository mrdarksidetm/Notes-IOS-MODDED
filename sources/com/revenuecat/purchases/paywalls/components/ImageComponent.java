package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ImageComponent implements PaywallComponent {
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final ComponentOverrides<PartialImageComponent> overrides;
    private final Size size;
    private final ThemeImageUrls source;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, null, new e("com.revenuecat.purchases.paywalls.components.properties.MaskShape", i0.b(MaskShape.class), new c[]{i0.b(MaskShape.Concave.class), i0.b(MaskShape.Convex.class), i0.b(MaskShape.Pill.class), i0.b(MaskShape.Rectangle.class)}, new b[]{new x0("concave", MaskShape.Concave.INSTANCE, new Annotation[0]), new x0("convex", MaskShape.Convex.INSTANCE, new Annotation[0]), new x0("pill", MaskShape.Pill.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, FitMode.Companion.serializer(), ComponentOverrides.Companion.serializer(PartialImageComponent$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ImageComponent> serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }
    }

    private ImageComponent(int i10, ThemeImageUrls themeImageUrls, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, ComponentOverrides<PartialImageComponent> componentOverrides, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeImageUrls;
        if ((i10 & 2) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i10 & 4) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i10 & 8) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i10 & 16) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode;
        }
        if ((i10 & 64) == 0) {
            this.overrides = null;
        } else {
            this.overrides = componentOverrides;
        }
    }

    public /* synthetic */ ImageComponent(int i10, ThemeImageUrls themeImageUrls, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, ComponentOverrides componentOverrides, j1 j1Var, j jVar) {
        this(i10, themeImageUrls, size, str, maskShape, colorScheme, fitMode, (ComponentOverrides<PartialImageComponent>) componentOverrides, j1Var);
    }

    private ImageComponent(ThemeImageUrls themeImageUrls, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, ComponentOverrides<PartialImageComponent> componentOverrides) {
        r.f(themeImageUrls, "source");
        r.f(size, "size");
        r.f(fitMode, "fitMode");
        this.source = themeImageUrls;
        this.size = size;
        this.overrideSourceLid = str;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode;
        this.overrides = componentOverrides;
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, ComponentOverrides componentOverrides, int i10, j jVar) {
        this(themeImageUrls, (i10 & 2) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : maskShape, (i10 & 16) != 0 ? null : colorScheme, (i10 & 32) != 0 ? FitMode.FIT : fitMode, (i10 & 64) != 0 ? null : componentOverrides, null);
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, ComponentOverrides componentOverrides, j jVar) {
        this(themeImageUrls, size, str, maskShape, colorScheme, fitMode, componentOverrides);
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q$annotations, reason: not valid java name */
    public static /* synthetic */ void m26getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(ImageComponent imageComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, ThemeImageUrls$$serializer.INSTANCE, imageComponent.source);
        if (dVar.r(fVar, 1) || !r.b(imageComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.E(fVar, 1, Size$$serializer.INSTANCE, imageComponent.size);
        }
        if (dVar.r(fVar, 2) || imageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = imageComponent.overrideSourceLid;
            dVar.k(fVar, 2, localizationKey$$serializer, str != null ? LocalizationKey.m61boximpl(str) : null);
        }
        if (dVar.r(fVar, 3) || imageComponent.maskShape != null) {
            dVar.k(fVar, 3, bVarArr[3], imageComponent.maskShape);
        }
        if (dVar.r(fVar, 4) || imageComponent.colorOverlay != null) {
            dVar.k(fVar, 4, ColorScheme$$serializer.INSTANCE, imageComponent.colorOverlay);
        }
        if (dVar.r(fVar, 5) || imageComponent.fitMode != FitMode.FIT) {
            dVar.E(fVar, 5, bVarArr[5], imageComponent.fitMode);
        }
        if (dVar.r(fVar, 6) || imageComponent.overrides != null) {
            dVar.k(fVar, 6, bVarArr[6], imageComponent.overrides);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.ImageComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.ImageComponent r5 = (com.revenuecat.purchases.paywalls.components.ImageComponent) r5
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
            if (r1 != 0) goto L2c
            if (r3 != 0) goto L2e
            r1 = r0
            goto L34
        L2c:
            if (r3 != 0) goto L30
        L2e:
            r1 = r2
            goto L34
        L30:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m64equalsimpl0(r1, r3)
        L34:
            if (r1 != 0) goto L37
            return r2
        L37:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L42
            return r2
        L42:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L4d
            return r2
        L4d:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L54
            return r2
        L54:
            com.revenuecat.purchases.paywalls.components.common.ComponentOverrides<com.revenuecat.purchases.paywalls.components.PartialImageComponent> r1 = r4.overrides
            com.revenuecat.purchases.paywalls.components.common.ComponentOverrides<com.revenuecat.purchases.paywalls.components.PartialImageComponent> r5 = r5.overrides
            boolean r5 = ae.r.b(r1, r5)
            if (r5 != 0) goto L5f
            return r2
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q, reason: not valid java name */
    public final /* synthetic */ String m27getOverrideSourceLidsa7TU9Q() {
        return this.overrideSourceLid;
    }

    public final /* synthetic */ ComponentOverrides getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + this.size.hashCode()) * 31;
        String str = this.overrideSourceLid;
        int iM65hashCodeimpl = (iHashCode + (str == null ? 0 : LocalizationKey.m65hashCodeimpl(str))) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode2 = (iM65hashCodeimpl + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int iHashCode3 = (((iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.fitMode.hashCode()) * 31;
        ComponentOverrides<PartialImageComponent> componentOverrides = this.overrides;
        return iHashCode3 + (componentOverrides != null ? componentOverrides.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ImageComponent(source=");
        sb2.append(this.source);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb2.append((Object) (str == null ? "null" : LocalizationKey.m66toStringimpl(str)));
        sb2.append(", maskShape=");
        sb2.append(this.maskShape);
        sb2.append(", colorOverlay=");
        sb2.append(this.colorOverlay);
        sb2.append(", fitMode=");
        sb2.append(this.fitMode);
        sb2.append(", overrides=");
        sb2.append(this.overrides);
        sb2.append(')');
        return sb2.toString();
    }
}
