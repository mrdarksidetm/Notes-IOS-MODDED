package n2;

import n2.t;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class v implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f15893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f15894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f15895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f15896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f15897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zd.l<a1, Object> f15898f;

    static final class a extends ae.s implements zd.l<a1, Object> {
        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a1 a1Var) {
            return v.this.h(a1.b(a1Var, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    static final class b extends ae.s implements zd.l<zd.l<? super c1, ? extends md.i0>, c1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f15901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a1 a1Var) {
            super(1);
            this.f15901b = a1Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c1 invoke(zd.l<? super c1, md.i0> lVar) {
            c1 c1VarA = v.this.f15896d.a(this.f15901b, v.this.g(), lVar, v.this.f15898f);
            if (c1VarA == null && (c1VarA = v.this.f15897e.a(this.f15901b, v.this.g(), lVar, v.this.f15898f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return c1VarA;
        }
    }

    public v(n0 n0Var, o0 o0Var, b1 b1Var, a0 a0Var, m0 m0Var) {
        this.f15893a = n0Var;
        this.f15894b = o0Var;
        this.f15895c = b1Var;
        this.f15896d = a0Var;
        this.f15897e = m0Var;
        this.f15898f = new a();
    }

    public /* synthetic */ v(n0 n0Var, o0 o0Var, b1 b1Var, a0 a0Var, m0 m0Var, int i10, ae.j jVar) {
        this(n0Var, (i10 & 2) != 0 ? o0.f15873a.a() : o0Var, (i10 & 4) != 0 ? w.b() : b1Var, (i10 & 8) != 0 ? new a0(w.a(), null, 2, 0 == true ? 1 : 0) : a0Var, (i10 & 16) != 0 ? new m0() : m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p3<Object> h(a1 a1Var) {
        return this.f15895c.c(a1Var, new b(a1Var));
    }

    @Override // n2.t.b
    public p3<Object> a(t tVar, i0 i0Var, int i10, int i11) {
        return h(new a1(this.f15894b.c(tVar), this.f15894b.b(i0Var), this.f15894b.a(i10), this.f15894b.d(i11), this.f15893a.a(), null));
    }

    public final n0 g() {
        return this.f15893a;
    }
}
