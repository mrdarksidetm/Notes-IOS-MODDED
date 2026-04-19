package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import android.content.Context;
import androidx.compose.foundation.layout.d;
import b6.a;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import h6.c;
import j6.h;
import java.io.File;
import m6.a;
import md.i0;
import nd.u;
import o1.c;
import q0.y;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import x5.e;
import xd.k;
import y1.f;
import z5.b;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteImageKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$AsyncImage$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ e $imageLoader;
        final /* synthetic */ h $imageRequest;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ zd.l<b.c.C0495b, i0> $onError;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(ImageSource imageSource, ImageSource imageSource2, h hVar, e eVar, androidx.compose.ui.e eVar2, f fVar, String str, float f10, zd.l<? super b.c.C0495b, i0> lVar, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$imageRequest = hVar;
            this.$imageLoader = eVar;
            this.$modifier = eVar2;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$alpha = f10;
            this.$onError = lVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.AsyncImage(this.$source, this.$placeholderSource, this.$imageRequest, this.$imageLoader, this.$modifier, this.$contentScale, this.$contentDescription, this.$alpha, this.$onError, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$Image$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageSource imageSource, ImageSource imageSource2, androidx.compose.ui.e eVar, f fVar, String str, a aVar, float f10, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$Image$3, reason: invalid class name and case insensitive filesystem */
    static final class C06663 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06663(ImageSource imageSource, ImageSource imageSource2, androidx.compose.ui.e eVar, f fVar, String str, a aVar, float f10, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$ImageForPreviews$1, reason: invalid class name and case insensitive filesystem */
    static final class C06671 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06671(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.ImageForPreviews(this.$modifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$LocalImage$1, reason: invalid class name and case insensitive filesystem */
    static final class C06681 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ int $resource;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06681(int i10, androidx.compose.ui.e eVar, f fVar, String str, a aVar, float f10, int i11, int i12) {
            super(2);
            this.$resource = i10;
            this.$modifier = eVar;
            this.$contentScale = fVar;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$$changed = i11;
            this.$$default = i12;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.LocalImage(this.$resource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$RemoteImage$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ f $contentScale;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ String $placeholderUrlString;
        final /* synthetic */ a $transformation;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, androidx.compose.ui.e eVar, String str2, f fVar, String str3, a aVar, float f10, int i10, int i11) {
            super(2);
            this.$urlString = str;
            this.$modifier = eVar;
            this.$placeholderUrlString = str2;
            this.$contentScale = fVar;
            this.$contentDescription = str3;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            RemoteImageKt.RemoteImage(this.$urlString, this.$modifier, this.$placeholderUrlString, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$getRevenueCatUIImageLoader$1, reason: invalid class name and case insensitive filesystem */
    static final class C06691 extends s implements zd.a<b6.a> {
        final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06691(Context context) {
            super(0);
            this.$this_getRevenueCatUIImageLoader = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final b6.a invoke() {
            a.C0129a c0129a = new a.C0129a();
            File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
            r.e(cacheDir, "cacheDir");
            return c0129a.c(k.k(cacheDir, RemoteImageKt.PAYWALL_IMAGE_CACHE_FOLDER)).d(RemoteImageKt.MAX_CACHE_SIZE_BYTES).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AsyncImage(ImageSource imageSource, ImageSource imageSource2, h hVar, e eVar, androidx.compose.ui.e eVar2, f fVar, String str, float f10, zd.l<? super b.c.C0495b, i0> lVar, l lVar2, int i10, int i11) {
        b bVarD;
        l lVarP = lVar2.p(-1184736889);
        androidx.compose.ui.e eVar3 = (i11 & 16) != 0 ? androidx.compose.ui.e.f2662a : eVar2;
        zd.l<? super b.c.C0495b, i0> lVar3 = (i11 & 256) != 0 ? null : lVar;
        if (o.I()) {
            o.U(-1184736889, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.AsyncImage (RemoteImage.kt:143)");
        }
        lVarP.e(-914927082);
        if (imageSource2 == null) {
            bVarD = null;
        } else {
            Object data = imageSource2.getData();
            lVarP.e(-914926974);
            c cVarD = HelperFunctionsKt.isInPreviewMode(lVarP, 0) ? f2.c.d(R.drawable.f9118android, lVarP, 0) : null;
            lVarP.K();
            bVarD = z5.c.d(data, eVar, cVarD, null, null, null, null, RemoteImageKt$AsyncImage$1$1.INSTANCE, fVar, 0, lVarP, (234881024 & (i10 << 9)) | 12583496, 632);
        }
        lVarP.K();
        lVarP.e(-914927101);
        c cVarD2 = bVarD == null ? HelperFunctionsKt.isInPreviewMode(lVarP, 0) ? f2.c.d(R.drawable.f9118android, lVarP, 0) : null : bVarD;
        lVarP.K();
        lVarP.e(511388516);
        boolean zN = lVarP.N(imageSource) | lVarP.N(lVar3);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new RemoteImageKt$AsyncImage$2$1(imageSource, lVar3);
            lVarP.E(objF);
        }
        lVarP.K();
        zd.l lVar4 = (zd.l) objF;
        int i12 = i10 >> 15;
        z5.a.b(hVar, str, eVar, eVar3, cVarD2, null, null, null, null, lVar4, null, fVar, f10, null, 0, lVarP, 33288 | (i12 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i10 >> 3) & 7168), ((i10 >> 12) & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 896), 26080);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass3(imageSource, imageSource2, hVar, eVar, eVar3, fVar, str, f10, lVar3, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Image(ImageSource imageSource, ImageSource imageSource2, androidx.compose.ui.e eVar, f fVar, String str, m6.a aVar, float f10, l lVar, int i10, int i11) {
        zd.l lVar2;
        int i12;
        int i13;
        l lVarP = lVar.p(-1174250325);
        androidx.compose.ui.e eVar2 = (i11 & 4) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if (o.I()) {
            o.U(-1174250325, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Image (RemoteImage.kt:86)");
        }
        lVarP.e(869450247);
        if (HelperFunctionsKt.isInPreviewMode(lVarP, 0)) {
            ImageForPreviews(eVar2, lVarP, (i10 >> 6) & 14);
            lVarP.K();
            if (o.I()) {
                o.T();
            }
            o2 o2VarV = lVarP.v();
            if (o2VarV == null) {
                return;
            }
            o2VarV.a(new AnonymousClass1(imageSource, imageSource2, eVar2, fVar, str, aVar, f10, i10, i11));
            return;
        }
        lVarP.K();
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar2 = l.f20813a;
        if (objF == aVar2.a()) {
            objF = k3.e(Boolean.TRUE, null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        Context applicationContext = ((Context) lVarP.P(androidx.compose.ui.platform.r.g())).getApplicationContext();
        Boolean boolValueOf = Boolean.valueOf(Image$lambda$2(k1Var));
        lVarP.e(1157296644);
        boolean zN = lVarP.N(boolValueOf);
        Object objF2 = lVarP.f();
        if (zN || objF2 == aVar2.a()) {
            r.e(applicationContext, "applicationContext");
            objF2 = getRevenueCatUIImageLoader(applicationContext, Image$lambda$2(k1Var));
            lVarP.E(objF2);
        }
        lVarP.K();
        e eVar3 = (e) objF2;
        h hVarA = new h.a((Context) lVarP.P(androidx.compose.ui.platform.r.g())).c(imageSource.getData()).b(200).n(u.q(aVar)).a();
        if (Image$lambda$2(k1Var)) {
            lVarP.e(869450834);
            lVarP.e(1157296644);
            boolean zN2 = lVarP.N(k1Var);
            Object objF3 = lVarP.f();
            if (zN2 || objF3 == aVar2.a()) {
                objF3 = new RemoteImageKt$Image$2$1(k1Var);
                lVarP.E(objF3);
            }
            lVarP.K();
            lVar2 = (zd.l) objF3;
            int i14 = i10 << 6;
            i12 = (i10 & 14) | 4608 | (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | ((i10 << 3) & 29360128);
            i13 = 0;
        } else {
            lVarP.e(869451344);
            lVar2 = null;
            int i15 = i10 << 6;
            i12 = (i10 & 14) | 4608 | (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | ((i10 << 3) & 29360128);
            i13 = 256;
        }
        AsyncImage(imageSource, imageSource2, hVarA, eVar3, eVar2, fVar, str, f10, lVar2, lVarP, i12, i13);
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV2 = lVarP.v();
        if (o2VarV2 == null) {
            return;
        }
        o2VarV2.a(new C06663(imageSource, imageSource2, eVar2, fVar, str, aVar, f10, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Image$lambda$2(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Image$lambda$3(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageForPreviews(androidx.compose.ui.e eVar, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(-523416196);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-523416196, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ImageForPreviews (RemoteImage.kt:185)");
            }
            d.a(androidx.compose.foundation.c.d(eVar, y.f18928a.a(lVarP, y.f18929b | 0).w(), null, 2, null), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06671(eVar, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LocalImage(int r20, androidx.compose.ui.e r21, y1.f r22, java.lang.String r23, m6.a r24, float r25, t0.l r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.LocalImage(int, androidx.compose.ui.e, y1.f, java.lang.String, m6.a, float, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteImage(java.lang.String r21, androidx.compose.ui.e r22, java.lang.String r23, y1.f r24, java.lang.String r25, m6.a r26, float r27, t0.l r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.RemoteImage(java.lang.String, androidx.compose.ui.e, java.lang.String, y1.f, java.lang.String, m6.a, float, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e getRevenueCatUIImageLoader(Context context, boolean z10) {
        j6.b bVar = z10 ? j6.b.ENABLED : j6.b.WRITE_ONLY;
        return new e.a(context).c(new C06691(context)).e(new c.a(context).a()).d(bVar).f(bVar).b();
    }
}
