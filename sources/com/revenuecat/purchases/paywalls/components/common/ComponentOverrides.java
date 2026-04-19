package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import af.a1;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ComponentOverrides<T extends PartialComponent> {
    private static final f $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final ComponentConditions<T> conditions;
    private final T introOffer;
    private final ComponentStates<T> states;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final <T0> b<ComponentOverrides<T0>> serializer(b<T0> bVar) {
            r.f(bVar, "typeSerial0");
            return new ComponentOverrides$$serializer(bVar);
        }
    }

    static {
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.ComponentOverrides", null, 3);
        a1Var.l("introOffer", true);
        a1Var.l("states", true);
        a1Var.l("conditions", true);
        $cachedDescriptor = a1Var;
    }

    public ComponentOverrides() {
        this((PartialComponent) null, (ComponentStates) null, (ComponentConditions) null, 7, (j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ComponentOverrides(int i10, PartialComponent partialComponent, ComponentStates componentStates, ComponentConditions componentConditions, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, $cachedDescriptor);
        }
        if ((i10 & 1) == 0) {
            this.introOffer = null;
        } else {
            this.introOffer = partialComponent;
        }
        if ((i10 & 2) == 0) {
            this.states = null;
        } else {
            this.states = componentStates;
        }
        if ((i10 & 4) == 0) {
            this.conditions = null;
        } else {
            this.conditions = componentConditions;
        }
    }

    public ComponentOverrides(T t10, ComponentStates<T> componentStates, ComponentConditions<T> componentConditions) {
        this.introOffer = t10;
        this.states = componentStates;
        this.conditions = componentConditions;
    }

    public /* synthetic */ ComponentOverrides(PartialComponent partialComponent, ComponentStates componentStates, ComponentConditions componentConditions, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : partialComponent, (i10 & 2) != 0 ? null : componentStates, (i10 & 4) != 0 ? null : componentConditions);
    }

    public static final /* synthetic */ void write$Self(ComponentOverrides componentOverrides, d dVar, f fVar, b bVar) {
        if (dVar.r(fVar, 0) || componentOverrides.introOffer != null) {
            dVar.k(fVar, 0, bVar, componentOverrides.introOffer);
        }
        if (dVar.r(fVar, 1) || componentOverrides.states != null) {
            dVar.k(fVar, 1, ComponentStates.Companion.serializer(bVar), componentOverrides.states);
        }
        if (dVar.r(fVar, 2) || componentOverrides.conditions != null) {
            dVar.k(fVar, 2, ComponentConditions.Companion.serializer(bVar), componentOverrides.conditions);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverrides)) {
            return false;
        }
        ComponentOverrides componentOverrides = (ComponentOverrides) obj;
        return r.b(this.introOffer, componentOverrides.introOffer) && r.b(this.states, componentOverrides.states) && r.b(this.conditions, componentOverrides.conditions);
    }

    public final /* synthetic */ ComponentConditions getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PartialComponent getIntroOffer() {
        return this.introOffer;
    }

    public final /* synthetic */ ComponentStates getStates() {
        return this.states;
    }

    public int hashCode() {
        T t10 = this.introOffer;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        ComponentStates<T> componentStates = this.states;
        int iHashCode2 = (iHashCode + (componentStates == null ? 0 : componentStates.hashCode())) * 31;
        ComponentConditions<T> componentConditions = this.conditions;
        return iHashCode2 + (componentConditions != null ? componentConditions.hashCode() : 0);
    }

    public String toString() {
        return "ComponentOverrides(introOffer=" + this.introOffer + ", states=" + this.states + ", conditions=" + this.conditions + ')';
    }
}
