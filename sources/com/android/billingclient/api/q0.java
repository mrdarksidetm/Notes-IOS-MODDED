package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class q0 {
    static p0 a(Bundle bundle, String str, String str2) {
        e eVar = e0.f8095j;
        if (bundle == null) {
            zzb.zzk("BillingClient", String.format("%s got null owned items list", str2));
            return new p0(eVar, 54);
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        String strZzg = zzb.zzg(bundle, "BillingClient");
        e.a aVarC = e.c();
        aVarC.c(iZzb);
        aVarC.b(strZzg);
        e eVarA = aVarC.a();
        if (iZzb != 0) {
            zzb.zzk("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iZzb)));
            return new p0(eVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zzb.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new p0(eVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new p0(eVar, 56);
        }
        if (stringArrayList2 == null) {
            zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new p0(eVar, 57);
        }
        if (stringArrayList3 != null) {
            return new p0(e0.f8097l, 1);
        }
        zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new p0(eVar, 58);
    }
}
