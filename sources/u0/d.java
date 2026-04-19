package u0;

import java.util.List;
import md.i0;
import t0.d2;
import t0.f1;
import t0.f2;
import t0.g1;
import t0.j2;
import t0.k2;
import t0.l2;
import t0.m1;
import t0.s2;
import t0.v2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21432b;

    public static final class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f21433c = new a();

        private a() {
            super(1, 0, 2, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.E(eVar.b(p.a(0)));
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "distance" : super.e(i10);
        }
    }

    public static final class a0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f21434c = new a0();

        /* JADX WARN: Illegal instructions before constructor call */
        private a0() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.W0();
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f21435c = new b();

        private b() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            b1.d dVar = (b1.d) eVar.a(s.a(1));
            int iA = dVar != null ? dVar.a() : 0;
            u0.a aVar = (u0.a) eVar.a(s.a(0));
            if (iA > 0) {
                eVar2 = new m1(eVar2, iA);
            }
            aVar.b(eVar2, v2Var, j2Var);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "changes" : s.b(i10, s.a(1)) ? "effectiveNodeIndex" : super.f(i10);
        }
    }

    public static final class b0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f21436c = new b0();

        /* JADX WARN: Illegal instructions before constructor call */
        private b0() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.j1(eVar.a(s.a(0)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "data" : super.f(i10);
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f21437c = new c();

        private c() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            int iA = ((b1.d) eVar.a(s.a(0))).a();
            List list = (List) eVar.a(s.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = iA + i10;
                eVar2.c(i11, obj);
                eVar2.h(i11, obj);
            }
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "effectiveNodeIndex" : s.b(i10, s.a(1)) ? "nodes" : super.f(i10);
        }
    }

    public static final class c0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f21438c = new c0();

        private c0() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            ((zd.p) eVar.a(s.a(1))).invoke(eVar2.b(), eVar.a(s.a(0)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "value" : s.b(i10, s.a(1)) ? "block" : super.f(i10);
        }
    }

    /* JADX INFO: renamed from: u0.d$d, reason: collision with other inner class name */
    public static final class C0436d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0436d f21439c = new C0436d();

        private C0436d() {
            super(0, 4, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            g1 g1Var = (g1) eVar.a(s.a(2));
            g1 g1Var2 = (g1) eVar.a(s.a(3));
            t0.q qVar = (t0.q) eVar.a(s.a(1));
            f1 f1VarM = (f1) eVar.a(s.a(0));
            if (f1VarM == null && (f1VarM = qVar.m(g1Var)) == null) {
                t0.o.u("Could not resolve state for movable content");
                throw new md.i();
            }
            List<t0.d> listY0 = v2Var.y0(1, f1VarM.a(), 2);
            d2.a aVar = d2.f20645i;
            t0.c0 c0VarB = g1Var2.b();
            ae.r.d(c0VarB, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            aVar.a(v2Var, listY0, (f2) c0VarB);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "resolvedState" : s.b(i10, s.a(1)) ? "resolvedCompositionContext" : s.b(i10, s.a(2)) ? "from" : s.b(i10, s.a(3)) ? "to" : super.f(i10);
        }
    }

    public static final class d0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f21440c = new d0();

        /* JADX WARN: Illegal instructions before constructor call */
        private d0() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            Object objA = eVar.a(s.a(0));
            int iB = eVar.b(p.a(0));
            if (objA instanceof l2) {
                j2Var.d(((l2) objA).a());
            }
            Object objS0 = v2Var.S0(iB, objA);
            if (objS0 instanceof l2) {
                j2Var.a(((l2) objS0).a());
            } else if (objS0 instanceof d2) {
                ((d2) objS0).x();
            }
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "groupSlotIndex" : super.e(i10);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f21441c = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            t0.o.v(v2Var, j2Var);
        }
    }

    public static final class e0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f21442c = new e0();

        private e0() {
            super(1, 0, 2, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            int iB = eVar.b(p.a(0));
            for (int i10 = 0; i10 < iB; i10++) {
                eVar2.g();
            }
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "count" : super.e(i10);
        }
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f21443c = new f();

        private f() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            b1.d dVar = (b1.d) eVar.a(s.a(0));
            t0.d dVar2 = (t0.d) eVar.a(s.a(1));
            ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.b(u0.f.e(v2Var, dVar2, eVar2));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "effectiveNodeIndexOut" : s.b(i10, s.a(1)) ? "anchor" : super.f(i10);
        }
    }

    public static final class f0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f21444c = new f0();

        /* JADX WARN: Illegal instructions before constructor call */
        private f0() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            Object objB = eVar2.b();
            ae.r.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((t0.j) objB).m();
        }
    }

    public static final class g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f21445c = new g();

        /* JADX WARN: Illegal instructions before constructor call */
        private g() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(s.a(0))) {
                eVar2.d(obj);
            }
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "nodes" : super.f(i10);
        }
    }

    public static final class h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f21446c = new h();

        private h() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            ((zd.l) eVar.a(s.a(0))).invoke((t0.p) eVar.a(s.a(1)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "anchor" : s.b(i10, s.a(1)) ? "composition" : super.f(i10);
        }
    }

    public static final class i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f21447c = new i();

        /* JADX WARN: Illegal instructions before constructor call */
        private i() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.T();
        }
    }

    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f21448c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            u0.f.f(v2Var, eVar2, 0);
            v2Var.T();
        }
    }

    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f21449c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.W((t0.d) eVar.a(s.a(0)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "anchor" : super.f(i10);
        }
    }

    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f21450c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.V(0);
        }
    }

    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f21451c = new m();

        private m() {
            super(1, 2, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            Object objInvoke = ((zd.a) eVar.a(s.a(0))).invoke();
            t0.d dVar = (t0.d) eVar.a(s.a(1));
            int iB = eVar.b(p.a(0));
            ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            v2Var.o1(dVar, objInvoke);
            eVar2.h(iB, objInvoke);
            eVar2.d(objInvoke);
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "insertIndex" : super.e(i10);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "factory" : s.b(i10, s.a(1)) ? "groupAnchor" : super.f(i10);
        }
    }

    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f21452c = new n();

        private n() {
            super(0, 2, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            s2 s2Var = (s2) eVar.a(s.a(1));
            t0.d dVar = (t0.d) eVar.a(s.a(0));
            v2Var.I();
            v2Var.v0(s2Var, dVar.d(s2Var), false);
            v2Var.U();
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "anchor" : s.b(i10, s.a(1)) ? "from" : super.f(i10);
        }
    }

    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f21453c = new o();

        private o() {
            super(0, 3, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            s2 s2Var = (s2) eVar.a(s.a(1));
            t0.d dVar = (t0.d) eVar.a(s.a(0));
            u0.c cVar = (u0.c) eVar.a(s.a(2));
            v2 v2VarA = s2Var.A();
            try {
                cVar.d(eVar2, v2VarA, j2Var);
                i0 i0Var = i0.f15558a;
                v2VarA.L();
                v2Var.I();
                v2Var.v0(s2Var, dVar.d(s2Var), false);
                v2Var.U();
            } catch (Throwable th) {
                v2VarA.L();
                throw th;
            }
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "anchor" : s.b(i10, s.a(1)) ? "from" : s.b(i10, s.a(2)) ? "fixups" : super.f(i10);
        }
    }

    public static final class p {
        public static int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class q extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f21454c = new q();

        private q() {
            super(1, 0, 2, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.w0(eVar.b(p.a(0)));
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? com.amazon.device.iap.internal.c.b.as : super.e(i10);
        }
    }

    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f21455c = new r();

        private r() {
            super(3, 0, 2, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            eVar2.f(eVar.b(p.a(0)), eVar.b(p.a(1)), eVar.b(p.a(2)));
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "from" : p.b(i10, p.a(1)) ? "to" : p.b(i10, p.a(2)) ? "count" : super.e(i10);
        }
    }

    public static final class s<T> {
        public static <T> int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class t extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f21456c = new t();

        /* JADX WARN: Illegal instructions before constructor call */
        private t() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            t0.d dVar = (t0.d) eVar.a(s.a(0));
            int iB = eVar.b(p.a(0));
            eVar2.g();
            ae.r.d(eVar2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            eVar2.c(iB, v2Var.C0(dVar));
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "insertIndex" : super.e(i10);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "groupAnchor" : super.f(i10);
        }
    }

    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f21457c = new u();

        private u() {
            super(0, 3, 1, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            u0.f.g((t0.c0) eVar.a(s.a(0)), (t0.q) eVar.a(s.a(1)), (g1) eVar.a(s.a(2)), v2Var);
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "composition" : s.b(i10, s.a(1)) ? "parentCompositionContext" : s.b(i10, s.a(2)) ? "reference" : super.f(i10);
        }
    }

    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f21458c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        private v() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            j2Var.d((k2) eVar.a(s.a(0)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f21459c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            t0.o.O(v2Var, j2Var);
        }
    }

    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f21460c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            eVar2.a(eVar.b(p.a(0)), eVar.b(p.a(1)));
        }

        @Override // u0.d
        public String e(int i10) {
            return p.b(i10, p.a(0)) ? "removeIndex" : p.b(i10, p.a(1)) ? "count" : super.e(i10);
        }
    }

    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f21461c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            v2Var.O0();
        }
    }

    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f21462c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // u0.d
        public void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var) {
            j2Var.e((zd.a) eVar.a(s.a(0)));
        }

        @Override // u0.d
        public String f(int i10) {
            return s.b(i10, s.a(0)) ? "effect" : super.f(i10);
        }
    }

    private d(int i10, int i11) {
        this.f21431a = i10;
        this.f21432b = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, ae.j jVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }

    public /* synthetic */ d(int i10, int i11, ae.j jVar) {
        this(i10, i11);
    }

    public abstract void a(u0.e eVar, t0.e<?> eVar2, v2 v2Var, j2 j2Var);

    public final int b() {
        return this.f21431a;
    }

    public final String c() {
        String strB = ae.i0.b(getClass()).b();
        return strB == null ? "" : strB;
    }

    public final int d() {
        return this.f21432b;
    }

    public String e(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String f(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public String toString() {
        return c();
    }
}
