package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import ae.r;
import androidx.compose.foundation.c;
import androidx.compose.ui.draw.d;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import i1.g;
import l1.m1;
import l1.t1;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BackgroundKt {
    public static final /* synthetic */ e background(e eVar, BackgroundStyle backgroundStyle, t1 t1Var) {
        r.f(eVar, "<this>");
        r.f(backgroundStyle, "background");
        r.f(t1Var, "shape");
        if (backgroundStyle instanceof BackgroundStyle.Color) {
            return eVar.h(background(eVar, ((BackgroundStyle.Color) backgroundStyle).m98unboximpl(), t1Var));
        }
        if (backgroundStyle instanceof BackgroundStyle.Image) {
            return eVar.h(d.b(eVar, ((BackgroundStyle.Image) backgroundStyle).m105unboximpl(), false, null, null, 0.0f, null, 62, null)).h(g.a(eVar, t1Var));
        }
        throw new q();
    }

    public static final /* synthetic */ e background(e eVar, ColorStyle colorStyle, t1 t1Var) {
        e eVarA;
        r.f(eVar, "<this>");
        r.f(colorStyle, "color");
        r.f(t1Var, "shape");
        if (colorStyle instanceof ColorStyle.Solid) {
            eVarA = c.c(eVar, ((ColorStyle.Solid) colorStyle).m124unboximpl(), t1Var);
        } else {
            if (!(colorStyle instanceof ColorStyle.Gradient)) {
                throw new q();
            }
            eVarA = c.a(eVar, ((ColorStyle.Gradient) colorStyle).m116unboximpl(), t1Var, 1.0f);
        }
        return eVar.h(eVarA);
    }

    public static /* synthetic */ e background$default(e eVar, BackgroundStyle backgroundStyle, t1 t1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        return background(eVar, backgroundStyle, t1Var);
    }

    public static /* synthetic */ e background$default(e eVar, ColorStyle colorStyle, t1 t1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        return background(eVar, colorStyle, t1Var);
    }
}
