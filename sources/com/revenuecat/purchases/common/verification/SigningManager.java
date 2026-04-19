package com.revenuecat.purchases.common.verification;

import ae.j;
import ae.r;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import je.d;
import je.w;
import md.i0;
import md.q;
import md.s;
import nd.c0;
import nd.u;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            r.f(bArr, "salt");
            r.f(str, "apiKey");
            r.f(str3, "urlPath");
            r.f(str5, "requestTime");
            this.salt = bArr;
            this.apiKey = str;
            this.nonce = str2;
            this.urlPath = str3;
            this.postParamsHashHeader = str4;
            this.requestTime = str5;
            this.eTag = str6;
            this.body = str7;
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            r.f(bArr, "salt");
            r.f(str, "apiKey");
            r.f(str3, "urlPath");
            r.f(str5, "requestTime");
            return new Parameters(bArr, str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!r.b(Parameters.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) obj;
            return Arrays.equals(this.salt, parameters.salt) && r.b(this.apiKey, parameters.apiKey) && r.b(this.nonce, parameters.nonce) && r.b(this.urlPath, parameters.urlPath) && r.b(this.postParamsHashHeader, parameters.postParamsHashHeader) && r.b(this.requestTime, parameters.requestTime) && r.b(this.eTag, parameters.eTag) && r.b(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iHashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = je.d.f14191b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
                ae.r.e(r1, r3)
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L1d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L22
                byte[] r1 = new byte[r4]
            L22:
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                ae.r.e(r1, r3)
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L40
                byte[] r1 = r1.getBytes(r2)
                ae.r.e(r1, r3)
                if (r1 != 0) goto L42
            L40:
                byte[] r1 = new byte[r4]
            L42:
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                ae.r.e(r1, r3)
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L60
                byte[] r1 = r1.getBytes(r2)
                ae.r.e(r1, r3)
                if (r1 != 0) goto L62
            L60:
                byte[] r1 = new byte[r4]
            L62:
                byte[] r0 = nd.l.u(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L73
                byte[] r1 = r1.getBytes(r2)
                ae.r.e(r1, r3)
                if (r1 != 0) goto L75
            L73:
                byte[] r1 = new byte[r4]
            L75:
                byte[] r0 = nd.l.u(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String str) {
        r.f(signatureVerificationMode, "signatureVerificationMode");
        r.f(appConfig, "appConfig");
        r.f(str, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = str;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        r.e(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return w.W0(new String(bArrEncode, d.f14191b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<s<String, String>> list) {
        r.f(endpoint, "endpoint");
        if ((list == null || list.isEmpty()) || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.w();
            }
            s sVar = (s) obj;
            if (i10 > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) sVar.d()).getBytes(d.f14191b);
            r.e(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            arrayList.add(i0.f15558a);
            i10 = i11;
        }
        byte[] bArrDigest = messageDigest.digest();
        r.e(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b10 : bArrDigest) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            r.e(str, "format(this, *args)");
            sb2.append(str);
            string = sb2.toString();
        }
        return c0.h0(u.p(c0.h0(list, f.f7478a, null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, null), POST_PARAMS_ALGORITHM, string), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        r.f(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        r.f(str, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: " + str);
        } else {
            IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
            if (intermediateSignatureHelper == null) {
                return VerificationResult.NOT_REQUESTED;
            }
            if (str2 == null) {
                str8 = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{str}, 1));
            } else if (str5 == null) {
                str8 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{str}, 1));
            } else if (str4 == null && str6 == null) {
                str8 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{str}, 1));
            } else {
                try {
                    Signature signatureFromString$purchases_defaultsRelease = Signature.Companion.fromString$purchases_defaultsRelease(str2);
                    Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsRelease);
                    if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error)) {
                        if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                            throw new q();
                        }
                        if (((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsRelease.getPayload(), new Parameters(signatureFromString$purchases_defaultsRelease.getSalt(), this.apiKey, str3, str, str7, str5, str6, str4).toSignatureToVerify())) {
                            String str9 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{str}, 1));
                            r.e(str9, "format(this, *args)");
                            LogUtilsKt.verboseLog(str9);
                            return VerificationResult.VERIFIED;
                        }
                        String str10 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{str}, 1));
                        r.e(str10, "format(this, *args)");
                        LogUtilsKt.errorLog$default(str10, null, 2, null);
                        return VerificationResult.FAILED;
                    }
                    str8 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{str, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                } catch (InvalidSignatureSizeException e10) {
                    String str11 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{str, e10.getMessage()}, 2));
                    r.e(str11, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str11, null, 2, null);
                }
            }
            r.e(str8, "format(this, *args)");
            LogUtilsKt.errorLog$default(str8, null, 2, null);
        }
        return VerificationResult.FAILED;
    }
}
