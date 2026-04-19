package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import md.x;
import nd.q0;
import org.json.JSONObject;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class BackendHelper {
    private final String apiKey;
    private final AppConfig appConfig;
    private final Map<String, String> authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;

    public BackendHelper(String str, Dispatcher dispatcher, AppConfig appConfig, HTTPClient hTTPClient) {
        r.f(str, "apiKey");
        r.f(dispatcher, "dispatcher");
        r.f(appConfig, "appConfig");
        r.f(hTTPClient, "httpClient");
        this.apiKey = str;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = hTTPClient;
        this.authenticationHeaders = q0.c(x.a("Authorization", "Bearer " + str));
    }

    public static /* synthetic */ void enqueue$default(BackendHelper backendHelper, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            delay = Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay) {
        r.f(asyncCall, "call");
        r.f(dispatcher, "dispatcher");
        r.f(delay, "delay");
        if (dispatcher.isClosed()) {
            LogUtilsKt.errorLog$default("Enqueuing operation in closed dispatcher.", null, 2, null);
        } else {
            dispatcher.enqueue(asyncCall, delay);
        }
    }

    public final Map<String, String> getAuthenticationHeaders$purchases_defaultsRelease() {
        return this.authenticationHeaders;
    }

    public final void performRequest(final Endpoint endpoint, final Map<String, ? extends Object> map, final List<s<String, String>> list, Delay delay, final l<? super PurchasesError, i0> lVar, final q<? super PurchasesError, ? super Integer, ? super JSONObject, i0> qVar) {
        r.f(endpoint, "endpoint");
        r.f(delay, "delay");
        r.f(lVar, "onError");
        r.f(qVar, "onCompleted");
        enqueue(new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.BackendHelper.performRequest.1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(BackendHelper.this.httpClient, BackendHelper.this.appConfig.getBaseURL(), endpoint, map, list, BackendHelper.this.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                PurchasesError purchasesError;
                r.f(hTTPResult, "result");
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    purchasesError = null;
                } else {
                    purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError);
                }
                qVar.invoke(purchasesError, Integer.valueOf(hTTPResult.getResponseCode()), hTTPResult.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                lVar.invoke(purchasesError);
            }
        }, this.dispatcher, delay);
    }
}
