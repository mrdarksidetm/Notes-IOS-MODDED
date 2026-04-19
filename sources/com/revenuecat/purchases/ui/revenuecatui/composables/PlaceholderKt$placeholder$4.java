package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.l1;
import ae.r;
import ae.s;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.e;
import c0.e0;
import c0.f1;
import c0.g1;
import c0.j1;
import c0.k0;
import c0.l0;
import c0.m;
import c0.m0;
import c0.r0;
import l1.d1;
import l1.j;
import l1.j0;
import l1.t1;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.p3;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class PlaceholderKt$placeholder$4 extends s implements q<e, l, Integer, e> {
    final /* synthetic */ long $color;
    final /* synthetic */ q<f1.b<Boolean>, l, Integer, e0<Float>> $contentFadeTransitionSpec;
    final /* synthetic */ PlaceholderHighlight $highlight;
    final /* synthetic */ q<f1.b<Boolean>, l, Integer, e0<Float>> $placeholderFadeTransitionSpec;
    final /* synthetic */ t1 $shape;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlaceholderKt$placeholder$4(q<? super f1.b<Boolean>, ? super l, ? super Integer, ? extends e0<Float>> qVar, q<? super f1.b<Boolean>, ? super l, ? super Integer, ? extends e0<Float>> qVar2, PlaceholderHighlight placeholderHighlight, boolean z10, long j10, t1 t1Var) {
        super(3);
        this.$placeholderFadeTransitionSpec = qVar;
        this.$contentFadeTransitionSpec = qVar2;
        this.$highlight = placeholderHighlight;
        this.$visible = z10;
        this.$color = j10;
        this.$shape = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$11(p3<Float> p3Var) {
        return p3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(k1<Float> k1Var) {
        return k1Var.getValue().floatValue();
    }

    private static final void invoke$lambda$5(k1<Float> k1Var, float f10) {
        k1Var.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$9(p3<Float> p3Var) {
        return p3Var.getValue().floatValue();
    }

    public final e invoke(e eVar, l lVar, int i10) {
        k1 k1Var;
        r.f(eVar, "$this$composed");
        lVar.e(616040636);
        if (o.I()) {
            o.U(616040636, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous> (Placeholder.kt:81)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        l.a aVar = l.f20813a;
        if (objF == aVar.a()) {
            objF = new l1();
            lVar.E(objF);
        }
        lVar.K();
        l1 l1Var = (l1) objF;
        lVar.e(-492369756);
        Object objF2 = lVar.f();
        if (objF2 == aVar.a()) {
            objF2 = new l1();
            lVar.E(objF2);
        }
        lVar.K();
        l1 l1Var2 = (l1) objF2;
        lVar.e(-492369756);
        Object objF3 = lVar.f();
        if (objF3 == aVar.a()) {
            objF3 = new l1();
            lVar.E(objF3);
        }
        lVar.K();
        l1 l1Var3 = (l1) objF3;
        lVar.e(-492369756);
        Object objF4 = lVar.f();
        if (objF4 == aVar.a()) {
            objF4 = k3.e(Float.valueOf(0.0f), null, 2, null);
            lVar.E(objF4);
        }
        lVar.K();
        k1 k1Var2 = (k1) objF4;
        boolean z10 = this.$visible;
        lVar.e(-492369756);
        Object objF5 = lVar.f();
        if (objF5 == aVar.a()) {
            objF5 = new r0(Boolean.valueOf(z10));
            lVar.E(objF5);
        }
        lVar.K();
        r0 r0Var = (r0) objF5;
        r0Var.f(Boolean.valueOf(this.$visible));
        f1 f1VarE = g1.e(r0Var, "placeholder_crossfade", lVar, r0.f6183d | 0 | 48, 0);
        q<f1.b<Boolean>, l, Integer, e0<Float>> qVar = this.$placeholderFadeTransitionSpec;
        lVar.e(-1338768149);
        ae.l lVar2 = ae.l.f718a;
        j1<Float, m> j1VarB = c0.l1.b(lVar2);
        lVar.e(-142660079);
        boolean zBooleanValue = ((Boolean) f1VarE.h()).booleanValue();
        lVar.e(-209574431);
        if (o.I()) {
            o.U(-209574431, 0, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous>.<anonymous> (Placeholder.kt:99)");
        }
        float f10 = zBooleanValue ? 1.0f : 0.0f;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        Float fValueOf = Float.valueOf(f10);
        boolean zBooleanValue2 = ((Boolean) f1VarE.n()).booleanValue();
        lVar.e(-209574431);
        if (o.I()) {
            o.U(-209574431, 0, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous>.<anonymous> (Placeholder.kt:99)");
        }
        float f11 = zBooleanValue2 ? 1.0f : 0.0f;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        p3 p3VarC = g1.c(f1VarE, fValueOf, Float.valueOf(f11), qVar.invoke(f1VarE.l(), lVar, 0), j1VarB, "placeholder_fade", lVar, 196608);
        lVar.K();
        lVar.K();
        q<f1.b<Boolean>, l, Integer, e0<Float>> qVar2 = this.$contentFadeTransitionSpec;
        lVar.e(-1338768149);
        j1<Float, m> j1VarB2 = c0.l1.b(lVar2);
        lVar.e(-142660079);
        boolean zBooleanValue3 = ((Boolean) f1VarE.h()).booleanValue();
        lVar.e(971232667);
        if (o.I()) {
            o.U(971232667, 0, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous>.<anonymous> (Placeholder.kt:104)");
        }
        float f12 = zBooleanValue3 ? 0.0f : 1.0f;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        Float fValueOf2 = Float.valueOf(f12);
        boolean zBooleanValue4 = ((Boolean) f1VarE.n()).booleanValue();
        lVar.e(971232667);
        if (o.I()) {
            o.U(971232667, 0, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder.<anonymous>.<anonymous> (Placeholder.kt:104)");
        }
        float f13 = zBooleanValue4 ? 0.0f : 1.0f;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        p3 p3VarC2 = g1.c(f1VarE, fValueOf2, Float.valueOf(f13), qVar2.invoke(f1VarE.l(), lVar, 0), j1VarB2, "content_fade", lVar, 196608);
        lVar.K();
        lVar.K();
        PlaceholderHighlight placeholderHighlight = this.$highlight;
        k0<Float> animationSpec = placeholderHighlight != null ? placeholderHighlight.getAnimationSpec() : null;
        lVar.e(1379506207);
        if (animationSpec == null || (!this.$visible && invoke$lambda$9(p3VarC) < 0.01f)) {
            k1Var = k1Var2;
        } else {
            k1Var = k1Var2;
            invoke$lambda$5(k1Var, m0.a(m0.c("Transition", lVar, 6, 0), 0.0f, 1.0f, animationSpec, "Animation", lVar, l0.f6095f | 25008 | (k0.f6089d << 9), 0).getValue().floatValue());
        }
        lVar.K();
        lVar.e(-492369756);
        Object objF6 = lVar.f();
        if (objF6 == aVar.a()) {
            objF6 = j.a();
            lVar.E(objF6);
        }
        lVar.K();
        d1 d1Var = (d1) objF6;
        Object objM = j0.m(this.$color);
        t1 t1Var = this.$shape;
        PlaceholderHighlight placeholderHighlight2 = this.$highlight;
        long j10 = this.$color;
        lVar.e(1618982084);
        boolean zN = lVar.N(objM) | lVar.N(t1Var) | lVar.N(placeholderHighlight2);
        Object objF7 = lVar.f();
        if (zN || objF7 == aVar.a()) {
            objF7 = b.d(eVar, new PlaceholderKt$placeholder$4$1$1(d1Var, l1Var3, t1Var, j10, placeholderHighlight2, l1Var2, l1Var, p3VarC2, p3VarC, k1Var));
            lVar.E(objF7);
        }
        lVar.K();
        e eVar2 = (e) objF7;
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return eVar2;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ e invoke(e eVar, l lVar, Integer num) {
        return invoke(eVar, lVar, num.intValue());
    }
}
