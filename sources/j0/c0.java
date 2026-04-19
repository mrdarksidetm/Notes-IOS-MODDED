package j0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import j0.b0;
import java.util.concurrent.TimeUnit;
import t0.k2;
import y1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements k2, b0.b, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f13614k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13615l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f13616m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f13617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f13618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f13619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f13620d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13624h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13626j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0.d<b> f13621e = new v0.d<>(new b[16], 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Choreographer f13625i = Choreographer.getInstance();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(View view) {
            if (c0.f13616m == 0) {
                Display display = view.getDisplay();
                float f10 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                c0.f13616m = (long) (1000000000 / f10);
            }
        }
    }

    private static final class b implements b0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f13628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c1.a f13629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13631e;

        private b(int i10, long j10) {
            this.f13627a = i10;
            this.f13628b = j10;
        }

        public /* synthetic */ b(int i10, long j10, ae.j jVar) {
            this(i10, j10);
        }

        public final boolean a() {
            return this.f13630d;
        }

        public final long b() {
            return this.f13628b;
        }

        public final int c() {
            return this.f13627a;
        }

        @Override // j0.b0.a
        public void cancel() {
            if (this.f13630d) {
                return;
            }
            this.f13630d = true;
            c1.a aVar = this.f13629c;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f13629c = null;
        }

        public final boolean d() {
            return this.f13631e;
        }

        public final c1.a e() {
            return this.f13629c;
        }

        public final void f(c1.a aVar) {
            this.f13629c = aVar;
        }
    }

    public c0(b0 b0Var, c1 c1Var, o oVar, View view) {
        this.f13617a = b0Var;
        this.f13618b = c1Var;
        this.f13619c = oVar;
        this.f13620d = view;
        f13614k.b(view);
    }

    private final long g(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return (j10 / j12) + ((j11 / j12) * ((long) 3));
    }

    private final boolean h(long j10, long j11, long j12) {
        return j10 + j12 < j11;
    }

    @Override // j0.b0.b
    public b0.a a(int i10, long j10) {
        b bVar = new b(i10, j10, null);
        this.f13621e.b(bVar);
        if (!this.f13624h) {
            this.f13624h = true;
            this.f13620d.post(this);
        }
        return bVar;
    }

    @Override // t0.k2
    public void b() {
    }

    @Override // t0.k2
    public void c() {
        this.f13626j = false;
        this.f13617a.b(null);
        this.f13620d.removeCallbacks(this);
        this.f13625i.removeFrameCallback(this);
    }

    @Override // t0.k2
    public void d() {
        this.f13617a.b(this);
        this.f13626j = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f13626j) {
            this.f13620d.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13621e.r() || !this.f13624h || !this.f13626j || this.f13620d.getWindowVisibility() != 0) {
            this.f13624h = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f13620d.getDrawingTime()) + f13616m;
        boolean z10 = System.nanoTime() > nanos;
        boolean z11 = false;
        while (this.f13621e.s() && !z11) {
            b bVar = this.f13621e.n()[0];
            q qVarInvoke = this.f13619c.d().invoke();
            if (!bVar.a()) {
                int iC = qVarInvoke.c();
                int iC2 = bVar.c();
                if (iC2 >= 0 && iC2 < iC) {
                    if (bVar.e() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long jNanoTime = System.nanoTime();
                            if (h(jNanoTime, nanos, this.f13622f) || z10) {
                                Object objA = qVarInvoke.a(bVar.c());
                                bVar.f(this.f13618b.i(objA, this.f13619c.b(bVar.c(), objA, qVarInvoke.d(bVar.c()))));
                                this.f13622f = g(System.nanoTime() - jNanoTime, this.f13622f);
                                z10 = false;
                            } else {
                                z11 = true;
                            }
                            md.i0 i0Var = md.i0.f15558a;
                        } finally {
                        }
                    } else {
                        if (!(!bVar.d())) {
                            throw new IllegalStateException("request already measured".toString());
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long jNanoTime2 = System.nanoTime();
                            if (h(jNanoTime2, nanos, this.f13623g) || z10) {
                                c1.a aVarE = bVar.e();
                                ae.r.c(aVarE);
                                int iA = aVarE.a();
                                for (int i10 = 0; i10 < iA; i10++) {
                                    aVarE.b(i10, bVar.b());
                                }
                                this.f13623g = g(System.nanoTime() - jNanoTime2, this.f13623g);
                                this.f13621e.x(0);
                                z10 = false;
                            } else {
                                md.i0 i0Var2 = md.i0.f15558a;
                                z11 = true;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.f13621e.x(0);
        }
        if (z11) {
            this.f13625i.postFrameCallback(this);
        } else {
            this.f13624h = false;
        }
    }
}
