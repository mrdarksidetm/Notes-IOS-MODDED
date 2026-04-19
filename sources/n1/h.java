package n1;

import l1.f1;
import l1.i0;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    static /* synthetic */ void e(h hVar, f1 f1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = i0.f14518a.b();
        }
        hVar.a(f1Var, i10);
    }

    void a(f1 f1Var, int i10);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(float[] fArr);

    void f(float f10, float f11, long j10);

    void g(float f10, float f11, float f12, float f13);
}
