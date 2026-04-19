package te;

import ae.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.f1;
import le.g3;
import le.m;
import le.o;
import md.i0;
import nd.c0;
import nd.t;
import qe.e0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public class e<R> extends m implements f, g3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21379f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f21380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<e<R>.a> f21381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f21382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f21384e;
    private volatile Object state;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f21385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f21386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<f<?>, Object, Object, l<Throwable, i0>> f21387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f21388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e<R> f21390f;

        public final l<Throwable, i0> a(f<?> fVar, Object obj) {
            q<f<?>, Object, Object, l<Throwable, i0>> qVar = this.f21387c;
            if (qVar != null) {
                return qVar.invoke(fVar, this.f21386b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f21388d;
            e<R> eVar = this.f21390f;
            if (obj instanceof e0) {
                ((e0) obj).o(this.f21389e, null, eVar.getContext());
                return;
            }
            f1 f1Var = obj instanceof f1 ? (f1) obj : null;
            if (f1Var != null) {
                f1Var.dispose();
            }
        }
    }

    private final e<R>.a f(Object obj) {
        List<e<R>.a> list = this.f21381b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f21385a == obj) {
                obj2 = next;
                break;
            }
        }
        e<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int i(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21379f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof o) {
                e<R>.a aVarF = f(obj);
                if (aVarF == null) {
                    continue;
                } else {
                    l<Throwable, i0> lVarA = aVarF.a(this, obj2);
                    if (b3.b.a(atomicReferenceFieldUpdater, this, obj3, aVarF)) {
                        this.f21384e = obj2;
                        if (g.i((o) obj3, lVarA)) {
                            return 0;
                        }
                        this.f21384e = null;
                        return 2;
                    }
                }
            } else {
                if (r.b(obj3, g.f21393c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (r.b(obj3, g.f21394d)) {
                    return 2;
                }
                if (r.b(obj3, g.f21392b)) {
                    if (b3.b.a(atomicReferenceFieldUpdater, this, obj3, t.d(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (b3.b.a(atomicReferenceFieldUpdater, this, obj3, c0.o0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // te.f
    public void a(f1 f1Var) {
        this.f21382c = f1Var;
    }

    @Override // le.g3
    public void b(e0<?> e0Var, int i10) {
        this.f21382c = e0Var;
        this.f21383d = i10;
    }

    @Override // te.f
    public boolean c(Object obj, Object obj2) {
        return i(obj, obj2) == 0;
    }

    @Override // te.f
    public void d(Object obj) {
        this.f21384e = obj;
    }

    @Override // le.n
    public void e(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21379f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == g.f21393c) {
                return;
            }
        } while (!b3.b.a(atomicReferenceFieldUpdater, this, obj, g.f21394d));
        List<e<R>.a> list = this.f21381b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f21384e = g.f21395e;
        this.f21381b = null;
    }

    @Override // te.f
    public qd.g getContext() {
        return this.f21380a;
    }

    public final h h(Object obj, Object obj2) {
        return g.a(i(obj, obj2));
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
        e(th);
        return i0.f15558a;
    }
}
