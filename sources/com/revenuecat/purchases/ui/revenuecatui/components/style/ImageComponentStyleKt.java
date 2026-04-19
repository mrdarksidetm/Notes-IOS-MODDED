package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import md.k0;
import md.q;
import w2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponentStyleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Size adjustForImage(Size size, ImageUrls imageUrls, d dVar) {
        SizeConstraint width;
        SizeConstraint height;
        SizeConstraint width2 = size.getWidth();
        if (width2 instanceof SizeConstraint.Fit) {
            width = new SizeConstraint.Fixed(k0.a(dVar.l0(imageUrls.m73getWidthpVg5ArA())), null);
        } else {
            if (!(width2 instanceof SizeConstraint.Fill ? true : width2 instanceof SizeConstraint.Fixed)) {
                throw new q();
            }
            width = size.getWidth();
        }
        SizeConstraint height2 = size.getHeight();
        if (height2 instanceof SizeConstraint.Fit) {
            height = new SizeConstraint.Fixed(k0.a(dVar.l0(imageUrls.m72getHeightpVg5ArA())), null);
        } else {
            if (!(height2 instanceof SizeConstraint.Fill ? true : height2 instanceof SizeConstraint.Fixed)) {
                throw new q();
            }
            height = size.getHeight();
        }
        return new Size(width, height);
    }
}
