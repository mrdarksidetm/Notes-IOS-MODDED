package com.revenuecat.purchases.common.verification;

import ae.r;
import ae.s;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 extends s implements l<md.s<? extends String, ? extends String>, CharSequence> {
    public static final SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 INSTANCE = new SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1();

    SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(md.s<String, String> sVar) {
        r.f(sVar, "it");
        return sVar.c();
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ CharSequence invoke(md.s<? extends String, ? extends String> sVar) {
        return invoke2((md.s<String, String>) sVar);
    }
}
