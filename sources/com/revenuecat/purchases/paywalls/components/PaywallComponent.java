package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import we.b;
import we.e;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface PaywallComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<PaywallComponent> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.PaywallComponent", i0.b(PaywallComponent.class), new c[]{i0.b(ButtonComponent.class), i0.b(ImageComponent.class), i0.b(PackageComponent.class), i0.b(PurchaseButtonComponent.class), i0.b(StackComponent.class), i0.b(StickyFooterComponent.class), i0.b(TextComponent.class)}, new b[]{ButtonComponent$$serializer.INSTANCE, ImageComponent$$serializer.INSTANCE, PackageComponent$$serializer.INSTANCE, PurchaseButtonComponent$$serializer.INSTANCE, StackComponent$$serializer.INSTANCE, StickyFooterComponent$$serializer.INSTANCE, TextComponent$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
