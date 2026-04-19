package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.ui.platform.r;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import j5.a;
import j5.b;
import j5.c;
import m5.m;
import md.s;
import md.x;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowHelperKt {
    public static final a computeWindowHeightSizeClass(l lVar, int i10) {
        if (o.I()) {
            o.U(-1980265325, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowHeightSizeClass (WindowHelper.kt:22)");
        }
        a aVarA = windowSizeClass(lVar, 0).a();
        if (o.I()) {
            o.T();
        }
        return aVarA;
    }

    public static final c computeWindowWidthSizeClass(l lVar, int i10) {
        if (o.I()) {
            o.U(173434359, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowWidthSizeClass (WindowHelper.kt:16)");
        }
        c cVarB = windowSizeClass(lVar, 0).b();
        if (o.I()) {
            o.T();
        }
        return cVarB;
    }

    private static final s<Float, Float> getScreenSize(l lVar, int i10) {
        s<Float, Float> sVarA;
        if (o.I()) {
            o.U(392213243, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.getScreenSize (WindowHelper.kt:59)");
        }
        Activity activity = (Activity) lVar.P(HelperFunctionsKt.getLocalActivity());
        if (HelperFunctionsKt.isInPreviewMode(lVar, 0) || activity == null) {
            Configuration configuration = (Configuration) lVar.P(r.f());
            sVarA = x.a(Float.valueOf(configuration.screenWidthDp), Float.valueOf(configuration.screenHeightDp));
        } else {
            float f10 = activity.getResources().getDisplayMetrics().density;
            m5.l lVarD = m.f15468a.a().d(activity);
            sVarA = new s<>(Float.valueOf(lVarD.a().width() / f10), Float.valueOf(lVarD.a().height() / f10));
        }
        if (o.I()) {
            o.T();
        }
        return sVarA;
    }

    public static final boolean hasCompactDimension(l lVar, int i10) {
        if (o.I()) {
            o.U(667952227, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.hasCompactDimension (WindowHelper.kt:28)");
        }
        boolean z10 = ae.r.b(computeWindowHeightSizeClass(lVar, 0), a.f13920c) || ae.r.b(computeWindowWidthSizeClass(lVar, 0), c.f13928c);
        if (o.I()) {
            o.T();
        }
        return z10;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallMode paywallMode, a aVar) {
        ae.r.f(paywallMode, "mode");
        ae.r.f(aVar, "sizeClass");
        return PaywallModeKt.isFullScreen(paywallMode) && ae.r.b(aVar, a.f13920c);
    }

    private static final boolean shouldUseLandscapeLayout(PaywallMode paywallMode, l lVar, int i10) {
        if (o.I()) {
            o.U(-1400525098, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:41)");
        }
        boolean zShouldUseLandscapeLayout = shouldUseLandscapeLayout(paywallMode, computeWindowHeightSizeClass(lVar, 0));
        if (o.I()) {
            o.T();
        }
        return zShouldUseLandscapeLayout;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallState.Loaded.Legacy legacy, l lVar, int i10) {
        ae.r.f(legacy, "<this>");
        if (o.I()) {
            o.U(405801034, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:35)");
        }
        boolean zShouldUseLandscapeLayout = shouldUseLandscapeLayout(legacy.getTemplateConfiguration().getMode(), lVar, 0);
        if (o.I()) {
            o.T();
        }
        return zShouldUseLandscapeLayout;
    }

    private static final b windowSizeClass(l lVar, int i10) {
        if (o.I()) {
            o.U(1719780984, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowSizeClass (WindowHelper.kt:52)");
        }
        s<Float, Float> screenSize = getScreenSize(lVar, 0);
        b bVarA = b.f13924c.a(screenSize.a().floatValue(), screenSize.b().floatValue());
        if (o.I()) {
            o.T();
        }
        return bVarA;
    }
}
