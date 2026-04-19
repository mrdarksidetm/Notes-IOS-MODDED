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
public final class ComponentStates$$serializer<T> implements c0<ComponentStates<T>> {
    private final /* synthetic */ a1 descriptor;
    private final /* synthetic */ b<?> typeSerial0;

    private ComponentStates$$serializer() {
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.ComponentStates", this, 1);
        a1Var.l("selected", true);
        this.descriptor = a1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComponentStates$$serializer(b bVar) {
        this();
        r.f(bVar, "typeSerial0");
        this.typeSerial0 = bVar;
    }

    private final b<T> getTypeSerial0() {
        return (b<T>) this.typeSerial0;
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{a.p(this.typeSerial0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we.a
    public ComponentStates<T> deserialize(e eVar) {
        Object objL;
        r.f(eVar, "decoder");
        f descriptor = getDescriptor();
        c cVarC = eVar.c(descriptor);
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            objL = cVarC.l(descriptor, 0, this.typeSerial0, null);
        } else {
            objL = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor, 0, this.typeSerial0, objL);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor);
        return new ComponentStates<>(i10, (PartialComponent) objL, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ComponentStates<T> componentStates) {
        r.f(fVar, "encoder");
        r.f(componentStates, "value");
        f descriptor = getDescriptor();
        d dVarC = fVar.c(descriptor);
        ComponentStates.write$Self(componentStates, dVarC, descriptor, this.typeSerial0);
        dVarC.d(descriptor);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }
}
