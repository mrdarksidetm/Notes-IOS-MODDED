package com.revenuecat.purchases.ui.revenuecatui.composables;

import md.i0;
import md.u;
import sd.d;
import sd.i;
import sd.j;
import v1.c;
import v1.k0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1", f = "DisableTouchesComposable.kt", l = {22}, m = "invokeSuspend")
final class DisableTouchesComposableKt$DisableTouchesComposable$1$1 extends j implements p<k0, qd.d<? super i0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1$1, reason: invalid class name */
    @d(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1$1", f = "DisableTouchesComposable.kt", l = {24}, m = "invokeSuspend")
    static final class AnonymousClass1 extends i implements p<c, qd.d<? super i0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(qd.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // zd.p
        public final Object invoke(c cVar, qd.d<? super i0> dVar) {
            return ((AnonymousClass1) create(cVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            c cVar;
            Object objE = rd.d.e();
            int i10 = this.label;
            if (i10 == 0) {
                u.b(obj);
                cVar = (c) this.L$0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) this.L$0;
                u.b(obj);
            }
            do {
                this.L$0 = cVar;
                this.label = 1;
            } while (c.G(cVar, null, this, 1, null) != objE);
            return objE;
        }
    }

    DisableTouchesComposableKt$DisableTouchesComposable$1$1(qd.d<? super DisableTouchesComposableKt$DisableTouchesComposable$1$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
        DisableTouchesComposableKt$DisableTouchesComposable$1$1 disableTouchesComposableKt$DisableTouchesComposable$1$1 = new DisableTouchesComposableKt$DisableTouchesComposable$1$1(dVar);
        disableTouchesComposableKt$DisableTouchesComposable$1$1.L$0 = obj;
        return disableTouchesComposableKt$DisableTouchesComposable$1$1;
    }

    @Override // zd.p
    public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
        return ((DisableTouchesComposableKt$DisableTouchesComposable$1$1) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = rd.d.e();
        int i10 = this.label;
        if (i10 == 0) {
            u.b(obj);
            k0 k0Var = (k0) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (k0Var.B0(anonymousClass1, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f15558a;
    }
}
