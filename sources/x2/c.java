package x2;

import ae.j;
import ae.r;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22948c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22949d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f22950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f22951b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float f14;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = (-(iBinarySearch + 1)) - 1;
                if (i10 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i10 == -1) {
                    float f17 = fArr[0];
                    f13 = fArr2[0];
                    f14 = 0.0f;
                    f11 = 0.0f;
                    f12 = f17;
                } else {
                    float f18 = fArr[i10];
                    int i11 = i10 + 1;
                    float f19 = fArr[i11];
                    float f20 = fArr2[i10];
                    f11 = f18;
                    f12 = f19;
                    f13 = fArr2[i11];
                    f14 = f20;
                }
                fA = d.f22952a.a(f14, f13, f11, f12, fAbs);
            }
            return fSignum * fA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(float[] r5, float[] r6) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r5.length
            int r1 = r6.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L12
            int r0 = r5.length
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r3
        Lf:
            if (r0 != 0) goto L12
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L1a
            r4.f22950a = r5
            r4.f22951b = r6
            return
        L1a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Array lengths must match and be nonzero"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.<init>(float[], float[]):void");
    }

    @Override // x2.a
    public float a(float f10) {
        return f22948c.b(f10, this.f22951b, this.f22950a);
    }

    @Override // x2.a
    public float b(float f10) {
        return f22948c.b(f10, this.f22950a, this.f22951b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f22950a, cVar.f22950a) && Arrays.equals(this.f22951b, cVar.f22951b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f22950a) * 31) + Arrays.hashCode(this.f22951b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f22950a);
        r.e(string, "toString(this)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f22951b);
        r.e(string2, "toString(this)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
