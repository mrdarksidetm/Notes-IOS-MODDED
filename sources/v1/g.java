package v1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21929c = v0.d.f21872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.r f21930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f21931b = new n();

    public g(y1.r rVar) {
        this.f21930a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, java.util.List<? extends androidx.compose.ui.e.c> r14) {
        /*
            r11 = this;
            v1.n r0 = r11.f21931b
            int r1 = r14.size()
            r2 = 0
            r3 = 1
            r4 = r2
        L9:
            if (r4 >= r1) goto L5f
            java.lang.Object r5 = r14.get(r4)
            androidx.compose.ui.e$c r5 = (androidx.compose.ui.e.c) r5
            if (r3 == 0) goto L48
            v0.d r6 = r0.g()
            int r7 = r6.o()
            if (r7 <= 0) goto L36
            java.lang.Object[] r6 = r6.n()
            r8 = r2
        L22:
            r9 = r6[r8]
            r10 = r9
            v1.m r10 = (v1.m) r10
            androidx.compose.ui.e$c r10 = r10.j()
            boolean r10 = ae.r.b(r10, r5)
            if (r10 == 0) goto L32
            goto L37
        L32:
            int r8 = r8 + 1
            if (r8 < r7) goto L22
        L36:
            r9 = 0
        L37:
            v1.m r9 = (v1.m) r9
            if (r9 == 0) goto L47
            r9.m()
            w1.b r0 = r9.k()
            r0.b(r12)
            r0 = r9
            goto L5c
        L47:
            r3 = r2
        L48:
            v1.m r6 = new v1.m
            r6.<init>(r5)
            w1.b r5 = r6.k()
            r5.b(r12)
            v0.d r0 = r0.g()
            r0.b(r6)
            r0 = r6
        L5c:
            int r4 = r4 + 1
            goto L9
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.a(long, java.util.List):void");
    }

    public final boolean b(h hVar, boolean z10) {
        if (this.f21931b.a(hVar.a(), this.f21930a, hVar, z10)) {
            return this.f21931b.e(hVar) || this.f21931b.f(hVar.a(), this.f21930a, hVar, z10);
        }
        return false;
    }

    public final void c() {
        this.f21931b.d();
        this.f21931b.c();
    }

    public final void d() {
        this.f21931b.h();
    }
}
