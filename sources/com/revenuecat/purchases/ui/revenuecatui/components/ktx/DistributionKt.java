package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import f1.b;
import h0.b;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DistributionKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlexDistribution.values().length];
            try {
                iArr[FlexDistribution.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlexDistribution.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlexDistribution.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlexDistribution.SPACE_BETWEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlexDistribution.SPACE_AROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlexDistribution.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: toHorizontalArrangement-3ABfNKs, reason: not valid java name */
    public static final /* synthetic */ b.e m86toHorizontalArrangement3ABfNKs(FlexDistribution flexDistribution, float f10) {
        b bVar;
        b.InterfaceC0266b interfaceC0266bK;
        r.f(flexDistribution, "$this$toHorizontalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[flexDistribution.ordinal()]) {
            case 1:
                bVar = h0.b.f11594a;
                interfaceC0266bK = f1.b.f11020a.k();
                break;
            case 2:
                bVar = h0.b.f11594a;
                interfaceC0266bK = f1.b.f11020a.j();
                break;
            case 3:
                bVar = h0.b.f11594a;
                interfaceC0266bK = f1.b.f11020a.g();
                break;
            case 4:
                return h0.b.f11594a.e();
            case 5:
                return h0.b.f11594a.d();
            case 6:
                return h0.b.f11594a.f();
            default:
                throw new q();
        }
        return bVar.p(f10, interfaceC0266bK);
    }

    /* JADX INFO: renamed from: toVerticalArrangement-3ABfNKs, reason: not valid java name */
    public static final /* synthetic */ b.m m87toVerticalArrangement3ABfNKs(FlexDistribution flexDistribution, float f10) {
        h0.b bVar;
        b.c cVarL;
        r.f(flexDistribution, "$this$toVerticalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[flexDistribution.ordinal()]) {
            case 1:
                bVar = h0.b.f11594a;
                cVarL = f1.b.f11020a.l();
                break;
            case 2:
                bVar = h0.b.f11594a;
                cVarL = f1.b.f11020a.a();
                break;
            case 3:
                bVar = h0.b.f11594a;
                cVarL = f1.b.f11020a.i();
                break;
            case 4:
                return h0.b.f11594a.e();
            case 5:
                return h0.b.f11594a.d();
            case 6:
                return h0.b.f11594a.f();
            default:
                throw new q();
        }
        return bVar.q(f10, cVarL);
    }
}
