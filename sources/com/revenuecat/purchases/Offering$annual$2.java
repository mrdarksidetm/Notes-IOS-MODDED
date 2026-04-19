package com.revenuecat.purchases;

import ae.s;

/* JADX INFO: loaded from: classes2.dex */
final class Offering$annual$2 extends s implements zd.a<Package> {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Offering$annual$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.a
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.ANNUAL);
    }
}
