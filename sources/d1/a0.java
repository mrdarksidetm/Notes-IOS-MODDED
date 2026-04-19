package d1;

import t0.v3;

/* JADX INFO: loaded from: classes.dex */
public final class a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f9322b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v3<T>[] f9323c = new v3[16];

    private final int b(T t10, int i10) {
        int i11 = this.f9321a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f9322b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    v3<T> v3Var = this.f9323c[i13];
                    return t10 == (v3Var != null ? v3Var.get() : null) ? i13 : c(i13, t10, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f9321a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f9322b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f9323c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f9321a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f9322b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            t0.v3<T>[] r2 = r3.f9323c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f9321a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f9322b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            t0.v3<T>[] r2 = r3.f9323c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f9321a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a0.c(int, java.lang.Object, int):int");
    }

    public final boolean a(T t10) {
        int iB;
        int i10 = this.f9321a;
        int iC = t0.c.c(t10);
        if (i10 > 0) {
            iB = b(t10, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        v3<T>[] v3VarArr = this.f9323c;
        int length = v3VarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            v3<T>[] v3VarArr2 = new v3[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            nd.o.h(v3VarArr, v3VarArr2, i13, i11, i10);
            nd.o.l(this.f9323c, v3VarArr2, 0, 0, i11, 6, null);
            nd.o.f(this.f9322b, iArr, i13, i11, i10);
            nd.o.k(this.f9322b, iArr, 0, 0, i11, 6, null);
            this.f9323c = v3VarArr2;
            this.f9322b = iArr;
        } else {
            int i14 = i11 + 1;
            nd.o.h(v3VarArr, v3VarArr, i14, i11, i10);
            int[] iArr2 = this.f9322b;
            nd.o.f(iArr2, iArr2, i14, i11, i10);
        }
        this.f9323c[i11] = new v3<>(t10);
        this.f9322b[i11] = iC;
        this.f9321a++;
        return true;
    }

    public final int[] d() {
        return this.f9322b;
    }

    public final int e() {
        return this.f9321a;
    }

    public final v3<T>[] f() {
        return this.f9323c;
    }

    public final void g(int i10) {
        this.f9321a = i10;
    }
}
