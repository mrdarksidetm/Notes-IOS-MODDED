package com.revenuecat.purchases.utils;

import ae.r;
import ae.s;
import android.content.Context;
import b6.a;
import java.io.File;
import x5.e;
import xd.k;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CoilImageDownloaderKt$getRevenueCatUIImageLoader$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<b6.a> {
        final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$this_getRevenueCatUIImageLoader = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final b6.a invoke() {
            a.C0129a c0129a = new a.C0129a();
            File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
            r.e(cacheDir, "cacheDir");
            return c0129a.c(k.k(cacheDir, CoilImageDownloaderKt.PAYWALL_IMAGE_CACHE_FOLDER)).d(CoilImageDownloaderKt.MAX_CACHE_SIZE_BYTES).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e getRevenueCatUIImageLoader(Context context) {
        return new e.a(context).c(new AnonymousClass1(context)).b();
    }
}
