package com.revenuecat.purchases.google.usecase;

import ae.o;
import ae.r;
import ae.s;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final p<Long, l<? super PurchasesError, i0>, i0> executeRequestOnUIThread;
    private final int maxRetries;
    private final l<PurchasesError, i0> onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<T, i0> {
        AnonymousClass1(Object obj) {
            super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Object obj) {
            invoke2(obj);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t10) {
            ((BillingClientUseCase) this.receiver).onOk(t10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<com.android.billingclient.api.e, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.e eVar) {
            invoke2(eVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.e eVar) {
            r.f(eVar, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(eVar);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$run$1, reason: invalid class name and case insensitive filesystem */
    static final class C05811 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ BillingClientUseCase<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05811(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingClientUseCase(UseCaseParams useCaseParams, l<? super PurchasesError, i0> lVar, p<? super Long, ? super l<? super PurchasesError, i0>, i0> pVar) {
        r.f(useCaseParams, "useCaseParams");
        r.f(lVar, "onError");
        r.f(pVar, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = lVar;
        this.executeRequestOnUIThread = pVar;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    }

    private final void backoffOrErrorIfServiceUnavailable(l<? super com.android.billingclient.api.e, i0> lVar, com.android.billingclient.api.e eVar) {
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(BillingStrings.BILLING_SERVICE_UNAVAILABLE, Arrays.copyOf(new Object[]{Boolean.valueOf(this.useCaseParams.getAppInBackground())}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (ke.a.m(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            lVar.invoke(eVar);
        }
    }

    private final void backoffOrRetryNetworkError(l<? super com.android.billingclient.api.e, i0> lVar, com.android.billingclient.api.e eVar) {
        int i10;
        if (getBackoffForNetworkErrors() && ke.a.m(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i10 = this.retryAttempt) >= this.maxRetries) {
            lVar.invoke(eVar);
        } else {
            this.retryAttempt = i10 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(com.android.billingclient.api.e eVar) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        l<PurchasesError, i0> lVar = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(eVar.b(), str);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        lVar.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        r.e(string, "stringWriter.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, com.android.billingclient.api.e eVar, Object obj, l lVar, l lVar2, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i10 & 4) != 0) {
            lVar = new AnonymousClass1(billingClientUseCase);
        }
        if ((i10 & 8) != 0) {
            lVar2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(eVar, obj, lVar, lVar2);
    }

    private final void retryWithBackoff() {
        long j10 = this.retryBackoff;
        this.retryBackoff = DurationExtensionsKt.m17minQTBD994(ke.a.I(j10, 2), BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(ke.a.t(j10));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        billingClientUseCase.run(j10);
    }

    public abstract void executeAsync();

    protected boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final p<Long, l<? super PurchasesError, i0>, i0> getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t10);

    public final void processResult(com.android.billingclient.api.e eVar, T t10, l<? super T, i0> lVar, l<? super com.android.billingclient.api.e, i0> lVar2) {
        r.f(eVar, "billingResult");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.Companion.fromCode(eVar.b());
        if (r.b(billingResponseFromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            lVar.invoke(t10);
            return;
        }
        if (r.b(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0L, 1, null);
        } else {
            if (r.b(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(lVar2, eVar);
                return;
            }
            if (r.b(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : r.b(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(lVar2, eVar);
            } else {
                lVar2.invoke(eVar);
            }
        }
    }

    public final void run(long j10) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j10), new C05811(this));
    }

    protected final void withConnectedClient(com.android.billingclient.api.a aVar, l<? super com.android.billingclient.api.a, i0> lVar) {
        r.f(lVar, "receivingFunction");
        i0 i0Var = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                lVar.invoke(aVar);
                i0Var = i0.f15558a;
            }
        }
        if (i0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }
}
