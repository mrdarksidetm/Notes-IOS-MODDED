package com.revenuecat.purchases.ui.revenuecatui.helpers;

import be.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class NonEmptyListKt$toNonEmptyListOrNull$$inlined$Iterable$1 implements Iterable, a {
    final /* synthetic */ Iterator $iterator$inlined;

    public NonEmptyListKt$toNonEmptyListOrNull$$inlined$Iterable$1(Iterator it) {
        this.$iterator$inlined = it;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.$iterator$inlined;
    }
}
