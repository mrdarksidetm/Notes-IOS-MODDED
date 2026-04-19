package l1;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Comparable<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14575a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final short f14576b = b(5120);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final short f14577c = b(-1025);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f14578d = b(31743);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f14579e = b(1024);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final short f14580f = b(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short f14581g = b(32256);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f14582h = b(-1024);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f14583i = b(Short.MIN_VALUE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short f14584j = b(31744);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final short f14585k = b(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final short f14586l = a(1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final short f14587m = a(-1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f14588n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f10) {
            int i10;
            int i11;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
            int i12 = iFloatToRawIntBits >>> 31;
            int i13 = (iFloatToRawIntBits >>> 23) & 255;
            int i14 = iFloatToRawIntBits & 8388607;
            if (i13 == 255) {
                i10 = i14 != 0 ? 512 : 0;
                i = 31;
            } else {
                int i15 = (i13 - 127) + 15;
                if (i15 >= 31) {
                    i = 49;
                    i10 = 0;
                } else if (i15 > 0) {
                    int i16 = i14 >> 13;
                    if ((i14 & 4096) != 0) {
                        i11 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                        return (short) i11;
                    }
                    i10 = i16;
                    i = i15;
                } else if (i15 >= -10) {
                    int i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i10 = i17 >> 13;
                } else {
                    i10 = 0;
                }
            }
            i11 = i10 | (i12 << 15) | (i << 10);
            return (short) i11;
        }
    }

    static {
        ae.l lVar = ae.l.f718a;
        f14588n = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f10) {
        return b(f14575a.b(f10));
    }

    public static short b(short s10) {
        return s10;
    }

    public static final float c(short s10) {
        int i10;
        int i11;
        int i12 = s10 & 65535;
        int i13 = 32768 & i12;
        int i14 = (i12 >>> 10) & 31;
        int i15 = i12 & 1023;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i10 = (i14 - 15) + 127;
            }
            int i18 = i17;
            i16 = i10;
            i11 = i18;
        } else {
            if (i15 != 0) {
                ae.l lVar = ae.l.f718a;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - f14588n;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
        }
        int i19 = i11 | (i13 << 16) | (i16 << 23);
        ae.l lVar2 = ae.l.f718a;
        return Float.intBitsToFloat(i19);
    }
}
