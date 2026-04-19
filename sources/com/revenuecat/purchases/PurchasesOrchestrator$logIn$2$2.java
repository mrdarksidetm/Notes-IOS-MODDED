package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.interfaces.LogInCallback;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$logIn$2$2 extends s implements l<PurchasesError, i0> {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.a<i0> {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = logInCallback;
            this.$error = purchasesError;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onError(this.$error);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$logIn$2$2(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$callback = logInCallback;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        this.this$0.dispatch(new AnonymousClass1(this.$callback, purchasesError));
    }
}
