package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Shape$Rectangle$$serializer implements c0<Shape.Rectangle> {
    public static final Shape$Rectangle$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Shape$Rectangle$$serializer shape$Rectangle$$serializer = new Shape$Rectangle$$serializer();
        INSTANCE = shape$Rectangle$$serializer;
        a1 a1Var = new a1("rectangle", shape$Rectangle$$serializer, 1);
        a1Var.l("corners", true);
        descriptor = a1Var;
    }

    private Shape$Rectangle$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{a.p(CornerRadiuses$$serializer.INSTANCE)};
    }

    @Override // we.a
    public Shape.Rectangle deserialize(e eVar) {
        Object objL;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        int i10 = 1;
        if (cVarC.x()) {
            objL = cVarC.l(descriptor2, 0, CornerRadiuses$$serializer.INSTANCE, null);
        } else {
            objL = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor2, 0, CornerRadiuses$$serializer.INSTANCE, objL);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new Shape.Rectangle(i10, (CornerRadiuses) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Shape.Rectangle rectangle) {
        r.f(fVar, "encoder");
        r.f(rectangle, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Shape.Rectangle.write$Self(rectangle, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
