package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import c0.j;
import c0.k0;
import c0.w0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class PlaceholderDefaults$fadeAnimationSpec$2 extends s implements a<k0<Float>> {
    public static final PlaceholderDefaults$fadeAnimationSpec$2 INSTANCE = new PlaceholderDefaults$fadeAnimationSpec$2();

    PlaceholderDefaults$fadeAnimationSpec$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.a
    public final k0<Float> invoke() {
        return j.d(j.i(600, 200, null, 4, null), w0.Reverse, 0L, 4, null);
    }
}
