package qe;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    static final class a extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<E, md.i0> f19114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f19115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qd.g f19116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.l<? super E, md.i0> lVar, E e10, qd.g gVar) {
            super(1);
            this.f19114a = lVar;
            this.f19115b = e10;
            this.f19116c = gVar;
        }

        public final void a(Throwable th) {
            z.b(this.f19114a, this.f19115b, this.f19116c);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    public static final <E> zd.l<Throwable, md.i0> a(zd.l<? super E, md.i0> lVar, E e10, qd.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(zd.l<? super E, md.i0> lVar, E e10, qd.g gVar) {
        q0 q0VarC = c(lVar, e10, null);
        if (q0VarC != null) {
            le.l0.a(gVar, q0VarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> q0 c(zd.l<? super E, md.i0> lVar, E e10, q0 q0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (q0Var == null || q0Var.getCause() == th) {
                return new q0("Exception in undelivered element handler for " + e10, th);
            }
            md.f.a(q0Var, th);
        }
        return q0Var;
    }

    public static /* synthetic */ q0 d(zd.l lVar, Object obj, q0 q0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q0Var = null;
        }
        return c(lVar, obj, q0Var);
    }
}
