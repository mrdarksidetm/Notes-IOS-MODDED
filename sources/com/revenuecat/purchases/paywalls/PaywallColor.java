package com.revenuecat.purchases.paywalls;

import ae.m0;
import ae.r;
import android.graphics.Color;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import we.b;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallColor {
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    public static final class Serializer implements b<PaywallColor> {
        public static final Serializer INSTANCE = new Serializer();
        private static final f descriptor = i.a("PaywallColor", e.i.f23987a);

        private Serializer() {
        }

        @Override // we.a
        public PaywallColor deserialize(ze.e eVar) {
            r.f(eVar, "decoder");
            return new PaywallColor(eVar.s());
        }

        @Override // we.b, we.h, we.a
        public f getDescriptor() {
            return descriptor;
        }

        @Override // we.h
        public void serialize(ze.f fVar, PaywallColor paywallColor) {
            r.f(fVar, "encoder");
            r.f(paywallColor, "value");
            fVar.F(paywallColor.toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallColor(int i10) {
        m0 m0Var = m0.f720a;
        String str = String.format(Locale.US, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i10)}, 1));
        r.e(str, "format(locale, format, *args)");
        this(str, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(i10) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallColor(String str) {
        this(str, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(ColorUtilsKt.parseRGBAColor(str)) : null);
        r.f(str, "stringRepresentation");
    }

    public PaywallColor(String str, Color color) {
        r.f(str, "stringRepresentation");
        this.stringRepresentation = str;
        this.underlyingColor = color;
        this.colorInt = ColorUtilsKt.parseRGBAColor(str);
    }

    public static /* synthetic */ PaywallColor copy$default(PaywallColor paywallColor, String str, Color color, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallColor.stringRepresentation;
        }
        if ((i10 & 2) != 0) {
            color = paywallColor.underlyingColor;
        }
        return paywallColor.copy(str, color);
    }

    public final String component1() {
        return this.stringRepresentation;
    }

    public final Color component2() {
        return this.underlyingColor;
    }

    public final PaywallColor copy(String str, Color color) {
        r.f(str, "stringRepresentation");
        return new PaywallColor(str, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) obj;
        return r.b(this.stringRepresentation, paywallColor.stringRepresentation) && r.b(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int iHashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }
}
