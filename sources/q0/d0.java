package q0;

import c0.o0;
import l1.v1;
import t0.e2;
import t0.p3;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f18521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.e f18522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f18523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f18524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f18525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0.v f18526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c0.v f18527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0.v f18528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c0.v f18529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c0.v f18530j;

    static final class a extends ae.s implements zd.l<n1.f, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f18531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1.k f18532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p3<Integer> f18533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p3<Float> f18534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p3<Float> f18535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p3<Float> f18536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f18537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f18538h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, n1.k kVar, p3<Integer> p3Var, p3<Float> p3Var2, p3<Float> p3Var3, p3<Float> p3Var4, float f10, long j11) {
            super(1);
            this.f18531a = j10;
            this.f18532b = kVar;
            this.f18533c = p3Var;
            this.f18534d = p3Var2;
            this.f18535e = p3Var3;
            this.f18536f = p3Var4;
            this.f18537g = f10;
            this.f18538h = j11;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n1.f fVar) {
            invoke2(fVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(n1.f fVar) {
            d0.g(fVar, this.f18531a, this.f18532b);
            d0.h(fVar, this.f18535e.getValue().floatValue() + (((this.f18533c.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + this.f18536f.getValue().floatValue(), this.f18537g, Math.abs(this.f18534d.getValue().floatValue() - this.f18535e.getValue().floatValue()), this.f18538h, this.f18532b);
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f18540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f18542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f18545g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f18539a = eVar;
            this.f18540b = j10;
            this.f18541c = f10;
            this.f18542d = j11;
            this.f18543e = i10;
            this.f18544f = i11;
            this.f18545g = i12;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d0.a(this.f18539a, this.f18540b, this.f18541c, this.f18542d, this.f18543e, lVar, e2.a(this.f18544f | 1), this.f18545g);
        }
    }

    static final class c extends ae.s implements zd.l<o0.b<Float>, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18546a = new c();

        c() {
            super(1);
        }

        public final void a(o0.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), d0.f18530j);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(o0.b<Float> bVar) {
            a(bVar);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<o0.b<Float>, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18547a = new d();

        d() {
            super(1);
        }

        public final void a(o0.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), d0.f18530j);
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(o0.b<Float> bVar) {
            a(bVar);
            return md.i0.f15558a;
        }
    }

    static final class e extends ae.s implements zd.q<y1.g0, y1.d0, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f18548a = new e();

        static final class a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f18549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f18550b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var, int i10) {
                super(1);
                this.f18549a = t0Var;
                this.f18550b = i10;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0.a.f(aVar, this.f18549a, 0, -this.f18550b, 0.0f, 4, null);
            }
        }

        e() {
            super(3);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ y1.f0 invoke(y1.g0 g0Var, y1.d0 d0Var, w2.b bVar) {
            return m293invoke3p2s80s(g0Var, d0Var, bVar.t());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final y1.f0 m293invoke3p2s80s(y1.g0 g0Var, y1.d0 d0Var, long j10) {
            int iA1 = g0Var.a1(d0.f18521a);
            int i10 = iA1 * 2;
            t0 t0VarI = d0Var.I(w2.c.i(j10, 0, i10));
            return y1.g0.z0(g0Var, t0VarI.q0(), t0VarI.d0() - i10, null, new a(t0VarI, iA1), 4, null);
        }
    }

    static final class f extends ae.s implements zd.l<g2.x, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f18551a = new f();

        f() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(g2.x xVar) {
            invoke2(xVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g2.x xVar) {
        }
    }

    static {
        float fM = w2.h.m(10);
        f18521a = fM;
        f18522b = androidx.compose.foundation.layout.m.k(g2.o.c(androidx.compose.ui.layout.a.a(androidx.compose.ui.e.f2662a, e.f18548a), true, f.f18551a), 0.0f, fM, 1, null);
        f18523c = w2.h.m(240);
        f18524d = s0.i.f19721a.a();
        s0.a aVar = s0.a.f19588a;
        f18525e = w2.h.m(aVar.c() - w2.h.m(aVar.b() * 2));
        f18526f = new c0.v(0.2f, 0.0f, 0.8f, 1.0f);
        f18527g = new c0.v(0.4f, 0.0f, 1.0f, 1.0f);
        f18528h = new c0.v(0.0f, 0.0f, 0.65f, 1.0f);
        f18529i = new c0.v(0.1f, 0.0f, 0.45f, 1.0f);
        f18530j = new c0.v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0288 A[PHI: r14 r36
  0x0288: PHI (r14v11 long) = (r14v9 long), (r14v12 long) binds: [B:101:0x0286, B:98:0x027b] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r36v9 androidx.compose.ui.e) = (r36v7 androidx.compose.ui.e), (r36v10 androidx.compose.ui.e) binds: [B:101:0x0286, B:98:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r36, long r37, float r39, long r40, int r42, t0.l r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.d0.a(androidx.compose.ui.e, long, float, long, int, t0.l, int, int):void");
    }

    private static final void f(n1.f fVar, float f10, float f11, long j10, n1.k kVar) {
        float f12 = 2;
        float f13 = kVar.f() / f12;
        float fI = k1.l.i(fVar.c()) - (f12 * f13);
        n1.f.e0(fVar, j10, f10, f11, false, k1.g.a(f13, f13), k1.m.a(fI, fI), 0.0f, kVar, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(n1.f fVar, long j10, n1.k kVar) {
        f(fVar, 0.0f, 360.0f, j10, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(n1.f fVar, float f10, float f11, float f12, long j10, n1.k kVar) {
        f(fVar, f10 + (v1.e(kVar.b(), v1.f14620a.a()) ? 0.0f : ((f11 / w2.h.m(f18525e / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, kVar);
    }
}
