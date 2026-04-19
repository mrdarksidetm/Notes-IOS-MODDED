package t0;

import d1.k;
import d1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import le.a2;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.g f20698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private le.a2 f20700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f20701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<c0> f20702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends c0> f20703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0.b<Object> f20704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c0> f20705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<c0> f20706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<g1> f20707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<e1<Object>, List<g1>> f20708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<g1, f1> f20709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<c0> f20710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Set<c0> f20711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private le.o<? super md.i0> f20712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f20715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final oe.s<d> f20717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final le.a0 f20718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final qd.g f20719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f20720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f20695y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f20696z = 8;
    private static final oe.s<w0.g<c>> A = oe.h0.a(w0.a.c());
    private static final AtomicReference<Boolean> B = new AtomicReference<>(Boolean.FALSE);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            w0.g gVar;
            w0.g gVarAdd;
            do {
                gVar = (w0.g) g2.A.getValue();
                gVarAdd = gVar.add(cVar);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!g2.A.e(gVar, gVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            w0.g gVar;
            w0.g gVarRemove;
            do {
                gVar = (w0.g) g2.A.getValue();
                gVarRemove = gVar.remove(cVar);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!g2.A.e(gVar, gVarRemove));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f20721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Exception f20722b;

        public b(boolean z10, Exception exc) {
            this.f20721a = z10;
            this.f20722b = exc;
        }

        public Exception a() {
            return this.f20722b;
        }
    }

    private final class c {
        public c() {
        }
    }

    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static final class e extends ae.s implements zd.a<md.i0> {
        e() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            le.o oVarA0;
            Object obj = g2.this.f20699c;
            g2 g2Var = g2.this;
            synchronized (obj) {
                oVarA0 = g2Var.a0();
                if (((d) g2Var.f20717u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw le.o1.a("Recomposer shutdown; frame clock awaiter will never resume", g2Var.f20701e);
                }
            }
            if (oVarA0 != null) {
                t.a aVar = md.t.f15576b;
                oVarA0.resumeWith(md.t.b(md.i0.f15558a));
            }
        }
    }

    static final class f extends ae.s implements zd.l<Throwable, md.i0> {

        static final class a extends ae.s implements zd.l<Throwable, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g2 f20733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Throwable f20734b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g2 g2Var, Throwable th) {
                super(1);
                this.f20733a = g2Var;
                this.f20734b = th;
            }

            public final void a(Throwable th) {
                Object obj = this.f20733a.f20699c;
                g2 g2Var = this.f20733a;
                Throwable th2 = this.f20734b;
                synchronized (obj) {
                    if (th2 != null) {
                        if (th != null) {
                            if (!(!(th instanceof CancellationException))) {
                                th = null;
                            }
                            if (th != null) {
                                md.f.a(th2, th);
                            }
                        }
                    }
                    th2 = null;
                    g2Var.f20701e = th2;
                    g2Var.f20717u.setValue(d.ShutDown);
                    md.i0 i0Var = md.i0.f15558a;
                }
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
                a(th);
                return md.i0.f15558a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th) {
            le.o oVar;
            le.o oVar2;
            CancellationException cancellationExceptionA = le.o1.a("Recomposer effect job completed", th);
            Object obj = g2.this.f20699c;
            g2 g2Var = g2.this;
            synchronized (obj) {
                le.a2 a2Var = g2Var.f20700d;
                oVar = null;
                if (a2Var != null) {
                    g2Var.f20717u.setValue(d.ShuttingDown);
                    if (g2Var.f20714r) {
                        if (g2Var.f20712p != null) {
                            oVar2 = g2Var.f20712p;
                        }
                        g2Var.f20712p = null;
                        a2Var.invokeOnCompletion(new a(g2Var, th));
                        oVar = oVar2;
                    } else {
                        a2Var.cancel(cancellationExceptionA);
                    }
                    oVar2 = null;
                    g2Var.f20712p = null;
                    a2Var.invokeOnCompletion(new a(g2Var, th));
                    oVar = oVar2;
                } else {
                    g2Var.f20701e = cancellationExceptionA;
                    g2Var.f20717u.setValue(d.ShutDown);
                    md.i0 i0Var = md.i0.f15558a;
                }
            }
            if (oVar != null) {
                t.a aVar = md.t.f15576b;
                oVar.resumeWith(md.t.b(md.i0.f15558a));
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class g extends sd.j implements zd.p<d, qd.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20736b;

        g(qd.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, qd.d<? super Boolean> dVar2) {
            return ((g) create(dVar, dVar2)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f20736b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f20735a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            return sd.a.a(((d) this.f20736b) == d.ShutDown);
        }
    }

    static final class h extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0.b<Object> f20737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f20738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(v0.b<Object> bVar, c0 c0Var) {
            super(0);
            this.f20737a = bVar;
            this.f20738b = c0Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v0.b<Object> bVar = this.f20737a;
            c0 c0Var = this.f20738b;
            Object[] objArrN = bVar.n();
            int size = bVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = objArrN[i10];
                ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                c0Var.p(obj);
            }
        }
    }

    static final class i extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f20739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(c0 c0Var) {
            super(1);
            this.f20739a = c0Var;
        }

        public final void a(Object obj) {
            this.f20739a.a(obj);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1003}, m = "invokeSuspend")
    static final class j extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f20742c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.q<le.n0, c1, qd.d<? super md.i0>, Object> f20744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c1 f20745f;

        @sd.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1004}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20746a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f20747b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.q<le.n0, c1, qd.d<? super md.i0>, Object> f20748c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c1 f20749d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(zd.q<? super le.n0, ? super c1, ? super qd.d<? super md.i0>, ? extends Object> qVar, c1 c1Var, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f20748c = qVar;
                this.f20749d = c1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f20748c, this.f20749d, dVar);
                aVar.f20747b = obj;
                return aVar;
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f20746a;
                if (i10 == 0) {
                    md.u.b(obj);
                    le.n0 n0Var = (le.n0) this.f20747b;
                    zd.q<le.n0, c1, qd.d<? super md.i0>, Object> qVar = this.f20748c;
                    c1 c1Var = this.f20749d;
                    this.f20746a = 1;
                    if (qVar.invoke(n0Var, c1Var, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    md.u.b(obj);
                }
                return md.i0.f15558a;
            }
        }

        static final class b extends ae.s implements zd.p<Set<? extends Object>, d1.k, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g2 f20750a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g2 g2Var) {
                super(2);
                this.f20750a = g2Var;
            }

            public final void a(Set<? extends Object> set, d1.k kVar) {
                le.o oVarA0;
                Object obj = this.f20750a.f20699c;
                g2 g2Var = this.f20750a;
                synchronized (obj) {
                    if (((d) g2Var.f20717u.getValue()).compareTo(d.Idle) >= 0) {
                        if (set instanceof v0.b) {
                            v0.b bVar = (v0.b) set;
                            Object[] objArrN = bVar.n();
                            int size = bVar.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                Object obj2 = objArrN[i10];
                                ae.r.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if (!(obj2 instanceof d1.h0) || ((d1.h0) obj2).x(d1.g.a(1))) {
                                    g2Var.f20704h.add(obj2);
                                }
                            }
                        } else {
                            for (Object obj3 : set) {
                                if (!(obj3 instanceof d1.h0) || ((d1.h0) obj3).x(d1.g.a(1))) {
                                    g2Var.f20704h.add(obj3);
                                }
                            }
                        }
                        oVarA0 = g2Var.a0();
                    } else {
                        oVarA0 = null;
                    }
                }
                if (oVarA0 != null) {
                    t.a aVar = md.t.f15576b;
                    oVarA0.resumeWith(md.t.b(md.i0.f15558a));
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
        j(zd.q<? super le.n0, ? super c1, ? super qd.d<? super md.i0>, ? extends Object> qVar, c1 c1Var, qd.d<? super j> dVar) {
            super(2, dVar);
            this.f20744e = qVar;
            this.f20745f = c1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            j jVar = g2.this.new j(this.f20744e, this.f20745f, dVar);
            jVar.f20742c = obj;
            return jVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((j) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.g2.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {540, 551}, m = "invokeSuspend")
    static final class k extends sd.j implements zd.q<le.n0, c1, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f20753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f20754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f20755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f20756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f20757g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20758h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f20759i;

        static final class a extends ae.s implements zd.l<Long, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g2 f20761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v0.b<Object> f20762b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v0.b<c0> f20763c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<c0> f20764d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<g1> f20765e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Set<c0> f20766f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<c0> f20767g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Set<c0> f20768h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g2 g2Var, v0.b<Object> bVar, v0.b<c0> bVar2, List<c0> list, List<g1> list2, Set<c0> set, List<c0> list3, Set<c0> set2) {
                super(1);
                this.f20761a = g2Var;
                this.f20762b = bVar;
                this.f20763c = bVar2;
                this.f20764d = list;
                this.f20765e = list2;
                this.f20766f = set;
                this.f20767g = list3;
                this.f20768h = set2;
            }

            /* JADX WARN: Removed duplicated region for block: B:150:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:153:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #13 {all -> 0x021f, blocks: (B:11:0x0047, B:12:0x004e, B:17:0x0070, B:18:0x0071, B:19:0x0077, B:21:0x007f, B:24:0x0089, B:26:0x0091, B:34:0x00c0, B:44:0x00e0, B:45:0x00e3, B:41:0x00d7, B:46:0x00e4, B:54:0x0103, B:63:0x0121, B:71:0x013d, B:81:0x015c, B:82:0x0160, B:84:0x0164, B:85:0x0165, B:90:0x017e, B:91:0x017f, B:79:0x0158, B:80:0x015b, B:78:0x0154, B:59:0x0118, B:61:0x011d, B:62:0x0120, B:98:0x019c, B:100:0x01a5, B:101:0x01a9, B:111:0x01cf, B:114:0x01d2, B:115:0x01d3, B:116:0x01d4, B:118:0x01da, B:120:0x01e5, B:124:0x01f3, B:132:0x0218, B:133:0x021b, B:131:0x0213, B:135:0x021d, B:136:0x021e, B:92:0x0180, B:94:0x0187, B:96:0x0196, B:130:0x0208, B:66:0x0129, B:67:0x012d, B:69:0x0133, B:77:0x0149, B:27:0x009b, B:29:0x00a2, B:30:0x00ae, B:32:0x00b4, B:40:0x00cc, B:102:0x01aa, B:104:0x01b5, B:106:0x01c1, B:108:0x01c7, B:109:0x01ca, B:110:0x01cd, B:83:0x0161, B:49:0x00ec, B:50:0x00f3, B:52:0x00f9, B:58:0x010d, B:13:0x004f, B:15:0x005b, B:16:0x0067), top: B:161:0x0047, inners: #0, #1, #2, #3, #5, #8, #9, #10 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(long r18) {
                /*
                    Method dump skipped, instruction units count: 550
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: t0.g2.k.a.a(long):void");
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(Long l10) {
                a(l10.longValue());
                return md.i0.f15558a;
            }
        }

        k(qd.d<? super k> dVar) {
            super(3, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(List<c0> list, List<g1> list2, List<c0> list3, Set<c0> set, Set<c0> set2, v0.b<Object> bVar, v0.b<c0> bVar2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
            bVar.clear();
            bVar2.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(List<g1> list, g2 g2Var) {
            list.clear();
            synchronized (g2Var.f20699c) {
                List list2 = g2Var.f20707k;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((g1) list2.get(i10));
                }
                g2Var.f20707k.clear();
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0120 -> B:23:0x0127). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0131 -> B:25:0x0143). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.g2.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // zd.q
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(le.n0 n0Var, c1 c1Var, qd.d<? super md.i0> dVar) {
            k kVar = g2.this.new k(dVar);
            kVar.f20759i = c1Var;
            return kVar.invokeSuspend(md.i0.f15558a);
        }
    }

    static final class l extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f20769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.b<Object> f20770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c0 c0Var, v0.b<Object> bVar) {
            super(1);
            this.f20769a = c0Var;
            this.f20770b = bVar;
        }

        public final void a(Object obj) {
            this.f20769a.p(obj);
            v0.b<Object> bVar = this.f20770b;
            if (bVar != null) {
                bVar.add(obj);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    public g2(qd.g gVar) {
        t0.g gVar2 = new t0.g(new e());
        this.f20698b = gVar2;
        this.f20699c = new Object();
        this.f20702f = new ArrayList();
        this.f20704h = new v0.b<>();
        this.f20705i = new ArrayList();
        this.f20706j = new ArrayList();
        this.f20707k = new ArrayList();
        this.f20708l = new LinkedHashMap();
        this.f20709m = new LinkedHashMap();
        this.f20717u = oe.h0.a(d.Inactive);
        le.a0 a0VarA = le.e2.a((le.a2) gVar.get(le.a2.R));
        a0VarA.invokeOnCompletion(new f());
        this.f20718v = a0VarA;
        this.f20719w = gVar.plus(gVar2).plus(a0VarA);
        this.f20720x = new c();
    }

    private final void V(c0 c0Var) {
        this.f20702f.add(c0Var);
        this.f20703g = null;
    }

    private final void W(d1.c cVar) {
        try {
            if (cVar.C() instanceof l.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            cVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X(qd.d<? super md.i0> dVar) {
        le.p pVar;
        if (h0()) {
            return md.i0.f15558a;
        }
        le.p pVar2 = new le.p(rd.c.c(dVar), 1);
        pVar2.A();
        synchronized (this.f20699c) {
            if (h0()) {
                pVar = pVar2;
            } else {
                this.f20712p = pVar2;
                pVar = null;
            }
        }
        if (pVar != null) {
            t.a aVar = md.t.f15576b;
            pVar.resumeWith(md.t.b(md.i0.f15558a));
        }
        Object objX = pVar2.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    private final void Z() {
        this.f20702f.clear();
        this.f20703g = nd.u.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final le.o<md.i0> a0() {
        /*
            r3 = this;
            oe.s<t0.g2$d> r0 = r3.f20717u
            java.lang.Object r0 = r0.getValue()
            t0.g2$d r0 = (t0.g2.d) r0
            t0.g2$d r1 = t0.g2.d.ShuttingDown
            int r0 = r0.compareTo(r1)
            r1 = 1
            r2 = 0
            if (r0 > 0) goto L39
            r3.Z()
            v0.b r0 = new v0.b
            r0.<init>()
            r3.f20704h = r0
            java.util.List<t0.c0> r0 = r3.f20705i
            r0.clear()
            java.util.List<t0.c0> r0 = r3.f20706j
            r0.clear()
            java.util.List<t0.g1> r0 = r3.f20707k
            r0.clear()
            r3.f20710n = r2
            le.o<? super md.i0> r0 = r3.f20712p
            if (r0 == 0) goto L34
            le.o.a.a(r0, r2, r1, r2)
        L34:
            r3.f20712p = r2
            r3.f20715s = r2
            return r2
        L39:
            t0.g2$b r0 = r3.f20715s
            if (r0 == 0) goto L40
        L3d:
            t0.g2$d r0 = t0.g2.d.Inactive
            goto L8c
        L40:
            le.a2 r0 = r3.f20700d
            if (r0 != 0) goto L59
            v0.b r0 = new v0.b
            r0.<init>()
            r3.f20704h = r0
            java.util.List<t0.c0> r0 = r3.f20705i
            r0.clear()
            boolean r0 = r3.f0()
            if (r0 == 0) goto L3d
            t0.g2$d r0 = t0.g2.d.InactivePendingWork
            goto L8c
        L59:
            java.util.List<t0.c0> r0 = r3.f20705i
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != 0) goto L8a
            v0.b<java.lang.Object> r0 = r3.f20704h
            boolean r0 = r0.o()
            if (r0 != 0) goto L8a
            java.util.List<t0.c0> r0 = r3.f20706j
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != 0) goto L8a
            java.util.List<t0.g1> r0 = r3.f20707k
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != 0) goto L8a
            int r0 = r3.f20713q
            if (r0 > 0) goto L8a
            boolean r0 = r3.f0()
            if (r0 == 0) goto L87
            goto L8a
        L87:
            t0.g2$d r0 = t0.g2.d.Idle
            goto L8c
        L8a:
            t0.g2$d r0 = t0.g2.d.PendingWork
        L8c:
            oe.s<t0.g2$d> r1 = r3.f20717u
            r1.setValue(r0)
            t0.g2$d r1 = t0.g2.d.PendingWork
            if (r0 != r1) goto L9a
            le.o<? super md.i0> r0 = r3.f20712p
            r3.f20712p = r2
            r2 = r0
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g2.a0():le.o");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        int i10;
        List listM;
        synchronized (this.f20699c) {
            if (!this.f20708l.isEmpty()) {
                List listZ = nd.v.z(this.f20708l.values());
                this.f20708l.clear();
                listM = new ArrayList(listZ.size());
                int size = listZ.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g1 g1Var = (g1) listZ.get(i11);
                    listM.add(md.x.a(g1Var, this.f20709m.get(g1Var)));
                }
                this.f20709m.clear();
            } else {
                listM = nd.u.m();
            }
        }
        int size2 = listM.size();
        for (i10 = 0; i10 < size2; i10++) {
            md.s sVar = (md.s) listM.get(i10);
            g1 g1Var2 = (g1) sVar.a();
            f1 f1Var = (f1) sVar.b();
            if (f1Var != null) {
                g1Var2.b().e(f1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        boolean zF0;
        synchronized (this.f20699c) {
            zF0 = f0();
        }
        return zF0;
    }

    private final boolean f0() {
        return !this.f20716t && this.f20698b.h();
    }

    private final boolean g0() {
        return (this.f20705i.isEmpty() ^ true) || f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        boolean z10;
        synchronized (this.f20699c) {
            z10 = true;
            if (!this.f20704h.o() && !(!this.f20705i.isEmpty())) {
                if (!f0()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<c0> i0() {
        List list = this.f20703g;
        List list2 = list;
        if (list == null) {
            List<c0> list3 = this.f20702f;
            List listM = list3.isEmpty() ? nd.u.m() : new ArrayList(list3);
            this.f20703g = listM;
            list2 = listM;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0() {
        boolean z10;
        boolean z11;
        synchronized (this.f20699c) {
            z10 = !this.f20714r;
        }
        if (z10) {
            return true;
        }
        Iterator<le.a2> it = this.f20718v.getChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (it.next().isActive()) {
                z11 = true;
                break;
            }
        }
        return z11;
    }

    private final void m0(c0 c0Var) {
        synchronized (this.f20699c) {
            List<g1> list = this.f20707k;
            int size = list.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (ae.r.b(list.get(i10).b(), c0Var)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                return;
            }
            md.i0 i0Var = md.i0.f15558a;
            ArrayList arrayList = new ArrayList();
            while (true) {
                n0(arrayList, this, c0Var);
                if (!(!arrayList.isEmpty())) {
                    return;
                } else {
                    o0(arrayList, null);
                }
            }
        }
    }

    private static final void n0(List<g1> list, g2 g2Var, c0 c0Var) {
        list.clear();
        synchronized (g2Var.f20699c) {
            Iterator<g1> it = g2Var.f20707k.iterator();
            while (it.hasNext()) {
                g1 next = it.next();
                if (ae.r.b(next.b(), c0Var)) {
                    list.add(next);
                    it.remove();
                }
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<c0> o0(List<g1> list, v0.b<Object> bVar) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1Var = list.get(i10);
            c0 c0VarB = g1Var.b();
            Object arrayList2 = map.get(c0VarB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(c0VarB, arrayList2);
            }
            ((ArrayList) arrayList2).add(g1Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            c0 c0Var = (c0) entry.getKey();
            List list2 = (List) entry.getValue();
            o.S(!c0Var.m());
            d1.c cVarL = d1.k.f9368e.l(s0(c0Var), z0(c0Var, bVar));
            try {
                d1.k kVarL = cVarL.l();
                try {
                    synchronized (this.f20699c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            g1 g1Var2 = (g1) list2.get(i11);
                            arrayList.add(md.x.a(g1Var2, h2.b(this.f20708l, g1Var2.c())));
                        }
                    }
                    c0Var.n(arrayList);
                    md.i0 i0Var = md.i0.f15558a;
                } finally {
                }
            } finally {
                W(cVarL);
            }
        }
        return nd.c0.C0(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t0.c0 p0(t0.c0 r7, v0.b<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.m()
            r1 = 0
            if (r0 != 0) goto L5f
            boolean r0 = r7.h()
            if (r0 != 0) goto L5f
            java.util.Set<t0.c0> r0 = r6.f20711o
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            boolean r0 = r0.contains(r7)
            if (r0 != r2) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 == 0) goto L1f
            goto L5f
        L1f:
            d1.k$a r0 = d1.k.f9368e
            zd.l r4 = r6.s0(r7)
            zd.l r5 = r6.z0(r7, r8)
            d1.c r0 = r0.l(r4, r5)
            d1.k r4 = r0.l()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L3c
            boolean r5 = r8.o()     // Catch: java.lang.Throwable -> L3a
            if (r5 != r2) goto L3c
            goto L3d
        L3a:
            r7 = move-exception
            goto L56
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L47
            t0.g2$h r2 = new t0.g2$h     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3a
            r7.t(r2)     // Catch: java.lang.Throwable -> L3a
        L47:
            boolean r8 = r7.u()     // Catch: java.lang.Throwable -> L3a
            r0.s(r4)     // Catch: java.lang.Throwable -> L5a
            r6.W(r0)
            if (r8 == 0) goto L54
            goto L55
        L54:
            r7 = r1
        L55:
            return r7
        L56:
            r0.s(r4)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5a
        L5a:
            r7 = move-exception
            r6.W(r0)
            throw r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g2.p0(t0.c0, v0.b):t0.c0");
    }

    private final void q0(Exception exc, c0 c0Var, boolean z10) throws Exception {
        if (!B.get().booleanValue() || (exc instanceof t0.k)) {
            synchronized (this.f20699c) {
                b bVar = this.f20715s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f20715s = new b(false, exc);
                md.i0 i0Var = md.i0.f15558a;
            }
            throw exc;
        }
        synchronized (this.f20699c) {
            t0.b.f("Error was captured in composition while live edit was enabled.", exc);
            this.f20706j.clear();
            this.f20705i.clear();
            this.f20704h = new v0.b<>();
            this.f20707k.clear();
            this.f20708l.clear();
            this.f20709m.clear();
            this.f20715s = new b(z10, exc);
            if (c0Var != null) {
                List arrayList = this.f20710n;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f20710n = arrayList;
                }
                if (!arrayList.contains(c0Var)) {
                    arrayList.add(c0Var);
                }
                w0(c0Var);
            }
            a0();
        }
    }

    static /* synthetic */ void r0(g2 g2Var, Exception exc, c0 c0Var, boolean z10, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            c0Var = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        g2Var.q0(exc, c0Var, z10);
    }

    private final zd.l<Object, md.i0> s0(c0 c0Var) {
        return new i(c0Var);
    }

    private final Object t0(zd.q<? super le.n0, ? super c1, ? super qd.d<? super md.i0>, ? extends Object> qVar, qd.d<? super md.i0> dVar) {
        Object objG = le.i.g(this.f20698b, new j(qVar, d1.a(dVar.getContext()), null), dVar);
        return objG == rd.d.e() ? objG : md.i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0() {
        List<c0> listI0;
        boolean zG0;
        synchronized (this.f20699c) {
            if (this.f20704h.isEmpty()) {
                return g0();
            }
            v0.b<Object> bVar = this.f20704h;
            this.f20704h = new v0.b<>();
            synchronized (this.f20699c) {
                listI0 = i0();
            }
            try {
                int size = listI0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    listI0.get(i10).i(bVar);
                    if (this.f20717u.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.f20704h = new v0.b<>();
                synchronized (this.f20699c) {
                    if (a0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    zG0 = g0();
                }
                return zG0;
            } catch (Throwable th) {
                synchronized (this.f20699c) {
                    this.f20704h.a(bVar);
                    md.i0 i0Var = md.i0.f15558a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(le.a2 a2Var) {
        synchronized (this.f20699c) {
            Throwable th = this.f20701e;
            if (th != null) {
                throw th;
            }
            if (this.f20717u.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.f20700d != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.f20700d = a2Var;
            a0();
        }
    }

    private final void w0(c0 c0Var) {
        this.f20702f.remove(c0Var);
        this.f20703g = null;
    }

    private final zd.l<Object, md.i0> z0(c0 c0Var, v0.b<Object> bVar) {
        return new l(c0Var, bVar);
    }

    public final void Y() {
        synchronized (this.f20699c) {
            if (this.f20717u.getValue().compareTo(d.Idle) >= 0) {
                this.f20717u.setValue(d.ShuttingDown);
            }
            md.i0 i0Var = md.i0.f15558a;
        }
        a2.a.b(this.f20718v, null, 1, null);
    }

    @Override // t0.q
    public void a(c0 c0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar) throws Exception {
        boolean zM = c0Var.m();
        try {
            k.a aVar = d1.k.f9368e;
            d1.c cVarL = aVar.l(s0(c0Var), z0(c0Var, null));
            try {
                d1.k kVarL = cVarL.l();
                try {
                    c0Var.l(pVar);
                    md.i0 i0Var = md.i0.f15558a;
                    if (!zM) {
                        aVar.e();
                    }
                    synchronized (this.f20699c) {
                        if (this.f20717u.getValue().compareTo(d.ShuttingDown) > 0 && !i0().contains(c0Var)) {
                            V(c0Var);
                        }
                    }
                    try {
                        m0(c0Var);
                        try {
                            c0Var.k();
                            c0Var.g();
                            if (zM) {
                                return;
                            }
                            aVar.e();
                        } catch (Exception e10) {
                            r0(this, e10, null, false, 6, null);
                        }
                    } catch (Exception e11) {
                        q0(e11, c0Var, true);
                    }
                } finally {
                    cVarL.s(kVarL);
                }
            } finally {
                W(cVarL);
            }
        } catch (Exception e12) {
            q0(e12, c0Var, true);
        }
    }

    @Override // t0.q
    public void b(g1 g1Var) {
        synchronized (this.f20699c) {
            h2.a(this.f20708l, g1Var.c(), g1Var);
        }
    }

    public final long c0() {
        return this.f20697a;
    }

    @Override // t0.q
    public boolean d() {
        return false;
    }

    public final oe.f0<d> d0() {
        return this.f20717u;
    }

    @Override // t0.q
    public boolean e() {
        return false;
    }

    @Override // t0.q
    public int g() {
        return 1000;
    }

    @Override // t0.q
    public qd.g h() {
        return this.f20719w;
    }

    @Override // t0.q
    public void j(g1 g1Var) {
        le.o<md.i0> oVarA0;
        synchronized (this.f20699c) {
            this.f20707k.add(g1Var);
            oVarA0 = a0();
        }
        if (oVarA0 != null) {
            t.a aVar = md.t.f15576b;
            oVarA0.resumeWith(md.t.b(md.i0.f15558a));
        }
    }

    @Override // t0.q
    public void k(c0 c0Var) {
        le.o<md.i0> oVarA0;
        synchronized (this.f20699c) {
            if (this.f20705i.contains(c0Var)) {
                oVarA0 = null;
            } else {
                this.f20705i.add(c0Var);
                oVarA0 = a0();
            }
        }
        if (oVarA0 != null) {
            t.a aVar = md.t.f15576b;
            oVarA0.resumeWith(md.t.b(md.i0.f15558a));
        }
    }

    public final Object k0(qd.d<? super md.i0> dVar) {
        Object objM = oe.g.m(d0(), new g(null), dVar);
        return objM == rd.d.e() ? objM : md.i0.f15558a;
    }

    @Override // t0.q
    public void l(g1 g1Var, f1 f1Var) {
        synchronized (this.f20699c) {
            this.f20709m.put(g1Var, f1Var);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void l0() {
        synchronized (this.f20699c) {
            this.f20716t = true;
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    @Override // t0.q
    public f1 m(g1 g1Var) {
        f1 f1VarRemove;
        synchronized (this.f20699c) {
            f1VarRemove = this.f20709m.remove(g1Var);
        }
        return f1VarRemove;
    }

    @Override // t0.q
    public void n(Set<e1.a> set) {
    }

    @Override // t0.q
    public void p(c0 c0Var) {
        synchronized (this.f20699c) {
            Set linkedHashSet = this.f20711o;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.f20711o = linkedHashSet;
            }
            linkedHashSet.add(c0Var);
        }
    }

    @Override // t0.q
    public void s(c0 c0Var) {
        synchronized (this.f20699c) {
            w0(c0Var);
            this.f20705i.remove(c0Var);
            this.f20706j.remove(c0Var);
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void x0() {
        le.o<md.i0> oVarA0;
        synchronized (this.f20699c) {
            if (this.f20716t) {
                this.f20716t = false;
                oVarA0 = a0();
            } else {
                oVarA0 = null;
            }
        }
        if (oVarA0 != null) {
            t.a aVar = md.t.f15576b;
            oVarA0.resumeWith(md.t.b(md.i0.f15558a));
        }
    }

    public final Object y0(qd.d<? super md.i0> dVar) {
        Object objT0 = t0(new k(null), dVar);
        return objT0 == rd.d.e() ? objT0 : md.i0.f15558a;
    }
}
