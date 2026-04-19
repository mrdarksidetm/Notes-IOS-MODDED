package cf;

import java.util.Arrays;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f6946a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f6947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6948c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6949a = new a();

        private a() {
        }
    }

    public g0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f6947b = iArr;
        this.f6948c = -1;
    }

    private final void e() {
        int i10 = this.f6948c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f6946a, i10);
        ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
        this.f6946a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f6947b, i10);
        ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
        this.f6947b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f6948c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f6946a[i11];
            if (obj instanceof ye.f) {
                ye.f fVar = (ye.f) obj;
                if (!ae.r.b(fVar.e(), k.b.f24012a)) {
                    int i12 = this.f6947b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.g(i12));
                    }
                } else if (this.f6947b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f6947b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f6949a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void b() {
        int i10 = this.f6948c;
        int[] iArr = this.f6947b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f6948c = i10 - 1;
        }
        int i11 = this.f6948c;
        if (i11 != -1) {
            this.f6948c = i11 - 1;
        }
    }

    public final void c(ye.f fVar) {
        ae.r.f(fVar, "sd");
        int i10 = this.f6948c + 1;
        this.f6948c = i10;
        if (i10 == this.f6946a.length) {
            e();
        }
        this.f6946a[i10] = fVar;
    }

    public final void d() {
        int[] iArr = this.f6947b;
        int i10 = this.f6948c;
        if (iArr[i10] == -2) {
            this.f6946a[i10] = a.f6949a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f6947b;
        int i10 = this.f6948c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f6948c = i11;
            if (i11 == this.f6946a.length) {
                e();
            }
        }
        Object[] objArr = this.f6946a;
        int i12 = this.f6948c;
        objArr[i12] = obj;
        this.f6947b[i12] = -2;
    }

    public final void g(int i10) {
        this.f6947b[this.f6948c] = i10;
    }

    public String toString() {
        return a();
    }
}
