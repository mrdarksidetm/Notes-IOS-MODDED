package b2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends le.j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f5188m = new c(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f5189n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final md.l<qd.g> f5190o = md.n.b(a.f5202a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ThreadLocal<qd.g> f5191p = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Choreographer f5192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f5193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f5194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nd.k<Runnable> f5195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Choreographer.FrameCallback> f5196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Choreographer.FrameCallback> f5197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f5200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t0.c1 f5201l;

    static final class a extends ae.s implements zd.a<qd.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5202a = new a();

        /* JADX INFO: renamed from: b2.b0$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        static final class C0124a extends sd.j implements zd.p<le.n0, qd.d<? super Choreographer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f5203a;

            C0124a(qd.d<? super C0124a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                return new C0124a(dVar);
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super Choreographer> dVar) {
                return ((C0124a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f5203a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                return Choreographer.getInstance();
            }
        }

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qd.g invoke() {
            b0 b0Var = new b0(c0.b() ? Choreographer.getInstance() : (Choreographer) le.i.e(le.d1.c(), new C0124a(null)), k3.f.a(Looper.getMainLooper()), null);
            return b0Var.plus(b0Var.t0());
        }
    }

    public static final class b extends ThreadLocal<qd.g> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qd.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            b0 b0Var = new b0(choreographer, k3.f.a(looperMyLooper), null);
            return b0Var.plus(b0Var.t0());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public final qd.g a() {
            if (c0.b()) {
                return b();
            }
            qd.g gVar = (qd.g) b0.f5191p.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final qd.g b() {
            return (qd.g) b0.f5190o.getValue();
        }
    }

    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            b0.this.f5193d.removeCallbacks(this);
            b0.this.w0();
            b0.this.v0(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.w0();
            Object obj = b0.this.f5194e;
            b0 b0Var = b0.this;
            synchronized (obj) {
                if (b0Var.f5196g.isEmpty()) {
                    b0Var.s0().removeFrameCallback(this);
                    b0Var.f5199j = false;
                }
                md.i0 i0Var = md.i0.f15558a;
            }
        }
    }

    private b0(Choreographer choreographer, Handler handler) {
        this.f5192c = choreographer;
        this.f5193d = handler;
        this.f5194e = new Object();
        this.f5195f = new nd.k<>();
        this.f5196g = new ArrayList();
        this.f5197h = new ArrayList();
        this.f5200k = new d();
        this.f5201l = new d0(choreographer, this);
    }

    public /* synthetic */ b0(Choreographer choreographer, Handler handler, ae.j jVar) {
        this(choreographer, handler);
    }

    private final Runnable u0() {
        Runnable runnableV;
        synchronized (this.f5194e) {
            runnableV = this.f5195f.v();
        }
        return runnableV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(long j10) {
        synchronized (this.f5194e) {
            if (this.f5199j) {
                this.f5199j = false;
                List<Choreographer.FrameCallback> list = this.f5196g;
                this.f5196g = this.f5197h;
                this.f5197h = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        boolean z10;
        while (true) {
            Runnable runnableU0 = u0();
            if (runnableU0 != null) {
                runnableU0.run();
            } else {
                synchronized (this.f5194e) {
                    z10 = false;
                    if (this.f5195f.isEmpty()) {
                        this.f5198i = false;
                    } else {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return;
                }
            }
        }
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        synchronized (this.f5194e) {
            this.f5195f.addLast(runnable);
            if (!this.f5198i) {
                this.f5198i = true;
                this.f5193d.post(this.f5200k);
                if (!this.f5199j) {
                    this.f5199j = true;
                    this.f5192c.postFrameCallback(this.f5200k);
                }
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final Choreographer s0() {
        return this.f5192c;
    }

    public final t0.c1 t0() {
        return this.f5201l;
    }

    public final void x0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f5194e) {
            this.f5196g.add(frameCallback);
            if (!this.f5199j) {
                this.f5199j = true;
                this.f5192c.postFrameCallback(this.f5200k);
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void y0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f5194e) {
            this.f5196g.remove(frameCallback);
        }
    }
}
