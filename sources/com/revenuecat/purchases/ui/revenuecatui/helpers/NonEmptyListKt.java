package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.r;
import java.util.Iterator;
import nd.c0;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NonEmptyListKt {
    public static final /* synthetic */ NonEmptyList nonEmptyListOf(Object obj, Object... objArr) {
        r.f(objArr, "t");
        return new NonEmptyList(obj, p.E0(objArr));
    }

    public static final /* synthetic */ NonEmptyList toNonEmptyListOrNull(Iterable iterable) {
        r.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return new NonEmptyList(it.next(), c0.C0(new NonEmptyListKt$toNonEmptyListOrNull$$inlined$Iterable$1(it)));
        }
        return null;
    }
}
