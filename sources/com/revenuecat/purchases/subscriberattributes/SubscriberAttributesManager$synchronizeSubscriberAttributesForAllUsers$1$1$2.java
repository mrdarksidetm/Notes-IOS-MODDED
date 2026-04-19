package com.revenuecat.purchases.subscriberattributes;

import ae.f0;
import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import md.i0;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends s implements q<PurchasesError, Boolean, List<? extends SubscriberAttributeError>, i0> {
    final /* synthetic */ zd.a<i0> $completion;
    final /* synthetic */ f0 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, f0 f0Var, zd.a<i0> aVar, int i10) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = f0Var;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool, List<? extends SubscriberAttributeError> list) {
        invoke(purchasesError, bool.booleanValue(), (List<SubscriberAttributeError>) list);
        return i0.f15558a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10, List<SubscriberAttributeError> list) {
        r.f(purchasesError, "error");
        r.f(list, "attributeErrors");
        if (z10) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, list);
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_ERROR, Arrays.copyOf(new Object[]{this.$syncingAppUserID, purchasesError}, 2));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        f0 f0Var = this.$currentSyncedAttributeCount;
        int i10 = f0Var.f703a + 1;
        f0Var.f703a = i10;
        zd.a<i0> aVar = this.$completion;
        if (aVar == null || i10 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        aVar.invoke();
    }
}
