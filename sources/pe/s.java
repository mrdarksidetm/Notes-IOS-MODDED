package pe;

import le.a2;
import qd.g;
import qe.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    static final class a extends ae.s implements zd.p<Integer, g.b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q<?> f18367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<?> qVar) {
            super(2);
            this.f18367a = qVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f18367a.f18360b.get(key);
            if (key != a2.R) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i10 + 1);
            }
            a2 a2Var = (a2) bVar2;
            ae.r.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            a2 a2VarB = s.b((a2) bVar, a2Var);
            if (a2VarB == a2Var) {
                if (a2Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + a2VarB + ", expected child of " + a2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(q<?> qVar, qd.g gVar) {
        if (((Number) gVar.fold(0, new a(qVar))).intValue() == qVar.f18361c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + qVar.f18360b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final a2 b(a2 a2Var, a2 a2Var2) {
        while (a2Var != null) {
            if (a2Var == a2Var2 || !(a2Var instanceof d0)) {
                return a2Var;
            }
            a2Var = a2Var.getParent();
        }
        return null;
    }
}
