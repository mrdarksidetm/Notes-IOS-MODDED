package com.revenuecat.purchases.paywalls.components.common;

import ae.i0;
import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PaywallComponentsConfig {
    private final Background background;
    private final StackComponent stack;
    private final StickyFooterComponent stickyFooter;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, new e("com.revenuecat.purchases.paywalls.components.common.Background", i0.b(Background.class), new c[]{i0.b(Background.Color.class), i0.b(Background.Image.class)}, new b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallComponentsConfig> serializer() {
            return PaywallComponentsConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallComponentsConfig(int i10, StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, PaywallComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
        this.background = background;
        if ((i10 & 4) == 0) {
            this.stickyFooter = null;
        } else {
            this.stickyFooter = stickyFooterComponent;
        }
    }

    public PaywallComponentsConfig(StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent) {
        r.f(stackComponent, "stack");
        r.f(background, "background");
        this.stack = stackComponent;
        this.background = background;
        this.stickyFooter = stickyFooterComponent;
    }

    public /* synthetic */ PaywallComponentsConfig(StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, int i10, j jVar) {
        this(stackComponent, background, (i10 & 4) != 0 ? null : stickyFooterComponent);
    }

    public static /* synthetic */ void getStickyFooter$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallComponentsConfig paywallComponentsConfig, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, StackComponent$$serializer.INSTANCE, paywallComponentsConfig.stack);
        dVar.E(fVar, 1, bVarArr[1], paywallComponentsConfig.background);
        if (dVar.r(fVar, 2) || paywallComponentsConfig.stickyFooter != null) {
            dVar.k(fVar, 2, StickyFooterComponent$$serializer.INSTANCE, paywallComponentsConfig.stickyFooter);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsConfig)) {
            return false;
        }
        PaywallComponentsConfig paywallComponentsConfig = (PaywallComponentsConfig) obj;
        return r.b(this.stack, paywallComponentsConfig.stack) && r.b(this.background, paywallComponentsConfig.background) && r.b(this.stickyFooter, paywallComponentsConfig.stickyFooter);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ StickyFooterComponent getStickyFooter() {
        return this.stickyFooter;
    }

    public int hashCode() {
        int iHashCode = ((this.stack.hashCode() * 31) + this.background.hashCode()) * 31;
        StickyFooterComponent stickyFooterComponent = this.stickyFooter;
        return iHashCode + (stickyFooterComponent == null ? 0 : stickyFooterComponent.hashCode());
    }

    public String toString() {
        return "PaywallComponentsConfig(stack=" + this.stack + ", background=" + this.background + ", stickyFooter=" + this.stickyFooter + ')';
    }
}
