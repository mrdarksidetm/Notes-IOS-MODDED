package k0;

import md.i0;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    static /* synthetic */ Object b(d dVar, k1.h hVar, qd.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            hVar = null;
        }
        return dVar.a(hVar, dVar2);
    }

    Object a(k1.h hVar, qd.d<? super i0> dVar);
}
