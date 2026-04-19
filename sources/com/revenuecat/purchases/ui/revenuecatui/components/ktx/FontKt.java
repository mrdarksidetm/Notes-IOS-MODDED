package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import i2.g0;
import md.q;
import n2.i0;
import q0.r0;
import q0.y;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FontKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FontWeight.values().length];
            try {
                iArr[FontWeight.EXTRA_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeight.THIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FontWeight.REGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FontWeight.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FontWeight.SEMI_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FontWeight.BOLD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FontWeight.EXTRA_BOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FontWeight.BLACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FontSize.values().length];
            try {
                iArr2[FontSize.HEADING_XXL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FontSize.HEADING_XL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FontSize.HEADING_L.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FontSize.HEADING_M.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FontSize.HEADING_S.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[FontSize.HEADING_XS.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FontSize.BODY_XL.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FontSize.BODY_L.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[FontSize.BODY_M.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[FontSize.BODY_S.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ i0 toFontWeight(FontWeight fontWeight) {
        r.f(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) {
            case 1:
                return i0.f15808b.d();
            case 2:
                return i0.f15808b.i();
            case 3:
                return i0.f15808b.e();
            case 4:
                return i0.f15808b.g();
            case 5:
                return i0.f15808b.f();
            case 6:
                return i0.f15808b.h();
            case 7:
                return i0.f15808b.b();
            case 8:
                return i0.f15808b.c();
            case 9:
                return i0.f15808b.a();
            default:
                throw new q();
        }
    }

    public static final /* synthetic */ long toTextUnit(FontSize fontSize, l lVar, int i10) {
        g0 g0VarE;
        r.f(fontSize, "<this>");
        lVar.e(481610376);
        if (o.I()) {
            o.U(481610376, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.toTextUnit (Font.kt:27)");
        }
        r0 r0VarC = y.f18928a.c(lVar, y.f18929b | 0);
        switch (WhenMappings.$EnumSwitchMapping$1[fontSize.ordinal()]) {
            case 1:
                g0VarE = r0VarC.e();
                break;
            case 2:
                g0VarE = r0VarC.f();
                break;
            case 3:
                g0VarE = r0VarC.g();
                break;
            case 4:
                g0VarE = r0VarC.h();
                break;
            case 5:
                g0VarE = r0VarC.i();
                break;
            case 6:
                g0VarE = r0VarC.j();
                break;
            case 7:
                g0VarE = r0VarC.n();
                break;
            case 8:
                g0VarE = r0VarC.b();
                break;
            case 9:
                g0VarE = r0VarC.c();
                break;
            case 10:
                g0VarE = r0VarC.d();
                break;
            default:
                throw new q();
        }
        long jN = g0VarE.n();
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return jN;
    }
}
