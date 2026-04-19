package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nd.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pd.b;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerInfo$nonSubscriptionTransactions$2 extends s implements zd.a<List<? extends Transaction>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // zd.a
    public final List<? extends Transaction> invoke() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> itKeys = jSONObject.keys();
        r.e(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                r.e(next, "productId");
                r.e(jSONObject2, "transactionJSONObject");
                arrayList.add(new Transaction(next, jSONObject2));
            }
        }
        return c0.u0(arrayList, new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return b.a(((Transaction) t10).getPurchaseDate(), ((Transaction) t11).getPurchaseDate());
            }
        });
    }
}
