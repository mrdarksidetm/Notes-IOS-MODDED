package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ComponentsConfig {
    public static final Companion Companion = new Companion(null);
    private final PaywallComponentsConfig base;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ComponentsConfig> serializer() {
            return ComponentsConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ComponentsConfig(int i10, PaywallComponentsConfig paywallComponentsConfig, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, ComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.base = paywallComponentsConfig;
    }

    public ComponentsConfig(PaywallComponentsConfig paywallComponentsConfig) {
        r.f(paywallComponentsConfig, "base");
        this.base = paywallComponentsConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentsConfig) && r.b(this.base, ((ComponentsConfig) obj).base);
    }

    public final /* synthetic */ PaywallComponentsConfig getBase() {
        return this.base;
    }

    public int hashCode() {
        return this.base.hashCode();
    }

    public String toString() {
        return "ComponentsConfig(base=" + this.base + ')';
    }
}
