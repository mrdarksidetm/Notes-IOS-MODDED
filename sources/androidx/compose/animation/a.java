package androidx.compose.animation;

import ae.s;
import androidx.compose.animation.e;
import b0.w;
import c0.a1;
import c0.e0;
import c0.f1;
import c0.x1;
import d1.v;
import md.i0;
import t0.e2;
import t0.j0;
import t0.l;
import t0.o;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.p;
import zd.q;
import zd.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: androidx.compose.animation.a$a, reason: collision with other inner class name */
    static final class C0036a<S> extends s implements zd.l<androidx.compose.animation.d<S>, b0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0036a f2054a = new C0036a();

        C0036a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0.j invoke(androidx.compose.animation.d<S> dVar) {
            return a.e(androidx.compose.animation.f.m(c0.j.i(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.f.q(c0.j.i(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.f.o(c0.j.i(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class b<S> extends s implements zd.l<S, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2055a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        public final S invoke(S s10) {
            return s10;
        }
    }

    static final class c extends s implements p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f2056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.l<androidx.compose.animation.d<S>, b0.j> f2058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1.b f2059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.l<S, Object> f2061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ r<b0.b, S, t0.l, Integer, i0> f2062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2063h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f2064i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(S s10, androidx.compose.ui.e eVar, zd.l<? super androidx.compose.animation.d<S>, b0.j> lVar, f1.b bVar, String str, zd.l<? super S, ? extends Object> lVar2, r<? super b0.b, ? super S, ? super t0.l, ? super Integer, i0> rVar, int i10, int i11) {
            super(2);
            this.f2056a = s10;
            this.f2057b = eVar;
            this.f2058c = lVar;
            this.f2059d = bVar;
            this.f2060e = str;
            this.f2061f = lVar2;
            this.f2062g = rVar;
            this.f2063h = i10;
            this.f2064i = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            a.b(this.f2056a, this.f2057b, this.f2058c, this.f2059d, this.f2060e, this.f2061f, this.f2062g, lVar, e2.a(this.f2063h | 1), this.f2064i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class d<S> extends s implements zd.l<androidx.compose.animation.d<S>, b0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2065a = new d();

        d() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0.j invoke(androidx.compose.animation.d<S> dVar) {
            return a.e(androidx.compose.animation.f.m(c0.j.i(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.f.q(c0.j.i(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.f.o(c0.j.i(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    static final class e<S> extends s implements zd.l<S, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2066a = new e();

        e() {
            super(1);
        }

        @Override // zd.l
        public final S invoke(S s10) {
            return s10;
        }
    }

    static final class f extends s implements p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f2067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f2068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.l<androidx.compose.animation.d<S>, b0.j> f2069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.e<S> f2070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v<S> f2071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r<b0.b, S, t0.l, Integer, i0> f2072f;

        /* JADX INFO: renamed from: androidx.compose.animation.a$f$a, reason: collision with other inner class name */
        static final class C0037a extends s implements q<g0, d0, w2.b, f0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0.j f2073a;

            /* JADX INFO: renamed from: androidx.compose.animation.a$f$a$a, reason: collision with other inner class name */
            static final class C0038a extends s implements zd.l<t0.a, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ t0 f2074a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b0.j f2075b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0038a(t0 t0Var, b0.j jVar) {
                    super(1);
                    this.f2074a = t0Var;
                    this.f2075b = jVar;
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                    invoke2(aVar);
                    return i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(t0.a aVar) {
                    aVar.e(this.f2074a, 0, 0, this.f2075b.d());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0037a(b0.j jVar) {
                super(3);
                this.f2073a = jVar;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ f0 invoke(g0 g0Var, d0 d0Var, w2.b bVar) {
                return m0invoke3p2s80s(g0Var, d0Var, bVar.t());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final f0 m0invoke3p2s80s(g0 g0Var, d0 d0Var, long j10) {
                t0 t0VarI = d0Var.I(j10);
                return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new C0038a(t0VarI, this.f2073a), 4, null);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        static final class b<S> extends s implements zd.l<S, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ S f2076a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S s10) {
                super(1);
                this.f2076a = s10;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S s10) {
                return Boolean.valueOf(ae.r.b(s10, this.f2076a));
            }
        }

        static final class c extends s implements p<b0.l, b0.l, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f2077a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar) {
                super(2);
                this.f2077a = jVar;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(b0.l lVar, b0.l lVar2) {
                b0.l lVar3 = b0.l.PostExit;
                return Boolean.valueOf(lVar == lVar3 && lVar2 == lVar3 && !this.f2077a.b().d());
            }
        }

        static final class d extends s implements q<b0.e, t0.l, Integer, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.e<S> f2078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ S f2079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v<S> f2080c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ r<b0.b, S, t0.l, Integer, i0> f2081d;

            /* JADX INFO: renamed from: androidx.compose.animation.a$f$d$a, reason: collision with other inner class name */
            static final class C0039a extends s implements zd.l<j0, t0.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ v<S> f2082a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ S f2083b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.animation.e<S> f2084c;

                /* JADX INFO: renamed from: androidx.compose.animation.a$f$d$a$a, reason: collision with other inner class name */
                public static final class C0040a implements t0.i0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ v f2085a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Object f2086b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.animation.e f2087c;

                    public C0040a(v vVar, Object obj, androidx.compose.animation.e eVar) {
                        this.f2085a = vVar;
                        this.f2086b = obj;
                        this.f2087c = eVar;
                    }

                    @Override // t0.i0
                    public void dispose() {
                        this.f2085a.remove(this.f2086b);
                        this.f2087c.h().remove(this.f2086b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0039a(v<S> vVar, S s10, androidx.compose.animation.e<S> eVar) {
                    super(1);
                    this.f2082a = vVar;
                    this.f2083b = s10;
                    this.f2084c = eVar;
                }

                @Override // zd.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final t0.i0 invoke(j0 j0Var) {
                    return new C0040a(this.f2082a, this.f2083b, this.f2084c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(androidx.compose.animation.e<S> eVar, S s10, v<S> vVar, r<? super b0.b, ? super S, ? super t0.l, ? super Integer, i0> rVar) {
                super(3);
                this.f2078a = eVar;
                this.f2079b = s10;
                this.f2080c = vVar;
                this.f2081d = rVar;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ i0 invoke(b0.e eVar, t0.l lVar, Integer num) {
                invoke(eVar, lVar, num.intValue());
                return i0.f15558a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v11 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            public final void invoke(b0.e r5, t0.l r6, int r7) {
                /*
                    r4 = this;
                    r0 = r7 & 14
                    if (r0 != 0) goto Le
                    boolean r0 = r6.N(r5)
                    if (r0 == 0) goto Lc
                    r0 = 4
                    goto Ld
                Lc:
                    r0 = 2
                Ld:
                    r7 = r7 | r0
                Le:
                    r0 = r7 & 91
                    r1 = 18
                    if (r0 != r1) goto L1f
                    boolean r0 = r6.s()
                    if (r0 != 0) goto L1b
                    goto L1f
                L1b:
                    r6.x()
                    goto L89
                L1f:
                    boolean r0 = t0.o.I()
                    if (r0 == 0) goto L2e
                    r0 = -616195562(0xffffffffdb459a16, float:-5.561999E16)
                    r1 = -1
                    java.lang.String r2 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)"
                    t0.o.U(r0, r7, r1, r2)
                L2e:
                    androidx.compose.animation.a$f$d$a r0 = new androidx.compose.animation.a$f$d$a
                    d1.v<S> r1 = r4.f2080c
                    S r2 = r4.f2079b
                    androidx.compose.animation.e<S> r3 = r4.f2078a
                    r0.<init>(r1, r2, r3)
                    r7 = r7 & 14
                    t0.l0.b(r5, r0, r6, r7)
                    androidx.compose.animation.e<S> r7 = r4.f2078a
                    java.util.Map r7 = r7.h()
                    S r0 = r4.f2079b
                    java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"
                    ae.r.d(r5, r1)
                    r1 = r5
                    b0.f r1 = (b0.f) r1
                    t0.k1 r1 = r1.a()
                    r7.put(r0, r1)
                    r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
                    r6.e(r7)
                    java.lang.Object r7 = r6.f()
                    t0.l$a r0 = t0.l.f20813a
                    java.lang.Object r0 = r0.a()
                    if (r7 != r0) goto L6f
                    androidx.compose.animation.c r7 = new androidx.compose.animation.c
                    r7.<init>(r5)
                    r6.E(r7)
                L6f:
                    r6.K()
                    zd.r<b0.b, S, t0.l, java.lang.Integer, md.i0> r5 = r4.f2081d
                    S r0 = r4.f2079b
                    androidx.compose.animation.c r7 = (androidx.compose.animation.c) r7
                    r1 = 0
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r5.invoke(r7, r0, r6, r1)
                    boolean r5 = t0.o.I()
                    if (r5 == 0) goto L89
                    t0.o.T()
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.f.d.invoke(b0.e, t0.l, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(f1<S> f1Var, S s10, zd.l<? super androidx.compose.animation.d<S>, b0.j> lVar, androidx.compose.animation.e<S> eVar, v<S> vVar, r<? super b0.b, ? super S, ? super t0.l, ? super Integer, i0> rVar) {
            super(2);
            this.f2067a = f1Var;
            this.f2068b = s10;
            this.f2069c = lVar;
            this.f2070d = eVar;
            this.f2071e = vVar;
            this.f2072f = rVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(885640742, i10, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
            }
            zd.l<androidx.compose.animation.d<S>, b0.j> lVar2 = this.f2069c;
            f1.b bVar = this.f2070d;
            lVar.e(-492369756);
            b0.j jVarF = lVar.f();
            l.a aVar = t0.l.f20813a;
            if (jVarF == aVar.a()) {
                jVarF = lVar2.invoke(bVar);
                lVar.E(jVarF);
            }
            lVar.K();
            b0.j jVar = (b0.j) jVarF;
            Object objValueOf = Boolean.valueOf(ae.r.b(this.f2067a.l().c(), this.f2068b));
            f1<S> f1Var = this.f2067a;
            S s10 = this.f2068b;
            zd.l<androidx.compose.animation.d<S>, b0.j> lVar3 = this.f2069c;
            f1.b bVar2 = this.f2070d;
            lVar.e(1157296644);
            boolean zN = lVar.N(objValueOf);
            Object objF = lVar.f();
            if (zN || objF == aVar.a()) {
                objF = ae.r.b(f1Var.l().c(), s10) ? j.f2179a.a() : lVar3.invoke(bVar2).a();
                lVar.E(objF);
            }
            lVar.K();
            j jVar2 = (j) objF;
            S s11 = this.f2068b;
            f1<S> f1Var2 = this.f2067a;
            lVar.e(-492369756);
            Object objF2 = lVar.f();
            if (objF2 == aVar.a()) {
                objF2 = new e.a(ae.r.b(s11, f1Var2.n()));
                lVar.E(objF2);
            }
            lVar.K();
            e.a aVar2 = (e.a) objF2;
            androidx.compose.animation.h hVarC = jVar.c();
            androidx.compose.ui.e eVarA = androidx.compose.ui.layout.a.a(androidx.compose.ui.e.f2662a, new C0037a(jVar));
            aVar2.c(ae.r.b(this.f2068b, this.f2067a.n()));
            androidx.compose.ui.e eVarH = eVarA.h(aVar2);
            f1<S> f1Var3 = this.f2067a;
            b bVar3 = new b(this.f2068b);
            lVar.e(841088387);
            boolean zN2 = lVar.N(jVar2);
            Object objF3 = lVar.f();
            if (zN2 || objF3 == aVar.a()) {
                objF3 = new c(jVar2);
                lVar.E(objF3);
            }
            lVar.K();
            b0.d.a(f1Var3, bVar3, eVarH, hVarC, jVar2, (p) objF3, null, b1.c.b(lVar, -616195562, true, new d(this.f2070d, this.f2068b, this.f2071e, this.f2072f)), lVar, 12582912, 64);
            if (o.I()) {
                o.T();
            }
        }
    }

    static final class g extends s implements p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.l<androidx.compose.animation.d<S>, b0.j> f2090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1.b f2091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.l<S, Object> f2092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r<b0.b, S, t0.l, Integer, i0> f2093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2095h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(f1<S> f1Var, androidx.compose.ui.e eVar, zd.l<? super androidx.compose.animation.d<S>, b0.j> lVar, f1.b bVar, zd.l<? super S, ? extends Object> lVar2, r<? super b0.b, ? super S, ? super t0.l, ? super Integer, i0> rVar, int i10, int i11) {
            super(2);
            this.f2088a = f1Var;
            this.f2089b = eVar;
            this.f2090c = lVar;
            this.f2091d = bVar;
            this.f2092e = lVar2;
            this.f2093f = rVar;
            this.f2094g = i10;
            this.f2095h = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            a.a(this.f2088a, this.f2089b, this.f2090c, this.f2091d, this.f2092e, this.f2093f, lVar, e2.a(this.f2094g | 1), this.f2095h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class h extends s implements p<w2.p, w2.p, a1<w2.p>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f2096a = new h();

        h() {
            super(2);
        }

        public final a1<w2.p> a(long j10, long j11) {
            return c0.j.g(0.0f, 400.0f, w2.p.b(x1.f(w2.p.f22421b)), 1, null);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ a1<w2.p> invoke(w2.p pVar, w2.p pVar2) {
            return a(pVar.j(), pVar2.j());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0243 A[LOOP:2: B:140:0x0241->B:141:0x0243, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void a(c0.f1<S> r19, androidx.compose.ui.e r20, zd.l<? super androidx.compose.animation.d<S>, b0.j> r21, f1.b r22, zd.l<? super S, ? extends java.lang.Object> r23, zd.r<? super b0.b, ? super S, ? super t0.l, ? super java.lang.Integer, md.i0> r24, t0.l r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(c0.f1, androidx.compose.ui.e, zd.l, f1.b, zd.l, zd.r, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void b(S r18, androidx.compose.ui.e r19, zd.l<? super androidx.compose.animation.d<S>, b0.j> r20, f1.b r21, java.lang.String r22, zd.l<? super S, ? extends java.lang.Object> r23, zd.r<? super b0.b, ? super S, ? super t0.l, ? super java.lang.Integer, md.i0> r24, t0.l r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(java.lang.Object, androidx.compose.ui.e, zd.l, f1.b, java.lang.String, zd.l, zd.r, t0.l, int, int):void");
    }

    public static final w c(boolean z10, p<? super w2.p, ? super w2.p, ? extends e0<w2.p>> pVar) {
        return new l(z10, pVar);
    }

    public static /* synthetic */ w d(boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pVar = h.f2096a;
        }
        return c(z10, pVar);
    }

    public static final b0.j e(androidx.compose.animation.h hVar, j jVar) {
        return new b0.j(hVar, jVar, 0.0f, null, 12, null);
    }
}
