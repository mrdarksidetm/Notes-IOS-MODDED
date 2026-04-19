package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedOverrides<T extends PresentedPartial<T>> {
    private final PresentedConditions<T> conditions;
    private final T introOffer;
    private final PresentedStates<T> states;

    public PresentedOverrides(T t10, PresentedStates<T> presentedStates, PresentedConditions<T> presentedConditions) {
        this.introOffer = t10;
        this.states = presentedStates;
        this.conditions = presentedConditions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOverrides)) {
            return false;
        }
        PresentedOverrides presentedOverrides = (PresentedOverrides) obj;
        return r.b(this.introOffer, presentedOverrides.introOffer) && r.b(this.states, presentedOverrides.states) && r.b(this.conditions, presentedOverrides.conditions);
    }

    public final /* synthetic */ PresentedConditions getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PresentedPartial getIntroOffer() {
        return this.introOffer;
    }

    public final /* synthetic */ PresentedStates getStates() {
        return this.states;
    }

    public int hashCode() {
        T t10 = this.introOffer;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        PresentedStates<T> presentedStates = this.states;
        int iHashCode2 = (iHashCode + (presentedStates == null ? 0 : presentedStates.hashCode())) * 31;
        PresentedConditions<T> presentedConditions = this.conditions;
        return iHashCode2 + (presentedConditions != null ? presentedConditions.hashCode() : 0);
    }

    public String toString() {
        return "PresentedOverrides(introOffer=" + this.introOffer + ", states=" + this.states + ", conditions=" + this.conditions + ')';
    }
}
