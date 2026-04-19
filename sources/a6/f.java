package a6;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f606a = new f();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f607a;

        static {
            int[] iArr = new int[k6.h.values().length];
            try {
                iArr[k6.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k6.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f607a = iArr;
        }
    }

    private f() {
    }

    public static final int a(int i10, int i11, int i12, int i13, k6.h hVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f607a[hVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new md.q();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return ge.o.d(iMin, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, k6.h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f607a[hVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new md.q();
    }

    public static final double c(int i10, int i11, int i12, int i13, k6.h hVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f607a[hVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new md.q();
    }
}
