package com.revenuecat.purchases.common;

import ae.r;
import androidx.core.os.c;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLocaleProvider implements LocaleProvider {
    @Override // com.revenuecat.purchases.common.LocaleProvider
    public String getCurrentLocalesLanguageTags() {
        String strH = c.d().h();
        r.e(strH, "getDefault().toLanguageTags()");
        return strH;
    }
}
