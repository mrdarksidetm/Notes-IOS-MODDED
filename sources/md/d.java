package md;

import ae.n0;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
final class d<T, R> extends c<T, R> implements qd.d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zd.q<? super c<?, ?>, Object, ? super qd.d<Object>, ? extends Object> f15544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f15545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qd.d<Object> f15546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f15547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(zd.q<? super c<T, R>, ? super T, ? super qd.d<? super R>, ? extends Object> qVar, T t10) {
        super(null);
        ae.r.f(qVar, "block");
        this.f15544a = qVar;
        this.f15545b = t10;
        ae.r.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f15546c = this;
        this.f15547d = b.f15538a;
    }

    @Override // md.c
    public Object a(T t10, qd.d<? super R> dVar) {
        ae.r.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f15546c = dVar;
        this.f15545b = t10;
        Object objE = rd.d.e();
        if (objE == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objE;
    }

    public final R b() throws Throwable {
        Object objA;
        while (true) {
            R r10 = (R) this.f15547d;
            qd.d<Object> dVar = this.f15546c;
            if (dVar == null) {
                u.b(r10);
                return r10;
            }
            if (t.d(b.f15538a, r10)) {
                try {
                    zd.q<? super c<?, ?>, Object, ? super qd.d<Object>, ? extends Object> qVar = this.f15544a;
                    Object obj = this.f15545b;
                    objA = !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? rd.c.d(qVar, this, obj, dVar) : ((zd.q) n0.e(qVar, 3)).invoke(this, obj, dVar);
                } catch (Throwable th) {
                    t.a aVar = t.f15576b;
                    objA = u.a(th);
                }
                if (objA != rd.d.e()) {
                    r10 = (R) t.b(objA);
                }
            } else {
                this.f15547d = b.f15538a;
            }
            dVar.resumeWith(r10);
        }
    }

    @Override // qd.d
    public qd.g getContext() {
        return qd.h.f19040a;
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        this.f15546c = null;
        this.f15547d = obj;
    }
}
