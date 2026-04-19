package pe;

import ae.h0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.a2;
import le.n0;
import le.o0;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T, R> extends g<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.q<oe.f<? super R>, T, qd.d<? super i0>, Object> f18332e;

    @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T, R> f18335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ oe.f<R> f18336d;

        /* JADX INFO: renamed from: pe.i$a$a, reason: collision with other inner class name */
        static final class C0385a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0<a2> f18337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f18338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T, R> f18339c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ oe.f<R> f18340d;

            /* JADX INFO: renamed from: pe.i$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
            static final class C0386a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f18341a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ i<T, R> f18342b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ oe.f<R> f18343c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f18344d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0386a(i<T, R> iVar, oe.f<? super R> fVar, T t10, qd.d<? super C0386a> dVar) {
                    super(2, dVar);
                    this.f18342b = iVar;
                    this.f18343c = fVar;
                    this.f18344d = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                    return new C0386a(this.f18342b, this.f18343c, this.f18344d, dVar);
                }

                @Override // zd.p
                public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                    return ((C0386a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f18341a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        zd.q qVar = ((i) this.f18342b).f18332e;
                        oe.f<R> fVar = this.f18343c;
                        T t10 = this.f18344d;
                        this.f18341a = 1;
                        if (qVar.invoke(fVar, t10, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    return i0.f15558a;
                }
            }

            /* JADX INFO: renamed from: pe.i$a$a$b */
            @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {R.styleable.AppCompatTheme_actionModeTheme}, m = "emit")
            static final class b extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f18345a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f18346b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f18347c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18348d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ C0385a<T> f18349e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f18350f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0385a<? super T> c0385a, qd.d<? super b> dVar) {
                    super(dVar);
                    this.f18349e = c0385a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f18348d = obj;
                    this.f18350f |= Integer.MIN_VALUE;
                    return this.f18349e.b(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0385a(h0<a2> h0Var, n0 n0Var, i<T, R> iVar, oe.f<? super R> fVar) {
                this.f18337a = h0Var;
                this.f18338b = n0Var;
                this.f18339c = iVar;
                this.f18340d = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oe.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(T r8, qd.d<? super md.i0> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof pe.i.a.C0385a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    pe.i$a$a$b r0 = (pe.i.a.C0385a.b) r0
                    int r1 = r0.f18350f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18350f = r1
                    goto L18
                L13:
                    pe.i$a$a$b r0 = new pe.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f18348d
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f18350f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f18347c
                    le.a2 r8 = (le.a2) r8
                    java.lang.Object r8 = r0.f18346b
                    java.lang.Object r0 = r0.f18345a
                    pe.i$a$a r0 = (pe.i.a.C0385a) r0
                    md.u.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    md.u.b(r9)
                    ae.h0<le.a2> r9 = r7.f18337a
                    T r9 = r9.f712a
                    le.a2 r9 = (le.a2) r9
                    if (r9 == 0) goto L5d
                    pe.j r2 = new pe.j
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f18345a = r7
                    r0.f18346b = r8
                    r0.f18347c = r9
                    r0.f18350f = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    ae.h0<le.a2> r9 = r0.f18337a
                    le.n0 r1 = r0.f18338b
                    r2 = 0
                    le.p0 r3 = le.p0.UNDISPATCHED
                    pe.i$a$a$a r4 = new pe.i$a$a$a
                    pe.i<T, R> r5 = r0.f18339c
                    oe.f<R> r0 = r0.f18340d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    le.a2 r8 = le.i.d(r1, r2, r3, r4, r5, r6)
                    r9.f712a = r8
                    md.i0 r8 = md.i0.f15558a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: pe.i.a.C0385a.b(java.lang.Object, qd.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i<T, R> iVar, oe.f<? super R> fVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f18335c = iVar;
            this.f18336d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f18335c, this.f18336d, dVar);
            aVar.f18334b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type qd.d to pe.i$a for r7v1 'this'  qd.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r7.f18333a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                md.u.b(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                md.u.b(r8)
                java.lang.Object r8 = r7.f18334b
                le.n0 r8 = (le.n0) r8
                ae.h0 r1 = new ae.h0
                r1.<init>()
                pe.i<T, R> r3 = r7.f18335c
                oe.e<S> r4 = r3.f18328d
                pe.i$a$a r5 = new pe.i$a$a
                oe.f<R> r6 = r7.f18336d
                r5.<init>(r1, r8, r3, r6)
                r7.f18333a = r2
                java.lang.Object r8 = r4.a(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                md.i0 r8 = md.i0.f15558a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(zd.q<? super oe.f<? super R>, ? super T, ? super qd.d<? super i0>, ? extends Object> qVar, oe.e<? extends T> eVar, qd.g gVar, int i10, ne.a aVar) {
        super(eVar, gVar, i10, aVar);
        this.f18332e = qVar;
    }

    public /* synthetic */ i(zd.q qVar, oe.e eVar, qd.g gVar, int i10, ne.a aVar, int i11, ae.j jVar) {
        this(qVar, eVar, (i11 & 4) != 0 ? qd.h.f19040a : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? ne.a.SUSPEND : aVar);
    }

    @Override // pe.e
    protected e<R> j(qd.g gVar, int i10, ne.a aVar) {
        return new i(this.f18332e, this.f18328d, gVar, i10, aVar);
    }

    @Override // pe.g
    protected Object s(oe.f<? super R> fVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new a(this, fVar, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }
}
