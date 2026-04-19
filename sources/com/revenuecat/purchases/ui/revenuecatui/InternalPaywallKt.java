package com.revenuecat.purchases.ui.revenuecatui;

import a2.g;
import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.e;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt;
import f1.b;
import l1.j0;
import md.i0;
import q0.c;
import q0.g;
import q0.q0;
import q0.y;
import q4.a;
import t0.b2;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.v;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalPaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$ErrorDialog$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ a<i0> $dismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<i0> aVar, int i10) {
            super(2);
            this.$dismissRequest = aVar;
            this.$$dirty = i10;
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
                o.U(-1281113313, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.ErrorDialog.<anonymous> (InternalPaywall.kt:233)");
            }
            g.b(this.$dismissRequest, null, false, null, null, null, null, null, null, ComposableSingletons$InternalPaywallKt.INSTANCE.m75getLambda1$revenuecatui_defaultsRelease(), lVar, (this.$$dirty & 14) | 805306368, 510);
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$ErrorDialog$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, int i10) {
            super(2);
            this.$error = str;
            this.$$dirty = i10;
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
                o.U(-900121180, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.ErrorDialog.<anonymous> (InternalPaywall.kt:244)");
            }
            q0.b(this.$error, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, (this.$$dirty >> 3) & 14, 0, 131070);
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$ErrorDialog$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a<i0> $dismissRequest;
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(a<i0> aVar, String str, int i10) {
            super(2);
            this.$dismissRequest = aVar;
            this.$error = str;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalPaywallKt.ErrorDialog(this.$dismissRequest, this.$error, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$1, reason: invalid class name and case insensitive filesystem */
    static final class C06151 extends s implements a<i0> {
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06151(PaywallViewModel paywallViewModel) {
            super(0);
            this.$viewModel = paywallViewModel;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.closePaywall();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2, reason: invalid class name and case insensitive filesystem */
    static final class C06162 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements q<e, l, Integer, i0> {
            final /* synthetic */ PaywallOptions $options;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C02041 extends ae.o implements a<i0> {
                C02041(Object obj) {
                    super(0, obj, PaywallViewModel.class, "closePaywall", "closePaywall()V", 0);
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((PaywallViewModel) this.receiver).closePaywall();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
                super(3);
                this.$options = paywallOptions;
                this.$viewModel = paywallViewModel;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
                invoke(eVar, lVar, num.intValue());
                return i0.f15558a;
            }

            public final void invoke(e eVar, l lVar, int i10) {
                r.f(eVar, "$this$AnimatedVisibility");
                if (o.I()) {
                    o.U(272980506, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:75)");
                }
                LoadingPaywallKt.LoadingPaywall(this.$options.getMode$revenuecatui_defaultsRelease(), this.$options.getShouldDisplayDismissButton$revenuecatui_defaultsRelease(), new C02041(this.$viewModel), lVar, 0);
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2$2, reason: invalid class name and collision with other inner class name */
        static final class C02052 extends s implements q<e, l, Integer, i0> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ PaywallState $state;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02052(PaywallState paywallState, PaywallViewModel paywallViewModel, int i10) {
                super(3);
                this.$state = paywallState;
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
                    o.U(-633062127, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:87)");
                }
                PaywallState paywallState = this.$state;
                if (paywallState instanceof PaywallState.Loaded.Legacy) {
                    InternalPaywallKt.LoadedPaywall((PaywallState.Loaded.Legacy) paywallState, this.$viewModel, lVar, (this.$$dirty & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                } else {
                    Logger.INSTANCE.e("State is not loaded while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
                }
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends s implements q<e, l, Integer, i0> {
            final /* synthetic */ PaywallState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PaywallState paywallState) {
                super(3);
                this.$state = paywallState;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ i0 invoke(e eVar, l lVar, Integer num) {
                invoke(eVar, lVar, num.intValue());
                return i0.f15558a;
            }

            public final void invoke(e eVar, l lVar, int i10) {
                r.f(eVar, "$this$AnimatedVisibility");
                if (o.I()) {
                    o.U(-369365102, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:102)");
                }
                PaywallState paywallState = this.$state;
                if (paywallState instanceof PaywallState.Loaded.Components) {
                    LoadedPaywallComponentsKt.LoadedPaywallComponents((PaywallState.Loaded.Components) paywallState, null, lVar, 8, 2);
                } else {
                    Logger.INSTANCE.e("State is not Loaded.Components while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
                }
                if (o.I()) {
                    o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06162(PaywallViewModel paywallViewModel, PaywallOptions paywallOptions, int i10) {
            super(2);
            this.$viewModel = paywallViewModel;
            this.$options = paywallOptions;
            this.$$dirty = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(t0.l r19, int r20) {
            /*
                Method dump skipped, instruction units count: 321
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.C06162.invoke(t0.l, int):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$3, reason: invalid class name and case insensitive filesystem */
    static final class C06173 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06173(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel, int i10, int i11) {
            super(2);
            this.$options = paywallOptions;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalPaywallKt.InternalPaywall(this.$options, this.$viewModel, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$LoadedPaywall$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalPaywallKt.LoadedPaywall(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$TemplatePaywall$1, reason: invalid class name and case insensitive filesystem */
    static final class C06181 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06181(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InternalPaywallKt.TemplatePaywall(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallTemplate.values().length];
            try {
                iArr[PaywallTemplate.TEMPLATE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_7.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorDialog(a<i0> aVar, String str, l lVar, int i10) {
        int i11;
        l lVar2;
        l lVarP = lVar.p(-2065649449);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.k(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.N(str) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-2065649449, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.ErrorDialog (InternalPaywall.kt:227)");
            }
            lVar2 = lVarP;
            c.a(aVar, b1.c.b(lVarP, -1281113313, true, new AnonymousClass1(aVar, i12)), null, null, ComposableSingletons$InternalPaywallKt.INSTANCE.m76getLambda2$revenuecatui_defaultsRelease(), null, b1.c.b(lVarP, -900121180, true, new AnonymousClass2(str, i12)), null, 0L, 0L, 0L, 0L, 0.0f, null, lVar2, (i12 & 14) | 1597488, 0, 16300);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass3(aVar, str, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions r5, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r6, t0.l r7, int r8, int r9) {
        /*
            java.lang.String r0 = "options"
            ae.r.f(r5, r0)
            r0 = 458565693(0x1b55283d, float:1.7631949E-22)
            t0.l r7 = r7.p(r0)
            r1 = r9 & 1
            r2 = 2
            if (r1 == 0) goto L14
            r1 = r8 | 6
            goto L24
        L14:
            r1 = r8 & 14
            if (r1 != 0) goto L23
            boolean r1 = r7.N(r5)
            if (r1 == 0) goto L20
            r1 = 4
            goto L21
        L20:
            r1 = r2
        L21:
            r1 = r1 | r8
            goto L24
        L23:
            r1 = r8
        L24:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L38
            r3 = r9 & 2
            if (r3 != 0) goto L35
            boolean r3 = r7.N(r6)
            if (r3 == 0) goto L35
            r3 = 32
            goto L37
        L35:
            r3 = 16
        L37:
            r1 = r1 | r3
        L38:
            r3 = r1 & 91
            r4 = 18
            if (r3 != r4) goto L49
            boolean r3 = r7.s()
            if (r3 != 0) goto L45
            goto L49
        L45:
            r7.x()
            goto La3
        L49:
            r7.o()
            r3 = r8 & 1
            if (r3 == 0) goto L5f
            boolean r3 = r7.C()
            if (r3 == 0) goto L57
            goto L5f
        L57:
            r7.x()
            r2 = r9 & 2
            if (r2 == 0) goto L6c
            goto L6a
        L5f:
            r3 = r9 & 2
            if (r3 == 0) goto L6c
            r6 = 0
            r3 = r1 & 14
            com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r6 = getPaywallViewModel(r5, r6, r7, r3, r2)
        L6a:
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
        L6c:
            r7.M()
            boolean r2 = t0.o.I()
            if (r2 == 0) goto L7b
            r2 = -1
            java.lang.String r3 = "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall (InternalPaywall.kt:58)"
            t0.o.U(r0, r1, r2, r3)
        L7b:
            com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$1
            r0.<init>(r6)
            r2 = 0
            r3 = 1
            f.a.a(r2, r0, r7, r2, r3)
            com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider r0 = r5.getFontProvider()
            r2 = -1925201086(0xffffffff8d3fc342, float:-5.909145E-31)
            com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2 r4 = new com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$2
            r4.<init>(r6, r5, r1)
            b1.a r1 = b1.c.b(r7, r2, r3, r4)
            r2 = 48
            com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallThemeKt.PaywallTheme(r0, r1, r7, r2)
            boolean r0 = t0.o.I()
            if (r0 == 0) goto La3
            t0.o.T()
        La3:
            t0.o2 r7 = r7.v()
            if (r7 != 0) goto Laa
            goto Lb2
        Laa:
            com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$3 r0 = new com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$3
            r0.<init>(r5, r6, r8, r9)
            r7.a(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        l lVarP = lVar.p(-1252678312);
        if (o.I()) {
            o.U(-1252678312, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall (InternalPaywall.kt:136)");
        }
        paywallViewModel.trackPaywallImpressionIfNeeded();
        long jM222getBackground0d7_KjU = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m222getBackground0d7_KjU();
        e.a aVar = androidx.compose.ui.e.f2662a;
        boolean zIsInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
        j0 j0VarM = j0.m(jM222getBackground0d7_KjU);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(j0VarM);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new InternalPaywallKt$LoadedPaywall$1$1(jM222getBackground0d7_KjU);
            lVarP.E(objF);
        }
        lVarP.K();
        androidx.compose.ui.e eVarConditional = ModifierExtensionsKt.conditional(aVar, zIsInFullScreenMode, (zd.l) objF);
        boolean z10 = !PaywallStateKt.isInFullScreenMode(legacy);
        j0 j0VarM2 = j0.m(jM222getBackground0d7_KjU);
        lVarP.e(1157296644);
        boolean zN2 = lVarP.N(j0VarM2);
        Object objF2 = lVarP.f();
        if (zN2 || objF2 == l.f20813a.a()) {
            objF2 = new InternalPaywallKt$LoadedPaywall$2$1(jM222getBackground0d7_KjU);
            lVarP.E(objF2);
        }
        lVarP.K();
        androidx.compose.ui.e eVarConditional2 = ModifierExtensionsKt.conditional(eVarConditional, z10, (zd.l) objF2);
        lVarP.e(733328855);
        e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = a2.g.J;
        a<a2.g> aVarA = aVar2.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarConditional2);
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
        p<a2.g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        Configuration configurationConfigurationWithOverriddenLocale = configurationWithOverriddenLocale(legacy, lVarP, 8);
        v.b(new b2[]{HelperFunctionsKt.getLocalActivity().c(getActivity((Context) lVarP.P(androidx.compose.ui.platform.r.g()))), androidx.compose.ui.platform.r.g().c(contextWithConfiguration(legacy, configurationConfigurationWithOverriddenLocale, lVarP, 72)), androidx.compose.ui.platform.r.f().c(configurationConfigurationWithOverriddenLocale)}, b1.c.b(lVarP, 1771404190, true, new InternalPaywallKt$LoadedPaywall$3$1(legacy, paywallViewModel, i10)), lVarP, 56);
        CloseButtonKt.m144CloseButtondrOMvmE(fVar, legacy.getShouldDisplayDismissButton(), PaywallStateKt.getCurrentColors(legacy, lVarP, 8).m226getCloseButtonQN2ZGVo(), paywallViewModel.getActionInProgress().getValue().booleanValue(), new InternalPaywallKt$LoadedPaywall$3$2(paywallViewModel), lVarP, 6);
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
        o2VarV.a(new AnonymousClass4(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TemplatePaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        l lVarP = lVar.p(-1883481085);
        if (o.I()) {
            o.U(-1883481085, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.TemplatePaywall (InternalPaywall.kt:176)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[legacy.getTemplateConfiguration().getTemplate().ordinal()]) {
            case 1:
                lVarP.e(-580658087);
                Template1Kt.Template1(legacy, paywallViewModel, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                break;
            case 2:
                lVarP.e(-580658001);
                Template2Kt.Template2(legacy, paywallViewModel, null, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 4);
                break;
            case 3:
                lVarP.e(-580657915);
                Template3Kt.Template3(legacy, paywallViewModel, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                break;
            case 4:
                lVarP.e(-580657829);
                Template4Kt.Template4(legacy, paywallViewModel, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                break;
            case 5:
                lVarP.e(-580657743);
                Template5Kt.Template5(legacy, paywallViewModel, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                break;
            case 6:
                lVarP.e(-580657657);
                Template7Kt.Template7(legacy, paywallViewModel, lVarP, (i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                break;
            default:
                lVarP.e(-580657604);
                break;
        }
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06181(legacy, paywallViewModel, i10));
    }

    private static final Configuration configurationWithOverriddenLocale(PaywallState.Loaded.Legacy legacy, l lVar, int i10) {
        if (o.I()) {
            o.U(761546839, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.configurationWithOverriddenLocale (InternalPaywall.kt:219)");
        }
        Configuration configuration = new Configuration((Configuration) lVar.P(androidx.compose.ui.platform.r.f()));
        configuration.setLocale(legacy.getTemplateConfiguration().getLocale());
        if (o.I()) {
            o.T();
        }
        return configuration;
    }

    private static final Context contextWithConfiguration(PaywallState.Loaded.Legacy legacy, Configuration configuration, l lVar, int i10) {
        if (o.I()) {
            o.U(2083869389, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.contextWithConfiguration (InternalPaywall.kt:210)");
        }
        Context context = (Context) lVar.P(androidx.compose.ui.platform.r.g());
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        if (contextCreateConfigurationContext != null) {
            context = contextCreateConfigurationContext;
        }
        if (o.I()) {
            o.T();
        }
        return context;
    }

    private static final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            r.e(context, "currentContext.baseContext");
        }
        return null;
    }

    public static final PaywallViewModel getPaywallViewModel(PaywallOptions paywallOptions, zd.l<? super CustomerInfo, Boolean> lVar, l lVar2, int i10, int i11) {
        r.f(paywallOptions, "options");
        lVar2.e(-1725540891);
        zd.l<? super CustomerInfo, Boolean> lVar3 = (i11 & 2) != 0 ? null : lVar;
        if (o.I()) {
            o.U(-1725540891, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.getPaywallViewModel (InternalPaywall.kt:188)");
        }
        Context applicationContext = ((Context) lVar2.P(androidx.compose.ui.platform.r.g())).getApplicationContext();
        String dataHash$revenuecatui_defaultsRelease = paywallOptions.getDataHash$revenuecatui_defaultsRelease();
        r.e(applicationContext, "applicationContext");
        PaywallViewModelFactory paywallViewModelFactory = new PaywallViewModelFactory(PaywallResourceProviderKt.toResourceProvider(applicationContext), paywallOptions, y.f18928a.a(lVar2, y.f18929b | 0), d0.o.a(lVar2, 0), lVar3, HelperFunctionsKt.isInPreviewMode(lVar2, 0));
        lVar2.e(1729797275);
        o4.q qVarA = r4.a.f19180a.a(lVar2, 6);
        if (qVarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.w wVarB = r4.b.b(PaywallViewModelImpl.class, qVarA, dataHash$revenuecatui_defaultsRelease, paywallViewModelFactory, qVarA instanceof androidx.lifecycle.e ? ((androidx.lifecycle.e) qVarA).getDefaultViewModelCreationExtras() : a.C0398a.f18979b, lVar2, 36936, 0);
        lVar2.K();
        PaywallViewModelImpl paywallViewModelImpl = (PaywallViewModelImpl) wVarB;
        paywallViewModelImpl.updateOptions(paywallOptions);
        if (o.I()) {
            o.T();
        }
        lVar2.K();
        return paywallViewModelImpl;
    }
}
