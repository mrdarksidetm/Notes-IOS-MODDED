package l1;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r9, float r10, float r11, float r12, m1.c r13) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.l0.a(float, float, float, float, m1.c):long");
    }

    public static final long b(int i10) {
        return j0.r(md.c0.b(md.c0.b(i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return j0.r(md.c0.b(md.c0.b(md.c0.b(j10) & 4294967295L) << 32));
    }

    public static /* synthetic */ long e(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    public static final long f(long j10, long j11) {
        long jS = j0.s(j10, j0.z(j11));
        float fX = j0.x(j11);
        float fX2 = j0.x(jS);
        float f10 = 1.0f - fX2;
        float f11 = (fX * f10) + fX2;
        return a((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((j0.B(jS) * fX2) + ((j0.B(j11) * fX) * f10)) / f11, (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((j0.A(jS) * fX2) + ((j0.A(j11) * fX) * f10)) / f11, f11 == 0.0f ? 0.0f : ((j0.y(jS) * fX2) + ((j0.y(j11) * fX) * f10)) / f11, f11, j0.z(j11));
    }

    public static final float g(long j10) {
        m1.c cVarZ = j0.z(j10);
        if (!m1.b.e(cVarZ.g(), m1.b.f15189a.b())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) m1.b.h(cVarZ.g()))).toString());
        }
        ae.r.d(cVarZ, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        m1.i iVarI = ((m1.w) cVarZ).I();
        return h((float) ((iVarI.a(j0.B(j10)) * 0.2126d) + (iVarI.a(j0.A(j10)) * 0.7152d) + (iVarI.a(j0.y(j10)) * 0.0722d)));
    }

    private static final float h(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static final int i(long j10) {
        return (int) md.c0.b(j0.s(j10, m1.g.f15198a.w()) >>> 32);
    }
}
