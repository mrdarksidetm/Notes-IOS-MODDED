package com.revenuecat.purchases.amazon;

import ae.f0;
import ae.r;
import ae.s;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Map;
import md.i0;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class AmazonBilling$getMissingSkusForReceipts$1$1 extends s implements l<JSONObject, i0> {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p<Map<String, String>, Map<String, PurchasesError>, i0> $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ f0 $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, f0 f0Var, AmazonBilling amazonBilling, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = f0Var;
        this.this$0 = amazonBilling;
        this.$onCompletion = pVar;
        this.$errorMap = map2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) throws JSONException {
        invoke2(jSONObject);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) throws JSONException {
        r.f(jSONObject, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{jSONObject.toString()}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        r.e(receiptId, "receipt.receiptId");
        Object obj = jSONObject.get(b.L);
        r.d(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        f0 f0Var = this.$receiptsLeft;
        int i10 = f0Var.f703a - 1;
        f0Var.f703a = i10;
        if (i10 == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
