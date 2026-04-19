package com.revenuecat.purchases_ui_flutter.views;

import ae.r;
import android.content.Context;
import java.util.Map;
import nd.r0;
import sc.b;
import sc.p;
import wc.g;
import wc.h;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallViewFactory extends h {
    private final b messenger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallViewFactory(b bVar) {
        super(p.f20515a);
        r.f(bVar, "messenger");
        this.messenger = bVar;
    }

    @Override // wc.h
    public g create(Context context, int i10, Object obj) {
        r.f(context, "context");
        Map mapE = obj instanceof Map ? (Map) obj : null;
        if (mapE == null) {
            mapE = r0.e();
        }
        return new PaywallView(context, i10, this.messenger, mapE);
    }
}
