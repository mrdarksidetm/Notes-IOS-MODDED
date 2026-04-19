package com.revenuecat.purchases.common.verification;

import ae.j;
import ae.r;
import com.revenuecat.purchases.EntitlementVerificationMode;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignatureVerificationMode {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntitlementVerificationMode.values().length];
                try {
                    iArr[EntitlementVerificationMode.DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntitlementVerificationMode.INFORMATIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntermediateSignatureHelper createIntermediateSignatureHelper() {
            return new IntermediateSignatureHelper(new DefaultSignatureVerifier(null, 1, null));
        }

        public static /* synthetic */ SignatureVerificationMode fromEntitlementVerificationMode$default(Companion companion, EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                signatureVerifier = null;
            }
            return companion.fromEntitlementVerificationMode(entitlementVerificationMode, signatureVerifier);
        }

        public final SignatureVerificationMode fromEntitlementVerificationMode(EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier) {
            r.f(entitlementVerificationMode, "verificationMode");
            int i10 = WhenMappings.$EnumSwitchMapping$0[entitlementVerificationMode.ordinal()];
            if (i10 == 1) {
                return Disabled.INSTANCE;
            }
            if (i10 != 2) {
                throw new q();
            }
            if (signatureVerifier == null) {
                signatureVerifier = new DefaultSignatureVerifier(null, 1, null);
            }
            return new Informational(new IntermediateSignatureHelper(signatureVerifier));
        }
    }

    public static final class Disabled extends SignatureVerificationMode {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public static final class Enforced extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Enforced() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enforced(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            r.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }

        public /* synthetic */ Enforced(IntermediateSignatureHelper intermediateSignatureHelper, int i10, j jVar) {
            this((i10 & 1) != 0 ? SignatureVerificationMode.Companion.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public static /* synthetic */ Enforced copy$default(Enforced enforced, IntermediateSignatureHelper intermediateSignatureHelper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intermediateSignatureHelper = enforced.intermediateSignatureHelper;
            }
            return enforced.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return this.intermediateSignatureHelper;
        }

        public final Enforced copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            r.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Enforced(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enforced) && r.b(this.intermediateSignatureHelper, ((Enforced) obj).intermediateSignatureHelper);
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Enforced(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }
    }

    public static final class Informational extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Informational() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Informational(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            r.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }

        public /* synthetic */ Informational(IntermediateSignatureHelper intermediateSignatureHelper, int i10, j jVar) {
            this((i10 & 1) != 0 ? SignatureVerificationMode.Companion.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public static /* synthetic */ Informational copy$default(Informational informational, IntermediateSignatureHelper intermediateSignatureHelper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intermediateSignatureHelper = informational.intermediateSignatureHelper;
            }
            return informational.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return this.intermediateSignatureHelper;
        }

        public final Informational copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            r.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Informational(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Informational) && r.b(this.intermediateSignatureHelper, ((Informational) obj).intermediateSignatureHelper);
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Informational(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }
    }

    private SignatureVerificationMode() {
    }

    public /* synthetic */ SignatureVerificationMode(j jVar) {
        this();
    }

    public IntermediateSignatureHelper getIntermediateSignatureHelper() {
        if (this instanceof Disabled) {
            return null;
        }
        if (this instanceof Informational) {
            return ((Informational) this).getIntermediateSignatureHelper();
        }
        if (this instanceof Enforced) {
            return ((Enforced) this).getIntermediateSignatureHelper();
        }
        throw new q();
    }

    public final boolean getShouldVerify() {
        if (r.b(this, Disabled.INSTANCE)) {
            return false;
        }
        if (this instanceof Informational ? true : this instanceof Enforced) {
            return true;
        }
        throw new q();
    }
}
