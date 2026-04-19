package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7782d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, boolean z10) {
        super(cVar, com.amazon.a.a.o.b.ah, z10);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2;
        String message;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str, str3));
            } catch (e e10) {
                str4 = f7782d;
                sb2 = new StringBuilder();
                sb2.append("fail to parse receipt, requestId:");
                message = e10.a();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb2.toString());
            } catch (f e11) {
                str4 = f7782d;
                sb2 = new StringBuilder();
                sb2.append("fail to verify receipt, requestId:");
                message = e11.a();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb2.toString());
            } catch (Throwable th) {
                str4 = f7782d;
                sb2 = new StringBuilder();
                sb2.append("fail to verify receipt, requestId:");
                message = th.getMessage();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb2.toString());
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f7782d, "data: " + mapB);
        String str = (String) mapB.get("userId");
        String str2 = (String) mapB.get(com.amazon.a.a.o.b.f7439m);
        List<Receipt> listA = a(str, (String) mapB.get(com.amazon.a.a.o.b.G), (String) mapB.get(com.amazon.a.a.o.b.B));
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f7428b);
        boolean zBooleanValue = Boolean.valueOf((String) mapB.get(com.amazon.a.a.o.b.f7435i)).booleanValue();
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(listA).setHasMore(zBooleanValue).build();
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        cVar.a().a(purchaseUpdatesResponseBuild);
        return true;
    }
}
