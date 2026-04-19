package com.revenuecat.purchases.paywalls.events;

import ae.j;
import ae.r;
import af.j1;
import af.y;
import af.z0;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class PaywallEvent {
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, y.b("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values())};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallEvent> serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }
    }

    public static final class CreationData {
        public static final Companion Companion = new Companion(null);
        private final Date date;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final UUID f9116id;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<CreationData> serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CreationData(int i10, UUID uuid, Date date, j1 j1Var) {
            if (3 != (i10 & 3)) {
                z0.a(i10, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.f9116id = uuid;
            this.date = date;
        }

        public CreationData(UUID uuid, Date date) {
            r.f(uuid, "id");
            r.f(date, "date");
            this.f9116id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uuid = creationData.f9116id;
            }
            if ((i10 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        public static /* synthetic */ void getDate$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self(CreationData creationData, d dVar, f fVar) {
            dVar.E(fVar, 0, UUIDSerializer.INSTANCE, creationData.f9116id);
            dVar.E(fVar, 1, DateSerializer.INSTANCE, creationData.date);
        }

        public final UUID component1() {
            return this.f9116id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID uuid, Date date) {
            r.f(uuid, "id");
            r.f(date, "date");
            return new CreationData(uuid, date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return r.b(this.f9116id, creationData.f9116id) && r.b(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.f9116id;
        }

        public int hashCode() {
            return (this.f9116id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.f9116id + ", date=" + this.date + ')';
        }
    }

    public static final class Data {
        public static final Companion Companion = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Data> serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i10, String str, int i11, UUID uuid, String str2, String str3, boolean z10, j1 j1Var) {
            if (63 != (i10 & 63)) {
                z0.a(i10, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i11;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }

        public Data(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            r.f(str, "offeringIdentifier");
            r.f(uuid, "sessionIdentifier");
            r.f(str2, "displayMode");
            r.f(str3, "localeIdentifier");
            this.offeringIdentifier = str;
            this.paywallRevision = i10;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i10, UUID uuid, String str2, String str3, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i11 & 2) != 0) {
                i10 = data.paywallRevision;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            UUID uuid2 = uuid;
            if ((i11 & 8) != 0) {
                str2 = data.displayMode;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            String str5 = str3;
            if ((i11 & 32) != 0) {
                z10 = data.darkMode;
            }
            return data.copy(str, i12, uuid2, str4, str5, z10);
        }

        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final /* synthetic */ void write$Self(Data data, d dVar, f fVar) {
            dVar.w(fVar, 0, data.offeringIdentifier);
            dVar.y(fVar, 1, data.paywallRevision);
            dVar.E(fVar, 2, UUIDSerializer.INSTANCE, data.sessionIdentifier);
            dVar.w(fVar, 3, data.displayMode);
            dVar.w(fVar, 4, data.localeIdentifier);
            dVar.j(fVar, 5, data.darkMode);
        }

        public final String component1() {
            return this.offeringIdentifier;
        }

        public final int component2() {
            return this.paywallRevision;
        }

        public final UUID component3() {
            return this.sessionIdentifier;
        }

        public final String component4() {
            return this.displayMode;
        }

        public final String component5() {
            return this.localeIdentifier;
        }

        public final boolean component6() {
            return this.darkMode;
        }

        public final Data copy(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            r.f(str, "offeringIdentifier");
            r.f(uuid, "sessionIdentifier");
            r.f(str2, "displayMode");
            r.f(str3, "localeIdentifier");
            return new Data(str, i10, uuid, str2, str3, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return r.b(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && r.b(this.sessionIdentifier, data.sessionIdentifier) && r.b(this.displayMode, data.displayMode) && r.b(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
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

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v9, types: [int] */
        public int hashCode() {
            int iHashCode = ((((((((this.offeringIdentifier.hashCode() * 31) + Integer.hashCode(this.paywallRevision)) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31;
            boolean z10 = this.darkMode;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        public String toString() {
            return "Data(offeringIdentifier=" + this.offeringIdentifier + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + ", localeIdentifier=" + this.localeIdentifier + ", darkMode=" + this.darkMode + ')';
        }
    }

    public /* synthetic */ PaywallEvent(int i10, CreationData creationData, Data data, PaywallEventType paywallEventType, j1 j1Var) {
        if (7 != (i10 & 7)) {
            z0.a(i10, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        r.f(creationData, "creationData");
        r.f(data, "data");
        r.f(paywallEventType, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i10 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i10 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final /* synthetic */ void write$Self(PaywallEvent paywallEvent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, PaywallEvent$CreationData$$serializer.INSTANCE, paywallEvent.creationData);
        dVar.E(fVar, 1, PaywallEvent$Data$$serializer.INSTANCE, paywallEvent.data);
        dVar.E(fVar, 2, bVarArr[2], paywallEvent.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        r.f(creationData, "creationData");
        r.f(data, "data");
        r.f(paywallEventType, "type");
        return new PaywallEvent(creationData, data, paywallEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return r.b(this.creationData, paywallEvent.creationData) && r.b(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsRelease() {
        String string = this.data.getSessionIdentifier().toString();
        r.e(string, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }
}
