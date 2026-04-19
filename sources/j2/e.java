package j2;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f13829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13830b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13831c;

    public e(r0 r0Var) {
        this.f13829a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L20
            j2.r0 r2 = r5.f13829a
            android.text.Layout r2 = r2.h()
            int r2 = j2.g.a(r2, r6, r7)
            j2.r0 r3 = r5.f13829a
            int r3 = r3.u(r2)
            j2.r0 r4 = r5.f13829a
            int r2 = r4.o(r2)
            if (r6 == r3) goto L1e
            if (r6 != r2) goto L20
        L1e:
            r2 = r0
            goto L21
        L20:
            r2 = r1
        L21:
            int r3 = r6 * 4
            if (r9 == 0) goto L29
            if (r2 == 0) goto L2e
            r0 = r1
            goto L2e
        L29:
            if (r2 == 0) goto L2d
            r0 = 2
            goto L2e
        L2d:
            r0 = 3
        L2e:
            int r3 = r3 + r0
            int r0 = r5.f13830b
            if (r0 != r3) goto L36
            float r6 = r5.f13831c
            return r6
        L36:
            if (r9 == 0) goto L3f
            j2.r0 r9 = r5.f13829a
            float r6 = r9.z(r6, r7)
            goto L45
        L3f:
            j2.r0 r9 = r5.f13829a
            float r6 = r9.B(r6, r7)
        L45:
            if (r8 == 0) goto L4b
            r5.f13830b = r3
            r5.f13831c = r6
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.e.a(int, boolean, boolean, boolean):float");
    }

    public final float b(int i10) {
        return a(i10, false, false, true);
    }

    public final float c(int i10) {
        return a(i10, true, true, true);
    }

    public final float d(int i10) {
        return a(i10, false, false, false);
    }

    public final float e(int i10) {
        return a(i10, true, true, false);
    }
}
