package l1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import l1.v1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14523c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14521a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f14522b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f14523c = iArr3;
        }
    }

    public static final d1 a() {
        return new i();
    }

    public static final d1 b(Paint paint) {
        return new i(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return l0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? s0.f14565a.b() : s0.f14565a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f14522b[strokeCap.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return v1.f14620a.b();
            }
            if (i10 == 3) {
                return v1.f14620a.c();
            }
        }
        return v1.f14620a.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f14523c[strokeJoin.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return w1.f14633a.a();
            }
            if (i10 == 3) {
                return w1.f14633a.c();
            }
        }
        return w1.f14633a.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b2.f14496a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(l1.a.c(i10)));
        }
    }

    public static final void m(Paint paint, long j10) {
        paint.setColor(l0.i(j10));
    }

    public static final void n(Paint paint, k0 k0Var) {
        paint.setColorFilter(k0Var != null ? d.b(k0Var) : null);
    }

    public static final void o(Paint paint, int i10) {
        paint.setFilterBitmap(!s0.d(i10, s0.f14565a.b()));
    }

    public static final void p(Paint paint, g1 g1Var) {
        l lVar = (l) g1Var;
        paint.setPathEffect(lVar != null ? lVar.a() : null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i10) {
        Paint.Cap cap;
        v1.a aVar = v1.f14620a;
        if (v1.e(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (v1.e(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            v1.e(i10, aVar.a());
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(android.graphics.Paint r2, int r3) {
        /*
            l1.w1$a r0 = l1.w1.f14633a
            int r1 = r0.b()
            boolean r1 = l1.w1.e(r3, r1)
            if (r1 == 0) goto Lf
        Lc:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
            goto L28
        Lf:
            int r1 = r0.a()
            boolean r1 = l1.w1.e(r3, r1)
            if (r1 == 0) goto L1c
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
            goto L28
        L1c:
            int r0 = r0.c()
            boolean r3 = l1.w1.e(r3, r0)
            if (r3 == 0) goto Lc
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
        L28:
            r2.setStrokeJoin(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.j.s(android.graphics.Paint, int):void");
    }

    public static final void t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void v(Paint paint, int i10) {
        paint.setStyle(e1.d(i10, e1.f14503a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
