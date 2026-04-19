package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f7778b = "purchase_updates";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f7779c;

    b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z10) {
        super(cVar, f7778b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f7779c = z10;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        super.e();
        a(com.amazon.a.a.o.b.f7428b, this.f7779c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
        a(com.amazon.a.a.o.b.f7424ac, Boolean.valueOf(com.amazon.device.iap.internal.d.f().d()));
    }
}
