package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.r;
import ae.s;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.e;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ColorSchemeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.f;
import k1.g;
import l1.j0;
import l1.l0;
import l1.q1;
import l1.x1;
import l1.z;
import md.i0;
import md.q;
import md.x;
import nd.v;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.h;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorStyleKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Rectangle$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ColorStyleKt.LinearGradient_Preview_Rectangle(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Square$1, reason: invalid class name and case insensitive filesystem */
    static final class C06461 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06461(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ColorStyleKt.LinearGradient_Preview_Square(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinearGradient_Preview_Rectangle(l lVar, int i10) {
        l lVarP = lVar.p(-2011369738);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-2011369738, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Rectangle (ColorStyle.kt:197)");
            }
            e eVarM = androidx.compose.foundation.layout.p.m(e.f2662a, h.m(RCHTTPStatusCodes.UNSUCCESSFUL), h.m(100));
            Float fValueOf = Float.valueOf(0.0f);
            j0.a aVar = j0.f14524b;
            d.a(c.b(eVarM, m126relativeLinearGradient3YTHUZs$default(new md.s[]{x.a(fValueOf, j0.m(aVar.l())), x.a(Float.valueOf(0.5f), j0.m(aVar.h())), x.a(Float.valueOf(1.0f), j0.m(aVar.b()))}, 45.0f, 0, 4, null), null, 0.0f, 6, null), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinearGradient_Preview_Square(l lVar, int i10) {
        l lVarP = lVar.p(1721100010);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1721100010, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Square (ColorStyle.kt:177)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(200));
            Float fValueOf = Float.valueOf(0.0f);
            j0.a aVar = j0.f14524b;
            d.a(c.b(eVarL, m126relativeLinearGradient3YTHUZs$default(new md.s[]{x.a(fValueOf, j0.m(aVar.l())), x.a(Float.valueOf(0.5f), j0.m(aVar.h())), x.a(Float.valueOf(1.0f), j0.m(aVar.b()))}, 45.0f, 0, 4, null), null, 0.0f, 6, null), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06461(i10));
    }

    private static final long RelativeEndOffset(float f10) {
        double radians = Math.toRadians(f10);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double dMax = Math.max(Math.abs(dCos), Math.abs(dSin));
        double d10 = dCos / dMax;
        double d11 = dSin / dMax;
        double d12 = 1;
        double d13 = 2.0f;
        return g.a((float) ((d10 + d12) / d13), (float) ((d12 - d11) / d13));
    }

    /* JADX INFO: renamed from: relativeLinearGradient-3YTHUZs, reason: not valid java name */
    private static final q1 m125relativeLinearGradient3YTHUZs(md.s<Float, j0>[] sVarArr, float f10, int i10) {
        long jRelativeEndOffset = RelativeEndOffset(f10);
        return m127relativeLinearGradientmHitzGk((md.s[]) Arrays.copyOf(sVarArr, sVarArr.length), f.s(g.a(1.0f, 1.0f), jRelativeEndOffset), jRelativeEndOffset, i10);
    }

    /* JADX INFO: renamed from: relativeLinearGradient-3YTHUZs$default, reason: not valid java name */
    static /* synthetic */ q1 m126relativeLinearGradient3YTHUZs$default(md.s[] sVarArr, float f10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = x1.f14638a.a();
        }
        return m125relativeLinearGradient3YTHUZs(sVarArr, f10, i10);
    }

    /* JADX INFO: renamed from: relativeLinearGradient-mHitzGk, reason: not valid java name */
    private static final q1 m127relativeLinearGradientmHitzGk(md.s<Float, j0>[] sVarArr, long j10, long j11, int i10) {
        ArrayList arrayList = new ArrayList(sVarArr.length);
        for (md.s<Float, j0> sVar : sVarArr) {
            arrayList.add(j0.m(sVar.d().E()));
        }
        ArrayList arrayList2 = new ArrayList(sVarArr.length);
        for (md.s<Float, j0> sVar2 : sVarArr) {
            arrayList2.add(Float.valueOf(sVar2.c().floatValue()));
        }
        return new RelativeLinearGradient(arrayList, arrayList2, j10, j11, i10, null);
    }

    /* JADX INFO: renamed from: relativeLinearGradient-mHitzGk$default, reason: not valid java name */
    static /* synthetic */ q1 m128relativeLinearGradientmHitzGk$default(md.s[] sVarArr, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = x1.f14638a.a();
        }
        return m127relativeLinearGradientmHitzGk(sVarArr, j10, j11, i10);
    }

    public static final /* synthetic */ ColorStyle rememberColorStyle(ColorScheme colorScheme, l lVar, int i10) {
        r.f(colorScheme, "scheme");
        lVar.e(-1423695357);
        if (o.I()) {
            o.U(-1423695357, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberColorStyle (ColorStyle.kt:43)");
        }
        ColorInfo colorsForCurrentTheme = ColorSchemeKt.getColorsForCurrentTheme(colorScheme, lVar, 8);
        lVar.e(1157296644);
        boolean zN = lVar.N(colorsForCurrentTheme);
        Object objF = lVar.f();
        if (zN || objF == l.f20813a.a()) {
            objF = toColorStyle(colorsForCurrentTheme);
            lVar.E(objF);
        }
        lVar.K();
        ColorStyle colorStyle = (ColorStyle) objF;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return colorStyle;
    }

    private static final md.s<Float, j0>[] toColorStops(List<ColorInfo.Gradient.Point> list) {
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        for (ColorInfo.Gradient.Point point : list) {
            arrayList.add(x.a(Float.valueOf(point.getPercent()), j0.m(l0.b(point.getColor()))));
        }
        return (md.s[]) arrayList.toArray(new md.s[0]);
    }

    public static final /* synthetic */ ColorStyle toColorStyle(ColorInfo colorInfo) {
        z zVarD;
        r.f(colorInfo, "<this>");
        if (colorInfo instanceof ColorInfo.Alias) {
            throw new md.r("An operation is not implemented: Color aliases are not yet implemented.");
        }
        if (colorInfo instanceof ColorInfo.Hex) {
            return ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(l0.b(((ColorInfo.Hex) colorInfo).getValue())));
        }
        if (!(colorInfo instanceof ColorInfo.Gradient)) {
            throw new q();
        }
        if (colorInfo instanceof ColorInfo.Gradient.Linear) {
            ColorInfo.Gradient.Linear linear = (ColorInfo.Gradient.Linear) colorInfo;
            md.s<Float, j0>[] colorStops = toColorStops(linear.getPoints());
            zVarD = m126relativeLinearGradient3YTHUZs$default((md.s[]) Arrays.copyOf(colorStops, colorStops.length), linear.getDegrees(), 0, 4, null);
        } else {
            if (!(colorInfo instanceof ColorInfo.Gradient.Radial)) {
                throw new q();
            }
            z.a aVar = z.Companion;
            md.s<Float, j0>[] colorStops2 = toColorStops(((ColorInfo.Gradient.Radial) colorInfo).getPoints());
            zVarD = z.a.d(aVar, (md.s[]) Arrays.copyOf(colorStops2, colorStops2.length), 0L, 0.0f, 0, 14, null);
        }
        return ColorStyle.Gradient.m110boximpl(ColorStyle.Gradient.m111constructorimpl(zVarD));
    }

    public static final /* synthetic */ ColorStyle toColorStyle(ColorScheme colorScheme, l lVar, int i10) {
        r.f(colorScheme, "<this>");
        lVar.e(-1531771135);
        if (o.I()) {
            o.U(-1531771135, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.toColorStyle (ColorStyle.kt:50)");
        }
        ColorStyle colorStyle = toColorStyle(ColorSchemeKt.getColorsForCurrentTheme(colorScheme, lVar, 8));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return colorStyle;
    }
}
