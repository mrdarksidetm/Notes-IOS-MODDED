package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import l0.f;
import l0.g;
import l1.m1;
import l1.t1;
import md.q;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ShapeKt {
    public static final /* synthetic */ t1 toShape(Shape shape) {
        f fVarD;
        r.f(shape, "<this>");
        if (shape instanceof Shape.Rectangle) {
            CornerRadiuses corners = ((Shape.Rectangle) shape).getCorners();
            return (corners == null || (fVarD = g.d(h.m((float) corners.getTopLeading()), h.m((float) corners.getTopTrailing()), h.m((float) corners.getBottomTrailing()), h.m((float) corners.getBottomLeading()))) == null) ? m1.a() : fVarD;
        }
        if (shape instanceof Shape.Pill) {
            return g.a(50);
        }
        throw new q();
    }
}
