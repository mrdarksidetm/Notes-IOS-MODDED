package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import java.util.List;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface ColorInfo {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Alias implements ColorInfo {
        public static final Companion Companion = new Companion(null);
        private final String value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Alias> serializer() {
                return ColorInfo$Alias$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Alias(int i10, String str, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, ColorInfo$Alias$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
        }

        public Alias(String str) {
            r.f(str, "value");
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Alias) && r.b(this.value, ((Alias) obj).value);
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Alias(value=" + this.value + ')';
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<ColorInfo> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", i0.b(ColorInfo.class), new c[]{i0.b(Alias.class), i0.b(Gradient.Linear.class), i0.b(Gradient.Radial.class), i0.b(Hex.class)}, new b[]{ColorInfo$Alias$$serializer.INSTANCE, ColorInfo$Gradient$Linear$$serializer.INSTANCE, ColorInfo$Gradient$Radial$$serializer.INSTANCE, ColorInfo$Hex$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public interface Gradient extends ColorInfo {

        public static final class Linear implements Gradient {
            private final float degrees;
            private final List<Point> points;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {null, new af.e(ColorInfo$Gradient$Point$$serializer.INSTANCE)};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Linear> serializer() {
                    return ColorInfo$Gradient$Linear$$serializer.INSTANCE;
                }
            }

            public Linear(float f10, List<Point> list) {
                r.f(list, "points");
                this.degrees = f10;
                this.points = list;
            }

            public /* synthetic */ Linear(int i10, float f10, List list, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, ColorInfo$Gradient$Linear$$serializer.INSTANCE.getDescriptor());
                }
                this.degrees = f10;
                this.points = list;
            }

            public static final /* synthetic */ void write$Self(Linear linear, d dVar, f fVar) {
                b<Object>[] bVarArr = $childSerializers;
                dVar.e(fVar, 0, linear.degrees);
                dVar.E(fVar, 1, bVarArr[1], linear.points);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Linear)) {
                    return false;
                }
                Linear linear = (Linear) obj;
                return Float.compare(this.degrees, linear.degrees) == 0 && r.b(this.points, linear.points);
            }

            public final /* synthetic */ float getDegrees() {
                return this.degrees;
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return (Float.hashCode(this.degrees) * 31) + this.points.hashCode();
            }

            public String toString() {
                return "Linear(degrees=" + this.degrees + ", points=" + this.points + ')';
            }
        }

        public static final class Point {
            public static final Companion Companion = new Companion(null);
            private final int color;
            private final float percent;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Point> serializer() {
                    return ColorInfo$Gradient$Point$$serializer.INSTANCE;
                }
            }

            public Point(int i10, float f10) {
                this.color = i10;
                this.percent = f10;
            }

            public /* synthetic */ Point(int i10, int i11, float f10, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, ColorInfo$Gradient$Point$$serializer.INSTANCE.getDescriptor());
                }
                this.color = i11;
                this.percent = f10;
            }

            public static /* synthetic */ void getColor$annotations() {
            }

            public static final /* synthetic */ void write$Self(Point point, d dVar, f fVar) {
                dVar.E(fVar, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(point.color));
                dVar.e(fVar, 1, point.percent);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return this.color == point.color && Float.compare(this.percent, point.percent) == 0;
            }

            public final /* synthetic */ int getColor() {
                return this.color;
            }

            public final /* synthetic */ float getPercent() {
                return this.percent;
            }

            public int hashCode() {
                return (Integer.hashCode(this.color) * 31) + Float.hashCode(this.percent);
            }

            public String toString() {
                return "Point(color=" + this.color + ", percent=" + this.percent + ')';
            }
        }

        public static final class Radial implements Gradient {
            private final List<Point> points;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {new af.e(ColorInfo$Gradient$Point$$serializer.INSTANCE)};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Radial> serializer() {
                    return ColorInfo$Gradient$Radial$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Radial(int i10, List list, j1 j1Var) {
                if (1 != (i10 & 1)) {
                    z0.a(i10, 1, ColorInfo$Gradient$Radial$$serializer.INSTANCE.getDescriptor());
                }
                this.points = list;
            }

            public Radial(List<Point> list) {
                r.f(list, "points");
                this.points = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Radial) && r.b(this.points, ((Radial) obj).points);
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return this.points.hashCode();
            }

            public String toString() {
                return "Radial(points=" + this.points + ')';
            }
        }
    }

    public static final class Hex implements ColorInfo {
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Hex> serializer() {
                return ColorInfo$Hex$$serializer.INSTANCE;
            }
        }

        public Hex(int i10) {
            this.value = i10;
        }

        public /* synthetic */ Hex(int i10, int i11, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, ColorInfo$Hex$$serializer.INSTANCE.getDescriptor());
            }
            this.value = i11;
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hex) && this.value == ((Hex) obj).value;
        }

        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "Hex(value=" + this.value + ')';
        }
    }
}
