package k0;

import ae.s;
import k1.m;
import md.i0;
import w2.q;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k0.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f14307p;

    static final class a extends s implements zd.a<k1.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h f14308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f14309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.h hVar, g gVar) {
            super(0);
            this.f14308a = hVar;
            this.f14309b = gVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.h invoke() {
            k1.h hVar = this.f14308a;
            if (hVar != null) {
                return hVar;
            }
            r rVarA2 = this.f14309b.a2();
            if (rVarA2 != null) {
                return m.c(q.c(rVarA2.a()));
            }
            return null;
        }
    }

    public g(d dVar) {
        this.f14307p = dVar;
    }

    private final void e2() {
        d dVar = this.f14307p;
        if (dVar instanceof e) {
            ae.r.d(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar).c().v(this);
        }
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        f2(this.f14307p);
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        e2();
    }

    public final Object d2(k1.h hVar, qd.d<? super i0> dVar) {
        Object objO0;
        c cVarC2 = c2();
        r rVarA2 = a2();
        return (rVarA2 != null && (objO0 = cVarC2.o0(rVarA2, new a(hVar, this), dVar)) == rd.d.e()) ? objO0 : i0.f15558a;
    }

    public final void f2(d dVar) {
        e2();
        if (dVar instanceof e) {
            ((e) dVar).c().b(this);
        }
        this.f14307p = dVar;
    }
}
