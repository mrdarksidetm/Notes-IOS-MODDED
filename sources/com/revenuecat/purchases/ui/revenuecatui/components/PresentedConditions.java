package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedConditions<T extends PresentedPartial<T>> {
    private final T compact;
    private final T expanded;
    private final T medium;

    public PresentedConditions(T t10, T t11, T t12) {
        this.compact = t10;
        this.medium = t11;
        this.expanded = t12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedConditions)) {
            return false;
        }
        PresentedConditions presentedConditions = (PresentedConditions) obj;
        return r.b(this.compact, presentedConditions.compact) && r.b(this.medium, presentedConditions.medium) && r.b(this.expanded, presentedConditions.expanded);
    }

    public final /* synthetic */ PresentedPartial getCompact() {
        return this.compact;
    }

    public final /* synthetic */ PresentedPartial getExpanded() {
        return this.expanded;
    }

    public final /* synthetic */ PresentedPartial getMedium() {
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
        return "PresentedConditions(compact=" + this.compact + ", medium=" + this.medium + ", expanded=" + this.expanded + ')';
    }
}
