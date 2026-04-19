package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import androidx.compose.ui.e;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class ModifierExtensionsKt {
    public static final <T> e applyIfNotNull(e eVar, T t10, p<? super e, ? super T, ? extends e> pVar) {
        r.f(eVar, "<this>");
        r.f(pVar, "modifier");
        return t10 != null ? eVar.h(pVar.invoke(e.f2662a, t10)) : eVar;
    }

    public static final e conditional(e eVar, boolean z10, l<? super e, ? extends e> lVar) {
        r.f(eVar, "<this>");
        r.f(lVar, "modifier");
        return z10 ? eVar.h(lVar.invoke(e.f2662a)) : eVar;
    }
}
