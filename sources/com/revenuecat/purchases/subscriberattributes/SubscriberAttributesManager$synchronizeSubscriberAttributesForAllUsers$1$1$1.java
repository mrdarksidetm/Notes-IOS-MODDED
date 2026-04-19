package com.revenuecat.purchases.subscriberattributes;

import ae.f0;
import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import md.i0;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends s implements zd.a<i0> {
    final /* synthetic */ zd.a<i0> $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ f0 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, f0 f0Var, zd.a<i0> aVar, int i10) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = f0Var;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, u.m());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, Arrays.copyOf(new Object[]{this.$syncingAppUserID}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (!r.b(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
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
