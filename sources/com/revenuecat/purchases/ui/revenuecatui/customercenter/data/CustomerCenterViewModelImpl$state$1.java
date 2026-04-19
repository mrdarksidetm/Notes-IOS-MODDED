package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import md.i0;
import md.u;
import oe.f;
import sd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModelImpl$state$1", f = "CustomerCenterViewModel.kt", l = {28, 29, 31}, m = "invokeSuspend")
final class CustomerCenterViewModelImpl$state$1 extends j implements p<f<? super CustomerCenterState>, qd.d<? super i0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterViewModelImpl$state$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, qd.d<? super CustomerCenterViewModelImpl$state$1> dVar) {
        super(2, dVar);
        this.this$0 = customerCenterViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
        CustomerCenterViewModelImpl$state$1 customerCenterViewModelImpl$state$1 = new CustomerCenterViewModelImpl$state$1(this.this$0, dVar);
        customerCenterViewModelImpl$state$1.L$0 = obj;
        return customerCenterViewModelImpl$state$1;
    }

    @Override // zd.p
    public final Object invoke(f<? super CustomerCenterState> fVar, qd.d<? super i0> dVar) {
        return ((CustomerCenterViewModelImpl$state$1) create(fVar, dVar)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, oe.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        f fVar;
        Object objE = rd.d.e();
        ?? r12 = this.label;
        try {
        } catch (PurchasesException e10) {
            CustomerCenterState.Error error = new CustomerCenterState.Error(e10.getError());
            this.L$0 = null;
            this.label = 3;
            if (r12.b(error, this) == objE) {
                return objE;
            }
        }
        if (r12 == 0) {
            u.b(obj);
            fVar = (f) this.L$0;
            PurchasesType purchasesType = this.this$0.purchases;
            this.L$0 = fVar;
            this.label = 1;
            obj = purchasesType.awaitCustomerCenterConfigData(this);
            if (obj == objE) {
                return objE;
            }
        } else {
            if (r12 != 1) {
                if (r12 == 2) {
                    u.b(obj);
                } else {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
            fVar = (f) this.L$0;
            u.b(obj);
        }
        CustomerCenterState.Success success = new CustomerCenterState.Success(((CustomerCenterConfigData) obj).toString());
        this.L$0 = fVar;
        this.label = 2;
        if (fVar.b(success, this) == objE) {
            return objE;
        }
        return i0.f15558a;
    }
}
