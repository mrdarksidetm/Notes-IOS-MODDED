package le;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15006b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0<T>[] f15007a;
    private volatile int notCompletedCount;

    private final class a extends h2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f15008h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o<List<? extends T>> f15009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f1 f15010f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? super List<? extends T>> oVar) {
            this.f15009e = oVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            r(th);
            return md.i0.f15558a;
        }

        @Override // le.e0
        public void r(Throwable th) {
            if (th != null) {
                Object objL = this.f15009e.l(th);
                if (objL != null) {
                    this.f15009e.r(objL);
                    e<T>.b bVarU = u();
                    if (bVarU != null) {
                        bVarU.f();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f15006b.decrementAndGet(e.this) == 0) {
                o<List<? extends T>> oVar = this.f15009e;
                u0[] u0VarArr = ((e) e.this).f15007a;
                ArrayList arrayList = new ArrayList(u0VarArr.length);
                for (u0 u0Var : u0VarArr) {
                    arrayList.add(u0Var.getCompleted());
                }
                oVar.resumeWith(md.t.b(arrayList));
            }
        }

        public final e<T>.b u() {
            return (b) f15008h.get(this);
        }

        public final f1 v() {
            f1 f1Var = this.f15010f;
            if (f1Var != null) {
                return f1Var;
            }
            ae.r.t("handle");
            return null;
        }

        public final void w(e<T>.b bVar) {
            f15008h.set(this, bVar);
        }

        public final void x(f1 f1Var) {
            this.f15010f = f1Var;
        }
    }

    private final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e<T>.a[] f15012a;

        public b(e<T>.a[] aVarArr) {
            this.f15012a = aVarArr;
        }

        @Override // le.n
        public void e(Throwable th) {
            f();
        }

        public final void f() {
            for (e<T>.a aVar : this.f15012a) {
                aVar.v().dispose();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            e(th);
            return md.i0.f15558a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f15012a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(u0<? extends T>[] u0VarArr) {
        this.f15007a = u0VarArr;
        this.notCompletedCount = u0VarArr.length;
    }

    public final Object c(qd.d<? super List<? extends T>> dVar) {
        p pVar = new p(rd.c.c(dVar), 1);
        pVar.A();
        int length = this.f15007a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            u0 u0Var = this.f15007a[i10];
            u0Var.start();
            a aVar = new a(pVar);
            aVar.x(u0Var.invokeOnCompletion(aVar));
            md.i0 i0Var = md.i0.f15558a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].w(bVar);
        }
        if (pVar.isCompleted()) {
            bVar.f();
        } else {
            pVar.p(bVar);
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }
}
