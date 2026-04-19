package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import f1.b;
import java.util.List;
import md.i0;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsistentPackageContentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt$ConsistentPackageContentView$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<TemplateConfiguration.PackageInfo, l, Integer, i0> $creator;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, q<? super TemplateConfiguration.PackageInfo, ? super l, ? super Integer, i0> qVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$creator = qVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$state, this.$creator, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt$ConsistentPackageContentView$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<TemplateConfiguration.PackageInfo, l, Integer, i0> $creator;
        final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
        final /* synthetic */ TemplateConfiguration.PackageInfo $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.PackageInfo packageInfo, q<? super TemplateConfiguration.PackageInfo, ? super l, ? super Integer, i0> qVar, int i10) {
            super(2);
            this.$packages = list;
            this.$selected = packageInfo;
            this.$creator = qVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$packages, this.$selected, this.$creator, lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void ConsistentPackageContentView(PaywallState.Loaded.Legacy legacy, q<? super TemplateConfiguration.PackageInfo, ? super l, ? super Integer, i0> qVar, l lVar, int i10) {
        r.f(legacy, "state");
        r.f(qVar, "creator");
        l lVarP = lVar.p(-499614075);
        if (o.I()) {
            o.U(-499614075, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:11)");
        }
        ConsistentPackageContentView(legacy.getTemplateConfiguration().getPackages().getAll(), legacy.getSelectedPackage().getValue(), qVar, lVarP, ((i10 << 3) & 896) | 72);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(legacy, qVar, i10));
    }

    public static final void ConsistentPackageContentView(List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.PackageInfo packageInfo, q<? super TemplateConfiguration.PackageInfo, ? super l, ? super Integer, i0> qVar, l lVar, int i10) {
        r.f(list, "packages");
        r.f(packageInfo, "selected");
        r.f(qVar, "creator");
        l lVarP = lVar.p(-1899321464);
        if (o.I()) {
            o.U(-1899321464, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:27)");
        }
        int i11 = 733328855;
        lVarP.e(733328855);
        e.a aVar = e.f2662a;
        e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
        int i12 = -1323940314;
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA = u.a(aVar);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarG, aVar2.e());
        u3.b(lVarA, wVarB, aVar2.g());
        p<g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        lVarP.e(155747488);
        for (TemplateConfiguration.PackageInfo packageInfo2 : list) {
            e eVarA = i1.a.a(e.f2662a, 0.0f);
            b.a aVar3 = b.f11020a;
            e eVarC = fVar.c(eVarA, aVar3.e());
            lVarP.e(i11);
            e0 e0VarG2 = d.g(aVar3.o(), false, lVarP, 0);
            lVarP.e(i12);
            int iA2 = i.a(lVarP, 0);
            w wVarB2 = lVarP.B();
            g.a aVar4 = g.J;
            a<g> aVarA2 = aVar4.a();
            q<q2<g>, l, Integer, i0> qVarA2 = u.a(eVarC);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA2);
            } else {
                lVarP.D();
            }
            l lVarA2 = u3.a(lVarP);
            u3.b(lVarA2, e0VarG2, aVar4.e());
            u3.b(lVarA2, wVarB2, aVar4.g());
            p<g, Integer, i0> pVarB2 = aVar4.b();
            if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                lVarA2.E(Integer.valueOf(iA2));
                lVarA2.Q(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar2 = f.f2502a;
            qVar.invoke(packageInfo2, lVarP, Integer.valueOf(((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            i11 = 733328855;
            i12 = -1323940314;
        }
        lVarP.K();
        e.a aVar5 = e.f2662a;
        b.a aVar6 = b.f11020a;
        e eVarC2 = fVar.c(aVar5, aVar6.e());
        lVarP.e(733328855);
        e0 e0VarG3 = d.g(aVar6.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA3 = i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        g.a aVar7 = g.J;
        a<g> aVarA3 = aVar7.a();
        q<q2<g>, l, Integer, i0> qVarA3 = u.a(eVarC2);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA3);
        } else {
            lVarP.D();
        }
        l lVarA3 = u3.a(lVarP);
        u3.b(lVarA3, e0VarG3, aVar7.e());
        u3.b(lVarA3, wVarB3, aVar7.g());
        p<g, Integer, i0> pVarB3 = aVar7.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar3 = f.f2502a;
        qVar.invoke(packageInfo, lVarP, Integer.valueOf(((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass3(list, packageInfo, qVar, i10));
    }
}
