package androidx.compose.foundation.gestures;

import a2.l;
import ae.s;
import e0.n;
import e0.r;
import g0.m;
import le.k;
import le.n0;
import md.i0;
import md.u;
import sd.j;
import w2.w;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
final class d extends l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f2311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r f2312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f2313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final u1.b f2314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m f2315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c f2316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zd.a<Boolean> f2317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final q<n0, w, qd.d<? super i0>, Object> f2318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n f2319x;

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements q<n0, w, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ long f2321b;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.d$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1", f = "Scrollable.kt", l = {612}, m = "invokeSuspend")
        static final class C0049a extends j implements p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f2323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f2324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f2325c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0049a(d dVar, long j10, qd.d<? super C0049a> dVar2) {
                super(2, dVar2);
                this.f2324b = dVar;
                this.f2325c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new C0049a(this.f2324b, this.f2325c, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((C0049a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f2323a;
                if (i10 == 0) {
                    u.b(obj);
                    h hVarG2 = this.f2324b.g2();
                    long j10 = this.f2325c;
                    this.f2323a = 1;
                    if (hVarG2.g(j10, this) == objE) {
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

        a(qd.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(n0 n0Var, long j10, qd.d<? super i0> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f2321b = j10;
            return aVar.invokeSuspend(i0.f15558a);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Object invoke(n0 n0Var, w wVar, qd.d<? super i0> dVar) {
            return a(n0Var, wVar.o(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f2320a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.d(d.this.f2().e(), null, null, new C0049a(d.this, this.f2321b, null), 3, null);
            return i0.f15558a;
        }
    }

    static final class b extends s implements zd.a<Boolean> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(d.this.g2().l());
        }
    }

    public d(h hVar, r rVar, boolean z10, u1.b bVar, m mVar) {
        this.f2311p = hVar;
        this.f2312q = rVar;
        this.f2313r = z10;
        this.f2314s = bVar;
        this.f2315t = mVar;
        a2(new androidx.compose.foundation.gestures.b(hVar));
        c cVar = new c(hVar);
        this.f2316u = cVar;
        b bVar2 = new b();
        this.f2317v = bVar2;
        a aVar = new a(null);
        this.f2318w = aVar;
        this.f2319x = (n) a2(new n(cVar, e.f2327a, rVar, z10, mVar, bVar2, e.f2328b, aVar, false));
    }

    public final u1.b f2() {
        return this.f2314s;
    }

    public final h g2() {
        return this.f2311p;
    }

    public final void h2(r rVar, boolean z10, m mVar) {
        this.f2319x.N2(this.f2316u, e.f2327a, rVar, z10, mVar, this.f2317v, e.f2328b, this.f2318w, false);
    }
}
