package d1;

import ae.n0;
import c0.u0;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import t0.f3;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9437k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<zd.a<md.i0>, md.i0> f9438a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9440c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f9444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f9446i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Object> f9439b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<Set<? extends Object>, k, md.i0> f9441d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.l<Object, md.i0> f9442e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0.d<a> f9443f = new v0.d<>(new a[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f9447j = -1;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zd.l<Object, md.i0> f9448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f9449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z.t<Object> f9450c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9457j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9451d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v0.f<Object> f9452e = new v0.f<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final z.u<Object, z.t<Object>> f9453f = new z.u<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final z.v<Object> f9454g = new z.v<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final v0.d<t0.f0<?>> f9455h = new v0.d<>(new t0.f0[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final t0.g0 f9456i = new C0224a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final v0.f<t0.f0<?>> f9458k = new v0.f<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final HashMap<t0.f0<?>, Object> f9459l = new HashMap<>();

        /* JADX INFO: renamed from: d1.z$a$a, reason: collision with other inner class name */
        public static final class C0224a implements t0.g0 {
            C0224a() {
            }

            @Override // t0.g0
            public void a(t0.f0<?> f0Var) {
                a.this.f9457j++;
            }

            @Override // t0.g0
            public void b(t0.f0<?> f0Var) {
                a aVar = a.this;
                aVar.f9457j--;
            }
        }

        public a(zd.l<Object, md.i0> lVar) {
            this.f9448a = lVar;
        }

        private final void d(Object obj) {
            int i10 = this.f9451d;
            z.t<Object> tVar = this.f9450c;
            if (tVar == null) {
                return;
            }
            long[] jArr = tVar.f24106a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = tVar.f24107b[i14];
                            boolean z10 = tVar.f24108c[i14] != i10;
                            if (z10) {
                                m(obj, obj2);
                            }
                            if (z10) {
                                tVar.o(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(java.lang.Object r21, int r22, java.lang.Object r23, z.t<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r0.f9457j
                if (r3 <= 0) goto Lb
                return
            Lb:
                r3 = -1
                r4 = r24
                int r4 = r4.n(r1, r2, r3)
                boolean r5 = r1 instanceof t0.f0
                r6 = 2
                if (r5 == 0) goto L98
                if (r4 == r2) goto L98
                r2 = r1
                t0.f0 r2 = (t0.f0) r2
                t0.f0$a r2 = r2.w()
                java.util.HashMap<t0.f0<?>, java.lang.Object> r5 = r0.f9459l
                java.lang.Object r7 = r2.a()
                r5.put(r1, r7)
                z.w r2 = r2.b()
                v0.f<t0.f0<?>> r5 = r0.f9458k
                r5.f(r1)
                java.lang.Object[] r7 = r2.f24107b
                long[] r2 = r2.f24106a
                int r8 = r2.length
                int r8 = r8 - r6
                if (r8 < 0) goto L96
                r10 = 0
            L3b:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L90
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L55:
                if (r15 >= r13) goto L8d
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L64
                r16 = 1
                goto L66
            L64:
                r16 = 0
            L66:
                if (r16 == 0) goto L86
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                d1.g0 r9 = (d1.g0) r9
                boolean r3 = r9 instanceof d1.h0
                if (r3 == 0) goto L80
                r3 = r9
                d1.h0 r3 = (d1.h0) r3
                int r14 = d1.g.a(r6)
                r3.y(r14)
            L80:
                r5.a(r9, r1)
                r3 = 8
                goto L87
            L86:
                r3 = r14
            L87:
                long r11 = r11 >> r3
                int r15 = r15 + 1
                r14 = r3
                r3 = -1
                goto L55
            L8d:
                r3 = r14
                if (r13 != r3) goto L96
            L90:
                if (r10 == r8) goto L96
                int r10 = r10 + 1
                r3 = -1
                goto L3b
            L96:
                r2 = -1
                goto L99
            L98:
                r2 = r3
            L99:
                if (r4 != r2) goto Lb0
                boolean r2 = r1 instanceof d1.h0
                if (r2 == 0) goto La9
                r2 = r1
                d1.h0 r2 = (d1.h0) r2
                int r3 = d1.g.a(r6)
                r2.y(r3)
            La9:
                v0.f<java.lang.Object> r2 = r0.f9452e
                r3 = r23
                r2.a(r1, r3)
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.z.a.l(java.lang.Object, int, java.lang.Object, z.t):void");
        }

        private final void m(Object obj, Object obj2) {
            this.f9452e.e(obj2, obj);
            if (!(obj2 instanceof t0.f0) || this.f9452e.c(obj2)) {
                return;
            }
            this.f9458k.f(obj2);
            this.f9459l.remove(obj2);
        }

        public final void c() {
            this.f9452e.b();
            this.f9453f.h();
            this.f9458k.b();
            this.f9459l.clear();
        }

        public final void e(Object obj) {
            z.t<Object> tVarN = this.f9453f.n(obj);
            if (tVarN == null) {
                return;
            }
            Object[] objArr = tVarN.f24107b;
            int[] iArr = tVarN.f24108c;
            long[] jArr = tVarN.f24106a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m(obj, obj2);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        public final zd.l<Object, md.i0> f() {
            return this.f9448a;
        }

        public final boolean g() {
            return this.f9453f.f();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h() {
            /*
                r17 = this;
                r0 = r17
                z.v<java.lang.Object> r1 = r0.f9454g
                zd.l<java.lang.Object, md.i0> r2 = r0.f9448a
                java.lang.Object[] r3 = r1.f24051b
                long[] r4 = r1.f24050a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L4e
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L49
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L47
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L38
                r13 = 1
                goto L39
            L38:
                r13 = r6
            L39:
                if (r13 == 0) goto L43
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L43:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L47:
                if (r10 != r11) goto L4e
            L49:
                if (r7 == r5) goto L4e
                int r7 = r7 + 1
                goto L11
            L4e:
                r1.i()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.z.a.h():void");
        }

        public final void i(Object obj, zd.l<Object, md.i0> lVar, zd.a<md.i0> aVar) {
            Object obj2 = this.f9449b;
            z.t<Object> tVar = this.f9450c;
            int i10 = this.f9451d;
            this.f9449b = obj;
            this.f9450c = this.f9453f.b(obj);
            if (this.f9451d == -1) {
                this.f9451d = p.H().f();
            }
            t0.g0 g0Var = this.f9456i;
            v0.d<t0.g0> dVarC = f3.c();
            try {
                dVarC.b(g0Var);
                k.f9368e.f(lVar, null, aVar);
                dVarC.x(dVarC.o() - 1);
                Object obj3 = this.f9449b;
                ae.r.c(obj3);
                d(obj3);
                this.f9449b = obj2;
                this.f9450c = tVar;
                this.f9451d = i10;
            } catch (Throwable th) {
                dVarC.x(dVarC.o() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x02d4 A[EDGE_INSN: B:121:0x02d4->B:266:0x02de BREAK  A[LOOP:5: B:108:0x0294->B:122:0x02d6], PHI: r19
  0x02d4: PHI (r19v38 boolean) = (r19v37 boolean), (r19v39 boolean) binds: [B:109:0x02a2, B:120:0x02d2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x053e A[PHI: r19
  0x053e: PHI (r19v13 boolean) = (r19v12 boolean), (r19v14 boolean) binds: [B:208:0x050c, B:219:0x053c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:263:0x02de A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0259 A[PHI: r19
  0x0259: PHI (r19v44 boolean) = (r19v43 boolean), (r19v45 boolean) binds: [B:84:0x0227, B:95:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean j(java.util.Set<? extends java.lang.Object> r37) {
            /*
                Method dump skipped, instruction units count: 1544
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.z.a.j(java.util.Set):boolean");
        }

        public final void k(Object obj) {
            Object obj2 = this.f9449b;
            ae.r.c(obj2);
            int i10 = this.f9451d;
            z.t<Object> tVar = this.f9450c;
            if (tVar == null) {
                tVar = new z.t<>(0, 1, null);
                this.f9450c = tVar;
                this.f9453f.q(obj2, tVar);
                md.i0 i0Var = md.i0.f15558a;
            }
            l(obj, i10, obj2, tVar);
        }

        public final void n(zd.l<Object, Boolean> lVar) {
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            long j10;
            int i12;
            long j11;
            int i13;
            z.u<Object, z.t<Object>> uVar = this.f9453f;
            long[] jArr3 = uVar.f24112a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j12 = jArr3[i14];
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = uVar.f24113b[i18];
                            z.t tVar = (z.t) uVar.f24114c[i18];
                            Boolean boolInvoke = lVar.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = tVar.f24107b;
                                int[] iArr = tVar.f24108c;
                                long[] jArr4 = tVar.f24106a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i12 = i16;
                                    int i19 = 0;
                                    while (true) {
                                        long j14 = jArr4[i19];
                                        i11 = i14;
                                        j10 = j12;
                                        j11 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j14 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    m(obj, obj2);
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j12 = j10;
                                    }
                                } else {
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                            }
                            if (boolInvoke.booleanValue()) {
                                uVar.o(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = i14;
                            j10 = j12;
                            i12 = i16;
                            j11 = j13;
                            i13 = i15;
                        }
                        j12 = j10 >> i13;
                        i17++;
                        i15 = i13;
                        j13 = j11;
                        jArr3 = jArr2;
                        i16 = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i24 = i14;
                    if (i16 != i15) {
                        return;
                    } else {
                        i10 = i24;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 == length) {
                    return;
                }
                i14 = i10 + 1;
                jArr3 = jArr;
            }
        }

        public final void o(t0.f0<?> f0Var) {
            long[] jArr;
            long[] jArr2;
            int i10;
            z.t<Object> tVar;
            z.u<Object, z.t<Object>> uVar = this.f9453f;
            int iF = p.H().f();
            Object objB = this.f9452e.d().b(f0Var);
            if (objB == null) {
                return;
            }
            if (!(objB instanceof z.v)) {
                z.t<Object> tVarB = uVar.b(objB);
                if (tVarB == null) {
                    tVarB = new z.t<>(0, 1, null);
                    uVar.q(objB, tVarB);
                    md.i0 i0Var = md.i0.f15558a;
                }
                l(f0Var, iF, objB, tVarB);
                return;
            }
            z.v vVar = (z.v) objB;
            Object[] objArr = vVar.f24051b;
            long[] jArr3 = vVar.f24050a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i14];
                            z.t<Object> tVarB2 = uVar.b(obj);
                            jArr2 = jArr3;
                            if (tVarB2 == null) {
                                tVar = new z.t<>(0, 1, null);
                                uVar.q(obj, tVar);
                                md.i0 i0Var2 = md.i0.f15558a;
                            } else {
                                tVar = tVarB2;
                            }
                            l(f0Var, iF, obj, tVar);
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    static final class b extends ae.s implements zd.p<Set<? extends Object>, k, md.i0> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, k kVar) {
            z.this.i(set);
            if (z.this.m()) {
                z.this.r();
            }
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(Set<? extends Object> set, k kVar) {
            a(set, kVar);
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.l<Object, md.i0> {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            if (z.this.f9445h) {
                return;
            }
            v0.d dVar = z.this.f9443f;
            z zVar = z.this;
            synchronized (dVar) {
                a aVar = zVar.f9446i;
                ae.r.c(aVar);
                aVar.k(obj);
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.a<md.i0> {
        d() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                v0.d dVar = z.this.f9443f;
                z zVar = z.this;
                synchronized (dVar) {
                    if (!zVar.f9440c) {
                        zVar.f9440c = true;
                        try {
                            v0.d dVar2 = zVar.f9443f;
                            int iO = dVar2.o();
                            if (iO > 0) {
                                Object[] objArrN = dVar2.n();
                                int i10 = 0;
                                do {
                                    ((a) objArrN[i10]).h();
                                    i10++;
                                } while (i10 < iO);
                            }
                            zVar.f9440c = false;
                        } finally {
                        }
                    }
                    md.i0 i0Var = md.i0.f15558a;
                }
            } while (z.this.m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(zd.l<? super zd.a<md.i0>, md.i0> lVar) {
        this.f9438a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        Object objN0;
        do {
            obj = this.f9439b.get();
            if (obj == null) {
                objN0 = set;
            } else if (obj instanceof Set) {
                objN0 = nd.u.p(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new md.i();
                }
                objN0 = nd.c0.n0((Collection) obj, nd.t.d(set));
            }
        } while (!u0.a(this.f9439b, obj, objN0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z10;
        synchronized (this.f9443f) {
            z10 = this.f9440c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> setP = p();
            if (setP == null) {
                return z11;
            }
            synchronized (this.f9443f) {
                v0.d<a> dVar = this.f9443f;
                int iO = dVar.o();
                if (iO > 0) {
                    a[] aVarArrN = dVar.n();
                    int i10 = 0;
                    do {
                        z11 = aVarArrN[i10].j(setP) || z11;
                        i10++;
                    } while (i10 < iO);
                }
                md.i0 i0Var = md.i0.f15558a;
            }
        }
    }

    private final <T> a n(zd.l<? super T, md.i0> lVar) {
        a aVar;
        v0.d<a> dVar = this.f9443f;
        int iO = dVar.o();
        if (iO > 0) {
            a[] aVarArrN = dVar.n();
            int i10 = 0;
            do {
                aVar = aVarArrN[i10];
                if (aVar.f() == lVar) {
                    break;
                }
                i10++;
            } while (i10 < iO);
            aVar = null;
        } else {
            aVar = null;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        ae.r.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((zd.l) n0.e(lVar, 1));
        this.f9443f.b(aVar3);
        return aVar3;
    }

    private final Set<Object> p() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.f9439b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new md.i();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!u0.a(this.f9439b, obj, objSubList));
        return set;
    }

    private final Void q() {
        t0.o.u("Unexpected notification");
        throw new md.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.f9438a.invoke(new d());
    }

    public final void j() {
        synchronized (this.f9443f) {
            v0.d<a> dVar = this.f9443f;
            int iO = dVar.o();
            if (iO > 0) {
                int i10 = 0;
                a[] aVarArrN = dVar.n();
                do {
                    aVarArrN[i10].c();
                    i10++;
                } while (i10 < iO);
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void k(Object obj) {
        synchronized (this.f9443f) {
            v0.d<a> dVar = this.f9443f;
            int iO = dVar.o();
            int i10 = 0;
            for (int i11 = 0; i11 < iO; i11++) {
                dVar.n()[i11].e(obj);
                if (!r5.g()) {
                    i10++;
                } else if (i10 > 0) {
                    dVar.n()[i11 - i10] = dVar.n()[i11];
                }
            }
            int i12 = iO - i10;
            nd.o.q(dVar.n(), null, i12, iO);
            dVar.B(i12);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void l(zd.l<Object, Boolean> lVar) {
        synchronized (this.f9443f) {
            v0.d<a> dVar = this.f9443f;
            int iO = dVar.o();
            int i10 = 0;
            for (int i11 = 0; i11 < iO; i11++) {
                dVar.n()[i11].n(lVar);
                if (!r5.g()) {
                    i10++;
                } else if (i10 > 0) {
                    dVar.n()[i11 - i10] = dVar.n()[i11];
                }
            }
            int i12 = iO - i10;
            nd.o.q(dVar.n(), null, i12, iO);
            dVar.B(i12);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final <T> void o(T t10, zd.l<? super T, md.i0> lVar, zd.a<md.i0> aVar) {
        a aVarN;
        synchronized (this.f9443f) {
            aVarN = n(lVar);
        }
        boolean z10 = this.f9445h;
        a aVar2 = this.f9446i;
        long j10 = this.f9447j;
        if (j10 != -1) {
            if (!(j10 == t0.c.a())) {
                throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + t0.c.a() + ", name=" + t0.c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
            }
        }
        try {
            this.f9445h = false;
            this.f9446i = aVarN;
            this.f9447j = Thread.currentThread().getId();
            aVarN.i(t10, this.f9442e, aVar);
        } finally {
            this.f9446i = aVar2;
            this.f9445h = z10;
            this.f9447j = j10;
        }
    }

    public final void s() {
        this.f9444g = k.f9368e.g(this.f9441d);
    }

    public final void t() {
        f fVar = this.f9444g;
        if (fVar != null) {
            fVar.dispose();
        }
    }
}
