package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import ae.j;
import ae.r;
import af.b0;
import af.h;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PartialStackComponent implements PartialComponent {
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Dimension dimension;
    private final Padding margin;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, new e("com.revenuecat.purchases.paywalls.components.properties.Dimension", i0.b(Dimension.class), new c[]{i0.b(Dimension.Horizontal.class), i0.b(Dimension.Vertical.class), i0.b(Dimension.ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, new e("com.revenuecat.purchases.paywalls.components.properties.Shape", i0.b(Shape.class), new c[]{i0.b(Shape.Pill.class), i0.b(Shape.Rectangle.class)}, new b[]{new x0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PartialStackComponent> serializer() {
            return PartialStackComponent$$serializer.INSTANCE;
        }
    }

    public PartialStackComponent() {
        this((Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, 1023, (j) null);
    }

    public /* synthetic */ PartialStackComponent(int i10, Boolean bool, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, PartialStackComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.dimension = null;
        } else {
            this.dimension = dimension;
        }
        if ((i10 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i10 & 8) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f10;
        }
        if ((i10 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i10 & 64) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i10 & 128) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i10 & 256) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i10 & 512) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
    }

    public PartialStackComponent(Boolean bool, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow) {
        this.visible = bool;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f10;
        this.backgroundColor = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
    }

    public /* synthetic */ PartialStackComponent(Boolean bool, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, int i10, j jVar) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool, (i10 & 2) != 0 ? null : dimension, (i10 & 4) != 0 ? null : size, (i10 & 8) != 0 ? null : f10, (i10 & 16) != 0 ? null : colorScheme, (i10 & 32) != 0 ? null : padding, (i10 & 64) != 0 ? null : padding2, (i10 & 128) != 0 ? null : shape, (i10 & 256) != 0 ? null : border, (i10 & 512) == 0 ? shadow : null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialStackComponent partialStackComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        if (dVar.r(fVar, 0) || !r.b(partialStackComponent.visible, Boolean.TRUE)) {
            dVar.k(fVar, 0, h.f763a, partialStackComponent.visible);
        }
        if (dVar.r(fVar, 1) || partialStackComponent.dimension != null) {
            dVar.k(fVar, 1, bVarArr[1], partialStackComponent.dimension);
        }
        if (dVar.r(fVar, 2) || partialStackComponent.size != null) {
            dVar.k(fVar, 2, Size$$serializer.INSTANCE, partialStackComponent.size);
        }
        if (dVar.r(fVar, 3) || partialStackComponent.spacing != null) {
            dVar.k(fVar, 3, b0.f743a, partialStackComponent.spacing);
        }
        if (dVar.r(fVar, 4) || partialStackComponent.backgroundColor != null) {
            dVar.k(fVar, 4, ColorScheme$$serializer.INSTANCE, partialStackComponent.backgroundColor);
        }
        if (dVar.r(fVar, 5) || partialStackComponent.padding != null) {
            dVar.k(fVar, 5, Padding$$serializer.INSTANCE, partialStackComponent.padding);
        }
        if (dVar.r(fVar, 6) || partialStackComponent.margin != null) {
            dVar.k(fVar, 6, Padding$$serializer.INSTANCE, partialStackComponent.margin);
        }
        if (dVar.r(fVar, 7) || partialStackComponent.shape != null) {
            dVar.k(fVar, 7, bVarArr[7], partialStackComponent.shape);
        }
        if (dVar.r(fVar, 8) || partialStackComponent.border != null) {
            dVar.k(fVar, 8, Border$$serializer.INSTANCE, partialStackComponent.border);
        }
        if (dVar.r(fVar, 9) || partialStackComponent.shadow != null) {
            dVar.k(fVar, 9, Shadow$$serializer.INSTANCE, partialStackComponent.shadow);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialStackComponent)) {
            return false;
        }
        PartialStackComponent partialStackComponent = (PartialStackComponent) obj;
        return r.b(this.visible, partialStackComponent.visible) && r.b(this.dimension, partialStackComponent.dimension) && r.b(this.size, partialStackComponent.size) && r.b(this.spacing, partialStackComponent.spacing) && r.b(this.backgroundColor, partialStackComponent.backgroundColor) && r.b(this.padding, partialStackComponent.padding) && r.b(this.margin, partialStackComponent.margin) && r.b(this.shape, partialStackComponent.shape) && r.b(this.border, partialStackComponent.border) && r.b(this.shadow, partialStackComponent.shadow);
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Float getSpacing() {
        return this.spacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Dimension dimension = this.dimension;
        int iHashCode2 = (iHashCode + (dimension == null ? 0 : dimension.hashCode())) * 31;
        Size size = this.size;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        Float f10 = this.spacing;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode6 = (iHashCode5 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode7 = (iHashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Shape shape = this.shape;
        int iHashCode8 = (iHashCode7 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode9 = (iHashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return iHashCode9 + (shadow != null ? shadow.hashCode() : 0);
    }

    public String toString() {
        return "PartialStackComponent(visible=" + this.visible + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
    }
}
