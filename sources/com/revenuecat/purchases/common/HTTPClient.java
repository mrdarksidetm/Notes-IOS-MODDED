package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import android.os.Build;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import je.v;
import ke.a;
import md.s;
import md.x;
import nd.r0;
import org.json.JSONObject;
import xd.n;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final LocaleProvider localeProvider;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider) {
        r.f(appConfig, "appConfig");
        r.f(eTagManager, "eTagManager");
        r.f(signingManager, "signingManager");
        r.f(storefrontProvider, "storefrontProvider");
        r.f(dateProvider, "dateProvider");
        r.f(mapConverter, "mapConverter");
        r.f(localeProvider, "localeProvider");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
        this.localeProvider = localeProvider;
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, int i10, j jVar) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider, (i10 & 64) != 0 ? new MapConverter() : mapConverter, (i10 & 128) != 0 ? new DefaultLocaleProvider() : localeProvider);
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) throws IOException {
        URLConnection uRLConnectionOpenConnection = hTTPRequest.getFullURL().openConnection();
        r.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            r.e(outputStream, "os");
            BufferedWriter bufferedWriterBuffer = buffer(outputStream);
            String string = body.toString();
            r.e(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z10, String str2, boolean z11, String str3) {
        s[] sVarArr = new s[18];
        sVarArr[0] = x.a("Content-Type", "application/json");
        sVarArr[1] = x.a("X-Platform", getXPlatformHeader());
        sVarArr[2] = x.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        sVarArr[3] = x.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        sVarArr[4] = x.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        sVarArr[5] = x.a("X-Platform-Device", Build.MODEL);
        sVarArr[6] = x.a("X-Platform-Brand", Build.BRAND);
        sVarArr[7] = x.a("X-Version", "8.10.5");
        sVarArr[8] = x.a("X-Preferred-Locales", this.localeProvider.getCurrentLocalesLanguageTags());
        sVarArr[9] = x.a("X-Client-Locale", this.appConfig.getLanguageTag());
        sVarArr[10] = x.a("X-Client-Version", this.appConfig.getVersionName());
        sVarArr[11] = x.a("X-Client-Bundle-ID", this.appConfig.getPackageName());
        boolean finishTransactions = this.appConfig.getFinishTransactions();
        String str4 = b.f7427af;
        sVarArr[12] = x.a("X-Observer-Mode-Enabled", finishTransactions ? b.ag : b.f7427af);
        sVarArr[13] = x.a("X-Nonce", str2);
        sVarArr[14] = x.a(HTTPRequest.POST_PARAMS_HASH, str3);
        if (!this.appConfig.getCustomEntitlementComputation()) {
            str4 = null;
        }
        sVarArr[15] = x.a("X-Custom-Entitlements-Computation", str4);
        sVarArr[16] = x.a("X-Storefront", this.storefrontProvider.getStorefront());
        sVarArr[17] = x.a("X-Is-Debug-Build", String.valueOf(this.appConfig.isDebugBuild()));
        return MapExtensionsKt.filterNotNullValues(r0.l(r0.l(r0.h(sVarArr), map), this.eTagManager.getETagHeaders$purchases_defaultsRelease(str, z11, z10)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e10) {
            if (!(e10 instanceof IllegalArgumentException ? true : e10 instanceof IOException)) {
                throw e10;
            }
            LogIntent logIntent = LogIntent.WARNING;
            String str = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e10.getMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return httpURLConnection.getErrorStream();
        }
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || !(!v.v(headerField))) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.common.networking.HTTPResult performCall(java.net.URL r22, com.revenuecat.purchases.common.networking.Endpoint r23, java.util.Map<java.lang.String, ? extends java.lang.Object> r24, java.util.List<md.s<java.lang.String, java.lang.String>> r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performCall(java.net.URL, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z10);
    }

    private final String readFully(InputStream inputStream) {
        return n.d(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date date, boolean z10, HTTPResult hTTPResult) {
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(a.f14459b, date, this.dateProvider.getNow());
            int responseCode = z10 ? hTTPResult != null ? hTTPResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED : -1;
            HTTPResult.Origin origin = hTTPResult != null ? hTTPResult.getOrigin() : null;
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            diagnosticsTracker.m25trackHttpRequestPerformednRVORKE(endpoint, jBetween, z10 && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode), responseCode, hTTPResult != null ? hTTPResult.getBackendErrorCode() : null, origin, verificationResult);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL url, Endpoint endpoint, Map<String, ? extends Object> map, List<s<String, String>> list, Map<String, String> map2, boolean z10) {
        r.f(url, "baseURL");
        r.f(endpoint, "endpoint");
        r.f(map2, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult hTTPResultPerformCall = performCall(url, endpoint, map, list, map2, z10);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, hTTPResultPerformCall);
            if (hTTPResultPerformCall != null) {
                return hTTPResultPerformCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(url, endpoint, map, list, map2, true);
        } catch (Throwable th) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th;
        }
    }
}
