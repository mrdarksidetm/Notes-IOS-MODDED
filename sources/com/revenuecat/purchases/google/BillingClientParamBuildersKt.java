package com.revenuecat.purchases.google;

import ae.r;
import com.android.billingclient.api.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import nd.v;
import v6.n;
import v6.o;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingClientParamBuildersKt {
    public static final i buildQueryProductDetailsParams(String str, Set<String> set) {
        r.f(str, "<this>");
        r.f(set, "productIds");
        ArrayList arrayList = new ArrayList(v.x(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(i.b.a().b((String) it.next()).c(str).a());
        }
        i iVarA = i.a().b(arrayList).a();
        r.e(iVarA, "newBuilder()\n        .se…List(productList).build()");
        return iVarA;
    }

    public static final n buildQueryPurchaseHistoryParams(String str) {
        r.f(str, "<this>");
        if (r.b(str, "inapp") ? true : r.b(str, "subs")) {
            return n.a().b(str).a();
        }
        return null;
    }

    public static final o buildQueryPurchasesParams(String str) {
        r.f(str, "<this>");
        if (r.b(str, "inapp") ? true : r.b(str, "subs")) {
            return o.a().b(str).a();
        }
        return null;
    }
}
