package t0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class i3 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @sd.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_dividerVertical}, m = "invokeSuspend")
    static final class a<R> extends sd.j implements zd.p<y1<R>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qd.g f20793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ oe.e<T> f20794d;

        /* JADX INFO: renamed from: t0.i3$a$a, reason: collision with other inner class name */
        static final class C0425a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1<R> f20795a;

            C0425a(y1<R> y1Var) {
                this.f20795a = y1Var;
            }

            @Override // oe.f
            public final Object b(T t10, qd.d<? super md.i0> dVar) {
                this.f20795a.setValue(t10);
                return md.i0.f15558a;
            }
        }

        @sd.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "invokeSuspend")
        static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ oe.e<T> f20797b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1<R> f20798c;

            /* JADX INFO: renamed from: t0.i3$a$b$a, reason: collision with other inner class name */
            static final class C0426a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ y1<R> f20799a;

                C0426a(y1<R> y1Var) {
                    this.f20799a = y1Var;
                }

                @Override // oe.f
                public final Object b(T t10, qd.d<? super md.i0> dVar) {
                    this.f20799a.setValue(t10);
                    return md.i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(oe.e<? extends T> eVar, y1<R> y1Var, qd.d<? super b> dVar) {
                super(2, dVar);
                this.f20797b = eVar;
                this.f20798c = y1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new b(this.f20797b, this.f20798c, dVar);
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type qd.d to t0.i3$a$b for r4v1 'this'  qd.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r4.f20796a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    md.u.b(r5)
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    md.u.b(r5)
                    oe.e<T> r5 = r4.f20797b
                    t0.i3$a$b$a r1 = new t0.i3$a$b$a
                    t0.y1<R> r3 = r4.f20798c
                    r1.<init>(r3)
                    r4.f20796a = r2
                    java.lang.Object r5 = r5.a(r1, r4)
                    if (r5 != r0) goto L2c
                    return r0
                L2c:
                    md.i0 r5 = md.i0.f15558a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: t0.i3.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(qd.g gVar, oe.e<? extends T> eVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f20793c = gVar;
            this.f20794d = eVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y1<R> y1Var, qd.d<? super md.i0> dVar) {
            return ((a) create(y1Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f20793c, this.f20794d, dVar);
            aVar.f20792b = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type qd.d to t0.i3$a<R> for r6v1 'this'  qd.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r6.f20791a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                md.u.b(r7)
                goto L4f
            L1b:
                md.u.b(r7)
                java.lang.Object r7 = r6.f20792b
                t0.y1 r7 = (t0.y1) r7
                qd.g r1 = r6.f20793c
                qd.h r4 = qd.h.f19040a
                boolean r1 = ae.r.b(r1, r4)
                if (r1 == 0) goto L3c
                oe.e<T> r1 = r6.f20794d
                t0.i3$a$a r2 = new t0.i3$a$a
                r2.<init>(r7)
                r6.f20791a = r3
                java.lang.Object r7 = r1.a(r2, r6)
                if (r7 != r0) goto L4f
                return r0
            L3c:
                qd.g r1 = r6.f20793c
                t0.i3$a$b r3 = new t0.i3$a$b
                oe.e<T> r4 = r6.f20794d
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f20791a = r2
                java.lang.Object r7 = le.i.g(r1, r3, r6)
                if (r7 != r0) goto L4f
                return r0
            L4f:
                md.i0 r7 = md.i0.f15558a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.i3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @sd.d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {144, 148, 170}, m = "invokeSuspend")
    static final class b<T> extends sd.j implements zd.p<oe.f<? super T>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f20802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f20803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f20804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f20805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f20806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f20807h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ zd.a<T> f20808i;

        static final class a extends ae.s implements zd.l<Object, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z.v<Object> f20809a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z.v<Object> vVar) {
                super(1);
                this.f20809a = vVar;
            }

            public final void a(Object obj) {
                if (obj instanceof d1.h0) {
                    ((d1.h0) obj).y(d1.g.a(4));
                }
                this.f20809a.g(obj);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
                a(obj);
                return md.i0.f15558a;
            }
        }

        /* JADX INFO: renamed from: t0.i3$b$b, reason: collision with other inner class name */
        static final class C0427b extends ae.s implements zd.p<Set<? extends Object>, d1.k, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ne.d<Set<Object>> f20810a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0427b(ne.d<Set<Object>> dVar) {
                super(2);
                this.f20810a = dVar;
            }

            public final void a(Set<? extends Object> set, d1.k kVar) {
                boolean z10 = true;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    for (T t10 : set) {
                        if (!(t10 instanceof d1.h0) || ((d1.h0) t10).x(d1.g.a(4))) {
                            break;
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f20810a.i(set);
                }
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(Set<? extends Object> set, d1.k kVar) {
                a(set, kVar);
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.a<? extends T> aVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f20808i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f20808i, dVar);
            bVar.f20807h = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(oe.f<? super T> fVar, qd.d<? super md.i0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Path cross not found for [B:36:0x00e8, B:40:0x00f1], limit reached: 83 */
        /* JADX WARN: Path cross not found for [B:44:0x0100, B:61:0x0146], limit reached: 83 */
        /* JADX WARN: Path cross not found for [B:61:0x0146, B:44:0x0100], limit reached: 83 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.i3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> p3<R> b(oe.e<? extends T> eVar, R r10, qd.g gVar, l lVar, int i10, int i11) {
        lVar.e(-606625098);
        if ((i11 & 2) != 0) {
            gVar = qd.h.f19040a;
        }
        qd.g gVar2 = gVar;
        if (o.I()) {
            o.U(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i12 = i10 >> 3;
        p3<R> p3VarL = f3.l(r10, eVar, gVar2, new a(gVar2, eVar, null), lVar, (i12 & 8) | 4672 | (i12 & 14));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return p3VarL;
    }

    public static final <T> p3<T> c(oe.f0<? extends T> f0Var, qd.g gVar, l lVar, int i10, int i11) {
        lVar.e(-1439883919);
        if ((i11 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        qd.g gVar2 = gVar;
        if (o.I()) {
            o.U(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        p3<T> p3VarA = f3.a(f0Var, f0Var.getValue(), gVar2, lVar, 520, 0);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return p3VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(z.v<java.lang.Object> r14, java.util.Set<? extends java.lang.Object> r15) {
        /*
            java.lang.Object[] r0 = r14.f24051b
            long[] r14 = r14.f24050a
            int r1 = r14.length
            int r1 = r1 + (-2)
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L4d
            r4 = r3
        Lc:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = r4 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L26:
            if (r9 >= r7) goto L46
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L33
            r10 = r2
            goto L34
        L33:
            r10 = r3
        L34:
            if (r10 == 0) goto L42
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = r15.contains(r10)
            if (r10 == 0) goto L42
            goto L4e
        L42:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L26
        L46:
            if (r7 != r8) goto L4d
        L48:
            if (r4 == r1) goto L4d
            int r4 = r4 + 1
            goto Lc
        L4d:
            r2 = r3
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.i3.d(z.v, java.util.Set):boolean");
    }

    public static final <T> oe.e<T> e(zd.a<? extends T> aVar) {
        return oe.g.o(new b(aVar, null));
    }
}
