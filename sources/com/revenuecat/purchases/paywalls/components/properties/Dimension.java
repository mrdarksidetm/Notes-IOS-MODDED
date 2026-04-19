package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<Dimension> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.properties.Dimension", i0.b(Dimension.class), new c[]{i0.b(Horizontal.class), i0.b(Vertical.class), i0.b(ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public static final class Horizontal implements Dimension {
        private final VerticalAlignment alignment;
        private final FlexDistribution distribution;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {VerticalAlignment.Companion.serializer(), FlexDistribution.Companion.serializer()};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Horizontal> serializer() {
                return Dimension$Horizontal$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Horizontal(int i10, VerticalAlignment verticalAlignment, FlexDistribution flexDistribution, j1 j1Var) {
            if (3 != (i10 & 3)) {
                z0.a(i10, 3, Dimension$Horizontal$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = verticalAlignment;
            this.distribution = flexDistribution;
        }

        public Horizontal(VerticalAlignment verticalAlignment, FlexDistribution flexDistribution) {
            r.f(verticalAlignment, "alignment");
            r.f(flexDistribution, "distribution");
            this.alignment = verticalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, VerticalAlignment verticalAlignment, FlexDistribution flexDistribution, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                verticalAlignment = horizontal.alignment;
            }
            if ((i10 & 2) != 0) {
                flexDistribution = horizontal.distribution;
            }
            return horizontal.copy(verticalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self(Horizontal horizontal, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            dVar.E(fVar, 0, bVarArr[0], horizontal.alignment);
            dVar.E(fVar, 1, bVarArr[1], horizontal.distribution);
        }

        public final VerticalAlignment component1() {
            return this.alignment;
        }

        public final FlexDistribution component2() {
            return this.distribution;
        }

        public final Horizontal copy(VerticalAlignment verticalAlignment, FlexDistribution flexDistribution) {
            r.f(verticalAlignment, "alignment");
            r.f(flexDistribution, "distribution");
            return new Horizontal(verticalAlignment, flexDistribution);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return this.alignment == horizontal.alignment && this.distribution == horizontal.distribution;
        }

        public final /* synthetic */ VerticalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.distribution.hashCode();
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }
    }

    public static final class Vertical implements Dimension {
        private final HorizontalAlignment alignment;
        private final FlexDistribution distribution;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {HorizontalAlignment.Companion.serializer(), FlexDistribution.Companion.serializer()};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Vertical> serializer() {
                return Dimension$Vertical$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Vertical(int i10, HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution, j1 j1Var) {
            if (3 != (i10 & 3)) {
                z0.a(i10, 3, Dimension$Vertical$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = horizontalAlignment;
            this.distribution = flexDistribution;
        }

        public Vertical(HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution) {
            r.f(horizontalAlignment, "alignment");
            r.f(flexDistribution, "distribution");
            this.alignment = horizontalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                horizontalAlignment = vertical.alignment;
            }
            if ((i10 & 2) != 0) {
                flexDistribution = vertical.distribution;
            }
            return vertical.copy(horizontalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self(Vertical vertical, d dVar, f fVar) {
            b<Object>[] bVarArr = $childSerializers;
            dVar.E(fVar, 0, bVarArr[0], vertical.alignment);
            dVar.E(fVar, 1, bVarArr[1], vertical.distribution);
        }

        public final HorizontalAlignment component1() {
            return this.alignment;
        }

        public final FlexDistribution component2() {
            return this.distribution;
        }

        public final Vertical copy(HorizontalAlignment horizontalAlignment, FlexDistribution flexDistribution) {
            r.f(horizontalAlignment, "alignment");
            r.f(flexDistribution, "distribution");
            return new Vertical(horizontalAlignment, flexDistribution);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return this.alignment == vertical.alignment && this.distribution == vertical.distribution;
        }

        public final /* synthetic */ HorizontalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return (this.alignment.hashCode() * 31) + this.distribution.hashCode();
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }
    }

    public static final class ZLayer implements Dimension {
        private final TwoDimensionalAlignment alignment;
        public static final Companion Companion = new Companion(null);
        private static final b<Object>[] $childSerializers = {TwoDimensionalAlignment.Companion.serializer()};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<ZLayer> serializer() {
                return Dimension$ZLayer$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ZLayer(int i10, TwoDimensionalAlignment twoDimensionalAlignment, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, Dimension$ZLayer$$serializer.INSTANCE.getDescriptor());
            }
            this.alignment = twoDimensionalAlignment;
        }

        public ZLayer(TwoDimensionalAlignment twoDimensionalAlignment) {
            r.f(twoDimensionalAlignment, "alignment");
            this.alignment = twoDimensionalAlignment;
        }

        public static /* synthetic */ ZLayer copy$default(ZLayer zLayer, TwoDimensionalAlignment twoDimensionalAlignment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                twoDimensionalAlignment = zLayer.alignment;
            }
            return zLayer.copy(twoDimensionalAlignment);
        }

        public final TwoDimensionalAlignment component1() {
            return this.alignment;
        }

        public final ZLayer copy(TwoDimensionalAlignment twoDimensionalAlignment) {
            r.f(twoDimensionalAlignment, "alignment");
            return new ZLayer(twoDimensionalAlignment);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZLayer) && this.alignment == ((ZLayer) obj).alignment;
        }

        public final /* synthetic */ TwoDimensionalAlignment getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "ZLayer(alignment=" + this.alignment + ')';
        }
    }
}
