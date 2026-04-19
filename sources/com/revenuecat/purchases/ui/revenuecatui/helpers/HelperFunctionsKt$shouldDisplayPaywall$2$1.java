package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.o;
import md.i0;
import md.t;
import qd.d;
import qd.f;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
/* synthetic */ class HelperFunctionsKt$shouldDisplayPaywall$2$1 extends o implements l<Boolean, i0> {
    HelperFunctionsKt$shouldDisplayPaywall$2$1(Object obj) {
        super(1, obj, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return i0.f15558a;
    }

    public final void invoke(boolean z10) {
        ((d) this.receiver).resumeWith(t.b(Boolean.valueOf(z10)));
    }
}
