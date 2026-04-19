package com.revenuecat.purchases.paywalls.events;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import bf.a;
import com.revenuecat.purchases.utils.Event;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final a.C0138a json = a.f5793d;
    private final PaywallEvent event;
    private final String userID;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PaywallStoredEvent fromString(String str) {
            r.f(str, "string");
            a.C0138a json = getJson();
            json.a();
            return (PaywallStoredEvent) json.d(PaywallStoredEvent.Companion.serializer(), str);
        }

        public final a.C0138a getJson() {
            return PaywallStoredEvent.json;
        }

        public final b<PaywallStoredEvent> serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallStoredEvent(int i10, PaywallEvent paywallEvent, String str, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public PaywallStoredEvent(PaywallEvent paywallEvent, String str) {
        r.f(paywallEvent, "event");
        r.f(str, "userID");
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i10 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self(PaywallStoredEvent paywallStoredEvent, d dVar, f fVar) {
        dVar.E(fVar, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        dVar.w(fVar, 1, paywallStoredEvent.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent paywallEvent, String str) {
        r.f(paywallEvent, "event");
        r.f(str, "userID");
        return new PaywallStoredEvent(paywallEvent, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return r.b(this.event, paywallStoredEvent.event) && r.b(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.userID.hashCode();
    }

    public final PaywallBackendEvent toPaywallBackendEvent() {
        String string = this.event.getCreationData().getId().toString();
        r.e(string, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String string2 = this.event.getData().getSessionIdentifier().toString();
        r.e(string2, "event.data.sessionIdentifier.toString()");
        return new PaywallBackendEvent(string, 1, value, str, string2, this.event.getData().getOfferingIdentifier(), this.event.getData().getPaywallRevision(), this.event.getCreationData().getDate().getTime(), this.event.getData().getDisplayMode(), this.event.getData().getDarkMode(), this.event.getData().getLocaleIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        a.C0138a c0138a = json;
        c0138a.a();
        return c0138a.b(Companion.serializer(), this);
    }
}
