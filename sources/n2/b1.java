package n2;

import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2.s f15764a = r2.r.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2.b<a1, c1> f15765b = new m2.b<>(16);

    static final class a extends ae.s implements zd.l<c1, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f15767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1 a1Var) {
            super(1);
            this.f15767b = a1Var;
        }

        public final void a(c1 c1Var) {
            r2.s sVarB = b1.this.b();
            b1 b1Var = b1.this;
            a1 a1Var = this.f15767b;
            synchronized (sVarB) {
                if (c1Var.g()) {
                    b1Var.f15765b.e(a1Var, c1Var);
                } else {
                    b1Var.f15765b.f(a1Var);
                }
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(c1 c1Var) {
            a(c1Var);
            return md.i0.f15558a;
        }
    }

    public final r2.s b() {
        return this.f15764a;
    }

    public final p3<Object> c(a1 a1Var, zd.l<? super zd.l<? super c1, md.i0>, ? extends c1> lVar) {
        synchronized (this.f15764a) {
            c1 c1VarD = this.f15765b.d(a1Var);
            if (c1VarD != null) {
                if (c1VarD.g()) {
                    return c1VarD;
                }
                this.f15765b.f(a1Var);
            }
            try {
                c1 c1VarInvoke = lVar.invoke(new a(a1Var));
                synchronized (this.f15764a) {
                    if (this.f15765b.d(a1Var) == null && c1VarInvoke.g()) {
                        this.f15765b.e(a1Var, c1VarInvoke);
                    }
                    md.i0 i0Var = md.i0.f15558a;
                }
                return c1VarInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
