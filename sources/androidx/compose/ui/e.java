package androidx.compose.ui;

import a2.b1;
import a2.j;
import a2.k;
import a2.u0;
import le.a2;
import le.e2;
import le.n0;
import le.o0;
import md.i0;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2662a = a.f2663b;

    public static final class a implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ a f2663b = new a();

        private a() {
        }

        @Override // androidx.compose.ui.e
        public boolean b(l<? super b, Boolean> lVar) {
            return true;
        }

        @Override // androidx.compose.ui.e
        public <R> R e(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return r10;
        }

        @Override // androidx.compose.ui.e
        public e h(e eVar) {
            return eVar;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends e {
        @Override // androidx.compose.ui.e
        default boolean b(l<? super b, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.e
        default <R> R e(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return pVar.invoke(r10, this);
        }
    }

    public static abstract class c implements j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n0 f2665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2666c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f2668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f2669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b1 f2670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u0 f2671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2672i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2673j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f2674k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f2675l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f2676m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f2664a = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2667d = -1;

        public final n0 A1() {
            n0 n0Var = this.f2665b;
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0VarA = o0.a(k.l(this).getCoroutineContext().plus(e2.a((a2) k.l(this).getCoroutineContext().get(a2.R))));
            this.f2665b = n0VarA;
            return n0VarA;
        }

        public final boolean B1() {
            return this.f2672i;
        }

        public final int C1() {
            return this.f2666c;
        }

        public final b1 D1() {
            return this.f2670g;
        }

        public final c E1() {
            return this.f2668e;
        }

        public boolean F1() {
            return true;
        }

        public final boolean G1() {
            return this.f2673j;
        }

        public final boolean H1() {
            return this.f2676m;
        }

        public void I1() {
            if (!(!this.f2676m)) {
                throw new IllegalStateException("node attached multiple times".toString());
            }
            if (!(this.f2671h != null)) {
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.f2676m = true;
            this.f2674k = true;
        }

        public void J1() {
            if (!this.f2676m) {
                throw new IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.f2674k)) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.f2675l)) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.f2676m = false;
            n0 n0Var = this.f2665b;
            if (n0Var != null) {
                o0.c(n0Var, new f());
                this.f2665b = null;
            }
        }

        public void K1() {
        }

        @Override // a2.j
        public final c L0() {
            return this.f2664a;
        }

        public void L1() {
        }

        public void M1() {
        }

        public void N1() {
            if (!this.f2676m) {
                throw new IllegalStateException("reset() called on an unattached node".toString());
            }
            M1();
        }

        public void O1() {
            if (!this.f2676m) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.f2674k) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.f2674k = false;
            K1();
            this.f2675l = true;
        }

        public void P1() {
            if (!this.f2676m) {
                throw new IllegalStateException("node detached multiple times".toString());
            }
            if (!(this.f2671h != null)) {
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.f2675l) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.f2675l = false;
            L1();
        }

        public final void Q1(int i10) {
            this.f2667d = i10;
        }

        public final void R1(c cVar) {
            this.f2664a = cVar;
        }

        public final void S1(c cVar) {
            this.f2669f = cVar;
        }

        public final void T1(boolean z10) {
            this.f2672i = z10;
        }

        public final void U1(int i10) {
            this.f2666c = i10;
        }

        public final void V1(b1 b1Var) {
            this.f2670g = b1Var;
        }

        public final void W1(c cVar) {
            this.f2668e = cVar;
        }

        public final void X1(boolean z10) {
            this.f2673j = z10;
        }

        public final void Y1(zd.a<i0> aVar) {
            k.l(this).b(aVar);
        }

        public void Z1(u0 u0Var) {
            this.f2671h = u0Var;
        }

        public final int x1() {
            return this.f2667d;
        }

        public final c y1() {
            return this.f2669f;
        }

        public final u0 z1() {
            return this.f2671h;
        }
    }

    boolean b(l<? super b, Boolean> lVar);

    <R> R e(R r10, p<? super R, ? super b, ? extends R> pVar);

    default e h(e eVar) {
        return eVar == f2662a ? this : new androidx.compose.ui.a(this, eVar);
    }
}
