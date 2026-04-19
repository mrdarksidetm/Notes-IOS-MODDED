package cf;

import ye.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 {

    static final class a extends ae.s implements zd.l<bf.h, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ae.h0<bf.h> f6918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ae.h0<bf.h> h0Var) {
            super(1);
            this.f6918a = h0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(bf.h hVar) {
            ae.r.f(hVar, "it");
            this.f6918a.f712a = hVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(bf.h hVar) {
            a(hVar);
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(ye.f fVar) {
        return (fVar.e() instanceof ye.e) || fVar.e() == j.b.f24010a;
    }

    public static final <T> bf.h c(bf.a aVar, T t10, we.h<? super T> hVar) {
        ae.r.f(aVar, "<this>");
        ae.r.f(hVar, "serializer");
        ae.h0 h0Var = new ae.h0();
        new m0(aVar, new a(h0Var)).D(hVar, t10);
        T t11 = h0Var.f712a;
        if (t11 != null) {
            return (bf.h) t11;
        }
        ae.r.t("result");
        return null;
    }
}
