package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.n1;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageComponent$$serializer implements c0<PackageComponent> {
    public static final PackageComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PackageComponent$$serializer packageComponent$$serializer = new PackageComponent$$serializer();
        INSTANCE = packageComponent$$serializer;
        a1 a1Var = new a1("package", packageComponent$$serializer, 3);
        a1Var.l("package_id", false);
        a1Var.l("is_selected_by_default", false);
        a1Var.l("stack", false);
        descriptor = a1Var;
    }

    private PackageComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a, h.f763a, StackComponent$$serializer.INSTANCE};
    }

    @Override // we.a
    public PackageComponent deserialize(e eVar) {
        String str;
        int i10;
        boolean z10;
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        String strM = null;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            boolean zG = cVarC.g(descriptor2, 1);
            objK = cVarC.k(descriptor2, 2, StackComponent$$serializer.INSTANCE, null);
            str = strM2;
            i10 = 7;
            z10 = zG;
        } else {
            Object objK2 = null;
            int i11 = 0;
            boolean zG2 = false;
            boolean z11 = true;
            while (z11) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z11 = false;
                } else if (iZ == 0) {
                    strM = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    zG2 = cVarC.g(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 2, StackComponent$$serializer.INSTANCE, objK2);
                    i11 |= 4;
                }
            }
            str = strM;
            i10 = i11;
            z10 = zG2;
            objK = objK2;
        }
        cVarC.d(descriptor2);
        return new PackageComponent(i10, str, z10, (StackComponent) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PackageComponent packageComponent) {
        r.f(fVar, "encoder");
        r.f(packageComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PackageComponent.write$Self(packageComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
