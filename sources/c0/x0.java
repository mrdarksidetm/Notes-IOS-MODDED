package c0;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double d16 = -dSqrt;
        t tVarA = u.a(d15);
        tVarA.f6200a += d16;
        tVarA.f6200a *= 0.5d;
        tVarA.f6201b *= 0.5d;
        t tVarA2 = u.a(d15);
        double d17 = -1;
        tVarA2.f6200a *= d17;
        tVarA2.f6201b *= d17;
        tVarA2.f6200a += d16;
        tVarA2.f6200a *= 0.5d;
        tVarA2.f6201b *= 0.5d;
        return d(tVarA, tVarA2, d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13, f14);
    }

    private static final double c(t tVar, double d10, double d11, double d12) {
        double d13;
        double d14 = d12;
        double dF = tVar.f();
        double d15 = dF * d10;
        double d16 = d11 - d15;
        double dLog = Math.log(Math.abs(d14 / d10)) / dF;
        double dLog2 = Math.log(Math.abs(d14 / d16));
        double dLog3 = dLog2;
        int i10 = 0;
        while (true) {
            d13 = dLog3 / dF;
            if (i10 >= 6) {
                break;
            }
            dLog3 = dLog2 - Math.log(Math.abs(d13));
            i10++;
        }
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d13;
        } else {
            if (!(!((Double.isInfinite(d13) || Double.isNaN(d13)) ? false : true))) {
                dLog = Math.max(dLog, d13);
            }
        }
        double d17 = (-(d15 + d16)) / (dF * d16);
        double d18 = dF * d17;
        double dExp = (Math.exp(d18) * d10) + (d16 * d17 * Math.exp(d18));
        if (Double.isNaN(d17) || d17 <= 0.0d) {
            d14 = -d14;
        } else if (d17 <= 0.0d || (-dExp) >= d14) {
            dLog = (-(2.0d / dF)) - (d10 / d16);
        } else {
            if (d16 < 0.0d && d10 > 0.0d) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d19 = dF * dLog;
            double d20 = d14;
            double dExp2 = dLog - ((((d10 + (d16 * dLog)) * Math.exp(d19)) + d14) / ((((((double) 1) + d19) * d16) + d15) * Math.exp(d19)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d14 = d20;
        }
        return dLog;
    }

    private static final long d(t tVar, t tVar2, double d10, double d11, double d12, double d13) {
        double dG;
        double d14 = d11;
        if (d12 == 0.0d) {
            if (d14 == 0.0d) {
                return 0L;
            }
        }
        if (d12 < 0.0d) {
            d14 = -d14;
        }
        double dAbs = Math.abs(d12);
        if (d10 > 1.0d) {
            dG = e(tVar, tVar2, dAbs, d14, d13);
        } else {
            double d15 = d14;
            dG = d10 < 1.0d ? g(tVar, dAbs, d15, d13) : c(tVar, dAbs, d15, d13);
        }
        return (long) (dG * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double e(c0.t r29, c0.t r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.x0.e(c0.t, c0.t, double, double, double):double");
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double g(t tVar, double d10, double d11, double d12) {
        double dF = tVar.f();
        double dE = (d11 - (dF * d10)) / tVar.e();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (dE * dE))) / dF;
    }
}
