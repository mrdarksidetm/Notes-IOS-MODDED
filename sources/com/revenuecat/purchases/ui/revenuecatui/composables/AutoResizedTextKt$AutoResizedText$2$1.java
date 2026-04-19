package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import i2.d0;
import i2.g0;
import md.i0;
import t0.k1;
import w2.t;
import w2.u;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class AutoResizedTextKt$AutoResizedText$2$1 extends s implements l<d0, i0> {
    final /* synthetic */ long $defaultFontSize;
    final /* synthetic */ k1<g0> $resizedTextStyle$delegate;
    final /* synthetic */ k1<Boolean> $shouldDraw$delegate;
    final /* synthetic */ g0 $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$2$1(g0 g0Var, long j10, k1<g0> k1Var, k1<Boolean> k1Var2) {
        super(1);
        this.$style = g0Var;
        this.$defaultFontSize = j10;
        this.$resizedTextStyle$delegate = k1Var;
        this.$shouldDraw$delegate = k1Var2;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(d0 d0Var) {
        invoke2(d0Var);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d0 d0Var) {
        r.f(d0Var, "result");
        if (!d0Var.g()) {
            AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$5(this.$shouldDraw$delegate, true);
            return;
        }
        if (u.f(this.$style.n())) {
            k1<g0> k1Var = this.$resizedTextStyle$delegate;
            g0 g0VarAutoResizedText_W72HBGU$lambda$1 = AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(k1Var);
            k1Var.setValue(g0VarAutoResizedText_W72HBGU$lambda$1.d((15204351 & 1) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.g() : 0L, (15204351 & 2) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.k() : this.$defaultFontSize, (15204351 & 4) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.n() : null, (15204351 & 8) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.l() : null, (15204351 & 16) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.m() : null, (15204351 & 32) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.i() : null, (15204351 & 64) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.j() : null, (15204351 & 128) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.o() : 0L, (15204351 & 256) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.e() : null, (15204351 & 512) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.u() : null, (15204351 & 1024) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.p() : null, (15204351 & 2048) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.d() : 0L, (15204351 & 4096) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.s() : null, (15204351 & 8192) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.r() : null, (15204351 & 16384) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12368a.h() : null, (15204351 & 32768) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.h() : 0, (15204351 & 65536) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.i() : 0, (15204351 & 131072) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.e() : 0L, (15204351 & 262144) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.j() : null, (15204351 & 524288) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12370c : null, (15204351 & 1048576) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.f() : null, (15204351 & 2097152) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.d() : 0, (15204351 & 4194304) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.c() : 0, (15204351 & 8388608) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$1.f12369b.k() : null));
        }
        long jN = AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(this.$resizedTextStyle$delegate).n();
        u.b(jN);
        long jG = u.g(t.f(jN), (float) (((double) t.h(jN)) * 0.95d));
        k1<g0> k1Var2 = this.$resizedTextStyle$delegate;
        g0 g0VarAutoResizedText_W72HBGU$lambda$12 = AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(k1Var2);
        k1Var2.setValue(g0VarAutoResizedText_W72HBGU$lambda$12.d((15204351 & 1) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.g() : 0L, (15204351 & 2) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.k() : jG, (15204351 & 4) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.n() : null, (15204351 & 8) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.l() : null, (15204351 & 16) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.m() : null, (15204351 & 32) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.i() : null, (15204351 & 64) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.j() : null, (15204351 & 128) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.o() : 0L, (15204351 & 256) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.e() : null, (15204351 & 512) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.u() : null, (15204351 & 1024) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.p() : null, (15204351 & 2048) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.d() : 0L, (15204351 & 4096) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.s() : null, (15204351 & 8192) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.r() : null, (15204351 & 16384) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12368a.h() : null, (15204351 & 32768) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.h() : 0, (15204351 & 65536) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.i() : 0, (15204351 & 131072) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.e() : 0L, (15204351 & 262144) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.j() : null, (15204351 & 524288) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12370c : null, (15204351 & 1048576) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.f() : null, (15204351 & 2097152) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.d() : 0, (15204351 & 4194304) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.c() : 0, (15204351 & 8388608) != 0 ? g0VarAutoResizedText_W72HBGU$lambda$12.f12369b.k() : null));
    }
}
