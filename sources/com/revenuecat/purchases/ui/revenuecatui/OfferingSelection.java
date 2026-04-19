package com.revenuecat.purchases.ui.revenuecatui;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Offering;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OfferingSelection {

    public static final class None extends OfferingSelection {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class OfferingId extends OfferingSelection {
        public static final int $stable = 0;
        private final String offeringId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingId(String str) {
            super(null);
            r.f(str, "offeringId");
            this.offeringId = str;
        }

        public static /* synthetic */ OfferingId copy$default(OfferingId offeringId, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = offeringId.offeringId;
            }
            return offeringId.copy(str);
        }

        public final String component1() {
            return this.offeringId;
        }

        public final OfferingId copy(String str) {
            r.f(str, "offeringId");
            return new OfferingId(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferingId) && r.b(this.offeringId, ((OfferingId) obj).offeringId);
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public int hashCode() {
            return this.offeringId.hashCode();
        }

        public String toString() {
            return "OfferingId(offeringId=" + this.offeringId + ')';
        }
    }

    public static final class OfferingType extends OfferingSelection {
        public static final int $stable = 8;
        private final Offering offeringType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingType(Offering offering) {
            super(null);
            r.f(offering, "offeringType");
            this.offeringType = offering;
        }

        public static /* synthetic */ OfferingType copy$default(OfferingType offeringType, Offering offering, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                offering = offeringType.offeringType;
            }
            return offeringType.copy(offering);
        }

        public final Offering component1() {
            return this.offeringType;
        }

        public final OfferingType copy(Offering offering) {
            r.f(offering, "offeringType");
            return new OfferingType(offering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferingType) && r.b(this.offeringType, ((OfferingType) obj).offeringType);
        }

        public final Offering getOfferingType() {
            return this.offeringType;
        }

        public int hashCode() {
            return this.offeringType.hashCode();
        }

        public String toString() {
            return "OfferingType(offeringType=" + this.offeringType + ')';
        }
    }

    private OfferingSelection() {
    }

    public /* synthetic */ OfferingSelection(j jVar) {
        this();
    }

    public final Offering getOffering() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType();
        }
        if ((this instanceof OfferingId) || r.b(this, None.INSTANCE)) {
            return null;
        }
        throw new q();
    }

    public final String getOfferingIdentifier() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType().getIdentifier();
        }
        if (this instanceof OfferingId) {
            return ((OfferingId) this).getOfferingId();
        }
        if (r.b(this, None.INSTANCE)) {
            return null;
        }
        throw new q();
    }
}
