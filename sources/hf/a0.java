package hf;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f11924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f11925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d0 f11926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11929f;

    public a0(e eVar) {
        ae.r.f(eVar, "upstream");
        this.f11924a = eVar;
        c cVarD = eVar.d();
        this.f11925b = cVarD;
        d0 d0Var = cVarD.f11933a;
        this.f11926c = d0Var;
        this.f11927d = d0Var != null ? d0Var.f11949b : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // hf.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long X(hf.c r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            ae.r.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f11928e
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            hf.d0 r5 = r8.f11926c
            if (r5 == 0) goto L2a
            hf.c r6 = r8.f11925b
            hf.d0 r6 = r6.f11933a
            if (r5 != r6) goto L2b
            int r5 = r8.f11927d
            ae.r.c(r6)
            int r6 = r6.f11949b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            hf.e r0 = r8.f11924a
            long r1 = r8.f11929f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.F(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            hf.d0 r0 = r8.f11926c
            if (r0 != 0) goto L53
            hf.c r0 = r8.f11925b
            hf.d0 r0 = r0.f11933a
            if (r0 == 0) goto L53
            r8.f11926c = r0
            ae.r.c(r0)
            int r0 = r0.f11949b
            r8.f11927d = r0
        L53:
            hf.c r0 = r8.f11925b
            long r0 = r0.size()
            long r2 = r8.f11929f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            hf.c r2 = r8.f11925b
            long r4 = r8.f11929f
            r3 = r9
            r6 = r10
            r2.G(r3, r4, r6)
            long r0 = r8.f11929f
            long r0 = r0 + r10
            r8.f11929f = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a0.X(hf.c, long):long");
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11928e = true;
    }

    @Override // hf.i0
    public j0 e() {
        return this.f11924a.e();
    }
}
