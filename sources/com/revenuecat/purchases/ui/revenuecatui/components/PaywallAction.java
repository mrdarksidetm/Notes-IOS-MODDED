package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallAction {

    public static final class NavigateBack implements PaywallAction {
        public static final int $stable = 0;
        public static final NavigateBack INSTANCE = new NavigateBack();

        private NavigateBack() {
        }
    }

    public static final class NavigateTo implements PaywallAction {
        public static final int $stable = 8;
        private final ButtonComponent.Destination destination;

        public NavigateTo(ButtonComponent.Destination destination) {
            r.f(destination, "destination");
            this.destination = destination;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateTo) && r.b(this.destination, ((NavigateTo) obj).destination);
        }

        public final /* synthetic */ ButtonComponent.Destination getDestination() {
            return this.destination;
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "NavigateTo(destination=" + this.destination + ')';
        }
    }

    public static final class RestorePurchases implements PaywallAction {
        public static final int $stable = 0;
        public static final RestorePurchases INSTANCE = new RestorePurchases();

        private RestorePurchases() {
        }
    }
}
