package qe;

import le.x2;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f19070a = new h0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zd.p<Object, g.b, Object> f19071b = a.f19074a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zd.p<x2<?>, g.b, x2<?>> f19072c = b.f19075a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zd.p<p0, g.b, p0> f19073d = c.f19076a;

    static final class a extends ae.s implements zd.p<Object, g.b, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19074a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof x2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    static final class b extends ae.s implements zd.p<x2<?>, g.b, x2<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19075a = new b();

        b() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x2<?> invoke(x2<?> x2Var, g.b bVar) {
            if (x2Var != null) {
                return x2Var;
            }
            if (bVar instanceof x2) {
                return (x2) bVar;
            }
            return null;
        }
    }

    static final class c extends ae.s implements zd.p<p0, g.b, p0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f19076a = new c();

        c() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(p0 p0Var, g.b bVar) {
            if (bVar instanceof x2) {
                x2<?> x2Var = (x2) bVar;
                p0Var.a(x2Var, x2Var.H(p0Var.f19088a));
            }
            return p0Var;
        }
    }

    public static final void a(qd.g gVar, Object obj) {
        if (obj == f19070a) {
            return;
        }
        if (obj instanceof p0) {
            ((p0) obj).b(gVar);
            return;
        }
        Object objFold = gVar.fold(null, f19072c);
        ae.r.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((x2) objFold).Z(gVar, obj);
    }

    public static final Object b(qd.g gVar) {
        Object objFold = gVar.fold(0, f19071b);
        ae.r.c(objFold);
        return objFold;
    }

    public static final Object c(qd.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f19070a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new p0(gVar, ((Number) obj).intValue()), f19073d);
        }
        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((x2) obj).H(gVar);
    }
}
