package i0;

import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f12261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0.v f12262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12263c;

    public y(n nVar, j0.v vVar, int i10) {
        this.f12261a = nVar;
        this.f12262b = vVar;
        this.f12263c = i10;
    }

    public static /* synthetic */ x c(y yVar, int i10, int i11, long j10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
        }
        if ((i12 & 2) != 0) {
            i11 = yVar.f12263c;
        }
        return yVar.b(i10, i11, j10);
    }

    public abstract x a(int i10, Object obj, Object obj2, int i11, int i12, List<? extends t0> list);

    public final x b(int i10, int i11, long j10) {
        int iO;
        Object objA = this.f12261a.a(i10);
        Object objD = this.f12261a.d(i10);
        List<t0> listM0 = this.f12262b.m0(i10, j10);
        if (w2.b.l(j10)) {
            iO = w2.b.p(j10);
        } else {
            if (!w2.b.k(j10)) {
                throw new IllegalArgumentException("does not have fixed height".toString());
            }
            iO = w2.b.o(j10);
        }
        return a(i10, objA, objD, iO, i11, listM0);
    }

    public final j0.t d() {
        return this.f12261a.e();
    }
}
