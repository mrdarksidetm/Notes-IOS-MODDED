package com.revenuecat.purchases.ui.revenuecatui;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import le.k;
import le.n0;
import md.i0;
import md.u;
import sd.d;
import sd.j;
import t0.k1;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1", f = "PaywallDialog.kt", l = {}, m = "invokeSuspend")
final class PaywallDialogKt$PaywallDialog$1$1 extends j implements p<n0, qd.d<? super i0>, Object> {
    final /* synthetic */ l<CustomerInfo, Boolean> $shouldDisplayBlock;
    final /* synthetic */ k1<Boolean> $shouldDisplayDialog$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1$1, reason: invalid class name */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1$1", f = "PaywallDialog.kt", l = {com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle}, m = "invokeSuspend")
    static final class AnonymousClass1 extends j implements p<n0, qd.d<? super i0>, Object> {
        final /* synthetic */ l<CustomerInfo, Boolean> $shouldDisplayBlock;
        final /* synthetic */ k1<Boolean> $shouldDisplayDialog$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super CustomerInfo, Boolean> lVar, k1<Boolean> k1Var, qd.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$shouldDisplayBlock = lVar;
            this.$shouldDisplayDialog$delegate = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new AnonymousClass1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((AnonymousClass1) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k1<Boolean> k1Var;
            Object objE = rd.d.e();
            int i10 = this.label;
            if (i10 == 0) {
                u.b(obj);
                k1<Boolean> k1Var2 = this.$shouldDisplayDialog$delegate;
                l<CustomerInfo, Boolean> lVar = this.$shouldDisplayBlock;
                this.L$0 = k1Var2;
                this.label = 1;
                Object objShouldDisplayPaywall = HelperFunctionsKt.shouldDisplayPaywall(lVar, this);
                if (objShouldDisplayPaywall == objE) {
                    return objE;
                }
                k1Var = k1Var2;
                obj = objShouldDisplayPaywall;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k1Var = (k1) this.L$0;
                u.b(obj);
            }
            PaywallDialogKt.PaywallDialog$lambda$2(k1Var, ((Boolean) obj).booleanValue());
            return i0.f15558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaywallDialogKt$PaywallDialog$1$1(l<? super CustomerInfo, Boolean> lVar, k1<Boolean> k1Var, qd.d<? super PaywallDialogKt$PaywallDialog$1$1> dVar) {
        super(2, dVar);
        this.$shouldDisplayBlock = lVar;
        this.$shouldDisplayDialog$delegate = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
        PaywallDialogKt$PaywallDialog$1$1 paywallDialogKt$PaywallDialog$1$1 = new PaywallDialogKt$PaywallDialog$1$1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, dVar);
        paywallDialogKt$PaywallDialog$1$1.L$0 = obj;
        return paywallDialogKt$PaywallDialog$1$1;
    }

    @Override // zd.p
    public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
        return ((PaywallDialogKt$PaywallDialog$1$1) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(obj);
        k.d((n0) this.L$0, null, null, new AnonymousClass1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, null), 3, null);
        return i0.f15558a;
    }
}
