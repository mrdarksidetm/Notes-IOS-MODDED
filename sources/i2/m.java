package i2;

import java.util.List;
import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    static /* synthetic */ void b(m mVar, l1.b0 b0Var, long j10, s1 s1Var, u2.j jVar, n1.g gVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        mVar.t(b0Var, (i11 & 2) != 0 ? l1.j0.f14524b.j() : j10, (i11 & 4) != 0 ? null : s1Var, (i11 & 8) != 0 ? null : jVar, (i11 & 16) == 0 ? gVar : null, (i11 & 32) != 0 ? n1.f.S.a() : i10);
    }

    static /* synthetic */ void u(m mVar, l1.b0 b0Var, l1.z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        mVar.s(b0Var, zVar, (i11 & 4) != 0 ? Float.NaN : f10, (i11 & 8) != 0 ? null : s1Var, (i11 & 16) != 0 ? null : jVar, (i11 & 32) != 0 ? null : gVar, (i11 & 64) != 0 ? n1.f.S.a() : i10);
    }

    float a();

    void c(long j10, float[] fArr, int i10);

    u2.h d(int i10);

    float e(int i10);

    float f();

    k1.h g(int i10);

    float getHeight();

    float getWidth();

    int h(int i10);

    float i();

    u2.h j(int i10);

    float k(int i10);

    int l(long j10);

    k1.h m(int i10);

    List<k1.h> n();

    int o(int i10);

    int p(int i10, boolean z10);

    int q();

    float r(int i10);

    void s(l1.b0 b0Var, l1.z zVar, float f10, s1 s1Var, u2.j jVar, n1.g gVar, int i10);

    void t(l1.b0 b0Var, long j10, s1 s1Var, u2.j jVar, n1.g gVar, int i10);

    boolean v();

    int w(float f10);

    float x(int i10);
}
