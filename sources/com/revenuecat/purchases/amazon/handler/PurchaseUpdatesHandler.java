package com.revenuecat.purchases.amazon.handler;

import ae.r;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import md.s;
import md.x;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseUpdatesHandler implements PurchaseUpdatesResponseListener {
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, s<p<List<Receipt>, UserData, i0>, l<PurchasesError, i0>>> requests;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseUpdatesHandler(PurchasingServiceProvider purchasingServiceProvider) {
        r.f(purchasingServiceProvider, "purchasingServiceProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.requests = new LinkedHashMap();
    }

    private final void invokeWithStoreProblem(l<? super PurchasesError, i0> lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) throws Exception {
        s<p<List<Receipt>, UserData, i0>, l<PurchasesError, i0>> sVarRemove;
        String str;
        r.f(purchaseUpdatesResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str2 = String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{purchaseUpdatesResponse}, 1));
            r.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            RequestId requestId = purchaseUpdatesResponse.getRequestId();
            synchronized (this) {
                sVarRemove = this.requests.remove(requestId);
            }
            if (sVarRemove != null) {
                p<List<Receipt>, UserData, i0> pVarA = sVarRemove.a();
                l<PurchasesError, i0> lVarB = sVarRemove.b();
                PurchaseUpdatesResponse.RequestStatus requestStatus = purchaseUpdatesResponse.getRequestStatus();
                int i10 = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i10 == -1) {
                    str = AmazonStrings.ERROR_PURCHASES_UPDATES_STORE_PROBLEM;
                } else {
                    if (i10 == 1) {
                        List<Receipt> receipts = purchaseUpdatesResponse.getReceipts();
                        r.e(receipts, "response.receipts");
                        UserData userData = purchaseUpdatesResponse.getUserData();
                        r.e(userData, "response.userData");
                        pVarA.invoke(receipts, userData);
                        return;
                    }
                    if (i10 == 2) {
                        str = AmazonStrings.ERROR_FAILED_PURCHASES_UPDATES;
                    } else if (i10 != 3) {
                        return;
                    } else {
                        str = AmazonStrings.ERROR_UNSUPPORTED_PURCHASES_UPDATES;
                    }
                }
                invokeWithStoreProblem(lVarB, str);
            }
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onPurchaseUpdatesResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar) {
        r.f(pVar, "onSuccess");
        r.f(lVar, "onError");
        RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, x.a(pVar, lVar));
            i0 i0Var = i0.f15558a;
        }
    }
}
