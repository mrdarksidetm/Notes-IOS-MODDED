package c0;

import c0.o0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> V b(j1<T, V> j1Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return j1Var.a().invoke(t10);
    }

    public static final <T> k0<T> c(a0<T> a0Var, w0 w0Var, long j10) {
        return new k0<>(a0Var, w0Var, j10, null);
    }

    public static /* synthetic */ k0 d(a0 a0Var, w0 w0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            w0Var = w0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = b1.c(0, 0, 2, null);
        }
        return c(a0Var, w0Var, j10);
    }

    public static final <T> o0<T> e(zd.l<? super o0.b<T>, md.i0> lVar) {
        o0.b bVar = new o0.b();
        lVar.invoke(bVar);
        return new o0<>(bVar);
    }

    public static final <T> a1<T> f(float f10, float f11, T t10) {
        return new a1<>(f10, f11, t10);
    }

    public static /* synthetic */ a1 g(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return f(f10, f11, obj);
    }

    public static final <T> i1<T> h(int i10, int i11, b0 b0Var) {
        return new i1<>(i10, i11, b0Var);
    }

    public static /* synthetic */ i1 i(int i10, int i11, b0 b0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            b0Var = d0.c();
        }
        return h(i10, i11, b0Var);
    }
}
