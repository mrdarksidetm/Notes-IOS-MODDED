package ge;

import ae.r;
import ge.g;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double f(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float g(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double j(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static float k(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static int l(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static long m(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static long n(long j10, f<Long> fVar) {
        Object objF;
        r.f(fVar, "range");
        if (fVar instanceof e) {
            return ((Number) o(Long.valueOf(j10), (e) fVar)).longValue();
        }
        if (fVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + com.amazon.a.a.o.c.a.b.f7490a);
        }
        if (j10 < ((Number) fVar.d()).longValue()) {
            objF = fVar.d();
        } else {
            if (j10 <= ((Number) fVar.f()).longValue()) {
                return j10;
            }
            objF = fVar.f();
        }
        return ((Number) objF).longValue();
    }

    public static final <T extends Comparable<? super T>> T o(T t10, e<T> eVar) {
        r.f(t10, "<this>");
        r.f(eVar, "range");
        if (!eVar.isEmpty()) {
            return (!eVar.a(t10, eVar.d()) || eVar.a(eVar.d(), t10)) ? (!eVar.a(eVar.f(), t10) || eVar.a(t10, eVar.f())) ? t10 : eVar.f() : eVar.d();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static g p(int i10, int i11) {
        return g.f11533d.a(i10, i11, -1);
    }

    public static long q(l lVar, ee.c cVar) {
        r.f(lVar, "<this>");
        r.f(cVar, "random");
        try {
            return ee.d.d(cVar, lVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static g r(g gVar) {
        r.f(gVar, "<this>");
        return g.f11533d.a(gVar.n(), gVar.l(), -gVar.o());
    }

    public static g s(g gVar, int i10) {
        r.f(gVar, "<this>");
        n.a(i10 > 0, Integer.valueOf(i10));
        g.a aVar = g.f11533d;
        int iL = gVar.l();
        int iN = gVar.n();
        if (gVar.o() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iL, iN, i10);
    }

    public static i t(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? i.f11541e.a() : new i(i10, i11 - 1);
    }
}
