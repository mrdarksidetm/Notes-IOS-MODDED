package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.j;
import ae.r;
import androidx.lifecycle.w;
import androidx.lifecycle.y;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import q0.h;
import q4.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallViewModelFactory extends y.c {
    private final h colorScheme;
    private final boolean isDarkMode;
    private final PaywallOptions options;
    private final boolean preview;
    private final ResourceProvider resourceProvider;
    private final l<CustomerInfo, Boolean> shouldDisplayBlock;

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions paywallOptions, h hVar, boolean z10, l<? super CustomerInfo, Boolean> lVar, boolean z11) {
        r.f(resourceProvider, "resourceProvider");
        r.f(paywallOptions, "options");
        r.f(hVar, "colorScheme");
        this.resourceProvider = resourceProvider;
        this.options = paywallOptions;
        this.colorScheme = hVar;
        this.isDarkMode = z10;
        this.shouldDisplayBlock = lVar;
        this.preview = z11;
    }

    public /* synthetic */ PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions paywallOptions, h hVar, boolean z10, l lVar, boolean z11, int i10, j jVar) {
        this(resourceProvider, paywallOptions, hVar, z10, lVar, (i10 & 32) != 0 ? false : z11);
    }

    @Override // androidx.lifecycle.y.c, androidx.lifecycle.y.b
    public <T extends w> T create(Class<T> cls) {
        r.f(cls, "modelClass");
        return new PaywallViewModelImpl(this.resourceProvider, null, this.options, this.colorScheme, this.isDarkMode, this.shouldDisplayBlock, this.preview, 2, null);
    }

    @Override // androidx.lifecycle.y.b
    public /* bridge */ /* synthetic */ w create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }
}
