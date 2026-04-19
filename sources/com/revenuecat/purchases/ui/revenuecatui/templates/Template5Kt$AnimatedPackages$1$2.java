package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import b0.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import f1.b;
import h0.b;
import h0.g;
import java.util.Iterator;
import md.i0;
import t0.i;
import t0.l;
import t0.o;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class Template5Kt$AnimatedPackages$1$2 extends s implements q<e, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template5Kt$AnimatedPackages$1$2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
        super(3);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$$dirty = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
        invoke(eVar, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(e eVar, l lVar, int i10) {
        r.f(eVar, "$this$AnimatedVisibility");
        if (o.I()) {
            o.U(-212619485, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template5.kt:346)");
        }
        b bVar = b.f11594a;
        float fM83getDefaultVerticalSpacingD9Ej5fM = UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM();
        b.a aVar = f1.b.f11020a;
        b.m mVarQ = bVar.q(fM83getDefaultVerticalSpacingD9Ej5fM, aVar.i());
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        int i11 = this.$$dirty;
        lVar.e(-483455358);
        e.a aVar2 = androidx.compose.ui.e.f2662a;
        e0 e0VarA = g.a(mVarQ, aVar.k(), lVar, 0);
        lVar.e(-1323940314);
        int iA = i.a(lVar, 0);
        w wVarB = lVar.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar2);
        if (!(lVar.t() instanceof t0.e)) {
            i.b();
        }
        lVar.r();
        if (lVar.l()) {
            lVar.O(aVarA);
        } else {
            lVar.D();
        }
        l lVarA = u3.a(lVar);
        u3.b(lVarA, e0VarA, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<a2.g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        lVar.e(1330880072);
        Iterator<T> it = legacy.getTemplateConfiguration().getPackages().getAll().iterator();
        while (it.hasNext()) {
            Template5Kt.SelectPackageButton(iVar, legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, lVar, 582 | ((i11 << 6) & 7168));
        }
        lVar.K();
        lVar.K();
        lVar.L();
        lVar.K();
        lVar.K();
        if (o.I()) {
            o.T();
        }
    }
}
