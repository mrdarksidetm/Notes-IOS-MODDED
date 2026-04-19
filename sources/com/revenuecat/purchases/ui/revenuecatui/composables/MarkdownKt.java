package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import i2.a0;
import i2.d;
import i2.g0;
import i2.x;
import l1.j0;
import l1.s1;
import md.i0;
import n2.f0;
import nd.t;
import pf.c;
import q0.q0;
import q0.y;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import u2.i;
import u2.n;
import uf.b;
import uf.h;
import uf.j;
import uf.u;
import uf.v;
import uf.z;
import vf.e;
import y1.e0;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class MarkdownKt {
    private static final String TAG_URL = "url";
    private static final e parser = e.a().i(t.d(c.c())).g();

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MDFencedCodeBlock$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ h $fencedCodeBlock;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(h hVar, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$fencedCodeBlock = hVar;
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
            MarkdownKt.MDFencedCodeBlock(this.$fencedCodeBlock, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDBlockChildren-lzeOXFE, reason: not valid java name */
    public static final void m155MDBlockChildrenlzeOXFE(uf.s sVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, l lVar, int i10) {
        l lVarP = lVar.p(110003723);
        if (o.I()) {
            o.U(110003723, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBlockChildren (Markdown.kt:411)");
        }
        for (uf.s sVarC = sVar.c(); sVarC != null; sVarC = sVarC.e()) {
            if (sVarC instanceof b) {
                lVarP.e(-1170803216);
                m156MDBlockQuotesW7UJKQ((b) sVarC, j10, z10, null, lVarP, 8 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i10 >> 15) & 896), 8);
            } else if (sVarC instanceof j) {
                lVarP.e(-1170803151);
                m159MDHeadingqyq4mXc((j) sVarC, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, null, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024), 512);
            } else if (sVarC instanceof v) {
                lVarP.e(-1170802858);
                m162MDParagraphlzeOXFE((v) sVarC, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024));
            } else if (sVarC instanceof h) {
                lVarP.e(-1170802557);
                MDFencedCodeBlock((h) sVarC, null, lVarP, 8, 2);
            } else if (sVarC instanceof uf.c) {
                lVarP.e(-1170802503);
                m157MDBulletListlzeOXFE((uf.c) sVarC, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024));
            } else if (sVarC instanceof u) {
                lVarP.e(-1170802205);
                m161MDOrderedListlzeOXFE((u) sVarC, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024));
            } else {
                lVarP.e(-1170801927);
            }
            lVarP.K();
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new MarkdownKt$MDBlockChildren$1(sVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDBlockQuote-sW7UJKQ, reason: not valid java name */
    public static final void m156MDBlockQuotesW7UJKQ(b bVar, long j10, boolean z10, androidx.compose.ui.e eVar, l lVar, int i10, int i11) {
        l lVarP = lVar.p(711311193);
        androidx.compose.ui.e eVar2 = (i11 & 8) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if (o.I()) {
            o.U(711311193, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBlockQuote (Markdown.kt:372)");
        }
        j0 j0VarM = j0.m(j10);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(j0VarM);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new MarkdownKt$MDBlockQuote$1$1(j10);
            lVarP.E(objF);
        }
        lVarP.K();
        float f10 = 4;
        androidx.compose.ui.e eVarM = m.m(androidx.compose.ui.draw.b.b(eVar2, (zd.l) objF), w2.h.m(16), w2.h.m(f10), 0.0f, w2.h.m(f10), 4, null);
        lVarP.e(733328855);
        e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = g.J;
        a<g> aVarA = aVar.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarG, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        p<g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        lVarP.e(-1798044921);
        d.a aVar2 = new d.a(0, 1, null);
        aVar2.k(y.f18928a.c(lVarP, 0 | y.f18929b).b().O().y(new a0(0L, 0L, (n2.i0) null, n2.e0.c(n2.e0.f15784b.a()), (f0) null, (n2.t) null, (String) null, 0L, (u2.a) null, (n) null, (q2.e) null, 0L, (u2.j) null, (s1) null, (x) null, (n1.g) null, 65527, (ae.j) null)));
        m175appendMarkdownChildren9LQNqLg(aVar2, bVar, j10, z10);
        aVar2.i();
        i2.d dVarL = aVar2.l();
        lVarP.K();
        q0.c(dVarL, eVar2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, lVarP, (i10 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 262140);
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
        o2VarV.a(new MarkdownKt$MDBlockQuote$3(bVar, j10, z10, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDBulletList-lzeOXFE, reason: not valid java name */
    public static final void m157MDBulletListlzeOXFE(uf.c cVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, l lVar, int i10) {
        l lVarP = lVar.p(1037984523);
        if (o.I()) {
            o.U(1037984523, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBulletList (Markdown.kt:226)");
        }
        m160MDListItemsJFVkrdg(cVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, null, b1.c.b(lVarP, 1682895250, true, new MarkdownKt$MDBulletList$1(j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10, cVar.p())), lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10), 6, 512);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new MarkdownKt$MDBulletList$2(cVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDDocument-lzeOXFE, reason: not valid java name */
    public static final void m158MDDocumentlzeOXFE(uf.f fVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, l lVar, int i10) {
        l lVarP = lVar.p(-1075568405);
        if (o.I()) {
            o.U(-1075568405, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDDocument (Markdown.kt:106)");
        }
        m155MDBlockChildrenlzeOXFE(fVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10));
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new MarkdownKt$MDDocument$1(fVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MDFencedCodeBlock(h hVar, androidx.compose.ui.e eVar, l lVar, int i10, int i11) {
        l lVarP = lVar.p(-731493168);
        androidx.compose.ui.e eVar2 = (i11 & 2) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if (o.I()) {
            o.U(-731493168, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDFencedCodeBlock (Markdown.kt:398)");
        }
        androidx.compose.ui.e eVarM = m.m(eVar2, w2.h.m(8), 0.0f, 0.0f, w2.h.m(hVar.n() instanceof uf.f ? 8 : 0), 6, null);
        lVarP.e(733328855);
        e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = g.J;
        a<g> aVarA = aVar.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarG, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        p<g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        String strR = hVar.r();
        g0 g0Var = new g0(0L, 0L, null, null, null, n2.t.f15881b.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
        r.e(strR, "literal");
        androidx.compose.ui.e eVar3 = eVar2;
        q0.b(strR, eVar3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, g0Var, lVarP, i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 65532);
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
        o2VarV.a(new AnonymousClass2(hVar, eVar3, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDHeading-qyq4mXc, reason: not valid java name */
    public static final void m159MDHeadingqyq4mXc(j jVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, androidx.compose.ui.e eVar, l lVar, int i10, int i11) {
        g0 g0VarH;
        l lVarP = lVar.p(1820205738);
        androidx.compose.ui.e eVar2 = (i11 & 512) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if (o.I()) {
            o.U(1820205738, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDHeading (Markdown.kt:132)");
        }
        switch (jVar.o()) {
            case 1:
                lVarP.e(-2126498885);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).h();
                break;
            case 2:
                lVarP.e(-2126498833);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).i();
                break;
            case 3:
                lVarP.e(-2126498780);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).j();
                break;
            case 4:
                lVarP.e(-2126498728);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).n();
                break;
            case 5:
                lVarP.e(-2126498679);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).o();
                break;
            case 6:
                lVarP.e(-2126498629);
                g0VarH = y.f18928a.c(lVarP, y.f18929b | 0).p();
                break;
            default:
                lVarP.e(-2126498602);
                m155MDBlockChildrenlzeOXFE(jVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (234881024 & i10));
                lVarP.K();
                if (o.I()) {
                    o.T();
                }
                o2 o2VarV = lVarP.v();
                if (o2VarV == null) {
                    return;
                }
                o2VarV.a(new MarkdownKt$MDHeading$overriddenStyle$1(jVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, eVar2, i10, i11));
                return;
        }
        lVarP.K();
        g0 g0Var2 = g0VarH;
        androidx.compose.ui.e eVarM = m.m(eVar2, 0.0f, 0.0f, 0.0f, w2.h.m(jVar.n() instanceof uf.f ? 8 : 0), 7, null);
        lVarP.e(733328855);
        e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = g.J;
        a<g> aVarA = aVar.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarG, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        p<g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        d.a aVar2 = new d.a(0, 1, null);
        m175appendMarkdownChildren9LQNqLg(aVar2, jVar, j10, z10);
        m164MarkdownTextqyq4mXc(aVar2.l(), j10, g0Var2, w2.t.f22428b.a(), i0Var, tVar, iVar, z10, z11, null, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (234881024 & i10), 512);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV2 = lVarP.v();
        if (o2VarV2 == null) {
            return;
        }
        o2VarV2.a(new MarkdownKt$MDHeading$2(jVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDListItems-JFVkrdg, reason: not valid java name */
    public static final void m160MDListItemsJFVkrdg(uf.q qVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, androidx.compose.ui.e eVar, q<? super uf.s, ? super l, ? super Integer, i0> qVar2, l lVar, int i10, int i11, int i12) {
        uf.s sVar;
        uf.s sVar2;
        int i13;
        l lVar2;
        l lVar3;
        l lVarP = lVar.p(1016703760);
        androidx.compose.ui.e eVar2 = (i12 & 512) != 0 ? androidx.compose.ui.e.f2662a : eVar;
        if (o.I()) {
            o.U(1016703760, i10, i11, "com.revenuecat.purchases.ui.revenuecatui.composables.MDListItems (Markdown.kt:317)");
        }
        int i14 = 8;
        androidx.compose.ui.e eVarM = m.m(eVar2, w2.h.m(qVar.n() instanceof uf.f ? 0 : 8), 0.0f, 0.0f, w2.h.m(qVar.n() instanceof uf.f ? 8 : 0), 6, null);
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = g.J;
        a<g> aVarA = aVar.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
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
        p<g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar2 = h0.i.f11664a;
        uf.s sVarC = qVar.c();
        lVarP.e(-1176247997);
        while (sVarC != null) {
            uf.s sVarC2 = sVarC.c();
            lVarP.e(-1045869897);
            uf.s sVarE = sVarC2;
            while (sVarE != null) {
                if (sVarE instanceof uf.c) {
                    lVarP.e(-1045869781);
                    int i15 = 29360128 & i10;
                    sVar = sVarC;
                    sVar2 = sVarE;
                    i13 = i14;
                    l lVar4 = lVarP;
                    lVar2 = lVarP;
                    m157MDBulletListlzeOXFE((uf.c) sVarE, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVar4, i15 | (3670016 & i10) | (458752 & i10) | (57344 & i10) | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i14 | (i10 & 896) | (i10 & 7168) | (234881024 & i10));
                } else {
                    sVar = sVarC;
                    sVar2 = sVarE;
                    i13 = i14;
                    lVar2 = lVarP;
                    if (sVar2 instanceof u) {
                        lVar2.e(-1045869331);
                        int i16 = 29360128 & i10;
                        m161MDOrderedListlzeOXFE((u) sVar2, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, lVar2, i16 | (3670016 & i10) | (458752 & i10) | (57344 & i10) | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (234881024 & i10));
                    } else {
                        lVar3 = lVar2;
                        lVar3.e(-1045868914);
                        qVar2.invoke(sVar2, lVar3, Integer.valueOf(((i11 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
                        lVar3.K();
                        sVarE = sVar2.e();
                        sVarC = sVar;
                        lVarP = lVar3;
                        i14 = i13;
                    }
                }
                lVar2.K();
                lVar3 = lVar2;
                sVarE = sVar2.e();
                sVarC = sVar;
                lVarP = lVar3;
                i14 = i13;
            }
            l lVar5 = lVarP;
            lVar5.K();
            sVarC = sVarC.e();
            lVarP = lVar5;
        }
        l lVar6 = lVarP;
        lVar6.K();
        lVar6.K();
        lVar6.L();
        lVar6.K();
        lVar6.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVar6.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new MarkdownKt$MDListItems$2(qVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, eVar2, qVar2, i10, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDOrderedList-lzeOXFE, reason: not valid java name */
    public static final void m161MDOrderedListlzeOXFE(u uVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, l lVar, int i10) {
        l lVarP = lVar.p(1401481105);
        if (o.I()) {
            o.U(1401481105, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList (Markdown.kt:271)");
        }
        ae.f0 f0Var = new ae.f0();
        f0Var.f703a = uVar.q();
        m160MDListItemsJFVkrdg(uVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, null, b1.c.b(lVarP, -1609568168, true, new MarkdownKt$MDOrderedList$1(j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10, f0Var, uVar.p())), lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10), 6, 512);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new MarkdownKt$MDOrderedList$2(uVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MDParagraph-lzeOXFE, reason: not valid java name */
    public static final void m162MDParagraphlzeOXFE(v vVar, long j10, g0 g0Var, long j11, n2.i0 i0Var, n2.t tVar, i iVar, boolean z10, boolean z11, l lVar, int i10) {
        l lVarP = lVar.p(306460055);
        if (o.I()) {
            o.U(306460055, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDParagraph (Markdown.kt:189)");
        }
        lVarP.e(733328855);
        e.a aVar = androidx.compose.ui.e.f2662a;
        e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(aVar);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
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
        d.a aVar3 = new d.a(0, 1, null);
        aVar3.k(g0Var.d((15204351 & 1) != 0 ? g0Var.f12368a.g() : 0L, (15204351 & 2) != 0 ? g0Var.f12368a.k() : 0L, (15204351 & 4) != 0 ? g0Var.f12368a.n() : i0Var, (15204351 & 8) != 0 ? g0Var.f12368a.l() : null, (15204351 & 16) != 0 ? g0Var.f12368a.m() : null, (15204351 & 32) != 0 ? g0Var.f12368a.i() : null, (15204351 & 64) != 0 ? g0Var.f12368a.j() : null, (15204351 & 128) != 0 ? g0Var.f12368a.o() : 0L, (15204351 & 256) != 0 ? g0Var.f12368a.e() : null, (15204351 & 512) != 0 ? g0Var.f12368a.u() : null, (15204351 & 1024) != 0 ? g0Var.f12368a.p() : null, (15204351 & 2048) != 0 ? g0Var.f12368a.d() : 0L, (15204351 & 4096) != 0 ? g0Var.f12368a.s() : null, (15204351 & 8192) != 0 ? g0Var.f12368a.r() : null, (15204351 & 16384) != 0 ? g0Var.f12368a.h() : null, (15204351 & 32768) != 0 ? g0Var.f12369b.h() : 0, (15204351 & 65536) != 0 ? g0Var.f12369b.i() : 0, (15204351 & 131072) != 0 ? g0Var.f12369b.e() : 0L, (15204351 & 262144) != 0 ? g0Var.f12369b.j() : null, (15204351 & 524288) != 0 ? g0Var.f12370c : null, (15204351 & 1048576) != 0 ? g0Var.f12369b.f() : null, (15204351 & 2097152) != 0 ? g0Var.f12369b.d() : 0, (15204351 & 4194304) != 0 ? g0Var.f12369b.c() : 0, (15204351 & 8388608) != 0 ? g0Var.f12369b.k() : null).O());
        r.d(vVar, "null cannot be cast to non-null type org.commonmark.node.Node");
        m175appendMarkdownChildren9LQNqLg(aVar3, vVar, j10, z10);
        aVar3.i();
        m164MarkdownTextqyq4mXc(aVar3.l(), j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, null, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10), 512);
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
        o2VarV.a(new MarkdownKt$MDParagraph$2(vVar, j10, g0Var, j11, i0Var, tVar, iVar, z10, z11, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /* JADX INFO: renamed from: Markdown-SXj7GJg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m163MarkdownSXj7GJg(java.lang.String r31, androidx.compose.ui.e r32, long r33, i2.g0 r35, long r36, n2.i0 r38, n2.t r39, f1.b.InterfaceC0266b r40, u2.i r41, boolean r42, boolean r43, t0.l r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m163MarkdownSXj7GJg(java.lang.String, androidx.compose.ui.e, long, i2.g0, long, n2.i0, n2.t, f1.b$b, u2.i, boolean, boolean, t0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX INFO: renamed from: MarkdownText-qyq4mXc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m164MarkdownTextqyq4mXc(i2.d r39, long r40, i2.g0 r42, long r43, n2.i0 r45, n2.t r46, u2.i r47, boolean r48, boolean r49, androidx.compose.ui.e r50, t0.l r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m164MarkdownTextqyq4mXc(i2.d, long, i2.g0, long, n2.i0, n2.t, u2.i, boolean, boolean, androidx.compose.ui.e, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appendMarkdownChildren-9LQNqLg, reason: not valid java name */
    public static final void m175appendMarkdownChildren9LQNqLg(d.a aVar, uf.s sVar, long j10, boolean z10) {
        uf.s sVar2;
        boolean z11;
        a0 a0Var;
        long j11 = j10;
        boolean z12 = z10;
        uf.s sVarC = sVar.c();
        while (sVarC != null) {
            if (sVarC instanceof v) {
                m175appendMarkdownChildren9LQNqLg(aVar, sVarC, j11, z12);
            } else if (sVarC instanceof uf.a0) {
                String strN = ((uf.a0) sVarC).n();
                r.e(strN, "child.literal");
                aVar.h(strN);
            } else {
                if (sVarC instanceof uf.g) {
                    a0Var = new a0(0L, 0L, (n2.i0) null, n2.e0.c(n2.e0.f15784b.a()), (f0) null, (n2.t) null, (String) null, 0L, (u2.a) null, (n) null, (q2.e) null, 0L, (u2.j) null, (s1) null, (x) null, (n1.g) null, 65527, (ae.j) null);
                } else if (sVarC instanceof z) {
                    a0Var = new a0(0L, 0L, n2.i0.f15808b.b(), (n2.e0) null, (f0) null, (n2.t) null, (String) null, 0L, (u2.a) null, (n) null, (q2.e) null, 0L, (u2.j) null, (s1) null, (x) null, (n1.g) null, 65531, (ae.j) null);
                } else if (sVarC instanceof uf.d) {
                    aVar.k(new g0(0L, 0L, null, null, null, n2.t.f15881b.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null).O());
                    String strN2 = ((uf.d) sVarC).n();
                    r.e(strN2, "child.literal");
                    aVar.h(strN2);
                    aVar.i();
                } else {
                    if (sVarC instanceof uf.i ? true : sVarC instanceof uf.w) {
                        r.e(aVar.append('\n'), "append('\\n')");
                    } else {
                        if (!(sVarC instanceof uf.o)) {
                            sVar2 = sVarC;
                            if (sVar2 instanceof pf.a) {
                                aVar.k(new g0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, u2.j.f21569b.a(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null).O());
                                z11 = z10;
                                m175appendMarkdownChildren9LQNqLg(aVar, sVar2, j11, z11);
                                aVar.i();
                            }
                            sVarC = sVar2.e();
                            z12 = z11;
                        } else if (z12) {
                            aVar.k(new a0(j10, 0L, (n2.i0) null, (n2.e0) null, (f0) null, (n2.t) null, (String) null, 0L, (u2.a) null, (n) null, (q2.e) null, 0L, u2.j.f21569b.c(), (s1) null, (x) null, (n1.g) null, 61438, (ae.j) null));
                            sVar2 = sVarC;
                            String strN3 = ((uf.o) sVar2).n();
                            r.e(strN3, "child.destination");
                            aVar.j(TAG_URL, strN3);
                            j11 = j10;
                            m175appendMarkdownChildren9LQNqLg(aVar, sVar2, j11, true);
                            aVar.i();
                            aVar.i();
                        } else {
                            sVar2 = sVarC;
                            m175appendMarkdownChildren9LQNqLg(aVar, sVar2, j11, false);
                        }
                        z11 = z10;
                        sVarC = sVar2.e();
                        z12 = z11;
                    }
                }
                aVar.k(a0Var);
                m175appendMarkdownChildren9LQNqLg(aVar, sVarC, j11, z12);
                aVar.i();
            }
            sVar2 = sVarC;
            z11 = z12;
            sVarC = sVar2.e();
            z12 = z11;
        }
    }
}
