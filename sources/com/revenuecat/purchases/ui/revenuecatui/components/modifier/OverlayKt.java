package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import ae.r;
import ae.s;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import i1.f;
import i1.k;
import l1.b1;
import l1.c1;
import l1.m1;
import l1.t1;
import md.i0;
import n1.c;
import n1.j;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OverlayKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements l<f, k> {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ t1 $shape;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02081 extends s implements l<c, i0> {
            final /* synthetic */ ColorStyle $color;
            final /* synthetic */ b1 $outline;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02081(ColorStyle colorStyle, b1 b1Var) {
                super(1);
                this.$color = colorStyle;
                this.$outline = b1Var;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(c cVar) {
                invoke2(cVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(c cVar) {
                r.f(cVar, "$this$onDrawWithContent");
                cVar.u1();
                ColorStyle colorStyle = this.$color;
                if (colorStyle instanceof ColorStyle.Solid) {
                    c1.d(cVar, this.$outline, ((ColorStyle.Solid) colorStyle).m124unboximpl(), (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? j.f15736a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? n1.f.S.a() : 0);
                } else if (colorStyle instanceof ColorStyle.Gradient) {
                    c1.c(cVar, this.$outline, ((ColorStyle.Gradient) colorStyle).m116unboximpl(), 0.0f, null, null, 0, 60, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(t1 t1Var, ColorStyle colorStyle) {
            super(1);
            this.$shape = t1Var;
            this.$color = colorStyle;
        }

        @Override // zd.l
        public final k invoke(f fVar) {
            r.f(fVar, "$this$drawWithCache");
            return fVar.f(new C02081(this.$color, this.$shape.mo253createOutlinePq9zytI(fVar.c(), fVar.getLayoutDirection(), fVar)));
        }
    }

    public static final /* synthetic */ e overlay(e eVar, ColorStyle colorStyle, t1 t1Var) {
        r.f(eVar, "<this>");
        r.f(colorStyle, "color");
        r.f(t1Var, "shape");
        return eVar.h(b.c(eVar, new AnonymousClass1(t1Var, colorStyle)));
    }

    public static /* synthetic */ e overlay$default(e eVar, ColorStyle colorStyle, t1 t1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        return overlay(eVar, colorStyle, t1Var);
    }
}
