package t0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements o2, c2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f20645i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20646j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f2 f20648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f20649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zd.p<? super l, ? super Integer, md.i0> f20650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e1.e f20651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z.t<Object> f20653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z.u<f0<?>, Object> f20654h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final void a(v2 v2Var, List<d> list, f2 f2Var) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object objY0 = v2Var.Y0(list.get(i10), 0);
                    d2 d2Var = objY0 instanceof d2 ? (d2) objY0 : null;
                    if (d2Var != null) {
                        d2Var.g(f2Var);
                    }
                }
            }
        }

        public final boolean b(s2 s2Var, List<d> list) {
            boolean z10;
            if (!list.isEmpty()) {
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    d dVar = list.get(i10);
                    if (s2Var.B(dVar) && (s2Var.D(s2Var.d(dVar), 0) instanceof d2)) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class b extends ae.s implements zd.l<p, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z.t<Object> f20657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, z.t<Object> tVar) {
            super(1);
            this.f20656b = i10;
            this.f20657c = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(t0.p r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                t0.d2 r2 = t0.d2.this
                int r2 = t0.d2.b(r2)
                int r3 = r0.f20656b
                if (r2 != r3) goto Lb8
                z.t<java.lang.Object> r2 = r0.f20657c
                t0.d2 r3 = t0.d2.this
                z.t r3 = t0.d2.d(r3)
                boolean r2 = ae.r.b(r2, r3)
                if (r2 == 0) goto Lb8
                boolean r2 = r1 instanceof t0.s
                if (r2 == 0) goto Lb8
                z.t<java.lang.Object> r2 = r0.f20657c
                int r3 = r0.f20656b
                t0.d2 r4 = t0.d2.this
                long[] r5 = r2.f24106a
                int r6 = r5.length
                int r6 = r6 + (-2)
                if (r6 < 0) goto Laa
                r9 = 0
            L2e:
                r10 = r5[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto La5
                int r12 = r9 - r6
                int r12 = ~r12
                int r12 = r12 >>> 31
                r13 = 8
                int r12 = 8 - r12
                r14 = 0
            L48:
                if (r14 >= r12) goto La2
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r10
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                r16 = 1
                if (r15 >= 0) goto L58
                r15 = r16
                goto L59
            L58:
                r15 = 0
            L59:
                if (r15 == 0) goto L9c
                int r15 = r9 << 3
                int r15 = r15 + r14
                java.lang.Object[] r8 = r2.f24107b
                r8 = r8[r15]
                int[] r13 = r2.f24108c
                r13 = r13[r15]
                if (r13 == r3) goto L69
                goto L6b
            L69:
                r16 = 0
            L6b:
                if (r16 == 0) goto L94
                r13 = r1
                t0.s r13 = (t0.s) r13
                r13.L(r8, r4)
                boolean r7 = r8 instanceof t0.f0
                if (r7 == 0) goto L7b
                r7 = r8
                t0.f0 r7 = (t0.f0) r7
                goto L7c
            L7b:
                r7 = 0
            L7c:
                if (r7 == 0) goto L94
                r13.K(r7)
                z.u r8 = t0.d2.c(r4)
                if (r8 == 0) goto L94
                r8.n(r7)
                int r7 = r8.d()
                if (r7 != 0) goto L94
                r7 = 0
                t0.d2.e(r4, r7)
            L94:
                if (r16 == 0) goto L99
                r2.o(r15)
            L99:
                r7 = 8
                goto L9d
            L9c:
                r7 = r13
            L9d:
                long r10 = r10 >> r7
                int r14 = r14 + 1
                r13 = r7
                goto L48
            La2:
                r7 = r13
                if (r12 != r7) goto Laa
            La5:
                if (r9 == r6) goto Laa
                int r9 = r9 + 1
                goto L2e
            Laa:
                z.t<java.lang.Object> r1 = r0.f20657c
                int r1 = r1.e()
                if (r1 != 0) goto Lb8
                t0.d2 r1 = t0.d2.this
                r2 = 0
                t0.d2.f(r1, r2)
            Lb8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.d2.b.a(t0.p):void");
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(p pVar) {
            a(pVar);
            return md.i0.f15558a;
        }
    }

    public d2(f2 f2Var) {
        this.f20648b = f2Var;
    }

    private final void F(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 32 : this.f20647a & (-33);
    }

    private final void G(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 16 : this.f20647a & (-17);
    }

    private final boolean p() {
        return (this.f20647a & 32) != 0;
    }

    public final void A(d dVar) {
        this.f20649c = dVar;
    }

    public final void B(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 2 : this.f20647a & (-3);
    }

    public final void C(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 4 : this.f20647a & (-5);
    }

    public final void D(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 64 : this.f20647a & (-65);
    }

    public final void E(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 8 : this.f20647a & (-9);
    }

    public final void H(boolean z10) {
        this.f20647a = z10 ? this.f20647a | 1 : this.f20647a & (-2);
    }

    public final void I(int i10) {
        this.f20652f = i10;
        G(false);
    }

    @Override // t0.o2
    public void a(zd.p<? super l, ? super Integer, md.i0> pVar) {
        this.f20650d = pVar;
    }

    public final void g(f2 f2Var) {
        this.f20648b = f2Var;
    }

    public final void h(l lVar) {
        md.i0 i0Var;
        zd.p<? super l, ? super Integer, md.i0> pVar = this.f20650d;
        e1.e eVar = this.f20651e;
        if (eVar != null && pVar != null) {
            eVar.b(this);
            try {
                pVar.invoke(lVar, 1);
                return;
            } finally {
                eVar.a(this);
            }
        }
        if (pVar != null) {
            pVar.invoke(lVar, 1);
            i0Var = md.i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zd.l<t0.p, md.i0> i(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            z.t<java.lang.Object> r2 = r0.f20653g
            if (r2 == 0) goto L6d
            boolean r4 = r20.q()
            if (r4 != 0) goto L6d
            java.lang.Object[] r4 = r2.f24107b
            int[] r5 = r2.f24108c
            long[] r6 = r2.f24106a
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 1
            r9 = 0
            if (r7 < 0) goto L64
            r10 = r9
        L1c:
            r11 = r6[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L5f
            int r13 = r10 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r9
        L36:
            if (r15 >= r13) goto L5d
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L45
            r16 = r8
            goto L47
        L45:
            r16 = r9
        L47:
            if (r16 == 0) goto L59
            int r16 = r10 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r3 = r5[r16]
            if (r3 == r1) goto L55
            r3 = r8
            goto L56
        L55:
            r3 = r9
        L56:
            if (r3 == 0) goto L59
            goto L65
        L59:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L36
        L5d:
            if (r13 != r14) goto L64
        L5f:
            if (r10 == r7) goto L64
            int r10 = r10 + 1
            goto L1c
        L64:
            r8 = r9
        L65:
            if (r8 == 0) goto L6d
            t0.d2$b r3 = new t0.d2$b
            r3.<init>(r1, r2)
            goto L6e
        L6d:
            r3 = 0
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d2.i(int):zd.l");
    }

    @Override // t0.c2
    public void invalidate() {
        f2 f2Var = this.f20648b;
        if (f2Var != null) {
            f2Var.o(this, null);
        }
    }

    public final d j() {
        return this.f20649c;
    }

    public final boolean k() {
        return this.f20650d != null;
    }

    public final boolean l() {
        return (this.f20647a & 2) != 0;
    }

    public final boolean m() {
        return (this.f20647a & 4) != 0;
    }

    public final boolean n() {
        return (this.f20647a & 64) != 0;
    }

    public final boolean o() {
        return (this.f20647a & 8) != 0;
    }

    public final boolean q() {
        return (this.f20647a & 16) != 0;
    }

    public final boolean r() {
        return (this.f20647a & 1) != 0;
    }

    public final boolean s() {
        if (this.f20648b == null) {
            return false;
        }
        d dVar = this.f20649c;
        return dVar != null ? dVar.b() : false;
    }

    public final u0 t(Object obj) {
        u0 u0VarO;
        f2 f2Var = this.f20648b;
        return (f2Var == null || (u0VarO = f2Var.o(this, obj)) == null) ? u0.IGNORED : u0VarO;
    }

    public final boolean u() {
        return this.f20654h != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:14:0x001c->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(v0.b<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            z.u<t0.f0<?>, java.lang.Object> r1 = r6.f20654h
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r7.o()
            if (r2 == 0) goto L51
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L18
        L16:
            r7 = r0
            goto L4e
        L18:
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof t0.f0
            if (r4 == 0) goto L4a
            t0.f0 r2 = (t0.f0) r2
            t0.e3 r4 = r2.d()
            if (r4 != 0) goto L36
            t0.e3 r4 = t0.f3.q()
        L36:
            t0.f0$a r5 = r2.w()
            java.lang.Object r5 = r5.a()
            java.lang.Object r2 = r1.b(r2)
            boolean r2 = r4.a(r5, r2)
            if (r2 == 0) goto L4a
            r2 = r0
            goto L4b
        L4a:
            r2 = r3
        L4b:
            if (r2 != 0) goto L1c
            r7 = r3
        L4e:
            if (r7 == 0) goto L51
            return r3
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d2.v(v0.b):boolean");
    }

    public final boolean w(Object obj) {
        if (p()) {
            return false;
        }
        z.t<Object> tVar = this.f20653g;
        if (tVar == null) {
            tVar = new z.t<>(0, 1, null);
            this.f20653g = tVar;
        }
        if (tVar.n(obj, this.f20652f, -1) == this.f20652f) {
            return true;
        }
        if (obj instanceof f0) {
            z.u<f0<?>, Object> uVar = this.f20654h;
            if (uVar == null) {
                uVar = new z.u<>(0, 1, null);
                this.f20654h = uVar;
            }
            uVar.q(obj, ((f0) obj).w().a());
        }
        return false;
    }

    public final void x() {
        f2 f2Var = this.f20648b;
        if (f2Var != null) {
            f2Var.f(this);
        }
        this.f20648b = null;
        this.f20653g = null;
        this.f20654h = null;
        e1.e eVar = this.f20651e;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r18 = this;
            r1 = r18
            t0.f2 r0 = r1.f20648b
            if (r0 == 0) goto L63
            z.t<java.lang.Object> r2 = r1.f20653g
            if (r2 == 0) goto L63
            r3 = 1
            r1.F(r3)
            r4 = 0
            java.lang.Object[] r5 = r2.f24107b     // Catch: java.lang.Throwable -> L5e
            int[] r6 = r2.f24108c     // Catch: java.lang.Throwable -> L5e
            long[] r2 = r2.f24106a     // Catch: java.lang.Throwable -> L5e
            int r7 = r2.length     // Catch: java.lang.Throwable -> L5e
            int r7 = r7 + (-2)
            if (r7 < 0) goto L5a
            r8 = r4
        L1b:
            r9 = r2[r8]     // Catch: java.lang.Throwable -> L5e
            long r11 = ~r9     // Catch: java.lang.Throwable -> L5e
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L55
            int r11 = r8 - r7
            int r11 = ~r11     // Catch: java.lang.Throwable -> L5e
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L35:
            if (r13 >= r11) goto L53
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L42
            r14 = r3
            goto L43
        L42:
            r14 = r4
        L43:
            if (r14 == 0) goto L4f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r5[r14]     // Catch: java.lang.Throwable -> L5e
            r14 = r6[r14]     // Catch: java.lang.Throwable -> L5e
            r0.a(r15)     // Catch: java.lang.Throwable -> L5e
        L4f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L35
        L53:
            if (r11 != r12) goto L5a
        L55:
            if (r8 == r7) goto L5a
            int r8 = r8 + 1
            goto L1b
        L5a:
            r1.F(r4)
            goto L63
        L5e:
            r0 = move-exception
            r1.F(r4)
            throw r0
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.d2.y():void");
    }

    public final void z() {
        G(true);
    }
}
