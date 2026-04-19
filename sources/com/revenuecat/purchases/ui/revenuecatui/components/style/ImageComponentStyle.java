package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.j;
import ae.r;
import b2.k0;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import l1.t1;
import t0.l;
import t0.o;
import w2.d;
import y1.f;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponentStyle implements ComponentStyle {
    public static final Companion Companion = new Companion(null);
    private final f contentScale;
    private final ColorStyle overlay;
    private final t1 shape;
    private final Size size;
    private final ThemeImageUrls themeImageUrls;
    private final boolean visible;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ ImageComponentStyle invoke(boolean z10, Size size, ThemeImageUrls themeImageUrls, t1 t1Var, ColorStyle colorStyle, f fVar, l lVar, int i10) {
            r.f(size, "size");
            r.f(themeImageUrls, "themeImageUrls");
            r.f(fVar, "contentScale");
            lVar.e(1828555240);
            if (o.I()) {
                o.U(1828555240, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle.Companion.invoke (ImageComponentStyle.kt:40)");
            }
            ImageComponentStyle imageComponentStyle = new ImageComponentStyle(z10, themeImageUrls, size, t1Var, colorStyle, fVar, null);
            if (o.I()) {
                o.T();
            }
            lVar.K();
            return imageComponentStyle;
        }
    }

    private ImageComponentStyle(boolean z10, ThemeImageUrls themeImageUrls, Size size, t1 t1Var, ColorStyle colorStyle, f fVar) {
        this.visible = z10;
        this.themeImageUrls = themeImageUrls;
        this.size = size;
        this.shape = t1Var;
        this.overlay = colorStyle;
        this.contentScale = fVar;
    }

    public /* synthetic */ ImageComponentStyle(boolean z10, ThemeImageUrls themeImageUrls, Size size, t1 t1Var, ColorStyle colorStyle, f fVar, j jVar) {
        this(z10, themeImageUrls, size, t1Var, colorStyle, fVar);
    }

    public final /* synthetic */ Size adjustedSize(l lVar, int i10) {
        if (o.I()) {
            o.U(1779047590, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle.adjustedSize (ImageComponentStyle.kt:62)");
        }
        Size sizeAdjustForImage = ImageComponentStyleKt.adjustForImage(this.size, ThemeImageUrlsKt.getUrlsForCurrentTheme(this.themeImageUrls, lVar, 8), (d) lVar.P(k0.c()));
        if (o.I()) {
            o.T();
        }
        return sizeAdjustForImage;
    }

    public final /* synthetic */ f getContentScale() {
        return this.contentScale;
    }

    public final /* synthetic */ ColorStyle getOverlay() {
        return this.overlay;
    }

    public final /* synthetic */ t1 getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getThemeImageUrls() {
        return this.themeImageUrls;
    }

    public final /* synthetic */ boolean getVisible() {
        return this.visible;
    }
}
