package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import ae.j;
import ae.r;
import af.h;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
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
public final class PartialImageComponent implements PartialComponent {
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, null, null, FitMode.Companion.serializer(), new e("com.revenuecat.purchases.paywalls.components.properties.MaskShape", i0.b(MaskShape.class), new c[]{i0.b(MaskShape.Concave.class), i0.b(MaskShape.Convex.class), i0.b(MaskShape.Pill.class), i0.b(MaskShape.Rectangle.class)}, new b[]{new x0("concave", MaskShape.Concave.INSTANCE, new Annotation[0]), new x0("convex", MaskShape.Convex.INSTANCE, new Annotation[0]), new x0("pill", MaskShape.Pill.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PartialImageComponent> serializer() {
            return PartialImageComponent$$serializer.INSTANCE;
        }
    }

    private PartialImageComponent(int i10, Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, PartialImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.source = null;
        } else {
            this.source = themeImageUrls;
        }
        if ((i10 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i10 & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i10 & 16) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode;
        }
        if ((i10 & 32) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i10 & 64) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
    }

    public /* synthetic */ PartialImageComponent(int i10, Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, j1 j1Var, j jVar) {
        this(i10, bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, j1Var);
    }

    private PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme) {
        this.visible = bool;
        this.source = themeImageUrls;
        this.size = size;
        this.overrideSourceLid = str;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
    }

    public /* synthetic */ PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, int i10, j jVar) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool, (i10 & 2) != 0 ? null : themeImageUrls, (i10 & 4) != 0 ? null : size, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : fitMode, (i10 & 32) != 0 ? null : maskShape, (i10 & 64) == 0 ? colorScheme : null, null);
    }

    public /* synthetic */ PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, j jVar) {
        this(bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme);
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q$annotations, reason: not valid java name */
    public static /* synthetic */ void m28getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialImageComponent partialImageComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        if (dVar.r(fVar, 0) || !r.b(partialImageComponent.visible, Boolean.TRUE)) {
            dVar.k(fVar, 0, h.f763a, partialImageComponent.visible);
        }
        if (dVar.r(fVar, 1) || partialImageComponent.source != null) {
            dVar.k(fVar, 1, ThemeImageUrls$$serializer.INSTANCE, partialImageComponent.source);
        }
        if (dVar.r(fVar, 2) || partialImageComponent.size != null) {
            dVar.k(fVar, 2, Size$$serializer.INSTANCE, partialImageComponent.size);
        }
        if (dVar.r(fVar, 3) || partialImageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = partialImageComponent.overrideSourceLid;
            dVar.k(fVar, 3, localizationKey$$serializer, str != null ? LocalizationKey.m61boximpl(str) : null);
        }
        if (dVar.r(fVar, 4) || partialImageComponent.fitMode != null) {
            dVar.k(fVar, 4, bVarArr[4], partialImageComponent.fitMode);
        }
        if (dVar.r(fVar, 5) || partialImageComponent.maskShape != null) {
            dVar.k(fVar, 5, bVarArr[5], partialImageComponent.maskShape);
        }
        if (dVar.r(fVar, 6) || partialImageComponent.colorOverlay != null) {
            dVar.k(fVar, 6, ColorScheme$$serializer.INSTANCE, partialImageComponent.colorOverlay);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialImageComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.PartialImageComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialImageComponent) r5
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
            if (r1 != 0) goto L37
            if (r3 != 0) goto L39
            r1 = r0
            goto L3f
        L37:
            if (r3 != 0) goto L3b
        L39:
            r1 = r2
            goto L3f
        L3b:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m64equalsimpl0(r1, r3)
        L3f:
            if (r1 != 0) goto L42
            return r2
        L42:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L49
            return r2
        L49:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L54
            return r2
        L54:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r5 = r5.colorOverlay
            boolean r5 = ae.r.b(r1, r5)
            if (r5 != 0) goto L5f
            return r2
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialImageComponent.equals(java.lang.Object):boolean");
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
    public final /* synthetic */ String m29getOverrideSourceLidsa7TU9Q() {
        return this.overrideSourceLid;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ThemeImageUrls themeImageUrls = this.source;
        int iHashCode2 = (iHashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Size size = this.size;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        String str = this.overrideSourceLid;
        int iM65hashCodeimpl = (iHashCode3 + (str == null ? 0 : LocalizationKey.m65hashCodeimpl(str))) * 31;
        FitMode fitMode = this.fitMode;
        int iHashCode4 = (iM65hashCodeimpl + (fitMode == null ? 0 : fitMode.hashCode())) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode5 = (iHashCode4 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        return iHashCode5 + (colorScheme != null ? colorScheme.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PartialImageComponent(visible=");
        sb2.append(this.visible);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb2.append((Object) (str == null ? "null" : LocalizationKey.m66toStringimpl(str)));
        sb2.append(", fitMode=");
        sb2.append(this.fitMode);
        sb2.append(", maskShape=");
        sb2.append(this.maskShape);
        sb2.append(", colorOverlay=");
        sb2.append(this.colorOverlay);
        sb2.append(')');
        return sb2.toString();
    }
}
