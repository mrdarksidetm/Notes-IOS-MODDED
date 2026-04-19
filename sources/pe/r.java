package pe;

import ae.n0;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.q<oe.f<Object>, Object, qd.d<? super i0>, Object> f18365a;

    /* synthetic */ class a extends ae.o implements zd.q<oe.f<? super Object>, Object, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18366a = new a();

        a() {
            super(3, oe.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // zd.q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oe.f<Object> fVar, Object obj, qd.d<? super i0> dVar) {
            return fVar.b(obj, dVar);
        }
    }

    static {
        a aVar = a.f18366a;
        ae.r.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f18365a = (zd.q) n0.e(aVar, 3);
    }
}
