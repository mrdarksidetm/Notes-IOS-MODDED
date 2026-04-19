package w1;

import ae.j;
import ge.o;
import md.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f22379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.a[] f22381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f22383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f22384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f22385h;

    public enum a {
        Lsq2,
        Impulse
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22389a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22389a = iArr;
        }
    }

    public c(boolean z10, a aVar) {
        this.f22378a = z10;
        this.f22379b = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f22389a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new q();
            }
            i11 = 3;
        }
        this.f22380c = i11;
        this.f22381d = new w1.a[20];
        this.f22383f = new float[20];
        this.f22384g = new float[20];
        this.f22385h = new float[3];
    }

    public /* synthetic */ c(boolean z10, a aVar, int i10, j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.i(fArr2, fArr, i10, 2, this.f22385h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f22382e + 1) % 20;
        this.f22382e = i10;
        e.j(this.f22381d, i10, j10, f10);
    }

    public final float c() {
        float f10;
        float[] fArr = this.f22383f;
        float[] fArr2 = this.f22384g;
        int i10 = this.f22382e;
        w1.a aVar = this.f22381d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        w1.a aVar2 = aVar;
        while (true) {
            w1.a aVar3 = this.f22381d[i10];
            if (aVar3 == null) {
                break;
            }
            float fB = aVar.b() - aVar3.b();
            float fAbs = Math.abs(aVar3.b() - aVar2.b());
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = aVar3.a();
            fArr2[i11] = -fB;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            aVar2 = aVar3;
        }
        if (i11 < this.f22380c) {
            return 0.0f;
        }
        int i12 = b.f22389a[this.f22379b.ordinal()];
        if (i12 == 1) {
            f10 = e.f(fArr, fArr2, i11, this.f22378a);
        } else {
            if (i12 != 2) {
                throw new q();
            }
            f10 = b(fArr, fArr2, i11);
        }
        return f10 * 1000;
    }

    public final float d(float f10) {
        if (f10 > 0.0f) {
            float fC = c();
            if (fC == 0.0f) {
                return 0.0f;
            }
            return fC > 0.0f ? o.g(fC, f10) : o.c(fC, -f10);
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f10).toString());
    }

    public final void e() {
        nd.o.t(this.f22381d, null, 0, 0, 6, null);
        this.f22382e = 0;
    }
}
