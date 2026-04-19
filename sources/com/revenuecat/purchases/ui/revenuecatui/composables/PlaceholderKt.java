package com.revenuecat.purchases.ui.revenuecatui.composables;

import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b2.u0;
import c0.e0;
import c0.f1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import k1.l;
import k1.m;
import l1.b0;
import l1.b1;
import l1.c1;
import l1.d1;
import l1.m1;
import l1.t1;
import md.i0;
import n1.f;
import n1.j;
import w2.r;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawPlaceholder-hpmOzss, reason: not valid java name */
    public static final b1 m181drawPlaceholderhpmOzss(f fVar, t1 t1Var, long j10, PlaceholderHighlight placeholderHighlight, float f10, b1 b1Var, r rVar, l lVar) {
        if (t1Var == m1.a()) {
            f.r0(fVar, j10, 0L, 0L, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowNoTitle, null);
            if (placeholderHighlight != null) {
                f.H0(fVar, placeholderHighlight.mo147brushd16Qtg0(f10, fVar.c()), 0L, 0L, placeholderHighlight.alpha(f10), null, null, 0, R.styleable.AppCompatTheme_windowActionBarOverlay, null);
            }
            return null;
        }
        b1 b1VarMo253createOutlinePq9zytI = l.e(fVar.c(), lVar) && fVar.getLayoutDirection() == rVar ? b1Var : null;
        if (b1VarMo253createOutlinePq9zytI == null) {
            b1VarMo253createOutlinePq9zytI = t1Var.mo253createOutlinePq9zytI(fVar.c(), fVar.getLayoutDirection(), fVar);
        }
        c1.d(fVar, b1VarMo253createOutlinePq9zytI, j10, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? j.f15736a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? f.S.a() : 0);
        if (placeholderHighlight != null) {
            c1.c(fVar, b1VarMo253createOutlinePq9zytI, placeholderHighlight.mo147brushd16Qtg0(f10, fVar.c()), placeholderHighlight.alpha(f10), null, null, 0, 56, null);
        }
        return b1VarMo253createOutlinePq9zytI;
    }

    /* JADX INFO: renamed from: placeholder-cf5BqRc, reason: not valid java name */
    public static final e m182placeholdercf5BqRc(e eVar, boolean z10, long j10, t1 t1Var, PlaceholderHighlight placeholderHighlight, q<? super f1.b<Boolean>, ? super t0.l, ? super Integer, ? extends e0<Float>> qVar, q<? super f1.b<Boolean>, ? super t0.l, ? super Integer, ? extends e0<Float>> qVar2) {
        ae.r.f(eVar, "$this$placeholder");
        ae.r.f(t1Var, "shape");
        ae.r.f(qVar, "placeholderFadeTransitionSpec");
        ae.r.f(qVar2, "contentFadeTransitionSpec");
        return c.a(eVar, u0.c() ? new PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1(z10, j10, placeholderHighlight, t1Var) : u0.a(), new PlaceholderKt$placeholder$4(qVar, qVar2, placeholderHighlight, z10, j10, t1Var));
    }

    private static final void withLayer(f fVar, d1 d1Var, zd.l<? super f, i0> lVar) {
        b0 b0VarD = fVar.M0().d();
        b0VarD.n(m.c(fVar.c()), d1Var);
        lVar.invoke(fVar);
        b0VarD.p();
    }
}
