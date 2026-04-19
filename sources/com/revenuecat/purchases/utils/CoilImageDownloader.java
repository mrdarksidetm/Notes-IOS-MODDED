package com.revenuecat.purchases.utils;

import ae.r;
import android.content.Context;
import android.net.Uri;
import j6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context context) {
        r.f(context, "applicationContext");
        this.applicationContext = context;
    }

    public final void downloadImage(Uri uri) {
        r.f(uri, "uri");
        CoilImageDownloaderKt.getRevenueCatUIImageLoader(this.applicationContext).b(new h.a(this.applicationContext).c(uri).a());
    }
}
