package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentConditions$$serializer<T> implements c0<ComponentConditions<T>> {
    private final /* synthetic */ a1 descriptor;
    private final /* synthetic */ b<?> typeSerial0;

    private ComponentConditions$$serializer() {
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.ComponentConditions", this, 3);
        a1Var.l("compact", true);
        a1Var.l("medium", true);
        a1Var.l("expanded", true);
        this.descriptor = a1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComponentConditions$$serializer(b bVar) {
        this();
        r.f(bVar, "typeSerial0");
        this.typeSerial0 = bVar;
    }

    private final b<T> getTypeSerial0() {
        return (b<T>) this.typeSerial0;
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{a.p(this.typeSerial0), a.p(this.typeSerial0), a.p(this.typeSerial0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we.a
    public ComponentConditions<T> deserialize(e eVar) {
        Object obj;
        Object objL;
        Object objL2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor = getDescriptor();
        c cVarC = eVar.c(descriptor);
        Object objL3 = null;
        if (cVarC.x()) {
            objL = cVarC.l(descriptor, 0, this.typeSerial0, null);
            Object objL4 = cVarC.l(descriptor, 1, this.typeSerial0, null);
            objL2 = cVarC.l(descriptor, 2, this.typeSerial0, null);
            i10 = 7;
            obj = objL4;
        } else {
            Object objL5 = null;
            Object objL6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objL3 = cVarC.l(descriptor, 0, this.typeSerial0, objL3);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objL5 = cVarC.l(descriptor, 1, this.typeSerial0, objL5);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL6 = cVarC.l(descriptor, 2, this.typeSerial0, objL6);
                    i11 |= 4;
                }
            }
            obj = objL5;
            objL = objL3;
            objL2 = objL6;
            i10 = i11;
        }
        cVarC.d(descriptor);
        return new ComponentConditions<>(i10, (PartialComponent) objL, (PartialComponent) obj, (PartialComponent) objL2, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ComponentConditions<T> componentConditions) {
        r.f(fVar, "encoder");
        r.f(componentConditions, "value");
        f descriptor = getDescriptor();
        d dVarC = fVar.c(descriptor);
        ComponentConditions.write$Self(componentConditions, dVarC, descriptor, this.typeSerial0);
        dVarC.d(descriptor);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }
}
