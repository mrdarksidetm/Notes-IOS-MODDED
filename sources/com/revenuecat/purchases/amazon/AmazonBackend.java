package com.revenuecat.purchases.amazon;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.BackendHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import md.x;
import nd.u;
import org.json.JSONObject;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map<List<String>, List<s<l<JSONObject, i0>, l<PurchasesError, i0>>>> postAmazonReceiptCallbacks;

    public AmazonBackend(BackendHelper backendHelper) {
        r.f(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new LinkedHashMap();
    }

    public final void getAmazonReceiptData(String str, String str2, l<? super JSONObject, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, b.E);
        r.f(str2, "storeUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        List<String> listR = u.r(str, str2);
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, str2, str, listR);
        s<l<JSONObject, i0>, l<PurchasesError, i0>> sVarA = x.a(lVar, lVar2);
        synchronized (this) {
            if (this.postAmazonReceiptCallbacks.containsKey(listR)) {
                List<s<l<JSONObject, i0>, l<PurchasesError, i0>>> list = this.postAmazonReceiptCallbacks.get(listR);
                r.c(list);
                list.add(sVarA);
            } else {
                this.postAmazonReceiptCallbacks.put(listR, u.s(sVarA));
                amazonBackend$getAmazonReceiptData$call$1.invoke();
                i0 i0Var = i0.f15558a;
            }
        }
    }

    public final synchronized Map<List<String>, List<s<l<JSONObject, i0>, l<PurchasesError, i0>>>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map<List<String>, List<s<l<JSONObject, i0>, l<PurchasesError, i0>>>> map) {
        r.f(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}
