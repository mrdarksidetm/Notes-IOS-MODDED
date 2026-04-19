package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Size {
    private static final b<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final SizeConstraint height;
    private final SizeConstraint width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<Size> serializer() {
            return Size$$serializer.INSTANCE;
        }
    }

    static {
        c cVarB = i0.b(SizeConstraint.class);
        c[] cVarArr = {i0.b(SizeConstraint.Fill.class), i0.b(SizeConstraint.Fit.class), i0.b(SizeConstraint.Fixed.class)};
        SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        SizeConstraint$Fixed$$serializer sizeConstraint$Fixed$$serializer = SizeConstraint$Fixed$$serializer.INSTANCE;
        $childSerializers = new b[]{new e("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", cVarB, cVarArr, new b[]{new x0("fill", fill, new Annotation[0]), new x0("fit", fit, new Annotation[0]), sizeConstraint$Fixed$$serializer}, new Annotation[0]), new e("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", i0.b(SizeConstraint.class), new c[]{i0.b(SizeConstraint.Fill.class), i0.b(SizeConstraint.Fit.class), i0.b(SizeConstraint.Fixed.class)}, new b[]{new x0("fill", fill, new Annotation[0]), new x0("fit", fit, new Annotation[0]), sizeConstraint$Fixed$$serializer}, new Annotation[0])};
    }

    public /* synthetic */ Size(int i10, SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, Size$$serializer.INSTANCE.getDescriptor());
        }
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public Size(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2) {
        r.f(sizeConstraint, "width");
        r.f(sizeConstraint2, "height");
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public static final /* synthetic */ void write$Self(Size size, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, bVarArr[0], size.width);
        dVar.E(fVar, 1, bVarArr[1], size.height);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return r.b(this.width, size.width) && r.b(this.height, size.height);
    }

    public final /* synthetic */ SizeConstraint getHeight() {
        return this.height;
    }

    public final /* synthetic */ SizeConstraint getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }
}
