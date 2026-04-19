package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.r;
import android.os.Parcel;
import n2.i0;
import ve.a;

/* JADX INFO: loaded from: classes2.dex */
public final class FontWeightParceler implements a<i0> {
    public static final FontWeightParceler INSTANCE = new FontWeightParceler();

    private FontWeightParceler() {
    }

    public i0 create(Parcel parcel) {
        r.f(parcel, "parcel");
        return new i0(parcel.readInt());
    }

    public i0[] newArray(int i10) {
        return (i0[]) a.C0467a.a(this, i10);
    }

    public void write(i0 i0Var, Parcel parcel, int i10) {
        r.f(i0Var, "<this>");
        r.f(parcel, "parcel");
        parcel.writeInt(i0Var.t());
    }
}
