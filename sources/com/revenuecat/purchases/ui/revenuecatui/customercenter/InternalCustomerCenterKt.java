package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import a2.g;
import ae.j;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import f1.b;
import h0.b;
import h0.g;
import md.i0;
import md.x;
import nd.q0;
import nd.r0;
import nd.t;
import q4.a;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.p3;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt {
    private static final CustomerCenterConfigData previewConfigData;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterError$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterState.Error $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerCenterState.Error error, int i10) {
            super(2);
            this.$state = error;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterError(this.$state, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterErrorPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06701 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06701(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterErrorPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoaded$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterState.Success $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerCenterState.Success success, int i10) {
            super(2);
            this.$state = success;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoaded(this.$state, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadedPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06711 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06711(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoadedPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoading$1, reason: invalid class name and case insensitive filesystem */
    static final class C06721 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06721(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoading(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoadingPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06731 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06731(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterLoadingPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterScaffold$2, reason: invalid class name and case insensitive filesystem */
    static final class C06742 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<l, Integer, i0> $mainContent;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06742(e eVar, p<? super l, ? super Integer, i0> pVar, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$mainContent = pVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.CustomerCenterScaffold(this.$modifier, this.$mainContent, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$1, reason: invalid class name and case insensitive filesystem */
    static final class C06751 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ CustomerCenterViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06751(e eVar, CustomerCenterViewModel customerCenterViewModel, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$viewModel = customerCenterViewModel;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.InternalCustomerCenter(this.$modifier, this.$viewModel, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$2, reason: invalid class name and case insensitive filesystem */
    static final class C06762 extends s implements p<l, Integer, i0> {
        final /* synthetic */ CustomerCenterState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06762(CustomerCenterState customerCenterState) {
            super(2);
            this.$state = customerCenterState;
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
                o.U(839713458, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter.<anonymous> (InternalCustomerCenter.kt:42)");
            }
            CustomerCenterState customerCenterState = this.$state;
            if (customerCenterState instanceof CustomerCenterState.Loading) {
                lVar.e(1576092918);
                InternalCustomerCenterKt.CustomerCenterLoading(lVar, 0);
            } else if (customerCenterState instanceof CustomerCenterState.Error) {
                lVar.e(1576092986);
                InternalCustomerCenterKt.CustomerCenterError((CustomerCenterState.Error) this.$state, lVar, 8);
            } else if (customerCenterState instanceof CustomerCenterState.Success) {
                lVar.e(1576093059);
                InternalCustomerCenterKt.CustomerCenterLoaded((CustomerCenterState.Success) this.$state, lVar, 0);
            } else {
                lVar.e(1576093096);
            }
            lVar.K();
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ CustomerCenterState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CustomerCenterState customerCenterState, e eVar, int i10, int i11) {
            super(2);
            this.$state = customerCenterState;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalCustomerCenterKt.InternalCustomerCenter(this.$state, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    static {
        CustomerCenterConfigData.Screen.ScreenType screenType = CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT;
        previewConfigData = new CustomerCenterConfigData(q0.c(x.a(screenType, new CustomerCenterConfigData.Screen(screenType, "Manage Subscription", "Manage subscription subtitle", t.d(new CustomerCenterConfigData.HelpPath("path-id-1", "Subscription", CustomerCenterConfigData.HelpPath.PathType.CANCEL, null, null))))), new CustomerCenterConfigData.Appearance((CustomerCenterConfigData.Appearance.ColorInformation) null, (CustomerCenterConfigData.Appearance.ColorInformation) null, 3, (j) null), new CustomerCenterConfigData.Localization("en_US", r0.h(x.a("cancel", "Cancel"), x.a("subscription", "Subscription"))), new CustomerCenterConfigData.Support("test@revenuecat.com"), (String) null, 16, (j) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomerCenterError(CustomerCenterState.Error error, l lVar, int i10) {
        l lVarP = lVar.p(-999186317);
        if (o.I()) {
            o.U(-999186317, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterError (InternalCustomerCenter.kt:72)");
        }
        q0.q0.b("Error: " + error.getError(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVarP, 0, 0, 131070);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(error, i10));
    }

    public static final void CustomerCenterErrorPreview(l lVar, int i10) {
        l lVarP = lVar.p(-117134989);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-117134989, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterErrorPreview (InternalCustomerCenter.kt:107)");
            }
            InternalCustomerCenter(new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownBackendError, null, 2, null)), m.i(androidx.compose.foundation.layout.p.e(e.f2662a, 0.0f, 1, null), h.m(10)), lVarP, 56, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06701(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomerCenterLoaded(CustomerCenterState.Success success, l lVar, int i10) {
        int i11;
        l lVar2;
        l lVarP = lVar.p(145985677);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(success) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(145985677, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoaded (InternalCustomerCenter.kt:78)");
            }
            lVarP.e(-483455358);
            e.a aVar = e.f2662a;
            e0 e0VarA = g.a(b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar);
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
            u3.b(lVarA, e0VarA, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            lVar2 = lVarP;
            q0.q0.b("Customer Center config:", null, 0L, w2.u.e(20), null, n2.i0.f15808b.b(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, 199686, 0, 131030);
            q0.q0.b(success.getCustomerCenterConfigDataString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, 0, 0, 131070);
            lVar2.K();
            lVar2.L();
            lVar2.K();
            lVar2.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(success, i10));
    }

    public static final void CustomerCenterLoadedPreview(l lVar, int i10) {
        l lVarP = lVar.p(899134290);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(899134290, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadedPreview (InternalCustomerCenter.kt:117)");
            }
            InternalCustomerCenter(new CustomerCenterState.Success(previewConfigData.toString()), m.i(androidx.compose.foundation.layout.p.e(e.f2662a, 0.0f, 1, null), h.m(10)), lVarP, 48, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06711(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomerCenterLoading(l lVar, int i10) {
        l lVarP = lVar.p(2054893049);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(2054893049, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoading (InternalCustomerCenter.kt:66)");
            }
            q0.q0.b("Loading...", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVarP, 6, 0, 131070);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06721(i10));
    }

    public static final void CustomerCenterLoadingPreview(l lVar, int i10) {
        l lVarP = lVar.p(626880743);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(626880743, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadingPreview (InternalCustomerCenter.kt:98)");
            }
            InternalCustomerCenter(CustomerCenterState.Loading.INSTANCE, m.i(androidx.compose.foundation.layout.p.e(e.f2662a, 0.0f, 1, null), h.m(10)), lVarP, 54, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06731(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomerCenterScaffold(e eVar, p<? super l, ? super Integer, i0> pVar, l lVar, int i10, int i11) {
        int i12;
        l lVarP = lVar.p(-1174614816);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(-1174614816, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffold (InternalCustomerCenter.kt:52)");
            }
            b.InterfaceC0266b interfaceC0266bG = f1.b.f11020a.g();
            b.f fVarB = h0.b.f11594a.b();
            int i14 = (i12 & 14) | 432;
            lVarP.e(-483455358);
            int i15 = i14 >> 3;
            e0 e0VarA = h0.g.a(fVarB, interfaceC0266bG, lVarP, (i15 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i15 & 14));
            int i16 = (i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVar);
            int i17 = ((i16 << 9) & 7168) | 6;
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
            u3.b(lVarA, e0VarA, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, Integer.valueOf((i17 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            pVar.invoke(lVarP, Integer.valueOf((i12 >> 3) & 14));
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06742(eVar, pVar, i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InternalCustomerCenter(androidx.compose.ui.e r7, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel r8, t0.l r9, int r10, int r11) {
        /*
            r0 = 1413630290(0x54424952, float:3.337815E12)
            t0.l r9 = r9.p(r0)
            r1 = r11 & 1
            if (r1 == 0) goto Le
            r2 = r10 | 6
            goto L1e
        Le:
            r2 = r10 & 14
            if (r2 != 0) goto L1d
            boolean r2 = r9.N(r7)
            if (r2 == 0) goto L1a
            r2 = 4
            goto L1b
        L1a:
            r2 = 2
        L1b:
            r2 = r2 | r10
            goto L1e
        L1d:
            r2 = r10
        L1e:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L32
            r3 = r11 & 2
            if (r3 != 0) goto L2f
            boolean r3 = r9.N(r8)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r2 = r2 | r3
        L32:
            r3 = r2 & 91
            r4 = 18
            if (r3 != r4) goto L43
            boolean r3 = r9.s()
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            r9.x()
            goto L98
        L43:
            r9.o()
            r3 = r10 & 1
            r4 = 3
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L5c
            boolean r3 = r9.C()
            if (r3 == 0) goto L54
            goto L5c
        L54:
            r9.x()
            r1 = r11 & 2
            if (r1 == 0) goto L6a
            goto L68
        L5c:
            if (r1 == 0) goto L60
            androidx.compose.ui.e$a r7 = androidx.compose.ui.e.f2662a
        L60:
            r1 = r11 & 2
            if (r1 == 0) goto L6a
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel r8 = getCustomerCenterViewModel(r6, r6, r9, r5, r4)
        L68:
            r2 = r2 & (-113(0xffffffffffffff8f, float:NaN))
        L6a:
            r9.M()
            boolean r1 = t0.o.I()
            if (r1 == 0) goto L79
            r1 = -1
            java.lang.String r3 = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter (InternalCustomerCenter.kt:29)"
            t0.o.U(r0, r2, r1, r3)
        L79:
            oe.f0 r0 = r8.getState()
            r1 = 8
            r3 = 1
            t0.p3 r0 = t0.f3.b(r0, r6, r9, r1, r3)
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState r0 = InternalCustomerCenter$lambda$0(r0)
            int r1 = r2 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            InternalCustomerCenter(r0, r7, r9, r1, r5)
            boolean r0 = t0.o.I()
            if (r0 == 0) goto L98
            t0.o.T()
        L98:
            t0.o2 r9 = r9.v()
            if (r9 != 0) goto L9f
            goto La7
        L9f:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$1
            r0.<init>(r7, r8, r10, r11)
            r9.a(r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.InternalCustomerCenter(androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalCustomerCenter(CustomerCenterState customerCenterState, e eVar, l lVar, int i10, int i11) {
        int i12;
        l lVarP = lVar.p(1319796155);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(customerCenterState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(1319796155, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter (InternalCustomerCenter.kt:38)");
            }
            CustomerCenterScaffold(eVar, c.b(lVarP, 839713458, true, new C06762(customerCenterState)), lVarP, ((i12 >> 3) & 14) | 48, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass3(customerCenterState, eVar, i10, i11));
    }

    private static final CustomerCenterState InternalCustomerCenter$lambda$0(p3<? extends CustomerCenterState> p3Var) {
        return p3Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CustomerCenterViewModel getCustomerCenterViewModel(PurchasesType purchasesType, CustomerCenterViewModel customerCenterViewModel, l lVar, int i10, int i11) {
        lVar.e(-1371386305);
        if ((i11 & 1) != 0) {
            purchasesType = new PurchasesImpl(null, 1, 0 == true ? 1 : 0);
        }
        if ((i11 & 2) != 0) {
            CustomerCenterViewModelFactory customerCenterViewModelFactory = new CustomerCenterViewModelFactory(purchasesType);
            lVar.e(1729797275);
            o4.q qVarA = r4.a.f19180a.a(lVar, 6);
            if (qVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.w wVarB = r4.b.b(CustomerCenterViewModelImpl.class, qVarA, null, customerCenterViewModelFactory, qVarA instanceof androidx.lifecycle.e ? ((androidx.lifecycle.e) qVarA).getDefaultViewModelCreationExtras() : a.C0398a.f18979b, lVar, 36936, 0);
            lVar.K();
            customerCenterViewModel = (CustomerCenterViewModel) wVarB;
        }
        if (o.I()) {
            o.U(-1371386305, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.getCustomerCenterViewModel (InternalCustomerCenter.kt:87)");
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return customerCenterViewModel;
    }

    private static /* synthetic */ void getPreviewConfigData$annotations() {
    }
}
