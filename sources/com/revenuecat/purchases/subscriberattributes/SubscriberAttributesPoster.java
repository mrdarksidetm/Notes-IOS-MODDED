package com.revenuecat.purchases.subscriberattributes;

import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import java.util.Map;
import md.i0;
import md.x;
import nd.q0;
import nd.u;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> qVar) {
            super(1);
            this.$onErrorHandler = qVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, u.m());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements q<PurchasesError, Integer, JSONObject, i0> {
        final /* synthetic */ q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> $onErrorHandler;
        final /* synthetic */ zd.a<i0> $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(zd.a<i0> aVar, q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> qVar) {
            super(3);
            this.$onSuccessHandler = aVar;
            this.$onErrorHandler = qVar;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Integer num, JSONObject jSONObject) throws JSONException {
            invoke(purchasesError, num.intValue(), jSONObject);
            return i0.f15558a;
        }

        public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) throws JSONException {
            i0 i0Var;
            r.f(jSONObject, "body");
            if (purchasesError != null) {
                q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> qVar = this.$onErrorHandler;
                boolean z10 = (RCHTTPStatusCodes.INSTANCE.isServerError(i10) || (i10 == 404)) ? false : true;
                List<SubscriberAttributeError> listM = u.m();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    listM = BackendHelpersKt.getAttributeErrors(jSONObject);
                }
                qVar.invoke(purchasesError, Boolean.valueOf(z10), listM);
                i0Var = i0.f15558a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        r.f(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> map, String str, zd.a<i0> aVar, q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> qVar) {
        r.f(map, "attributes");
        r.f(str, "appUserID");
        r.f(aVar, "onSuccessHandler");
        r.f(qVar, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(str), q0.c(x.a("attributes", map)), null, Delay.DEFAULT, new AnonymousClass1(qVar), new AnonymousClass2(aVar, qVar));
    }
}
