package androidx.compose.ui.node;

import a2.r0;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import ge.o;
import v0.d;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f2842a;

    public static final class a extends e.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.b$b, reason: collision with other inner class name */
    static final class C0057b extends s implements l<e.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<e.b> f2843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0057b(d<e.b> dVar) {
            super(1);
            this.f2843a = dVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            this.f2843a.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.Q1(-1);
        f2842a = aVar;
    }

    public static final int d(e.b bVar, e.b bVar2) {
        if (r.b(bVar, bVar2)) {
            return 2;
        }
        return (f1.a.a(bVar, bVar2) || ((bVar instanceof ForceUpdateElement) && f1.a.a(((ForceUpdateElement) bVar).g(), bVar2))) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final d<e.b> e(e eVar, d<e.b> dVar) {
        d dVar2 = new d(new e[o.d(dVar.o(), 16)], 0);
        dVar2.b(eVar);
        C0057b c0057b = null;
        while (dVar2.s()) {
            e eVar2 = (e) dVar2.x(dVar2.o() - 1);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) eVar2;
                dVar2.b(aVar.a());
                dVar2.b(aVar.c());
            } else if (eVar2 instanceof e.b) {
                dVar.b(eVar2);
            } else {
                if (c0057b == null) {
                    c0057b = new C0057b(dVar);
                }
                eVar2.b(c0057b);
                c0057b = c0057b;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends e.c> void f(r0<T> r0Var, e.c cVar) {
        r.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        r0Var.c(cVar);
    }
}
