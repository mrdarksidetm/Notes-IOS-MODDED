package c0;

/* JADX INFO: loaded from: classes.dex */
public final class o0<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f6174a;

    public static final class a<T> extends n0<T> {
        public a(T t10, b0 b0Var) {
            super(t10, b0Var, null);
        }

        public /* synthetic */ a(Object obj, b0 b0Var, int i10, ae.j jVar) {
            this(obj, (i10 & 2) != 0 ? d0.d() : b0Var);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (ae.r.b(aVar.b(), b()) && ae.r.b(aVar.a(), a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T tB = b();
            return ((tB != null ? tB.hashCode() : 0) * 31) + a().hashCode();
        }
    }

    public static final class b<T> extends p0<T, a<T>> {
        public b() {
            super(null);
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a<T> f(T t10, int i10) {
            a<T> aVar = new a<>(t10, null, 2, 0 == true ? 1 : 0);
            c().m(i10, aVar);
            return aVar;
        }
    }

    public o0(b<T> bVar) {
        this.f6174a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // c0.a0, c0.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <V extends c0.q> c0.u1<V> a(c0.j1<T, V> r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            c0.o0$b<T> r2 = r0.f6174a
            z.q r2 = r2.c()
            int[] r3 = r2.f24077b
            java.lang.Object[] r4 = r2.f24078c
            long[] r2 = r2.f24076a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L67
            r6 = 0
            r7 = r6
        L1a:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L34:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L41
            r13 = 1
            goto L42
        L41:
            r13 = r6
        L42:
            if (r13 == 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            c0.o0$a r13 = (c0.o0.a) r13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            zd.l r15 = r18.a()
            md.s r13 = r13.d(r15)
            r1.put(r14, r13)
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L34
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r5) goto L67
            int r7 = r7 + 1
            goto L1a
        L67:
            c0.u1 r2 = new c0.u1
            c0.o0$b<T> r3 = r0.f6174a
            int r3 = r3.b()
            c0.o0$b<T> r4 = r0.f6174a
            int r4 = r4.a()
            r2.<init>(r1, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.o0.a(c0.j1):c0.u1");
    }
}
