package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.r;
import ae.s;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import md.l;
import md.n;
import md.p;
import we.b;
import we.e;
import ye.f;
import zd.a;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface MaskShape {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<MaskShape> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.properties.MaskShape", i0.b(MaskShape.class), new c[]{i0.b(Concave.class), i0.b(Convex.class), i0.b(Pill.class), i0.b(Rectangle.class)}, new b[]{new x0("concave", Concave.INSTANCE, new Annotation[0]), new x0("convex", Convex.INSTANCE, new Annotation[0]), new x0("pill", Pill.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public static final class Concave implements MaskShape {
        public static final Concave INSTANCE = new Concave();
        private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Concave$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return new x0("concave", Concave.INSTANCE, new Annotation[0]);
            }
        }

        private Concave() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final b<Concave> serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Convex implements MaskShape {
        public static final Convex INSTANCE = new Convex();
        private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Convex$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return new x0("convex", Convex.INSTANCE, new Annotation[0]);
            }
        }

        private Convex() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final b<Convex> serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Pill implements MaskShape {
        public static final Pill INSTANCE = new Pill();
        private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.MaskShape$Pill$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return new x0("pill", Pill.INSTANCE, new Annotation[0]);
            }
        }

        private Pill() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final b<Pill> serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Rectangle implements MaskShape {
        public static final Companion Companion = new Companion(null);
        private final CornerRadiuses corners;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Rectangle> serializer() {
                return MaskShape$Rectangle$$serializer.INSTANCE;
            }
        }

        public Rectangle() {
            this((CornerRadiuses) null, 1, (j) (0 == true ? 1 : 0));
        }

        public /* synthetic */ Rectangle(int i10, CornerRadiuses cornerRadiuses, j1 j1Var) {
            if ((i10 & 0) != 0) {
                z0.a(i10, 0, MaskShape$Rectangle$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        public /* synthetic */ Rectangle(CornerRadiuses cornerRadiuses, int i10, j jVar) {
            this((i10 & 1) != 0 ? null : cornerRadiuses);
        }

        public static final /* synthetic */ void write$Self(Rectangle rectangle, d dVar, f fVar) {
            boolean z10 = true;
            if (!dVar.r(fVar, 0) && rectangle.corners == null) {
                z10 = false;
            }
            if (z10) {
                dVar.k(fVar, 0, CornerRadiuses$$serializer.INSTANCE, rectangle.corners);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && r.b(this.corners, ((Rectangle) obj).corners);
        }

        public final /* synthetic */ CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }
    }
}
