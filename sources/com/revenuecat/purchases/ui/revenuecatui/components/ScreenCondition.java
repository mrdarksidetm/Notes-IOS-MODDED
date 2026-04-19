package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.j;
import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import j5.c;

/* JADX INFO: loaded from: classes2.dex */
public enum ScreenCondition {
    COMPACT,
    MEDIUM,
    EXPANDED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ ScreenCondition from(c cVar) {
            r.f(cVar, "sizeClass");
            if (!r.b(cVar, c.f13928c)) {
                if (r.b(cVar, c.f13929d)) {
                    return ScreenCondition.MEDIUM;
                }
                if (r.b(cVar, c.f13930e)) {
                    return ScreenCondition.EXPANDED;
                }
                Logger.INSTANCE.d("Unexpected WindowWidthSizeClass: '" + cVar + "'. Falling back to COMPACT.");
            }
            return ScreenCondition.COMPACT;
        }
    }
}
