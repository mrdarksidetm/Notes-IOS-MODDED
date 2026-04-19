package oe;

import le.a2;
import pe.m;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class k {
    public static final <T> e<T> a(e<? extends T> eVar, int i10, ne.a aVar) {
        int i11;
        ne.a aVar2;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != ne.a.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            aVar2 = ne.a.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            aVar2 = aVar;
        }
        return eVar instanceof pe.m ? m.a.a((pe.m) eVar, null, i11, aVar2, 1, null) : new pe.h(eVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ e b(e eVar, int i10, ne.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = ne.a.SUSPEND;
        }
        return g.b(eVar, i10, aVar);
    }

    private static final void c(qd.g gVar) {
        if (gVar.get(a2.R) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> d(e<? extends T> eVar, qd.g gVar) {
        c(gVar);
        return ae.r.b(gVar, qd.h.f19040a) ? eVar : eVar instanceof pe.m ? m.a.a((pe.m) eVar, gVar, 0, null, 6, null) : new pe.h(eVar, gVar, 0, null, 12, null);
    }
}
