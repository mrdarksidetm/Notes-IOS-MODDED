package com.revenuecat.purchases.ui.revenuecatui.composables;

import c0.k0;
import md.l;
import md.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderDefaults {
    public static final PlaceholderDefaults INSTANCE = new PlaceholderDefaults();
    private static final l fadeAnimationSpec$delegate = n.b(PlaceholderDefaults$fadeAnimationSpec$2.INSTANCE);

    private PlaceholderDefaults() {
    }

    public final k0<Float> getFadeAnimationSpec() {
        return (k0) fadeAnimationSpec$delegate.getValue();
    }
}
