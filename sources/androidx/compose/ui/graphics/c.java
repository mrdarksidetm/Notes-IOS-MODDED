package androidx.compose.ui.graphics;

import l1.m1;
import l1.n1;
import l1.t1;
import l1.u0;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, l<? super d, i0> lVar) {
        return eVar.h(new BlockGraphicsLayerElement(lVar));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10) {
        return eVar.h(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, t1Var, z10, n1Var, j11, j12, i10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t1 t1Var, boolean z10, n1 n1Var, long j11, long j12, int i10, int i11, Object obj) {
        return b(eVar, (i11 & 1) != 0 ? 1.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) == 0 ? f12 : 1.0f, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 0.0f : f14, (i11 & 32) != 0 ? 0.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) == 0 ? f18 : 0.0f, (i11 & 512) != 0 ? 8.0f : f19, (i11 & 1024) != 0 ? g.f2806b.a() : j10, (i11 & 2048) != 0 ? m1.a() : t1Var, (i11 & 4096) != 0 ? false : z10, (i11 & 8192) != 0 ? null : n1Var, (i11 & 16384) != 0 ? u0.a() : j11, (i11 & 32768) != 0 ? u0.a() : j12, (i11 & 65536) != 0 ? b.f2766a.a() : i10);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return b2.u0.c() ? eVar.h(c(androidx.compose.ui.e.f2662a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : eVar;
    }
}
