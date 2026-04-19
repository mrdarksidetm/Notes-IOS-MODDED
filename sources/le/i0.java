package le;

import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    static final class a extends ae.s implements zd.p<qd.g, g.b, qd.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15033a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qd.g invoke(qd.g gVar, g.b bVar) {
            return bVar instanceof h0 ? gVar.plus(((h0) bVar).G()) : gVar.plus(bVar);
        }
    }

    static final class b extends ae.s implements zd.p<qd.g, g.b, qd.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<qd.g> f15034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ae.h0<qd.g> h0Var, boolean z10) {
            super(2);
            this.f15034a = h0Var;
            this.f15035b = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, qd.g] */
        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qd.g invoke(qd.g gVar, g.b bVar) {
            if (!(bVar instanceof h0)) {
                return gVar.plus(bVar);
            }
            g.b bVar2 = this.f15034a.f712a.get(bVar.getKey());
            if (bVar2 != null) {
                ae.h0<qd.g> h0Var = this.f15034a;
                h0Var.f712a = h0Var.f712a.minusKey(bVar.getKey());
                return gVar.plus(((h0) bVar).C(bVar2));
            }
            h0 h0VarG = (h0) bVar;
            if (this.f15035b) {
                h0VarG = h0VarG.G();
            }
            return gVar.plus(h0VarG);
        }
    }

    static final class c extends ae.s implements zd.p<Boolean, g.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15036a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof h0));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final qd.g a(qd.g gVar, qd.g gVar2, boolean z10) {
        boolean zC = c(gVar);
        boolean zC2 = c(gVar2);
        if (!zC && !zC2) {
            return gVar.plus(gVar2);
        }
        ae.h0 h0Var = new ae.h0();
        h0Var.f712a = gVar2;
        qd.h hVar = qd.h.f19040a;
        qd.g gVar3 = (qd.g) gVar.fold(hVar, new b(h0Var, z10));
        if (zC2) {
            h0Var.f712a = ((qd.g) h0Var.f712a).fold(hVar, a.f15033a);
        }
        return gVar3.plus((qd.g) h0Var.f712a);
    }

    public static final String b(qd.g gVar) {
        return null;
    }

    private static final boolean c(qd.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f15036a)).booleanValue();
    }

    public static final qd.g d(n0 n0Var, qd.g gVar) {
        qd.g gVarA = a(n0Var.getCoroutineContext(), gVar, true);
        return (gVarA == d1.a() || gVarA.get(qd.e.U) != null) ? gVarA : gVarA.plus(d1.a());
    }

    public static final qd.g e(qd.g gVar, qd.g gVar2) {
        return !c(gVar2) ? gVar.plus(gVar2) : a(gVar, gVar2, false);
    }

    public static final e3<?> f(sd.c cVar) {
        while (!(cVar instanceof z0) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof e3) {
                return (e3) cVar;
            }
        }
        return null;
    }

    public static final e3<?> g(qd.d<?> dVar, qd.g gVar, Object obj) {
        if (!(dVar instanceof sd.c)) {
            return null;
        }
        if (!(gVar.get(f3.f15024a) != null)) {
            return null;
        }
        e3<?> e3VarF = f((sd.c) dVar);
        if (e3VarF != null) {
            e3VarF.T0(gVar, obj);
        }
        return e3VarF;
    }
}
