package e;

import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static final class a extends q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<q, i0> f10138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, zd.l<? super q, i0> lVar) {
            super(z10);
            this.f10138d = lVar;
        }

        @Override // e.q
        public void d() {
            this.f10138d.invoke(this);
        }
    }

    public static final q a(r rVar, o4.e eVar, boolean z10, zd.l<? super q, i0> lVar) {
        ae.r.f(rVar, "<this>");
        ae.r.f(lVar, "onBackPressed");
        a aVar = new a(z10, lVar);
        if (eVar != null) {
            rVar.i(eVar, aVar);
        } else {
            rVar.h(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ q b(r rVar, o4.e eVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(rVar, eVar, z10, lVar);
    }
}
