package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import f1.b;
import md.q;
import u2.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AlignmentKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr3[TwoDimensionalAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TwoDimensionalAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final /* synthetic */ b.InterfaceC0266b toAlignment(HorizontalAlignment horizontalAlignment) {
        r.f(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return b.f11020a.k();
        }
        if (i10 == 2) {
            return b.f11020a.g();
        }
        if (i10 == 3) {
            return b.f11020a.j();
        }
        throw new q();
    }

    public static final /* synthetic */ b.c toAlignment(VerticalAlignment verticalAlignment) {
        r.f(verticalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[verticalAlignment.ordinal()];
        if (i10 == 1) {
            return b.f11020a.l();
        }
        if (i10 == 2) {
            return b.f11020a.i();
        }
        if (i10 == 3) {
            return b.f11020a.a();
        }
        throw new q();
    }

    public static final /* synthetic */ b toAlignment(TwoDimensionalAlignment twoDimensionalAlignment) {
        r.f(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return b.f11020a.e();
            case 2:
                return b.f11020a.h();
            case 3:
                return b.f11020a.f();
            case 4:
                return b.f11020a.m();
            case 5:
                return b.f11020a.b();
            case 6:
                return b.f11020a.o();
            case 7:
                return b.f11020a.n();
            case 8:
                return b.f11020a.d();
            case 9:
                return b.f11020a.c();
            default:
                throw new q();
        }
    }

    public static final /* synthetic */ b.InterfaceC0266b toHorizontalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        r.f(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return b.f11020a.g();
            case 2:
            case 6:
            case 8:
                return b.f11020a.k();
            case 3:
            case 7:
            case 9:
                return b.f11020a.j();
            case 4:
            case 5:
                return null;
            default:
                throw new q();
        }
    }

    public static final /* synthetic */ int toTextAlign(HorizontalAlignment horizontalAlignment) {
        r.f(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return i.f21560b.f();
        }
        if (i10 == 2) {
            return i.f21560b.a();
        }
        if (i10 == 3) {
            return i.f21560b.b();
        }
        throw new q();
    }

    public static final /* synthetic */ b.c toVerticalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        r.f(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return b.f11020a.i();
            case 2:
            case 3:
                return null;
            case 4:
            case 6:
            case 7:
                return b.f11020a.l();
            case 5:
            case 8:
            case 9:
                return b.f11020a.a();
            default:
                throw new q();
        }
    }
}
