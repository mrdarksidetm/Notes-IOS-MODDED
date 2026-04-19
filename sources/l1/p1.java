package l1;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f14562a = new p1();

    private p1() {
    }

    public final RenderEffect a(n1 n1Var, float f10, float f11, int i10) {
        return n1Var == null ? RenderEffect.createBlurEffect(f10, f11, r.a(i10)) : RenderEffect.createBlurEffect(f10, f11, n1Var.a(), r.a(i10));
    }

    public final RenderEffect b(n1 n1Var, long j10) {
        return n1Var == null ? RenderEffect.createOffsetEffect(k1.f.o(j10), k1.f.p(j10)) : RenderEffect.createOffsetEffect(k1.f.o(j10), k1.f.p(j10), n1Var.a());
    }
}
