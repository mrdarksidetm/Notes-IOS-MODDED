package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import b0.v;
import c0.c;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import l1.j0;
import t0.l;
import t0.o;
import t0.p3;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimationsKt {
    public static final float packageButtonActionInProgressOpacityAnimation(PaywallViewModel paywallViewModel, l lVar, int i10) {
        r.f(paywallViewModel, "<this>");
        lVar.e(-1704661559);
        if (o.I()) {
            o.U(-1704661559, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonActionInProgressOpacityAnimation (Animations.kt:13)");
        }
        float fPackageButtonActionInProgressOpacityAnimation$lambda$0 = packageButtonActionInProgressOpacityAnimation$lambda$0(c.d(paywallViewModel.getActionInProgress().getValue().booleanValue() ? 0.4f : 1.0f, UIConstant.INSTANCE.defaultAnimation(), 0.0f, "Package button action in progress alpha", null, lVar, 3072, 20));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return fPackageButtonActionInProgressOpacityAnimation$lambda$0;
    }

    private static final float packageButtonActionInProgressOpacityAnimation$lambda$0(p3<Float> p3Var) {
        return p3Var.getValue().floatValue();
    }

    /* JADX INFO: renamed from: packageButtonColorAnimation-9z6LAg8, reason: not valid java name */
    public static final long m243packageButtonColorAnimation9z6LAg8(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, long j10, long j11, l lVar, int i10) {
        r.f(legacy, "$this$packageButtonColorAnimation");
        r.f(packageInfo, "packageInfo");
        lVar.e(792231715);
        if (o.I()) {
            o.U(792231715, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonColorAnimation (Animations.kt:24)");
        }
        long j12 = r.b(packageInfo, legacy.getSelectedPackage().getValue()) ? j10 : j11;
        long jPackageButtonColorAnimation_9z6LAg8$lambda$1 = packageButtonColorAnimation_9z6LAg8$lambda$1(v.a(j12, UIConstant.INSTANCE.defaultAnimation(), "Package button selected color: " + packageInfo.getRcPackage().getIdentifier(), null, lVar, 0, 8));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return jPackageButtonColorAnimation_9z6LAg8$lambda$1;
    }

    private static final long packageButtonColorAnimation_9z6LAg8$lambda$1(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }
}
