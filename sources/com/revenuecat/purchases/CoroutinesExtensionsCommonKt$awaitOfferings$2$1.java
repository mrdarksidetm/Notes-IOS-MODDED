package com.revenuecat.purchases;

import ae.o;
import ae.r;
import md.i0;
import md.t;
import qd.d;
import qd.f;
import zd.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class CoroutinesExtensionsCommonKt$awaitOfferings$2$1 extends o implements l<Offerings, i0> {
    CoroutinesExtensionsCommonKt$awaitOfferings$2$1(Object obj) {
        super(1, obj, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
        invoke2(offerings);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Offerings offerings) {
        r.f(offerings, "p0");
        ((d) this.receiver).resumeWith(t.b(offerings));
    }
}
