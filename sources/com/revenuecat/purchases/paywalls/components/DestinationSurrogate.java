package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.s;
import af.y;
import md.l;
import md.n;
import md.p;
import we.b;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
enum DestinationSurrogate {
    customer_center,
    privacy_policy,
    terms,
    url;

    public static final Companion Companion = new Companion(null);
    private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.DestinationSurrogate$Companion$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return y.b("com.revenuecat.purchases.paywalls.components.DestinationSurrogate", DestinationSurrogate.values());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) DestinationSurrogate.$cachedSerializer$delegate.getValue();
        }

        public final b<DestinationSurrogate> serializer() {
            return get$cachedSerializer();
        }
    }
}
