package com.revenuecat.purchases.paywalls.components.properties;

import ae.j;
import ae.s;
import af.y;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import md.l;
import md.n;
import md.p;
import we.b;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum FlexDistribution {
    START,
    END,
    CENTER,
    SPACE_BETWEEN,
    SPACE_AROUND,
    SPACE_EVENLY;

    public static final Companion Companion = new Companion(null);
    private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.FlexDistribution$Companion$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return y.a("com.revenuecat.purchases.paywalls.components.properties.FlexDistribution", FlexDistribution.values(), new String[]{"start", "end", "center", "space_between", "space_around", "space_evenly"}, new Annotation[][]{null, null, null, null, null, null}, null);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) FlexDistribution.$cachedSerializer$delegate.getValue();
        }

        public final b<FlexDistribution> serializer() {
            return get$cachedSerializer();
        }
    }
}
