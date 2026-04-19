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
public final class ComponentStates<T extends PartialComponent> {
    private static final f $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final T selected;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final <T0> b<ComponentStates<T0>> serializer(b<T0> bVar) {
            r.f(bVar, "typeSerial0");
            return new ComponentStates$$serializer(bVar);
        }
    }

    static {
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.ComponentStates", null, 1);
        a1Var.l("selected", true);
        $cachedDescriptor = a1Var;
    }

    public ComponentStates() {
        this((PartialComponent) null, 1, (j) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ComponentStates(int i10, PartialComponent partialComponent, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, $cachedDescriptor);
        }
        if ((i10 & 1) == 0) {
            this.selected = null;
        } else {
            this.selected = partialComponent;
        }
    }

    public ComponentStates(T t10) {
        this.selected = t10;
    }

    public /* synthetic */ ComponentStates(PartialComponent partialComponent, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : partialComponent);
    }

    public static final /* synthetic */ void write$Self(ComponentStates componentStates, d dVar, f fVar, b bVar) {
        boolean z10 = true;
        if (!dVar.r(fVar, 0) && componentStates.selected == null) {
            z10 = false;
        }
        if (z10) {
            dVar.k(fVar, 0, bVar, componentStates.selected);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentStates) && r.b(this.selected, ((ComponentStates) obj).selected);
    }

    public final /* synthetic */ PartialComponent getSelected() {
        return this.selected;
    }

    public int hashCode() {
        T t10 = this.selected;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        return "ComponentStates(selected=" + this.selected + ')';
    }
}
