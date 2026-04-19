package androidx.compose.foundation;

import a2.j1;
import android.view.KeyEvent;
import g0.p;
import g0.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import le.n0;
import md.i0;
import md.u;
import v1.r;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends a2.l implements j1, t1.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g0.m f2207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g2.i f2210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private zd.a<i0> f2211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C0044a f2212u;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    public static final class C0044a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f2214b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<t1.a, p> f2213a = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f2215c = k1.f.f14338b.c();

        public final long a() {
            return this.f2215c;
        }

        public final Map<t1.a, p> b() {
            return this.f2213a;
        }

        public final p c() {
            return this.f2214b;
        }

        public final void d(long j10) {
            this.f2215c = j10;
        }

        public final void e(p pVar) {
            this.f2214b = pVar;
        }
    }

    @sd.d(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {810}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2216a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f2218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f2218c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return a.this.new b(this.f2218c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2216a;
            if (i10 == 0) {
                u.b(obj);
                g0.m mVar = a.this.f2207p;
                p pVar = this.f2218c;
                this.f2216a = 1;
                if (mVar.c(pVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {819}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2219a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f2221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f2221c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return a.this.new c(this.f2221c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2219a;
            if (i10 == 0) {
                u.b(obj);
                g0.m mVar = a.this.f2207p;
                q qVar = new q(this.f2221c);
                this.f2219a = 1;
                if (mVar.c(qVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    private a(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        this.f2207p = mVar;
        this.f2208q = z10;
        this.f2209r = str;
        this.f2210s = iVar;
        this.f2211t = aVar;
        this.f2212u = new C0044a();
    }

    public /* synthetic */ a(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a aVar, ae.j jVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    @Override // t1.e
    public boolean E(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        g2();
    }

    @Override // t1.e
    public boolean V(KeyEvent keyEvent) {
        if (this.f2208q && d0.m.f(keyEvent)) {
            if (!this.f2212u.b().containsKey(t1.a.m(t1.d.a(keyEvent)))) {
                p pVar = new p(this.f2212u.a(), null);
                this.f2212u.b().put(t1.a.m(t1.d.a(keyEvent)), pVar);
                le.k.d(A1(), null, null, new b(pVar, null), 3, null);
                return true;
            }
        } else if (this.f2208q && d0.m.b(keyEvent)) {
            p pVarRemove = this.f2212u.b().remove(t1.a.m(t1.d.a(keyEvent)));
            if (pVarRemove != null) {
                le.k.d(A1(), null, null, new c(pVarRemove, null), 3, null);
            }
            this.f2211t.invoke();
            return true;
        }
        return false;
    }

    @Override // a2.j1
    public void Z(v1.p pVar, r rVar, long j10) {
        h2().Z(pVar, rVar, j10);
    }

    @Override // a2.j1
    public void c0() {
        h2().c0();
    }

    protected final void g2() {
        p pVarC = this.f2212u.c();
        if (pVarC != null) {
            this.f2207p.a(new g0.o(pVarC));
        }
        Iterator<T> it = this.f2212u.b().values().iterator();
        while (it.hasNext()) {
            this.f2207p.a(new g0.o((p) it.next()));
        }
        this.f2212u.e(null);
        this.f2212u.b().clear();
    }

    public abstract androidx.compose.foundation.b h2();

    protected final C0044a i2() {
        return this.f2212u;
    }

    protected final void j2(g0.m mVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        if (!ae.r.b(this.f2207p, mVar)) {
            g2();
            this.f2207p = mVar;
        }
        if (this.f2208q != z10) {
            if (!z10) {
                g2();
            }
            this.f2208q = z10;
        }
        this.f2209r = str;
        this.f2210s = iVar;
        this.f2211t = aVar;
    }
}
