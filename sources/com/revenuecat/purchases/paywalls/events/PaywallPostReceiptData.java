package com.revenuecat.purchases.paywalls.events;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import bf.a;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion(null);
    private static final a.C0138a json = a.f5793d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final int revision;
    private final String sessionID;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final a.C0138a getJson() {
            return PaywallPostReceiptData.json;
        }

        public final b<PaywallPostReceiptData> serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallPostReceiptData(int i10, String str, int i11, String str2, boolean z10, String str3, String str4, j1 j1Var) {
        if (63 != (i10 & 63)) {
            z0.a(i10, 63, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionID = str;
        this.revision = i11;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public PaywallPostReceiptData(String str, int i10, String str2, boolean z10, String str3, String str4) {
        r.f(str, "sessionID");
        r.f(str2, "displayMode");
        r.f(str3, "localeIdentifier");
        r.f(str4, "offeringId");
        this.sessionID = str;
        this.revision = i10;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i10, String str2, boolean z10, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i11 & 2) != 0) {
            i10 = paywallPostReceiptData.revision;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z10 = paywallPostReceiptData.darkMode;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            str4 = paywallPostReceiptData.offeringId;
        }
        return paywallPostReceiptData.copy(str, i12, str5, z11, str6, str4);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallPostReceiptData paywallPostReceiptData, d dVar, f fVar) {
        dVar.w(fVar, 0, paywallPostReceiptData.sessionID);
        dVar.y(fVar, 1, paywallPostReceiptData.revision);
        dVar.w(fVar, 2, paywallPostReceiptData.displayMode);
        dVar.j(fVar, 3, paywallPostReceiptData.darkMode);
        dVar.w(fVar, 4, paywallPostReceiptData.localeIdentifier);
        dVar.w(fVar, 5, paywallPostReceiptData.offeringId);
    }

    public final String component1() {
        return this.sessionID;
    }

    public final int component2() {
        return this.revision;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final boolean component4() {
        return this.darkMode;
    }

    public final String component5() {
        return this.localeIdentifier;
    }

    public final String component6() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String str, int i10, String str2, boolean z10, String str3, String str4) {
        r.f(str, "sessionID");
        r.f(str2, "displayMode");
        r.f(str3, "localeIdentifier");
        r.f(str4, "offeringId");
        return new PaywallPostReceiptData(str, i10, str2, z10, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return r.b(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && r.b(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && r.b(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && r.b(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.sessionID.hashCode() * 31) + Integer.hashCode(this.revision)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z10 = this.darkMode;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.localeIdentifier.hashCode()) * 31) + this.offeringId.hashCode();
    }

    public final Map<String, Object> toMap() {
        a.C0138a c0138a = json;
        c0138a.a();
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(c0138a.e(Companion.serializer(), this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(sessionID=" + this.sessionID + ", revision=" + this.revision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", offeringId=" + this.offeringId + ')';
    }
}
