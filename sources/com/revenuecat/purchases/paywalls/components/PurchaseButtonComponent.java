package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PurchaseButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final StackComponent stack;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PurchaseButtonComponent> serializer() {
            return PurchaseButtonComponent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PurchaseButtonComponent(int i10, StackComponent stackComponent, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
    }

    public PurchaseButtonComponent(StackComponent stackComponent) {
        r.f(stackComponent, "stack");
        this.stack = stackComponent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseButtonComponent) && r.b(this.stack, ((PurchaseButtonComponent) obj).stack);
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return this.stack.hashCode();
    }

    public String toString() {
        return "PurchaseButtonComponent(stack=" + this.stack + ')';
    }
}
