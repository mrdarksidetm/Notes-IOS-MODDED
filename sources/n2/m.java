package n2;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15859a = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2.b<b, a> f15860b = new m2.b<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2.c<b, a> f15861c = new m2.c<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r2.s f15862d = r2.r.a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f15863a;

        private /* synthetic */ a(Object obj) {
            this.f15863a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && ae.r.b(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f15863a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f15863a;
        }

        public int hashCode() {
            return d(this.f15863a);
        }

        public String toString() {
            return f(this.f15863a);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f15864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f15865b;

        public b(s sVar, Object obj) {
            this.f15864a = sVar;
            this.f15865b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ae.r.b(this.f15864a, bVar.f15864a) && ae.r.b(this.f15865b, bVar.f15865b);
        }

        public int hashCode() {
            int iHashCode = this.f15864a.hashCode() * 31;
            Object obj = this.f15865b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f15864a + ", loaderKey=" + this.f15865b + ')';
        }
    }

    @sd.d(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {398}, m = "runCached")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f15868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15869d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15871f;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15869d = obj;
            this.f15871f |= Integer.MIN_VALUE;
            return m.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(m mVar, s sVar, n0 n0Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        mVar.e(sVar, n0Var, obj, z10);
    }

    public final a d(s sVar, n0 n0Var) {
        a aVarD;
        b bVar = new b(sVar, n0Var.a());
        synchronized (this.f15862d) {
            aVarD = this.f15860b.d(bVar);
            if (aVarD == null) {
                aVarD = this.f15861c.b(bVar);
            }
        }
        return aVarD;
    }

    public final void e(s sVar, n0 n0Var, Object obj, boolean z10) {
        b bVar = new b(sVar, n0Var.a());
        synchronized (this.f15862d) {
            try {
                a aVarH = obj == null ? this.f15861c.h(bVar, a.a(this.f15859a)) : z10 ? this.f15861c.h(bVar, a.a(a.b(obj))) : this.f15860b.e(bVar, a.a(a.b(obj)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(n2.s r6, n2.n0 r7, boolean r8, zd.l<? super qd.d<java.lang.Object>, ? extends java.lang.Object> r9, qd.d<java.lang.Object> r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof n2.m.c
            if (r0 == 0) goto L13
            r0 = r10
            n2.m$c r0 = (n2.m.c) r0
            int r1 = r0.f15871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15871f = r1
            goto L18
        L13:
            n2.m$c r0 = new n2.m$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15869d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f15871f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f15868c
            java.lang.Object r6 = r0.f15867b
            n2.m$b r6 = (n2.m.b) r6
            java.lang.Object r7 = r0.f15866a
            n2.m r7 = (n2.m) r7
            md.u.b(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            md.u.b(r10)
            n2.m$b r10 = new n2.m$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            r2.s r6 = r5.f15862d
            monitor-enter(r6)
            m2.b<n2.m$b, n2.m$a> r7 = r5.f15860b     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> Lb0
            n2.m$a r7 = (n2.m.a) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            m2.c<n2.m$b, n2.m$a> r7 = r5.f15861c     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> Lb0
            n2.m$a r7 = (n2.m.a) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            md.i0 r7 = md.i0.f15558a     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.f15866a = r5
            r0.f15867b = r10
            r0.f15868c = r8
            r0.f15871f = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            r2.s r9 = r7.f15862d
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            m2.c<n2.m$b, n2.m$a> r8 = r7.f15861c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.f15859a     // Catch: java.lang.Throwable -> L8b
            n2.m$a r7 = n2.m.a.a(r7)     // Catch: java.lang.Throwable -> L8b
            r8.h(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            m2.c<n2.m$b, n2.m$a> r7 = r7.f15861c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = n2.m.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            n2.m$a r8 = n2.m.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.h(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            m2.b<n2.m$b, n2.m$a> r7 = r7.f15860b     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = n2.m.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            n2.m$a r8 = n2.m.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.e(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            md.i0 r6 = md.i0.f15558a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.m.g(n2.s, n2.n0, boolean, zd.l, qd.d):java.lang.Object");
    }
}
