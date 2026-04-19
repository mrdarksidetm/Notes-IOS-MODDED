package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.SubscriptionInformation;
import com.revenuecat.purchases.ui.revenuecatui.icons.CalendarMonthKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.CurrencyExchangeKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.UniversalCurrencyAltKt;
import h0.b;
import h0.g;
import java.util.Iterator;
import l1.j0;
import md.i0;
import p1.d;
import q0.k;
import q0.n;
import q0.q0;
import q0.y;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
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
public final class SubscriptionDetailsViewKt {
    private static final float AlphaSecondaryText = 0.6f;
    private static final float PaddingContent = h.m(16);
    private static final float PaddingHorizontal;
    private static final float PaddingVertical;
    private static final int SizeIconDp = 22;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailRow$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $icon;
        final /* synthetic */ e $modifier;
        final /* synthetic */ String $overline;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(d dVar, String str, String str2, e eVar, int i10, int i11) {
            super(2);
            this.$icon = dVar;
            this.$overline = str;
            this.$text = str2;
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
            SubscriptionDetailsViewKt.SubscriptionDetailRow(this.$icon, this.$overline, this.$text, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ SubscriptionInformation $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubscriptionInformation subscriptionInformation) {
            super(2);
            this.$details = subscriptionInformation;
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
                o.U(-114560669, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsView.<anonymous> (SubscriptionDetailsView.kt:37)");
            }
            e.a aVar = e.f2662a;
            e eVarI = m.i(aVar, SubscriptionDetailsViewKt.PaddingContent);
            SubscriptionInformation subscriptionInformation = this.$details;
            lVar.e(-483455358);
            e0 e0VarA = g.a(b.f11594a.h(), f1.b.f11020a.k(), lVar, 0);
            lVar.e(-1323940314);
            int iA = i.a(lVar, 0);
            w wVarB = lVar.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarI);
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
            u3.b(lVarA, e0VarA, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            String title = subscriptionInformation.getTitle();
            y yVar = y.f18928a;
            int i11 = y.f18929b;
            q0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, yVar.c(lVar, i11 | 0).o(), lVar, 0, 0, 65534);
            Boolean boolValueOf = Boolean.valueOf(subscriptionInformation.getActive());
            Boolean boolValueOf2 = Boolean.valueOf(subscriptionInformation.getWillRenew());
            lVar.e(511388516);
            boolean zN = lVar.N(boolValueOf) | lVar.N(boolValueOf2);
            Object objF = lVar.f();
            if (zN || objF == l.f20813a.a()) {
                objF = (subscriptionInformation.getActive() && subscriptionInformation.getWillRenew()) ? "This is your subscription with the earliest billing date." : subscriptionInformation.getActive() ? "This is your subscription with the earliest expiration date." : "This subscription has expired.";
                lVar.E(objF);
            }
            lVar.K();
            q0.b((String) objF, null, j0.u(((j0) lVar.P(k.a())).E(), SubscriptionDetailsViewKt.AlphaSecondaryText, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, yVar.c(lVar, i11 | 0).d(), lVar, 0, 0, 65530);
            h0.j0.a(androidx.compose.foundation.layout.p.o(aVar, SubscriptionDetailsViewKt.PaddingVertical), lVar, 6);
            n.a(null, 0.0f, 0L, lVar, 0, 7);
            h0.j0.a(androidx.compose.foundation.layout.p.o(aVar, SubscriptionDetailsViewKt.PaddingVertical), lVar, 6);
            SubscriptionDetailsViewKt.SubscriptionDetailRow(CurrencyExchangeKt.getCurrencyExchange(), "Billing cycle", subscriptionInformation.getDurationTitle(), null, lVar, 48, 8);
            h0.j0.a(androidx.compose.foundation.layout.p.o(aVar, SubscriptionDetailsViewKt.PaddingVertical), lVar, 6);
            SubscriptionDetailsViewKt.SubscriptionDetailRow(UniversalCurrencyAltKt.getUniversalCurrencyAlt(), "Current price", subscriptionInformation.getPrice(), null, lVar, 48, 8);
            lVar.e(-1391032715);
            if (subscriptionInformation.getExpirationDateString() != null) {
                Boolean boolValueOf3 = Boolean.valueOf(subscriptionInformation.getActive());
                Boolean boolValueOf4 = Boolean.valueOf(subscriptionInformation.getWillRenew());
                lVar.e(511388516);
                boolean zN2 = lVar.N(boolValueOf3) | lVar.N(boolValueOf4);
                Object objF2 = lVar.f();
                if (zN2 || objF2 == l.f20813a.a()) {
                    objF2 = (subscriptionInformation.getActive() && subscriptionInformation.getWillRenew()) ? "Next billing date" : subscriptionInformation.getActive() ? "Expires" : "Expired";
                    lVar.E(objF2);
                }
                lVar.K();
                h0.j0.a(androidx.compose.foundation.layout.p.o(aVar, SubscriptionDetailsViewKt.PaddingVertical), lVar, 6);
                SubscriptionDetailsViewKt.SubscriptionDetailRow(CalendarMonthKt.getCalendarMonth(), (String) objF2, subscriptionInformation.getExpirationDateString(), null, lVar, 0, 8);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$2, reason: invalid class name and case insensitive filesystem */
    static final class C06772 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SubscriptionInformation $details;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06772(SubscriptionInformation subscriptionInformation, e eVar, int i10, int i11) {
            super(2);
            this.$details = subscriptionInformation;
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
            SubscriptionDetailsViewKt.SubscriptionDetailsView(this.$details, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView_Preview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06782 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06782(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            SubscriptionDetailsViewKt.SubscriptionDetailsView_Preview(lVar, e2.a(this.$$changed | 1));
        }
    }

    static {
        float f10 = 8;
        PaddingHorizontal = h.m(f10);
        PaddingVertical = h.m(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SubscriptionDetailRow(p1.d r34, java.lang.String r35, java.lang.String r36, androidx.compose.ui.e r37, t0.l r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt.SubscriptionDetailRow(p1.d, java.lang.String, java.lang.String, androidx.compose.ui.e, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SubscriptionDetailsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.SubscriptionInformation r19, androidx.compose.ui.e r20, t0.l r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            java.lang.String r3 = "details"
            ae.r.f(r0, r3)
            r3 = 1548649928(0x5c4e85c8, float:2.3252376E17)
            r4 = r21
            t0.l r15 = r4.p(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L1b
            r4 = r1 | 6
            goto L2b
        L1b:
            r4 = r1 & 14
            if (r4 != 0) goto L2a
            boolean r4 = r15.N(r0)
            if (r4 == 0) goto L27
            r4 = 4
            goto L28
        L27:
            r4 = 2
        L28:
            r4 = r4 | r1
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r5 = r2 & 2
            if (r5 == 0) goto L32
            r4 = r4 | 48
            goto L45
        L32:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L45
            r6 = r20
            boolean r7 = r15.N(r6)
            if (r7 == 0) goto L41
            r7 = 32
            goto L43
        L41:
            r7 = 16
        L43:
            r4 = r4 | r7
            goto L47
        L45:
            r6 = r20
        L47:
            r7 = r4 & 91
            r8 = 18
            if (r7 != r8) goto L5a
            boolean r7 = r15.s()
            if (r7 != 0) goto L54
            goto L5a
        L54:
            r15.x()
            r18 = r15
            goto Lae
        L5a:
            if (r5 == 0) goto L61
            androidx.compose.ui.e$a r5 = androidx.compose.ui.e.f2662a
            r17 = r5
            goto L63
        L61:
            r17 = r6
        L63:
            boolean r5 = t0.o.I()
            if (r5 == 0) goto L6f
            r5 = -1
            java.lang.String r6 = "com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsView (SubscriptionDetailsView.kt:30)"
            t0.o.U(r3, r4, r5, r6)
        L6f:
            q0.y r3 = q0.y.f18928a
            int r5 = q0.y.f18929b
            r5 = r5 | 0
            q0.k0 r3 = r3.b(r15, r5)
            l0.a r5 = r3.d()
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = -114560669(0xfffffffff92bf163, float:-5.5798667E34)
            com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$1 r13 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$1
            r13.<init>(r0)
            r14 = 1
            b1.a r13 = b1.c.b(r15, r3, r14, r13)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r3 = r3 | r4
            r16 = 124(0x7c, float:1.74E-43)
            r4 = r17
            r14 = r15
            r18 = r15
            r15 = r3
            q0.o0.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = t0.o.I()
            if (r3 == 0) goto Lac
            t0.o.T()
        Lac:
            r6 = r17
        Lae:
            t0.o2 r3 = r18.v()
            if (r3 != 0) goto Lb5
            goto Lbd
        Lb5:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$2 r4 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt$SubscriptionDetailsView$2
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsViewKt.SubscriptionDetailsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.SubscriptionInformation, androidx.compose.ui.e, t0.l, int, int):void");
    }

    public static final void SubscriptionDetailsView_Preview(l lVar, int i10) {
        l lVarP = lVar.p(-1763354683);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1763354683, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.SubscriptionDetailsView_Preview (SubscriptionDetailsView.kt:175)");
            }
            e eVarH = androidx.compose.foundation.layout.p.h(e.f2662a, h.m(2000));
            b.f fVarO = b.f11594a.o(h.m(20));
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(fVarO, f1.b.f11020a.k(), lVarP, 6);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarH);
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
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            lVarP.e(-62251012);
            Iterator<SubscriptionInformation> it = new SubscriptionInformationProvider().getValues().iterator();
            while (it.hasNext()) {
                SubscriptionDetailsView(it.next(), null, lVarP, 0, 2);
            }
            lVarP.K();
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
        o2VarV.a(new C06782(i10));
    }
}
