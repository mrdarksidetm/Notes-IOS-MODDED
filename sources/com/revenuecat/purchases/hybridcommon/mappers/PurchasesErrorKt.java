package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import java.util.Map;
import md.s;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesErrorKt {
    public static final ErrorContainer map(PurchasesError purchasesError, Map<String, ? extends Object> map) {
        r.f(purchasesError, "<this>");
        r.f(map, "extra");
        int code = purchasesError.getCode().getCode();
        String message = purchasesError.getMessage();
        s[] sVarArr = new s[5];
        sVarArr[0] = x.a("code", Integer.valueOf(purchasesError.getCode().getCode()));
        sVarArr[1] = x.a("message", purchasesError.getMessage());
        sVarArr[2] = x.a("readableErrorCode", purchasesError.getCode().name());
        sVarArr[3] = x.a("readable_error_code", purchasesError.getCode().name());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage == null) {
            underlyingErrorMessage = "";
        }
        sVarArr[4] = x.a("underlyingErrorMessage", underlyingErrorMessage);
        return new ErrorContainer(code, message, r0.l(r0.h(sVarArr), map));
    }

    public static /* synthetic */ ErrorContainer map$default(PurchasesError purchasesError, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = r0.e();
        }
        return map(purchasesError, map);
    }
}
