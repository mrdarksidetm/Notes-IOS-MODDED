package com.revenuecat.purchases.paywalls.events;

import ae.j;
import ae.r;
import af.e;
import af.j1;
import af.z0;
import bf.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.v;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEventRequest {
    private final List<PaywallBackendEvent> events;
    public static final Companion Companion = new Companion(null);
    private static final a json = a.f5793d;
    private static final b<Object>[] $childSerializers = {new e(PaywallBackendEvent$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final a getJson() {
            return PaywallEventRequest.json;
        }

        public final b<PaywallEventRequest> serializer() {
            return PaywallEventRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallEventRequest(int i10, List list, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, PaywallEventRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public PaywallEventRequest(List<PaywallBackendEvent> list) {
        r.f(list, "events");
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallEventRequest copy$default(PaywallEventRequest paywallEventRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paywallEventRequest.events;
        }
        return paywallEventRequest.copy(list);
    }

    public final List<PaywallBackendEvent> component1() {
        return this.events;
    }

    public final PaywallEventRequest copy(List<PaywallBackendEvent> list) {
        r.f(list, "events");
        return new PaywallEventRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallEventRequest) && r.b(this.events, ((PaywallEventRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        List<PaywallBackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((PaywallBackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List<PaywallBackendEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "PaywallEventRequest(events=" + this.events + ')';
    }
}
