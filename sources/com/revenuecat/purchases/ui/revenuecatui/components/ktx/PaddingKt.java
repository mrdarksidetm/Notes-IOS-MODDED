package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import androidx.compose.foundation.layout.m;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import h0.y;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PaddingKt {
    public static final /* synthetic */ y toPaddingValues(Padding padding) {
        r.f(padding, "<this>");
        return m.d(h.m((float) padding.getLeading()), h.m((float) padding.getTop()), h.m((float) padding.getTrailing()), h.m((float) padding.getBottom()));
    }
}
