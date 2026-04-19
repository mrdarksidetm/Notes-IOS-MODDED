package com.revenuecat.purchases.paywalls.events;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallBackendEvent {
    public static final Companion Companion = new Companion(null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    private final String appUserID;
    private final boolean darkMode;
    private final String displayMode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f9115id;
    private final String localeIdentifier;
    private final String offeringID;
    private final int paywallRevision;
    private final String sessionID;
    private final long timestamp;
    private final String type;
    private final int version;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallBackendEvent> serializer() {
            return PaywallBackendEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallBackendEvent(int i10, String str, int i11, String str2, String str3, String str4, String str5, int i12, long j10, String str6, boolean z10, String str7, j1 j1Var) {
        if (2047 != (i10 & 2047)) {
            z0.a(i10, 2047, PaywallBackendEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f9115id = str;
        this.version = i11;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i12;
        this.timestamp = j10;
        this.displayMode = str6;
        this.darkMode = z10;
        this.localeIdentifier = str7;
    }

    public PaywallBackendEvent(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j10, String str6, boolean z10, String str7) {
        r.f(str, "id");
        r.f(str2, "type");
        r.f(str3, "appUserID");
        r.f(str4, "sessionID");
        r.f(str5, "offeringID");
        r.f(str6, "displayMode");
        r.f(str7, "localeIdentifier");
        this.f9115id = str;
        this.version = i10;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i11;
        this.timestamp = j10;
        this.displayMode = str6;
        this.darkMode = z10;
        this.localeIdentifier = str7;
    }

    public static /* synthetic */ void getAppUserID$annotations() {
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingID$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallBackendEvent paywallBackendEvent, d dVar, f fVar) {
        dVar.w(fVar, 0, paywallBackendEvent.f9115id);
        dVar.y(fVar, 1, paywallBackendEvent.version);
        dVar.w(fVar, 2, paywallBackendEvent.type);
        dVar.w(fVar, 3, paywallBackendEvent.appUserID);
        dVar.w(fVar, 4, paywallBackendEvent.sessionID);
        dVar.w(fVar, 5, paywallBackendEvent.offeringID);
        dVar.y(fVar, 6, paywallBackendEvent.paywallRevision);
        dVar.B(fVar, 7, paywallBackendEvent.timestamp);
        dVar.w(fVar, 8, paywallBackendEvent.displayMode);
        dVar.j(fVar, 9, paywallBackendEvent.darkMode);
        dVar.w(fVar, 10, paywallBackendEvent.localeIdentifier);
    }

    public final String component1() {
        return this.f9115id;
    }

    public final boolean component10() {
        return this.darkMode;
    }

    public final String component11() {
        return this.localeIdentifier;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.appUserID;
    }

    public final String component5() {
        return this.sessionID;
    }

    public final String component6() {
        return this.offeringID;
    }

    public final int component7() {
        return this.paywallRevision;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.displayMode;
    }

    public final PaywallBackendEvent copy(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j10, String str6, boolean z10, String str7) {
        r.f(str, "id");
        r.f(str2, "type");
        r.f(str3, "appUserID");
        r.f(str4, "sessionID");
        r.f(str5, "offeringID");
        r.f(str6, "displayMode");
        r.f(str7, "localeIdentifier");
        return new PaywallBackendEvent(str, i10, str2, str3, str4, str5, i11, j10, str6, z10, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallBackendEvent)) {
            return false;
        }
        PaywallBackendEvent paywallBackendEvent = (PaywallBackendEvent) obj;
        return r.b(this.f9115id, paywallBackendEvent.f9115id) && this.version == paywallBackendEvent.version && r.b(this.type, paywallBackendEvent.type) && r.b(this.appUserID, paywallBackendEvent.appUserID) && r.b(this.sessionID, paywallBackendEvent.sessionID) && r.b(this.offeringID, paywallBackendEvent.offeringID) && this.paywallRevision == paywallBackendEvent.paywallRevision && this.timestamp == paywallBackendEvent.timestamp && r.b(this.displayMode, paywallBackendEvent.displayMode) && this.darkMode == paywallBackendEvent.darkMode && r.b(this.localeIdentifier, paywallBackendEvent.localeIdentifier);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getId() {
        return this.f9115id;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f9115id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z10 = this.darkMode;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((iHashCode + r12) * 31) + this.localeIdentifier.hashCode();
    }

    public String toString() {
        return "PaywallBackendEvent(id=" + this.f9115id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ')';
    }
}
