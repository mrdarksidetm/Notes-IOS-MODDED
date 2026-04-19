package com.revenuecat.purchases.utils;

import ae.j;
import ae.r;
import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z10, CoilImageDownloader coilImageDownloader) {
        r.f(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z10;
        this.coilImageDownloader = coilImageDownloader;
    }

    public /* synthetic */ OfferingImagePreDownloader(boolean z10, CoilImageDownloader coilImageDownloader, int i10, j jVar) {
        this((i10 & 1) != 0 ? true : z10, coilImageDownloader);
    }

    public final void preDownloadOfferingImages(Offering offering) {
        r.f(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_defaultsRelease = paywall.getConfig().getImages().getAll$purchases_defaultsRelease();
            ArrayList<Uri> arrayList = new ArrayList(v.x(all$purchases_defaultsRelease, 10));
            Iterator<T> it = all$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri uri : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading paywall image: " + uri);
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                r.e(uri, "it");
                coilImageDownloader.downloadImage(uri);
            }
        }
    }
}
