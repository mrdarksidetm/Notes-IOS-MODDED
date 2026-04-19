package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import d0.x;
import h0.b;
import h3.a;
import l1.g;
import md.i0;
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
import y1.f;
import y1.u;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class IconImageKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt$AppIcon$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, int i10, int i11) {
            super(2);
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
            IconImageKt.AppIcon(this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt$IconImagePreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06601 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06601(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            IconImageKt.IconImagePreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppIcon(e eVar, l lVar, int i10, int i11) {
        int i12;
        l lVarP = lVar.p(678489322);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(678489322, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.AppIcon (IconImage.kt:61)");
            }
            Context context = (Context) lVarP.P(r.g());
            lVarP.e(-492369756);
            Object objF = lVarP.f();
            if (objF == l.f20813a.a()) {
                objF = context.getApplicationInfo().loadIcon(context.getPackageManager());
                lVarP.E(objF);
            }
            lVarP.K();
            Drawable drawable = (Drawable) objF;
            ae.r.e(drawable, "appIconResId");
            x.b(g.c(a.b(drawable, 0, 0, Bitmap.Config.ARGB_8888, 3, null)), null, eVar, null, f.f23237a.a(), 0.0f, null, 0, lVarP, ((i12 << 6) & 896) | 24632, 232);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(eVar, i10, i11));
    }

    /* JADX INFO: renamed from: IconImage-djqs-MU, reason: not valid java name */
    public static final void m153IconImagedjqsMU(Uri uri, float f10, float f11, e eVar, l lVar, int i10, int i11) {
        l lVarP = lVar.p(-314692702);
        e eVar2 = (i11 & 8) != 0 ? e.f2662a : eVar;
        if (o.I()) {
            o.U(-314692702, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IconImage (IconImage.kt:29)");
        }
        if (uri != null) {
            e eVarT = androidx.compose.foundation.layout.p.t(e.f2662a, 0.0f, f10, 1, null);
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            zd.a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarT);
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
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            e eVarA = i1.g.a(androidx.compose.foundation.layout.p.t(androidx.compose.foundation.layout.a.b(eVar2, 1.0f, false, 2, null), 0.0f, f10, 1, null), l0.g.c(f11));
            if (HelperFunctionsKt.isInPreviewMode(lVarP, 0)) {
                lVarP.e(2026513307);
                d.a(androidx.compose.foundation.layout.p.o(c.d(eVarA, y.f18928a.a(lVarP, y.f18929b | 0).w(), null, 2, null), f10), lVarP, 0);
            } else {
                String string = uri.toString();
                ae.r.e(string, "uri.toString()");
                if (je.w.L(string, PaywallDataExtensionsKt.getDefaultAppIconPlaceholder(PaywallData.Companion), false, 2, null)) {
                    lVarP.e(2026513595);
                    AppIcon(eVarA, lVarP, 0, 0);
                } else {
                    lVarP.e(2026513661);
                    String string2 = uri.toString();
                    ae.r.e(string2, "uri.toString()");
                    RemoteImageKt.RemoteImage(string2, eVarA, null, f.f23237a.a(), null, null, 0.0f, lVarP, 3072, R.styleable.AppCompatTheme_viewInflaterClass);
                }
            }
            lVarP.K();
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new IconImageKt$IconImage$2(uri, f10, f11, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconImagePreview(l lVar, int i10) {
        l lVarP = lVar.p(432450827);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(432450827, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IconImagePreview (IconImage.kt:80)");
            }
            m153IconImagedjqsMU(Uri.parse("https://assets.pawwalls.com/icon.jpg"), h.m(140), h.m(16), null, lVarP, 440, 8);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06601(i10));
    }
}
