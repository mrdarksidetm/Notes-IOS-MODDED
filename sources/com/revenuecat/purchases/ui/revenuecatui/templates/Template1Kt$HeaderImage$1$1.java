package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import md.i0;
import t0.l;
import t0.o;
import y1.f;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class Template1Kt$HeaderImage$1$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ boolean $landscapeLayout;
    final /* synthetic */ Uri $uri;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$HeaderImage$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.l<e, e> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public final e invoke(e eVar) {
            r.f(eVar, "$this$conditional");
            return a.b(eVar, 1.2f, false, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template1Kt$HeaderImage$1$1(Uri uri, boolean z10) {
        super(2);
        this.$uri = uri;
        this.$landscapeLayout = z10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(1134746342, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage.<anonymous>.<anonymous> (Template1.kt:139)");
        }
        int i11 = ((Configuration) lVar.P(androidx.compose.ui.platform.r.f())).screenHeightDp;
        String string = this.$uri.toString();
        r.e(string, "uri.toString()");
        e eVarConditional = ModifierExtensionsKt.conditional(e.f2662a, !this.$landscapeLayout, AnonymousClass1.INSTANCE);
        boolean z10 = this.$landscapeLayout;
        Integer numValueOf = Integer.valueOf(i11);
        lVar.e(1157296644);
        boolean zN = lVar.N(numValueOf);
        Object objF = lVar.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new Template1Kt$HeaderImage$1$1$2$1(i11);
            lVar.E(objF);
        }
        lVar.K();
        RemoteImageKt.RemoteImage(string, ModifierExtensionsKt.conditional(eVarConditional, z10, (zd.l) objF), null, f.f23237a.a(), null, null, 0.0f, lVar, 3072, R.styleable.AppCompatTheme_viewInflaterClass);
        if (o.I()) {
            o.T();
        }
    }
}
