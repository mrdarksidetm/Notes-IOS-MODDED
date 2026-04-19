package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7780d = "c";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Date f7781e = new Date(0);

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z10) {
        super(cVar, "1.0", z10);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        String str;
        StringBuilder sb2;
        String message;
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f7780d, "data: " + mapB);
        String str2 = (String) mapB.get("userId");
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f7439m);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.G));
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Receipt receiptA = com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str2, (String) null);
                arrayList.add(receiptA);
                if (ProductType.ENTITLED == receiptA.getProductType()) {
                    com.amazon.device.iap.internal.b.a.a().a(str2, receiptA.getReceiptId(), receiptA.getSku());
                }
            } catch (e e10) {
                str = f7780d;
                sb2 = new StringBuilder();
                sb2.append("fail to parse receipt, requestId:");
                message = e10.a();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb2.toString());
            } catch (f e11) {
                str = f7780d;
                sb2 = new StringBuilder();
                sb2.append("fail to verify receipt, requestId:");
                message = e11.a();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb2.toString());
            } catch (Throwable th) {
                str = f7780d;
                sb2 = new StringBuilder();
                sb2.append("fail to verify receipt, requestId:");
                message = th.getMessage();
                sb2.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb2.toString());
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.H));
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            try {
                String string = jSONArray2.getString(i11);
                arrayList.add(new ReceiptBuilder().setSku(string).setProductType(ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(f7781e).setReceiptId(com.amazon.device.iap.internal.b.a.a().a(str2, string)).build());
            } catch (JSONException unused) {
                com.amazon.device.iap.internal.util.b.b(f7780d, "fail to parse JSON[" + i11 + "] in \"" + jSONArray2 + "\"");
            }
        }
        String str4 = (String) mapB.get(com.amazon.a.a.o.b.f7428b);
        boolean zEqualsIgnoreCase = com.amazon.a.a.o.b.f7427af.equalsIgnoreCase((String) mapB.get(com.amazon.a.a.o.b.f7435i));
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipts(arrayList).setHasMore(zEqualsIgnoreCase).build();
        purchaseUpdatesResponseBuild.getReceipts().addAll(com.amazon.device.iap.internal.b.d.a().b(purchaseUpdatesResponseBuild.getUserData().getUserId()));
        cVar.a().a(purchaseUpdatesResponseBuild);
        cVar.a().a(com.amazon.a.a.o.b.ap, str4);
        return true;
    }
}
