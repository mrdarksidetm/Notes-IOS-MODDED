package t0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s implements c0, m2, f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<?> f20927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<Object> f20928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f20929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<k2> f20930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s2 f20931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0.f<d2> f20932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<d2> f20933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v0.f<f0<?>> f20934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u0.a f20935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u0.a f20936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0.f<d2> f20937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0.a<d2, v0.b<Object>> f20938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s f20940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final y f20942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m f20943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final qd.g f20944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f20945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private zd.p<? super l, ? super Integer, md.i0> f20947v;

    private static final class a implements j2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<k2> f20948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<k2> f20949b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Object> f20950c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<zd.a<md.i0>> f20951d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z.v<j> f20952e;

        public a(Set<k2> set) {
            this.f20948a = set;
        }

        @Override // t0.j2
        public void a(k2 k2Var) {
            this.f20950c.add(k2Var);
        }

        @Override // t0.j2
        public void b(j jVar) {
            z.v<j> vVarA = this.f20952e;
            if (vVarA == null) {
                vVarA = z.b0.a();
                this.f20952e = vVarA;
            }
            vVarA.o(jVar);
            this.f20950c.add(jVar);
        }

        @Override // t0.j2
        public void c(j jVar) {
            this.f20950c.add(jVar);
        }

        @Override // t0.j2
        public void d(k2 k2Var) {
            this.f20949b.add(k2Var);
        }

        @Override // t0.j2
        public void e(zd.a<md.i0> aVar) {
            this.f20951d.add(aVar);
        }

        public final void f() {
            if (!this.f20948a.isEmpty()) {
                Object objA = t3.f20985a.a("Compose:abandons");
                try {
                    Iterator<k2> it = this.f20948a.iterator();
                    while (it.hasNext()) {
                        k2 next = it.next();
                        it.remove();
                        next.b();
                    }
                    md.i0 i0Var = md.i0.f15558a;
                } finally {
                    t3.f20985a.b(objA);
                }
            }
        }

        public final void g() {
            if (!this.f20950c.isEmpty()) {
                Object objA = t3.f20985a.a("Compose:onForgotten");
                try {
                    z.v<j> vVar = this.f20952e;
                    for (int size = this.f20950c.size() - 1; -1 < size; size--) {
                        Object obj = this.f20950c.get(size);
                        ae.n0.a(this.f20948a).remove(obj);
                        if (obj instanceof k2) {
                            ((k2) obj).c();
                        }
                        if (obj instanceof j) {
                            if (vVar == null || !vVar.a((j) obj)) {
                                ((j) obj).k();
                            } else {
                                ((j) obj).f();
                            }
                        }
                    }
                    md.i0 i0Var = md.i0.f15558a;
                } finally {
                }
            }
            if (!this.f20949b.isEmpty()) {
                Object objA2 = t3.f20985a.a("Compose:onRemembered");
                try {
                    List<k2> list = this.f20949b;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        k2 k2Var = list.get(i10);
                        this.f20948a.remove(k2Var);
                        k2Var.d();
                    }
                    md.i0 i0Var2 = md.i0.f15558a;
                } finally {
                }
            }
        }

        public final void h() {
            if (!this.f20951d.isEmpty()) {
                Object objA = t3.f20985a.a("Compose:sideeffects");
                try {
                    List<zd.a<md.i0>> list = this.f20951d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.f20951d.clear();
                    md.i0 i0Var = md.i0.f15558a;
                } finally {
                    t3.f20985a.b(objA);
                }
            }
        }
    }

    public s(q qVar, e<?> eVar, qd.g gVar) {
        this.f20926a = qVar;
        this.f20927b = eVar;
        this.f20928c = new AtomicReference<>(null);
        this.f20929d = new Object();
        HashSet<k2> hashSet = new HashSet<>();
        this.f20930e = hashSet;
        s2 s2Var = new s2();
        this.f20931f = s2Var;
        this.f20932g = new v0.f<>();
        this.f20933h = new HashSet<>();
        this.f20934i = new v0.f<>();
        u0.a aVar = new u0.a();
        this.f20935j = aVar;
        u0.a aVar2 = new u0.a();
        this.f20936k = aVar2;
        this.f20937l = new v0.f<>();
        this.f20938m = new v0.a<>(0, 1, null);
        this.f20942q = new y(null, false, 3, null);
        m mVar = new m(eVar, qVar, s2Var, hashSet, aVar, aVar2, this);
        qVar.o(mVar);
        this.f20943r = mVar;
        this.f20944s = gVar;
        this.f20945t = qVar instanceof g2;
        this.f20947v = h.f20773a.a();
    }

    public /* synthetic */ s(q qVar, e eVar, qd.g gVar, int i10, ae.j jVar) {
        this(qVar, eVar, (i10 & 4) != 0 ? null : gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(u0.a r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.s.A(u0.a):void");
    }

    private final void B() {
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        long j10;
        int i12;
        boolean zD;
        Object[] objArr;
        Object[] objArr2;
        z.u<Object, Object> uVarD = this.f20934i.d();
        long[] jArr3 = uVarD.f24112a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr3[i13];
                char c10 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = uVarD.f24113b[i17];
                            Object obj2 = uVarD.f24114c[i17];
                            if (obj2 instanceof z.v) {
                                ae.r.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                z.v vVar = (z.v) obj2;
                                Object[] objArr3 = vVar.f24051b;
                                long[] jArr4 = vVar.f24050a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i10 = length;
                                if (length2 >= 0) {
                                    int i18 = 0;
                                    while (true) {
                                        long j13 = jArr4[i18];
                                        i11 = i15;
                                        long[] jArr5 = jArr4;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j13 & 255) < 128) {
                                                    int i21 = (i18 << 3) + i20;
                                                    objArr2 = objArr3;
                                                    if (!this.f20932g.c((f0) objArr3[i21])) {
                                                        vVar.q(i21);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j13 >>= 8;
                                                i20++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i19 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        c10 = 7;
                                        i15 = i11;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i11 = i15;
                                    j10 = -9187201950435737472L;
                                }
                                zD = vVar.d();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                i11 = i15;
                                j10 = j12;
                                ae.r.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                zD = !this.f20932g.c((f0) obj2);
                            }
                            if (zD) {
                                uVarD.o(i17);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            i11 = i15;
                            j10 = j12;
                            i12 = i14;
                        }
                        j11 >>= i12;
                        i16++;
                        i14 = i12;
                        j12 = j10;
                        jArr3 = jArr2;
                        length = i10;
                        i15 = i11;
                        c10 = 7;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    if (i15 != i14) {
                        break;
                    } else {
                        length = i22;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                jArr3 = jArr;
            }
        }
        if (!this.f20933h.isEmpty()) {
            Iterator<d2> it = this.f20933h.iterator();
            while (it.hasNext()) {
                if (!it.next().u()) {
                    it.remove();
                }
            }
        }
    }

    private final void C(zd.p<? super l, ? super Integer, md.i0> pVar) {
        if (!(!this.f20946u)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.f20947v = pVar;
        this.f20926a.a(this, pVar);
    }

    private final void D() {
        Object andSet = this.f20928c.getAndSet(t.f20970a);
        if (andSet != null) {
            if (ae.r.b(andSet, t.f20970a)) {
                o.u("pending composition has not been applied");
                throw new md.i();
            }
            if (andSet instanceof Set) {
                z((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                o.u("corrupt pendingModifications drain: " + this.f20928c);
                throw new md.i();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, true);
            }
        }
    }

    private final void E() {
        Object andSet = this.f20928c.getAndSet(null);
        if (ae.r.b(andSet, t.f20970a)) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, false);
            }
            return;
        }
        if (andSet == null) {
            o.u("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new md.i();
        }
        o.u("corrupt pendingModifications drain: " + this.f20928c);
        throw new md.i();
    }

    private final boolean F() {
        return this.f20943r.x0();
    }

    private final u0 H(d2 d2Var, d dVar, Object obj) {
        synchronized (this.f20929d) {
            s sVar = this.f20940o;
            if (sVar == null || !this.f20931f.y(this.f20941p, dVar)) {
                sVar = null;
            }
            if (sVar == null) {
                if (N(d2Var, obj)) {
                    return u0.IMMINENT;
                }
                if (obj == null) {
                    this.f20938m.l(d2Var, null);
                } else {
                    t.e(this.f20938m, d2Var, obj);
                }
            }
            if (sVar != null) {
                return sVar.H(d2Var, dVar, obj);
            }
            this.f20926a.k(this);
            return m() ? u0.DEFERRED : u0.SCHEDULED;
        }
    }

    private final void I(Object obj) {
        Object objB = this.f20932g.d().b(obj);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof z.v)) {
            d2 d2Var = (d2) objB;
            if (d2Var.t(obj) == u0.IMMINENT) {
                this.f20937l.a(obj, d2Var);
                return;
            }
            return;
        }
        z.v vVar = (z.v) objB;
        Object[] objArr = vVar.f24051b;
        long[] jArr = vVar.f24050a;
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
                        d2 d2Var2 = (d2) objArr[(i10 << 3) + i12];
                        if (d2Var2.t(obj) == u0.IMMINENT) {
                            this.f20937l.a(obj, d2Var2);
                        }
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

    private final e1.c J() {
        y yVar = this.f20942q;
        if (yVar.b()) {
            return yVar.a();
        }
        y yVarI = this.f20926a.i();
        e1.c cVarA = yVarI != null ? yVarI.a() : null;
        if (!ae.r.b(cVarA, yVar.a())) {
            yVar.c(cVarA);
        }
        return cVarA;
    }

    private final v0.a<d2, v0.b<Object>> M() {
        v0.a<d2, v0.b<Object>> aVar = this.f20938m;
        this.f20938m = new v0.a<>(0, 1, null);
        return aVar;
    }

    private final boolean N(d2 d2Var, Object obj) {
        return m() && this.f20943r.j1(d2Var, obj);
    }

    private final void s() {
        this.f20928c.set(null);
        this.f20935j.a();
        this.f20936k.a();
        this.f20930e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[PHI: r6
  0x0082: PHI (r6v4 java.util.HashSet<t0.d2>) = (r6v3 java.util.HashSet<t0.d2>), (r6v5 java.util.HashSet<t0.d2>) binds: [B:10:0x0031, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.HashSet<t0.d2> y(java.util.HashSet<t0.d2> r18, java.lang.Object r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            v0.f<t0.d2> r2 = r0.f20932g
            z.u r2 = r2.d()
            java.lang.Object r2 = r2.b(r1)
            if (r2 == 0) goto Lb9
            boolean r3 = r2 instanceof z.v
            if (r3 == 0) goto L8b
            z.v r2 = (z.v) r2
            java.lang.Object[] r3 = r2.f24051b
            long[] r2 = r2.f24050a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L87
            r5 = 0
            r6 = r18
            r7 = r5
        L23:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L82
            int r10 = r7 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L3d:
            if (r12 >= r10) goto L80
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4a
            r13 = 1
            goto L4b
        L4a:
            r13 = r5
        L4b:
            if (r13 == 0) goto L7c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            t0.d2 r13 = (t0.d2) r13
            v0.f<t0.d2> r14 = r0.f20937l
            boolean r14 = r14.e(r1, r13)
            if (r14 != 0) goto L7c
            t0.u0 r14 = r13.t(r1)
            t0.u0 r15 = t0.u0.IGNORED
            if (r14 == r15) goto L7c
            boolean r14 = r13.u()
            if (r14 == 0) goto L72
            if (r20 != 0) goto L72
            java.util.HashSet<t0.d2> r14 = r0.f20933h
            r14.add(r13)
            goto L7c
        L72:
            if (r6 != 0) goto L79
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L79:
            r6.add(r13)
        L7c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L80:
            if (r10 != r11) goto L89
        L82:
            if (r7 == r4) goto L89
            int r7 = r7 + 1
            goto L23
        L87:
            r6 = r18
        L89:
            r1 = r6
            goto Lbb
        L8b:
            t0.d2 r2 = (t0.d2) r2
            v0.f<t0.d2> r3 = r0.f20937l
            boolean r3 = r3.e(r1, r2)
            if (r3 != 0) goto Lb9
            t0.u0 r1 = r2.t(r1)
            t0.u0 r3 = t0.u0.IGNORED
            if (r1 == r3) goto Lb9
            boolean r1 = r2.u()
            if (r1 == 0) goto Lab
            if (r20 != 0) goto Lab
            java.util.HashSet<t0.d2> r1 = r0.f20933h
            r1.add(r2)
            goto Lb9
        Lab:
            if (r18 != 0) goto Lb3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            goto Lb5
        Lb3:
            r1 = r18
        Lb5:
            r1.add(r2)
            goto Lbb
        Lb9:
            r1 = r18
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.s.y(java.util.HashSet, java.lang.Object, boolean):java.util.HashSet");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[PHI: r5
  0x0097: PHI (r5v32 java.util.HashSet<t0.d2>) = (r5v31 java.util.HashSet<t0.d2>), (r5v33 java.util.HashSet<t0.d2>) binds: [B:17:0x005b, B:28:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[PHI: r5
  0x0130: PHI (r5v3 java.util.HashSet<t0.d2>) = (r5v2 java.util.HashSet<t0.d2>), (r5v4 java.util.HashSet<t0.d2>) binds: [B:48:0x00fe, B:59:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(java.util.Set<? extends java.lang.Object> r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 1103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.s.z(java.util.Set, boolean):void");
    }

    public final y G() {
        return this.f20942q;
    }

    public final void K(f0<?> f0Var) {
        if (this.f20932g.c(f0Var)) {
            return;
        }
        this.f20934i.f(f0Var);
    }

    public final void L(Object obj, d2 d2Var) {
        this.f20932g.e(obj, d2Var);
    }

    @Override // t0.c0, t0.f2
    public void a(Object obj) {
        d2 d2VarZ0;
        if (F() || (d2VarZ0 = this.f20943r.z0()) == null) {
            return;
        }
        d2VarZ0.H(true);
        if (d2VarZ0.w(obj)) {
            return;
        }
        if (obj instanceof d1.h0) {
            ((d1.h0) obj).y(d1.g.a(1));
        }
        this.f20932g.a(obj, d2VarZ0);
        if (!(obj instanceof f0)) {
            return;
        }
        this.f20934i.f(obj);
        z.w<d1.g0> wVarB = ((f0) obj).w().b();
        Object[] objArr = wVarB.f24107b;
        long[] jArr = wVarB.f24106a;
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
                        d1.g0 g0Var = (d1.g0) objArr[(i10 << 3) + i12];
                        if (g0Var instanceof d1.h0) {
                            ((d1.h0) g0Var).y(d1.g.a(1));
                        }
                        this.f20934i.a(g0Var, obj);
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

    @Override // t0.p
    public void b(zd.p<? super l, ? super Integer, md.i0> pVar) {
        C(pVar);
    }

    @Override // t0.m2
    public void c(zd.p<? super l, ? super Integer, md.i0> pVar) {
        this.f20943r.h1();
        C(pVar);
        this.f20943r.r0();
    }

    @Override // t0.c0
    public boolean d(Set<? extends Object> set) {
        if (!(set instanceof v0.b)) {
            for (Object obj : set) {
                if (this.f20932g.c(obj) || this.f20934i.c(obj)) {
                    return true;
                }
            }
            return false;
        }
        v0.b bVar = (v0.b) set;
        Object[] objArrN = bVar.n();
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = objArrN[i10];
            ae.r.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f20932g.c(obj2) || this.f20934i.c(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.m2
    public void deactivate() {
        boolean z10 = this.f20931f.s() > 0;
        if (z10 || (true ^ this.f20930e.isEmpty())) {
            t3 t3Var = t3.f20985a;
            Object objA = t3Var.a("Compose:deactivate");
            try {
                a aVar = new a(this.f20930e);
                if (z10) {
                    this.f20927b.e();
                    v2 v2VarA = this.f20931f.A();
                    try {
                        o.v(v2VarA, aVar);
                        md.i0 i0Var = md.i0.f15558a;
                        v2VarA.L();
                        this.f20927b.i();
                        aVar.g();
                    } catch (Throwable th) {
                        v2VarA.L();
                        throw th;
                    }
                }
                aVar.f();
                md.i0 i0Var2 = md.i0.f15558a;
                t3Var.b(objA);
            } catch (Throwable th2) {
                t3.f20985a.b(objA);
                throw th2;
            }
        }
        this.f20932g.b();
        this.f20934i.b();
        this.f20938m.b();
        this.f20935j.a();
        this.f20943r.l0();
    }

    @Override // t0.p
    public void dispose() {
        synchronized (this.f20929d) {
            if (!(!this.f20943r.I0())) {
                throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
            }
            if (!this.f20946u) {
                this.f20946u = true;
                this.f20947v = h.f20773a.b();
                u0.a aVarA0 = this.f20943r.A0();
                if (aVarA0 != null) {
                    A(aVarA0);
                }
                boolean z10 = this.f20931f.s() > 0;
                if (z10 || (true ^ this.f20930e.isEmpty())) {
                    a aVar = new a(this.f20930e);
                    if (z10) {
                        this.f20927b.e();
                        v2 v2VarA = this.f20931f.A();
                        try {
                            o.O(v2VarA, aVar);
                            md.i0 i0Var = md.i0.f15558a;
                            v2VarA.L();
                            this.f20927b.clear();
                            this.f20927b.i();
                            aVar.g();
                        } catch (Throwable th) {
                            v2VarA.L();
                            throw th;
                        }
                    }
                    aVar.f();
                }
                this.f20943r.m0();
            }
            md.i0 i0Var2 = md.i0.f15558a;
        }
        this.f20926a.s(this);
    }

    @Override // t0.c0
    public void e(f1 f1Var) {
        a aVar = new a(this.f20930e);
        v2 v2VarA = f1Var.a().A();
        try {
            o.O(v2VarA, aVar);
            md.i0 i0Var = md.i0.f15558a;
            v2VarA.L();
            aVar.g();
        } catch (Throwable th) {
            v2VarA.L();
            throw th;
        }
    }

    @Override // t0.f2
    public void f(d2 d2Var) {
        this.f20939n = true;
    }

    @Override // t0.c0
    public void g() {
        synchronized (this.f20929d) {
            try {
                if (this.f20936k.d()) {
                    A(this.f20936k);
                }
                md.i0 i0Var = md.i0.f15558a;
            } catch (Throwable th) {
                try {
                    if (!this.f20930e.isEmpty()) {
                        new a(this.f20930e).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    s();
                    throw e10;
                }
            }
        }
    }

    @Override // t0.p
    public boolean h() {
        return this.f20946u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.c0
    public void i(Set<? extends Object> set) {
        Object obj;
        Object objX;
        do {
            obj = this.f20928c.get();
            if (obj == null ? true : ae.r.b(obj, t.f20970a)) {
                objX = set;
            } else if (obj instanceof Set) {
                objX = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f20928c).toString());
                }
                ae.r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objX = nd.o.x((Set[]) obj, set);
            }
        } while (!c0.u0.a(this.f20928c, obj, objX));
        if (obj == null) {
            synchronized (this.f20929d) {
                E();
                md.i0 i0Var = md.i0.f15558a;
            }
        }
    }

    @Override // t0.c0
    public <R> R j(c0 c0Var, int i10, zd.a<? extends R> aVar) {
        if (c0Var == null || ae.r.b(c0Var, this) || i10 < 0) {
            return aVar.invoke();
        }
        this.f20940o = (s) c0Var;
        this.f20941p = i10;
        try {
            return aVar.invoke();
        } finally {
            this.f20940o = null;
            this.f20941p = 0;
        }
    }

    @Override // t0.c0
    public void k() {
        synchronized (this.f20929d) {
            try {
                A(this.f20935j);
                E();
                md.i0 i0Var = md.i0.f15558a;
            } catch (Throwable th) {
                try {
                    if (!this.f20930e.isEmpty()) {
                        new a(this.f20930e).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    s();
                    throw e10;
                }
            }
        }
    }

    @Override // t0.c0
    public void l(zd.p<? super l, ? super Integer, md.i0> pVar) {
        try {
            synchronized (this.f20929d) {
                D();
                v0.a<d2, v0.b<Object>> aVarM = M();
                try {
                    e1.c cVarJ = J();
                    if (cVarJ != null) {
                        Map<d2, v0.b<Object>> mapA = aVarM.a();
                        ae.r.d(mapA, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        cVarJ.a(this, mapA);
                    }
                    this.f20943r.g0(aVarM, pVar);
                    if (cVarJ != null) {
                        cVarJ.b(this);
                        md.i0 i0Var = md.i0.f15558a;
                    }
                } catch (Exception e10) {
                    this.f20938m = aVarM;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // t0.c0
    public boolean m() {
        return this.f20943r.I0();
    }

    @Override // t0.c0
    public void n(List<md.s<g1, g1>> list) {
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!ae.r.b(list.get(i10).c().b(), this)) {
                break;
            } else {
                i10++;
            }
        }
        o.S(z10);
        try {
            this.f20943r.F0(list);
            md.i0 i0Var = md.i0.f15558a;
        } finally {
        }
    }

    @Override // t0.f2
    public u0 o(d2 d2Var, Object obj) {
        s sVar;
        if (d2Var.l()) {
            d2Var.C(true);
        }
        d dVarJ = d2Var.j();
        if (dVarJ == null || !dVarJ.b()) {
            return u0.IGNORED;
        }
        if (this.f20931f.B(dVarJ)) {
            return !d2Var.k() ? u0.IGNORED : H(d2Var, dVarJ, obj);
        }
        synchronized (this.f20929d) {
            sVar = this.f20940o;
        }
        return sVar != null && sVar.N(d2Var, obj) ? u0.IMMINENT : u0.IGNORED;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // t0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f20929d
            monitor-enter(r0)
            r14.I(r15)     // Catch: java.lang.Throwable -> L6b
            v0.f<t0.f0<?>> r1 = r14.f20934i     // Catch: java.lang.Throwable -> L6b
            z.u r1 = r1.d()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r15 = r1.b(r15)     // Catch: java.lang.Throwable -> L6b
            if (r15 == 0) goto L67
            boolean r1 = r15 instanceof z.v     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L62
            z.v r15 = (z.v) r15     // Catch: java.lang.Throwable -> L6b
            java.lang.Object[] r1 = r15.f24051b     // Catch: java.lang.Throwable -> L6b
            long[] r15 = r15.f24050a     // Catch: java.lang.Throwable -> L6b
            int r2 = r15.length     // Catch: java.lang.Throwable -> L6b
            int r2 = r2 + (-2)
            if (r2 < 0) goto L67
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L6b
            long r7 = ~r5     // Catch: java.lang.Throwable -> L6b
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5d
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L6b
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L5b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            r10 = 1
            goto L4b
        L4a:
            r10 = r3
        L4b:
            if (r10 == 0) goto L57
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L6b
            t0.f0 r10 = (t0.f0) r10     // Catch: java.lang.Throwable -> L6b
            r14.I(r10)     // Catch: java.lang.Throwable -> L6b
        L57:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L5b:
            if (r7 != r8) goto L67
        L5d:
            if (r4 == r2) goto L67
            int r4 = r4 + 1
            goto L23
        L62:
            t0.f0 r15 = (t0.f0) r15     // Catch: java.lang.Throwable -> L6b
            r14.I(r15)     // Catch: java.lang.Throwable -> L6b
        L67:
            md.i0 r15 = md.i0.f15558a     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)
            return
        L6b:
            r15 = move-exception
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.s.p(java.lang.Object):void");
    }

    @Override // t0.p
    public boolean q() {
        boolean z10;
        synchronized (this.f20929d) {
            z10 = this.f20938m.h() > 0;
        }
        return z10;
    }

    @Override // t0.c0
    public void r() {
        synchronized (this.f20929d) {
            try {
                this.f20943r.d0();
                if (!this.f20930e.isEmpty()) {
                    new a(this.f20930e).f();
                }
                md.i0 i0Var = md.i0.f15558a;
            } catch (Throwable th) {
                try {
                    if (!this.f20930e.isEmpty()) {
                        new a(this.f20930e).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    s();
                    throw e10;
                }
            }
        }
    }

    @Override // t0.c0
    public void t(zd.a<md.i0> aVar) {
        this.f20943r.N0(aVar);
    }

    @Override // t0.c0
    public boolean u() {
        boolean zO0;
        synchronized (this.f20929d) {
            D();
            try {
                v0.a<d2, v0.b<Object>> aVarM = M();
                try {
                    e1.c cVarJ = J();
                    if (cVarJ != null) {
                        Map<d2, v0.b<Object>> mapA = aVarM.a();
                        ae.r.d(mapA, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        cVarJ.a(this, mapA);
                    }
                    zO0 = this.f20943r.O0(aVarM);
                    if (!zO0) {
                        E();
                    }
                    if (cVarJ != null) {
                        cVarJ.b(this);
                    }
                } catch (Exception e10) {
                    this.f20938m = aVarM;
                    throw e10;
                }
            } finally {
            }
        }
        return zO0;
    }

    @Override // t0.c0
    public void v() {
        synchronized (this.f20929d) {
            for (Object obj : this.f20931f.t()) {
                d2 d2Var = obj instanceof d2 ? (d2) obj : null;
                if (d2Var != null) {
                    d2Var.invalidate();
                }
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }
}
