package com.revenuecat.purchases.amazon;

import ae.s;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class AmazonCache$amazonPostedTokensKey$2 extends s implements a<String> {
    final /* synthetic */ AmazonCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmazonCache$amazonPostedTokensKey$2(AmazonCache amazonCache) {
        super(0);
        this.this$0 = amazonCache;
    }

    @Override // zd.a
    public final String invoke() {
        return this.this$0.deviceCache.newKey("amazon.tokens");
    }
}
