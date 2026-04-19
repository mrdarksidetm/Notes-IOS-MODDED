package ue;

import ae.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.g3;
import le.j0;
import le.o;
import le.p;
import le.r;
import le.r0;
import md.i0;
import qe.e0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public class b extends e implements ue.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21764i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q<te.f<?>, Object, Object, l<Throwable, i0>> f21765h;
    private volatile Object owner;

    private final class a implements o<i0>, g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<i0> f21766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f21767b;

        /* JADX INFO: renamed from: ue.b$a$a, reason: collision with other inner class name */
        static final class C0445a extends s implements l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f21769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f21770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0445a(b bVar, a aVar) {
                super(1);
                this.f21769a = bVar;
                this.f21770b = aVar;
            }

            public final void a(Throwable th) {
                this.f21769a.b(this.f21770b.f21767b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
                a(th);
                return i0.f15558a;
            }
        }

        /* JADX INFO: renamed from: ue.b$a$b, reason: collision with other inner class name */
        static final class C0446b extends s implements l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f21771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f21772b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0446b(b bVar, a aVar) {
                super(1);
                this.f21771a = bVar;
                this.f21772b = aVar;
            }

            public final void a(Throwable th) {
                b.f21764i.set(this.f21771a, this.f21772b.f21767b);
                this.f21771a.b(this.f21772b.f21767b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
                a(th);
                return i0.f15558a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super i0> pVar, Object obj) {
            this.f21766a = pVar;
            this.f21767b = obj;
        }

        @Override // le.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(i0 i0Var, l<? super Throwable, i0> lVar) {
            b.f21764i.set(b.this, this.f21767b);
            this.f21766a.f(i0Var, new C0445a(b.this, this));
        }

        @Override // le.g3
        public void b(e0<?> e0Var, int i10) {
            this.f21766a.b(e0Var, i10);
        }

        @Override // le.o
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void j(j0 j0Var, i0 i0Var) {
            this.f21766a.j(j0Var, i0Var);
        }

        @Override // le.o
        public boolean cancel(Throwable th) {
            return this.f21766a.cancel(th);
        }

        @Override // le.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object d(i0 i0Var, Object obj, l<? super Throwable, i0> lVar) {
            Object objD = this.f21766a.d(i0Var, obj, new C0446b(b.this, this));
            if (objD != null) {
                b.f21764i.set(b.this, this.f21767b);
            }
            return objD;
        }

        @Override // qd.d
        public qd.g getContext() {
            return this.f21766a.getContext();
        }

        @Override // le.o
        public boolean isCompleted() {
            return this.f21766a.isCompleted();
        }

        @Override // le.o
        public Object l(Throwable th) {
            return this.f21766a.l(th);
        }

        @Override // le.o
        public void p(l<? super Throwable, i0> lVar) {
            this.f21766a.p(lVar);
        }

        @Override // le.o
        public void r(Object obj) {
            this.f21766a.r(obj);
        }

        @Override // qd.d
        public void resumeWith(Object obj) {
            this.f21766a.resumeWith(obj);
        }
    }

    /* JADX INFO: renamed from: ue.b$b, reason: collision with other inner class name */
    static final class C0447b extends s implements q<te.f<?>, Object, Object, l<? super Throwable, ? extends i0>> {

        /* JADX INFO: renamed from: ue.b$b$a */
        static final class a extends s implements l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f21774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f21775b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f21774a = bVar;
                this.f21775b = obj;
            }

            public final void a(Throwable th) {
                this.f21774a.b(this.f21775b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
                a(th);
                return i0.f15558a;
            }
        }

        C0447b() {
            super(3);
        }

        @Override // zd.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l<Throwable, i0> invoke(te.f<?> fVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : c.f21776a;
        this.f21765h = new C0447b();
    }

    private final int p(Object obj) {
        while (q()) {
            Object obj2 = f21764i.get(this);
            if (obj2 != c.f21776a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object r(b bVar, Object obj, qd.d<? super i0> dVar) {
        Object objS;
        return (!bVar.t(obj) && (objS = bVar.s(obj, dVar)) == rd.d.e()) ? objS : i0.f15558a;
    }

    private final Object s(Object obj, qd.d<? super i0> dVar) {
        p pVarB = r.b(rd.c.c(dVar));
        try {
            e(new a(pVarB, obj));
            Object objX = pVarB.x();
            if (objX == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objX == rd.d.e() ? objX : i0.f15558a;
        } catch (Throwable th) {
            pVarB.I();
            throw th;
        }
    }

    private final int u(Object obj) {
        while (!l()) {
            if (obj == null) {
                return 1;
            }
            int iP = p(obj);
            if (iP == 1) {
                return 2;
            }
            if (iP == 2) {
                return 1;
            }
        }
        f21764i.set(this, obj);
        return 0;
    }

    @Override // ue.a
    public Object a(Object obj, qd.d<? super i0> dVar) {
        return r(this, obj, dVar);
    }

    @Override // ue.a
    public void b(Object obj) {
        while (q()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21764i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f21776a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (b3.b.a(atomicReferenceFieldUpdater, this, obj2, c.f21776a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public boolean q() {
        return k() == 0;
    }

    public boolean t(Object obj) {
        int iU = u(obj);
        if (iU == 0) {
            return true;
        }
        if (iU == 1) {
            return false;
        }
        if (iU != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + r0.b(this) + "[isLocked=" + q() + ",owner=" + f21764i.get(this) + ']';
    }
}
