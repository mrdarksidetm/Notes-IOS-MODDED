package androidx.compose.foundation.gestures;

import d0.c0;
import e0.l;
import e0.o;
import e0.x;
import md.i0;
import md.u;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class c implements o, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f2305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f2306b = e.f2329c;

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {894}, m = "invokeSuspend")
    static final class a extends j implements p<x, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2308b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, qd.d<? super i0>, Object> f2310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f2310d = pVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x xVar, qd.d<? super i0> dVar) {
            return ((a) create(xVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = c.this.new a(this.f2310d, dVar);
            aVar.f2308b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2307a;
            if (i10 == 0) {
                u.b(obj);
                c.this.c((x) this.f2308b);
                p<l, qd.d<? super i0>, Object> pVar = this.f2310d;
                c cVar = c.this;
                this.f2307a = 1;
                if (pVar.invoke(cVar, this) == objE) {
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

    public c(h hVar) {
        this.f2305a = hVar;
    }

    @Override // e0.l
    public void a(float f10) {
        h hVar = this.f2305a;
        hVar.c(this.f2306b, hVar.q(f10), u1.e.f21506a.a());
    }

    @Override // e0.o
    public Object b(c0 c0Var, p<? super l, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar) {
        Object objE = this.f2305a.e().e(c0Var, new a(pVar, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    public final void c(x xVar) {
        this.f2306b = xVar;
    }
}
