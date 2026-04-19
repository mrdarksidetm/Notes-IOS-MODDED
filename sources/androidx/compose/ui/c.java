package androidx.compose.ui;

import ae.n0;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import b2.w0;
import md.i0;
import zd.l;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    static final class a extends s implements l<e.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2637a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    static final class b extends s implements p<e, e.b, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0.l f2638a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0.l lVar) {
            super(2);
            this.f2638a = lVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(e eVar, e.b bVar) {
            boolean z10 = bVar instanceof androidx.compose.ui.b;
            e eVarC = bVar;
            if (z10) {
                q<e, t0.l, Integer, e> qVarA = ((androidx.compose.ui.b) bVar).a();
                r.d(qVarA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                eVarC = c.c(this.f2638a, (e) ((q) n0.e(qVarA, 3)).invoke(e.f2662a, this.f2638a, 0));
            }
            return eVar.h(eVarC);
        }
    }

    public static final e a(e eVar, l<? super w0, i0> lVar, q<? super e, ? super t0.l, ? super Integer, ? extends e> qVar) {
        return eVar.h(new androidx.compose.ui.b(lVar, qVar));
    }

    public static final e c(t0.l lVar, e eVar) {
        if (eVar.b(a.f2637a)) {
            return eVar;
        }
        lVar.e(1219399079);
        e eVar2 = (e) eVar.e(e.f2662a, new b(lVar));
        lVar.K();
        return eVar2;
    }

    public static final e d(t0.l lVar, e eVar) {
        return eVar == e.f2662a ? eVar : c(lVar, new CompositionLocalMapInjectionElement(lVar.B()).h(eVar));
    }
}
