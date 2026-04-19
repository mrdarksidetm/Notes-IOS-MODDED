package com.revenuecat.purchases.subscriberattributes;

import ae.s;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 extends s implements zd.a<i0> {
    final /* synthetic */ zd.a<i0> $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(zd.a<i0> aVar) {
        super(0);
        this.$completion = aVar;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$completion.invoke();
    }
}
