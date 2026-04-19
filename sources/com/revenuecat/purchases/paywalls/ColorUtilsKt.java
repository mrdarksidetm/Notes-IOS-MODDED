package com.revenuecat.purchases.paywalls;

import ae.r;
import android.graphics.Color;
import je.b;
import je.h;
import je.j;
import je.v;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorUtilsKt {
    private static final j rgbaColorRegex = new j("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static final int parseRGBAColor(String str) {
        r.f(str, "stringRepresentation");
        h hVarD = rgbaColorRegex.d(str);
        if (hVarD == null) {
            return Color.parseColor(str);
        }
        h.b bVarA = hVarD.a();
        boolean z10 = true;
        String str2 = bVarA.a().b().get(1);
        String str3 = bVarA.a().b().get(2);
        String str4 = bVarA.a().b().get(3);
        Object objB0 = c0.b0(hVarD.b(), 4);
        String str5 = (String) objB0;
        if (str5 != null && !v.v(str5)) {
            z10 = false;
        }
        if (z10) {
            objB0 = null;
        }
        String str6 = (String) objB0;
        if (str6 == null) {
            str6 = "FF";
        }
        return colorInt(Integer.parseInt(str6, b.a(16)), Integer.parseInt(str2, b.a(16)), Integer.parseInt(str3, b.a(16)), Integer.parseInt(str4, b.a(16)));
    }
}
