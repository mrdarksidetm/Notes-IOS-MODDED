package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedStates<T extends PresentedPartial<T>> {
    private final T selected;

    public PresentedStates(T t10) {
        this.selected = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentedStates) && r.b(this.selected, ((PresentedStates) obj).selected);
    }

    public final /* synthetic */ PresentedPartial getSelected() {
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
        return "PresentedStates(selected=" + this.selected + ')';
    }
}
