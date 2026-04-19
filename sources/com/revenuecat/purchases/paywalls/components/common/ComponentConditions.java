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
public final class ComponentConditions<T extends PartialComponent> {
    private static final f $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final T compact;
    private final T expanded;
    private final T medium;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final <T0> b<ComponentConditions<T0>> serializer(b<T0> bVar) {
            r.f(bVar, "typeSerial0");
            return new ComponentConditions$$serializer(bVar);
        }
    }

    static {
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.ComponentConditions", null, 3);
        a1Var.l("compact", true);
        a1Var.l("medium", true);
        a1Var.l("expanded", true);
        $cachedDescriptor = a1Var;
    }

    public ComponentConditions() {
        this((PartialComponent) null, (PartialComponent) null, (PartialComponent) null, 7, (j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ComponentConditions(int i10, PartialComponent partialComponent, PartialComponent partialComponent2, PartialComponent partialComponent3, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, $cachedDescriptor);
        }
        if ((i10 & 1) == 0) {
            this.compact = null;
        } else {
            this.compact = partialComponent;
        }
        if ((i10 & 2) == 0) {
            this.medium = null;
        } else {
            this.medium = partialComponent2;
        }
        if ((i10 & 4) == 0) {
            this.expanded = null;
        } else {
            this.expanded = partialComponent3;
        }
    }

    public ComponentConditions(T t10, T t11, T t12) {
        this.compact = t10;
        this.medium = t11;
        this.expanded = t12;
    }

    public /* synthetic */ ComponentConditions(PartialComponent partialComponent, PartialComponent partialComponent2, PartialComponent partialComponent3, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : partialComponent, (i10 & 2) != 0 ? null : partialComponent2, (i10 & 4) != 0 ? null : partialComponent3);
    }

    public static final /* synthetic */ void write$Self(ComponentConditions componentConditions, d dVar, f fVar, b bVar) {
        if (dVar.r(fVar, 0) || componentConditions.compact != null) {
            dVar.k(fVar, 0, bVar, componentConditions.compact);
        }
        if (dVar.r(fVar, 1) || componentConditions.medium != null) {
            dVar.k(fVar, 1, bVar, componentConditions.medium);
        }
        if (dVar.r(fVar, 2) || componentConditions.expanded != null) {
            dVar.k(fVar, 2, bVar, componentConditions.expanded);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentConditions)) {
            return false;
        }
        ComponentConditions componentConditions = (ComponentConditions) obj;
        return r.b(this.compact, componentConditions.compact) && r.b(this.medium, componentConditions.medium) && r.b(this.expanded, componentConditions.expanded);
    }

    public final /* synthetic */ PartialComponent getCompact() {
        return this.compact;
    }

    public final /* synthetic */ PartialComponent getExpanded() {
        return this.expanded;
    }

    public final /* synthetic */ PartialComponent getMedium() {
        return this.medium;
    }

    public int hashCode() {
        T t10 = this.compact;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.medium;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.expanded;
        return iHashCode2 + (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "ComponentConditions(compact=" + this.compact + ", medium=" + this.medium + ", expanded=" + this.expanded + ')';
    }
}
