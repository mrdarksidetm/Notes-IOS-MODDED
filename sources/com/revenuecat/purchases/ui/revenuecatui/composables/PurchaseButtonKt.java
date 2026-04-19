package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import androidx.compose.animation.f;
import b0.d;
import b0.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import f1.b;
import h0.c;
import l1.j0;
import md.i0;
import q0.d0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import t0.p3;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseButtonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$LoadingSpinner$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements q<e, l, Integer, i0> {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ c $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TemplateConfiguration.Colors colors, c cVar) {
            super(3);
            this.$colors = colors;
            this.$this_LoadingSpinner = cVar;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
            invoke(eVar, lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(e eVar, l lVar, int i10) {
            r.f(eVar, "$this$AnimatedVisibility");
            if (o.I()) {
                o.U(-1498164238, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner.<anonymous> (PurchaseButton.kt:189)");
            }
            d0.a(this.$this_LoadingSpinner.c(androidx.compose.ui.e.f2662a, b.f11020a.e()), this.$colors.m224getCallToActionForeground0d7_KjU(), 0.0f, 0L, 0, lVar, 0, 28);
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$LoadingSpinner$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $shouldShow;
        final /* synthetic */ c $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(c cVar, boolean z10, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_LoadingSpinner = cVar;
            this.$shouldShow = z10;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PurchaseButtonKt.LoadingSpinner(this.$this_LoadingSpinner, this.$shouldShow, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$PurchaseButtonPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06651 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06651(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PurchaseButtonKt.PurchaseButtonPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingSpinner(c cVar, boolean z10, TemplateConfiguration.Colors colors, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(-268216038);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= lVarP.N(colors) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-268216038, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner (PurchaseButton.kt:182)");
            }
            androidx.compose.ui.e eVarC = cVar.c(androidx.compose.ui.e.f2662a, b.f11020a.e());
            UIConstant uIConstant = UIConstant.INSTANCE;
            d.e(z10, eVarC, f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), "PurchaseButton.LoadingSpinner", b1.c.b(lVarP, -1498164238, true, new AnonymousClass1(colors, cVar)), lVarP, ((i11 >> 3) & 14) | 221184, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(cVar, z10, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205  */
    /* JADX INFO: renamed from: PurchaseButton-WH-ejsw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m184PurchaseButtonWHejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r31, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration r32, t0.k1<com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo> r33, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r34, float r35, androidx.compose.ui.e r36, t0.l r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.m184PurchaseButtonWHejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageConfiguration, t0.k1, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, float, androidx.compose.ui.e, t0.l, int, int):void");
    }

    /* JADX INFO: renamed from: PurchaseButton-hGBTI10, reason: not valid java name */
    public static final void m185PurchaseButtonhGBTI10(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, float f10, TemplateConfiguration.Colors colors, l lVar, int i10, int i11) {
        float fM80getDefaultHorizontalPaddingD9Ej5fM;
        int i12;
        TemplateConfiguration.Colors currentColors;
        r.f(legacy, "state");
        r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(885662377);
        androidx.compose.ui.e eVar2 = (i11 & 4) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            fM80getDefaultHorizontalPaddingD9Ej5fM = UIConstant.INSTANCE.m80getDefaultHorizontalPaddingD9Ej5fM();
        } else {
            fM80getDefaultHorizontalPaddingD9Ej5fM = f10;
            i12 = i10;
        }
        if ((i11 & 16) != 0) {
            i12 &= -57345;
            currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        } else {
            currentColors = colors;
        }
        int i13 = i12;
        if (o.I()) {
            o.U(885662377, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton (PurchaseButton.kt:48)");
        }
        DisableTouchesComposableKt.DisableTouchesComposable(paywallViewModel.getActionInProgress().getValue().booleanValue(), b1.c.b(lVarP, 22366153, true, new PurchaseButtonKt$PurchaseButton$1(currentColors, legacy, paywallViewModel, fM80getDefaultHorizontalPaddingD9Ej5fM, eVar2, i13)), lVarP, 48, 0);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new PurchaseButtonKt$PurchaseButton$2(legacy, paywallViewModel, eVar2, fM80getDefaultHorizontalPaddingD9Ej5fM, currentColors, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PurchaseButtonPreview(l lVar, int i10) {
        l lVarP = lVar.p(1498117025);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1498117025, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonPreview (PurchaseButton.kt:199)");
            }
            MockViewModel mockViewModel = new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), true, false, 9, null);
            PaywallState.Loaded.Legacy legacyLoadedLegacyState = mockViewModel.loadedLegacyState();
            if (legacyLoadedLegacyState != null) {
                m185PurchaseButtonhGBTI10(legacyLoadedLegacyState, mockViewModel, null, 0.0f, null, lVarP, 72, 28);
            }
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06651(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PurchaseButton_WH_ejsw$lambda$5$lambda$0(p3<Float> p3Var) {
        return p3Var.getValue().floatValue();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$5$lambda$1(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$5$lambda$2(p3<j0> p3Var) {
        return p3Var.getValue().E();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX INFO: renamed from: buttonBrush-A47ccPs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final l1.z m187buttonBrushA47ccPs(long r7, l1.j0 r9, t0.l r10, int r11) {
        /*
            boolean r10 = t0.o.I()
            if (r10 == 0) goto Lf
            r10 = -58833710(0xfffffffffc7e44d2, float:-5.280957E36)
            r0 = -1
            java.lang.String r1 = "com.revenuecat.purchases.ui.revenuecatui.composables.buttonBrush (PurchaseButton.kt:170)"
            t0.o.U(r10, r11, r0, r1)
        Lf:
            if (r9 == 0) goto L38
            long r9 = r9.E()
            l1.z$a r0 = l1.z.Companion
            r11 = 2
            l1.j0[] r11 = new l1.j0[r11]
            r1 = 0
            l1.j0 r2 = l1.j0.m(r7)
            r11[r1] = r2
            r1 = 1
            l1.j0 r9 = l1.j0.m(r9)
            r11[r1] = r9
            java.util.List r1 = nd.s.p(r11)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            l1.z r9 = l1.z.a.g(r0, r1, r2, r3, r4, r5, r6)
            if (r9 != 0) goto L3e
        L38:
            l1.u1 r9 = new l1.u1
            r10 = 0
            r9.<init>(r7, r10)
        L3e:
            boolean r7 = t0.o.I()
            if (r7 == 0) goto L47
            t0.o.T()
        L47:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.m187buttonBrushA47ccPs(long, l1.j0, t0.l, int):l1.z");
    }
}
