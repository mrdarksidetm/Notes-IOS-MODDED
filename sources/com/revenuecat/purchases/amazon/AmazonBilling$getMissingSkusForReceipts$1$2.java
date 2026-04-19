package com.revenuecat.purchases.amazon;

import ae.f0;
import ae.r;
import ae.s;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Map;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class AmazonBilling$getMissingSkusForReceipts$1$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p<Map<String, String>, Map<String, PurchasesError>, i0> $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ f0 $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, f0 f0Var, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = f0Var;
        this.$onCompletion = pVar;
        this.$successMap = map2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        r.e(receiptId, "receipt.receiptId");
        map.put(receiptId, purchasesError);
        f0 f0Var = this.$receiptsLeft;
        int i10 = f0Var.f703a - 1;
        f0Var.f703a = i10;
        if (i10 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
