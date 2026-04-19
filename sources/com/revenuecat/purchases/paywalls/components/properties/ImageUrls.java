package com.revenuecat.purchases.paywalls.components.properties;

import ae.j;
import ae.r;
import af.j1;
import af.v1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import md.a0;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ImageUrls {
    public static final Companion Companion = new Companion(null);
    private final int height;
    private final URL original;
    private final URL webp;
    private final URL webpLowRes;
    private final int width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ImageUrls> serializer() {
            return ImageUrls$$serializer.INSTANCE;
        }
    }

    private ImageUrls(int i10, URL url, URL url2, URL url3, a0 a0Var, a0 a0Var2, j1 j1Var) {
        if (31 != (i10 & 31)) {
            z0.a(i10, 31, ImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = a0Var.l();
        this.height = a0Var2.l();
    }

    public /* synthetic */ ImageUrls(int i10, URL url, URL url2, URL url3, a0 a0Var, a0 a0Var2, j1 j1Var, j jVar) {
        this(i10, url, url2, url3, a0Var, a0Var2, j1Var);
    }

    private ImageUrls(URL url, URL url2, URL url3, int i10, int i11) {
        r.f(url, "original");
        r.f(url2, "webp");
        r.f(url3, "webpLowRes");
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = i10;
        this.height = i11;
    }

    public /* synthetic */ ImageUrls(URL url, URL url2, URL url3, int i10, int i11, j jVar) {
        this(url, url2, url3, i10, i11);
    }

    public static /* synthetic */ void getOriginal$annotations() {
    }

    public static /* synthetic */ void getWebp$annotations() {
    }

    public static /* synthetic */ void getWebpLowRes$annotations() {
    }

    public static final /* synthetic */ void write$Self(ImageUrls imageUrls, d dVar, f fVar) {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        dVar.E(fVar, 0, uRLSerializer, imageUrls.original);
        dVar.E(fVar, 1, uRLSerializer, imageUrls.webp);
        dVar.E(fVar, 2, uRLSerializer, imageUrls.webpLowRes);
        v1 v1Var = v1.f840a;
        dVar.E(fVar, 3, v1Var, a0.a(imageUrls.width));
        dVar.E(fVar, 4, v1Var, a0.a(imageUrls.height));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrls)) {
            return false;
        }
        ImageUrls imageUrls = (ImageUrls) obj;
        return r.b(this.original, imageUrls.original) && r.b(this.webp, imageUrls.webp) && r.b(this.webpLowRes, imageUrls.webpLowRes) && this.width == imageUrls.width && this.height == imageUrls.height;
    }

    /* JADX INFO: renamed from: getHeight-pVg5ArA, reason: not valid java name */
    public final /* synthetic */ int m72getHeightpVg5ArA() {
        return this.height;
    }

    public final /* synthetic */ URL getOriginal() {
        return this.original;
    }

    public final /* synthetic */ URL getWebp() {
        return this.webp;
    }

    public final /* synthetic */ URL getWebpLowRes() {
        return this.webpLowRes;
    }

    /* JADX INFO: renamed from: getWidth-pVg5ArA, reason: not valid java name */
    public final /* synthetic */ int m73getWidthpVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.original.hashCode() * 31) + this.webp.hashCode()) * 31) + this.webpLowRes.hashCode()) * 31) + a0.i(this.width)) * 31) + a0.i(this.height);
    }

    public String toString() {
        return "ImageUrls(original=" + this.original + ", webp=" + this.webp + ", webpLowRes=" + this.webpLowRes + ", width=" + ((Object) a0.j(this.width)) + ", height=" + ((Object) a0.j(this.height)) + ')';
    }
}
