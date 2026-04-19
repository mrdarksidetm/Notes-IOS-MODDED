package com.revenuecat.purchases.ui.revenuecatui.components.image;

import a2.g;
import ae.j;
import ae.r;
import ae.s;
import android.graphics.Color;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import f1.b;
import i1.g;
import java.net.URL;
import l1.j0;
import l1.l0;
import l1.t1;
import l1.z;
import md.i0;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ImageComponentViewKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements p<e, t1, e> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // zd.p
        public final e invoke(e eVar, t1 t1Var) {
            r.f(eVar, "$this$applyIfNotNull");
            r.f(t1Var, "it");
            return g.a(eVar, t1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ImageComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ImageComponentStyle imageComponentStyle, e eVar, int i10, int i11) {
            super(2);
            this.$style = imageComponentStyle;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ImageComponentViewKt.ImageComponentView(this.$style, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_Default$2, reason: invalid class name and case insensitive filesystem */
    static final class C06242 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06242(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_Default(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_LinearGradient$2, reason: invalid class name and case insensitive filesystem */
    static final class C06252 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06252(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_LinearGradient(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_RadialGradient$2, reason: invalid class name and case insensitive filesystem */
    static final class C06262 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06262(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_RadialGradient(lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final /* synthetic */ void ImageComponentView(ImageComponentStyle imageComponentStyle, e eVar, l lVar, int i10, int i11) {
        int i12;
        r.f(imageComponentStyle, "style");
        l lVarP = lVar.p(-1674543892);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(imageComponentStyle) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(-1674543892, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView (ImageComponentView.kt:32)");
            }
            if (imageComponentStyle.getVisible()) {
                ImageUrls urlsForCurrentTheme = ThemeImageUrlsKt.getUrlsForCurrentTheme(imageComponentStyle.getThemeImageUrls(), lVarP, 8);
                String string = urlsForCurrentTheme.getWebp().toString();
                r.e(string, "currentUrls.webp.toString()");
                e eVarSize$default = SizeKt.size$default(eVar, imageComponentStyle.adjustedSize(lVarP, i12 & 14), null, null, 6, null);
                ColorStyle overlay = imageComponentStyle.getOverlay();
                lVarP.e(1157296644);
                boolean zN = lVarP.N(imageComponentStyle);
                Object objF = lVarP.f();
                if (zN || objF == l.f20813a.a()) {
                    objF = new ImageComponentViewKt$ImageComponentView$1$1(imageComponentStyle);
                    lVarP.E(objF);
                }
                lVarP.K();
                RemoteImageKt.RemoteImage(string, ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(eVarSize$default, overlay, (p) objF), imageComponentStyle.getShape(), AnonymousClass2.INSTANCE), urlsForCurrentTheme.getWebpLowRes().toString(), imageComponentStyle.getContentScale(), null, null, 0.0f, lVarP, 0, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            }
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass3(imageComponentStyle, eVar, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageComponentView_Preview_Default(l lVar, int i10) {
        l lVarP = lVar.p(-285181555);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-285181555, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Default (ImageComponentView.kt:52)");
            }
            e eVarD = c.d(e.f2662a, j0.f14524b.h(), null, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarD);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            ImageComponentView(previewImageComponentStyle(null, null, false, null, null, null, lVarP, 0, 63), null, lVarP, 0, 2);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06242(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageComponentView_Preview_LinearGradient(l lVar, int i10) {
        l lVarP = lVar.p(246381111);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(246381111, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_LinearGradient (ImageComponentView.kt:63)");
            }
            e eVarD = c.d(e.f2662a, j0.f14524b.h(), null, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarD);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            ImageComponentView(previewImageComponentStyle(null, null, false, null, null, ColorStyle.Gradient.m110boximpl(ColorStyle.Gradient.m111constructorimpl(z.a.h(z.Companion, new md.s[]{new md.s(Float.valueOf(0.0f), j0.m(l0.b(Color.parseColor("#88FF0000")))), new md.s(Float.valueOf(0.5f), j0.m(l0.b(Color.parseColor("#8800FF00")))), new md.s(Float.valueOf(1.0f), j0.m(l0.b(Color.parseColor("#880000FF"))))}, 0.0f, 0.0f, 0, 14, null))), lVarP, 0, 31), null, lVarP, 0, 2);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06252(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImageComponentView_Preview_RadialGradient(l lVar, int i10) {
        l lVarP = lVar.p(1728211453);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1728211453, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_RadialGradient (ImageComponentView.kt:82)");
            }
            e eVarD = c.d(e.f2662a, j0.f14524b.h(), null, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarD);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            ImageComponentView(previewImageComponentStyle(null, null, false, null, null, ColorStyle.Gradient.m110boximpl(ColorStyle.Gradient.m111constructorimpl(z.a.d(z.Companion, new md.s[]{new md.s(Float.valueOf(0.0f), j0.m(l0.b(Color.parseColor("#88FF0000")))), new md.s(Float.valueOf(0.5f), j0.m(l0.b(Color.parseColor("#8800FF00")))), new md.s(Float.valueOf(1.0f), j0.m(l0.b(Color.parseColor("#880000FF"))))}, 0L, 0.0f, 0, 14, null))), lVarP, 0, 31), null, lVarP, 0, 2);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06262(i10));
    }

    private static final ImageComponentStyle previewImageComponentStyle(URL url, URL url2, boolean z10, Size size, y1.f fVar, ColorStyle colorStyle, l lVar, int i10, int i11) {
        lVar.e(194650685);
        URL url3 = (i11 & 1) != 0 ? new URL("https://sample-videos.com/img/Sample-jpg-image-5mb.jpg") : url;
        URL url4 = (i11 & 2) != 0 ? new URL("https://assets.pawwalls.com/954459_1701163461.jpg") : url2;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Size size2 = (i11 & 8) != 0 ? new Size(new SizeConstraint.Fixed(RCHTTPStatusCodes.BAD_REQUEST, null), SizeConstraint.Fit.INSTANCE) : size;
        y1.f fVarA = (i11 & 16) != 0 ? y1.f.f23237a.a() : fVar;
        ColorStyle colorStyle2 = (i11 & 32) != 0 ? null : colorStyle;
        if (o.I()) {
            o.U(194650685, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageComponentStyle (ImageComponentView.kt:100)");
        }
        float f10 = 20;
        ImageComponentStyle imageComponentStyleInvoke = ImageComponentStyle.Companion.invoke(z11, size2, new ThemeImageUrls(new ImageUrls(url3, url3, url4, 1000, 1000, null), (ImageUrls) null, 2, (j) null), l0.g.d(h.m(f10), h.m(f10), h.m(f10), h.m(f10)), colorStyle2, fVarA, lVar, 1573440 | ((i10 >> 6) & 14) | (57344 & (i10 >> 3)) | ((i10 << 3) & 458752));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return imageComponentStyleInvoke;
    }
}
