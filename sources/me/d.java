package me;

import ae.j;
import ae.r;
import ae.s;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import le.d1;
import le.e2;
import le.f1;
import le.o;
import le.o2;
import md.i0;
import qd.g;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {
    private volatile d _immediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f15594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f15597f;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f15598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f15599b;

        public a(o oVar, d dVar) {
            this.f15598a = oVar;
            this.f15599b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15598a.j(this.f15599b, i0.f15558a);
        }
    }

    static final class b extends s implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f15601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f15601b = runnable;
        }

        public final void a(Throwable th) {
            d.this.f15594c.removeCallbacks(this.f15601b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i10, j jVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.f15594c = handler;
        this.f15595d = str;
        this.f15596e = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f15597f = dVar;
    }

    private final void p0(g gVar, Runnable runnable) {
        e2.d(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        d1.b().g0(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(d dVar, Runnable runnable) {
        dVar.f15594c.removeCallbacks(runnable);
    }

    @Override // le.w0
    public void Y(long j10, o<? super i0> oVar) {
        a aVar = new a(oVar, this);
        if (this.f15594c.postDelayed(aVar, ge.o.i(j10, 4611686018427387903L))) {
            oVar.p(new b(aVar));
        } else {
            p0(oVar.getContext(), aVar);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f15594c == this.f15594c;
    }

    @Override // le.j0
    public void g0(g gVar, Runnable runnable) {
        if (this.f15594c.post(runnable)) {
            return;
        }
        p0(gVar, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f15594c);
    }

    @Override // le.j0
    public boolean i0(g gVar) {
        return (this.f15596e && r.b(Looper.myLooper(), this.f15594c.getLooper())) ? false : true;
    }

    @Override // me.e, le.w0
    public f1 l(long j10, final Runnable runnable, g gVar) {
        if (this.f15594c.postDelayed(runnable, ge.o.i(j10, 4611686018427387903L))) {
            return new f1() { // from class: me.c
                @Override // le.f1
                public final void dispose() {
                    d.r0(this.f15592a, runnable);
                }
            };
        }
        p0(gVar, runnable);
        return o2.f15092a;
    }

    @Override // me.e
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d m0() {
        return this.f15597f;
    }

    @Override // le.m2, le.j0
    public String toString() {
        String strL0 = l0();
        if (strL0 != null) {
            return strL0;
        }
        String string = this.f15595d;
        if (string == null) {
            string = this.f15594c.toString();
        }
        if (!this.f15596e) {
            return string;
        }
        return string + ".immediate";
    }
}
