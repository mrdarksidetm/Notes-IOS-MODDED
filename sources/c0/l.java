package c0;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final k<Float, m> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new k<>(l1.b(ae.l.f718a), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static /* synthetic */ k b(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j12 = (i10 & 4) != 0 ? Long.MIN_VALUE : j10;
        long j13 = (i10 & 8) == 0 ? j11 : Long.MIN_VALUE;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    public static final <T, V extends q> k<T, V> c(k<T, V> kVar, T t10, V v10, long j10, long j11, boolean z10) {
        return new k<>(kVar.i(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ k d(k kVar, Object obj, q qVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i10 & 2) != 0) {
            qVar = r.e(kVar.l());
        }
        q qVar2 = qVar;
        if ((i10 & 4) != 0) {
            j10 = kVar.f();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = kVar.c();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = kVar.m();
        }
        return c(kVar, obj, qVar2, j12, j13, z10);
    }

    public static final <T, V extends q> V e(j1<T, V> j1Var, T t10) {
        V vInvoke = j1Var.a().invoke(t10);
        vInvoke.d();
        return vInvoke;
    }
}
