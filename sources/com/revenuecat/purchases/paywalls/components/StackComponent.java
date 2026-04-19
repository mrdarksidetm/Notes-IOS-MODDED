package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import ae.j;
import ae.r;
import af.b0;
import af.e;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import he.c;
import java.lang.annotation.Annotation;
import java.util.List;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class StackComponent implements PaywallComponent {
    private final ColorScheme backgroundColor;
    private final Border border;
    private final List<PaywallComponent> components;
    private final Dimension dimension;
    private final Padding margin;
    private final ComponentOverrides<PartialStackComponent> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {new e(new we.e("com.revenuecat.purchases.paywalls.components.PaywallComponent", i0.b(PaywallComponent.class), new c[]{i0.b(ButtonComponent.class), i0.b(ImageComponent.class), i0.b(PackageComponent.class), i0.b(PurchaseButtonComponent.class), i0.b(StackComponent.class), i0.b(StickyFooterComponent.class), i0.b(TextComponent.class)}, new b[]{ButtonComponent$$serializer.INSTANCE, ImageComponent$$serializer.INSTANCE, PackageComponent$$serializer.INSTANCE, PurchaseButtonComponent$$serializer.INSTANCE, StackComponent$$serializer.INSTANCE, StickyFooterComponent$$serializer.INSTANCE, TextComponent$$serializer.INSTANCE}, new Annotation[0])), new we.e("com.revenuecat.purchases.paywalls.components.properties.Dimension", i0.b(Dimension.class), new c[]{i0.b(Dimension.Horizontal.class), i0.b(Dimension.Vertical.class), i0.b(Dimension.ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, new we.e("com.revenuecat.purchases.paywalls.components.properties.Shape", i0.b(Shape.class), new c[]{i0.b(Shape.Pill.class), i0.b(Shape.Rectangle.class)}, new b[]{new x0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, ComponentOverrides.Companion.serializer(PartialStackComponent$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<StackComponent> serializer() {
            return StackComponent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StackComponent(int i10, List list, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, ComponentOverrides componentOverrides, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, StackComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.components = list;
        if ((i10 & 2) == 0) {
            this.dimension = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
        } else {
            this.dimension = dimension;
        }
        if ((i10 & 4) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
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
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & 64) == 0) {
            this.margin = Padding.Companion.getZero();
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
        if ((i10 & 1024) == 0) {
            this.overrides = null;
        } else {
            this.overrides = componentOverrides;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StackComponent(List<? extends PaywallComponent> list, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, ComponentOverrides<PartialStackComponent> componentOverrides) {
        r.f(list, "components");
        r.f(dimension, "dimension");
        r.f(size, "size");
        r.f(padding, "padding");
        r.f(padding2, "margin");
        this.components = list;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f10;
        this.backgroundColor = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.overrides = componentOverrides;
    }

    public /* synthetic */ StackComponent(List list, Dimension dimension, Size size, Float f10, ColorScheme colorScheme, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, ComponentOverrides componentOverrides, int i10, j jVar) {
        this(list, (i10 & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : dimension, (i10 & 4) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i10 & 8) != 0 ? null : f10, (i10 & 16) != 0 ? null : colorScheme, (i10 & 32) != 0 ? Padding.Companion.getZero() : padding, (i10 & 64) != 0 ? Padding.Companion.getZero() : padding2, (i10 & 128) != 0 ? null : shape, (i10 & 256) != 0 ? null : border, (i10 & 512) != 0 ? null : shadow, (i10 & 1024) == 0 ? componentOverrides : null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(StackComponent stackComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, bVarArr[0], stackComponent.components);
        if (dVar.r(fVar, 1) || !r.b(stackComponent.dimension, new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START))) {
            dVar.E(fVar, 1, bVarArr[1], stackComponent.dimension);
        }
        if (dVar.r(fVar, 2) || !r.b(stackComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.E(fVar, 2, Size$$serializer.INSTANCE, stackComponent.size);
        }
        if (dVar.r(fVar, 3) || stackComponent.spacing != null) {
            dVar.k(fVar, 3, b0.f743a, stackComponent.spacing);
        }
        if (dVar.r(fVar, 4) || stackComponent.backgroundColor != null) {
            dVar.k(fVar, 4, ColorScheme$$serializer.INSTANCE, stackComponent.backgroundColor);
        }
        if (dVar.r(fVar, 5) || !r.b(stackComponent.padding, Padding.Companion.getZero())) {
            dVar.E(fVar, 5, Padding$$serializer.INSTANCE, stackComponent.padding);
        }
        if (dVar.r(fVar, 6) || !r.b(stackComponent.margin, Padding.Companion.getZero())) {
            dVar.E(fVar, 6, Padding$$serializer.INSTANCE, stackComponent.margin);
        }
        if (dVar.r(fVar, 7) || stackComponent.shape != null) {
            dVar.k(fVar, 7, bVarArr[7], stackComponent.shape);
        }
        if (dVar.r(fVar, 8) || stackComponent.border != null) {
            dVar.k(fVar, 8, Border$$serializer.INSTANCE, stackComponent.border);
        }
        if (dVar.r(fVar, 9) || stackComponent.shadow != null) {
            dVar.k(fVar, 9, Shadow$$serializer.INSTANCE, stackComponent.shadow);
        }
        if (dVar.r(fVar, 10) || stackComponent.overrides != null) {
            dVar.k(fVar, 10, bVarArr[10], stackComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponent)) {
            return false;
        }
        StackComponent stackComponent = (StackComponent) obj;
        return r.b(this.components, stackComponent.components) && r.b(this.dimension, stackComponent.dimension) && r.b(this.size, stackComponent.size) && r.b(this.spacing, stackComponent.spacing) && r.b(this.backgroundColor, stackComponent.backgroundColor) && r.b(this.padding, stackComponent.padding) && r.b(this.margin, stackComponent.margin) && r.b(this.shape, stackComponent.shape) && r.b(this.border, stackComponent.border) && r.b(this.shadow, stackComponent.shadow) && r.b(this.overrides, stackComponent.overrides);
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getComponents() {
        return this.components;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ ComponentOverrides getOverrides() {
        return this.overrides;
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

    public int hashCode() {
        int iHashCode = ((((this.components.hashCode() * 31) + this.dimension.hashCode()) * 31) + this.size.hashCode()) * 31;
        Float f10 = this.spacing;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode3 = (((((iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape = this.shape;
        int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode6 = (iHashCode5 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        ComponentOverrides<PartialStackComponent> componentOverrides = this.overrides;
        return iHashCode6 + (componentOverrides != null ? componentOverrides.hashCode() : 0);
    }

    public String toString() {
        return "StackComponent(components=" + this.components + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", overrides=" + this.overrides + ')';
    }
}
