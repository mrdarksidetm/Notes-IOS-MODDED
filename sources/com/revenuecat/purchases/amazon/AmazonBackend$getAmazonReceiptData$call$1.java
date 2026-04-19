package com.revenuecat.purchases.amazon;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.util.Iterator;
import java.util.List;
import md.i0;
import org.json.JSONObject;
import zd.a;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class AmazonBackend$getAmazonReceiptData$call$1 extends s implements a<i0> {
    final /* synthetic */ List<String> $cacheKey;
    final /* synthetic */ String $receiptId;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ AmazonBackend this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AmazonBackend amazonBackend, List<String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            List<md.s<l<JSONObject, i0>, l<PurchasesError, i0>>> listRemove;
            r.f(purchasesError, "error");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((l) ((md.s) it.next()).b()).invoke(purchasesError);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements q<PurchasesError, Integer, JSONObject, i0> {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AmazonBackend amazonBackend, List<String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Integer num, JSONObject jSONObject) {
            invoke(purchasesError, num.intValue(), jSONObject);
            return i0.f15558a;
        }

        public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) {
            List<md.s<l<JSONObject, i0>, l<PurchasesError, i0>>> listRemove;
            r.f(jSONObject, "body");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    md.s sVar = (md.s) it.next();
                    l lVar = (l) sVar.a();
                    l lVar2 = (l) sVar.b();
                    if (purchasesError != null) {
                        lVar2.invoke(purchasesError);
                    } else {
                        lVar.invoke(jSONObject);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.backendHelper.performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new AnonymousClass1(this.this$0, this.$cacheKey), new AnonymousClass2(this.this$0, this.$cacheKey));
    }
}
